package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class si implements Runnable {
    public final int f21236a;
    public final SendMessagesHelper f21237b;
    public final TLObject f21238c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f21239f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f21240n;
    public final Object f21241r;
    public final HashMap f21242s;
    public final boolean v;

    public si(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f21236a = i10;
        this.f21237b = sendMessagesHelper;
        this.f21238c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f21239f = delayedMessage;
        this.h = z10;
        this.f21240n = delayedMessage2;
        this.f21241r = obj;
        this.f21242s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f21236a) {
            case 0:
                HashMap hashMap = this.f21242s;
                boolean z10 = this.v;
                Object obj = this.f21241r;
                String str = this.e;
                this.f21237b.lambda$performSendMessageRequest$80(this.f21238c, this.d, str, this.f21239f, this.h, this.f21240n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f21242s;
                boolean z11 = this.v;
                Object obj2 = this.f21241r;
                String str2 = this.e;
                this.f21237b.lambda$performSendMessageRequest$81(this.f21238c, this.d, str2, this.f21239f, this.h, this.f21240n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f21242s;
                boolean z12 = this.v;
                Object obj3 = this.f21241r;
                String str3 = this.e;
                this.f21237b.lambda$performSendMessageRequest$85(this.f21238c, this.d, str3, this.f21239f, this.h, this.f21240n, obj3, hashMap3, z12);
                return;
        }
    }
}
