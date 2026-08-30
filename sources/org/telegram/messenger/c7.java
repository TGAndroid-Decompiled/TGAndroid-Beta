package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f16911a;
    public final MediaDataController f16912b;
    public final TLRPC.messages_Messages f16913c;
    public final int d;
    public final long e;
    public final ArrayList f16914f;
    public final int h;
    public final int f16915n;
    public final boolean f16916r;
    public final int f16917s;
    public final int v;

    public c7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z4, int i13, int i14, int i15) {
        this.f16911a = i15;
        this.f16912b = mediaDataController;
        this.f16913c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f16914f = arrayList;
        this.h = i11;
        this.f16915n = i12;
        this.f16916r = z4;
        this.f16917s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f16911a) {
            case 0:
                this.f16912b.lambda$processLoadedMedia$133(this.f16913c, this.d, this.e, this.f16914f, this.h, this.f16915n, this.f16916r, this.f16917s, this.v);
                return;
            default:
                this.f16912b.lambda$processLoadedMedia$134(this.f16913c, this.d, this.e, this.f16914f, this.h, this.f16915n, this.f16916r, this.f16917s, this.v);
                return;
        }
    }
}
