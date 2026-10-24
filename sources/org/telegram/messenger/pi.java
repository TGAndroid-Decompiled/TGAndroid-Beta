package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class pi implements Runnable {
    public final int f19287a;
    public final SendMessagesHelper f19288b;
    public final TLObject f19289c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f19290f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19291n;
    public final Object f19292r;
    public final HashMap f19293s;
    public final boolean v;

    public pi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19287a = i10;
        this.f19288b = sendMessagesHelper;
        this.f19289c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f19290f = delayedMessage;
        this.h = z10;
        this.f19291n = delayedMessage2;
        this.f19292r = obj;
        this.f19293s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19287a) {
            case 0:
                HashMap hashMap = this.f19293s;
                boolean z10 = this.v;
                Object obj = this.f19292r;
                String str = this.e;
                this.f19288b.lambda$performSendMessageRequest$80(this.f19289c, this.d, str, this.f19290f, this.h, this.f19291n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19293s;
                boolean z11 = this.v;
                Object obj2 = this.f19292r;
                String str2 = this.e;
                this.f19288b.lambda$performSendMessageRequest$81(this.f19289c, this.d, str2, this.f19290f, this.h, this.f19291n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19293s;
                boolean z12 = this.v;
                Object obj3 = this.f19292r;
                String str3 = this.e;
                this.f19288b.lambda$performSendMessageRequest$85(this.f19289c, this.d, str3, this.f19290f, this.h, this.f19291n, obj3, hashMap3, z12);
                return;
        }
    }
}
