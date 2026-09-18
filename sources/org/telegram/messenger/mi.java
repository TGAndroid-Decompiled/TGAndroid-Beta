package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class mi implements Runnable {
    public final int f16966a;
    public final SendMessagesHelper f16967b;
    public final TLObject f16968c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16969f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16970n;
    public final Object f16971r;
    public final HashMap f16972s;
    public final boolean v;

    public mi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16966a = i10;
        this.f16967b = sendMessagesHelper;
        this.f16968c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16969f = delayedMessage;
        this.h = z10;
        this.f16970n = delayedMessage2;
        this.f16971r = obj;
        this.f16972s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16966a) {
            case 0:
                HashMap hashMap = this.f16972s;
                boolean z10 = this.v;
                Object obj = this.f16971r;
                String str = this.e;
                this.f16967b.lambda$performSendMessageRequest$77(this.f16968c, this.d, str, this.f16969f, this.h, this.f16970n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16972s;
                boolean z11 = this.v;
                Object obj2 = this.f16971r;
                String str2 = this.e;
                this.f16967b.lambda$performSendMessageRequest$78(this.f16968c, this.d, str2, this.f16969f, this.h, this.f16970n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16972s;
                boolean z12 = this.v;
                Object obj3 = this.f16971r;
                String str3 = this.e;
                this.f16967b.lambda$performSendMessageRequest$82(this.f16968c, this.d, str3, this.f16969f, this.h, this.f16970n, obj3, hashMap3, z12);
                return;
        }
    }
}
