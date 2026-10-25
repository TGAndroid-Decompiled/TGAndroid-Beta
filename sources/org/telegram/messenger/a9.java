package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a9 implements Runnable {
    public final int f19602a = 0;
    public final int f19603b;
    public final long f19604c;
    public final long d;
    public final int e;
    public final int f19605f;
    public final boolean h;
    public final BaseController f19606n;
    public final Object f19607r;

    public a9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19606n = mediaDataController;
        this.f19603b = i10;
        this.f19607r = arrayList;
        this.h = z10;
        this.f19604c = j10;
        this.e = i11;
        this.f19605f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19602a) {
            case 0:
                int i10 = this.f19605f;
                long j10 = this.d;
                ((MediaDataController) this.f19606n).lambda$putMediaDatabase$140(this.f19603b, (ArrayList) this.f19607r, this.h, this.f19604c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f19605f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19606n).lambda$putMessages$241(this.f19603b, (TLRPC.messages_Messages) this.f19607r, this.f19604c, this.d, this.e, i11, z10);
                return;
        }
    }

    public a9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19606n = messagesStorage;
        this.f19603b = i10;
        this.f19607r = messages_messages;
        this.f19604c = j10;
        this.d = j11;
        this.e = i11;
        this.f19605f = i12;
        this.h = z10;
    }
}
