package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f16492a = 0;
    public final SendMessagesHelper f16493b;
    public final MessageObject f16494c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16495f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16496n;
    public final HashMap f16497r;
    public final boolean f16498s;
    public final Object v;
    public final TLObject f16499w;
    public final TLObject f16500x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16493b = sendMessagesHelper;
        this.v = tLObject;
        this.f16500x = tL_messages_addPollAnswer;
        this.f16499w = tLObject2;
        this.f16494c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16495f = z10;
        this.h = delayedMessage2;
        this.f16496n = obj;
        this.f16497r = hashMap;
        this.f16498s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16492a) {
            case 0:
                HashMap hashMap = this.f16497r;
                boolean z10 = this.f16498s;
                this.f16493b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16500x, this.f16499w, this.f16494c, this.d, this.e, this.f16495f, this.h, this.f16496n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16497r;
                boolean z11 = this.f16498s;
                this.f16493b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16499w, (TLRPC.TL_messages_sendMedia) this.f16500x, this.f16494c, this.d, this.e, this.f16495f, this.h, this.f16496n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16493b = sendMessagesHelper;
        this.v = m2Var;
        this.f16499w = tL_inputMediaStakeDice;
        this.f16500x = tL_messages_sendMedia;
        this.f16494c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16495f = z10;
        this.h = delayedMessage2;
        this.f16496n = obj;
        this.f16497r = hashMap;
        this.f16498s = z11;
    }
}
