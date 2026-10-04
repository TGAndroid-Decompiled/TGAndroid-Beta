package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19309a = 0;
    public final int f19310b;
    public final long f19311c;
    public final long d;
    public final int f19312e;
    public final int f19313f;
    public final boolean h;
    public final BaseController f19314n;
    public final Object f19315r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19314n = mediaDataController;
        this.f19310b = i10;
        this.f19315r = arrayList;
        this.h = z10;
        this.f19311c = j3;
        this.f19312e = i11;
        this.f19313f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19309a) {
            case 0:
                int i10 = this.f19313f;
                long j3 = this.d;
                ((MediaDataController) this.f19314n).lambda$putMediaDatabase$140(this.f19310b, (ArrayList) this.f19315r, this.h, this.f19311c, this.f19312e, i10, j3);
                return;
            default:
                int i11 = this.f19313f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19314n).lambda$putMessages$238(this.f19310b, (TLRPC.messages_Messages) this.f19315r, this.f19311c, this.d, this.f19312e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19314n = messagesStorage;
        this.f19310b = i10;
        this.f19315r = messages_messages;
        this.f19311c = j3;
        this.d = j10;
        this.f19312e = i11;
        this.f19313f = i12;
        this.h = z10;
    }
}
