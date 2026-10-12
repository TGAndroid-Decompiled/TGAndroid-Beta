package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f19597a = 0;
    public final SendMessagesHelper f19598b;
    public final MessageObject f19599c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19600e;
    public final boolean f19601f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19602n;
    public final HashMap f19603r;
    public final boolean f19604s;
    public final Object v;
    public final TLObject f19605w;
    public final TLObject f19606x;

    public xj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19598b = sendMessagesHelper;
        this.v = tLObject;
        this.f19606x = tL_messages_addPollAnswer;
        this.f19605w = tLObject2;
        this.f19599c = messageObject;
        this.d = str;
        this.f19600e = delayedMessage;
        this.f19601f = z10;
        this.h = delayedMessage2;
        this.f19602n = obj;
        this.f19603r = hashMap;
        this.f19604s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19597a) {
            case 0:
                HashMap hashMap = this.f19603r;
                boolean z10 = this.f19604s;
                this.f19598b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19606x, this.f19605w, this.f19599c, this.d, this.f19600e, this.f19601f, this.h, this.f19602n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19603r;
                boolean z11 = this.f19604s;
                this.f19598b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19605w, (TLRPC.TL_messages_sendMedia) this.f19606x, this.f19599c, this.d, this.f19600e, this.f19601f, this.h, this.f19602n, hashMap2, z11);
                return;
        }
    }

    public xj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19598b = sendMessagesHelper;
        this.v = m2Var;
        this.f19605w = tL_inputMediaStakeDice;
        this.f19606x = tL_messages_sendMedia;
        this.f19599c = messageObject;
        this.d = str;
        this.f19600e = delayedMessage;
        this.f19601f = z10;
        this.h = delayedMessage2;
        this.f19602n = obj;
        this.f19603r = hashMap;
        this.f19604s = z11;
    }
}
