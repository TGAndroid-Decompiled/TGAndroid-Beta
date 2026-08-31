package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f18330a;
    public final MediaDataController f18331b;
    public final TLRPC.messages_Messages f18332c;
    public final int d;
    public final long f18333e;
    public final ArrayList f18334f;
    public final int h;
    public final int f18335n;
    public final boolean f18336r;
    public final int f18337s;
    public final int v;

    public c7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z4, int i13, int i14, int i15) {
        this.f18330a = i15;
        this.f18331b = mediaDataController;
        this.f18332c = messages_messages;
        this.d = i10;
        this.f18333e = j10;
        this.f18334f = arrayList;
        this.h = i11;
        this.f18335n = i12;
        this.f18336r = z4;
        this.f18337s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f18330a) {
            case 0:
                this.f18331b.lambda$processLoadedMedia$133(this.f18332c, this.d, this.f18333e, this.f18334f, this.h, this.f18335n, this.f18336r, this.f18337s, this.v);
                return;
            default:
                this.f18331b.lambda$processLoadedMedia$134(this.f18332c, this.d, this.f18333e, this.f18334f, this.h, this.f18335n, this.f18336r, this.f18337s, this.v);
                return;
        }
    }
}
