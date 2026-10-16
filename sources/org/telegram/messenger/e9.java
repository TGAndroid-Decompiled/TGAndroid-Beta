package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f16846a;
    public final MediaDataController f16847b;
    public final TLRPC.messages_Messages f16848c;
    public final int d;
    public final long e;
    public final ArrayList f16849f;
    public final int h;
    public final int f16850n;
    public final boolean f16851r;
    public final int f16852s;
    public final int v;

    public e9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f16846a = i15;
        this.f16847b = mediaDataController;
        this.f16848c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f16849f = arrayList;
        this.h = i11;
        this.f16850n = i12;
        this.f16851r = z10;
        this.f16852s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f16846a) {
            case 0:
                this.f16847b.lambda$processLoadedMedia$134(this.f16848c, this.d, this.e, this.f16849f, this.h, this.f16850n, this.f16851r, this.f16852s, this.v);
                return;
            default:
                this.f16847b.lambda$processLoadedMedia$133(this.f16848c, this.d, this.e, this.f16849f, this.h, this.f16850n, this.f16851r, this.f16852s, this.v);
                return;
        }
    }
}
