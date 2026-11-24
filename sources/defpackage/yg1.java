package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class yg1 implements qac {
    public final byte a;
    public final Object b;
    public final Context c;
    public final int d;
    public final long e;
    public final ylb f;

    public yg1(Object obj, Context context, int i, long j, ylb ylbVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = context;
        this.d = i;
        this.e = j;
        this.f = ylbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                final my0 my0Var = (my0) obj2;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final Context context = this.c;
                final int i = this.d;
                final long j = this.e;
                final ylb ylbVar = this.f;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        my0 my0Var2 = my0Var;
                        TLRPC.UserFull userFull2 = userFull;
                        switch (b2) {
                            case 0:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    my0Var2.dismiss();
                                    mh1.J0(context, i, userFull2.starref_program, j, ylbVar, true);
                                    return;
                                }
                                return;
                            default:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    my0Var2.dismiss();
                                    mh1.J0(context, i, userFull2.starref_program, j, ylbVar, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final my0 my0Var2 = (my0) obj2;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final Context context2 = this.c;
                final int i2 = this.d;
                final long j2 = this.e;
                final ylb ylbVar2 = this.f;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r8;
                        my0 my0Var22 = my0Var2;
                        TLRPC.UserFull userFull22 = userFull2;
                        switch (b2) {
                            case 0:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    my0Var22.dismiss();
                                    mh1.J0(context2, i2, userFull22.starref_program, j2, ylbVar2, true);
                                    return;
                                }
                                return;
                            default:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    my0Var22.dismiss();
                                    mh1.J0(context2, i2, userFull22.starref_program, j2, ylbVar2, true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ((my0[]) obj2)[0].dismiss();
                mh1.K0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                return;
        }
    }
}
