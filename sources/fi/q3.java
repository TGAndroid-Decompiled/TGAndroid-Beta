package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
public final class q3 implements Utilities.Callback {
    public final int f9925a;
    public final Object f9926b;
    public final Context f9927c;
    public final int d;
    public final long f9928e;
    public final f6 f9929f;

    public q3(Object obj, Context context, int i10, long j3, f6 f6Var, int i11) {
        this.f9925a = i11;
        this.f9926b = obj;
        this.f9927c = context;
        this.d = i10;
        this.f9928e = j3;
        this.f9929f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9925a) {
            case 0:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f9926b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f9927c;
                final int i10 = this.d;
                final long j3 = this.f9928e;
                final f6 f6Var = this.f9929f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    f3Var.dismiss();
                                    e4.G0(context, i10, userFull2.starref_program, j3, f6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var.dismiss();
                                    e4.G0(context, i10, userFull3.starref_program, j3, f6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f9926b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f9927c;
                final int i11 = this.d;
                final long j10 = this.f9928e;
                final f6 f6Var2 = this.f9929f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    f3Var2.dismiss();
                                    e4.G0(context2, i11, userFull22.starref_program, j10, f6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var2.dismiss();
                                    e4.G0(context2, i11, userFull3.starref_program, j10, f6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.f3[]) this.f9926b)[0].dismiss();
                e4.H0(this.f9927c, this.d, (TL_payments.connectedBotStarRef) obj, this.f9928e, this.f9929f);
                return;
        }
    }
}
