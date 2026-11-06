package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn implements Runnable {
    public final int f26495a = 0;
    public final int f26496b;
    public final long f26497c;
    public final long d;
    public final int f26498e;
    public final boolean f26499f;
    public final Object h;
    public final Object f26500n;
    public final Object f26501r;

    public xn(qp qpVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z9, org.telegram.ui.xf xfVar) {
        this.h = qpVar;
        this.f26497c = j3;
        this.f26496b = i7;
        this.f26498e = i10;
        this.d = j10;
        this.f26500n = tL_messages_affectedHistory;
        this.f26499f = z9;
        this.f26501r = xfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xn.run():void");
    }

    public xn(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z9, Context context, String str) {
        this.h = tLObject;
        this.f26496b = i7;
        this.f26497c = j3;
        this.d = j10;
        this.f26498e = i10;
        this.f26499f = z9;
        this.f26500n = context;
        this.f26501r = str;
    }
}
