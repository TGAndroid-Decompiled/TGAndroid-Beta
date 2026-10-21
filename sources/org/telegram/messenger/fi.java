package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qn;
public final class fi implements RequestDelegate {
    public final int f18373a = 0;
    public final SendMessagesHelper f18374b;
    public final MessageObject f18375c;
    public final String d;
    public final boolean e;
    public final boolean f18376f;
    public final Object f18377g;
    public final Object h;
    public final Object f18378i;
    public final Object f18379j;
    public final Object f18380k;
    public final Object f18381l;

    public fi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18374b = sendMessagesHelper;
        this.d = str;
        this.f18377g = list;
        this.e = z10;
        this.f18375c = messageObject;
        this.h = keyboardButtonProto;
        this.f18378i = qnVar;
        this.f18379j = twoStepVerificationActivity;
        this.f18380k = tLObjectArr;
        this.f18381l = inputCheckPasswordSRP;
        this.f18376f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18373a) {
            case 0:
                List list = (List) this.f18377g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                qn qnVar = (qn) this.f18378i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18379j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18380k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18381l;
                boolean z10 = this.f18376f;
                this.f18374b.lambda$sendCallback$49(this.d, list, this.e, this.f18375c, keyboardButtonProto, qnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18374b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18377g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18375c, this.d, (SendMessagesHelper.DelayedMessage) this.f18378i, this.e, (SendMessagesHelper.DelayedMessage) this.f18379j, this.f18380k, (HashMap) this.f18381l, this.f18376f, tLObject, tL_error);
                return;
            default:
                this.f18374b.lambda$performSendMessageRequest$104((TLObject) this.f18377g, this.f18375c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18378i, this.f18379j, (HashMap) this.f18380k, this.f18376f, (TLRPC.Message) this.f18381l, tLObject, tL_error);
                return;
        }
    }

    public fi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18374b = sendMessagesHelper;
        this.f18377g = tLObject;
        this.f18375c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18378i = delayedMessage2;
        this.f18379j = obj;
        this.f18380k = hashMap;
        this.f18376f = z11;
        this.f18381l = message;
    }

    public fi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18374b = sendMessagesHelper;
        this.f18377g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18375c = messageObject;
        this.d = str;
        this.f18378i = delayedMessage;
        this.e = z10;
        this.f18379j = delayedMessage2;
        this.f18380k = obj;
        this.f18381l = hashMap;
        this.f18376f = z11;
    }
}
