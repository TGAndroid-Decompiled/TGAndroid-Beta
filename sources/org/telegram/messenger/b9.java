package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f19685a = 0;
    public final int f19686b;
    public final long f19687c;
    public final long d;
    public final int e;
    public final int f19688f;
    public final boolean h;
    public final BaseController f19689n;
    public final Object f19690r;

    public b9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19689n = mediaDataController;
        this.f19686b = i10;
        this.f19690r = arrayList;
        this.h = z10;
        this.f19687c = j10;
        this.e = i11;
        this.f19688f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19685a) {
            case 0:
                int i10 = this.f19688f;
                long j10 = this.d;
                ((MediaDataController) this.f19689n).lambda$putMediaDatabase$140(this.f19686b, (ArrayList) this.f19690r, this.h, this.f19687c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f19688f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19689n).lambda$putMessages$242(this.f19686b, (TLRPC.messages_Messages) this.f19690r, this.f19687c, this.d, this.e, i11, z10);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19689n = messagesStorage;
        this.f19686b = i10;
        this.f19690r = messages_messages;
        this.f19687c = j10;
        this.d = j11;
        this.e = i11;
        this.f19688f = i12;
        this.h = z10;
    }
}
