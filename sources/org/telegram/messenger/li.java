package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f16692a;
    public final SendMessagesHelper f16693b;
    public final TLObject f16694c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16695f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16696n;
    public final Object f16697r;
    public final HashMap f16698s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16692a = i10;
        this.f16693b = sendMessagesHelper;
        this.f16694c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16695f = delayedMessage;
        this.h = z10;
        this.f16696n = delayedMessage2;
        this.f16697r = obj;
        this.f16698s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16692a) {
            case 0:
                HashMap hashMap = this.f16698s;
                boolean z10 = this.v;
                Object obj = this.f16697r;
                String str = this.e;
                this.f16693b.lambda$performSendMessageRequest$77(this.f16694c, this.d, str, this.f16695f, this.h, this.f16696n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16698s;
                boolean z11 = this.v;
                Object obj2 = this.f16697r;
                String str2 = this.e;
                this.f16693b.lambda$performSendMessageRequest$78(this.f16694c, this.d, str2, this.f16695f, this.h, this.f16696n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16698s;
                boolean z12 = this.v;
                Object obj3 = this.f16697r;
                String str3 = this.e;
                this.f16693b.lambda$performSendMessageRequest$82(this.f16694c, this.d, str3, this.f16695f, this.h, this.f16696n, obj3, hashMap3, z12);
                return;
        }
    }
}
