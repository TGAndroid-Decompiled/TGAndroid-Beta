package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ti implements Runnable {
    public final int f18516a;
    public final SendMessagesHelper f18517b;
    public final TLObject f18518c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18519f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18520n;
    public final Object f18521r;
    public final HashMap f18522s;
    public final boolean v;

    public ti(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18516a = i10;
        this.f18517b = sendMessagesHelper;
        this.f18518c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18519f = delayedMessage;
        this.h = z10;
        this.f18520n = delayedMessage2;
        this.f18521r = obj;
        this.f18522s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18516a) {
            case 0:
                HashMap hashMap = this.f18522s;
                boolean z10 = this.v;
                Object obj = this.f18521r;
                String str = this.e;
                this.f18517b.lambda$performSendMessageRequest$80(this.f18518c, this.d, str, this.f18519f, this.h, this.f18520n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18522s;
                boolean z11 = this.v;
                Object obj2 = this.f18521r;
                String str2 = this.e;
                this.f18517b.lambda$performSendMessageRequest$81(this.f18518c, this.d, str2, this.f18519f, this.h, this.f18520n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18522s;
                boolean z12 = this.v;
                Object obj3 = this.f18521r;
                String str3 = this.e;
                this.f18517b.lambda$performSendMessageRequest$85(this.f18518c, this.d, str3, this.f18519f, this.h, this.f18520n, obj3, hashMap3, z12);
                return;
        }
    }
}
