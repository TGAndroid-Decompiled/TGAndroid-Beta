package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f26439a = 0;
    public final int f26440b;
    public final long f26441c;
    public final long d;
    public final int f26442e;
    public final int f26443f;
    public final boolean h;
    public final c1 f26444n;
    public final Object f26445r;

    public sg(si siVar, int i7, ArrayList arrayList, boolean z10, long j3, int i10, int i11, long j10) {
        this.f26444n = siVar;
        this.f26440b = i7;
        this.f26445r = arrayList;
        this.h = z10;
        this.f26441c = j3;
        this.f26442e = i10;
        this.f26443f = i11;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sg.run():void");
    }

    public sg(vr vrVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z10) {
        this.f26444n = vrVar;
        this.f26440b = i7;
        this.f26445r = messages_messages;
        this.f26441c = j3;
        this.d = j10;
        this.f26442e = i10;
        this.f26443f = i11;
        this.h = z10;
    }
}
