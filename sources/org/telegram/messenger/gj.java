package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f16509a = 0;
    public final SendMessagesHelper f16510b;
    public final MessageObject f16511c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16512f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16513n;
    public final HashMap f16514r;
    public final boolean f16515s;
    public final Object v;
    public final TLObject f16516w;
    public final TLObject f16517x;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16510b = sendMessagesHelper;
        this.v = tLObject;
        this.f16517x = tL_messages_addPollAnswer;
        this.f16516w = tLObject2;
        this.f16511c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16512f = z10;
        this.h = delayedMessage2;
        this.f16513n = obj;
        this.f16514r = hashMap;
        this.f16515s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16509a) {
            case 0:
                HashMap hashMap = this.f16514r;
                boolean z10 = this.f16515s;
                this.f16510b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16517x, this.f16516w, this.f16511c, this.d, this.e, this.f16512f, this.h, this.f16513n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16514r;
                boolean z11 = this.f16515s;
                this.f16510b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.m2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16516w, (TLRPC.TL_messages_sendMedia) this.f16517x, this.f16511c, this.d, this.e, this.f16512f, this.h, this.f16513n, hashMap2, z11);
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16510b = sendMessagesHelper;
        this.v = m2Var;
        this.f16516w = tL_inputMediaStakeDice;
        this.f16517x = tL_messages_sendMedia;
        this.f16511c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16512f = z10;
        this.h = delayedMessage2;
        this.f16513n = obj;
        this.f16514r = hashMap;
        this.f16515s = z11;
    }
}
