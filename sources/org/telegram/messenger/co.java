package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class co implements Runnable {
    public final int f15186a = 0;
    public final int f15187b;
    public final long f15188c;
    public final long d;
    public final int e;
    public final boolean f15189f;
    public final Object h;
    public final Object f15190n;
    public final Object f15191r;

    public co(wp wpVar, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.ng ngVar) {
        this.h = wpVar;
        this.f15188c = j10;
        this.f15187b = i10;
        this.e = i11;
        this.d = j11;
        this.f15190n = tL_messages_affectedHistory;
        this.f15189f = z10;
        this.f15191r = ngVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.co.run():void");
    }

    public co(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f15187b = i10;
        this.f15188c = j10;
        this.d = j11;
        this.e = i11;
        this.f15189f = z10;
        this.f15190n = context;
        this.f15191r = str;
    }
}
