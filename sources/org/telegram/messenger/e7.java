package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e7 implements Runnable {
    public final int f15057a;
    public final MediaDataController f15058b;
    public final TLRPC.messages_Messages f15059c;
    public final int d;
    public final long e;
    public final ArrayList f15060f;
    public final int h;
    public final int f15061n;
    public final boolean f15062r;
    public final int f15063s;
    public final int v;

    public e7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f15057a = i15;
        this.f15058b = mediaDataController;
        this.f15059c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f15060f = arrayList;
        this.h = i11;
        this.f15061n = i12;
        this.f15062r = z10;
        this.f15063s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f15057a) {
            case 0:
                this.f15058b.lambda$processLoadedMedia$133(this.f15059c, this.d, this.e, this.f15060f, this.h, this.f15061n, this.f15062r, this.f15063s, this.v);
                return;
            default:
                this.f15058b.lambda$processLoadedMedia$134(this.f15059c, this.d, this.e, this.f15060f, this.h, this.f15061n, this.f15062r, this.f15063s, this.v);
                return;
        }
    }
}
