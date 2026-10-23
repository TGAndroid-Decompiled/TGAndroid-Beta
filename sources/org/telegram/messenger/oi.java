package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class oi implements Runnable {
    public final int f19218a;
    public final SendMessagesHelper f19219b;
    public final TLObject f19220c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f19221f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19222n;
    public final Object f19223r;
    public final HashMap f19224s;
    public final boolean v;

    public oi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19218a = i10;
        this.f19219b = sendMessagesHelper;
        this.f19220c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f19221f = delayedMessage;
        this.h = z10;
        this.f19222n = delayedMessage2;
        this.f19223r = obj;
        this.f19224s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19218a) {
            case 0:
                HashMap hashMap = this.f19224s;
                boolean z10 = this.v;
                Object obj = this.f19223r;
                String str = this.e;
                this.f19219b.lambda$performSendMessageRequest$80(this.f19220c, this.d, str, this.f19221f, this.h, this.f19222n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19224s;
                boolean z11 = this.v;
                Object obj2 = this.f19223r;
                String str2 = this.e;
                this.f19219b.lambda$performSendMessageRequest$81(this.f19220c, this.d, str2, this.f19221f, this.h, this.f19222n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19224s;
                boolean z12 = this.v;
                Object obj3 = this.f19223r;
                String str3 = this.e;
                this.f19219b.lambda$performSendMessageRequest$85(this.f19220c, this.d, str3, this.f19221f, this.h, this.f19222n, obj3, hashMap3, z12);
                return;
        }
    }
}
