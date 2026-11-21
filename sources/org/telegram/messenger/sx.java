package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final int f26920a = 0;
    public final zy f26921b;
    public final boolean f26922c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f26923e;
    public final TLObject f26924f;
    public final fj h;
    public final HashMap f26925n;
    public final String f26926r;
    public final TLObject f26927s;

    public sx(zy zyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f26921b = zyVar;
        this.d = tL_error;
        this.f26923e = message;
        this.f26924f = tLObject;
        this.h = fjVar;
        this.f26926r = str;
        this.f26925n = hashMap;
        this.f26922c = z10;
        this.f26927s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sx.run():void");
    }

    public sx(zy zyVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f26921b = zyVar;
        this.f26922c = z10;
        this.d = tL_error;
        this.f26923e = message;
        this.f26924f = tLObject;
        this.h = fjVar;
        this.f26925n = hashMap;
        this.f26926r = str;
        this.f26927s = tLObject2;
    }
}
