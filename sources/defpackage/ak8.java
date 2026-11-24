package defpackage;

import org.telegram.tgnet.TLObject;
public final class ak8 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ak8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak8.run():void");
    }

    public ak8(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
    }
}
