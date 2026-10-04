package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17407a;
    public final MediaDataController f17408b;
    public final TLRPC.messages_Messages f17409c;
    public final int d;
    public final long f17410e;
    public final ArrayList f17411f;
    public final int h;
    public final int f17412n;
    public final boolean f17413r;
    public final int f17414s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17407a = i15;
        this.f17408b = mediaDataController;
        this.f17409c = messages_messages;
        this.d = i10;
        this.f17410e = j3;
        this.f17411f = arrayList;
        this.h = i11;
        this.f17412n = i12;
        this.f17413r = z10;
        this.f17414s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17407a) {
            case 0:
                this.f17408b.lambda$processLoadedMedia$134(this.f17409c, this.d, this.f17410e, this.f17411f, this.h, this.f17412n, this.f17413r, this.f17414s, this.v);
                return;
            default:
                this.f17408b.lambda$processLoadedMedia$133(this.f17409c, this.d, this.f17410e, this.f17411f, this.h, this.f17412n, this.f17413r, this.f17414s, this.v);
                return;
        }
    }
}
