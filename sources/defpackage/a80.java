package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a80 implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final long d;
    public final int e;
    public final Object f;

    public a80(int i, int i2, long j, cf7 cf7Var, ArrayList arrayList) {
        this.a = (byte) 5;
        this.b = cf7Var;
        this.d = j;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a80.run():void");
    }

    public a80(j5 j5Var, TLObject tLObject, int i, long j, int i2, byte b) {
        this.a = b;
        this.b = j5Var;
        this.f = tLObject;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public a80(p86 p86Var, int i, float[] fArr, int i2, long j) {
        this.a = (byte) 2;
        this.b = p86Var;
        this.c = i;
        this.f = fArr;
        this.e = i2;
        this.d = j;
    }

    public a80(hs6 hs6Var, ArrayList arrayList, int i, int i2, long j) {
        this.a = (byte) 3;
        this.b = hs6Var;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
        this.d = j;
    }

    public a80(cf7 cf7Var, int i, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2) {
        this.a = (byte) 4;
        this.b = cf7Var;
        this.c = i;
        this.f = tL_forumTopic;
        this.d = j;
        this.e = i2;
    }
}
