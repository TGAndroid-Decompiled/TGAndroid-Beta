package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ic2 implements Runnable {
    public final byte a;
    public final int b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ic2(fu5 fu5Var, int i, long j, long j2, zu1 zu1Var, vnb vnbVar) {
        this.a = (byte) 0;
        this.e = fu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = zu1Var;
        this.h = vnbVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic2.run():void");
    }

    public ic2(int i, Object obj, long j, long j2, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = i;
        this.e = obj;
        this.c = j;
        this.d = j2;
        this.f = obj2;
        this.h = obj3;
    }

    public ic2(o96 o96Var, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = (byte) 1;
        this.e = o96Var;
        this.b = i;
        this.f = tL_error;
        this.c = j;
        this.d = j2;
        this.h = tL_textWithEntities;
    }

    public ic2(ls6 ls6Var, long j, long j2, TL_bots.BotInfo botInfo, c97 c97Var, int i) {
        this.a = (byte) 2;
        this.e = ls6Var;
        this.c = j;
        this.d = j2;
        this.f = botInfo;
        this.h = c97Var;
        this.b = i;
    }

    public ic2(uc7 uc7Var, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.a = (byte) 3;
        this.e = uc7Var;
        this.c = j;
        this.d = j2;
        this.f = inputPeer;
        this.b = i;
        this.h = iArr;
    }

    public ic2(kf7 kf7Var, int i, long j, String str, long j2, String str2) {
        this.a = (byte) 5;
        this.e = kf7Var;
        this.b = i;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.h = str2;
    }

    public ic2(kf7 kf7Var, long j, String str, long j2, int i, mt7 mt7Var) {
        this.a = (byte) 4;
        this.e = kf7Var;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.b = i;
        this.h = mt7Var;
    }
}
