package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18168a;
    public final MediaDataController f18169b;
    public final TLRPC.messages_Messages f18170c;
    public final int d;
    public final long e;
    public final ArrayList f18171f;
    public final int h;
    public final int f18172n;
    public final boolean f18173r;
    public final int f18174s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18168a = i15;
        this.f18169b = mediaDataController;
        this.f18170c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18171f = arrayList;
        this.h = i11;
        this.f18172n = i12;
        this.f18173r = z10;
        this.f18174s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18168a) {
            case 0:
                this.f18169b.lambda$processLoadedMedia$133(this.f18170c, this.d, this.e, this.f18171f, this.h, this.f18172n, this.f18173r, this.f18174s, this.v);
                return;
            default:
                this.f18169b.lambda$processLoadedMedia$134(this.f18170c, this.d, this.e, this.f18171f, this.h, this.f18172n, this.f18173r, this.f18174s, this.v);
                return;
        }
    }
}
