package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ay implements Runnable {
    public final int f21544a = 0;
    public final gz f21545b;
    public final boolean f21546c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f21547e;
    public final TLObject f21548f;
    public final ij h;
    public final HashMap f21549n;
    public final String f21550r;
    public final TLObject f21551s;

    public ay(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.f21545b = gzVar;
        this.d = tL_error;
        this.f21547e = message;
        this.f21548f = tLObject;
        this.h = ijVar;
        this.f21550r = str;
        this.f21549n = hashMap;
        this.f21546c = z9;
        this.f21551s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ay.run():void");
    }

    public ay(gz gzVar, boolean z9, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f21545b = gzVar;
        this.f21546c = z9;
        this.d = tL_error;
        this.f21547e = message;
        this.f21548f = tLObject;
        this.h = ijVar;
        this.f21549n = hashMap;
        this.f21550r = str;
        this.f21551s = tLObject2;
    }
}
