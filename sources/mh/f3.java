package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.b6;
public final class f3 implements Utilities.Callback {
    public final int f17832a;
    public final Object f17833b;
    public final Context f17834c;
    public final int d;
    public final long f17835e;
    public final b6 f17836f;

    public f3(Object obj, Context context, int i9, long j10, b6 b6Var, int i10) {
        this.f17832a = i10;
        this.f17833b = obj;
        this.f17834c = context;
        this.d = i9;
        this.f17835e = j10;
        this.f17836f = b6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17832a) {
            case 0:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f17833b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f17834c;
                final int i9 = this.d;
                final long j10 = this.f17835e;
                final b6 b6Var = this.f17836f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    f3Var.dismiss();
                                    u3.F0(context, i9, userFull2.starref_program, j10, b6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var.dismiss();
                                    u3.F0(context, i9, userFull3.starref_program, j10, b6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f17833b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f17834c;
                final int i10 = this.d;
                final long j11 = this.f17835e;
                final b6 b6Var2 = this.f17836f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    f3Var2.dismiss();
                                    u3.F0(context2, i10, userFull22.starref_program, j11, b6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var2.dismiss();
                                    u3.F0(context2, i10, userFull3.starref_program, j11, b6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.f3[]) this.f17833b)[0].dismiss();
                u3.G0(this.f17834c, this.d, (TL_payments.connectedBotStarRef) obj, this.f17835e, this.f17836f);
                return;
        }
    }
}
