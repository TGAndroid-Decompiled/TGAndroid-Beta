package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class si implements Runnable {
    public final int f18127a;
    public final SendMessagesHelper f18128b;
    public final TLObject f18129c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18130f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18131n;
    public final Object f18132r;
    public final HashMap f18133s;
    public final boolean v;

    public si(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18127a = i10;
        this.f18128b = sendMessagesHelper;
        this.f18129c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18130f = delayedMessage;
        this.h = z10;
        this.f18131n = delayedMessage2;
        this.f18132r = obj;
        this.f18133s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18127a) {
            case 0:
                HashMap hashMap = this.f18133s;
                boolean z10 = this.v;
                Object obj = this.f18132r;
                String str = this.e;
                this.f18128b.lambda$performSendMessageRequest$80(this.f18129c, this.d, str, this.f18130f, this.h, this.f18131n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18133s;
                boolean z11 = this.v;
                Object obj2 = this.f18132r;
                String str2 = this.e;
                this.f18128b.lambda$performSendMessageRequest$81(this.f18129c, this.d, str2, this.f18130f, this.h, this.f18131n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18133s;
                boolean z12 = this.v;
                Object obj3 = this.f18132r;
                String str3 = this.e;
                this.f18128b.lambda$performSendMessageRequest$85(this.f18129c, this.d, str3, this.f18130f, this.h, this.f18131n, obj3, hashMap3, z12);
                return;
        }
    }
}
