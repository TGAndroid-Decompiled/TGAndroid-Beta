package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements Runnable {
    public final int f19598a = 0;
    public final SendMessagesHelper f19599b;
    public final MessageObject f19600c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage f19601e;
    public final boolean f19602f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19603n;
    public final HashMap f19604r;
    public final boolean f19605s;
    public final Object v;
    public final TLObject f19606w;
    public final TLObject f19607x;

    public xj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19599b = sendMessagesHelper;
        this.v = tLObject;
        this.f19607x = tL_messages_addPollAnswer;
        this.f19606w = tLObject2;
        this.f19600c = messageObject;
        this.d = str;
        this.f19601e = delayedMessage;
        this.f19602f = z10;
        this.h = delayedMessage2;
        this.f19603n = obj;
        this.f19604r = hashMap;
        this.f19605s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19598a) {
            case 0:
                HashMap hashMap = this.f19604r;
                boolean z10 = this.f19605s;
                this.f19599b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19607x, this.f19606w, this.f19600c, this.d, this.f19601e, this.f19602f, this.h, this.f19603n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19604r;
                boolean z11 = this.f19605s;
                this.f19599b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19606w, (TLRPC.TL_messages_sendMedia) this.f19607x, this.f19600c, this.d, this.f19601e, this.f19602f, this.h, this.f19603n, hashMap2, z11);
                return;
        }
    }

    public xj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19599b = sendMessagesHelper;
        this.v = m2Var;
        this.f19606w = tL_inputMediaStakeDice;
        this.f19607x = tL_messages_sendMedia;
        this.f19600c = messageObject;
        this.d = str;
        this.f19601e = delayedMessage;
        this.f19602f = z10;
        this.h = delayedMessage2;
        this.f19603n = obj;
        this.f19604r = hashMap;
        this.f19605s = z11;
    }
}
