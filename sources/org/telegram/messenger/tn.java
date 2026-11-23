package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tn implements Runnable {
    public final int f27128a = 0;
    public final int f27129b;
    public final long f27130c;
    public final long d;
    public final int f27131e;
    public final boolean f27132f;
    public final Object h;
    public final Object f27133n;
    public final Object f27134r;

    public tn(mp mpVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.vf vfVar) {
        this.h = mpVar;
        this.f27130c = j3;
        this.f27129b = i7;
        this.f27131e = i10;
        this.d = j10;
        this.f27133n = tL_messages_affectedHistory;
        this.f27132f = z10;
        this.f27134r = vfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tn.run():void");
    }

    public tn(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f27129b = i7;
        this.f27130c = j3;
        this.d = j10;
        this.f27131e = i10;
        this.f27132f = z10;
        this.f27133n = context;
        this.f27134r = str;
    }
}
