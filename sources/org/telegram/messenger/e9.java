package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f17149a;
    public final MediaDataController f17150b;
    public final TLRPC.messages_Messages f17151c;
    public final int d;
    public final long e;
    public final ArrayList f17152f;
    public final int h;
    public final int f17153n;
    public final boolean f17154r;
    public final int f17155s;
    public final int v;

    public e9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17149a = i15;
        this.f17150b = mediaDataController;
        this.f17151c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f17152f = arrayList;
        this.h = i11;
        this.f17153n = i12;
        this.f17154r = z10;
        this.f17155s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17149a) {
            case 0:
                this.f17150b.lambda$processLoadedMedia$134(this.f17151c, this.d, this.e, this.f17152f, this.h, this.f17153n, this.f17154r, this.f17155s, this.v);
                return;
            default:
                this.f17150b.lambda$processLoadedMedia$133(this.f17151c, this.d, this.e, this.f17152f, this.h, this.f17153n, this.f17154r, this.f17155s, this.v);
                return;
        }
    }
}
