package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
public final class ki implements RequestDelegate {
    public final int f16590a = 2;
    public final SendMessagesHelper f16591b;
    public final MessageObject f16592c;
    public final String d;
    public final Object e;
    public final boolean f16593f;
    public final Object f16594g;
    public final Object h;
    public final Object f16595i;
    public final boolean f16596j;
    public final Object f16597k;
    public final Object f16598l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16591b = sendMessagesHelper;
        this.d = str;
        this.f16597k = list;
        this.f16593f = z10;
        this.f16592c = messageObject;
        this.f16598l = keyboardButtonProto;
        this.e = boVar;
        this.f16594g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16595i = inputCheckPasswordSRP;
        this.f16596j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16590a) {
            case 0:
                this.f16591b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16597k, (TLRPC.TL_messages_addPollAnswer) this.f16598l, this.f16592c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16593f, (SendMessagesHelper.DelayedMessage) this.f16594g, this.h, (HashMap) this.f16595i, this.f16596j, tLObject, tL_error);
                return;
            case 1:
                this.f16591b.lambda$performSendMessageRequest$101((TLObject) this.f16597k, this.f16592c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16593f, (SendMessagesHelper.DelayedMessage) this.f16594g, this.h, (HashMap) this.f16595i, this.f16596j, (TLRPC.Message) this.f16598l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16596j;
                String str = this.d;
                MessageObject messageObject = this.f16592c;
                this.f16591b.lambda$sendCallback$46(str, (List) this.f16597k, this.f16593f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16598l, (bo) this.e, (TwoStepVerificationActivity) this.f16594g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16595i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16591b = sendMessagesHelper;
        this.f16597k = tLObject;
        this.f16592c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16593f = z10;
        this.f16594g = delayedMessage2;
        this.h = obj;
        this.f16595i = hashMap;
        this.f16596j = z11;
        this.f16598l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16591b = sendMessagesHelper;
        this.f16597k = tL_messages_addPollAnswer;
        this.f16598l = tL_messages_addPollAnswer2;
        this.f16592c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16593f = z10;
        this.f16594g = delayedMessage2;
        this.h = obj;
        this.f16595i = hashMap;
        this.f16596j = z11;
    }
}
