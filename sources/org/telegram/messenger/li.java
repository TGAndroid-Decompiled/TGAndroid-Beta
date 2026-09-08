package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f18319a;
    public final SendMessagesHelper f18320b;
    public final TLObject f18321c;
    public final MessageObject d;
    public final String f18322e;
    public final SendMessagesHelper.DelayedMessage f18323f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18324n;
    public final Object f18325r;
    public final HashMap f18326s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18319a = i10;
        this.f18320b = sendMessagesHelper;
        this.f18321c = tLObject;
        this.d = messageObject;
        this.f18322e = str;
        this.f18323f = delayedMessage;
        this.h = z10;
        this.f18324n = delayedMessage2;
        this.f18325r = obj;
        this.f18326s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18319a) {
            case 0:
                HashMap hashMap = this.f18326s;
                boolean z10 = this.v;
                Object obj = this.f18325r;
                String str = this.f18322e;
                this.f18320b.lambda$performSendMessageRequest$77(this.f18321c, this.d, str, this.f18323f, this.h, this.f18324n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18326s;
                boolean z11 = this.v;
                Object obj2 = this.f18325r;
                String str2 = this.f18322e;
                this.f18320b.lambda$performSendMessageRequest$78(this.f18321c, this.d, str2, this.f18323f, this.h, this.f18324n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18326s;
                boolean z12 = this.v;
                Object obj3 = this.f18325r;
                String str3 = this.f18322e;
                this.f18320b.lambda$performSendMessageRequest$82(this.f18321c, this.d, str3, this.f18323f, this.h, this.f18324n, obj3, hashMap3, z12);
                return;
        }
    }
}
