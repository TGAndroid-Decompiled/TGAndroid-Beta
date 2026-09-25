package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f16848a;
    public final SendMessagesHelper f16849b;
    public final TLObject f16850c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16851f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16852n;
    public final Object f16853r;
    public final HashMap f16854s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16848a = i10;
        this.f16849b = sendMessagesHelper;
        this.f16850c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16851f = delayedMessage;
        this.h = z10;
        this.f16852n = delayedMessage2;
        this.f16853r = obj;
        this.f16854s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16848a) {
            case 0:
                HashMap hashMap = this.f16854s;
                boolean z10 = this.v;
                Object obj = this.f16853r;
                String str = this.e;
                this.f16849b.lambda$performSendMessageRequest$77(this.f16850c, this.d, str, this.f16851f, this.h, this.f16852n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16854s;
                boolean z11 = this.v;
                Object obj2 = this.f16853r;
                String str2 = this.e;
                this.f16849b.lambda$performSendMessageRequest$78(this.f16850c, this.d, str2, this.f16851f, this.h, this.f16852n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16854s;
                boolean z12 = this.v;
                Object obj3 = this.f16853r;
                String str3 = this.e;
                this.f16849b.lambda$performSendMessageRequest$82(this.f16850c, this.d, str3, this.f16851f, this.h, this.f16852n, obj3, hashMap3, z12);
                return;
        }
    }
}
