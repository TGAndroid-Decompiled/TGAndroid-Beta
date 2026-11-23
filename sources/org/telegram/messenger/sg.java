package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sg implements Runnable {
    public final int f26792a = 0;
    public final int f26793b;
    public final long f26794c;
    public final long d;
    public final int f26795e;
    public final int f26796f;
    public final boolean h;
    public final c1 f26797n;
    public final Object f26798r;

    public sg(si siVar, int i7, ArrayList arrayList, boolean z10, long j3, int i10, int i11, long j10) {
        this.f26797n = siVar;
        this.f26793b = i7;
        this.f26798r = arrayList;
        this.h = z10;
        this.f26794c = j3;
        this.f26795e = i10;
        this.f26796f = i11;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sg.run():void");
    }

    public sg(ur urVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z10) {
        this.f26797n = urVar;
        this.f26793b = i7;
        this.f26798r = messages_messages;
        this.f26794c = j3;
        this.d = j10;
        this.f26795e = i10;
        this.f26796f = i11;
        this.h = z10;
    }
}
