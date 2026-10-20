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
    public final int f18376a = 0;
    public final SendMessagesHelper f18377b;
    public final MessageObject f18378c;
    public final String d;
    public final boolean e;
    public final boolean f18379f;
    public final Object f18380g;
    public final Object h;
    public final Object f18381i;
    public final Object f18382j;
    public final Object f18383k;
    public final Object f18384l;

    public fi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18377b = sendMessagesHelper;
        this.d = str;
        this.f18380g = list;
        this.e = z10;
        this.f18378c = messageObject;
        this.h = keyboardButtonProto;
        this.f18381i = qnVar;
        this.f18382j = twoStepVerificationActivity;
        this.f18383k = tLObjectArr;
        this.f18384l = inputCheckPasswordSRP;
        this.f18379f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18376a) {
            case 0:
                List list = (List) this.f18380g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                qn qnVar = (qn) this.f18381i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18382j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18383k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18384l;
                boolean z10 = this.f18379f;
                this.f18377b.lambda$sendCallback$49(this.d, list, this.e, this.f18378c, keyboardButtonProto, qnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18377b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18380g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18378c, this.d, (SendMessagesHelper.DelayedMessage) this.f18381i, this.e, (SendMessagesHelper.DelayedMessage) this.f18382j, this.f18383k, (HashMap) this.f18384l, this.f18379f, tLObject, tL_error);
                return;
            default:
                this.f18377b.lambda$performSendMessageRequest$104((TLObject) this.f18380g, this.f18378c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18381i, this.f18382j, (HashMap) this.f18383k, this.f18379f, (TLRPC.Message) this.f18384l, tLObject, tL_error);
                return;
        }
    }

    public fi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18377b = sendMessagesHelper;
        this.f18380g = tLObject;
        this.f18378c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18381i = delayedMessage2;
        this.f18382j = obj;
        this.f18383k = hashMap;
        this.f18379f = z11;
        this.f18384l = message;
    }

    public fi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18377b = sendMessagesHelper;
        this.f18380g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18378c = messageObject;
        this.d = str;
        this.f18381i = delayedMessage;
        this.e = z10;
        this.f18382j = delayedMessage2;
        this.f18383k = obj;
        this.f18384l = hashMap;
        this.f18379f = z11;
    }
}
