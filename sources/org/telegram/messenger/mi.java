package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class mi implements Runnable {
    public final int f18992a;
    public final SendMessagesHelper f18993b;
    public final TLObject f18994c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18995f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18996n;
    public final Object f18997r;
    public final HashMap f18998s;
    public final boolean v;

    public mi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18992a = i10;
        this.f18993b = sendMessagesHelper;
        this.f18994c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18995f = delayedMessage;
        this.h = z10;
        this.f18996n = delayedMessage2;
        this.f18997r = obj;
        this.f18998s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18992a) {
            case 0:
                HashMap hashMap = this.f18998s;
                boolean z10 = this.v;
                Object obj = this.f18997r;
                String str = this.e;
                this.f18993b.lambda$performSendMessageRequest$80(this.f18994c, this.d, str, this.f18995f, this.h, this.f18996n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18998s;
                boolean z11 = this.v;
                Object obj2 = this.f18997r;
                String str2 = this.e;
                this.f18993b.lambda$performSendMessageRequest$81(this.f18994c, this.d, str2, this.f18995f, this.h, this.f18996n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18998s;
                boolean z12 = this.v;
                Object obj3 = this.f18997r;
                String str3 = this.e;
                this.f18993b.lambda$performSendMessageRequest$85(this.f18994c, this.d, str3, this.f18995f, this.h, this.f18996n, obj3, hashMap3, z12);
                return;
        }
    }
}
