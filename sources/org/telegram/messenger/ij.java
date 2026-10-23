package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f18716a;
    public final SendMessagesHelper f18717b;
    public final ArrayList f18718c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18719f;
    public final int h;
    public final TLRPC.Message f18720n;
    public final MessageObject f18721r;
    public final int f18722s;

    public ij(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18716a = i14;
        this.f18717b = sendMessagesHelper;
        this.f18718c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18719f = message;
        this.h = i12;
        this.f18720n = message2;
        this.f18721r = messageObject;
        this.f18722s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18716a) {
            case 0:
                this.f18717b.lambda$sendMessage$12(this.f18718c, this.d, this.e, this.f18719f, this.h, this.f18720n, this.f18721r, this.f18722s);
                return;
            default:
                this.f18717b.lambda$sendMessage$13(this.f18718c, this.d, this.e, this.f18719f, this.h, this.f18720n, this.f18721r, this.f18722s);
                return;
        }
    }
}
