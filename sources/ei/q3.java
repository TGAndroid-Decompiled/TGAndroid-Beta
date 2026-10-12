package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
public final class q3 implements Utilities.Callback {
    public final int f9303a;
    public final Object f9304b;
    public final Context f9305c;
    public final int d;
    public final long f9306e;
    public final c6 f9307f;

    public q3(Object obj, Context context, int i10, long j3, c6 c6Var, int i11) {
        this.f9303a = i11;
        this.f9304b = obj;
        this.f9305c = context;
        this.d = i10;
        this.f9306e = j3;
        this.f9307f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9303a) {
            case 0:
                final org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f9304b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f9305c;
                final int i10 = this.d;
                final long j3 = this.f9306e;
                final c6 c6Var = this.f9307f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    e3Var.dismiss();
                                    e4.H0(context, i10, userFull2.starref_program, j3, c6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var.dismiss();
                                    e4.H0(context, i10, userFull3.starref_program, j3, c6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f9304b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f9305c;
                final int i11 = this.d;
                final long j10 = this.f9306e;
                final c6 c6Var2 = this.f9307f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    e3Var2.dismiss();
                                    e4.H0(context2, i11, userFull22.starref_program, j10, c6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var2.dismiss();
                                    e4.H0(context2, i11, userFull3.starref_program, j10, c6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.e3[]) this.f9304b)[0].dismiss();
                e4.I0(this.f9305c, this.d, (TL_payments.connectedBotStarRef) obj, this.f9306e, this.f9307f);
                return;
        }
    }
}
