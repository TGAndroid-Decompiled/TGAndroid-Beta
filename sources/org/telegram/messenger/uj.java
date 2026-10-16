package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f18311a = 0;
    public final SendMessagesHelper f18312b;
    public final MessageObject f18313c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f18314f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f18315n;
    public final HashMap f18316r;
    public final boolean f18317s;
    public final Object v;
    public final TLObject f18318w;
    public final TLObject f18319x;

    public uj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18312b = sendMessagesHelper;
        this.v = tLObject;
        this.f18319x = tL_messages_addPollAnswer;
        this.f18318w = tLObject2;
        this.f18313c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f18314f = z10;
        this.h = delayedMessage2;
        this.f18315n = obj;
        this.f18316r = hashMap;
        this.f18317s = z11;
    }

    @Override
    public final void run() {
        switch (this.f18311a) {
            case 0:
                HashMap hashMap = this.f18316r;
                boolean z10 = this.f18317s;
                this.f18312b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f18319x, this.f18318w, this.f18313c, this.d, this.e, this.f18314f, this.h, this.f18315n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f18316r;
                boolean z11 = this.f18317s;
                this.f18312b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f18318w, (TLRPC.TL_messages_sendMedia) this.f18319x, this.f18313c, this.d, this.e, this.f18314f, this.h, this.f18315n, hashMap2, z11);
                return;
        }
    }

    public uj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18312b = sendMessagesHelper;
        this.v = m2Var;
        this.f18318w = tL_inputMediaStakeDice;
        this.f18319x = tL_messages_sendMedia;
        this.f18313c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f18314f = z10;
        this.h = delayedMessage2;
        this.f18315n = obj;
        this.f18316r = hashMap;
        this.f18317s = z11;
    }
}
