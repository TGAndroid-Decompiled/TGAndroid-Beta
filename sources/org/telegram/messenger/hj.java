package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f16569a = 0;
    public final SendMessagesHelper f16570b;
    public final MessageObject f16571c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16572f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16573n;
    public final HashMap f16574r;
    public final boolean f16575s;
    public final Object v;
    public final TLObject f16576w;
    public final TLObject f16577x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16570b = sendMessagesHelper;
        this.v = tLObject;
        this.f16577x = tL_messages_addPollAnswer;
        this.f16576w = tLObject2;
        this.f16571c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16572f = z10;
        this.h = delayedMessage2;
        this.f16573n = obj;
        this.f16574r = hashMap;
        this.f16575s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16569a) {
            case 0:
                HashMap hashMap = this.f16574r;
                boolean z10 = this.f16575s;
                this.f16570b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16577x, this.f16576w, this.f16571c, this.d, this.e, this.f16572f, this.h, this.f16573n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16574r;
                boolean z11 = this.f16575s;
                this.f16570b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16576w, (TLRPC.TL_messages_sendMedia) this.f16577x, this.f16571c, this.d, this.e, this.f16572f, this.h, this.f16573n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16570b = sendMessagesHelper;
        this.v = n2Var;
        this.f16576w = tL_inputMediaStakeDice;
        this.f16577x = tL_messages_sendMedia;
        this.f16571c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16572f = z10;
        this.h = delayedMessage2;
        this.f16573n = obj;
        this.f16574r = hashMap;
        this.f16575s = z11;
    }
}
