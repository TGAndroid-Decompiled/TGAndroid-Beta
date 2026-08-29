package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f20362a = 0;
    public final SendMessagesHelper f20363b;
    public final MessageObject f20364c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f20365e;
    public final boolean f20366f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f20367n;
    public final HashMap f20368r;
    public final boolean f20369s;
    public final Object v;
    public final TLObject f20370w;
    public final TLObject f20371x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f20363b = sendMessagesHelper;
        this.v = tLObject;
        this.f20371x = tL_messages_addPollAnswer;
        this.f20370w = tLObject2;
        this.f20364c = messageObject;
        this.d = str;
        this.f20365e = delayedMessage;
        this.f20366f = z10;
        this.h = delayedMessage2;
        this.f20367n = obj;
        this.f20368r = hashMap;
        this.f20369s = z11;
    }

    @Override
    public final void run() {
        switch (this.f20362a) {
            case 0:
                HashMap hashMap = this.f20368r;
                boolean z10 = this.f20369s;
                this.f20363b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f20371x, this.f20370w, this.f20364c, this.d, this.f20365e, this.f20366f, this.h, this.f20367n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f20368r;
                boolean z11 = this.f20369s;
                this.f20363b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.o2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f20370w, (TLRPC.TL_messages_sendMedia) this.f20371x, this.f20364c, this.d, this.f20365e, this.f20366f, this.h, this.f20367n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f20363b = sendMessagesHelper;
        this.v = o2Var;
        this.f20370w = tL_inputMediaStakeDice;
        this.f20371x = tL_messages_sendMedia;
        this.f20364c = messageObject;
        this.d = str;
        this.f20365e = delayedMessage;
        this.f20366f = z10;
        this.h = delayedMessage2;
        this.f20367n = obj;
        this.f20368r = hashMap;
        this.f20369s = z11;
    }
}
