package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f19626a;
    public final MediaDataController f19627b;
    public final TLRPC.messages_Messages f19628c;
    public final int d;
    public final long f19629e;
    public final ArrayList f19630f;
    public final int h;
    public final int f19631n;
    public final boolean f19632r;
    public final int f19633s;
    public final int v;

    public x6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f19626a = i15;
        this.f19627b = mediaDataController;
        this.f19628c = messages_messages;
        this.d = i10;
        this.f19629e = j3;
        this.f19630f = arrayList;
        this.h = i11;
        this.f19631n = i12;
        this.f19632r = z10;
        this.f19633s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f19626a) {
            case 0:
                this.f19627b.lambda$processLoadedMedia$133(this.f19628c, this.d, this.f19629e, this.f19630f, this.h, this.f19631n, this.f19632r, this.f19633s, this.v);
                return;
            default:
                this.f19627b.lambda$processLoadedMedia$134(this.f19628c, this.d, this.f19629e, this.f19630f, this.h, this.f19631n, this.f19632r, this.f19633s, this.v);
                return;
        }
    }
}
