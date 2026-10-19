package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f19083a = 0;
    public final SendMessagesHelper f19084b;
    public final MessageObject f19085c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19086f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19087n;
    public final HashMap f19088r;
    public final boolean f19089s;
    public final Object v;
    public final TLObject f19090w;
    public final TLObject f19091x;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19084b = sendMessagesHelper;
        this.v = tLObject;
        this.f19091x = tL_messages_addPollAnswer;
        this.f19090w = tLObject2;
        this.f19085c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19086f = z10;
        this.h = delayedMessage2;
        this.f19087n = obj;
        this.f19088r = hashMap;
        this.f19089s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19083a) {
            case 0:
                HashMap hashMap = this.f19088r;
                boolean z10 = this.f19089s;
                this.f19084b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19091x, this.f19090w, this.f19085c, this.d, this.e, this.f19086f, this.h, this.f19087n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19088r;
                boolean z11 = this.f19089s;
                this.f19084b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19090w, (TLRPC.TL_messages_sendMedia) this.f19091x, this.f19085c, this.d, this.e, this.f19086f, this.h, this.f19087n, hashMap2, z11);
                return;
        }
    }

    public nj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19084b = sendMessagesHelper;
        this.v = n2Var;
        this.f19090w = tL_inputMediaStakeDice;
        this.f19091x = tL_messages_sendMedia;
        this.f19085c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19086f = z10;
        this.h = delayedMessage2;
        this.f19087n = obj;
        this.f19088r = hashMap;
        this.f19089s = z11;
    }
}
