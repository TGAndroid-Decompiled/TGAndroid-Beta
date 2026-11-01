package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my implements Runnable {
    public final int f17214a = 0;
    public final rz f17215b;
    public final boolean f17216c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message e;
    public final TLObject f17217f;
    public final kj h;
    public final HashMap f17218n;
    public final String f17219r;
    public final TLObject f17220s;

    public my(rz rzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, kj kjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f17215b = rzVar;
        this.d = tL_error;
        this.e = message;
        this.f17217f = tLObject;
        this.h = kjVar;
        this.f17219r = str;
        this.f17218n = hashMap;
        this.f17216c = z10;
        this.f17220s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.my.run():void");
    }

    public my(rz rzVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, kj kjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f17215b = rzVar;
        this.f17216c = z10;
        this.d = tL_error;
        this.e = message;
        this.f17217f = tLObject;
        this.h = kjVar;
        this.f17218n = hashMap;
        this.f17219r = str;
        this.f17220s = tLObject2;
    }
}
