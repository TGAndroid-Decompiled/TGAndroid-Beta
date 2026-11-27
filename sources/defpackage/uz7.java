package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uz7 implements View.OnTouchListener {
    public final byte a;
    public final b18 b;

    public uz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                if (b18Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ky2 ky2Var = new ky2(null, false);
                    ky2Var.r = new rm6(b18Var, view, (byte) 14);
                    b18Var.presentFragment(ky2Var);
                }
                return true;
            case 1:
                if (b18Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
                    String M0 = ob6.M0(2131747193, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    alertDialog$Builder.e(new CharSequence[]{ob6.M0(2131747235, null), ob6.M0(2131747296, null)}, new s20(b18Var, (byte) 3));
                    alertDialog$Builder.j(ob6.M0(2131752570, null), null);
                    b18Var.showDialog(idVar);
                }
                return true;
            case 2:
                if (b18Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ky2 ky2Var2 = new ky2(null, false);
                    ky2Var2.r = new vz7(b18Var, (byte) 2);
                    b18Var.presentFragment(ky2Var2);
                }
                return true;
            default:
                if (b18Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ky2 ky2Var3 = new ky2(null, false);
                    ky2Var3.r = new vz7(b18Var, (byte) 3);
                    b18Var.presentFragment(ky2Var3);
                }
                return true;
        }
    }
}
