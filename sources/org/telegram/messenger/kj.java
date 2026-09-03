package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f17673a = 0;
    public final SendMessagesHelper f17674b;
    public final MessageObject f17675c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f17676f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f17677n;
    public final HashMap f17678r;
    public final boolean f17679s;
    public final Object v;
    public final TLObject f17680w;
    public final TLObject f17681x;

    public kj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f17674b = sendMessagesHelper;
        this.v = tLObject;
        this.f17681x = tL_messages_addPollAnswer;
        this.f17680w = tLObject2;
        this.f17675c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17676f = z4;
        this.h = delayedMessage2;
        this.f17677n = obj;
        this.f17678r = hashMap;
        this.f17679s = z10;
    }

    @Override
    public final void run() {
        switch (this.f17673a) {
            case 0:
                HashMap hashMap = this.f17678r;
                boolean z4 = this.f17679s;
                this.f17674b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f17681x, this.f17680w, this.f17675c, this.d, this.e, this.f17676f, this.h, this.f17677n, hashMap, z4);
                return;
            default:
                HashMap hashMap2 = this.f17678r;
                boolean z10 = this.f17679s;
                this.f17674b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.p2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f17680w, (TLRPC.TL_messages_sendMedia) this.f17681x, this.f17675c, this.d, this.e, this.f17676f, this.h, this.f17677n, hashMap2, z10);
                return;
        }
    }

    public kj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f17674b = sendMessagesHelper;
        this.v = p2Var;
        this.f17680w = tL_inputMediaStakeDice;
        this.f17681x = tL_messages_sendMedia;
        this.f17675c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17676f = z4;
        this.h = delayedMessage2;
        this.f17677n = obj;
        this.f17678r = hashMap;
        this.f17679s = z10;
    }
}
