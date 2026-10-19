package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17940a;
    public final MediaDataController f17941b;
    public final TLRPC.messages_Messages f17942c;
    public final int d;
    public final long e;
    public final ArrayList f17943f;
    public final int h;
    public final int f17944n;
    public final boolean f17945r;
    public final int f17946s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17940a = i15;
        this.f17941b = mediaDataController;
        this.f17942c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f17943f = arrayList;
        this.h = i11;
        this.f17944n = i12;
        this.f17945r = z10;
        this.f17946s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17940a) {
            case 0:
                this.f17941b.lambda$processLoadedMedia$134(this.f17942c, this.d, this.e, this.f17943f, this.h, this.f17944n, this.f17945r, this.f17946s, this.v);
                return;
            default:
                this.f17941b.lambda$processLoadedMedia$133(this.f17942c, this.d, this.e, this.f17943f, this.h, this.f17944n, this.f17945r, this.f17946s, this.v);
                return;
        }
    }
}
