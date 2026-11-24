package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class dc4 implements PopupWindow.OnDismissListener {
    public final byte a;
    public final FrameLayout b;
    public final View c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public dc4(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, byte b) {
        this.a = b;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override
    public final void onDismiss() {
        byte b = this.a;
        View view = this.c;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                ((kc4) viewGroup).y = null;
                s71 s71Var = (s71) view;
                s71Var.animate().cancel();
                s71Var.animate().alpha(0.0f).setDuration(150L).setListener(new im2(this, (byte) 20));
                return;
            default:
                ((f36) viewGroup).s = null;
                s71 s71Var2 = (s71) view;
                s71Var2.animate().cancel();
                s71Var2.animate().alpha(0.0f).setDuration(150L).setListener(new v85(this, (byte) 11));
                return;
        }
    }
}
