package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f16783a;
    public final SendMessagesHelper f16784b;
    public final ArrayList f16785c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16786f;
    public final int h;
    public final TLRPC.Message f16787n;
    public final MessageObject f16788r;
    public final int f16789s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f16783a = i14;
        this.f16784b = sendMessagesHelper;
        this.f16785c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16786f = message;
        this.h = i12;
        this.f16787n = message2;
        this.f16788r = messageObject;
        this.f16789s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16783a) {
            case 0:
                this.f16784b.lambda$sendMessage$9(this.f16785c, this.d, this.e, this.f16786f, this.h, this.f16787n, this.f16788r, this.f16789s);
                return;
            default:
                this.f16784b.lambda$sendMessage$10(this.f16785c, this.d, this.e, this.f16786f, this.h, this.f16787n, this.f16788r, this.f16789s);
                return;
        }
    }
}
