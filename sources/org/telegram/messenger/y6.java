package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f17939a;
    public final MediaDataController f17940b;
    public final TLRPC.messages_Messages f17941c;
    public final int d;
    public final long e;
    public final ArrayList f17942f;
    public final int h;
    public final int f17943n;
    public final boolean f17944r;
    public final int f17945s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17939a = i15;
        this.f17940b = mediaDataController;
        this.f17941c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f17942f = arrayList;
        this.h = i11;
        this.f17943n = i12;
        this.f17944r = z10;
        this.f17945s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17939a) {
            case 0:
                this.f17940b.lambda$processLoadedMedia$133(this.f17941c, this.d, this.e, this.f17942f, this.h, this.f17943n, this.f17944r, this.f17945s, this.v);
                return;
            default:
                this.f17940b.lambda$processLoadedMedia$134(this.f17941c, this.d, this.e, this.f17942f, this.h, this.f17943n, this.f17944r, this.f17945s, this.v);
                return;
        }
    }
}
