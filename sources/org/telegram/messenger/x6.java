package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f19599a;
    public final MediaDataController f19600b;
    public final TLRPC.messages_Messages f19601c;
    public final int d;
    public final long f19602e;
    public final ArrayList f19603f;
    public final int h;
    public final int f19604n;
    public final boolean f19605r;
    public final int f19606s;
    public final int v;

    public x6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f19599a = i15;
        this.f19600b = mediaDataController;
        this.f19601c = messages_messages;
        this.d = i10;
        this.f19602e = j3;
        this.f19603f = arrayList;
        this.h = i11;
        this.f19604n = i12;
        this.f19605r = z10;
        this.f19606s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                this.f19600b.lambda$processLoadedMedia$133(this.f19601c, this.d, this.f19602e, this.f19603f, this.h, this.f19604n, this.f19605r, this.f19606s, this.v);
                return;
            default:
                this.f19600b.lambda$processLoadedMedia$134(this.f19601c, this.d, this.f19602e, this.f19603f, this.h, this.f19604n, this.f19605r, this.f19606s, this.v);
                return;
        }
    }
}
