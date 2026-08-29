package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f19685a = 0;
    public final int f19686b;
    public final long f19687c;
    public final long d;
    public final int f19688e;
    public final int f19689f;
    public final boolean h;
    public final BaseController f19690n;
    public final Object f19691r;

    public a9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19690n = mediaDataController;
        this.f19686b = i10;
        this.f19691r = arrayList;
        this.h = z10;
        this.f19687c = j10;
        this.f19688e = i11;
        this.f19689f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19685a) {
            case 0:
                int i10 = this.f19689f;
                long j10 = this.d;
                ((MediaDataController) this.f19690n).lambda$putMediaDatabase$140(this.f19686b, (ArrayList) this.f19691r, this.h, this.f19687c, this.f19688e, i10, j10);
                return;
            default:
                int i11 = this.f19689f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19690n).lambda$putMessages$238(this.f19686b, (TLRPC.messages_Messages) this.f19691r, this.f19687c, this.d, this.f19688e, i11, z10);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19690n = messagesStorage;
        this.f19686b = i10;
        this.f19691r = messages_messages;
        this.f19687c = j10;
        this.d = j11;
        this.f19688e = i11;
        this.f19689f = i12;
        this.h = z10;
    }
}
