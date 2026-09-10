package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ti implements Runnable {
    public final int f16423a;
    public final SendMessagesHelper f16424b;
    public final TLObject f16425c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16426f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16427n;
    public final Object f16428r;
    public final HashMap f16429s;
    public final boolean v;

    public ti(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16423a = i10;
        this.f16424b = sendMessagesHelper;
        this.f16425c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16426f = delayedMessage;
        this.h = z10;
        this.f16427n = delayedMessage2;
        this.f16428r = obj;
        this.f16429s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16423a) {
            case 0:
                HashMap hashMap = this.f16429s;
                boolean z10 = this.v;
                Object obj = this.f16428r;
                String str = this.e;
                this.f16424b.lambda$performSendMessageRequest$77(this.f16425c, this.d, str, this.f16426f, this.h, this.f16427n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16429s;
                boolean z11 = this.v;
                Object obj2 = this.f16428r;
                String str2 = this.e;
                this.f16424b.lambda$performSendMessageRequest$78(this.f16425c, this.d, str2, this.f16426f, this.h, this.f16427n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16429s;
                boolean z12 = this.v;
                Object obj3 = this.f16428r;
                String str3 = this.e;
                this.f16424b.lambda$performSendMessageRequest$82(this.f16425c, this.d, str3, this.f16426f, this.h, this.f16427n, obj3, hashMap3, z12);
                return;
        }
    }
}
