package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18073a = 0;
    public final SendMessagesHelper f18074b;
    public final MessageObject f18075c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f18076e;
    public final boolean f18077f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f18078n;
    public final HashMap f18079r;
    public final boolean f18080s;
    public final Object v;
    public final TLObject f18081w;
    public final TLObject f18082x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18074b = sendMessagesHelper;
        this.v = tLObject;
        this.f18082x = tL_messages_addPollAnswer;
        this.f18081w = tLObject2;
        this.f18075c = messageObject;
        this.d = str;
        this.f18076e = delayedMessage;
        this.f18077f = z10;
        this.h = delayedMessage2;
        this.f18078n = obj;
        this.f18079r = hashMap;
        this.f18080s = z11;
    }

    @Override
    public final void run() {
        switch (this.f18073a) {
            case 0:
                HashMap hashMap = this.f18079r;
                boolean z10 = this.f18080s;
                this.f18074b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f18082x, this.f18081w, this.f18075c, this.d, this.f18076e, this.f18077f, this.h, this.f18078n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f18079r;
                boolean z11 = this.f18080s;
                this.f18074b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f18081w, (TLRPC.TL_messages_sendMedia) this.f18082x, this.f18075c, this.d, this.f18076e, this.f18077f, this.h, this.f18078n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18074b = sendMessagesHelper;
        this.v = n2Var;
        this.f18081w = tL_inputMediaStakeDice;
        this.f18082x = tL_messages_sendMedia;
        this.f18075c = messageObject;
        this.d = str;
        this.f18076e = delayedMessage;
        this.f18077f = z10;
        this.h = delayedMessage2;
        this.f18078n = obj;
        this.f18079r = hashMap;
        this.f18080s = z11;
    }
}
