package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f18473a;
    public final SendMessagesHelper f18474b;
    public final ArrayList f18475c;
    public final int d;
    public final int e;
    public final TLRPC.Message f18476f;
    public final int h;
    public final TLRPC.Message f18477n;
    public final MessageObject f18478r;
    public final int f18479s;

    public gj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f18473a = i14;
        this.f18474b = sendMessagesHelper;
        this.f18475c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f18476f = message;
        this.h = i12;
        this.f18477n = message2;
        this.f18478r = messageObject;
        this.f18479s = i13;
    }

    @Override
    public final void run() {
        switch (this.f18473a) {
            case 0:
                this.f18474b.lambda$sendMessage$12(this.f18475c, this.d, this.e, this.f18476f, this.h, this.f18477n, this.f18478r, this.f18479s);
                return;
            default:
                this.f18474b.lambda$sendMessage$13(this.f18475c, this.d, this.e, this.f18476f, this.h, this.f18477n, this.f18478r, this.f18479s);
                return;
        }
    }
}
