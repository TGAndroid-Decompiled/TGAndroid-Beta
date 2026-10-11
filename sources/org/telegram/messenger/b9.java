package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17443a;
    public final MediaDataController f17444b;
    public final TLRPC.messages_Messages f17445c;
    public final int d;
    public final long f17446e;
    public final ArrayList f17447f;
    public final int h;
    public final int f17448n;
    public final boolean f17449r;
    public final int f17450s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17443a = i15;
        this.f17444b = mediaDataController;
        this.f17445c = messages_messages;
        this.d = i10;
        this.f17446e = j3;
        this.f17447f = arrayList;
        this.h = i11;
        this.f17448n = i12;
        this.f17449r = z10;
        this.f17450s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17443a) {
            case 0:
                this.f17444b.lambda$processLoadedMedia$134(this.f17445c, this.d, this.f17446e, this.f17447f, this.h, this.f17448n, this.f17449r, this.f17450s, this.v);
                return;
            default:
                this.f17444b.lambda$processLoadedMedia$133(this.f17445c, this.d, this.f17446e, this.f17447f, this.h, this.f17448n, this.f17449r, this.f17450s, this.v);
                return;
        }
    }
}
