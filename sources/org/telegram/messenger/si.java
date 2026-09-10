package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
public final class si implements RequestDelegate {
    public final int f16326a = 2;
    public final SendMessagesHelper f16327b;
    public final MessageObject f16328c;
    public final String d;
    public final Object e;
    public final boolean f16329f;
    public final Object f16330g;
    public final Object h;
    public final Object f16331i;
    public final boolean f16332j;
    public final Object f16333k;
    public final Object f16334l;

    public si(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16327b = sendMessagesHelper;
        this.d = str;
        this.f16333k = list;
        this.f16329f = z10;
        this.f16328c = messageObject;
        this.f16334l = keyboardButtonProto;
        this.e = eoVar;
        this.f16330g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16331i = inputCheckPasswordSRP;
        this.f16332j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16326a) {
            case 0:
                this.f16327b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16333k, (TLRPC.TL_messages_addPollAnswer) this.f16334l, this.f16328c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16329f, (SendMessagesHelper.DelayedMessage) this.f16330g, this.h, (HashMap) this.f16331i, this.f16332j, tLObject, tL_error);
                return;
            case 1:
                this.f16327b.lambda$performSendMessageRequest$101((TLObject) this.f16333k, this.f16328c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16329f, (SendMessagesHelper.DelayedMessage) this.f16330g, this.h, (HashMap) this.f16331i, this.f16332j, (TLRPC.Message) this.f16334l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16332j;
                String str = this.d;
                MessageObject messageObject = this.f16328c;
                this.f16327b.lambda$sendCallback$46(str, (List) this.f16333k, this.f16329f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16334l, (eo) this.e, (TwoStepVerificationActivity) this.f16330g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16331i, z10, tLObject, tL_error);
                return;
        }
    }

    public si(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16327b = sendMessagesHelper;
        this.f16333k = tLObject;
        this.f16328c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16329f = z10;
        this.f16330g = delayedMessage2;
        this.h = obj;
        this.f16331i = hashMap;
        this.f16332j = z11;
        this.f16334l = message;
    }

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16327b = sendMessagesHelper;
        this.f16333k = tL_messages_addPollAnswer;
        this.f16334l = tL_messages_addPollAnswer2;
        this.f16328c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16329f = z10;
        this.f16330g = delayedMessage2;
        this.h = obj;
        this.f16331i = hashMap;
        this.f16332j = z11;
    }
}
