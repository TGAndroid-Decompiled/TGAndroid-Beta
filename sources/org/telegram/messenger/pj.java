package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f19294a = 0;
    public final SendMessagesHelper f19295b;
    public final MessageObject f19296c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19297f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19298n;
    public final HashMap f19299r;
    public final boolean f19300s;
    public final Object v;
    public final TLObject f19301w;
    public final TLObject f19302x;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19295b = sendMessagesHelper;
        this.v = tLObject;
        this.f19302x = tL_messages_addPollAnswer;
        this.f19301w = tLObject2;
        this.f19296c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19297f = z10;
        this.h = delayedMessage2;
        this.f19298n = obj;
        this.f19299r = hashMap;
        this.f19300s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19294a) {
            case 0:
                HashMap hashMap = this.f19299r;
                boolean z10 = this.f19300s;
                this.f19295b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19302x, this.f19301w, this.f19296c, this.d, this.e, this.f19297f, this.h, this.f19298n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19299r;
                boolean z11 = this.f19300s;
                this.f19295b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.o2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19301w, (TLRPC.TL_messages_sendMedia) this.f19302x, this.f19296c, this.d, this.e, this.f19297f, this.h, this.f19298n, hashMap2, z11);
                return;
        }
    }

    public pj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19295b = sendMessagesHelper;
        this.v = o2Var;
        this.f19301w = tL_inputMediaStakeDice;
        this.f19302x = tL_messages_sendMedia;
        this.f19296c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19297f = z10;
        this.h = delayedMessage2;
        this.f19298n = obj;
        this.f19299r = hashMap;
        this.f19300s = z11;
    }
}
