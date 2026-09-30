package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f16850a;
    public final SendMessagesHelper f16851b;
    public final TLObject f16852c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16853f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16854n;
    public final Object f16855r;
    public final HashMap f16856s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16850a = i10;
        this.f16851b = sendMessagesHelper;
        this.f16852c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16853f = delayedMessage;
        this.h = z10;
        this.f16854n = delayedMessage2;
        this.f16855r = obj;
        this.f16856s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16850a) {
            case 0:
                HashMap hashMap = this.f16856s;
                boolean z10 = this.v;
                Object obj = this.f16855r;
                String str = this.e;
                this.f16851b.lambda$performSendMessageRequest$77(this.f16852c, this.d, str, this.f16853f, this.h, this.f16854n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16856s;
                boolean z11 = this.v;
                Object obj2 = this.f16855r;
                String str2 = this.e;
                this.f16851b.lambda$performSendMessageRequest$78(this.f16852c, this.d, str2, this.f16853f, this.h, this.f16854n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16856s;
                boolean z12 = this.v;
                Object obj3 = this.f16855r;
                String str3 = this.e;
                this.f16851b.lambda$performSendMessageRequest$82(this.f16852c, this.d, str3, this.f16853f, this.h, this.f16854n, obj3, hashMap3, z12);
                return;
        }
    }
}
