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
public final class gi implements RequestDelegate {
    public final int f18466a = 0;
    public final SendMessagesHelper f18467b;
    public final MessageObject f18468c;
    public final String d;
    public final boolean e;
    public final boolean f18469f;
    public final Object f18470g;
    public final Object h;
    public final Object f18471i;
    public final Object f18472j;
    public final Object f18473k;
    public final Object f18474l;

    public gi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18467b = sendMessagesHelper;
        this.d = str;
        this.f18470g = list;
        this.e = z10;
        this.f18468c = messageObject;
        this.h = keyboardButtonProto;
        this.f18471i = qnVar;
        this.f18472j = twoStepVerificationActivity;
        this.f18473k = tLObjectArr;
        this.f18474l = inputCheckPasswordSRP;
        this.f18469f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18466a) {
            case 0:
                List list = (List) this.f18470g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                qn qnVar = (qn) this.f18471i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18472j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18473k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18474l;
                boolean z10 = this.f18469f;
                this.f18467b.lambda$sendCallback$49(this.d, list, this.e, this.f18468c, keyboardButtonProto, qnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18467b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18470g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18468c, this.d, (SendMessagesHelper.DelayedMessage) this.f18471i, this.e, (SendMessagesHelper.DelayedMessage) this.f18472j, this.f18473k, (HashMap) this.f18474l, this.f18469f, tLObject, tL_error);
                return;
            default:
                this.f18467b.lambda$performSendMessageRequest$104((TLObject) this.f18470g, this.f18468c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18471i, this.f18472j, (HashMap) this.f18473k, this.f18469f, (TLRPC.Message) this.f18474l, tLObject, tL_error);
                return;
        }
    }

    public gi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18467b = sendMessagesHelper;
        this.f18470g = tLObject;
        this.f18468c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18471i = delayedMessage2;
        this.f18472j = obj;
        this.f18473k = hashMap;
        this.f18469f = z11;
        this.f18474l = message;
    }

    public gi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18467b = sendMessagesHelper;
        this.f18470g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18468c = messageObject;
        this.d = str;
        this.f18471i = delayedMessage;
        this.e = z10;
        this.f18472j = delayedMessage2;
        this.f18473k = obj;
        this.f18474l = hashMap;
        this.f18469f = z11;
    }
}
