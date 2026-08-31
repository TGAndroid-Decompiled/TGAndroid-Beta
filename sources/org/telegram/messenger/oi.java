package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class oi implements Runnable {
    public final int f19584a;
    public final SendMessagesHelper f19585b;
    public final TLObject f19586c;
    public final MessageObject d;
    public final String f19587e;
    public final SendMessagesHelper.DelayedMessage f19588f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19589n;
    public final Object f19590r;
    public final HashMap f19591s;
    public final boolean v;

    public oi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, int i10) {
        this.f19584a = i10;
        this.f19585b = sendMessagesHelper;
        this.f19586c = tLObject;
        this.d = messageObject;
        this.f19587e = str;
        this.f19588f = delayedMessage;
        this.h = z4;
        this.f19589n = delayedMessage2;
        this.f19590r = obj;
        this.f19591s = hashMap;
        this.v = z10;
    }

    @Override
    public final void run() {
        switch (this.f19584a) {
            case 0:
                HashMap hashMap = this.f19591s;
                boolean z4 = this.v;
                Object obj = this.f19590r;
                String str = this.f19587e;
                this.f19585b.lambda$performSendMessageRequest$77(this.f19586c, this.d, str, this.f19588f, this.h, this.f19589n, obj, hashMap, z4);
                return;
            case 1:
                HashMap hashMap2 = this.f19591s;
                boolean z10 = this.v;
                Object obj2 = this.f19590r;
                String str2 = this.f19587e;
                this.f19585b.lambda$performSendMessageRequest$78(this.f19586c, this.d, str2, this.f19588f, this.h, this.f19589n, obj2, hashMap2, z10);
                return;
            default:
                HashMap hashMap3 = this.f19591s;
                boolean z11 = this.v;
                Object obj3 = this.f19590r;
                String str3 = this.f19587e;
                this.f19585b.lambda$performSendMessageRequest$82(this.f19586c, this.d, str3, this.f19588f, this.h, this.f19589n, obj3, hashMap3, z11);
                return;
        }
    }
}
