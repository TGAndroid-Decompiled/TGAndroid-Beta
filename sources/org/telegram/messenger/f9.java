package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f18348a;
    public final MediaDataController f18349b;
    public final TLRPC.messages_Messages f18350c;
    public final int d;
    public final long e;
    public final ArrayList f18351f;
    public final int h;
    public final int f18352n;
    public final boolean f18353r;
    public final int f18354s;
    public final int v;

    public f9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18348a = i15;
        this.f18349b = mediaDataController;
        this.f18350c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18351f = arrayList;
        this.h = i11;
        this.f18352n = i12;
        this.f18353r = z10;
        this.f18354s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                this.f18349b.lambda$processLoadedMedia$134(this.f18350c, this.d, this.e, this.f18351f, this.h, this.f18352n, this.f18353r, this.f18354s, this.v);
                return;
            default:
                this.f18349b.lambda$processLoadedMedia$133(this.f18350c, this.d, this.e, this.f18351f, this.h, this.f18352n, this.f18353r, this.f18354s, this.v);
                return;
        }
    }
}
