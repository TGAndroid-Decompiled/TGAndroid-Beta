package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f16159a = 0;
    public final SendMessagesHelper f16160b;
    public final MessageObject f16161c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f16162f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f16163n;
    public final HashMap f16164r;
    public final boolean f16165s;
    public final Object v;
    public final TLObject f16166w;
    public final TLObject f16167x;

    public qj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16160b = sendMessagesHelper;
        this.v = tLObject;
        this.f16167x = tL_messages_addPollAnswer;
        this.f16166w = tLObject2;
        this.f16161c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16162f = z10;
        this.h = delayedMessage2;
        this.f16163n = obj;
        this.f16164r = hashMap;
        this.f16165s = z11;
    }

    @Override
    public final void run() {
        switch (this.f16159a) {
            case 0:
                HashMap hashMap = this.f16164r;
                boolean z10 = this.f16165s;
                this.f16160b.lambda$performSendMessageRequest$75((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f16167x, this.f16166w, this.f16161c, this.d, this.e, this.f16162f, this.h, this.f16163n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f16164r;
                boolean z11 = this.f16165s;
                this.f16160b.lambda$performSendMessageRequest$83((org.telegram.ui.ActionBar.p2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f16166w, (TLRPC.TL_messages_sendMedia) this.f16167x, this.f16161c, this.d, this.e, this.f16162f, this.h, this.f16163n, hashMap2, z11);
                return;
        }
    }

    public qj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16160b = sendMessagesHelper;
        this.v = p2Var;
        this.f16166w = tL_inputMediaStakeDice;
        this.f16167x = tL_messages_sendMedia;
        this.f16161c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16162f = z10;
        this.h = delayedMessage2;
        this.f16163n = obj;
        this.f16164r = hashMap;
        this.f16165s = z11;
    }
}
