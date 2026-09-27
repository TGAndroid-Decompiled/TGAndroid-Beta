package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f16481a = 0;
    public final SendMessagesHelper f16482b;
    public final MessageObject f16483c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16484f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16485n;
    public final HashMap f16486r;
    public final boolean f16487s;
    public final Object v;
    public final TLObject f16488w;
    public final TLObject f16489x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16482b = sendMessagesHelper;
        this.v = tLObject;
        this.f16489x = tL_messages_addPollAnswer;
        this.f16488w = tLObject2;
        this.f16483c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16484f = z10;
        this.h = delayedMessage2;
        this.f16485n = obj;
        this.f16486r = hashMap;
        this.f16487s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16481a) {
            case 0:
                HashMap hashMap = this.f16486r;
                boolean z10 = this.f16487s;
                this.f16482b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16489x, this.f16488w, this.f16483c, this.d, this.e, this.f16484f, this.h, this.f16485n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16486r;
                boolean z11 = this.f16487s;
                this.f16482b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.o2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16488w, (TLRPC.TL_messages_sendMedia) this.f16489x, this.f16483c, this.d, this.e, this.f16484f, this.h, this.f16485n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16482b = sendMessagesHelper;
        this.v = o2Var;
        this.f16488w = tL_inputMediaStakeDice;
        this.f16489x = tL_messages_sendMedia;
        this.f16483c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16484f = z10;
        this.h = delayedMessage2;
        this.f16485n = obj;
        this.f16486r = hashMap;
        this.f16487s = z11;
    }
}
