package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f19075a = 0;
    public final SendMessagesHelper f19076b;
    public final MessageObject f19077c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19078e;
    public final boolean f19079f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19080n;
    public final HashMap f19081r;
    public final boolean f19082s;
    public final Object v;
    public final TLObject f19083w;
    public final TLObject f19084x;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19076b = sendMessagesHelper;
        this.v = tLObject;
        this.f19084x = tL_messages_addPollAnswer;
        this.f19083w = tLObject2;
        this.f19077c = messageObject;
        this.d = str;
        this.f19078e = delayedMessage;
        this.f19079f = z10;
        this.h = delayedMessage2;
        this.f19080n = obj;
        this.f19081r = hashMap;
        this.f19082s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19075a) {
            case 0:
                HashMap hashMap = this.f19081r;
                boolean z10 = this.f19082s;
                this.f19076b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19084x, this.f19083w, this.f19077c, this.d, this.f19078e, this.f19079f, this.h, this.f19080n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19081r;
                boolean z11 = this.f19082s;
                this.f19076b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19083w, (TLRPC.TL_messages_sendMedia) this.f19084x, this.f19077c, this.d, this.f19078e, this.f19079f, this.h, this.f19080n, hashMap2, z11);
                return;
        }
    }

    public rj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19076b = sendMessagesHelper;
        this.v = n2Var;
        this.f19083w = tL_inputMediaStakeDice;
        this.f19084x = tL_messages_sendMedia;
        this.f19077c = messageObject;
        this.d = str;
        this.f19078e = delayedMessage;
        this.f19079f = z10;
        this.h = delayedMessage2;
        this.f19080n = obj;
        this.f19081r = hashMap;
        this.f19082s = z11;
    }
}
