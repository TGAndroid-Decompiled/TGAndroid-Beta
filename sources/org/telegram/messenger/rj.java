package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f19113a = 0;
    public final SendMessagesHelper f19114b;
    public final MessageObject f19115c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19116e;
    public final boolean f19117f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19118n;
    public final HashMap f19119r;
    public final boolean f19120s;
    public final Object v;
    public final TLObject f19121w;
    public final TLObject f19122x;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19114b = sendMessagesHelper;
        this.v = tLObject;
        this.f19122x = tL_messages_addPollAnswer;
        this.f19121w = tLObject2;
        this.f19115c = messageObject;
        this.d = str;
        this.f19116e = delayedMessage;
        this.f19117f = z10;
        this.h = delayedMessage2;
        this.f19118n = obj;
        this.f19119r = hashMap;
        this.f19120s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19113a) {
            case 0:
                HashMap hashMap = this.f19119r;
                boolean z10 = this.f19120s;
                this.f19114b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19122x, this.f19121w, this.f19115c, this.d, this.f19116e, this.f19117f, this.h, this.f19118n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19119r;
                boolean z11 = this.f19120s;
                this.f19114b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19121w, (TLRPC.TL_messages_sendMedia) this.f19122x, this.f19115c, this.d, this.f19116e, this.f19117f, this.h, this.f19118n, hashMap2, z11);
                return;
        }
    }

    public rj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19114b = sendMessagesHelper;
        this.v = m2Var;
        this.f19121w = tL_inputMediaStakeDice;
        this.f19122x = tL_messages_sendMedia;
        this.f19115c = messageObject;
        this.d = str;
        this.f19116e = delayedMessage;
        this.f19117f = z10;
        this.h = delayedMessage2;
        this.f19118n = obj;
        this.f19119r = hashMap;
        this.f19120s = z11;
    }
}
