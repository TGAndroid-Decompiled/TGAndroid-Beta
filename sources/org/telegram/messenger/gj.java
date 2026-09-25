package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f16485a = 0;
    public final SendMessagesHelper f16486b;
    public final MessageObject f16487c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16488f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16489n;
    public final HashMap f16490r;
    public final boolean f16491s;
    public final Object v;
    public final TLObject f16492w;
    public final TLObject f16493x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16486b = sendMessagesHelper;
        this.v = tLObject;
        this.f16493x = tL_messages_addPollAnswer;
        this.f16492w = tLObject2;
        this.f16487c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16488f = z10;
        this.h = delayedMessage2;
        this.f16489n = obj;
        this.f16490r = hashMap;
        this.f16491s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16485a) {
            case 0:
                HashMap hashMap = this.f16490r;
                boolean z10 = this.f16491s;
                this.f16486b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16493x, this.f16492w, this.f16487c, this.d, this.e, this.f16488f, this.h, this.f16489n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16490r;
                boolean z11 = this.f16491s;
                this.f16486b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16492w, (TLRPC.TL_messages_sendMedia) this.f16493x, this.f16487c, this.d, this.e, this.f16488f, this.h, this.f16489n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16486b = sendMessagesHelper;
        this.v = m2Var;
        this.f16492w = tL_inputMediaStakeDice;
        this.f16493x = tL_messages_sendMedia;
        this.f16487c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16488f = z10;
        this.h = delayedMessage2;
        this.f16489n = obj;
        this.f16490r = hashMap;
        this.f16491s = z11;
    }
}
