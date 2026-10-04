package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f17981a = 0;
    public final SendMessagesHelper f17982b;
    public final MessageObject f17983c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f17984e;
    public final boolean f17985f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17986n;
    public final HashMap f17987r;
    public final boolean f17988s;
    public final Object v;
    public final TLObject f17989w;
    public final TLObject f17990x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17982b = sendMessagesHelper;
        this.v = tLObject;
        this.f17990x = tL_messages_addPollAnswer;
        this.f17989w = tLObject2;
        this.f17983c = messageObject;
        this.d = str;
        this.f17984e = delayedMessage;
        this.f17985f = z10;
        this.h = delayedMessage2;
        this.f17986n = obj;
        this.f17987r = hashMap;
        this.f17988s = z11;
    }

    @Override
    public final void run() {
        switch (this.f17981a) {
            case 0:
                HashMap hashMap = this.f17987r;
                boolean z10 = this.f17988s;
                this.f17982b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17990x, this.f17989w, this.f17983c, this.d, this.f17984e, this.f17985f, this.h, this.f17986n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f17987r;
                boolean z11 = this.f17988s;
                this.f17982b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17989w, (TLRPC.TL_messages_sendMedia) this.f17990x, this.f17983c, this.d, this.f17984e, this.f17985f, this.h, this.f17986n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17982b = sendMessagesHelper;
        this.v = n2Var;
        this.f17989w = tL_inputMediaStakeDice;
        this.f17990x = tL_messages_sendMedia;
        this.f17983c = messageObject;
        this.d = str;
        this.f17984e = delayedMessage;
        this.f17985f = z10;
        this.h = delayedMessage2;
        this.f17986n = obj;
        this.f17987r = hashMap;
        this.f17988s = z11;
    }
}
