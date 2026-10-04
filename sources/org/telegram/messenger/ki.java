package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f18389a;
    public final SendMessagesHelper f18390b;
    public final TLObject f18391c;
    public final MessageObject d;
    public final String f18392e;
    public final SendMessagesHelper.DelayedMessage f18393f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18394n;
    public final Object f18395r;
    public final HashMap f18396s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18389a = i10;
        this.f18390b = sendMessagesHelper;
        this.f18391c = tLObject;
        this.d = messageObject;
        this.f18392e = str;
        this.f18393f = delayedMessage;
        this.h = z10;
        this.f18394n = delayedMessage2;
        this.f18395r = obj;
        this.f18396s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18389a) {
            case 0:
                HashMap hashMap = this.f18396s;
                boolean z10 = this.v;
                Object obj = this.f18395r;
                String str = this.f18392e;
                this.f18390b.lambda$performSendMessageRequest$77(this.f18391c, this.d, str, this.f18393f, this.h, this.f18394n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18396s;
                boolean z11 = this.v;
                Object obj2 = this.f18395r;
                String str2 = this.f18392e;
                this.f18390b.lambda$performSendMessageRequest$78(this.f18391c, this.d, str2, this.f18393f, this.h, this.f18394n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18396s;
                boolean z12 = this.v;
                Object obj3 = this.f18395r;
                String str3 = this.f18392e;
                this.f18390b.lambda$performSendMessageRequest$82(this.f18391c, this.d, str3, this.f18393f, this.h, this.f18394n, obj3, hashMap3, z12);
                return;
        }
    }
}
