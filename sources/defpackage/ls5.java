package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ls5 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ls5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls5.run():void");
    }

    public ls5(Object obj, Object obj2, TLRPC.User user, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = user;
    }
}
