package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
public final class g3 implements Utilities.Callback {
    public final int f11226a;
    public final Object f11227b;
    public final Context f11228c;
    public final int d;
    public final long e;
    public final d6 f11229f;

    public g3(Object obj, Context context, int i10, long j10, d6 d6Var, int i11) {
        this.f11226a = i11;
        this.f11227b = obj;
        this.f11228c = context;
        this.d = i10;
        this.e = j10;
        this.f11229f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11226a) {
            case 0:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f11227b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f11228c;
                final int i10 = this.d;
                final long j10 = this.e;
                final d6 d6Var = this.f11229f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    f3Var.dismiss();
                                    u3.H0(context, i10, userFull2.starref_program, j10, d6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var.dismiss();
                                    u3.H0(context, i10, userFull3.starref_program, j10, d6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f11227b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f11228c;
                final int i11 = this.d;
                final long j11 = this.e;
                final d6 d6Var2 = this.f11229f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    f3Var2.dismiss();
                                    u3.H0(context2, i11, userFull22.starref_program, j11, d6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var2.dismiss();
                                    u3.H0(context2, i11, userFull3.starref_program, j11, d6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.f3[]) this.f11227b)[0].dismiss();
                u3.I0(this.f11228c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f11229f);
                return;
        }
    }
}
