package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f19593a = 0;
    public final int f19594b;
    public final long f19595c;
    public final long d;
    public final int f19596e;
    public final int f19597f;
    public final boolean h;
    public final BaseController f19598n;
    public final Object f19599r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19598n = mediaDataController;
        this.f19594b = i10;
        this.f19599r = arrayList;
        this.h = z10;
        this.f19595c = j3;
        this.f19596e = i11;
        this.f19597f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19593a) {
            case 0:
                int i10 = this.f19597f;
                long j3 = this.d;
                ((MediaDataController) this.f19598n).lambda$putMediaDatabase$140(this.f19594b, (ArrayList) this.f19599r, this.h, this.f19595c, this.f19596e, i10, j3);
                return;
            default:
                int i11 = this.f19597f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19598n).lambda$putMessages$238(this.f19594b, (TLRPC.messages_Messages) this.f19599r, this.f19595c, this.d, this.f19596e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19598n = messagesStorage;
        this.f19594b = i10;
        this.f19599r = messages_messages;
        this.f19595c = j3;
        this.d = j10;
        this.f19596e = i11;
        this.f19597f = i12;
        this.h = z10;
    }
}
