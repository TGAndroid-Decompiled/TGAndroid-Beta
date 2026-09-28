package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f16493a = 0;
    public final SendMessagesHelper f16494b;
    public final MessageObject f16495c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16496f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16497n;
    public final HashMap f16498r;
    public final boolean f16499s;
    public final Object v;
    public final TLObject f16500w;
    public final TLObject f16501x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16494b = sendMessagesHelper;
        this.v = tLObject;
        this.f16501x = tL_messages_addPollAnswer;
        this.f16500w = tLObject2;
        this.f16495c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16496f = z10;
        this.h = delayedMessage2;
        this.f16497n = obj;
        this.f16498r = hashMap;
        this.f16499s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16493a) {
            case 0:
                HashMap hashMap = this.f16498r;
                boolean z10 = this.f16499s;
                this.f16494b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16501x, this.f16500w, this.f16495c, this.d, this.e, this.f16496f, this.h, this.f16497n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16498r;
                boolean z11 = this.f16499s;
                this.f16494b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16500w, (TLRPC.TL_messages_sendMedia) this.f16501x, this.f16495c, this.d, this.e, this.f16496f, this.h, this.f16497n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16494b = sendMessagesHelper;
        this.v = m2Var;
        this.f16500w = tL_inputMediaStakeDice;
        this.f16501x = tL_messages_sendMedia;
        this.f16495c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16496f = z10;
        this.h = delayedMessage2;
        this.f16497n = obj;
        this.f16498r = hashMap;
        this.f16499s = z11;
    }
}
