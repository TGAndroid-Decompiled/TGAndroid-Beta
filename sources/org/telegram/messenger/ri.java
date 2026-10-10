package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ri implements Runnable {
    public final int f19067a;
    public final SendMessagesHelper f19068b;
    public final TLObject f19069c;
    public final MessageObject d;
    public final String f19070e;
    public final SendMessagesHelper.DelayedMessage f19071f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19072n;
    public final Object f19073r;
    public final HashMap f19074s;
    public final boolean v;

    public ri(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19067a = i10;
        this.f19068b = sendMessagesHelper;
        this.f19069c = tLObject;
        this.d = messageObject;
        this.f19070e = str;
        this.f19071f = delayedMessage;
        this.h = z10;
        this.f19072n = delayedMessage2;
        this.f19073r = obj;
        this.f19074s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19067a) {
            case 0:
                HashMap hashMap = this.f19074s;
                boolean z10 = this.v;
                Object obj = this.f19073r;
                String str = this.f19070e;
                this.f19068b.lambda$performSendMessageRequest$80(this.f19069c, this.d, str, this.f19071f, this.h, this.f19072n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19074s;
                boolean z11 = this.v;
                Object obj2 = this.f19073r;
                String str2 = this.f19070e;
                this.f19068b.lambda$performSendMessageRequest$81(this.f19069c, this.d, str2, this.f19071f, this.h, this.f19072n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19074s;
                boolean z12 = this.v;
                Object obj3 = this.f19073r;
                String str3 = this.f19070e;
                this.f19068b.lambda$performSendMessageRequest$85(this.f19069c, this.d, str3, this.f19071f, this.h, this.f19072n, obj3, hashMap3, z12);
                return;
        }
    }
}
