package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4a implements Runnable {
    public final byte a = 0;
    public final a6a b;
    public final boolean c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message e;
    public final TLObject f;
    public final k47 h;
    public final HashMap n;
    public final String r;
    public final TLObject s;

    public v4a(a6a a6aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k47 k47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = a6aVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k47Var;
        this.r = str;
        this.n = hashMap;
        this.c = z;
        this.s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4a.run():void");
    }

    public v4a(a6a a6aVar, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k47 k47Var, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = a6aVar;
        this.c = z;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k47Var;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
