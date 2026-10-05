package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f17418a;
    public final MediaDataController f17419b;
    public final TLRPC.messages_Messages f17420c;
    public final int d;
    public final long f17421e;
    public final ArrayList f17422f;
    public final int h;
    public final int f17423n;
    public final boolean f17424r;
    public final int f17425s;
    public final int v;

    public b9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17418a = i15;
        this.f17419b = mediaDataController;
        this.f17420c = messages_messages;
        this.d = i10;
        this.f17421e = j3;
        this.f17422f = arrayList;
        this.h = i11;
        this.f17423n = i12;
        this.f17424r = z10;
        this.f17425s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17418a) {
            case 0:
                this.f17419b.lambda$processLoadedMedia$134(this.f17420c, this.d, this.f17421e, this.f17422f, this.h, this.f17423n, this.f17424r, this.f17425s, this.v);
                return;
            default:
                this.f17419b.lambda$processLoadedMedia$133(this.f17420c, this.d, this.f17421e, this.f17422f, this.h, this.f17423n, this.f17424r, this.f17425s, this.v);
                return;
        }
    }
}
