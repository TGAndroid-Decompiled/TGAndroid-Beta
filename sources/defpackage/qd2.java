package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class qd2 implements ej8 {
    public final byte a;
    public final ViewGroup b;

    public qd2(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void a(float f, float f2) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                rd2 rd2Var = (rd2) viewGroup;
                FrameLayout frameLayout = rd2Var.c;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - f2);
                }
                rd2Var.f = f2;
                rd2Var.b();
                return;
            default:
                ((ula) viewGroup).invalidate();
                return;
        }
    }
}
