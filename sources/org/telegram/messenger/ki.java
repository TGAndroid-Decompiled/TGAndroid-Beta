package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f18388a;
    public final SendMessagesHelper f18389b;
    public final TLObject f18390c;
    public final MessageObject d;
    public final String f18391e;
    public final SendMessagesHelper.DelayedMessage f18392f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18393n;
    public final Object f18394r;
    public final HashMap f18395s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18388a = i10;
        this.f18389b = sendMessagesHelper;
        this.f18390c = tLObject;
        this.d = messageObject;
        this.f18391e = str;
        this.f18392f = delayedMessage;
        this.h = z10;
        this.f18393n = delayedMessage2;
        this.f18394r = obj;
        this.f18395s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18388a) {
            case 0:
                HashMap hashMap = this.f18395s;
                boolean z10 = this.v;
                Object obj = this.f18394r;
                String str = this.f18391e;
                this.f18389b.lambda$performSendMessageRequest$77(this.f18390c, this.d, str, this.f18392f, this.h, this.f18393n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18395s;
                boolean z11 = this.v;
                Object obj2 = this.f18394r;
                String str2 = this.f18391e;
                this.f18389b.lambda$performSendMessageRequest$78(this.f18390c, this.d, str2, this.f18392f, this.h, this.f18393n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18395s;
                boolean z12 = this.v;
                Object obj3 = this.f18394r;
                String str3 = this.f18391e;
                this.f18389b.lambda$performSendMessageRequest$82(this.f18390c, this.d, str3, this.f18392f, this.h, this.f18393n, obj3, hashMap3, z12);
                return;
        }
    }
}
