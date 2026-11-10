package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn implements Runnable {
    public final int f26506a = 0;
    public final int f26507b;
    public final long f26508c;
    public final long d;
    public final int f26509e;
    public final boolean f26510f;
    public final Object h;
    public final Object f26511n;
    public final Object f26512r;

    public xn(qp qpVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z9, org.telegram.ui.xf xfVar) {
        this.h = qpVar;
        this.f26508c = j3;
        this.f26507b = i7;
        this.f26509e = i10;
        this.d = j10;
        this.f26511n = tL_messages_affectedHistory;
        this.f26510f = z9;
        this.f26512r = xfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xn.run():void");
    }

    public xn(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z9, Context context, String str) {
        this.h = tLObject;
        this.f26507b = i7;
        this.f26508c = j3;
        this.d = j10;
        this.f26509e = i10;
        this.f26510f = z9;
        this.f26511n = context;
        this.f26512r = str;
    }
}
