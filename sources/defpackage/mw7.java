package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mw7 implements View.OnTouchListener {
    public final byte a;
    public final vx7 b;

    public mw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                if (vx7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qx2 qx2Var = new qx2(null, false);
                    qx2Var.r = new dx6(vx7Var, view, (byte) 9);
                    vx7Var.presentFragment(qx2Var);
                }
                return true;
            case 1:
                if (vx7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                    String M0 = k96.M0(2131747273, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    alertDialog$Builder.e(new CharSequence[]{k96.M0(2131747315, null), k96.M0(2131747376, null)}, new r20(vx7Var, (byte) 3));
                    alertDialog$Builder.j(k96.M0(2131752577, null), null);
                    vx7Var.showDialog(hdVar);
                }
                return true;
            case 2:
                if (vx7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qx2 qx2Var2 = new qx2(null, false);
                    qx2Var2.r = new nw7(vx7Var, (byte) 2);
                    vx7Var.presentFragment(qx2Var2);
                }
                return true;
            default:
                if (vx7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qx2 qx2Var3 = new qx2(null, false);
                    qx2Var3.r = new nw7(vx7Var, (byte) 3);
                    vx7Var.presentFragment(qx2Var3);
                }
                return true;
        }
    }
}
