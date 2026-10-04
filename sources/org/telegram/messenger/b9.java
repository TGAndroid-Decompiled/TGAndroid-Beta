package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17413a;
    public final MediaDataController f17414b;
    public final TLRPC.messages_Messages f17415c;
    public final int d;
    public final long f17416e;
    public final ArrayList f17417f;
    public final int h;
    public final int f17418n;
    public final boolean f17419r;
    public final int f17420s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17413a = i15;
        this.f17414b = mediaDataController;
        this.f17415c = messages_messages;
        this.d = i10;
        this.f17416e = j3;
        this.f17417f = arrayList;
        this.h = i11;
        this.f17418n = i12;
        this.f17419r = z10;
        this.f17420s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17413a) {
            case 0:
                this.f17414b.lambda$processLoadedMedia$134(this.f17415c, this.d, this.f17416e, this.f17417f, this.h, this.f17418n, this.f17419r, this.f17420s, this.v);
                return;
            default:
                this.f17414b.lambda$processLoadedMedia$133(this.f17415c, this.d, this.f17416e, this.f17417f, this.h, this.f17418n, this.f17419r, this.f17420s, this.v);
                return;
        }
    }
}
