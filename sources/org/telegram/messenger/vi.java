package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class vi implements Runnable {
    public final int f19222a;
    public final SendMessagesHelper f19223b;
    public final TLObject f19224c;
    public final MessageObject d;
    public final String f19225e;
    public final SendMessagesHelper.DelayedMessage f19226f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19227n;
    public final Object f19228r;
    public final HashMap f19229s;
    public final boolean v;

    public vi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19222a = i10;
        this.f19223b = sendMessagesHelper;
        this.f19224c = tLObject;
        this.d = messageObject;
        this.f19225e = str;
        this.f19226f = delayedMessage;
        this.h = z10;
        this.f19227n = delayedMessage2;
        this.f19228r = obj;
        this.f19229s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19222a) {
            case 0:
                HashMap hashMap = this.f19229s;
                boolean z10 = this.v;
                Object obj = this.f19228r;
                String str = this.f19225e;
                this.f19223b.lambda$performSendMessageRequest$80(this.f19224c, this.d, str, this.f19226f, this.h, this.f19227n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19229s;
                boolean z11 = this.v;
                Object obj2 = this.f19228r;
                String str2 = this.f19225e;
                this.f19223b.lambda$performSendMessageRequest$81(this.f19224c, this.d, str2, this.f19226f, this.h, this.f19227n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19229s;
                boolean z12 = this.v;
                Object obj3 = this.f19228r;
                String str3 = this.f19225e;
                this.f19223b.lambda$performSendMessageRequest$85(this.f19224c, this.d, str3, this.f19226f, this.h, this.f19227n, obj3, hashMap3, z12);
                return;
        }
    }
}
