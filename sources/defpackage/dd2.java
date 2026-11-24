package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class dd2 implements Runnable {
    public final byte a = 6;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public dd2(int i, Context context, long j, long j2, my0[] my0VarArr, ylb ylbVar) {
        this.b = i;
        this.e = context;
        this.c = j;
        this.d = j2;
        this.f = my0VarArr;
        this.h = ylbVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd2.run():void");
    }

    public dd2(bu5 bu5Var, int i, long j, long j2, yv1 yv1Var, ylb ylbVar) {
        this.e = bu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = yv1Var;
        this.h = ylbVar;
    }

    public dd2(k96 k96Var, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = k96Var;
        this.b = i;
        this.f = tL_error;
        this.c = j;
        this.d = j2;
        this.h = tL_textWithEntities;
    }

    public dd2(hs6 hs6Var, long j, long j2, TL_bots.BotInfo botInfo, h97 h97Var, int i) {
        this.e = hs6Var;
        this.c = j;
        this.d = j2;
        this.f = botInfo;
        this.h = h97Var;
        this.b = i;
    }

    public dd2(oc7 oc7Var, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.e = oc7Var;
        this.c = j;
        this.d = j2;
        this.f = inputPeer;
        this.b = i;
        this.h = iArr;
    }

    public dd2(cf7 cf7Var, int i, long j, String str, long j2, String str2) {
        this.e = cf7Var;
        this.b = i;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.h = str2;
    }

    public dd2(cf7 cf7Var, long j, String str, long j2, int i, js7 js7Var) {
        this.e = cf7Var;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.b = i;
        this.h = js7Var;
    }
}
