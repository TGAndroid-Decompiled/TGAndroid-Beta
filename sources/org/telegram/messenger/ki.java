package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class ki implements Runnable {
    public final int f18212a;
    public final SendMessagesHelper f18213b;
    public final TLObject f18214c;
    public final MessageObject d;
    public final String f18215e;
    public final SendMessagesHelper.DelayedMessage f18216f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f18217n;
    public final Object f18218r;
    public final HashMap f18219s;
    public final boolean v;

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f18212a = i10;
        this.f18213b = sendMessagesHelper;
        this.f18214c = tLObject;
        this.d = messageObject;
        this.f18215e = str;
        this.f18216f = delayedMessage;
        this.h = z10;
        this.f18217n = delayedMessage2;
        this.f18218r = obj;
        this.f18219s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f18212a) {
            case 0:
                HashMap hashMap = this.f18219s;
                boolean z10 = this.v;
                Object obj = this.f18218r;
                String str = this.f18215e;
                this.f18213b.lambda$performSendMessageRequest$77(this.f18214c, this.d, str, this.f18216f, this.h, this.f18217n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f18219s;
                boolean z11 = this.v;
                Object obj2 = this.f18218r;
                String str2 = this.f18215e;
                this.f18213b.lambda$performSendMessageRequest$78(this.f18214c, this.d, str2, this.f18216f, this.h, this.f18217n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f18219s;
                boolean z12 = this.v;
                Object obj3 = this.f18218r;
                String str3 = this.f18215e;
                this.f18213b.lambda$performSendMessageRequest$82(this.f18214c, this.d, str3, this.f18216f, this.h, this.f18217n, obj3, hashMap3, z12);
                return;
        }
    }
}
