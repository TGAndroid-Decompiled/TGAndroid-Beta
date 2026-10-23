package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f19159a = 0;
    public final SendMessagesHelper f19160b;
    public final MessageObject f19161c;
    public final String d;
    public final SendMessagesHelper.DelayedMessage e;
    public final boolean f19162f;
    public final SendMessagesHelper.DelayedMessage h;
    public final Object f19163n;
    public final HashMap f19164r;
    public final boolean f19165s;
    public final Object v;
    public final TLObject f19166w;
    public final TLObject f19167x;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19160b = sendMessagesHelper;
        this.v = tLObject;
        this.f19167x = tL_messages_addPollAnswer;
        this.f19166w = tLObject2;
        this.f19161c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19162f = z10;
        this.h = delayedMessage2;
        this.f19163n = obj;
        this.f19164r = hashMap;
        this.f19165s = z11;
    }

    @Override
    public final void run() {
        switch (this.f19159a) {
            case 0:
                HashMap hashMap = this.f19164r;
                boolean z10 = this.f19165s;
                this.f19160b.lambda$performSendMessageRequest$78((TLObject) this.v, (TLRPC.TL_messages_addPollAnswer) this.f19167x, this.f19166w, this.f19161c, this.d, this.e, this.f19162f, this.h, this.f19163n, hashMap, z10);
                return;
            default:
                HashMap hashMap2 = this.f19164r;
                boolean z11 = this.f19165s;
                this.f19160b.lambda$performSendMessageRequest$86((org.telegram.ui.ActionBar.n2) this.v, (TLRPC.TL_inputMediaStakeDice) this.f19166w, (TLRPC.TL_messages_sendMedia) this.f19167x, this.f19161c, this.d, this.e, this.f19162f, this.h, this.f19163n, hashMap2, z11);
                return;
        }
    }

    public oj(SendMessagesHelper sendMessagesHelper, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19160b = sendMessagesHelper;
        this.v = n2Var;
        this.f19166w = tL_inputMediaStakeDice;
        this.f19167x = tL_messages_sendMedia;
        this.f19161c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f19162f = z10;
        this.h = delayedMessage2;
        this.f19163n = obj;
        this.f19164r = hashMap;
        this.f19165s = z11;
    }
}
