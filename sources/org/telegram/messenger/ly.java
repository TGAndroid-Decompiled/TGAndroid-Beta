package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ly implements Runnable {
    public final int f16830a = 0;
    public final qz f16831b;
    public final boolean f16832c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message e;
    public final TLObject f16833f;
    public final jj h;
    public final HashMap f16834n;
    public final String f16835r;
    public final TLObject f16836s;

    public ly(qz qzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, jj jjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f16831b = qzVar;
        this.d = tL_error;
        this.e = message;
        this.f16833f = tLObject;
        this.h = jjVar;
        this.f16835r = str;
        this.f16834n = hashMap;
        this.f16832c = z10;
        this.f16836s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ly.run():void");
    }

    public ly(qz qzVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, jj jjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f16831b = qzVar;
        this.f16832c = z10;
        this.d = tL_error;
        this.e = message;
        this.f16833f = tLObject;
        this.h = jjVar;
        this.f16834n = hashMap;
        this.f16835r = str;
        this.f16836s = tLObject2;
    }
}
