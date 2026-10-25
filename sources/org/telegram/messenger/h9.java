package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Runnable {
    public final int f20238a;
    public final MediaDataController f20239b;
    public final TLRPC.messages_Messages f20240c;
    public final int d;
    public final long e;
    public final ArrayList f20241f;
    public final int h;
    public final int f20242n;
    public final boolean f20243r;
    public final int f20244s;
    public final int v;

    public h9(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f20238a = i15;
        this.f20239b = mediaDataController;
        this.f20240c = messages_messages;
        this.d = i10;
        this.e = j10;
        this.f20241f = arrayList;
        this.h = i11;
        this.f20242n = i12;
        this.f20243r = z10;
        this.f20244s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f20238a) {
            case 0:
                this.f20239b.lambda$processLoadedMedia$134(this.f20240c, this.d, this.e, this.f20241f, this.h, this.f20242n, this.f20243r, this.f20244s, this.v);
                return;
            default:
                this.f20239b.lambda$processLoadedMedia$133(this.f20240c, this.d, this.e, this.f20241f, this.h, this.f20242n, this.f20243r, this.f20244s, this.v);
                return;
        }
    }
}
