package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18188a;
    public final MediaDataController f18189b;
    public final TLRPC.messages_Messages f18190c;
    public final int d;
    public final long e;
    public final ArrayList f18191f;
    public final int h;
    public final int f18192n;
    public final boolean f18193r;
    public final int f18194s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18188a = i15;
        this.f18189b = mediaDataController;
        this.f18190c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18191f = arrayList;
        this.h = i11;
        this.f18192n = i12;
        this.f18193r = z10;
        this.f18194s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18188a) {
            case 0:
                this.f18189b.lambda$processLoadedMedia$133(this.f18190c, this.d, this.e, this.f18191f, this.h, this.f18192n, this.f18193r, this.f18194s, this.v);
                return;
            default:
                this.f18189b.lambda$processLoadedMedia$134(this.f18190c, this.d, this.e, this.f18191f, this.h, this.f18192n, this.f18193r, this.f18194s, this.v);
                return;
        }
    }
}
