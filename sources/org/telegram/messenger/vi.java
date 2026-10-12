package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class vi implements Runnable {
    public final int f19223a;
    public final SendMessagesHelper f19224b;
    public final TLObject f19225c;
    public final MessageObject d;
    public final String f19226e;
    public final SendMessagesHelper.DelayedMessage f19227f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19228n;
    public final Object f19229r;
    public final HashMap f19230s;
    public final boolean v;

    public vi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19223a = i10;
        this.f19224b = sendMessagesHelper;
        this.f19225c = tLObject;
        this.d = messageObject;
        this.f19226e = str;
        this.f19227f = delayedMessage;
        this.h = z10;
        this.f19228n = delayedMessage2;
        this.f19229r = obj;
        this.f19230s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19223a) {
            case 0:
                HashMap hashMap = this.f19230s;
                boolean z10 = this.v;
                Object obj = this.f19229r;
                String str = this.f19226e;
                this.f19224b.lambda$performSendMessageRequest$80(this.f19225c, this.d, str, this.f19227f, this.h, this.f19228n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19230s;
                boolean z11 = this.v;
                Object obj2 = this.f19229r;
                String str2 = this.f19226e;
                this.f19224b.lambda$performSendMessageRequest$81(this.f19225c, this.d, str2, this.f19227f, this.h, this.f19228n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19230s;
                boolean z12 = this.v;
                Object obj3 = this.f19229r;
                String str3 = this.f19226e;
                this.f19224b.lambda$performSendMessageRequest$85(this.f19225c, this.d, str3, this.f19227f, this.h, this.f19228n, obj3, hashMap3, z12);
                return;
        }
    }
}
