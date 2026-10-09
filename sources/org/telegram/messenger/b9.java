package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17410a;
    public final MediaDataController f17411b;
    public final TLRPC.messages_Messages f17412c;
    public final int d;
    public final long f17413e;
    public final ArrayList f17414f;
    public final int h;
    public final int f17415n;
    public final boolean f17416r;
    public final int f17417s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17410a = i15;
        this.f17411b = mediaDataController;
        this.f17412c = messages_messages;
        this.d = i10;
        this.f17413e = j3;
        this.f17414f = arrayList;
        this.h = i11;
        this.f17415n = i12;
        this.f17416r = z10;
        this.f17417s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17410a) {
            case 0:
                this.f17411b.lambda$processLoadedMedia$134(this.f17412c, this.d, this.f17413e, this.f17414f, this.h, this.f17415n, this.f17416r, this.f17417s, this.v);
                return;
            default:
                this.f17411b.lambda$processLoadedMedia$133(this.f17412c, this.d, this.f17413e, this.f17414f, this.h, this.f17415n, this.f17416r, this.f17417s, this.v);
                return;
        }
    }
}
