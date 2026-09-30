package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f16866a;
    public final SendMessagesHelper f16867b;
    public final TLObject f16868c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16869f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16870n;
    public final Object f16871r;
    public final HashMap f16872s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16866a = i10;
        this.f16867b = sendMessagesHelper;
        this.f16868c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16869f = delayedMessage;
        this.h = z10;
        this.f16870n = delayedMessage2;
        this.f16871r = obj;
        this.f16872s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16866a) {
            case 0:
                HashMap hashMap = this.f16872s;
                boolean z10 = this.v;
                Object obj = this.f16871r;
                String str = this.e;
                this.f16867b.lambda$performSendMessageRequest$77(this.f16868c, this.d, str, this.f16869f, this.h, this.f16870n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16872s;
                boolean z11 = this.v;
                Object obj2 = this.f16871r;
                String str2 = this.e;
                this.f16867b.lambda$performSendMessageRequest$78(this.f16868c, this.d, str2, this.f16869f, this.h, this.f16870n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16872s;
                boolean z12 = this.v;
                Object obj3 = this.f16871r;
                String str3 = this.e;
                this.f16867b.lambda$performSendMessageRequest$82(this.f16868c, this.d, str3, this.f16869f, this.h, this.f16870n, obj3, hashMap3, z12);
                return;
        }
    }
}
