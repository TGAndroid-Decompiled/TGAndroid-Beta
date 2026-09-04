package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f18292a;
    public final SendMessagesHelper f18293b;
    public final TLObject f18294c;
    public final MessageObject d;
    public final String f18295e;
    public final SendMessagesHelper.DelayedMessage f18296f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18297n;
    public final Object f18298r;
    public final HashMap f18299s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18292a = i10;
        this.f18293b = sendMessagesHelper;
        this.f18294c = tLObject;
        this.d = messageObject;
        this.f18295e = str;
        this.f18296f = delayedMessage;
        this.h = z10;
        this.f18297n = delayedMessage2;
        this.f18298r = obj;
        this.f18299s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18292a) {
            case 0:
                HashMap hashMap = this.f18299s;
                boolean z10 = this.v;
                Object obj = this.f18298r;
                String str = this.f18295e;
                this.f18293b.lambda$performSendMessageRequest$77(this.f18294c, this.d, str, this.f18296f, this.h, this.f18297n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18299s;
                boolean z11 = this.v;
                Object obj2 = this.f18298r;
                String str2 = this.f18295e;
                this.f18293b.lambda$performSendMessageRequest$78(this.f18294c, this.d, str2, this.f18296f, this.h, this.f18297n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18299s;
                boolean z12 = this.v;
                Object obj3 = this.f18298r;
                String str3 = this.f18295e;
                this.f18293b.lambda$performSendMessageRequest$82(this.f18294c, this.d, str3, this.f18296f, this.h, this.f18297n, obj3, hashMap3, z12);
                return;
        }
    }
}
