package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rg implements Runnable {
    public final int f26606a = 0;
    public final int f26607b;
    public final long f26608c;
    public final long d;
    public final int f26609e;
    public final int f26610f;
    public final boolean h;
    public final c1 f26611n;
    public final Object f26612r;

    public rg(ri riVar, int i7, ArrayList arrayList, boolean z10, long j3, int i10, int i11, long j10) {
        this.f26611n = riVar;
        this.f26607b = i7;
        this.f26612r = arrayList;
        this.h = z10;
        this.f26608c = j3;
        this.f26609e = i10;
        this.f26610f = i11;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rg.run():void");
    }

    public rg(tr trVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z10) {
        this.f26611n = trVar;
        this.f26607b = i7;
        this.f26612r = messages_messages;
        this.f26608c = j3;
        this.d = j10;
        this.f26609e = i10;
        this.f26610f = i11;
        this.h = z10;
    }
}
