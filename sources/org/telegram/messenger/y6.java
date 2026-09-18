package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18120a;
    public final MediaDataController f18121b;
    public final TLRPC.messages_Messages f18122c;
    public final int d;
    public final long e;
    public final ArrayList f18123f;
    public final int h;
    public final int f18124n;
    public final boolean f18125r;
    public final int f18126s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18120a = i15;
        this.f18121b = mediaDataController;
        this.f18122c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f18123f = arrayList;
        this.h = i11;
        this.f18124n = i12;
        this.f18125r = z10;
        this.f18126s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18120a) {
            case 0:
                this.f18121b.lambda$processLoadedMedia$133(this.f18122c, this.d, this.e, this.f18123f, this.h, this.f18124n, this.f18125r, this.f18126s, this.v);
                return;
            default:
                this.f18121b.lambda$processLoadedMedia$134(this.f18122c, this.d, this.e, this.f18123f, this.h, this.f18124n, this.f18125r, this.f18126s, this.v);
                return;
        }
    }
}
