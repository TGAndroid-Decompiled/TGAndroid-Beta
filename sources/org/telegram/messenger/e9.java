package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f17491a;
    public final MediaDataController f17492b;
    public final TLRPC.messages_Messages f17493c;
    public final int d;
    public final long f17494e;
    public final ArrayList f17495f;
    public final int h;
    public final int f17496n;
    public final boolean f17497r;
    public final int f17498s;
    public final int v;

    public e9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j3, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f17491a = i15;
        this.f17492b = mediaDataController;
        this.f17493c = messages_messages;
        this.d = i10;
        this.f17494e = j3;
        this.f17495f = arrayList;
        this.h = i11;
        this.f17496n = i12;
        this.f17497r = z10;
        this.f17498s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f17491a) {
            case 0:
                this.f17492b.lambda$processLoadedMedia$134(this.f17493c, this.d, this.f17494e, this.f17495f, this.h, this.f17496n, this.f17497r, this.f17498s, this.v);
                return;
            default:
                this.f17492b.lambda$processLoadedMedia$133(this.f17493c, this.d, this.f17494e, this.f17495f, this.h, this.f17496n, this.f17497r, this.f17498s, this.v);
                return;
        }
    }
}
