package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f17982a = 0;
    public final SendMessagesHelper f17983b;
    public final MessageObject f17984c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f17985e;
    public final boolean f17986f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17987n;
    public final HashMap f17988r;
    public final boolean f17989s;
    public final Object v;
    public final TLObject f17990w;
    public final TLObject f17991x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17983b = sendMessagesHelper;
        this.v = tLObject;
        this.f17991x = tL_messages_addPollAnswer;
        this.f17990w = tLObject2;
        this.f17984c = messageObject;
        this.d = str;
        this.f17985e = delayedMessage;
        this.f17986f = z10;
        this.h = delayedMessage2;
        this.f17987n = obj;
        this.f17988r = hashMap;
        this.f17989s = z11;
    }

    @Override
    public final void run() {
        switch (this.f17982a) {
            case 0:
                HashMap hashMap = this.f17988r;
                boolean z10 = this.f17989s;
                this.f17983b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17991x, this.f17990w, this.f17984c, this.d, this.f17985e, this.f17986f, this.h, this.f17987n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f17988r;
                boolean z11 = this.f17989s;
                this.f17983b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17990w, (TLRPC.TL_messages_sendMedia) this.f17991x, this.f17984c, this.d, this.f17985e, this.f17986f, this.h, this.f17987n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17983b = sendMessagesHelper;
        this.v = n2Var;
        this.f17990w = tL_inputMediaStakeDice;
        this.f17991x = tL_messages_sendMedia;
        this.f17984c = messageObject;
        this.d = str;
        this.f17985e = delayedMessage;
        this.f17986f = z10;
        this.h = delayedMessage2;
        this.f17987n = obj;
        this.f17988r = hashMap;
        this.f17989s = z11;
    }
}
