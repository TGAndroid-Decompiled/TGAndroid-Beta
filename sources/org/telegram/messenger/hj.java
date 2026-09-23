package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f16317a = 0;
    public final SendMessagesHelper f16318b;
    public final MessageObject f16319c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16320f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16321n;
    public final HashMap f16322r;
    public final boolean f16323s;
    public final Object v;
    public final TLObject f16324w;
    public final TLObject f16325x;

    public hj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16318b = sendMessagesHelper;
        this.v = tLObject;
        this.f16325x = tL_messages_addPollAnswer;
        this.f16324w = tLObject2;
        this.f16319c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16320f = z10;
        this.h = delayedMessage2;
        this.f16321n = obj;
        this.f16322r = hashMap;
        this.f16323s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16317a) {
            case 0:
                HashMap hashMap = this.f16322r;
                boolean z10 = this.f16323s;
                this.f16318b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16325x, this.f16324w, this.f16319c, this.d, this.e, this.f16320f, this.h, this.f16321n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16322r;
                boolean z11 = this.f16323s;
                this.f16318b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16324w, (TLRPC.TL_messages_sendMedia) this.f16325x, this.f16319c, this.d, this.e, this.f16320f, this.h, this.f16321n, hashMap2, z11);
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16318b = sendMessagesHelper;
        this.v = n2Var;
        this.f16324w = tL_inputMediaStakeDice;
        this.f16325x = tL_messages_sendMedia;
        this.f16319c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16320f = z10;
        this.h = delayedMessage2;
        this.f16321n = obj;
        this.f16322r = hashMap;
        this.f16323s = z11;
    }
}
