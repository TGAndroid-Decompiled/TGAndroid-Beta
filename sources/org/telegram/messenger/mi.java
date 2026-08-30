package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.xn;
public final class mi implements RequestDelegate {
    public final int f17856a = 2;
    public final SendMessagesHelper f17857b;
    public final MessageObject f17858c;
    public final String d;
    public final Object e;
    public final boolean f17859f;
    public final Object f17860g;
    public final Object h;
    public final Object f17861i;
    public final boolean f17862j;
    public final Object f17863k;
    public final Object f17864l;

    public mi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z10) {
        this.f17857b = sendMessagesHelper;
        this.d = str;
        this.f17863k = list;
        this.f17859f = z4;
        this.f17858c = messageObject;
        this.f17864l = keyboardButtonProto;
        this.e = xnVar;
        this.f17860g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f17861i = inputCheckPasswordSRP;
        this.f17862j = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17856a) {
            case 0:
                this.f17857b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f17863k, (TLRPC.TL_messages_addPollAnswer) this.f17864l, this.f17858c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f17859f, (SendMessagesHelper.DelayedMessage) this.f17860g, this.h, (HashMap) this.f17861i, this.f17862j, tLObject, tL_error);
                return;
            case 1:
                this.f17857b.lambda$performSendMessageRequest$101((TLObject) this.f17863k, this.f17858c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f17859f, (SendMessagesHelper.DelayedMessage) this.f17860g, this.h, (HashMap) this.f17861i, this.f17862j, (TLRPC.Message) this.f17864l, tLObject, tL_error);
                return;
            default:
                boolean z4 = this.f17862j;
                String str = this.d;
                MessageObject messageObject = this.f17858c;
                this.f17857b.lambda$sendCallback$46(str, (List) this.f17863k, this.f17859f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f17864l, (xn) this.e, (TwoStepVerificationActivity) this.f17860g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f17861i, z4, tLObject, tL_error);
                return;
        }
    }

    public mi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, TLRPC.Message message) {
        this.f17857b = sendMessagesHelper;
        this.f17863k = tLObject;
        this.f17858c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17859f = z4;
        this.f17860g = delayedMessage2;
        this.h = obj;
        this.f17861i = hashMap;
        this.f17862j = z10;
        this.f17864l = message;
    }

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f17857b = sendMessagesHelper;
        this.f17863k = tL_messages_addPollAnswer;
        this.f17864l = tL_messages_addPollAnswer2;
        this.f17858c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17859f = z4;
        this.f17860g = delayedMessage2;
        this.h = obj;
        this.f17861i = hashMap;
        this.f17862j = z10;
    }
}
