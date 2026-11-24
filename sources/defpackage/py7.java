package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class py7 implements View.OnTouchListener {
    public final byte a;
    public final xz7 b;

    public py7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                if (xz7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    az2 az2Var = new az2(null, false);
                    az2Var.r = new cz6(xz7Var, view, (byte) 10);
                    xz7Var.presentFragment(az2Var);
                }
                return true;
            case 1:
                if (xz7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
                    String M0 = jb6.M0(2131747199, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    alertDialog$Builder.e(new CharSequence[]{jb6.M0(2131747241, null), jb6.M0(2131747302, null)}, new r30(xz7Var, (byte) 3));
                    alertDialog$Builder.j(jb6.M0(2131752542, null), null);
                    xz7Var.showDialog(heVar);
                }
                return true;
            case 2:
                if (xz7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    az2 az2Var2 = new az2(null, false);
                    az2Var2.r = new qy7(xz7Var, (byte) 2);
                    xz7Var.presentFragment(az2Var2);
                }
                return true;
            default:
                if (xz7Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    az2 az2Var3 = new az2(null, false);
                    az2Var3.r = new qy7(xz7Var, (byte) 3);
                    xz7Var.presentFragment(az2Var3);
                }
                return true;
        }
    }
}
