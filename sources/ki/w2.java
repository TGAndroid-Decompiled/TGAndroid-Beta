package ki;

import android.content.Context;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
public final class w2 implements w10 {
    public final int f19120a;
    public final Object f19121b;
    public final Context f19122c;
    public final int d;
    public final long f19123e;
    public final i6 f19124f;

    public w2(Object obj, Context context, int i7, long j3, i6 i6Var, int i10) {
        this.f19120a = i10;
        this.f19121b = obj;
        this.f19122c = context;
        this.d = i7;
        this.f19123e = j3;
        this.f19124f = i6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19120a) {
            case 0:
                final org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f19121b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.f19122c;
                final int i7 = this.d;
                final long j3 = this.f19123e;
                final i6 i6Var = this.f19124f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    w2Var.dismiss();
                                    i3.J0(context, i7, userFull2.starref_program, j3, i6Var, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    w2Var.dismiss();
                                    i3.J0(context, i7, userFull3.starref_program, j3, i6Var, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) this.f19121b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.f19122c;
                final int i10 = this.d;
                final long j10 = this.f19123e;
                final i6 i6Var2 = this.f19124f;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    w2Var2.dismiss();
                                    i3.J0(context2, i10, userFull22.starref_program, j10, i6Var2, true);
                                    return;
                                }
                                return;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    w2Var2.dismiss();
                                    i3.J0(context2, i10, userFull3.starref_program, j10, i6Var2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((org.telegram.ui.ActionBar.w2[]) this.f19121b)[0].dismiss();
                i3.K0(this.f19122c, this.d, (TL_payments.connectedBotStarRef) obj, this.f19123e, this.f19124f);
                return;
        }
    }
}
