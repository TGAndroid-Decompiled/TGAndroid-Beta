package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ri implements Runnable {
    public final int f21166a;
    public final SendMessagesHelper f21167b;
    public final TLObject f21168c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f21169f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f21170n;
    public final Object f21171r;
    public final HashMap f21172s;
    public final boolean v;

    public ri(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f21166a = i10;
        this.f21167b = sendMessagesHelper;
        this.f21168c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f21169f = delayedMessage;
        this.h = z10;
        this.f21170n = delayedMessage2;
        this.f21171r = obj;
        this.f21172s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f21166a) {
            case 0:
                HashMap hashMap = this.f21172s;
                boolean z10 = this.v;
                Object obj = this.f21171r;
                String str = this.e;
                this.f21167b.lambda$performSendMessageRequest$80(this.f21168c, this.d, str, this.f21169f, this.h, this.f21170n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f21172s;
                boolean z11 = this.v;
                Object obj2 = this.f21171r;
                String str2 = this.e;
                this.f21167b.lambda$performSendMessageRequest$81(this.f21168c, this.d, str2, this.f21169f, this.h, this.f21170n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f21172s;
                boolean z12 = this.v;
                Object obj3 = this.f21171r;
                String str3 = this.e;
                this.f21167b.lambda$performSendMessageRequest$85(this.f21168c, this.d, str3, this.f21169f, this.h, this.f21170n, obj3, hashMap3, z12);
                return;
        }
    }
}
