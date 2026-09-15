package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f16421a = 0;
    public final SendMessagesHelper f16422b;
    public final MessageObject f16423c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16424f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16425n;
    public final HashMap f16426r;
    public final boolean f16427s;
    public final Object v;
    public final TLObject f16428w;
    public final TLObject f16429x;

    public ij(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16422b = sendMessagesHelper;
        this.v = tLObject;
        this.f16429x = tL_messages_addPollAnswer;
        this.f16428w = tLObject2;
        this.f16423c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16424f = z10;
        this.h = delayedMessage2;
        this.f16425n = obj;
        this.f16426r = hashMap;
        this.f16427s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16421a) {
            case 0:
                HashMap hashMap = this.f16426r;
                boolean z10 = this.f16427s;
                this.f16422b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16429x, this.f16428w, this.f16423c, this.d, this.e, this.f16424f, this.h, this.f16425n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16426r;
                boolean z11 = this.f16427s;
                this.f16422b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16428w, (TLRPC.TL_messages_sendMedia) this.f16429x, this.f16423c, this.d, this.e, this.f16424f, this.h, this.f16425n, hashMap2, z11);
                return;
        }
    }

    public ij(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16422b = sendMessagesHelper;
        this.v = n2Var;
        this.f16428w = tL_inputMediaStakeDice;
        this.f16429x = tL_messages_sendMedia;
        this.f16423c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16424f = z10;
        this.h = delayedMessage2;
        this.f16425n = obj;
        this.f16426r = hashMap;
        this.f16427s = z11;
    }
}
