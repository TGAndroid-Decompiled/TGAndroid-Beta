package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f19552a = 0;
    public final int f19553b;
    public final long f19554c;
    public final long d;
    public final int f19555e;
    public final int f19556f;
    public final boolean h;
    public final BaseController f19557n;
    public final Object f19558r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19557n = mediaDataController;
        this.f19553b = i10;
        this.f19558r = arrayList;
        this.h = z10;
        this.f19554c = j3;
        this.f19555e = i11;
        this.f19556f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19552a) {
            case 0:
                int i10 = this.f19556f;
                long j3 = this.d;
                ((MediaDataController) this.f19557n).lambda$putMediaDatabase$140(this.f19553b, (ArrayList) this.f19558r, this.h, this.f19554c, this.f19555e, i10, j3);
                return;
            default:
                int i11 = this.f19556f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19557n).lambda$putMessages$238(this.f19553b, (TLRPC.messages_Messages) this.f19558r, this.f19554c, this.d, this.f19555e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19557n = messagesStorage;
        this.f19553b = i10;
        this.f19558r = messages_messages;
        this.f19554c = j3;
        this.d = j10;
        this.f19555e = i11;
        this.f19556f = i12;
        this.h = z10;
    }
}
