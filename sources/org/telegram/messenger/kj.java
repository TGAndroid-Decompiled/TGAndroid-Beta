package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f19198a = 0;
    public final SendMessagesHelper f19199b;
    public final MessageObject f19200c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19201e;
    public final boolean f19202f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19203n;
    public final HashMap f19204r;
    public final boolean f19205s;
    public final Object v;
    public final TLObject f19206w;
    public final TLObject f19207x;

    public kj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f19199b = sendMessagesHelper;
        this.v = tLObject;
        this.f19207x = tL_messages_addPollAnswer;
        this.f19206w = tLObject2;
        this.f19200c = messageObject;
        this.d = str;
        this.f19201e = delayedMessage;
        this.f19202f = z4;
        this.h = delayedMessage2;
        this.f19203n = obj;
        this.f19204r = hashMap;
        this.f19205s = z10;
    }

    @Override
    public final void run() {
        switch (this.f19198a) {
            case 0:
                HashMap hashMap = this.f19204r;
                boolean z4 = this.f19205s;
                this.f19199b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19207x, this.f19206w, this.f19200c, this.d, this.f19201e, this.f19202f, this.h, this.f19203n, hashMap, z4);
                return;
            default:
                HashMap hashMap2 = this.f19204r;
                boolean z10 = this.f19205s;
                this.f19199b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.p2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19206w, (TLRPC.TL_messages_sendMedia) this.f19207x, this.f19200c, this.d, this.f19201e, this.f19202f, this.h, this.f19203n, hashMap2, z10);
                return;
        }
    }

    public kj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f19199b = sendMessagesHelper;
        this.v = p2Var;
        this.f19206w = tL_inputMediaStakeDice;
        this.f19207x = tL_messages_sendMedia;
        this.f19200c = messageObject;
        this.d = str;
        this.f19201e = delayedMessage;
        this.f19202f = z4;
        this.h = delayedMessage2;
        this.f19203n = obj;
        this.f19204r = hashMap;
        this.f19205s = z10;
    }
}
