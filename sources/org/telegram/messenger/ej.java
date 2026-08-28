package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f20211a;
    public final SendMessagesHelper f20212b;
    public final ArrayList f20213c;
    public final int d;
    public final int f20214e;
    public final TLRPC.Message f20215f;
    public final int h;
    public final TLRPC.Message f20216n;
    public final MessageObject f20217r;
    public final int f20218s;

    public ej(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i9, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, MessageObject messageObject, int i12, int i13) {
        this.f20211a = i13;
        this.f20212b = sendMessagesHelper;
        this.f20213c = arrayList;
        this.d = i9;
        this.f20214e = i10;
        this.f20215f = message;
        this.h = i11;
        this.f20216n = message2;
        this.f20217r = messageObject;
        this.f20218s = i12;
    }

    @Override
    public final void run() {
        switch (this.f20211a) {
            case 0:
                this.f20212b.lambda$sendMessage$9(this.f20213c, this.d, this.f20214e, this.f20215f, this.h, this.f20216n, this.f20217r, this.f20218s);
                return;
            default:
                this.f20212b.lambda$sendMessage$10(this.f20213c, this.d, this.f20214e, this.f20215f, this.h, this.f20216n, this.f20217r, this.f20218s);
                return;
        }
    }
}
