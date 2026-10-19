package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f18898a;
    public final SendMessagesHelper f18899b;
    public final TLObject f18900c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18901f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18902n;
    public final Object f18903r;
    public final HashMap f18904s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18898a = i10;
        this.f18899b = sendMessagesHelper;
        this.f18900c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18901f = delayedMessage;
        this.h = z10;
        this.f18902n = delayedMessage2;
        this.f18903r = obj;
        this.f18904s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18898a) {
            case 0:
                HashMap hashMap = this.f18904s;
                boolean z10 = this.v;
                Object obj = this.f18903r;
                String str = this.e;
                this.f18899b.lambda$performSendMessageRequest$80(this.f18900c, this.d, str, this.f18901f, this.h, this.f18902n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18904s;
                boolean z11 = this.v;
                Object obj2 = this.f18903r;
                String str2 = this.e;
                this.f18899b.lambda$performSendMessageRequest$81(this.f18900c, this.d, str2, this.f18901f, this.h, this.f18902n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18904s;
                boolean z12 = this.v;
                Object obj3 = this.f18903r;
                String str3 = this.e;
                this.f18899b.lambda$performSendMessageRequest$85(this.f18900c, this.d, str3, this.f18901f, this.h, this.f18902n, obj3, hashMap3, z12);
                return;
        }
    }
}
