package defpackage;

import android.content.DialogInterface;
public final class rn0 implements Runnable {
    public final byte a;
    public final ao0 b;

    public rn0(ao0 ao0Var, byte b) {
        this.a = b;
        this.b = ao0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final ao0 ao0Var = this.b;
        switch (b) {
            case 0:
                hl.t1(ao0Var.n1);
                return;
            case 1:
                jn7.f(yac.t0).k(194, ao0Var.W1, Boolean.TRUE);
                return;
            case 2:
                jn7.f(yac.t0).k(194, ao0Var.W1, Boolean.FALSE);
                return;
            case 3:
                kl8 kl8Var = new kl8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                kl8Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                kl8Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                kl8Var.show();
                return;
            default:
                kl8 kl8Var2 = new kl8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                kl8Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                kl8Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                lf5 lf5Var = ao0Var2.b2.r;
                                if (lf5Var != null) {
                                    lf5Var.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                lf5 lf5Var2 = ao0Var2.b2.r;
                                if (lf5Var2 != null) {
                                    lf5Var2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                kl8Var2.show();
                return;
        }
    }
}
