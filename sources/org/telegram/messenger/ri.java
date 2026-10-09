package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ri implements Runnable {
    public final int f19063a;
    public final SendMessagesHelper f19064b;
    public final TLObject f19065c;
    public final MessageObject d;
    public final String f19066e;
    public final SendMessagesHelper.DelayedMessage f19067f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19068n;
    public final Object f19069r;
    public final HashMap f19070s;
    public final boolean v;

    public ri(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19063a = i10;
        this.f19064b = sendMessagesHelper;
        this.f19065c = tLObject;
        this.d = messageObject;
        this.f19066e = str;
        this.f19067f = delayedMessage;
        this.h = z10;
        this.f19068n = delayedMessage2;
        this.f19069r = obj;
        this.f19070s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19063a) {
            case 0:
                HashMap hashMap = this.f19070s;
                boolean z10 = this.v;
                Object obj = this.f19069r;
                String str = this.f19066e;
                this.f19064b.lambda$performSendMessageRequest$80(this.f19065c, this.d, str, this.f19067f, this.h, this.f19068n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19070s;
                boolean z11 = this.v;
                Object obj2 = this.f19069r;
                String str2 = this.f19066e;
                this.f19064b.lambda$performSendMessageRequest$81(this.f19065c, this.d, str2, this.f19067f, this.h, this.f19068n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19070s;
                boolean z12 = this.v;
                Object obj3 = this.f19069r;
                String str3 = this.f19066e;
                this.f19064b.lambda$performSendMessageRequest$85(this.f19065c, this.d, str3, this.f19067f, this.h, this.f19068n, obj3, hashMap3, z12);
                return;
        }
    }
}
