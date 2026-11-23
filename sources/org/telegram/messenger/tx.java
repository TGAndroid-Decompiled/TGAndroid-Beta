package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tx implements Runnable {
    public final int f27084a = 0;
    public final az f27085b;
    public final boolean f27086c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f27087e;
    public final TLObject f27088f;
    public final gj h;
    public final HashMap f27089n;
    public final String f27090r;
    public final TLObject f27091s;

    public tx(az azVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f27085b = azVar;
        this.d = tL_error;
        this.f27087e = message;
        this.f27088f = tLObject;
        this.h = gjVar;
        this.f27090r = str;
        this.f27089n = hashMap;
        this.f27086c = z10;
        this.f27091s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tx.run():void");
    }

    public tx(az azVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f27085b = azVar;
        this.f27086c = z10;
        this.d = tL_error;
        this.f27087e = message;
        this.f27088f = tLObject;
        this.h = gjVar;
        this.f27089n = hashMap;
        this.f27090r = str;
        this.f27091s = tLObject2;
    }
}
