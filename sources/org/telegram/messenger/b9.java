package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f15970a;
    public final MediaDataController f15971b;
    public final TLRPC.messages_Messages f15972c;
    public final int d;
    public final long e;
    public final ArrayList f15973f;
    public final int h;
    public final int f15974n;
    public final boolean f15975r;
    public final int f15976s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f15970a = i15;
        this.f15971b = mediaDataController;
        this.f15972c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f15973f = arrayList;
        this.h = i11;
        this.f15974n = i12;
        this.f15975r = z10;
        this.f15976s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f15970a) {
            case 0:
                this.f15971b.lambda$processLoadedMedia$134(this.f15972c, this.d, this.e, this.f15973f, this.h, this.f15974n, this.f15975r, this.f15976s, this.v);
                return;
            default:
                this.f15971b.lambda$processLoadedMedia$133(this.f15972c, this.d, this.e, this.f15973f, this.h, this.f15974n, this.f15975r, this.f15976s, this.v);
                return;
        }
    }
}
