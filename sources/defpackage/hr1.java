package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class hr1 extends FragmentContextView {
    public final byte X0;
    public final zu1 Y0;

    public hr1(zu1 zu1Var, Context context, zu1 zu1Var2, vnb vnbVar, byte b) {
        super(context, zu1Var2, null, true, vnbVar);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = zu1Var;
                super(context, zu1Var2, null, false, vnbVar);
                return;
            default:
                this.Y0 = zu1Var;
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        zu1 zu1Var = this.Y0;
        switch (b) {
            case 0:
                wz1 wz1Var = zu1Var.b1;
                FrameLayout frameLayout = zu1Var.p2;
                if (i == 0) {
                    z = true;
                }
                wz1Var.j(frameLayout, z, true);
                return;
            default:
                wz1 wz1Var2 = zu1Var.b1;
                FrameLayout frameLayout2 = zu1Var.n2;
                if (i == 0) {
                    z = true;
                }
                wz1Var2.j(frameLayout2, z, true);
                return;
        }
    }
}
