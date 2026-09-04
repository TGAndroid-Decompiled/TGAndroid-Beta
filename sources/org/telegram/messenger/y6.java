package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f19678a;
    public final MediaDataController f19679b;
    public final TLRPC.messages_Messages f19680c;
    public final int d;
    public final long f19681e;
    public final ArrayList f19682f;
    public final int h;
    public final int f19683n;
    public final boolean f19684r;
    public final int f19685s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f19678a = i15;
        this.f19679b = mediaDataController;
        this.f19680c = messages_messages;
        this.d = i10;
        this.f19681e = j3;
        this.f19682f = arrayList;
        this.h = i11;
        this.f19683n = i12;
        this.f19684r = z10;
        this.f19685s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f19678a) {
            case 0:
                this.f19679b.lambda$processLoadedMedia$133(this.f19680c, this.d, this.f19681e, this.f19682f, this.h, this.f19683n, this.f19684r, this.f19685s, this.v);
                return;
            default:
                this.f19679b.lambda$processLoadedMedia$134(this.f19680c, this.d, this.f19681e, this.f19682f, this.h, this.f19683n, this.f19684r, this.f19685s, this.v);
                return;
        }
    }
}
