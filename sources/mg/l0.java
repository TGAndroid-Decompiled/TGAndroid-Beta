package mg;

import android.content.DialogInterface;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
public final class l0 implements Runnable {
    public final int f13184a;
    public final w0 f13185b;

    public l0(w0 w0Var, int i10) {
        this.f13184a = i10;
        this.f13185b = w0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13184a;
        final w0 w0Var = this.f13185b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.v1(w0Var.f26724k1);
                return;
            case 1:
                at.f(e20.f15506s0).k(191, w0Var.T1, Boolean.TRUE);
                return;
            case 2:
                at.f(e20.f15506s0).k(191, w0Var.T1, Boolean.FALSE);
                return;
            case 3:
                kg.v1 v1Var = new kg.v1(w0Var.f26727o1, w0Var.f21584a, null, w0Var.I0);
                v1Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                og.s sVar = w0Var.Y1.f13765r;
                                if (sVar != null) {
                                    sVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13765r;
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
                                og.s sVar = w0Var.Y1.f13765r;
                                if (sVar != null) {
                                    sVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13765r;
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
                kg.v1 v1Var2 = new kg.v1(w0Var.f26727o1, w0Var.f21584a, null, w0Var.I0);
                v1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (r2) {
                            case 0:
                                og.s sVar = w0Var.Y1.f13765r;
                                if (sVar != null) {
                                    sVar.setPaused(false);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13765r;
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
                                og.s sVar = w0Var.Y1.f13765r;
                                if (sVar != null) {
                                    sVar.setPaused(true);
                                    return;
                                }
                                return;
                            default:
                                og.s sVar2 = w0Var.Y1.f13765r;
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
