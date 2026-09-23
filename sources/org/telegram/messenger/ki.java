package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f16593a;
    public final SendMessagesHelper f16594b;
    public final TLObject f16595c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16596f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16597n;
    public final Object f16598r;
    public final HashMap f16599s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16593a = i10;
        this.f16594b = sendMessagesHelper;
        this.f16595c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16596f = delayedMessage;
        this.h = z10;
        this.f16597n = delayedMessage2;
        this.f16598r = obj;
        this.f16599s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16593a) {
            case 0:
                HashMap hashMap = this.f16599s;
                boolean z10 = this.v;
                Object obj = this.f16598r;
                String str = this.e;
                this.f16594b.lambda$performSendMessageRequest$77(this.f16595c, this.d, str, this.f16596f, this.h, this.f16597n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16599s;
                boolean z11 = this.v;
                Object obj2 = this.f16598r;
                String str2 = this.e;
                this.f16594b.lambda$performSendMessageRequest$78(this.f16595c, this.d, str2, this.f16596f, this.h, this.f16597n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16599s;
                boolean z12 = this.v;
                Object obj3 = this.f16598r;
                String str3 = this.e;
                this.f16594b.lambda$performSendMessageRequest$82(this.f16595c, this.d, str3, this.f16596f, this.h, this.f16597n, obj3, hashMap3, z12);
                return;
        }
    }
}
