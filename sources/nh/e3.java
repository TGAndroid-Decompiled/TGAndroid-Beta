package nh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;

public final class e3 implements Utilities.Callback {

    public final int f18664a;

    public final Object f18665b;

    public final Context f18666c;
    public final int d;

    public final long f18667e;

    public final c6 f18668f;

    public e3(Object obj, Context context, int i10, long j10, c6 c6Var, int i11) {
        this.f18664a = i11;
        this.f18665b = obj;
        this.f18666c = context;
        this.d = i10;
        this.f18667e = j10;
        this.f18668f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18664a) {
            case 0:
                final org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f18665b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final int i10 = 0;
                final Context context = this.f18666c;
                final int i11 = this.d;
                final long j10 = this.f18667e;
                final c6 c6Var = this.f18668f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    e3Var.dismiss();
                                    s3.G0(context, i11, userFull2.starref_program, j10, c6Var, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var.dismiss();
                                    s3.G0(context, i11, userFull3.starref_program, j10, c6Var, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f18665b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final int i12 = 1;
                final Context context2 = this.f18666c;
                final int i13 = this.d;
                final long j11 = this.f18667e;
                final c6 c6Var2 = this.f18668f;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    e3Var2.dismiss();
                                    s3.G0(context2, i13, userFull3.starref_program, j11, c6Var2, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull4 = userFull2;
                                if (userFull4 != null && userFull4.starref_program != null) {
                                    e3Var2.dismiss();
                                    s3.G0(context2, i13, userFull4.starref_program, j11, c6Var2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((org.telegram.ui.ActionBar.e3[]) this.f18665b)[0].dismiss();
                s3.H0(this.f18666c, this.d, (TL_payments.connectedBotStarRef) obj, this.f18667e, this.f18668f);
                break;
        }
    }
}
