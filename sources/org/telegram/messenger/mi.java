package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class mi implements Runnable {
    public final int f18979a;
    public final SendMessagesHelper f18980b;
    public final TLObject f18981c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18982f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18983n;
    public final Object f18984r;
    public final HashMap f18985s;
    public final boolean v;

    public mi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18979a = i10;
        this.f18980b = sendMessagesHelper;
        this.f18981c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18982f = delayedMessage;
        this.h = z10;
        this.f18983n = delayedMessage2;
        this.f18984r = obj;
        this.f18985s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18979a) {
            case 0:
                HashMap hashMap = this.f18985s;
                boolean z10 = this.v;
                Object obj = this.f18984r;
                String str = this.e;
                this.f18980b.lambda$performSendMessageRequest$80(this.f18981c, this.d, str, this.f18982f, this.h, this.f18983n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18985s;
                boolean z11 = this.v;
                Object obj2 = this.f18984r;
                String str2 = this.e;
                this.f18980b.lambda$performSendMessageRequest$81(this.f18981c, this.d, str2, this.f18982f, this.h, this.f18983n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18985s;
                boolean z12 = this.v;
                Object obj3 = this.f18984r;
                String str3 = this.e;
                this.f18980b.lambda$performSendMessageRequest$85(this.f18981c, this.d, str3, this.f18982f, this.h, this.f18983n, obj3, hashMap3, z12);
                return;
        }
    }
}
