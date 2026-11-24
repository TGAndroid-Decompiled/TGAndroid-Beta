package defpackage;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class de6 implements Runnable {
    public final byte a;
    public final mh6 b;

    public de6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                mh6Var.d0 = false;
                return;
            case 1:
                mh6Var.y0 = false;
                mh6Var.N1(true, true);
                return;
            default:
                if (mh6Var.getParentActivity() != null && !mh6Var.getParentActivity().isFinishing() && mh6Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                    String M0 = jb6.M0(2131745804, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131745683, null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new ge6(mh6Var, (byte) 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
