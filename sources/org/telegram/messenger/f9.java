package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f18411a;
    public final MediaDataController f18412b;
    public final TLRPC.messages_Messages f18413c;
    public final int d;
    public final long e;
    public final ArrayList f18414f;
    public final int h;
    public final int f18415n;
    public final boolean f18416r;
    public final int f18417s;
    public final int v;

    public f9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18411a = i15;
        this.f18412b = mediaDataController;
        this.f18413c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18414f = arrayList;
        this.h = i11;
        this.f18415n = i12;
        this.f18416r = z10;
        this.f18417s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18411a) {
            case 0:
                this.f18412b.lambda$processLoadedMedia$134(this.f18413c, this.d, this.e, this.f18414f, this.h, this.f18415n, this.f18416r, this.f18417s, this.v);
                return;
            default:
                this.f18412b.lambda$processLoadedMedia$133(this.f18413c, this.d, this.e, this.f18414f, this.h, this.f18415n, this.f18416r, this.f18417s, this.v);
                return;
        }
    }
}
