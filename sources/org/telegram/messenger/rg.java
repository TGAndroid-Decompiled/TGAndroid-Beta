package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rg implements Runnable {
    public final int f26580a = 0;
    public final int f26581b;
    public final long f26582c;
    public final long d;
    public final int f26583e;
    public final int f26584f;
    public final boolean h;
    public final c1 f26585n;
    public final Object f26586r;

    public rg(ri riVar, int i7, ArrayList arrayList, boolean z10, long j3, int i10, int i11, long j10) {
        this.f26585n = riVar;
        this.f26581b = i7;
        this.f26586r = arrayList;
        this.h = z10;
        this.f26582c = j3;
        this.f26583e = i10;
        this.f26584f = i11;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rg.run():void");
    }

    public rg(tr trVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z10) {
        this.f26585n = trVar;
        this.f26581b = i7;
        this.f26586r = messages_messages;
        this.f26582c = j3;
        this.d = j10;
        this.f26583e = i10;
        this.f26584f = i11;
        this.h = z10;
    }
}
