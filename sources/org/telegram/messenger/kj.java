package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f17697a = 0;
    public final SendMessagesHelper f17698b;
    public final MessageObject f17699c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f17700f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17701n;
    public final HashMap f17702r;
    public final boolean f17703s;
    public final Object v;
    public final TLObject f17704w;
    public final TLObject f17705x;

    public kj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f17698b = sendMessagesHelper;
        this.v = tLObject;
        this.f17705x = tL_messages_addPollAnswer;
        this.f17704w = tLObject2;
        this.f17699c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17700f = z4;
        this.h = delayedMessage2;
        this.f17701n = obj;
        this.f17702r = hashMap;
        this.f17703s = z10;
    }

    @Override
    public final void run() {
        switch (this.f17697a) {
            case 0:
                HashMap hashMap = this.f17702r;
                boolean z4 = this.f17703s;
                this.f17698b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17705x, this.f17704w, this.f17699c, this.d, this.e, this.f17700f, this.h, this.f17701n, hashMap, z4);
                return;
            default:
                HashMap hashMap2 = this.f17702r;
                boolean z10 = this.f17703s;
                this.f17698b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.p2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17704w, (TLRPC.TL_messages_sendMedia) this.f17705x, this.f17699c, this.d, this.e, this.f17700f, this.h, this.f17701n, hashMap2, z10);
                return;
        }
    }

    public kj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f17698b = sendMessagesHelper;
        this.v = p2Var;
        this.f17704w = tL_inputMediaStakeDice;
        this.f17705x = tL_messages_sendMedia;
        this.f17699c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17700f = z4;
        this.h = delayedMessage2;
        this.f17701n = obj;
        this.f17702r = hashMap;
        this.f17703s = z10;
    }
}
