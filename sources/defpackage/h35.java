package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h35 implements Runnable {
    public final byte a = 0;
    public final pcc b;
    public final long c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public h35(k35 k35Var, String str, c35 c35Var, long j, long j2, pcc pccVar) {
        this.e = k35Var;
        this.f = str;
        this.h = c35Var;
        this.c = j;
        this.d = j2;
        this.b = pccVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h35.run():void");
    }

    public h35(wua wuaVar, pcc pccVar, TLRPC.TL_error tL_error, TLObject tLObject, long j, long j2) {
        this.e = wuaVar;
        this.b = pccVar;
        this.f = tL_error;
        this.h = tLObject;
        this.c = j;
        this.d = j2;
    }
}
