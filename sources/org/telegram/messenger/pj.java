package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f19227a = 0;
    public final SendMessagesHelper f19228b;
    public final MessageObject f19229c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19230f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19231n;
    public final HashMap f19232r;
    public final boolean f19233s;
    public final Object v;
    public final TLObject f19234w;
    public final TLObject f19235x;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19228b = sendMessagesHelper;
        this.v = tLObject;
        this.f19235x = tL_messages_addPollAnswer;
        this.f19234w = tLObject2;
        this.f19229c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19230f = z10;
        this.h = delayedMessage2;
        this.f19231n = obj;
        this.f19232r = hashMap;
        this.f19233s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19227a) {
            case 0:
                HashMap hashMap = this.f19232r;
                boolean z10 = this.f19233s;
                this.f19228b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19235x, this.f19234w, this.f19229c, this.d, this.e, this.f19230f, this.h, this.f19231n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19232r;
                boolean z11 = this.f19233s;
                this.f19228b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19234w, (TLRPC.TL_messages_sendMedia) this.f19235x, this.f19229c, this.d, this.e, this.f19230f, this.h, this.f19231n, hashMap2, z11);
                return;
        }
    }

    public pj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19228b = sendMessagesHelper;
        this.v = n2Var;
        this.f19234w = tL_inputMediaStakeDice;
        this.f19235x = tL_messages_sendMedia;
        this.f19229c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19230f = z10;
        this.h = delayedMessage2;
        this.f19231n = obj;
        this.f19232r = hashMap;
        this.f19233s = z11;
    }
}
