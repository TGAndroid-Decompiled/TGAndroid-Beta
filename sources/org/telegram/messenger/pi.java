package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class pi implements Runnable {
    public final int f19220a;
    public final SendMessagesHelper f19221b;
    public final TLObject f19222c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f19223f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19224n;
    public final Object f19225r;
    public final HashMap f19226s;
    public final boolean v;

    public pi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19220a = i10;
        this.f19221b = sendMessagesHelper;
        this.f19222c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f19223f = delayedMessage;
        this.h = z10;
        this.f19224n = delayedMessage2;
        this.f19225r = obj;
        this.f19226s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19220a) {
            case 0:
                HashMap hashMap = this.f19226s;
                boolean z10 = this.v;
                Object obj = this.f19225r;
                String str = this.e;
                this.f19221b.lambda$performSendMessageRequest$80(this.f19222c, this.d, str, this.f19223f, this.h, this.f19224n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19226s;
                boolean z11 = this.v;
                Object obj2 = this.f19225r;
                String str2 = this.e;
                this.f19221b.lambda$performSendMessageRequest$81(this.f19222c, this.d, str2, this.f19223f, this.h, this.f19224n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19226s;
                boolean z12 = this.v;
                Object obj3 = this.f19225r;
                String str3 = this.e;
                this.f19221b.lambda$performSendMessageRequest$85(this.f19222c, this.d, str3, this.f19223f, this.h, this.f19224n, obj3, hashMap3, z12);
                return;
        }
    }
}
