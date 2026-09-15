package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f17943a;
    public final MediaDataController f17944b;
    public final TLRPC.messages_Messages f17945c;
    public final int d;
    public final long e;
    public final ArrayList f17946f;
    public final int h;
    public final int f17947n;
    public final boolean f17948r;
    public final int f17949s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17943a = i15;
        this.f17944b = mediaDataController;
        this.f17945c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f17946f = arrayList;
        this.h = i11;
        this.f17947n = i12;
        this.f17948r = z10;
        this.f17949s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17943a) {
            case 0:
                this.f17944b.lambda$processLoadedMedia$133(this.f17945c, this.d, this.e, this.f17946f, this.h, this.f17947n, this.f17948r, this.f17949s, this.v);
                return;
            default:
                this.f17944b.lambda$processLoadedMedia$134(this.f17945c, this.d, this.e, this.f17946f, this.h, this.f17947n, this.f17948r, this.f17949s, this.v);
                return;
        }
    }
}
