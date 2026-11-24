package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sb2 implements Runnable {
    public final byte a = 6;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public sb2(int i, Context context, long j, long j2, fx0[] fx0VarArr, wjb wjbVar) {
        this.b = i;
        this.e = context;
        this.c = j;
        this.d = j2;
        this.f = fx0VarArr;
        this.h = wjbVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb2.run():void");
    }

    public sb2(cs5 cs5Var, int i, long j, long j2, mu1 mu1Var, wjb wjbVar) {
        this.e = cs5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = mu1Var;
        this.h = wjbVar;
    }

    public sb2(k76 k76Var, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = k76Var;
        this.b = i;
        this.f = tL_error;
        this.c = j;
        this.d = j2;
        this.h = tL_textWithEntities;
    }

    public sb2(hq6 hq6Var, long j, long j2, TL_bots.BotInfo botInfo, e77 e77Var, int i) {
        this.e = hq6Var;
        this.c = j;
        this.d = j2;
        this.f = botInfo;
        this.h = e77Var;
        this.b = i;
    }

    public sb2(na7 na7Var, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.e = na7Var;
        this.c = j;
        this.d = j2;
        this.f = inputPeer;
        this.b = i;
        this.h = iArr;
    }

    public sb2(ad7 ad7Var, int i, long j, String str, long j2, String str2) {
        this.e = ad7Var;
        this.b = i;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.h = str2;
    }

    public sb2(ad7 ad7Var, long j, String str, long j2, int i, gq7 gq7Var) {
        this.e = ad7Var;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.b = i;
        this.h = gq7Var;
    }
}
