package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ay implements Runnable {
    public final int f21545a = 0;
    public final gz f21546b;
    public final boolean f21547c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f21548e;
    public final TLObject f21549f;
    public final ij h;
    public final HashMap f21550n;
    public final String f21551r;
    public final TLObject f21552s;

    public ay(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.f21546b = gzVar;
        this.d = tL_error;
        this.f21548e = message;
        this.f21549f = tLObject;
        this.h = ijVar;
        this.f21551r = str;
        this.f21550n = hashMap;
        this.f21547c = z9;
        this.f21552s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ay.run():void");
    }

    public ay(gz gzVar, boolean z9, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f21546b = gzVar;
        this.f21547c = z9;
        this.d = tL_error;
        this.f21548e = message;
        this.f21549f = tLObject;
        this.h = ijVar;
        this.f21550n = hashMap;
        this.f21551r = str;
        this.f21552s = tLObject2;
    }
}
