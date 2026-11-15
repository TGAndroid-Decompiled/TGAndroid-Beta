package ki;

import android.content.Context;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
public final class a3 implements z10 {
    public final int f18191a;
    public final Object f18192b;
    public final Context f18193c;
    public final int d;
    public final long f18194e;
    public final e6 f18195f;

    public a3(Object obj, Context context, int i7, long j3, e6 e6Var, int i10) {
        this.f18191a = i10;
        this.f18192b = obj;
        this.f18193c = context;
        this.d = i7;
        this.f18194e = j3;
        this.f18195f = e6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f18191a) {
            case 0:
                final org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f18192b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f18193c;
                final int i7 = this.d;
                final long j3 = this.f18194e;
                final e6 e6Var = this.f18195f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    u2Var.dismiss();
                                    n3.J0(context, i7, userFull2.starref_program, j3, e6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    u2Var.dismiss();
                                    n3.J0(context, i7, userFull3.starref_program, j3, e6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) this.f18192b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f18193c;
                final int i10 = this.d;
                final long j10 = this.f18194e;
                final e6 e6Var2 = this.f18195f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    u2Var2.dismiss();
                                    n3.J0(context2, i10, userFull22.starref_program, j10, e6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    u2Var2.dismiss();
                                    n3.J0(context2, i10, userFull3.starref_program, j10, e6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.u2[]) this.f18192b)[0].dismiss();
                n3.K0(this.f18193c, this.d, (TL_payments.connectedBotStarRef) obj, this.f18194e, this.f18195f);
                return;
        }
    }
}
