package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f17017a;
    public final SendMessagesHelper f17018b;
    public final ArrayList f17019c;
    public final int d;
    public final int e;
    public final TLRPC.Message f17020f;
    public final int h;
    public final TLRPC.Message f17021n;
    public final MessageObject f17022r;
    public final int f17023s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f17017a = i14;
        this.f17018b = sendMessagesHelper;
        this.f17019c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f17020f = message;
        this.h = i12;
        this.f17021n = message2;
        this.f17022r = messageObject;
        this.f17023s = i13;
    }

    @Override
    public final void run() {
        switch (this.f17017a) {
            case 0:
                this.f17018b.lambda$sendMessage$9(this.f17019c, this.d, this.e, this.f17020f, this.h, this.f17021n, this.f17022r, this.f17023s);
                return;
            default:
                this.f17018b.lambda$sendMessage$10(this.f17019c, this.d, this.e, this.f17020f, this.h, this.f17021n, this.f17022r, this.f17023s);
                return;
        }
    }
}
