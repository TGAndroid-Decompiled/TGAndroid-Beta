package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class qi implements Runnable {
    public final int f19010a;
    public final SendMessagesHelper f19011b;
    public final TLObject f19012c;
    public final MessageObject d;
    public final String f19013e;
    public final SendMessagesHelper.DelayedMessage f19014f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19015n;
    public final Object f19016r;
    public final HashMap f19017s;
    public final boolean v;

    public qi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19010a = i10;
        this.f19011b = sendMessagesHelper;
        this.f19012c = tLObject;
        this.d = messageObject;
        this.f19013e = str;
        this.f19014f = delayedMessage;
        this.h = z10;
        this.f19015n = delayedMessage2;
        this.f19016r = obj;
        this.f19017s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19010a) {
            case 0:
                HashMap hashMap = this.f19017s;
                boolean z10 = this.v;
                Object obj = this.f19016r;
                String str = this.f19013e;
                this.f19011b.lambda$performSendMessageRequest$80(this.f19012c, this.d, str, this.f19014f, this.h, this.f19015n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19017s;
                boolean z11 = this.v;
                Object obj2 = this.f19016r;
                String str2 = this.f19013e;
                this.f19011b.lambda$performSendMessageRequest$81(this.f19012c, this.d, str2, this.f19014f, this.h, this.f19015n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19017s;
                boolean z12 = this.v;
                Object obj3 = this.f19016r;
                String str3 = this.f19013e;
                this.f19011b.lambda$performSendMessageRequest$85(this.f19012c, this.d, str3, this.f19014f, this.h, this.f19015n, obj3, hashMap3, z12);
                return;
        }
    }
}
