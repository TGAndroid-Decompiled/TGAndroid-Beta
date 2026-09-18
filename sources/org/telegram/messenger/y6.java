package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f17952a;
    public final MediaDataController f17953b;
    public final TLRPC.messages_Messages f17954c;
    public final int d;
    public final long e;
    public final ArrayList f17955f;
    public final int h;
    public final int f17956n;
    public final boolean f17957r;
    public final int f17958s;
    public final int v;

    public y6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17952a = i15;
        this.f17953b = mediaDataController;
        this.f17954c = messages_messages;
        this.d = i10;
        this.e = j3;
        this.f17955f = arrayList;
        this.h = i11;
        this.f17956n = i12;
        this.f17957r = z10;
        this.f17958s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                this.f17953b.lambda$processLoadedMedia$133(this.f17954c, this.d, this.e, this.f17955f, this.h, this.f17956n, this.f17957r, this.f17958s, this.v);
                return;
            default:
                this.f17953b.lambda$processLoadedMedia$134(this.f17954c, this.d, this.e, this.f17955f, this.h, this.f17956n, this.f17957r, this.f17958s, this.v);
                return;
        }
    }
}
