package mg;

import android.content.DialogInterface;
import org.telegram.messenger.d20;
import org.telegram.messenger.zs;
public final class l0 implements Runnable {
    public final int f13183a;
    public final w0 f13184b;

    public l0(w0 w0Var, int i10) {
        this.f13183a = i10;
        this.f13184b = w0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13183a;
        final w0 w0Var = this.f13184b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.v1(w0Var.f26666k1);
                return;
            case 1:
                zs.f(d20.f15147s0).k(191, w0Var.T1, Boolean.TRUE);
                return;
            case 2:
                zs.f(d20.f15147s0).k(191, w0Var.T1, Boolean.FALSE);
                return;
            case 3:
                kg.v1 v1Var = new kg.v1(w0Var.f26669o1, w0Var.f21583a, null, w0Var.I0);
                v1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                og.s sVar = w0Var.Y1.f13764r;
                                if (sVar != null) {
                                    sVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13764r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                v1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                og.s sVar = w0Var.Y1.f13764r;
                                if (sVar != null) {
                                    sVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13764r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                v1Var.show();
                return;
            default:
                kg.v1 v1Var2 = new kg.v1(w0Var.f26669o1, w0Var.f21583a, null, w0Var.I0);
                v1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                og.s sVar = w0Var.Y1.f13764r;
                                if (sVar != null) {
                                    sVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13764r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                v1Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                og.s sVar = w0Var.Y1.f13764r;
                                if (sVar != null) {
                                    sVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13764r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                v1Var2.show();
                return;
        }
    }
}
