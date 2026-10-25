package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj implements Runnable {
    public final int f21173a = 0;
    public final SendMessagesHelper f21174b;
    public final MessageObject f21175c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f21176f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f21177n;
    public final HashMap f21178r;
    public final boolean f21179s;
    public final Object v;
    public final TLObject f21180w;
    public final TLObject f21181x;

    public rj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f21174b = sendMessagesHelper;
        this.v = tLObject;
        this.f21181x = tL_messages_addPollAnswer;
        this.f21180w = tLObject2;
        this.f21175c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f21176f = z10;
        this.h = delayedMessage2;
        this.f21177n = obj;
        this.f21178r = hashMap;
        this.f21179s = z11;
    }

    @Override
    public final void run() {
        switch (this.f21173a) {
            case 0:
                HashMap hashMap = this.f21178r;
                boolean z10 = this.f21179s;
                this.f21174b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f21181x, this.f21180w, this.f21175c, this.d, this.e, this.f21176f, this.h, this.f21177n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f21178r;
                boolean z11 = this.f21179s;
                this.f21174b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.r2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f21180w, (TLRPC.TL_messages_sendMedia) this.f21181x, this.f21175c, this.d, this.e, this.f21176f, this.h, this.f21177n, hashMap2, z11);
                return;
        }
    }

    public rj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f21174b = sendMessagesHelper;
        this.v = r2Var;
        this.f21180w = tL_inputMediaStakeDice;
        this.f21181x = tL_messages_sendMedia;
        this.f21175c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f21176f = z10;
        this.h = delayedMessage2;
        this.f21177n = obj;
        this.f21178r = hashMap;
        this.f21179s = z11;
    }
}
