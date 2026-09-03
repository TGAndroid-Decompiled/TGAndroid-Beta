package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class oi implements Runnable {
    public final int f19586a;
    public final SendMessagesHelper f19587b;
    public final TLObject f19588c;
    public final MessageObject d;
    public final String f19589e;
    public final SendMessagesHelper.DelayedMessage f19590f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19591n;
    public final Object f19592r;
    public final HashMap f19593s;
    public final boolean v;

    public oi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, int i10) {
        this.f19586a = i10;
        this.f19587b = sendMessagesHelper;
        this.f19588c = tLObject;
        this.d = messageObject;
        this.f19589e = str;
        this.f19590f = delayedMessage;
        this.h = z4;
        this.f19591n = delayedMessage2;
        this.f19592r = obj;
        this.f19593s = hashMap;
        this.v = z10;
    }

    @Override
    public final void run() {
        switch (this.f19586a) {
            case 0:
                HashMap hashMap = this.f19593s;
                boolean z4 = this.v;
                Object obj = this.f19592r;
                String str = this.f19589e;
                this.f19587b.lambda$performSendMessageRequest$77(this.f19588c, this.d, str, this.f19590f, this.h, this.f19591n, obj, hashMap, z4);
                return;
            case 1:
                HashMap hashMap2 = this.f19593s;
                boolean z10 = this.v;
                Object obj2 = this.f19592r;
                String str2 = this.f19589e;
                this.f19587b.lambda$performSendMessageRequest$78(this.f19588c, this.d, str2, this.f19590f, this.h, this.f19591n, obj2, hashMap2, z10);
                return;
            default:
                HashMap hashMap3 = this.f19593s;
                boolean z11 = this.v;
                Object obj3 = this.f19592r;
                String str3 = this.f19589e;
                this.f19587b.lambda$performSendMessageRequest$82(this.f19588c, this.d, str3, this.f19590f, this.h, this.f19591n, obj3, hashMap3, z11);
                return;
        }
    }
}
