package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
public final class d3 implements c20 {
    public final int f14613a;
    public final Object f14614b;
    public final Context f14615c;
    public final int d;
    public final long f14616e;
    public final g6 f14617f;

    public d3(Object obj, Context context, int i7, long j3, g6 g6Var, int i10) {
        this.f14613a = i10;
        this.f14614b = obj;
        this.f14615c = context;
        this.d = i7;
        this.f14616e = j3;
        this.f14617f = g6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14613a) {
            case 0:
                final org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f14614b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f14615c;
                final int i7 = this.d;
                final long j3 = this.f14616e;
                final g6 g6Var = this.f14617f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    v2Var.dismiss();
                                    q3.J0(context, i7, userFull2.starref_program, j3, g6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    v2Var.dismiss();
                                    q3.J0(context, i7, userFull3.starref_program, j3, g6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) this.f14614b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f14615c;
                final int i10 = this.d;
                final long j10 = this.f14616e;
                final g6 g6Var2 = this.f14617f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    v2Var2.dismiss();
                                    q3.J0(context2, i10, userFull22.starref_program, j10, g6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    v2Var2.dismiss();
                                    q3.J0(context2, i10, userFull3.starref_program, j10, g6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.v2[]) this.f14614b)[0].dismiss();
                q3.K0(this.f14615c, this.d, (TL_payments.connectedBotStarRef) obj, this.f14616e, this.f14617f);
                return;
        }
    }
}
