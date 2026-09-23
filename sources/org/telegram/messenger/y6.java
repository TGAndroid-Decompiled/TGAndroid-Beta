package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f17932a;
    public final MediaDataController f17933b;
    public final TLRPC.messages_Messages f17934c;
    public final int d;
    public final long e;
    public final ArrayList f17935f;
    public final int h;
    public final int f17936n;
    public final boolean f17937r;
    public final int f17938s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17932a = i15;
        this.f17933b = mediaDataController;
        this.f17934c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f17935f = arrayList;
        this.h = i11;
        this.f17936n = i12;
        this.f17937r = z10;
        this.f17938s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17932a) {
            case 0:
                this.f17933b.lambda$processLoadedMedia$133(this.f17934c, this.d, this.e, this.f17935f, this.h, this.f17936n, this.f17937r, this.f17938s, this.v);
                return;
            default:
                this.f17933b.lambda$processLoadedMedia$134(this.f17934c, this.d, this.e, this.f17935f, this.h, this.f17936n, this.f17937r, this.f17938s, this.v);
                return;
        }
    }
}
