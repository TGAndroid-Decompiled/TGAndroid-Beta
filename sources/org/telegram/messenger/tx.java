package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tx implements Runnable {
    public final int f27120a = 0;
    public final az f27121b;
    public final boolean f27122c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f27123e;
    public final TLObject f27124f;
    public final gj h;
    public final HashMap f27125n;
    public final String f27126r;
    public final TLObject f27127s;

    public tx(az azVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f27121b = azVar;
        this.d = tL_error;
        this.f27123e = message;
        this.f27124f = tLObject;
        this.h = gjVar;
        this.f27126r = str;
        this.f27125n = hashMap;
        this.f27122c = z10;
        this.f27127s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tx.run():void");
    }

    public tx(az azVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f27121b = azVar;
        this.f27122c = z10;
        this.d = tL_error;
        this.f27123e = message;
        this.f27124f = tLObject;
        this.h = gjVar;
        this.f27125n = hashMap;
        this.f27126r = str;
        this.f27127s = tLObject2;
    }
}
