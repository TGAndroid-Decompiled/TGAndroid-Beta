package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18187a;
    public final MediaDataController f18188b;
    public final TLRPC.messages_Messages f18189c;
    public final int d;
    public final long e;
    public final ArrayList f18190f;
    public final int h;
    public final int f18191n;
    public final boolean f18192r;
    public final int f18193s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18187a = i15;
        this.f18188b = mediaDataController;
        this.f18189c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18190f = arrayList;
        this.h = i11;
        this.f18191n = i12;
        this.f18192r = z10;
        this.f18193s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                this.f18188b.lambda$processLoadedMedia$133(this.f18189c, this.d, this.e, this.f18190f, this.h, this.f18191n, this.f18192r, this.f18193s, this.v);
                return;
            default:
                this.f18188b.lambda$processLoadedMedia$134(this.f18189c, this.d, this.e, this.f18190f, this.h, this.f18191n, this.f18192r, this.f18193s, this.v);
                return;
        }
    }
}
