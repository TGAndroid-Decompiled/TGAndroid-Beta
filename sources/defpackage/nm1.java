package defpackage;

import org.telegram.tgnet.TLObject;
public final class nm1 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public nm1(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm1.run():void");
    }

    public nm1(Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
        this.h = obj4;
        this.b = j;
    }
}
