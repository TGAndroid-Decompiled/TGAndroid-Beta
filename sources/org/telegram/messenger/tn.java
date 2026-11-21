package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tn implements Runnable {
    public final int f27059a = 0;
    public final int f27060b;
    public final long f27061c;
    public final long d;
    public final int f27062e;
    public final boolean f27063f;
    public final Object h;
    public final Object f27064n;
    public final Object f27065r;

    public tn(mp mpVar, long j3, int i7, int i10, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.vf vfVar) {
        this.h = mpVar;
        this.f27061c = j3;
        this.f27060b = i7;
        this.f27062e = i10;
        this.d = j10;
        this.f27064n = tL_messages_affectedHistory;
        this.f27063f = z10;
        this.f27065r = vfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tn.run():void");
    }

    public tn(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f27060b = i7;
        this.f27061c = j3;
        this.d = j10;
        this.f27062e = i10;
        this.f27063f = z10;
        this.f27064n = context;
        this.f27065r = str;
    }
}
