package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f19071a = 0;
    public final SendMessagesHelper f19072b;
    public final MessageObject f19073c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19074e;
    public final boolean f19075f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19076n;
    public final HashMap f19077r;
    public final boolean f19078s;
    public final Object v;
    public final TLObject f19079w;
    public final TLObject f19080x;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19072b = sendMessagesHelper;
        this.v = tLObject;
        this.f19080x = tL_messages_addPollAnswer;
        this.f19079w = tLObject2;
        this.f19073c = messageObject;
        this.d = str;
        this.f19074e = delayedMessage;
        this.f19075f = z10;
        this.h = delayedMessage2;
        this.f19076n = obj;
        this.f19077r = hashMap;
        this.f19078s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19071a) {
            case 0:
                HashMap hashMap = this.f19077r;
                boolean z10 = this.f19078s;
                this.f19072b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19080x, this.f19079w, this.f19073c, this.d, this.f19074e, this.f19075f, this.h, this.f19076n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19077r;
                boolean z11 = this.f19078s;
                this.f19072b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19079w, (TLRPC.TL_messages_sendMedia) this.f19080x, this.f19073c, this.d, this.f19074e, this.f19075f, this.h, this.f19076n, hashMap2, z11);
                return;
        }
    }

    public rj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19072b = sendMessagesHelper;
        this.v = n2Var;
        this.f19079w = tL_inputMediaStakeDice;
        this.f19080x = tL_messages_sendMedia;
        this.f19073c = messageObject;
        this.d = str;
        this.f19074e = delayedMessage;
        this.f19075f = z10;
        this.h = delayedMessage2;
        this.f19076n = obj;
        this.f19077r = hashMap;
        this.f19078s = z11;
    }
}
