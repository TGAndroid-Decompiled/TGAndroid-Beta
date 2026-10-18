package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c9 implements Runnable {
    public final int f18026a;
    public final MediaDataController f18027b;
    public final TLRPC.messages_Messages f18028c;
    public final int d;
    public final long e;
    public final ArrayList f18029f;
    public final int h;
    public final int f18030n;
    public final boolean f18031r;
    public final int f18032s;
    public final int v;

    public c9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18026a = i15;
        this.f18027b = mediaDataController;
        this.f18028c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18029f = arrayList;
        this.h = i11;
        this.f18030n = i12;
        this.f18031r = z10;
        this.f18032s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18026a) {
            case 0:
                this.f18027b.lambda$processLoadedMedia$134(this.f18028c, this.d, this.e, this.f18029f, this.h, this.f18030n, this.f18031r, this.f18032s, this.v);
                return;
            default:
                this.f18027b.lambda$processLoadedMedia$133(this.f18028c, this.d, this.e, this.f18029f, this.h, this.f18030n, this.f18031r, this.f18032s, this.v);
                return;
        }
    }
}
