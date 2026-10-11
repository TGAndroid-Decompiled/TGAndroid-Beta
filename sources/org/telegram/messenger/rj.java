package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f19077a = 0;
    public final SendMessagesHelper f19078b;
    public final MessageObject f19079c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19080e;
    public final boolean f19081f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19082n;
    public final HashMap f19083r;
    public final boolean f19084s;
    public final Object v;
    public final TLObject f19085w;
    public final TLObject f19086x;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19078b = sendMessagesHelper;
        this.v = tLObject;
        this.f19086x = tL_messages_addPollAnswer;
        this.f19085w = tLObject2;
        this.f19079c = messageObject;
        this.d = str;
        this.f19080e = delayedMessage;
        this.f19081f = z10;
        this.h = delayedMessage2;
        this.f19082n = obj;
        this.f19083r = hashMap;
        this.f19084s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19077a) {
            case 0:
                HashMap hashMap = this.f19083r;
                boolean z10 = this.f19084s;
                this.f19078b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19086x, this.f19085w, this.f19079c, this.d, this.f19080e, this.f19081f, this.h, this.f19082n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19083r;
                boolean z11 = this.f19084s;
                this.f19078b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19085w, (TLRPC.TL_messages_sendMedia) this.f19086x, this.f19079c, this.d, this.f19080e, this.f19081f, this.h, this.f19082n, hashMap2, z11);
                return;
        }
    }

    public rj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19078b = sendMessagesHelper;
        this.v = m2Var;
        this.f19085w = tL_inputMediaStakeDice;
        this.f19086x = tL_messages_sendMedia;
        this.f19079c = messageObject;
        this.d = str;
        this.f19080e = delayedMessage;
        this.f19081f = z10;
        this.h = delayedMessage2;
        this.f19082n = obj;
        this.f19083r = hashMap;
        this.f19084s = z11;
    }
}
