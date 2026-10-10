package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17414a;
    public final MediaDataController f17415b;
    public final TLRPC.messages_Messages f17416c;
    public final int d;
    public final long f17417e;
    public final ArrayList f17418f;
    public final int h;
    public final int f17419n;
    public final boolean f17420r;
    public final int f17421s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17414a = i15;
        this.f17415b = mediaDataController;
        this.f17416c = messages_messages;
        this.d = i10;
        this.f17417e = j3;
        this.f17418f = arrayList;
        this.h = i11;
        this.f17419n = i12;
        this.f17420r = z10;
        this.f17421s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17414a) {
            case 0:
                this.f17415b.lambda$processLoadedMedia$134(this.f17416c, this.d, this.f17417e, this.f17418f, this.h, this.f17419n, this.f17420r, this.f17421s, this.v);
                return;
            default:
                this.f17415b.lambda$processLoadedMedia$133(this.f17416c, this.d, this.f17417e, this.f17418f, this.h, this.f17419n, this.f17420r, this.f17421s, this.v);
                return;
        }
    }
}
