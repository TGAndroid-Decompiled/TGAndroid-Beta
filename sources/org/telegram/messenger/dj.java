package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class dj implements Runnable {

    public final int f20067a = 0;

    public final SendMessagesHelper f20068b;

    public final MessageObject f20069c;
    public final String d;

    public final SendMessagesHelper.DelayedMessage f20070e;

    public final boolean f20071f;
    public final SendMessagesHelper.DelayedMessage h;

    public final Object f20072n;

    public final HashMap f20073r;

    public final boolean f20074s;
    public final Object v;

    public final TLObject f20075w;

    public final TLObject f20076x;

    public dj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z11) {
        this.f20068b = sendMessagesHelper;
        this.v = tLObject;
        this.f20076x = tL_messages_addPollAnswer;
        this.f20075w = tLObject2;
        this.f20069c = messageObject;
        this.d = str;
        this.f20070e = delayedMessage;
        this.f20071f = z10;
        this.h = delayedMessage2;
        this.f20072n = obj;
        this.f20073r = map;
        this.f20074s = z11;
    }

    @Override
    public final void run() {
        switch (this.f20067a) {
            case 0:
                this.f20068b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f20076x, this.f20075w, this.f20069c, this.d, this.f20070e, this.f20071f, this.h, this.f20072n, this.f20073r, this.f20074s);
                break;
            default:
                this.f20068b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f20075w, (TLRPC.TL_messages_sendMedia) this.f20076x, this.f20069c, this.d, this.f20070e, this.f20071f, this.h, this.f20072n, this.f20073r, this.f20074s);
                break;
        }
    }

    public dj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z11) {
        this.f20068b = sendMessagesHelper;
        this.v = n2Var;
        this.f20075w = tL_inputMediaStakeDice;
        this.f20076x = tL_messages_sendMedia;
        this.f20069c = messageObject;
        this.d = str;
        this.f20070e = delayedMessage;
        this.f20071f = z10;
        this.h = delayedMessage2;
        this.f20072n = obj;
        this.f20073r = map;
        this.f20074s = z11;
    }
}
