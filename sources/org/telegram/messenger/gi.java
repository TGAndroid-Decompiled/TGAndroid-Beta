package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

public final class gi implements Runnable {

    public final int f20402a;

    public final SendMessagesHelper f20403b;

    public final TLObject f20404c;
    public final MessageObject d;

    public final String f20405e;

    public final SendMessagesHelper.DelayedMessage f20406f;
    public final boolean h;

    public final SendMessagesHelper.DelayedMessage f20407n;

    public final Object f20408r;

    public final HashMap f20409s;
    public final boolean v;

    public gi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z11, int i10) {
        this.f20402a = i10;
        this.f20403b = sendMessagesHelper;
        this.f20404c = tLObject;
        this.d = messageObject;
        this.f20405e = str;
        this.f20406f = delayedMessage;
        this.h = z10;
        this.f20407n = delayedMessage2;
        this.f20408r = obj;
        this.f20409s = map;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f20402a) {
            case 0:
                HashMap map = this.f20409s;
                boolean z10 = this.v;
                Object obj = this.f20408r;
                String str = this.f20405e;
                this.f20403b.lambda$performSendMessageRequest$77(this.f20404c, this.d, str, this.f20406f, this.h, this.f20407n, obj, map, z10);
                break;
            case 1:
                HashMap map2 = this.f20409s;
                boolean z11 = this.v;
                Object obj2 = this.f20408r;
                String str2 = this.f20405e;
                this.f20403b.lambda$performSendMessageRequest$78(this.f20404c, this.d, str2, this.f20406f, this.h, this.f20407n, obj2, map2, z11);
                break;
            default:
                HashMap map3 = this.f20409s;
                boolean z12 = this.v;
                Object obj3 = this.f20408r;
                String str3 = this.f20405e;
                this.f20403b.lambda$performSendMessageRequest$82(this.f20404c, this.d, str3, this.f20406f, this.h, this.f20407n, obj3, map3, z12);
                break;
        }
    }
}
