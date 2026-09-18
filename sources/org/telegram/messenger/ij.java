package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f16603a = 0;
    public final SendMessagesHelper f16604b;
    public final MessageObject f16605c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16606f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16607n;
    public final HashMap f16608r;
    public final boolean f16609s;
    public final Object v;
    public final TLObject f16610w;
    public final TLObject f16611x;

    public ij(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16604b = sendMessagesHelper;
        this.v = tLObject;
        this.f16611x = tL_messages_addPollAnswer;
        this.f16610w = tLObject2;
        this.f16605c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16606f = z10;
        this.h = delayedMessage2;
        this.f16607n = obj;
        this.f16608r = hashMap;
        this.f16609s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16603a) {
            case 0:
                HashMap hashMap = this.f16608r;
                boolean z10 = this.f16609s;
                this.f16604b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16611x, this.f16610w, this.f16605c, this.d, this.e, this.f16606f, this.h, this.f16607n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16608r;
                boolean z11 = this.f16609s;
                this.f16604b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16610w, (TLRPC.TL_messages_sendMedia) this.f16611x, this.f16605c, this.d, this.e, this.f16606f, this.h, this.f16607n, hashMap2, z11);
                return;
        }
    }

    public ij(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16604b = sendMessagesHelper;
        this.v = n2Var;
        this.f16610w = tL_inputMediaStakeDice;
        this.f16611x = tL_messages_sendMedia;
        this.f16605c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16606f = z10;
        this.h = delayedMessage2;
        this.f16607n = obj;
        this.f16608r = hashMap;
        this.f16609s = z11;
    }
}
