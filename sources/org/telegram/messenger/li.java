package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f18497a;
    public final SendMessagesHelper f18498b;
    public final TLObject f18499c;
    public final MessageObject d;
    public final String f18500e;
    public final SendMessagesHelper.DelayedMessage f18501f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18502n;
    public final Object f18503r;
    public final HashMap f18504s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18497a = i10;
        this.f18498b = sendMessagesHelper;
        this.f18499c = tLObject;
        this.d = messageObject;
        this.f18500e = str;
        this.f18501f = delayedMessage;
        this.h = z10;
        this.f18502n = delayedMessage2;
        this.f18503r = obj;
        this.f18504s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18497a) {
            case 0:
                HashMap hashMap = this.f18504s;
                boolean z10 = this.v;
                Object obj = this.f18503r;
                String str = this.f18500e;
                this.f18498b.lambda$performSendMessageRequest$77(this.f18499c, this.d, str, this.f18501f, this.h, this.f18502n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18504s;
                boolean z11 = this.v;
                Object obj2 = this.f18503r;
                String str2 = this.f18500e;
                this.f18498b.lambda$performSendMessageRequest$78(this.f18499c, this.d, str2, this.f18501f, this.h, this.f18502n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18504s;
                boolean z12 = this.v;
                Object obj3 = this.f18503r;
                String str3 = this.f18500e;
                this.f18498b.lambda$performSendMessageRequest$82(this.f18499c, this.d, str3, this.f18501f, this.h, this.f18502n, obj3, hashMap3, z12);
                return;
        }
    }
}
