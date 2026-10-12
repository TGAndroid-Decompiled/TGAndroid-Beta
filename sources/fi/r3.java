package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
public final class r3 implements Utilities.Callback {
    public final int f9518a;
    public final Object f9519b;
    public final Context f9520c;
    public final int d;
    public final long e;
    public final c6 f9521f;

    public r3(Object obj, Context context, int i10, long j10, c6 c6Var, int i11) {
        this.f9518a = i11;
        this.f9519b = obj;
        this.f9520c = context;
        this.d = i10;
        this.e = j10;
        this.f9521f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9518a) {
            case 0:
                final org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f9519b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f9520c;
                final int i10 = this.d;
                final long j10 = this.e;
                final c6 c6Var = this.f9521f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    e3Var.dismiss();
                                    f4.H0(context, i10, userFull2.starref_program, j10, c6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var.dismiss();
                                    f4.H0(context, i10, userFull3.starref_program, j10, c6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f9519b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f9520c;
                final int i11 = this.d;
                final long j11 = this.e;
                final c6 c6Var2 = this.f9521f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    e3Var2.dismiss();
                                    f4.H0(context2, i11, userFull22.starref_program, j11, c6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var2.dismiss();
                                    f4.H0(context2, i11, userFull3.starref_program, j11, c6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.e3[]) this.f9519b)[0].dismiss();
                f4.I0(this.f9520c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f9521f);
                return;
        }
    }
}
