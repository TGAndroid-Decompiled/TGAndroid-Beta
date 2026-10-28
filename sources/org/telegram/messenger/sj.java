package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f21243a = 0;
    public final SendMessagesHelper f21244b;
    public final MessageObject f21245c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f21246f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f21247n;
    public final HashMap f21248r;
    public final boolean f21249s;
    public final Object v;
    public final TLObject f21250w;
    public final TLObject f21251x;

    public sj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f21244b = sendMessagesHelper;
        this.v = tLObject;
        this.f21251x = tL_messages_addPollAnswer;
        this.f21250w = tLObject2;
        this.f21245c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f21246f = z10;
        this.h = delayedMessage2;
        this.f21247n = obj;
        this.f21248r = hashMap;
        this.f21249s = z11;
    }

    @Override
    public final void run() {
        switch (this.f21243a) {
            case 0:
                HashMap hashMap = this.f21248r;
                boolean z10 = this.f21249s;
                this.f21244b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f21251x, this.f21250w, this.f21245c, this.d, this.e, this.f21246f, this.h, this.f21247n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f21248r;
                boolean z11 = this.f21249s;
                this.f21244b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.r2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f21250w, (TLRPC.TL_messages_sendMedia) this.f21251x, this.f21245c, this.d, this.e, this.f21246f, this.h, this.f21247n, hashMap2, z11);
                return;
        }
    }

    public sj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f21244b = sendMessagesHelper;
        this.v = r2Var;
        this.f21250w = tL_inputMediaStakeDice;
        this.f21251x = tL_messages_sendMedia;
        this.f21245c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f21246f = z10;
        this.h = delayedMessage2;
        this.f21247n = obj;
        this.f21248r = hashMap;
        this.f21249s = z11;
    }
}
