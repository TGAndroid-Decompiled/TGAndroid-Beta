package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a70 implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final long d;
    public final int e;
    public final Object f;

    public a70(int i, int i2, long j, ad7 ad7Var, ArrayList arrayList) {
        this.a = (byte) 5;
        this.b = ad7Var;
        this.d = j;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a70.run():void");
    }

    public a70(j5 j5Var, TLObject tLObject, int i, long j, int i2, byte b) {
        this.a = b;
        this.b = j5Var;
        this.f = tLObject;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public a70(p66 p66Var, int i, float[] fArr, int i2, long j) {
        this.a = (byte) 2;
        this.b = p66Var;
        this.c = i;
        this.f = fArr;
        this.e = i2;
        this.d = j;
    }

    public a70(hq6 hq6Var, ArrayList arrayList, int i, int i2, long j) {
        this.a = (byte) 3;
        this.b = hq6Var;
        this.f = arrayList;
        this.c = i;
        this.e = i2;
        this.d = j;
    }

    public a70(ad7 ad7Var, int i, TLRPC.TL_forumTopic tL_forumTopic, long j, int i2) {
        this.a = (byte) 4;
        this.b = ad7Var;
        this.c = i;
        this.f = tL_forumTopic;
        this.d = j;
        this.e = i2;
    }
}
