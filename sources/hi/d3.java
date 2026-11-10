package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
public final class d3 implements c20 {
    public final int f14615a;
    public final Object f14616b;
    public final Context f14617c;
    public final int d;
    public final long f14618e;
    public final h6 f14619f;

    public d3(Object obj, Context context, int i7, long j3, h6 h6Var, int i10) {
        this.f14615a = i10;
        this.f14616b = obj;
        this.f14617c = context;
        this.d = i7;
        this.f14618e = j3;
        this.f14619f = h6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14615a) {
            case 0:
                final org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f14616b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f14617c;
                final int i7 = this.d;
                final long j3 = this.f14618e;
                final h6 h6Var = this.f14619f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    w2Var.dismiss();
                                    q3.J0(context, i7, userFull2.starref_program, j3, h6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    w2Var.dismiss();
                                    q3.J0(context, i7, userFull3.starref_program, j3, h6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) this.f14616b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f14617c;
                final int i10 = this.d;
                final long j10 = this.f14618e;
                final h6 h6Var2 = this.f14619f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    w2Var2.dismiss();
                                    q3.J0(context2, i10, userFull22.starref_program, j10, h6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    w2Var2.dismiss();
                                    q3.J0(context2, i10, userFull3.starref_program, j10, h6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.w2[]) this.f14616b)[0].dismiss();
                q3.K0(this.f14617c, this.d, (TL_payments.connectedBotStarRef) obj, this.f14618e, this.f14619f);
                return;
        }
    }
}
