package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f16701a;
    public final SendMessagesHelper f16702b;
    public final TLObject f16703c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16704f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16705n;
    public final Object f16706r;
    public final HashMap f16707s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16701a = i10;
        this.f16702b = sendMessagesHelper;
        this.f16703c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16704f = delayedMessage;
        this.h = z10;
        this.f16705n = delayedMessage2;
        this.f16706r = obj;
        this.f16707s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16701a) {
            case 0:
                HashMap hashMap = this.f16707s;
                boolean z10 = this.v;
                Object obj = this.f16706r;
                String str = this.e;
                this.f16702b.lambda$performSendMessageRequest$77(this.f16703c, this.d, str, this.f16704f, this.h, this.f16705n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16707s;
                boolean z11 = this.v;
                Object obj2 = this.f16706r;
                String str2 = this.e;
                this.f16702b.lambda$performSendMessageRequest$78(this.f16703c, this.d, str2, this.f16704f, this.h, this.f16705n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16707s;
                boolean z12 = this.v;
                Object obj3 = this.f16706r;
                String str3 = this.e;
                this.f16702b.lambda$performSendMessageRequest$82(this.f16703c, this.d, str3, this.f16704f, this.h, this.f16705n, obj3, hashMap3, z12);
                return;
        }
    }
}
