package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f18610a = 0;
    public final SendMessagesHelper f18611b;
    public final MessageObject f18612c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f18613f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f18614n;
    public final HashMap f18615r;
    public final boolean f18616s;
    public final Object v;
    public final TLObject f18617w;
    public final TLObject f18618x;

    public uj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18611b = sendMessagesHelper;
        this.v = tLObject;
        this.f18618x = tL_messages_addPollAnswer;
        this.f18617w = tLObject2;
        this.f18612c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f18613f = z10;
        this.h = delayedMessage2;
        this.f18614n = obj;
        this.f18615r = hashMap;
        this.f18616s = z11;
    }

    @Override
    public final void run() {
        switch (this.f18610a) {
            case 0:
                HashMap hashMap = this.f18615r;
                boolean z10 = this.f18616s;
                this.f18611b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f18618x, this.f18617w, this.f18612c, this.d, this.e, this.f18613f, this.h, this.f18614n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f18615r;
                boolean z11 = this.f18616s;
                this.f18611b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f18617w, (TLRPC.TL_messages_sendMedia) this.f18618x, this.f18612c, this.d, this.e, this.f18613f, this.h, this.f18614n, hashMap2, z11);
                return;
        }
    }

    public uj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18611b = sendMessagesHelper;
        this.v = m2Var;
        this.f18617w = tL_inputMediaStakeDice;
        this.f18618x = tL_messages_sendMedia;
        this.f18612c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f18613f = z10;
        this.h = delayedMessage2;
        this.f18614n = obj;
        this.f18615r = hashMap;
        this.f18616s = z11;
    }
}
