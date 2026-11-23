package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f26756a = 0;
    public final int f26757b;
    public final long f26758c;
    public final long d;
    public final int f26759e;
    public final int f26760f;
    public final boolean h;
    public final c1 f26761n;
    public final Object f26762r;

    public sg(si siVar, int i7, ArrayList arrayList, boolean z10, long j3, int i10, int i11, long j10) {
        this.f26761n = siVar;
        this.f26757b = i7;
        this.f26762r = arrayList;
        this.h = z10;
        this.f26758c = j3;
        this.f26759e = i10;
        this.f26760f = i11;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sg.run():void");
    }

    public sg(ur urVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z10) {
        this.f26761n = urVar;
        this.f26757b = i7;
        this.f26762r = messages_messages;
        this.f26758c = j3;
        this.d = j10;
        this.f26759e = i10;
        this.f26760f = i11;
        this.h = z10;
    }
}
