package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f18239a;
    public final SendMessagesHelper f18240b;
    public final TLObject f18241c;
    public final MessageObject d;
    public final String f18242e;
    public final SendMessagesHelper.DelayedMessage f18243f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18244n;
    public final Object f18245r;
    public final HashMap f18246s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18239a = i10;
        this.f18240b = sendMessagesHelper;
        this.f18241c = tLObject;
        this.d = messageObject;
        this.f18242e = str;
        this.f18243f = delayedMessage;
        this.h = z10;
        this.f18244n = delayedMessage2;
        this.f18245r = obj;
        this.f18246s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18239a) {
            case 0:
                HashMap hashMap = this.f18246s;
                boolean z10 = this.v;
                Object obj = this.f18245r;
                String str = this.f18242e;
                this.f18240b.lambda$performSendMessageRequest$77(this.f18241c, this.d, str, this.f18243f, this.h, this.f18244n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18246s;
                boolean z11 = this.v;
                Object obj2 = this.f18245r;
                String str2 = this.f18242e;
                this.f18240b.lambda$performSendMessageRequest$78(this.f18241c, this.d, str2, this.f18243f, this.h, this.f18244n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18246s;
                boolean z12 = this.v;
                Object obj3 = this.f18245r;
                String str3 = this.f18242e;
                this.f18240b.lambda$performSendMessageRequest$82(this.f18241c, this.d, str3, this.f18243f, this.h, this.f18244n, obj3, hashMap3, z12);
                return;
        }
    }
}
