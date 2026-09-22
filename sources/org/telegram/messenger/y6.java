package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18183a;
    public final MediaDataController f18184b;
    public final TLRPC.messages_Messages f18185c;
    public final int d;
    public final long e;
    public final ArrayList f18186f;
    public final int h;
    public final int f18187n;
    public final boolean f18188r;
    public final int f18189s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18183a = i15;
        this.f18184b = mediaDataController;
        this.f18185c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18186f = arrayList;
        this.h = i11;
        this.f18187n = i12;
        this.f18188r = z10;
        this.f18189s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18183a) {
            case 0:
                this.f18184b.lambda$processLoadedMedia$133(this.f18185c, this.d, this.e, this.f18186f, this.h, this.f18187n, this.f18188r, this.f18189s, this.v);
                return;
            default:
                this.f18184b.lambda$processLoadedMedia$134(this.f18185c, this.d, this.e, this.f18186f, this.h, this.f18187n, this.f18188r, this.f18189s, this.v);
                return;
        }
    }
}
