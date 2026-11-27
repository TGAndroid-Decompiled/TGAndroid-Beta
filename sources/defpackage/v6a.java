package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v6a implements Runnable {
    public final byte a = 0;
    public final r7a b;
    public final boolean c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message e;
    public final TLObject f;
    public final r47 h;
    public final HashMap n;
    public final String r;
    public final TLObject s;

    public v6a(r7a r7aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, r47 r47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = r7aVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = r47Var;
        this.r = str;
        this.n = hashMap;
        this.c = z;
        this.s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6a.run():void");
    }

    public v6a(r7a r7aVar, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, r47 r47Var, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = r7aVar;
        this.c = z;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = r47Var;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
