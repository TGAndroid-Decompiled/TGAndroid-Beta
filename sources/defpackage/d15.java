package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d15 implements Runnable {
    public final byte a = 0;
    public final p8c b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public d15(g15 g15Var, String str, y05 y05Var, long j, long j2, p8c p8cVar) {
        this.e = g15Var;
        this.f = str;
        this.h = y05Var;
        this.c = j;
        this.d = j2;
        this.b = p8cVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d15.run():void");
    }

    public d15(vqa vqaVar, p8c p8cVar, TLRPC.TL_error tL_error, TLObject tLObject, long j, long j2) {
        this.e = vqaVar;
        this.b = p8cVar;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j;
        this.d = j2;
    }
}
