package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx implements Runnable {
    public final int f27616a = 0;
    public final ez f27617b;
    public final boolean f27618c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f27619e;
    public final TLObject f27620f;
    public final gj h;
    public final HashMap f27621n;
    public final String f27622r;
    public final TLObject f27623s;

    public xx(ez ezVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f27617b = ezVar;
        this.d = tL_error;
        this.f27619e = message;
        this.f27620f = tLObject;
        this.h = gjVar;
        this.f27622r = str;
        this.f27621n = hashMap;
        this.f27618c = z10;
        this.f27623s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xx.run():void");
    }

    public xx(ez ezVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f27617b = ezVar;
        this.f27618c = z10;
        this.d = tL_error;
        this.f27619e = message;
        this.f27620f = tLObject;
        this.h = gjVar;
        this.f27621n = hashMap;
        this.f27622r = str;
        this.f27623s = tLObject2;
    }
}
