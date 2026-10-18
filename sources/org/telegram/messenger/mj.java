package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f19004a = 0;
    public final SendMessagesHelper f19005b;
    public final MessageObject f19006c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19007f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19008n;
    public final HashMap f19009r;
    public final boolean f19010s;
    public final Object v;
    public final TLObject f19011w;
    public final TLObject f19012x;

    public mj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19005b = sendMessagesHelper;
        this.v = tLObject;
        this.f19012x = tL_messages_addPollAnswer;
        this.f19011w = tLObject2;
        this.f19006c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19007f = z10;
        this.h = delayedMessage2;
        this.f19008n = obj;
        this.f19009r = hashMap;
        this.f19010s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19004a) {
            case 0:
                HashMap hashMap = this.f19009r;
                boolean z10 = this.f19010s;
                this.f19005b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19012x, this.f19011w, this.f19006c, this.d, this.e, this.f19007f, this.h, this.f19008n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19009r;
                boolean z11 = this.f19010s;
                this.f19005b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19011w, (TLRPC.TL_messages_sendMedia) this.f19012x, this.f19006c, this.d, this.e, this.f19007f, this.h, this.f19008n, hashMap2, z11);
                return;
        }
    }

    public mj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19005b = sendMessagesHelper;
        this.v = n2Var;
        this.f19011w = tL_inputMediaStakeDice;
        this.f19012x = tL_messages_sendMedia;
        this.f19006c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19007f = z10;
        this.h = delayedMessage2;
        this.f19008n = obj;
        this.f19009r = hashMap;
        this.f19010s = z11;
    }
}
