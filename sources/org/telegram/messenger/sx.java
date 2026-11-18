package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final int f26892a = 0;
    public final zy f26893b;
    public final boolean f26894c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f26895e;
    public final TLObject f26896f;
    public final fj h;
    public final HashMap f26897n;
    public final String f26898r;
    public final TLObject f26899s;

    public sx(zy zyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f26893b = zyVar;
        this.d = tL_error;
        this.f26895e = message;
        this.f26896f = tLObject;
        this.h = fjVar;
        this.f26898r = str;
        this.f26897n = hashMap;
        this.f26894c = z10;
        this.f26899s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sx.run():void");
    }

    public sx(zy zyVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f26893b = zyVar;
        this.f26894c = z10;
        this.d = tL_error;
        this.f26895e = message;
        this.f26896f = tLObject;
        this.h = fjVar;
        this.f26897n = hashMap;
        this.f26898r = str;
        this.f26899s = tLObject2;
    }
}
