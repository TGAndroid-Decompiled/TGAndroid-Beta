package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
public final class ae4 implements PopupWindow.OnDismissListener {
    public final byte a;
    public final FrameLayout b;
    public final View c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public final ViewGroup e;

    public ae4(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, byte b) {
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
                ((he4) viewGroup).y = null;
                a81 a81Var = (a81) view;
                a81Var.animate().cancel();
                a81Var.animate().alpha(0.0f).setDuration(150L).setListener(new cn2(this, (byte) 20));
                return;
            default:
                ((i56) viewGroup).s = null;
                a81 a81Var2 = (a81) view;
                a81Var2.animate().cancel();
                a81Var2.animate().alpha(0.0f).setDuration(150L).setListener(new ad5(this, (byte) 10));
                return;
        }
    }
}
