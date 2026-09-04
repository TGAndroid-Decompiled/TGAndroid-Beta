package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f17986a = 0;
    public final SendMessagesHelper f17987b;
    public final MessageObject f17988c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f17989e;
    public final boolean f17990f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17991n;
    public final HashMap f17992r;
    public final boolean f17993s;
    public final Object v;
    public final TLObject f17994w;
    public final TLObject f17995x;

    public ij(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17987b = sendMessagesHelper;
        this.v = tLObject;
        this.f17995x = tL_messages_addPollAnswer;
        this.f17994w = tLObject2;
        this.f17988c = messageObject;
        this.d = str;
        this.f17989e = delayedMessage;
        this.f17990f = z10;
        this.h = delayedMessage2;
        this.f17991n = obj;
        this.f17992r = hashMap;
        this.f17993s = z11;
    }

    @Override
    public final void run() {
        switch (this.f17986a) {
            case 0:
                HashMap hashMap = this.f17992r;
                boolean z10 = this.f17993s;
                this.f17987b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17995x, this.f17994w, this.f17988c, this.d, this.f17989e, this.f17990f, this.h, this.f17991n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f17992r;
                boolean z11 = this.f17993s;
                this.f17987b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17994w, (TLRPC.TL_messages_sendMedia) this.f17995x, this.f17988c, this.d, this.f17989e, this.f17990f, this.h, this.f17991n, hashMap2, z11);
                return;
        }
    }

    public ij(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17987b = sendMessagesHelper;
        this.v = n2Var;
        this.f17994w = tL_inputMediaStakeDice;
        this.f17995x = tL_messages_sendMedia;
        this.f17988c = messageObject;
        this.d = str;
        this.f17989e = delayedMessage;
        this.f17990f = z10;
        this.h = delayedMessage2;
        this.f17991n = obj;
        this.f17992r = hashMap;
        this.f17993s = z11;
    }
}
