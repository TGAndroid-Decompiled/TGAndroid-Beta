package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f16430a = 0;
    public final SendMessagesHelper f16431b;
    public final MessageObject f16432c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16433f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16434n;
    public final HashMap f16435r;
    public final boolean f16436s;
    public final Object v;
    public final TLObject f16437w;
    public final TLObject f16438x;

    public ij(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16431b = sendMessagesHelper;
        this.v = tLObject;
        this.f16438x = tL_messages_addPollAnswer;
        this.f16437w = tLObject2;
        this.f16432c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16433f = z10;
        this.h = delayedMessage2;
        this.f16434n = obj;
        this.f16435r = hashMap;
        this.f16436s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16430a) {
            case 0:
                HashMap hashMap = this.f16435r;
                boolean z10 = this.f16436s;
                this.f16431b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16438x, this.f16437w, this.f16432c, this.d, this.e, this.f16433f, this.h, this.f16434n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16435r;
                boolean z11 = this.f16436s;
                this.f16431b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.o2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16437w, (TLRPC.TL_messages_sendMedia) this.f16438x, this.f16432c, this.d, this.e, this.f16433f, this.h, this.f16434n, hashMap2, z11);
                return;
        }
    }

    public ij(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16431b = sendMessagesHelper;
        this.v = o2Var;
        this.f16437w = tL_inputMediaStakeDice;
        this.f16438x = tL_messages_sendMedia;
        this.f16432c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16433f = z10;
        this.h = delayedMessage2;
        this.f16434n = obj;
        this.f16435r = hashMap;
        this.f16436s = z11;
    }
}
