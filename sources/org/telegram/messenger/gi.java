package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
public final class gi implements RequestDelegate {
    public final int f18532a = 0;
    public final SendMessagesHelper f18533b;
    public final MessageObject f18534c;
    public final String d;
    public final boolean e;
    public final boolean f18535f;
    public final Object f18536g;
    public final Object h;
    public final Object f18537i;
    public final Object f18538j;
    public final Object f18539k;
    public final Object f18540l;

    public gi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18533b = sendMessagesHelper;
        this.d = str;
        this.f18536g = list;
        this.e = z10;
        this.f18534c = messageObject;
        this.h = keyboardButtonProto;
        this.f18537i = snVar;
        this.f18538j = twoStepVerificationActivity;
        this.f18539k = tLObjectArr;
        this.f18540l = inputCheckPasswordSRP;
        this.f18535f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18532a) {
            case 0:
                List list = (List) this.f18536g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                sn snVar = (sn) this.f18537i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18538j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18539k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18540l;
                boolean z10 = this.f18535f;
                this.f18533b.lambda$sendCallback$49(this.d, list, this.e, this.f18534c, keyboardButtonProto, snVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18533b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18536g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18534c, this.d, (SendMessagesHelper.DelayedMessage) this.f18537i, this.e, (SendMessagesHelper.DelayedMessage) this.f18538j, this.f18539k, (HashMap) this.f18540l, this.f18535f, tLObject, tL_error);
                return;
            default:
                this.f18533b.lambda$performSendMessageRequest$104((TLObject) this.f18536g, this.f18534c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18537i, this.f18538j, (HashMap) this.f18539k, this.f18535f, (TLRPC.Message) this.f18540l, tLObject, tL_error);
                return;
        }
    }

    public gi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18533b = sendMessagesHelper;
        this.f18536g = tLObject;
        this.f18534c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18537i = delayedMessage2;
        this.f18538j = obj;
        this.f18539k = hashMap;
        this.f18535f = z11;
        this.f18540l = message;
    }

    public gi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18533b = sendMessagesHelper;
        this.f18536g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18534c = messageObject;
        this.d = str;
        this.f18537i = delayedMessage;
        this.e = z10;
        this.f18538j = delayedMessage2;
        this.f18539k = obj;
        this.f18540l = hashMap;
        this.f18535f = z11;
    }
}
