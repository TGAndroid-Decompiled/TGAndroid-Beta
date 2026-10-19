package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c9 implements Runnable {
    public final int f18029a;
    public final MediaDataController f18030b;
    public final TLRPC.messages_Messages f18031c;
    public final int d;
    public final long e;
    public final ArrayList f18032f;
    public final int h;
    public final int f18033n;
    public final boolean f18034r;
    public final int f18035s;
    public final int v;

    public c9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18029a = i15;
        this.f18030b = mediaDataController;
        this.f18031c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18032f = arrayList;
        this.h = i11;
        this.f18033n = i12;
        this.f18034r = z10;
        this.f18035s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18029a) {
            case 0:
                this.f18030b.lambda$processLoadedMedia$134(this.f18031c, this.d, this.e, this.f18032f, this.h, this.f18033n, this.f18034r, this.f18035s, this.v);
                return;
            default:
                this.f18030b.lambda$processLoadedMedia$133(this.f18031c, this.d, this.e, this.f18032f, this.h, this.f18033n, this.f18034r, this.f18035s, this.v);
                return;
        }
    }
}
