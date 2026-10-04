package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f18068a = 0;
    public final SendMessagesHelper f18069b;
    public final MessageObject f18070c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f18071e;
    public final boolean f18072f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f18073n;
    public final HashMap f18074r;
    public final boolean f18075s;
    public final Object v;
    public final TLObject f18076w;
    public final TLObject f18077x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18069b = sendMessagesHelper;
        this.v = tLObject;
        this.f18077x = tL_messages_addPollAnswer;
        this.f18076w = tLObject2;
        this.f18070c = messageObject;
        this.d = str;
        this.f18071e = delayedMessage;
        this.f18072f = z10;
        this.h = delayedMessage2;
        this.f18073n = obj;
        this.f18074r = hashMap;
        this.f18075s = z11;
    }

    @Override
    public final void run() {
        switch (this.f18068a) {
            case 0:
                HashMap hashMap = this.f18074r;
                boolean z10 = this.f18075s;
                this.f18069b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f18077x, this.f18076w, this.f18070c, this.d, this.f18071e, this.f18072f, this.h, this.f18073n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f18074r;
                boolean z11 = this.f18075s;
                this.f18069b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f18076w, (TLRPC.TL_messages_sendMedia) this.f18077x, this.f18070c, this.d, this.f18071e, this.f18072f, this.h, this.f18073n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18069b = sendMessagesHelper;
        this.v = n2Var;
        this.f18076w = tL_inputMediaStakeDice;
        this.f18077x = tL_messages_sendMedia;
        this.f18070c = messageObject;
        this.d = str;
        this.f18071e = delayedMessage;
        this.f18072f = z10;
        this.h = delayedMessage2;
        this.f18073n = obj;
        this.f18074r = hashMap;
        this.f18075s = z11;
    }
}
