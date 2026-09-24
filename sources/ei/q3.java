package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
public final class q3 implements Utilities.Callback {
    public final int f8548a;
    public final Object f8549b;
    public final Context f8550c;
    public final int d;
    public final long e;
    public final d6 f8551f;

    public q3(Object obj, Context context, int i10, long j3, d6 d6Var, int i11) {
        this.f8548a = i11;
        this.f8549b = obj;
        this.f8550c = context;
        this.d = i10;
        this.e = j3;
        this.f8551f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8548a) {
            case 0:
                final org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f8549b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f8550c;
                final int i10 = this.d;
                final long j3 = this.e;
                final d6 d6Var = this.f8551f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    e3Var.dismiss();
                                    e4.G0(context, i10, userFull2.starref_program, j3, d6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var.dismiss();
                                    e4.G0(context, i10, userFull3.starref_program, j3, d6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f8549b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f8550c;
                final int i11 = this.d;
                final long j10 = this.e;
                final d6 d6Var2 = this.f8551f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    e3Var2.dismiss();
                                    e4.G0(context2, i11, userFull22.starref_program, j10, d6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var2.dismiss();
                                    e4.G0(context2, i11, userFull3.starref_program, j10, d6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.e3[]) this.f8549b)[0].dismiss();
                e4.H0(this.f8550c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f8551f);
                return;
        }
    }
}
