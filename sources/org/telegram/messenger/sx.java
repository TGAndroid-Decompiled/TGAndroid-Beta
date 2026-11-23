package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final int f26993a = 0;
    public final zy f26994b;
    public final boolean f26995c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f26996e;
    public final TLObject f26997f;
    public final fj h;
    public final HashMap f26998n;
    public final String f26999r;
    public final TLObject f27000s;

    public sx(zy zyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f26994b = zyVar;
        this.d = tL_error;
        this.f26996e = message;
        this.f26997f = tLObject;
        this.h = fjVar;
        this.f26999r = str;
        this.f26998n = hashMap;
        this.f26995c = z10;
        this.f27000s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sx.run():void");
    }

    public sx(zy zyVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f26994b = zyVar;
        this.f26995c = z10;
        this.d = tL_error;
        this.f26996e = message;
        this.f26997f = tLObject;
        this.h = fjVar;
        this.f26998n = hashMap;
        this.f26999r = str;
        this.f27000s = tLObject2;
    }
}
