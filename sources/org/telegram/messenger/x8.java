package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f19566a = 0;
    public final int f19567b;
    public final long f19568c;
    public final long d;
    public final int f19569e;
    public final int f19570f;
    public final boolean h;
    public final BaseController f19571n;
    public final Object f19572r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19571n = mediaDataController;
        this.f19567b = i10;
        this.f19572r = arrayList;
        this.h = z10;
        this.f19568c = j3;
        this.f19569e = i11;
        this.f19570f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19566a) {
            case 0:
                int i10 = this.f19570f;
                long j3 = this.d;
                ((MediaDataController) this.f19571n).lambda$putMediaDatabase$140(this.f19567b, (ArrayList) this.f19572r, this.h, this.f19568c, this.f19569e, i10, j3);
                return;
            default:
                int i11 = this.f19570f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19571n).lambda$putMessages$238(this.f19567b, (TLRPC.messages_Messages) this.f19572r, this.f19568c, this.d, this.f19569e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19571n = messagesStorage;
        this.f19567b = i10;
        this.f19572r = messages_messages;
        this.f19568c = j3;
        this.d = j10;
        this.f19569e = i11;
        this.f19570f = i12;
        this.h = z10;
    }
}
