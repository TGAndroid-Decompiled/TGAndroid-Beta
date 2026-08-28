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
public final class bi implements RequestDelegate {
    public final int f19866a = 2;
    public final SendMessagesHelper f19867b;
    public final MessageObject f19868c;
    public final String d;
    public final Object f19869e;
    public final boolean f19870f;
    public final Object f19871g;
    public final Object h;
    public final Object f19872i;
    public final boolean f19873j;
    public final Object f19874k;
    public final Object f19875l;

    public bi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f19867b = sendMessagesHelper;
        this.d = str;
        this.f19874k = list;
        this.f19870f = z10;
        this.f19868c = messageObject;
        this.f19875l = keyboardButtonProto;
        this.f19869e = qnVar;
        this.f19871g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f19872i = inputCheckPasswordSRP;
        this.f19873j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19866a) {
            case 0:
                this.f19867b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f19874k, (TLRPC.TL_messages_addPollAnswer) this.f19875l, this.f19868c, this.d, (SendMessagesHelper.DelayedMessage) this.f19869e, this.f19870f, (SendMessagesHelper.DelayedMessage) this.f19871g, this.h, (HashMap) this.f19872i, this.f19873j, tLObject, tL_error);
                return;
            case 1:
                this.f19867b.lambda$performSendMessageRequest$101((TLObject) this.f19874k, this.f19868c, this.d, (SendMessagesHelper.DelayedMessage) this.f19869e, this.f19870f, (SendMessagesHelper.DelayedMessage) this.f19871g, this.h, (HashMap) this.f19872i, this.f19873j, (TLRPC.Message) this.f19875l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f19873j;
                String str = this.d;
                MessageObject messageObject = this.f19868c;
                this.f19867b.lambda$sendCallback$46(str, (List) this.f19874k, this.f19870f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f19875l, (qn) this.f19869e, (TwoStepVerificationActivity) this.f19871g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f19872i, z10, tLObject, tL_error);
                return;
        }
    }

    public bi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f19867b = sendMessagesHelper;
        this.f19874k = tLObject;
        this.f19868c = messageObject;
        this.d = str;
        this.f19869e = delayedMessage;
        this.f19870f = z10;
        this.f19871g = delayedMessage2;
        this.h = obj;
        this.f19872i = hashMap;
        this.f19873j = z11;
        this.f19875l = message;
    }

    public bi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f19867b = sendMessagesHelper;
        this.f19874k = tL_messages_addPollAnswer;
        this.f19875l = tL_messages_addPollAnswer2;
        this.f19868c = messageObject;
        this.d = str;
        this.f19869e = delayedMessage;
        this.f19870f = z10;
        this.f19871g = delayedMessage2;
        this.h = obj;
        this.f19872i = hashMap;
        this.f19873j = z11;
    }
}
