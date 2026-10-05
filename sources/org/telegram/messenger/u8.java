package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19321a = 0;
    public final int f19322b;
    public final long f19323c;
    public final long d;
    public final int f19324e;
    public final int f19325f;
    public final boolean h;
    public final BaseController f19326n;
    public final Object f19327r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19326n = mediaDataController;
        this.f19322b = i10;
        this.f19327r = arrayList;
        this.h = z10;
        this.f19323c = j3;
        this.f19324e = i11;
        this.f19325f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19321a) {
            case 0:
                int i10 = this.f19325f;
                long j3 = this.d;
                ((MediaDataController) this.f19326n).lambda$putMediaDatabase$140(this.f19322b, (ArrayList) this.f19327r, this.h, this.f19323c, this.f19324e, i10, j3);
                return;
            default:
                int i11 = this.f19325f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19326n).lambda$putMessages$238(this.f19322b, (TLRPC.messages_Messages) this.f19327r, this.f19323c, this.d, this.f19324e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19326n = messagesStorage;
        this.f19322b = i10;
        this.f19327r = messages_messages;
        this.f19323c = j3;
        this.d = j10;
        this.f19324e = i11;
        this.f19325f = i12;
        this.h = z10;
    }
}
