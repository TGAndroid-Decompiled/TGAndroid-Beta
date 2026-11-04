package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f24402a = 0;
    public final int f24403b;
    public final long f24404c;
    public final long d;
    public final int f24405e;
    public final boolean f24406f;
    public final Object h;
    public final Object f24407n;
    public final Object f24408r;

    public nn(hp hpVar, long j10, int i3, int i10, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, org.telegram.ui.tf tfVar) {
        this.h = hpVar;
        this.f24404c = j10;
        this.f24403b = i3;
        this.f24405e = i10;
        this.d = j11;
        this.f24407n = tL_messages_affectedHistory;
        this.f24406f = z10;
        this.f24408r = tfVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.nn.run():void");
    }

    public nn(TLObject tLObject, int i3, long j10, long j11, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f24403b = i3;
        this.f24404c = j10;
        this.d = j11;
        this.f24405e = i10;
        this.f24406f = z10;
        this.f24407n = context;
        this.f24408r = str;
    }
}
