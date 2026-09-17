package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19518a = 0;
    public final int f19519b;
    public final long f19520c;
    public final long d;
    public final int f19521e;
    public final int f19522f;
    public final boolean h;
    public final BaseController f19523n;
    public final Object f19524r;

    public w8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19523n = mediaDataController;
        this.f19519b = i10;
        this.f19524r = arrayList;
        this.h = z10;
        this.f19520c = j3;
        this.f19521e = i11;
        this.f19522f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19518a) {
            case 0:
                int i10 = this.f19522f;
                long j3 = this.d;
                ((MediaDataController) this.f19523n).lambda$putMediaDatabase$140(this.f19519b, (ArrayList) this.f19524r, this.h, this.f19520c, this.f19521e, i10, j3);
                return;
            default:
                int i11 = this.f19522f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19523n).lambda$putMessages$238(this.f19519b, (TLRPC.messages_Messages) this.f19524r, this.f19520c, this.d, this.f19521e, i11, z10);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19523n = messagesStorage;
        this.f19519b = i10;
        this.f19524r = messages_messages;
        this.f19520c = j3;
        this.d = j10;
        this.f19521e = i11;
        this.f19522f = i12;
        this.h = z10;
    }
}
