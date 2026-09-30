package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f15987a;
    public final MediaDataController f15988b;
    public final TLRPC.messages_Messages f15989c;
    public final int d;
    public final long e;
    public final ArrayList f15990f;
    public final int h;
    public final int f15991n;
    public final boolean f15992r;
    public final int f15993s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f15987a = i15;
        this.f15988b = mediaDataController;
        this.f15989c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f15990f = arrayList;
        this.h = i11;
        this.f15991n = i12;
        this.f15992r = z10;
        this.f15993s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f15987a) {
            case 0:
                this.f15988b.lambda$processLoadedMedia$134(this.f15989c, this.d, this.e, this.f15990f, this.h, this.f15991n, this.f15992r, this.f15993s, this.v);
                return;
            default:
                this.f15988b.lambda$processLoadedMedia$133(this.f15989c, this.d, this.e, this.f15990f, this.h, this.f15991n, this.f15992r, this.f15993s, this.v);
                return;
        }
    }
}
