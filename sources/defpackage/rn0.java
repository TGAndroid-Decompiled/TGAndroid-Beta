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
                gl.t1(ao0Var.n1);
                return;
            case 1:
                kk7.f(y6c.t0).k(193, ao0Var.W1, Boolean.TRUE);
                return;
            case 2:
                kk7.f(y6c.t0).k(193, ao0Var.W1, Boolean.FALSE);
                return;
            case 3:
                xh8 xh8Var = new xh8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                xh8Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                xh8Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                xh8Var.show();
                return;
            default:
                xh8 xh8Var2 = new xh8(ao0Var.r1, ao0Var.a, null, ao0Var.J0);
                xh8Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                xh8Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        byte b2 = r2;
                        ao0 ao0Var2 = ao0Var;
                        switch (b2) {
                            case 0:
                                kd5 kd5Var = ao0Var2.b2.r;
                                if (kd5Var != null) {
                                    kd5Var.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                kd5 kd5Var2 = ao0Var2.b2.r;
                                if (kd5Var2 != null) {
                                    kd5Var2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                xh8Var2.show();
                return;
        }
    }
}
