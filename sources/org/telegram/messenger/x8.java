package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f19553a = 0;
    public final int f19554b;
    public final long f19555c;
    public final long d;
    public final int f19556e;
    public final int f19557f;
    public final boolean h;
    public final BaseController f19558n;
    public final Object f19559r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19558n = mediaDataController;
        this.f19554b = i10;
        this.f19559r = arrayList;
        this.h = z10;
        this.f19555c = j3;
        this.f19556e = i11;
        this.f19557f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                int i10 = this.f19557f;
                long j3 = this.d;
                ((MediaDataController) this.f19558n).lambda$putMediaDatabase$140(this.f19554b, (ArrayList) this.f19559r, this.h, this.f19555c, this.f19556e, i10, j3);
                return;
            default:
                int i11 = this.f19557f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19558n).lambda$putMessages$238(this.f19554b, (TLRPC.messages_Messages) this.f19559r, this.f19555c, this.d, this.f19556e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19558n = messagesStorage;
        this.f19554b = i10;
        this.f19559r = messages_messages;
        this.f19555c = j3;
        this.d = j10;
        this.f19556e = i11;
        this.f19557f = i12;
        this.h = z10;
    }
}
