package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f16896a;
    public final MediaDataController f16897b;
    public final TLRPC.messages_Messages f16898c;
    public final int d;
    public final long e;
    public final ArrayList f16899f;
    public final int h;
    public final int f16900n;
    public final boolean f16901r;
    public final int f16902s;
    public final int v;

    public c7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z4, int i13, int i14, int i15) {
        this.f16896a = i15;
        this.f16897b = mediaDataController;
        this.f16898c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f16899f = arrayList;
        this.h = i11;
        this.f16900n = i12;
        this.f16901r = z4;
        this.f16902s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f16896a) {
            case 0:
                this.f16897b.lambda$processLoadedMedia$133(this.f16898c, this.d, this.e, this.f16899f, this.h, this.f16900n, this.f16901r, this.f16902s, this.v);
                return;
            default:
                this.f16897b.lambda$processLoadedMedia$134(this.f16898c, this.d, this.e, this.f16899f, this.h, this.f16900n, this.f16901r, this.f16902s, this.v);
                return;
        }
    }
}
