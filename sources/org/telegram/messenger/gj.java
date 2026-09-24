package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f16470a = 0;
    public final SendMessagesHelper f16471b;
    public final MessageObject f16472c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16473f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16474n;
    public final HashMap f16475r;
    public final boolean f16476s;
    public final Object v;
    public final TLObject f16477w;
    public final TLObject f16478x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16471b = sendMessagesHelper;
        this.v = tLObject;
        this.f16478x = tL_messages_addPollAnswer;
        this.f16477w = tLObject2;
        this.f16472c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16473f = z10;
        this.h = delayedMessage2;
        this.f16474n = obj;
        this.f16475r = hashMap;
        this.f16476s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16470a) {
            case 0:
                HashMap hashMap = this.f16475r;
                boolean z10 = this.f16476s;
                this.f16471b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16478x, this.f16477w, this.f16472c, this.d, this.e, this.f16473f, this.h, this.f16474n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16475r;
                boolean z11 = this.f16476s;
                this.f16471b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16477w, (TLRPC.TL_messages_sendMedia) this.f16478x, this.f16472c, this.d, this.e, this.f16473f, this.h, this.f16474n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16471b = sendMessagesHelper;
        this.v = m2Var;
        this.f16477w = tL_inputMediaStakeDice;
        this.f16478x = tL_messages_sendMedia;
        this.f16472c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16473f = z10;
        this.h = delayedMessage2;
        this.f16474n = obj;
        this.f16475r = hashMap;
        this.f16476s = z11;
    }
}
