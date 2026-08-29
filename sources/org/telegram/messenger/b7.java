package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f19778a;
    public final MediaDataController f19779b;
    public final TLRPC.messages_Messages f19780c;
    public final int d;
    public final long f19781e;
    public final ArrayList f19782f;
    public final int h;
    public final int f19783n;
    public final boolean f19784r;
    public final int f19785s;
    public final int v;

    public b7(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f19778a = i15;
        this.f19779b = mediaDataController;
        this.f19780c = messages_messages;
        this.d = i10;
        this.f19781e = j10;
        this.f19782f = arrayList;
        this.h = i11;
        this.f19783n = i12;
        this.f19784r = z10;
        this.f19785s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f19778a) {
            case 0:
                this.f19779b.lambda$processLoadedMedia$133(this.f19780c, this.d, this.f19781e, this.f19782f, this.h, this.f19783n, this.f19784r, this.f19785s, this.v);
                return;
            default:
                this.f19779b.lambda$processLoadedMedia$134(this.f19780c, this.d, this.f19781e, this.f19782f, this.h, this.f19783n, this.f19784r, this.f19785s, this.v);
                return;
        }
    }
}
