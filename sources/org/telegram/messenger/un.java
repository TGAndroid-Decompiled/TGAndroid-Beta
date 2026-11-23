package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class un implements Runnable {
    public final int f27193a = 0;
    public final int f27194b;
    public final long f27195c;
    public final long d;
    public final int f27196e;
    public final boolean f27197f;
    public final Object h;
    public final Object f27198n;
    public final Object f27199r;

    public un(np npVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.vf vfVar) {
        this.h = npVar;
        this.f27195c = j3;
        this.f27194b = i7;
        this.f27196e = i10;
        this.d = j10;
        this.f27198n = tL_messages_affectedHistory;
        this.f27197f = z10;
        this.f27199r = vfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.un.run():void");
    }

    public un(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f27194b = i7;
        this.f27195c = j3;
        this.d = j10;
        this.f27196e = i10;
        this.f27197f = z10;
        this.f27198n = context;
        this.f27199r = str;
    }
}
