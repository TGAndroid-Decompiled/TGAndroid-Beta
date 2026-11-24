package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class qf1 implements p8c {
    public final byte a;
    public final Object b;
    public final Context c;
    public final int d;
    public final long e;
    public final wjb f;

    public qf1(Object obj, Context context, int i, long j, wjb wjbVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = context;
        this.d = i;
        this.e = j;
        this.f = wjbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                final fx0 fx0Var = (fx0) obj2;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.c;
                final int i = this.d;
                final long j = this.e;
                final wjb wjbVar = this.f;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        fx0 fx0Var2 = fx0Var;
                        TLRPC.UserFull userFull2 = userFull;
                        switch (b2) {
                            case 0:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    fx0Var2.dismiss();
                                    eg1.I0(context, i, userFull2.starref_program, j, wjbVar, true);
                                    return;
                                }
                                return;
                            default:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    fx0Var2.dismiss();
                                    eg1.I0(context, i, userFull2.starref_program, j, wjbVar, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final fx0 fx0Var2 = (fx0) obj2;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.c;
                final int i2 = this.d;
                final long j2 = this.e;
                final wjb wjbVar2 = this.f;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        fx0 fx0Var22 = fx0Var2;
                        TLRPC.UserFull userFull22 = userFull2;
                        switch (b2) {
                            case 0:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    fx0Var22.dismiss();
                                    eg1.I0(context2, i2, userFull22.starref_program, j2, wjbVar2, true);
                                    return;
                                }
                                return;
                            default:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    fx0Var22.dismiss();
                                    eg1.I0(context2, i2, userFull22.starref_program, j2, wjbVar2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((fx0[]) obj2)[0].dismiss();
                eg1.J0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                return;
        }
    }
}
