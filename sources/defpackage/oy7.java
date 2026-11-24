package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oy7 implements View.OnClickListener {
    public final byte a;
    public final xz7 b;

    public oy7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                xz7Var.T0 = (byte) 2;
                xz7Var.G1();
                return;
            case 1:
                xz7Var.W0();
                return;
            case 2:
                xz7Var.T0 = (byte) 3;
                xz7Var.G1();
                return;
            case 3:
                xz7Var.T0 = (byte) 1;
                xz7Var.G1();
                return;
            case 4:
                xz7Var.T0 = (byte) 4;
                xz7Var.G1();
                return;
            case 5:
                if (xz7Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    xz7Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                lb1 lb1Var = new lb1(0);
                lb1Var.N = new k44(xz7Var, (byte) 22);
                xz7Var.presentFragment(lb1Var);
                return;
            case 6:
                xz7Var.f = true;
                xz7Var.M.callOnClick();
                xz7Var.f = false;
                return;
            case 7:
                xz7Var.T0 = (byte) 0;
                xz7Var.G1();
                return;
            case 8:
                xz7Var.T0 = (byte) 4;
                xz7Var.G1();
                return;
            case 9:
                xz7Var.W0();
                return;
            case 10:
                xz7Var.t1();
                return;
            case 11:
                xz7Var.s1();
                return;
            case 12:
                xz7Var.F1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
                String M0 = jb6.M0(2131743917, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131743918, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new qy7(xz7Var, (byte) 5));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                xz7Var.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                    return;
                }
                return;
            case 14:
                xz7Var.F1();
                return;
            case 15:
                xz7Var.v1();
                return;
            default:
                xz7Var.f = true;
                xz7Var.M.callOnClick();
                xz7Var.f = false;
                return;
        }
    }
}
