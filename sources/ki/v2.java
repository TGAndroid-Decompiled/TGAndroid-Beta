package ki;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
public final class v2 implements x10 {
    public final int f19033a;
    public final Object f19034b;
    public final Context f19035c;
    public final int d;
    public final long f19036e;
    public final h6 f19037f;

    public v2(Object obj, Context context, int i7, long j3, h6 h6Var, int i10) {
        this.f19033a = i10;
        this.f19034b = obj;
        this.f19035c = context;
        this.d = i7;
        this.f19036e = j3;
        this.f19037f = h6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19033a) {
            case 0:
                final org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f19034b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f19035c;
                final int i7 = this.d;
                final long j3 = this.f19036e;
                final h6 h6Var = this.f19037f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    w2Var.dismiss();
                                    h3.J0(context, i7, userFull2.starref_program, j3, h6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    w2Var.dismiss();
                                    h3.J0(context, i7, userFull3.starref_program, j3, h6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) this.f19034b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f19035c;
                final int i10 = this.d;
                final long j10 = this.f19036e;
                final h6 h6Var2 = this.f19037f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    w2Var2.dismiss();
                                    h3.J0(context2, i10, userFull22.starref_program, j10, h6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    w2Var2.dismiss();
                                    h3.J0(context2, i10, userFull3.starref_program, j10, h6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.w2[]) this.f19034b)[0].dismiss();
                h3.K0(this.f19035c, this.d, (TL_payments.connectedBotStarRef) obj, this.f19036e, this.f19037f);
                return;
        }
    }
}
