package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f17909a = 0;
    public final SendMessagesHelper f17910b;
    public final MessageObject f17911c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f17912e;
    public final boolean f17913f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17914n;
    public final HashMap f17915r;
    public final boolean f17916s;
    public final Object v;
    public final TLObject f17917w;
    public final TLObject f17918x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17910b = sendMessagesHelper;
        this.v = tLObject;
        this.f17918x = tL_messages_addPollAnswer;
        this.f17917w = tLObject2;
        this.f17911c = messageObject;
        this.d = str;
        this.f17912e = delayedMessage;
        this.f17913f = z10;
        this.h = delayedMessage2;
        this.f17914n = obj;
        this.f17915r = hashMap;
        this.f17916s = z11;
    }

    @Override
    public final void run() {
        switch (this.f17909a) {
            case 0:
                HashMap hashMap = this.f17915r;
                boolean z10 = this.f17916s;
                this.f17910b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17918x, this.f17917w, this.f17911c, this.d, this.f17912e, this.f17913f, this.h, this.f17914n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f17915r;
                boolean z11 = this.f17916s;
                this.f17910b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17917w, (TLRPC.TL_messages_sendMedia) this.f17918x, this.f17911c, this.d, this.f17912e, this.f17913f, this.h, this.f17914n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17910b = sendMessagesHelper;
        this.v = n2Var;
        this.f17917w = tL_inputMediaStakeDice;
        this.f17918x = tL_messages_sendMedia;
        this.f17911c = messageObject;
        this.d = str;
        this.f17912e = delayedMessage;
        this.f17913f = z10;
        this.h = delayedMessage2;
        this.f17914n = obj;
        this.f17915r = hashMap;
        this.f17916s = z11;
    }
}
