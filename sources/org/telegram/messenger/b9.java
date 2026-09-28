package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f15971a;
    public final MediaDataController f15972b;
    public final TLRPC.messages_Messages f15973c;
    public final int d;
    public final long e;
    public final ArrayList f15974f;
    public final int h;
    public final int f15975n;
    public final boolean f15976r;
    public final int f15977s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f15971a = i15;
        this.f15972b = mediaDataController;
        this.f15973c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f15974f = arrayList;
        this.h = i11;
        this.f15975n = i12;
        this.f15976r = z10;
        this.f15977s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f15971a) {
            case 0:
                this.f15972b.lambda$processLoadedMedia$134(this.f15973c, this.d, this.e, this.f15974f, this.h, this.f15975n, this.f15976r, this.f15977s, this.v);
                return;
            default:
                this.f15972b.lambda$processLoadedMedia$133(this.f15973c, this.d, this.e, this.f15974f, this.h, this.f15975n, this.f15976r, this.f15977s, this.v);
                return;
        }
    }
}
