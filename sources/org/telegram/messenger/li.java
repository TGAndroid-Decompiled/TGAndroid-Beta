package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f18901a;
    public final SendMessagesHelper f18902b;
    public final TLObject f18903c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18904f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18905n;
    public final Object f18906r;
    public final HashMap f18907s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18901a = i10;
        this.f18902b = sendMessagesHelper;
        this.f18903c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18904f = delayedMessage;
        this.h = z10;
        this.f18905n = delayedMessage2;
        this.f18906r = obj;
        this.f18907s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18901a) {
            case 0:
                HashMap hashMap = this.f18907s;
                boolean z10 = this.v;
                Object obj = this.f18906r;
                String str = this.e;
                this.f18902b.lambda$performSendMessageRequest$80(this.f18903c, this.d, str, this.f18904f, this.h, this.f18905n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18907s;
                boolean z11 = this.v;
                Object obj2 = this.f18906r;
                String str2 = this.e;
                this.f18902b.lambda$performSendMessageRequest$81(this.f18903c, this.d, str2, this.f18904f, this.h, this.f18905n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18907s;
                boolean z12 = this.v;
                Object obj3 = this.f18906r;
                String str3 = this.e;
                this.f18902b.lambda$performSendMessageRequest$85(this.f18903c, this.d, str3, this.f18904f, this.h, this.f18905n, obj3, hashMap3, z12);
                return;
        }
    }
}
