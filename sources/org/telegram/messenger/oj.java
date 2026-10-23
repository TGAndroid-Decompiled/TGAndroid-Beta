package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f19225a = 0;
    public final SendMessagesHelper f19226b;
    public final MessageObject f19227c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19228f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19229n;
    public final HashMap f19230r;
    public final boolean f19231s;
    public final Object v;
    public final TLObject f19232w;
    public final TLObject f19233x;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19226b = sendMessagesHelper;
        this.v = tLObject;
        this.f19233x = tL_messages_addPollAnswer;
        this.f19232w = tLObject2;
        this.f19227c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19228f = z10;
        this.h = delayedMessage2;
        this.f19229n = obj;
        this.f19230r = hashMap;
        this.f19231s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19225a) {
            case 0:
                HashMap hashMap = this.f19230r;
                boolean z10 = this.f19231s;
                this.f19226b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19233x, this.f19232w, this.f19227c, this.d, this.e, this.f19228f, this.h, this.f19229n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19230r;
                boolean z11 = this.f19231s;
                this.f19226b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.o2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19232w, (TLRPC.TL_messages_sendMedia) this.f19233x, this.f19227c, this.d, this.e, this.f19228f, this.h, this.f19229n, hashMap2, z11);
                return;
        }
    }

    public oj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19226b = sendMessagesHelper;
        this.v = o2Var;
        this.f19232w = tL_inputMediaStakeDice;
        this.f19233x = tL_messages_sendMedia;
        this.f19227c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19228f = z10;
        this.h = delayedMessage2;
        this.f19229n = obj;
        this.f19230r = hashMap;
        this.f19231s = z11;
    }
}
