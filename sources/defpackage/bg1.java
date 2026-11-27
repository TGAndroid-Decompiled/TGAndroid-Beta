package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class bg1 implements pcc {
    public final byte a;
    public final Object b;
    public final Context c;
    public final int d;
    public final long e;
    public final vnb f;

    public bg1(Object obj, Context context, int i, long j, vnb vnbVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = context;
        this.d = i;
        this.e = j;
        this.f = vnbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                final nx0 nx0Var = (nx0) obj2;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.c;
                final int i = this.d;
                final long j = this.e;
                final vnb vnbVar = this.f;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        nx0 nx0Var2 = nx0Var;
                        TLRPC.UserFull userFull2 = userFull;
                        switch (b2) {
                            case 0:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    nx0Var2.dismiss();
                                    ng1.J0(context, i, userFull2.starref_program, j, vnbVar, true);
                                    return;
                                }
                                return;
                            default:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    nx0Var2.dismiss();
                                    ng1.J0(context, i, userFull2.starref_program, j, vnbVar, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final nx0 nx0Var2 = (nx0) obj2;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.c;
                final int i2 = this.d;
                final long j2 = this.e;
                final vnb vnbVar2 = this.f;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        nx0 nx0Var22 = nx0Var2;
                        TLRPC.UserFull userFull22 = userFull2;
                        switch (b2) {
                            case 0:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    nx0Var22.dismiss();
                                    ng1.J0(context2, i2, userFull22.starref_program, j2, vnbVar2, true);
                                    return;
                                }
                                return;
                            default:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    nx0Var22.dismiss();
                                    ng1.J0(context2, i2, userFull22.starref_program, j2, vnbVar2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((nx0[]) obj2)[0].dismiss();
                ng1.K0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                return;
        }
    }
}
