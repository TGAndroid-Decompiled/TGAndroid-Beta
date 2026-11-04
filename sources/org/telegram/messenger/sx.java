package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sx implements Runnable {
    public final int f25441a = 0;
    public final yy f25442b;
    public final boolean f25443c;
    public final TLRPC.TL_error d;
    public final TLRPC.Message f25444e;
    public final TLObject f25445f;
    public final zi h;
    public final HashMap f25446n;
    public final String f25447r;
    public final TLObject f25448s;

    public sx(yy yyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, zi ziVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f25442b = yyVar;
        this.d = tL_error;
        this.f25444e = message;
        this.f25445f = tLObject;
        this.h = ziVar;
        this.f25447r = str;
        this.f25446n = hashMap;
        this.f25443c = z10;
        this.f25448s = tLObject2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sx.run():void");
    }

    public sx(yy yyVar, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, zi ziVar, HashMap hashMap, String str, TLObject tLObject2) {
        this.f25442b = yyVar;
        this.f25443c = z10;
        this.d = tL_error;
        this.f25444e = message;
        this.f25445f = tLObject;
        this.h = ziVar;
        this.f25446n = hashMap;
        this.f25447r = str;
        this.f25448s = tLObject2;
    }
}
