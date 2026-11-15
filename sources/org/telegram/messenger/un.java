package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class un implements Runnable {
    public final int f26842a = 0;
    public final int f26843b;
    public final long f26844c;
    public final long d;
    public final int f26845e;
    public final boolean f26846f;
    public final Object h;
    public final Object f26847n;
    public final Object f26848r;

    public un(np npVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.uf ufVar) {
        this.h = npVar;
        this.f26844c = j3;
        this.f26843b = i7;
        this.f26845e = i10;
        this.d = j10;
        this.f26847n = tL_messages_affectedHistory;
        this.f26846f = z10;
        this.f26848r = ufVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.un.run():void");
    }

    public un(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f26843b = i7;
        this.f26844c = j3;
        this.d = j10;
        this.f26845e = i10;
        this.f26846f = z10;
        this.f26847n = context;
        this.f26848r = str;
    }
}
