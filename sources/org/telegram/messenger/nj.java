package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f19115a = 0;
    public final SendMessagesHelper f19116b;
    public final MessageObject f19117c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19118f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19119n;
    public final HashMap f19120r;
    public final boolean f19121s;
    public final Object v;
    public final TLObject f19122w;
    public final TLObject f19123x;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19116b = sendMessagesHelper;
        this.v = tLObject;
        this.f19123x = tL_messages_addPollAnswer;
        this.f19122w = tLObject2;
        this.f19117c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19118f = z10;
        this.h = delayedMessage2;
        this.f19119n = obj;
        this.f19120r = hashMap;
        this.f19121s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19115a) {
            case 0:
                HashMap hashMap = this.f19120r;
                boolean z10 = this.f19121s;
                this.f19116b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19123x, this.f19122w, this.f19117c, this.d, this.e, this.f19118f, this.h, this.f19119n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19120r;
                boolean z11 = this.f19121s;
                this.f19116b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19122w, (TLRPC.TL_messages_sendMedia) this.f19123x, this.f19117c, this.d, this.e, this.f19118f, this.h, this.f19119n, hashMap2, z11);
                return;
        }
    }

    public nj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19116b = sendMessagesHelper;
        this.v = n2Var;
        this.f19122w = tL_inputMediaStakeDice;
        this.f19123x = tL_messages_sendMedia;
        this.f19117c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19118f = z10;
        this.h = delayedMessage2;
        this.f19119n = obj;
        this.f19120r = hashMap;
        this.f19121s = z11;
    }
}
