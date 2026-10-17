package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19637a = 0;
    public final int f19638b;
    public final long f19639c;
    public final long d;
    public final int e;
    public final int f19640f;
    public final boolean h;
    public final BaseController f19641n;
    public final Object f19642r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19641n = mediaDataController;
        this.f19638b = i10;
        this.f19642r = arrayList;
        this.h = z10;
        this.f19639c = j10;
        this.e = i11;
        this.f19640f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19637a) {
            case 0:
                int i10 = this.f19640f;
                long j10 = this.d;
                ((MediaDataController) this.f19641n).lambda$putMediaDatabase$140(this.f19638b, (ArrayList) this.f19642r, this.h, this.f19639c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f19640f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19641n).lambda$putMessages$238(this.f19638b, (TLRPC.messages_Messages) this.f19642r, this.f19639c, this.d, this.e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19641n = messagesStorage;
        this.f19638b = i10;
        this.f19642r = messages_messages;
        this.f19639c = j10;
        this.d = j11;
        this.e = i11;
        this.f19640f = i12;
        this.h = z10;
    }
}
