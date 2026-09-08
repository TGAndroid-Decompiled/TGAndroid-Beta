package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f19705a;
    public final MediaDataController f19706b;
    public final TLRPC.messages_Messages f19707c;
    public final int d;
    public final long f19708e;
    public final ArrayList f19709f;
    public final int h;
    public final int f19710n;
    public final boolean f19711r;
    public final int f19712s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f19705a = i15;
        this.f19706b = mediaDataController;
        this.f19707c = messages_messages;
        this.d = i10;
        this.f19708e = j3;
        this.f19709f = arrayList;
        this.h = i11;
        this.f19710n = i12;
        this.f19711r = z10;
        this.f19712s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f19705a) {
            case 0:
                this.f19706b.lambda$processLoadedMedia$133(this.f19707c, this.d, this.f19708e, this.f19709f, this.h, this.f19710n, this.f19711r, this.f19712s, this.v);
                return;
            default:
                this.f19706b.lambda$processLoadedMedia$134(this.f19707c, this.d, this.f19708e, this.f19709f, this.h, this.f19710n, this.f19711r, this.f19712s, this.v);
                return;
        }
    }
}
