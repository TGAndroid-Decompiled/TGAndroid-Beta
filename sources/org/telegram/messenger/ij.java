package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f18013a = 0;
    public final SendMessagesHelper f18014b;
    public final MessageObject f18015c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f18016e;
    public final boolean f18017f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f18018n;
    public final HashMap f18019r;
    public final boolean f18020s;
    public final Object v;
    public final TLObject f18021w;
    public final TLObject f18022x;

    public ij(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18014b = sendMessagesHelper;
        this.v = tLObject;
        this.f18022x = tL_messages_addPollAnswer;
        this.f18021w = tLObject2;
        this.f18015c = messageObject;
        this.d = str;
        this.f18016e = delayedMessage;
        this.f18017f = z10;
        this.h = delayedMessage2;
        this.f18018n = obj;
        this.f18019r = hashMap;
        this.f18020s = z11;
    }

    @Override
    public final void run() {
        switch (this.f18013a) {
            case 0:
                HashMap hashMap = this.f18019r;
                boolean z10 = this.f18020s;
                this.f18014b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f18022x, this.f18021w, this.f18015c, this.d, this.f18016e, this.f18017f, this.h, this.f18018n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f18019r;
                boolean z11 = this.f18020s;
                this.f18014b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f18021w, (TLRPC.TL_messages_sendMedia) this.f18022x, this.f18015c, this.d, this.f18016e, this.f18017f, this.h, this.f18018n, hashMap2, z11);
                return;
        }
    }

    public ij(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18014b = sendMessagesHelper;
        this.v = n2Var;
        this.f18021w = tL_inputMediaStakeDice;
        this.f18022x = tL_messages_sendMedia;
        this.f18015c = messageObject;
        this.d = str;
        this.f18016e = delayedMessage;
        this.f18017f = z10;
        this.h = delayedMessage2;
        this.f18018n = obj;
        this.f18019r = hashMap;
        this.f18020s = z11;
    }
}
