package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
public final class r3 implements Utilities.Callback {
    public final int f9302a;
    public final Object f9303b;
    public final Context f9304c;
    public final int d;
    public final long f9305e;
    public final d6 f9306f;

    public r3(Object obj, Context context, int i10, long j3, d6 d6Var, int i11) {
        this.f9302a = i11;
        this.f9303b = obj;
        this.f9304c = context;
        this.d = i10;
        this.f9305e = j3;
        this.f9306f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9302a) {
            case 0:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f9303b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f9304c;
                final int i10 = this.d;
                final long j3 = this.f9305e;
                final d6 d6Var = this.f9306f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    f3Var.dismiss();
                                    f4.L0(context, i10, userFull2.starref_program, j3, d6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var.dismiss();
                                    f4.L0(context, i10, userFull3.starref_program, j3, d6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f9303b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f9304c;
                final int i11 = this.d;
                final long j10 = this.f9305e;
                final d6 d6Var2 = this.f9306f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    f3Var2.dismiss();
                                    f4.L0(context2, i11, userFull22.starref_program, j10, d6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var2.dismiss();
                                    f4.L0(context2, i11, userFull3.starref_program, j10, d6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.f3[]) this.f9303b)[0].dismiss();
                f4.M0(this.f9304c, this.d, (TL_payments.connectedBotStarRef) obj, this.f9305e, this.f9306f);
                return;
        }
    }
}
