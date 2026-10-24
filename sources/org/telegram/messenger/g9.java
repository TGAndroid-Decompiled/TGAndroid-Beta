package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g9 implements Runnable {
    public final int f18483a;
    public final MediaDataController f18484b;
    public final TLRPC.messages_Messages f18485c;
    public final int d;
    public final long e;
    public final ArrayList f18486f;
    public final int h;
    public final int f18487n;
    public final boolean f18488r;
    public final int f18489s;
    public final int v;

    public g9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18483a = i15;
        this.f18484b = mediaDataController;
        this.f18485c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18486f = arrayList;
        this.h = i11;
        this.f18487n = i12;
        this.f18488r = z10;
        this.f18489s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18483a) {
            case 0:
                this.f18484b.lambda$processLoadedMedia$134(this.f18485c, this.d, this.e, this.f18486f, this.h, this.f18487n, this.f18488r, this.f18489s, this.v);
                return;
            default:
                this.f18484b.lambda$processLoadedMedia$133(this.f18485c, this.d, this.e, this.f18486f, this.h, this.f18487n, this.f18488r, this.f18489s, this.v);
                return;
        }
    }
}
