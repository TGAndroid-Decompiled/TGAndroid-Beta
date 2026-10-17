package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17927a;
    public final MediaDataController f17928b;
    public final TLRPC.messages_Messages f17929c;
    public final int d;
    public final long e;
    public final ArrayList f17930f;
    public final int h;
    public final int f17931n;
    public final boolean f17932r;
    public final int f17933s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17927a = i15;
        this.f17928b = mediaDataController;
        this.f17929c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f17930f = arrayList;
        this.h = i11;
        this.f17931n = i12;
        this.f17932r = z10;
        this.f17933s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17927a) {
            case 0:
                this.f17928b.lambda$processLoadedMedia$134(this.f17929c, this.d, this.e, this.f17930f, this.h, this.f17931n, this.f17932r, this.f17933s, this.v);
                return;
            default:
                this.f17928b.lambda$processLoadedMedia$133(this.f17929c, this.d, this.e, this.f17930f, this.h, this.f17931n, this.f17932r, this.f17933s, this.v);
                return;
        }
    }
}
