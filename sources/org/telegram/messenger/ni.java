package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ni implements Runnable {
    public final int f17953a;
    public final SendMessagesHelper f17954b;
    public final TLObject f17955c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f17956f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f17957n;
    public final Object f17958r;
    public final HashMap f17959s;
    public final boolean v;

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, int i10) {
        this.f17953a = i10;
        this.f17954b = sendMessagesHelper;
        this.f17955c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f17956f = delayedMessage;
        this.h = z4;
        this.f17957n = delayedMessage2;
        this.f17958r = obj;
        this.f17959s = hashMap;
        this.v = z10;
    }

    @Override
    public final void run() {
        switch (this.f17953a) {
            case 0:
                HashMap hashMap = this.f17959s;
                boolean z4 = this.v;
                Object obj = this.f17958r;
                String str = this.e;
                this.f17954b.lambda$performSendMessageRequest$77(this.f17955c, this.d, str, this.f17956f, this.h, this.f17957n, obj, hashMap, z4);
                return;
            case 1:
                HashMap hashMap2 = this.f17959s;
                boolean z10 = this.v;
                Object obj2 = this.f17958r;
                String str2 = this.e;
                this.f17954b.lambda$performSendMessageRequest$78(this.f17955c, this.d, str2, this.f17956f, this.h, this.f17957n, obj2, hashMap2, z10);
                return;
            default:
                HashMap hashMap3 = this.f17959s;
                boolean z11 = this.v;
                Object obj3 = this.f17958r;
                String str3 = this.e;
                this.f17954b.lambda$performSendMessageRequest$82(this.f17955c, this.d, str3, this.f17956f, this.h, this.f17957n, obj3, hashMap3, z11);
                return;
        }
    }
}
