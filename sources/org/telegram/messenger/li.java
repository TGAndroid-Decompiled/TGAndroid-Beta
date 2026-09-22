package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f16688a;
    public final SendMessagesHelper f16689b;
    public final TLObject f16690c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16691f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16692n;
    public final Object f16693r;
    public final HashMap f16694s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16688a = i10;
        this.f16689b = sendMessagesHelper;
        this.f16690c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16691f = delayedMessage;
        this.h = z10;
        this.f16692n = delayedMessage2;
        this.f16693r = obj;
        this.f16694s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16688a) {
            case 0:
                HashMap hashMap = this.f16694s;
                boolean z10 = this.v;
                Object obj = this.f16693r;
                String str = this.e;
                this.f16689b.lambda$performSendMessageRequest$77(this.f16690c, this.d, str, this.f16691f, this.h, this.f16692n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16694s;
                boolean z11 = this.v;
                Object obj2 = this.f16693r;
                String str2 = this.e;
                this.f16689b.lambda$performSendMessageRequest$78(this.f16690c, this.d, str2, this.f16691f, this.h, this.f16692n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16694s;
                boolean z12 = this.v;
                Object obj3 = this.f16693r;
                String str3 = this.e;
                this.f16689b.lambda$performSendMessageRequest$82(this.f16690c, this.d, str3, this.f16691f, this.h, this.f16692n, obj3, hashMap3, z12);
                return;
        }
    }
}
