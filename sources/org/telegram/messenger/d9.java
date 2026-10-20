package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d9 implements Runnable {
    public final int f18166a;
    public final MediaDataController f18167b;
    public final TLRPC.messages_Messages f18168c;
    public final int d;
    public final long e;
    public final ArrayList f18169f;
    public final int h;
    public final int f18170n;
    public final boolean f18171r;
    public final int f18172s;
    public final int v;

    public d9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f18166a = i15;
        this.f18167b = mediaDataController;
        this.f18168c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f18169f = arrayList;
        this.h = i11;
        this.f18170n = i12;
        this.f18171r = z10;
        this.f18172s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18166a) {
            case 0:
                this.f18167b.lambda$processLoadedMedia$134(this.f18168c, this.d, this.e, this.f18169f, this.h, this.f18170n, this.f18171r, this.f18172s, this.v);
                return;
            default:
                this.f18167b.lambda$processLoadedMedia$133(this.f18168c, this.d, this.e, this.f18169f, this.h, this.f18170n, this.f18171r, this.f18172s, this.v);
                return;
        }
    }
}
