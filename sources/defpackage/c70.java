package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c70 implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final long d;
    public final int e;
    public final Object f;

    public c70(int i, int i2, long j, kf7 kf7Var, ArrayList arrayList) {
        this.a = (byte) 5;
        this.b = kf7Var;
        this.d = j;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c70.run():void");
    }

    public c70(k5 k5Var, TLObject tLObject, int i, long j, int i2, byte b) {
        this.a = b;
        this.b = k5Var;
        this.f = tLObject;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public c70(t86 t86Var, int i, float[] fArr, int i2, long j) {
        this.a = (byte) 2;
        this.b = t86Var;
        this.c = i;
        this.f = fArr;
        this.e = i2;
        this.d = j;
    }

    public c70(ls6 ls6Var, ArrayList arrayList, int i, int i2, long j) {
        this.a = (byte) 3;
        this.b = ls6Var;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
        this.d = j;
    }

    public c70(kf7 kf7Var, int i, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2) {
        this.a = (byte) 4;
        this.b = kf7Var;
        this.c = i;
        this.f = tL_forumTopic;
        this.d = j;
        this.e = i2;
    }
}
