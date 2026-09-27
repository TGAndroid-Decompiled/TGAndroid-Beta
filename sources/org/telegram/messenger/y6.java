package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18181a;
    public final MediaDataController f18182b;
    public final TLRPC.messages_Messages f18183c;
    public final int d;
    public final long e;
    public final ArrayList f18184f;
    public final int h;
    public final int f18185n;
    public final boolean f18186r;
    public final int f18187s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18181a = i15;
        this.f18182b = mediaDataController;
        this.f18183c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18184f = arrayList;
        this.h = i11;
        this.f18185n = i12;
        this.f18186r = z10;
        this.f18187s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18181a) {
            case 0:
                this.f18182b.lambda$processLoadedMedia$133(this.f18183c, this.d, this.e, this.f18184f, this.h, this.f18185n, this.f18186r, this.f18187s, this.v);
                return;
            default:
                this.f18182b.lambda$processLoadedMedia$134(this.f18183c, this.d, this.e, this.f18184f, this.h, this.f18185n, this.f18186r, this.f18187s, this.v);
                return;
        }
    }
}
