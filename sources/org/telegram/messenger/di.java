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
public final class di implements RequestDelegate {
    public final int f18206a = 0;
    public final SendMessagesHelper f18207b;
    public final MessageObject f18208c;
    public final String d;
    public final boolean e;
    public final boolean f18209f;
    public final Object f18210g;
    public final Object h;
    public final Object f18211i;
    public final Object f18212j;
    public final Object f18213k;
    public final Object f18214l;

    public di(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18207b = sendMessagesHelper;
        this.d = str;
        this.f18210g = list;
        this.e = z10;
        this.f18208c = messageObject;
        this.h = keyboardButtonProto;
        this.f18211i = snVar;
        this.f18212j = twoStepVerificationActivity;
        this.f18213k = tLObjectArr;
        this.f18214l = inputCheckPasswordSRP;
        this.f18209f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18206a) {
            case 0:
                List list = (List) this.f18210g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                sn snVar = (sn) this.f18211i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18212j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18213k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18214l;
                boolean z10 = this.f18209f;
                this.f18207b.lambda$sendCallback$49(this.d, list, this.e, this.f18208c, keyboardButtonProto, snVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18207b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18210g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18208c, this.d, (SendMessagesHelper.DelayedMessage) this.f18211i, this.e, (SendMessagesHelper.DelayedMessage) this.f18212j, this.f18213k, (HashMap) this.f18214l, this.f18209f, tLObject, tL_error);
                return;
            default:
                this.f18207b.lambda$performSendMessageRequest$104((TLObject) this.f18210g, this.f18208c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18211i, this.f18212j, (HashMap) this.f18213k, this.f18209f, (TLRPC.Message) this.f18214l, tLObject, tL_error);
                return;
        }
    }

    public di(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18207b = sendMessagesHelper;
        this.f18210g = tLObject;
        this.f18208c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18211i = delayedMessage2;
        this.f18212j = obj;
        this.f18213k = hashMap;
        this.f18209f = z11;
        this.f18214l = message;
    }

    public di(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18207b = sendMessagesHelper;
        this.f18210g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18208c = messageObject;
        this.d = str;
        this.f18211i = delayedMessage;
        this.e = z10;
        this.f18212j = delayedMessage2;
        this.f18213k = obj;
        this.f18214l = hashMap;
        this.f18209f = z11;
    }
}
