package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f19001a = 0;
    public final SendMessagesHelper f19002b;
    public final MessageObject f19003c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19004f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19005n;
    public final HashMap f19006r;
    public final boolean f19007s;
    public final Object v;
    public final TLObject f19008w;
    public final TLObject f19009x;

    public mj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19002b = sendMessagesHelper;
        this.v = tLObject;
        this.f19009x = tL_messages_addPollAnswer;
        this.f19008w = tLObject2;
        this.f19003c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19004f = z10;
        this.h = delayedMessage2;
        this.f19005n = obj;
        this.f19006r = hashMap;
        this.f19007s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19001a) {
            case 0:
                HashMap hashMap = this.f19006r;
                boolean z10 = this.f19007s;
                this.f19002b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19009x, this.f19008w, this.f19003c, this.d, this.e, this.f19004f, this.h, this.f19005n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19006r;
                boolean z11 = this.f19007s;
                this.f19002b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19008w, (TLRPC.TL_messages_sendMedia) this.f19009x, this.f19003c, this.d, this.e, this.f19004f, this.h, this.f19005n, hashMap2, z11);
                return;
        }
    }

    public mj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19002b = sendMessagesHelper;
        this.v = n2Var;
        this.f19008w = tL_inputMediaStakeDice;
        this.f19009x = tL_messages_sendMedia;
        this.f19003c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19004f = z10;
        this.h = delayedMessage2;
        this.f19005n = obj;
        this.f19006r = hashMap;
        this.f19007s = z11;
    }
}
