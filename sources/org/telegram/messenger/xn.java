package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn implements Runnable {
    public final int f26502a = 0;
    public final int f26503b;
    public final long f26504c;
    public final long d;
    public final int f26505e;
    public final boolean f26506f;
    public final Object h;
    public final Object f26507n;
    public final Object f26508r;

    public xn(qp qpVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z9, org.telegram.ui.xf xfVar) {
        this.h = qpVar;
        this.f26504c = j3;
        this.f26503b = i7;
        this.f26505e = i10;
        this.d = j10;
        this.f26507n = tL_messages_affectedHistory;
        this.f26506f = z9;
        this.f26508r = xfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xn.run():void");
    }

    public xn(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z9, Context context, String str) {
        this.h = tLObject;
        this.f26503b = i7;
        this.f26504c = j3;
        this.d = j10;
        this.f26505e = i10;
        this.f26506f = z9;
        this.f26507n = context;
        this.f26508r = str;
    }
}
