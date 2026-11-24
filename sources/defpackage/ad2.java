package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ad2 implements qf8 {
    public final byte a;
    public final ViewGroup b;

    public ad2(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void a(float f, float f2) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                bd2 bd2Var = (bd2) viewGroup;
                FrameLayout frameLayout = bd2Var.c;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - f2);
                }
                bd2Var.f = f2;
                bd2Var.b();
                return;
            default:
                ((zha) viewGroup).invalidate();
                return;
        }
    }
}
