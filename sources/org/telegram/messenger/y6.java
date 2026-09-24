package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18173a;
    public final MediaDataController f18174b;
    public final TLRPC.messages_Messages f18175c;
    public final int d;
    public final long e;
    public final ArrayList f18176f;
    public final int h;
    public final int f18177n;
    public final boolean f18178r;
    public final int f18179s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18173a = i15;
        this.f18174b = mediaDataController;
        this.f18175c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18176f = arrayList;
        this.h = i11;
        this.f18177n = i12;
        this.f18178r = z10;
        this.f18179s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18173a) {
            case 0:
                this.f18174b.lambda$processLoadedMedia$133(this.f18175c, this.d, this.e, this.f18176f, this.h, this.f18177n, this.f18178r, this.f18179s, this.v);
                return;
            default:
                this.f18174b.lambda$processLoadedMedia$134(this.f18175c, this.d, this.e, this.f18176f, this.h, this.f18177n, this.f18178r, this.f18179s, this.v);
                return;
        }
    }
}
