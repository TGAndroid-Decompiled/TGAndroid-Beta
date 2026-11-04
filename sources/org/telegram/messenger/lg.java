package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f23989a = 0;
    public final int f23990b;
    public final long f23991c;
    public final long d;
    public final int f23992e;
    public final int f23993f;
    public final boolean h;
    public final c1 f23994n;
    public final Object f23995r;

    public lg(li liVar, int i3, ArrayList arrayList, boolean z10, long j10, int i10, int i11, long j11) {
        this.f23994n = liVar;
        this.f23990b = i3;
        this.f23995r = arrayList;
        this.h = z10;
        this.f23991c = j10;
        this.f23992e = i10;
        this.f23993f = i11;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lg.run():void");
    }

    public lg(qr qrVar, int i3, TLRPC.messages_Messages messages_messages, long j10, long j11, int i10, int i11, boolean z10) {
        this.f23994n = qrVar;
        this.f23990b = i3;
        this.f23995r = messages_messages;
        this.f23991c = j10;
        this.d = j11;
        this.f23992e = i10;
        this.f23993f = i11;
        this.h = z10;
    }
}
