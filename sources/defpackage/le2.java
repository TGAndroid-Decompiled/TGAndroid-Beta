package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class le2 implements sh8 {
    public final byte a;
    public final ViewGroup b;

    public le2(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void a(float f, float f2) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                me2 me2Var = (me2) viewGroup;
                FrameLayout frameLayout = me2Var.c;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - f2);
                }
                me2Var.f = f2;
                me2Var.b();
                return;
            default:
                ((bka) viewGroup).invalidate();
                return;
        }
    }
}
