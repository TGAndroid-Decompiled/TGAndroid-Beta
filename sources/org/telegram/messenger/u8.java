package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19638a = 0;
    public final int f19639b;
    public final long f19640c;
    public final long d;
    public final int e;
    public final int f19641f;
    public final boolean h;
    public final BaseController f19642n;
    public final Object f19643r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19642n = mediaDataController;
        this.f19639b = i10;
        this.f19643r = arrayList;
        this.h = z10;
        this.f19640c = j10;
        this.e = i11;
        this.f19641f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19638a) {
            case 0:
                int i10 = this.f19641f;
                long j10 = this.d;
                ((MediaDataController) this.f19642n).lambda$putMediaDatabase$140(this.f19639b, (ArrayList) this.f19643r, this.h, this.f19640c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f19641f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19642n).lambda$putMessages$238(this.f19639b, (TLRPC.messages_Messages) this.f19643r, this.f19640c, this.d, this.e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19642n = messagesStorage;
        this.f19639b = i10;
        this.f19643r = messages_messages;
        this.f19640c = j10;
        this.d = j11;
        this.e = i11;
        this.f19641f = i12;
        this.h = z10;
    }
}
