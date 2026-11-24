package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d35 implements Runnable {
    public final byte a = 0;
    public final qac b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public d35(g35 g35Var, String str, y25 y25Var, long j, long j2, qac qacVar) {
        this.e = g35Var;
        this.f = str;
        this.h = y25Var;
        this.c = j;
        this.d = j2;
        this.b = qacVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d35.run():void");
    }

    public d35(wsa wsaVar, qac qacVar, TLRPC.TL_error tL_error, TLObject tLObject, long j, long j2) {
        this.e = wsaVar;
        this.b = qacVar;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j;
        this.d = j2;
    }
}
