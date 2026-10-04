package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17408a;
    public final MediaDataController f17409b;
    public final TLRPC.messages_Messages f17410c;
    public final int d;
    public final long f17411e;
    public final ArrayList f17412f;
    public final int h;
    public final int f17413n;
    public final boolean f17414r;
    public final int f17415s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17408a = i15;
        this.f17409b = mediaDataController;
        this.f17410c = messages_messages;
        this.d = i10;
        this.f17411e = j3;
        this.f17412f = arrayList;
        this.h = i11;
        this.f17413n = i12;
        this.f17414r = z10;
        this.f17415s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17408a) {
            case 0:
                this.f17409b.lambda$processLoadedMedia$134(this.f17410c, this.d, this.f17411e, this.f17412f, this.h, this.f17413n, this.f17414r, this.f17415s, this.v);
                return;
            default:
                this.f17409b.lambda$processLoadedMedia$133(this.f17410c, this.d, this.f17411e, this.f17412f, this.h, this.f17413n, this.f17414r, this.f17415s, this.v);
                return;
        }
    }
}
