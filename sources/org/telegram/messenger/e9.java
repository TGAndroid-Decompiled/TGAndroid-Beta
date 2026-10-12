package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f17492a;
    public final MediaDataController f17493b;
    public final TLRPC.messages_Messages f17494c;
    public final int d;
    public final long f17495e;
    public final ArrayList f17496f;
    public final int h;
    public final int f17497n;
    public final boolean f17498r;
    public final int f17499s;
    public final int v;

    public e9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17492a = i15;
        this.f17493b = mediaDataController;
        this.f17494c = messages_messages;
        this.d = i10;
        this.f17495e = j3;
        this.f17496f = arrayList;
        this.h = i11;
        this.f17497n = i12;
        this.f17498r = z10;
        this.f17499s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17492a) {
            case 0:
                this.f17493b.lambda$processLoadedMedia$134(this.f17494c, this.d, this.f17495e, this.f17496f, this.h, this.f17497n, this.f17498r, this.f17499s, this.v);
                return;
            default:
                this.f17493b.lambda$processLoadedMedia$133(this.f17494c, this.d, this.f17495e, this.f17496f, this.h, this.f17497n, this.f17498r, this.f17499s, this.v);
                return;
        }
    }
}
