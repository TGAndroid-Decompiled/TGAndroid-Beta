package defpackage;

import org.telegram.tgnet.TLObject;
public final class n40 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;

    public n40(Object obj, long j, long j2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.run():void");
    }

    public n40(Object obj, long j, TLObject tLObject, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = tLObject;
        this.c = j2;
    }

    public n40(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = j2;
    }
}
