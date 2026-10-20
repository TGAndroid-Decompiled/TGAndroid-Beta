package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ni implements Runnable {
    public final int f19073a;
    public final SendMessagesHelper f19074b;
    public final TLObject f19075c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f19076f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f19077n;
    public final Object f19078r;
    public final HashMap f19079s;
    public final boolean v;

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f19073a = i10;
        this.f19074b = sendMessagesHelper;
        this.f19075c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f19076f = delayedMessage;
        this.h = z10;
        this.f19077n = delayedMessage2;
        this.f19078r = obj;
        this.f19079s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f19073a) {
            case 0:
                HashMap hashMap = this.f19079s;
                boolean z10 = this.v;
                Object obj = this.f19078r;
                String str = this.e;
                this.f19074b.lambda$performSendMessageRequest$80(this.f19075c, this.d, str, this.f19076f, this.h, this.f19077n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f19079s;
                boolean z11 = this.v;
                Object obj2 = this.f19078r;
                String str2 = this.e;
                this.f19074b.lambda$performSendMessageRequest$81(this.f19075c, this.d, str2, this.f19076f, this.h, this.f19077n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f19079s;
                boolean z12 = this.v;
                Object obj3 = this.f19078r;
                String str3 = this.e;
                this.f19074b.lambda$performSendMessageRequest$85(this.f19075c, this.d, str3, this.f19076f, this.h, this.f19077n, obj3, hashMap3, z12);
                return;
        }
    }
}
