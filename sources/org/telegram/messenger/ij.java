package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f16418a = 0;
    public final SendMessagesHelper f16419b;
    public final MessageObject f16420c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16421f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16422n;
    public final HashMap f16423r;
    public final boolean f16424s;
    public final Object v;
    public final TLObject f16425w;
    public final TLObject f16426x;

    public ij(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16419b = sendMessagesHelper;
        this.v = tLObject;
        this.f16426x = tL_messages_addPollAnswer;
        this.f16425w = tLObject2;
        this.f16420c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16421f = z10;
        this.h = delayedMessage2;
        this.f16422n = obj;
        this.f16423r = hashMap;
        this.f16424s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16418a) {
            case 0:
                HashMap hashMap = this.f16423r;
                boolean z10 = this.f16424s;
                this.f16419b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16426x, this.f16425w, this.f16420c, this.d, this.e, this.f16421f, this.h, this.f16422n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16423r;
                boolean z11 = this.f16424s;
                this.f16419b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16425w, (TLRPC.TL_messages_sendMedia) this.f16426x, this.f16420c, this.d, this.e, this.f16421f, this.h, this.f16422n, hashMap2, z11);
                return;
        }
    }

    public ij(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16419b = sendMessagesHelper;
        this.v = n2Var;
        this.f16425w = tL_inputMediaStakeDice;
        this.f16426x = tL_messages_sendMedia;
        this.f16420c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16421f = z10;
        this.h = delayedMessage2;
        this.f16422n = obj;
        this.f16423r = hashMap;
        this.f16424s = z11;
    }
}
