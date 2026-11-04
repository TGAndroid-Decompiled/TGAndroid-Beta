package ii;

import android.content.Context;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
public final class d3 implements u10 {
    public final int f14892a;
    public final Object f14893b;
    public final Context f14894c;
    public final int d;
    public final long f14895e;
    public final e6 f14896f;

    public d3(Object obj, Context context, int i3, long j10, e6 e6Var, int i10) {
        this.f14892a = i10;
        this.f14893b = obj;
        this.f14894c = context;
        this.d = i3;
        this.f14895e = j10;
        this.f14896f = e6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14892a) {
            case 0:
                final org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f14893b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f14894c;
                final int i3 = this.d;
                final long j10 = this.f14895e;
                final e6 e6Var = this.f14896f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    t2Var.dismiss();
                                    q3.J0(context, i3, userFull2.starref_program, j10, e6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    t2Var.dismiss();
                                    q3.J0(context, i3, userFull3.starref_program, j10, e6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) this.f14893b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f14894c;
                final int i10 = this.d;
                final long j11 = this.f14895e;
                final e6 e6Var2 = this.f14896f;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    t2Var2.dismiss();
                                    q3.J0(context2, i10, userFull22.starref_program, j11, e6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    t2Var2.dismiss();
                                    q3.J0(context2, i10, userFull3.starref_program, j11, e6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.t2[]) this.f14893b)[0].dismiss();
                q3.K0(this.f14894c, this.d, (TL_payments.connectedBotStarRef) obj, this.f14895e, this.f14896f);
                return;
        }
    }
}
