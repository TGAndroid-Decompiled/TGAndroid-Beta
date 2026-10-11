package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class qi implements Runnable {
    public final int f18974a;
    public final SendMessagesHelper f18975b;
    public final TLObject f18976c;
    public final MessageObject d;
    public final String f18977e;
    public final SendMessagesHelper.DelayedMessage f18978f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18979n;
    public final Object f18980r;
    public final HashMap f18981s;
    public final boolean v;

    public qi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18974a = i10;
        this.f18975b = sendMessagesHelper;
        this.f18976c = tLObject;
        this.d = messageObject;
        this.f18977e = str;
        this.f18978f = delayedMessage;
        this.h = z10;
        this.f18979n = delayedMessage2;
        this.f18980r = obj;
        this.f18981s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18974a) {
            case 0:
                HashMap hashMap = this.f18981s;
                boolean z10 = this.v;
                Object obj = this.f18980r;
                String str = this.f18977e;
                this.f18975b.lambda$performSendMessageRequest$80(this.f18976c, this.d, str, this.f18978f, this.h, this.f18979n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18981s;
                boolean z11 = this.v;
                Object obj2 = this.f18980r;
                String str2 = this.f18977e;
                this.f18975b.lambda$performSendMessageRequest$81(this.f18976c, this.d, str2, this.f18978f, this.h, this.f18979n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18981s;
                boolean z12 = this.v;
                Object obj3 = this.f18980r;
                String str3 = this.f18977e;
                this.f18975b.lambda$performSendMessageRequest$85(this.f18976c, this.d, str3, this.f18978f, this.h, this.f18979n, obj3, hashMap3, z12);
                return;
        }
    }
}
