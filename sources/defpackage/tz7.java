package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tz7 implements View.OnClickListener {
    public final byte a;
    public final b18 b;

    public tz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                b18Var.T0 = (byte) 2;
                b18Var.G1();
                return;
            case 1:
                b18Var.W0();
                return;
            case 2:
                b18Var.T0 = (byte) 3;
                b18Var.G1();
                return;
            case 3:
                b18Var.T0 = (byte) 1;
                b18Var.G1();
                return;
            case 4:
                b18Var.T0 = (byte) 4;
                b18Var.G1();
                return;
            case 5:
                if (b18Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    b18Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                la1 la1Var = new la1(0);
                la1Var.N = new kj4(b18Var, (byte) 23);
                b18Var.presentFragment(la1Var);
                return;
            case 6:
                b18Var.f = true;
                b18Var.M.callOnClick();
                b18Var.f = false;
                return;
            case 7:
                b18Var.T0 = (byte) 0;
                b18Var.G1();
                return;
            case 8:
                b18Var.T0 = (byte) 4;
                b18Var.G1();
                return;
            case 9:
                b18Var.W0();
                return;
            case 10:
                b18Var.t1();
                return;
            case 11:
                b18Var.s1();
                return;
            case 12:
                b18Var.F1();
                return;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
                String M0 = ob6.M0(2131743885, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131743886, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new vz7(b18Var, (byte) 5));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                b18Var.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                    return;
                }
                return;
            case 14:
                b18Var.F1();
                return;
            case 15:
                b18Var.v1();
                return;
            default:
                b18Var.f = true;
                b18Var.M.callOnClick();
                b18Var.f = false;
                return;
        }
    }
}
