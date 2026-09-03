package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f16817a = 0;
    public final int f16818b;
    public final long f16819c;
    public final long d;
    public final int e;
    public final int f16820f;
    public final boolean h;
    public final BaseController f16821n;
    public final Object f16822r;

    public b9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z4, long j10, int i11, int i12, long j11) {
        this.f16821n = mediaDataController;
        this.f16818b = i10;
        this.f16822r = arrayList;
        this.h = z4;
        this.f16819c = j10;
        this.e = i11;
        this.f16820f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f16817a) {
            case 0:
                int i10 = this.f16820f;
                long j10 = this.d;
                ((MediaDataController) this.f16821n).lambda$putMediaDatabase$140(this.f16818b, (ArrayList) this.f16822r, this.h, this.f16819c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f16820f;
                boolean z4 = this.h;
                ((MessagesStorage) this.f16821n).lambda$putMessages$238(this.f16818b, (TLRPC.messages_Messages) this.f16822r, this.f16819c, this.d, this.e, i11, z4);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z4) {
        this.f16821n = messagesStorage;
        this.f16818b = i10;
        this.f16822r = messages_messages;
        this.f16819c = j10;
        this.d = j11;
        this.e = i11;
        this.f16820f = i12;
        this.h = z4;
    }
}
