package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class q76 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public q76(int i, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 19;
        this.b = i;
        this.e = tL_error;
        this.c = dVar;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q76.run():void");
    }

    public q76(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public q76(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public q76(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
