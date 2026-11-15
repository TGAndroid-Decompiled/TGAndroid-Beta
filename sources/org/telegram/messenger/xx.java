package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx implements Runnable {
    public final int f27614a = 0;
    public final ez f27615b;
    public final boolean f27616c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f27617e;
    public final TLObject f27618f;
    public final gj h;
    public final HashMap f27619n;
    public final String f27620r;
    public final TLObject f27621s;

    public xx(ez ezVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f27615b = ezVar;
        this.d = tL_error;
        this.f27617e = message;
        this.f27618f = tLObject;
        this.h = gjVar;
        this.f27620r = str;
        this.f27619n = hashMap;
        this.f27616c = z10;
        this.f27621s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xx.run():void");
    }

    public xx(ez ezVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f27615b = ezVar;
        this.f27616c = z10;
        this.d = tL_error;
        this.f27617e = message;
        this.f27618f = tLObject;
        this.h = gjVar;
        this.f27619n = hashMap;
        this.f27620r = str;
        this.f27621s = tLObject2;
    }
}
