package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f16584a = 0;
    public final SendMessagesHelper f16585b;
    public final MessageObject f16586c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16587f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16588n;
    public final HashMap f16589r;
    public final boolean f16590s;
    public final Object v;
    public final TLObject f16591w;
    public final TLObject f16592x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16585b = sendMessagesHelper;
        this.v = tLObject;
        this.f16592x = tL_messages_addPollAnswer;
        this.f16591w = tLObject2;
        this.f16586c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16587f = z10;
        this.h = delayedMessage2;
        this.f16588n = obj;
        this.f16589r = hashMap;
        this.f16590s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16584a) {
            case 0:
                HashMap hashMap = this.f16589r;
                boolean z10 = this.f16590s;
                this.f16585b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16592x, this.f16591w, this.f16586c, this.d, this.e, this.f16587f, this.h, this.f16588n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16589r;
                boolean z11 = this.f16590s;
                this.f16585b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16591w, (TLRPC.TL_messages_sendMedia) this.f16592x, this.f16586c, this.d, this.e, this.f16587f, this.h, this.f16588n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16585b = sendMessagesHelper;
        this.v = n2Var;
        this.f16591w = tL_inputMediaStakeDice;
        this.f16592x = tL_messages_sendMedia;
        this.f16586c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16587f = z10;
        this.h = delayedMessage2;
        this.f16588n = obj;
        this.f16589r = hashMap;
        this.f16590s = z11;
    }
}
