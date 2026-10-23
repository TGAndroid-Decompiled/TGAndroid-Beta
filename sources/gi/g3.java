package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
public final class g3 implements Utilities.Callback {
    public final int f11248a;
    public final Object f11249b;
    public final Context f11250c;
    public final int d;
    public final long e;
    public final g6 f11251f;

    public g3(Object obj, Context context, int i10, long j10, g6 g6Var, int i11) {
        this.f11248a = i11;
        this.f11249b = obj;
        this.f11250c = context;
        this.d = i10;
        this.e = j10;
        this.f11251f = g6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11248a) {
            case 0:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f11249b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f11250c;
                final int i10 = this.d;
                final long j10 = this.e;
                final g6 g6Var = this.f11251f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    h3Var.dismiss();
                                    u3.H0(context, i10, userFull2.starref_program, j10, g6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    h3Var.dismiss();
                                    u3.H0(context, i10, userFull3.starref_program, j10, g6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f11249b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f11250c;
                final int i11 = this.d;
                final long j11 = this.e;
                final g6 g6Var2 = this.f11251f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    h3Var2.dismiss();
                                    u3.H0(context2, i11, userFull22.starref_program, j11, g6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    h3Var2.dismiss();
                                    u3.H0(context2, i11, userFull3.starref_program, j11, g6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.h3[]) this.f11249b)[0].dismiss();
                u3.I0(this.f11250c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f11251f);
                return;
        }
    }
}
