package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class gs1 extends FragmentContextView {
    public final byte X0;
    public final yv1 Y0;

    public gs1(yv1 yv1Var, Context context, yv1 yv1Var2, ylb ylbVar, byte b) {
        super(context, yv1Var2, null, true, ylbVar);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = yv1Var;
                super(context, yv1Var2, null, false, ylbVar);
                return;
            default:
                this.Y0 = yv1Var;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        yv1 yv1Var = this.Y0;
        switch (b) {
            case 0:
                r02 r02Var = yv1Var.b1;
                FrameLayout frameLayout = yv1Var.p2;
                if (i == 0) {
                    z = true;
                }
                r02Var.j(frameLayout, z, true);
                return;
            default:
                r02 r02Var2 = yv1Var.b1;
                FrameLayout frameLayout2 = yv1Var.n2;
                if (i == 0) {
                    z = true;
                }
                r02Var2.j(frameLayout2, z, true);
                return;
        }
    }
}
