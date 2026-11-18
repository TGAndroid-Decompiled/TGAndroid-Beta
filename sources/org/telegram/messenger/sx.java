package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final int f26894a = 0;
    public final zy f26895b;
    public final boolean f26896c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f26897e;
    public final TLObject f26898f;
    public final fj h;
    public final HashMap f26899n;
    public final String f26900r;
    public final TLObject f26901s;

    public sx(zy zyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f26895b = zyVar;
        this.d = tL_error;
        this.f26897e = message;
        this.f26898f = tLObject;
        this.h = fjVar;
        this.f26900r = str;
        this.f26899n = hashMap;
        this.f26896c = z10;
        this.f26901s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sx.run():void");
    }

    public sx(zy zyVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, fj fjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f26895b = zyVar;
        this.f26896c = z10;
        this.d = tL_error;
        this.f26897e = message;
        this.f26898f = tLObject;
        this.h = fjVar;
        this.f26899n = hashMap;
        this.f26900r = str;
        this.f26901s = tLObject2;
    }
}
