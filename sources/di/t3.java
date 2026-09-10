package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
public final class t3 implements Utilities.Callback {
    public final int f6910a;
    public final Object f6911b;
    public final Context f6912c;
    public final int d;
    public final long e;
    public final f6 f6913f;

    public t3(Object obj, Context context, int i10, long j3, f6 f6Var, int i11) {
        this.f6910a = i11;
        this.f6911b = obj;
        this.f6912c = context;
        this.d = i10;
        this.e = j3;
        this.f6913f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6910a) {
            case 0:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f6911b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f6912c;
                final int i10 = this.d;
                final long j3 = this.e;
                final f6 f6Var = this.f6913f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    h3Var.dismiss();
                                    h4.G0(context, i10, userFull2.starref_program, j3, f6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    h3Var.dismiss();
                                    h4.G0(context, i10, userFull3.starref_program, j3, f6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f6911b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f6912c;
                final int i11 = this.d;
                final long j10 = this.e;
                final f6 f6Var2 = this.f6913f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    h3Var2.dismiss();
                                    h4.G0(context2, i11, userFull22.starref_program, j10, f6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    h3Var2.dismiss();
                                    h4.G0(context2, i11, userFull3.starref_program, j10, f6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.h3[]) this.f6911b)[0].dismiss();
                h4.H0(this.f6912c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f6913f);
                return;
        }
    }
}
