package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f19080a = 0;
    public final SendMessagesHelper f19081b;
    public final MessageObject f19082c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19083f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19084n;
    public final HashMap f19085r;
    public final boolean f19086s;
    public final Object v;
    public final TLObject f19087w;
    public final TLObject f19088x;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19081b = sendMessagesHelper;
        this.v = tLObject;
        this.f19088x = tL_messages_addPollAnswer;
        this.f19087w = tLObject2;
        this.f19082c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19083f = z10;
        this.h = delayedMessage2;
        this.f19084n = obj;
        this.f19085r = hashMap;
        this.f19086s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19080a) {
            case 0:
                HashMap hashMap = this.f19085r;
                boolean z10 = this.f19086s;
                this.f19081b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19088x, this.f19087w, this.f19082c, this.d, this.e, this.f19083f, this.h, this.f19084n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19085r;
                boolean z11 = this.f19086s;
                this.f19081b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19087w, (TLRPC.TL_messages_sendMedia) this.f19088x, this.f19082c, this.d, this.e, this.f19083f, this.h, this.f19084n, hashMap2, z11);
                return;
        }
    }

    public nj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19081b = sendMessagesHelper;
        this.v = n2Var;
        this.f19087w = tL_inputMediaStakeDice;
        this.f19088x = tL_messages_sendMedia;
        this.f19082c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19083f = z10;
        this.h = delayedMessage2;
        this.f19084n = obj;
        this.f19085r = hashMap;
        this.f19086s = z11;
    }
}
