package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g9 implements Runnable {
    public final int f18417a;
    public final MediaDataController f18418b;
    public final TLRPC.messages_Messages f18419c;
    public final int d;
    public final long e;
    public final ArrayList f18420f;
    public final int h;
    public final int f18421n;
    public final boolean f18422r;
    public final int f18423s;
    public final int v;

    public g9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18417a = i15;
        this.f18418b = mediaDataController;
        this.f18419c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18420f = arrayList;
        this.h = i11;
        this.f18421n = i12;
        this.f18422r = z10;
        this.f18423s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18417a) {
            case 0:
                this.f18418b.lambda$processLoadedMedia$134(this.f18419c, this.d, this.e, this.f18420f, this.h, this.f18421n, this.f18422r, this.f18423s, this.v);
                return;
            default:
                this.f18418b.lambda$processLoadedMedia$133(this.f18419c, this.d, this.e, this.f18420f, this.h, this.f18421n, this.f18422r, this.f18423s, this.v);
                return;
        }
    }
}
