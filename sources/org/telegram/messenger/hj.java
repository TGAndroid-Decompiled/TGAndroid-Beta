package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f17936a = 0;
    public final SendMessagesHelper f17937b;
    public final MessageObject f17938c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f17939e;
    public final boolean f17940f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17941n;
    public final HashMap f17942r;
    public final boolean f17943s;
    public final Object v;
    public final TLObject f17944w;
    public final TLObject f17945x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17937b = sendMessagesHelper;
        this.v = tLObject;
        this.f17945x = tL_messages_addPollAnswer;
        this.f17944w = tLObject2;
        this.f17938c = messageObject;
        this.d = str;
        this.f17939e = delayedMessage;
        this.f17940f = z10;
        this.h = delayedMessage2;
        this.f17941n = obj;
        this.f17942r = hashMap;
        this.f17943s = z11;
    }

    @Override
    public final void run() {
        switch (this.f17936a) {
            case 0:
                HashMap hashMap = this.f17942r;
                boolean z10 = this.f17943s;
                this.f17937b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17945x, this.f17944w, this.f17938c, this.d, this.f17939e, this.f17940f, this.h, this.f17941n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f17942r;
                boolean z11 = this.f17943s;
                this.f17937b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17944w, (TLRPC.TL_messages_sendMedia) this.f17945x, this.f17938c, this.d, this.f17939e, this.f17940f, this.h, this.f17941n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17937b = sendMessagesHelper;
        this.v = n2Var;
        this.f17944w = tL_inputMediaStakeDice;
        this.f17945x = tL_messages_sendMedia;
        this.f17938c = messageObject;
        this.d = str;
        this.f17939e = delayedMessage;
        this.f17940f = z10;
        this.h = delayedMessage2;
        this.f17941n = obj;
        this.f17942r = hashMap;
        this.f17943s = z11;
    }
}
