package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t2a implements Runnable {
    public final byte a = 0;
    public final z3a b;
    public final boolean c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message e;
    public final TLObject f;
    public final k27 h;
    public final HashMap n;
    public final String r;
    public final TLObject s;

    public t2a(z3a z3aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k27 k27Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = z3aVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k27Var;
        this.r = str;
        this.n = hashMap;
        this.c = z;
        this.s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2a.run():void");
    }

    public t2a(z3a z3aVar, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k27 k27Var, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = z3aVar;
        this.c = z;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k27Var;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
