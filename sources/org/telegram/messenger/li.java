package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
public final class li implements Runnable {
    public final int f16911a;
    public final SendMessagesHelper f16912b;
    public final TLObject f16913c;
    public final MessageObject d;
    public final String e;
    public final SendMessagesHelper.DelayedMessage f16914f;
    public final boolean h;
    public final SendMessagesHelper.DelayedMessage f16915n;
    public final Object f16916r;
    public final HashMap f16917s;
    public final boolean v;

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f16911a = i10;
        this.f16912b = sendMessagesHelper;
        this.f16913c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f16914f = delayedMessage;
        this.h = z10;
        this.f16915n = delayedMessage2;
        this.f16916r = obj;
        this.f16917s = hashMap;
        this.v = z11;
    }

    @Override
    public final void run() {
        switch (this.f16911a) {
            case 0:
                HashMap hashMap = this.f16917s;
                boolean z10 = this.v;
                Object obj = this.f16916r;
                String str = this.e;
                this.f16912b.lambda$performSendMessageRequest$77(this.f16913c, this.d, str, this.f16914f, this.h, this.f16915n, obj, hashMap, z10);
                return;
            case 1:
                HashMap hashMap2 = this.f16917s;
                boolean z11 = this.v;
                Object obj2 = this.f16916r;
                String str2 = this.e;
                this.f16912b.lambda$performSendMessageRequest$78(this.f16913c, this.d, str2, this.f16914f, this.h, this.f16915n, obj2, hashMap2, z11);
                return;
            default:
                HashMap hashMap3 = this.f16917s;
                boolean z12 = this.v;
                Object obj3 = this.f16916r;
                String str3 = this.e;
                this.f16912b.lambda$performSendMessageRequest$82(this.f16913c, this.d, str3, this.f16914f, this.h, this.f16915n, obj3, hashMap3, z12);
                return;
        }
    }
}
