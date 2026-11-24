package defpackage;

import android.content.DialogInterface;
public final class ro0 implements Runnable {
    public final byte a;
    public final ap0 b;

    public ro0(ap0 ap0Var, byte b) {
        this.a = b;
        this.b = ap0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final ap0 ap0Var = this.b;
        switch (b) {
            case 0:
                gm.t1(ap0Var.n1);
                return;
            case 1:
                nm7.f(z8c.t0).k(194, ap0Var.W1, Boolean.TRUE);
                return;
            case 2:
                nm7.f(z8c.t0).k(194, ap0Var.W1, Boolean.FALSE);
                return;
            case 3:
                yj8 yj8Var = new yj8(ap0Var.r1, ap0Var.a, null, ap0Var.J0);
                yj8Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ap0 ap0Var2 = ap0Var;
                        switch (b2) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                yj8Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ap0 ap0Var2 = ap0Var;
                        switch (b2) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                yj8Var.show();
                return;
            default:
                yj8 yj8Var2 = new yj8(ap0Var.r1, ap0Var.a, null, ap0Var.J0);
                yj8Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ap0 ap0Var2 = ap0Var;
                        switch (b2) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                yj8Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ap0 ap0Var2 = ap0Var;
                        switch (b2) {
                            case 0:
                                if5 if5Var = ap0Var2.b2.r;
                                if (if5Var != null) {
                                    if5Var.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                if5 if5Var2 = ap0Var2.b2.r;
                                if (if5Var2 != null) {
                                    if5Var2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                yj8Var2.show();
                return;
        }
    }
}
