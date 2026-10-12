package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f18995a = 0;
    public final int f18996b;
    public final long f18997c;
    public final long d;
    public final int e;
    public final int f18998f;
    public final boolean h;
    public final BaseController f18999n;
    public final Object f19000r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f18999n = mediaDataController;
        this.f18996b = i10;
        this.f19000r = arrayList;
        this.h = z10;
        this.f18997c = j10;
        this.e = i11;
        this.f18998f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18995a) {
            case 0:
                int i10 = this.f18998f;
                long j10 = this.d;
                ((MediaDataController) this.f18999n).lambda$putMediaDatabase$140(this.f18996b, (ArrayList) this.f19000r, this.h, this.f18997c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f18998f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f18999n).lambda$putMessages$238(this.f18996b, (TLRPC.messages_Messages) this.f19000r, this.f18997c, this.d, this.e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f18999n = messagesStorage;
        this.f18996b = i10;
        this.f19000r = messages_messages;
        this.f18997c = j10;
        this.d = j11;
        this.e = i11;
        this.f18998f = i12;
        this.h = z10;
    }
}
