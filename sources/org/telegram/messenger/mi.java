package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class mi implements Runnable {
    public final int f18976a;
    public final SendMessagesHelper f18977b;
    public final TLObject f18978c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18979f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18980n;
    public final Object f18981r;
    public final HashMap f18982s;
    public final boolean v;

    public mi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18976a = i10;
        this.f18977b = sendMessagesHelper;
        this.f18978c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18979f = delayedMessage;
        this.h = z10;
        this.f18980n = delayedMessage2;
        this.f18981r = obj;
        this.f18982s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18976a) {
            case 0:
                HashMap hashMap = this.f18982s;
                boolean z10 = this.v;
                Object obj = this.f18981r;
                String str = this.e;
                this.f18977b.lambda$performSendMessageRequest$80(this.f18978c, this.d, str, this.f18979f, this.h, this.f18980n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18982s;
                boolean z11 = this.v;
                Object obj2 = this.f18981r;
                String str2 = this.e;
                this.f18977b.lambda$performSendMessageRequest$81(this.f18978c, this.d, str2, this.f18979f, this.h, this.f18980n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18982s;
                boolean z12 = this.v;
                Object obj3 = this.f18981r;
                String str3 = this.e;
                this.f18977b.lambda$performSendMessageRequest$85(this.f18978c, this.d, str3, this.f18979f, this.h, this.f18980n, obj3, hashMap3, z12);
                return;
        }
    }
}
