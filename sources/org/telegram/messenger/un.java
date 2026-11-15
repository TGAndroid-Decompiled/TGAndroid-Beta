package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class un implements Runnable {
    public final int f26844a = 0;
    public final int f26845b;
    public final long f26846c;
    public final long d;
    public final int f26847e;
    public final boolean f26848f;
    public final Object h;
    public final Object f26849n;
    public final Object f26850r;

    public un(np npVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.uf ufVar) {
        this.h = npVar;
        this.f26846c = j3;
        this.f26845b = i7;
        this.f26847e = i10;
        this.d = j10;
        this.f26849n = tL_messages_affectedHistory;
        this.f26848f = z10;
        this.f26850r = ufVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.un.run():void");
    }

    public un(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f26845b = i7;
        this.f26846c = j3;
        this.d = j10;
        this.f26847e = i10;
        this.f26848f = z10;
        this.f26849n = context;
        this.f26850r = str;
    }
}
