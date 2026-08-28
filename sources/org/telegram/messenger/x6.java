package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f22096a;
    public final MediaDataController f22097b;
    public final TLRPC.messages_Messages f22098c;
    public final int d;
    public final long f22099e;
    public final ArrayList f22100f;
    public final int h;
    public final int f22101n;
    public final boolean f22102r;
    public final int f22103s;
    public final int v;

    public x6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i9, long j10, ArrayList arrayList, int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f22096a = i14;
        this.f22097b = mediaDataController;
        this.f22098c = messages_messages;
        this.d = i9;
        this.f22099e = j10;
        this.f22100f = arrayList;
        this.h = i10;
        this.f22101n = i11;
        this.f22102r = z10;
        this.f22103s = i12;
        this.v = i13;
    }

    @Override
    public final void run() {
        switch (this.f22096a) {
            case 0:
                this.f22097b.lambda$processLoadedMedia$133(this.f22098c, this.d, this.f22099e, this.f22100f, this.h, this.f22101n, this.f22102r, this.f22103s, this.v);
                return;
            default:
                this.f22097b.lambda$processLoadedMedia$134(this.f22098c, this.d, this.f22099e, this.f22100f, this.h, this.f22101n, this.f22102r, this.f22103s, this.v);
                return;
        }
    }
}
