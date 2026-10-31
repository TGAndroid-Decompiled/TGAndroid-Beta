package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bo implements Runnable {
    public final int f14803a = 0;
    public final int f14804b;
    public final long f14805c;
    public final long d;
    public final int e;
    public final boolean f14806f;
    public final Object h;
    public final Object f14807n;
    public final Object f14808r;

    public bo(vp vpVar, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.lg lgVar) {
        this.h = vpVar;
        this.f14805c = j10;
        this.f14804b = i10;
        this.e = i11;
        this.d = j11;
        this.f14807n = tL_messages_affectedHistory;
        this.f14806f = z10;
        this.f14808r = lgVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bo.run():void");
    }

    public bo(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f14804b = i10;
        this.f14805c = j10;
        this.d = j11;
        this.e = i11;
        this.f14806f = z10;
        this.f14807n = context;
        this.f14808r = str;
    }
}
