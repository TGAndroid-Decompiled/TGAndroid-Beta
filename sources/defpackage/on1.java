package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class on1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public on1(g92 g92Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = (byte) 17;
        this.b = g92Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on1.run():void");
    }

    public on1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
