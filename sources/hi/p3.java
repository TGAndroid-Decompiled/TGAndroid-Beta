package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.u6;
public final class p3 implements Utilities.Callback {
    public final int f13201a;
    public final Object f13202b;
    public final Context f13203c;
    public final int d;
    public final long e;
    public final u6 f13204f;

    public p3(Object obj, Context context, int i10, long j10, u6 u6Var, int i11) {
        this.f13201a = i11;
        this.f13202b = obj;
        this.f13203c = context;
        this.d = i10;
        this.e = j10;
        this.f13204f = u6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13201a) {
            case 0:
                final org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f13202b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f13203c;
                final int i10 = this.d;
                final long j10 = this.e;
                final u6 u6Var = this.f13204f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    k3Var.dismiss();
                                    d4.F0(context, i10, userFull2.starref_program, j10, u6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    k3Var.dismiss();
                                    d4.F0(context, i10, userFull3.starref_program, j10, u6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) this.f13202b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f13203c;
                final int i11 = this.d;
                final long j11 = this.e;
                final u6 u6Var2 = this.f13204f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    k3Var2.dismiss();
                                    d4.F0(context2, i11, userFull22.starref_program, j11, u6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    k3Var2.dismiss();
                                    d4.F0(context2, i11, userFull3.starref_program, j11, u6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.k3[]) this.f13202b)[0].dismiss();
                d4.G0(this.f13203c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f13204f);
                return;
        }
    }
}
