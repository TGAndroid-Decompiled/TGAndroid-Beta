package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final int f20318a;
    public final MediaDataController f20319b;
    public final TLRPC.messages_Messages f20320c;
    public final int d;
    public final long e;
    public final ArrayList f20321f;
    public final int h;
    public final int f20322n;
    public final boolean f20323r;
    public final int f20324s;
    public final int v;

    public i9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f20318a = i15;
        this.f20319b = mediaDataController;
        this.f20320c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f20321f = arrayList;
        this.h = i11;
        this.f20322n = i12;
        this.f20323r = z10;
        this.f20324s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f20318a) {
            case 0:
                this.f20319b.lambda$processLoadedMedia$134(this.f20320c, this.d, this.e, this.f20321f, this.h, this.f20322n, this.f20323r, this.f20324s, this.v);
                return;
            default:
                this.f20319b.lambda$processLoadedMedia$133(this.f20320c, this.d, this.e, this.f20321f, this.h, this.f20322n, this.f20323r, this.f20324s, this.v);
                return;
        }
    }
}
