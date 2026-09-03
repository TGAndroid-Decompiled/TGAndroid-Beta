package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class oi implements Runnable {
    public final int f18017a;
    public final SendMessagesHelper f18018b;
    public final TLObject f18019c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f18020f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18021n;
    public final Object f18022r;
    public final HashMap f18023s;
    public final boolean v;

    public oi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, int i10) {
        this.f18017a = i10;
        this.f18018b = sendMessagesHelper;
        this.f18019c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f18020f = delayedMessage;
        this.h = z4;
        this.f18021n = delayedMessage2;
        this.f18022r = obj;
        this.f18023s = hashMap;
        this.v = z10;
    }

    @Override
    public final void run() {
        switch (this.f18017a) {
            case 0:
                HashMap hashMap = this.f18023s;
                boolean z4 = this.v;
                Object obj = this.f18022r;
                String str = this.e;
                this.f18018b.lambda$performSendMessageRequest$77(this.f18019c, this.d, str, this.f18020f, this.h, this.f18021n, obj, hashMap, z4);
                return;
            case 1:
                HashMap hashMap2 = this.f18023s;
                boolean z10 = this.v;
                Object obj2 = this.f18022r;
                String str2 = this.e;
                this.f18018b.lambda$performSendMessageRequest$78(this.f18019c, this.d, str2, this.f18020f, this.h, this.f18021n, obj2, hashMap2, z10);
                return;
            default:
                HashMap hashMap3 = this.f18023s;
                boolean z11 = this.v;
                Object obj3 = this.f18022r;
                String str3 = this.e;
                this.f18018b.lambda$performSendMessageRequest$82(this.f18019c, this.d, str3, this.f18020f, this.h, this.f18021n, obj3, hashMap3, z11);
                return;
        }
    }
}
