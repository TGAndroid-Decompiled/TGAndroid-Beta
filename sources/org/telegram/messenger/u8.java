package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f17678a = 0;
    public final int f17679b;
    public final long f17680c;
    public final long d;
    public final int e;
    public final int f17681f;
    public final boolean h;
    public final BaseController f17682n;
    public final Object f17683r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f17682n = mediaDataController;
        this.f17679b = i10;
        this.f17683r = arrayList;
        this.h = z10;
        this.f17680c = j3;
        this.e = i11;
        this.f17681f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17678a) {
            case 0:
                int i10 = this.f17681f;
                long j3 = this.d;
                ((MediaDataController) this.f17682n).lambda$putMediaDatabase$140(this.f17679b, (ArrayList) this.f17683r, this.h, this.f17680c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f17681f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f17682n).lambda$putMessages$238(this.f17679b, (TLRPC.messages_Messages) this.f17683r, this.f17680c, this.d, this.e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f17682n = messagesStorage;
        this.f17679b = i10;
        this.f17683r = messages_messages;
        this.f17680c = j3;
        this.d = j10;
        this.e = i11;
        this.f17681f = i12;
        this.h = z10;
    }
}
