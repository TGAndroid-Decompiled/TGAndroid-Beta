package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f19196a = 0;
    public final SendMessagesHelper f19197b;
    public final MessageObject f19198c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19199e;
    public final boolean f19200f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19201n;
    public final HashMap f19202r;
    public final boolean f19203s;
    public final Object v;
    public final TLObject f19204w;
    public final TLObject f19205x;

    public kj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f19197b = sendMessagesHelper;
        this.v = tLObject;
        this.f19205x = tL_messages_addPollAnswer;
        this.f19204w = tLObject2;
        this.f19198c = messageObject;
        this.d = str;
        this.f19199e = delayedMessage;
        this.f19200f = z4;
        this.h = delayedMessage2;
        this.f19201n = obj;
        this.f19202r = hashMap;
        this.f19203s = z10;
    }

    @Override
    public final void run() {
        switch (this.f19196a) {
            case 0:
                HashMap hashMap = this.f19202r;
                boolean z4 = this.f19203s;
                this.f19197b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19205x, this.f19204w, this.f19198c, this.d, this.f19199e, this.f19200f, this.h, this.f19201n, hashMap, z4);
                return;
            default:
                HashMap hashMap2 = this.f19202r;
                boolean z10 = this.f19203s;
                this.f19197b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.p2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19204w, (TLRPC.TL_messages_sendMedia) this.f19205x, this.f19198c, this.d, this.f19199e, this.f19200f, this.h, this.f19201n, hashMap2, z10);
                return;
        }
    }

    public kj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f19197b = sendMessagesHelper;
        this.v = p2Var;
        this.f19204w = tL_inputMediaStakeDice;
        this.f19205x = tL_messages_sendMedia;
        this.f19198c = messageObject;
        this.d = str;
        this.f19199e = delayedMessage;
        this.f19200f = z4;
        this.h = delayedMessage2;
        this.f19201n = obj;
        this.f19202r = hashMap;
        this.f19203s = z10;
    }
}
