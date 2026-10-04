package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f18492a;
    public final SendMessagesHelper f18493b;
    public final TLObject f18494c;
    public final MessageObject d;
    public final String f18495e;
    public final SendMessagesHelper.DelayedMessage f18496f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18497n;
    public final Object f18498r;
    public final HashMap f18499s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18492a = i10;
        this.f18493b = sendMessagesHelper;
        this.f18494c = tLObject;
        this.d = messageObject;
        this.f18495e = str;
        this.f18496f = delayedMessage;
        this.h = z10;
        this.f18497n = delayedMessage2;
        this.f18498r = obj;
        this.f18499s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18492a) {
            case 0:
                HashMap hashMap = this.f18499s;
                boolean z10 = this.v;
                Object obj = this.f18498r;
                String str = this.f18495e;
                this.f18493b.lambda$performSendMessageRequest$77(this.f18494c, this.d, str, this.f18496f, this.h, this.f18497n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18499s;
                boolean z11 = this.v;
                Object obj2 = this.f18498r;
                String str2 = this.f18495e;
                this.f18493b.lambda$performSendMessageRequest$78(this.f18494c, this.d, str2, this.f18496f, this.h, this.f18497n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18499s;
                boolean z12 = this.v;
                Object obj3 = this.f18498r;
                String str3 = this.f18495e;
                this.f18493b.lambda$performSendMessageRequest$82(this.f18494c, this.d, str3, this.f18496f, this.h, this.f18497n, obj3, hashMap3, z12);
                return;
        }
    }
}
