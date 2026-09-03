package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f18332a;
    public final MediaDataController f18333b;
    public final TLRPC.messages_Messages f18334c;
    public final int d;
    public final long f18335e;
    public final ArrayList f18336f;
    public final int h;
    public final int f18337n;
    public final boolean f18338r;
    public final int f18339s;
    public final int v;

    public c7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z4, int i13, int i14, int i15) {
        this.f18332a = i15;
        this.f18333b = mediaDataController;
        this.f18334c = messages_messages;
        this.d = i10;
        this.f18335e = j10;
        this.f18336f = arrayList;
        this.h = i11;
        this.f18337n = i12;
        this.f18338r = z4;
        this.f18339s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18332a) {
            case 0:
                this.f18333b.lambda$processLoadedMedia$133(this.f18334c, this.d, this.f18335e, this.f18336f, this.h, this.f18337n, this.f18338r, this.f18339s, this.v);
                return;
            default:
                this.f18333b.lambda$processLoadedMedia$134(this.f18334c, this.d, this.f18335e, this.f18336f, this.h, this.f18337n, this.f18338r, this.f18339s, this.v);
                return;
        }
    }
}
