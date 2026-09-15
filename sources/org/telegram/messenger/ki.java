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
    public final int f16593a = 2;
    public final SendMessagesHelper f16594b;
    public final MessageObject f16595c;
    public final String d;
    public final Object e;
    public final boolean f16596f;
    public final Object f16597g;
    public final Object h;
    public final Object f16598i;
    public final boolean f16599j;
    public final Object f16600k;
    public final Object f16601l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16594b = sendMessagesHelper;
        this.d = str;
        this.f16600k = list;
        this.f16596f = z10;
        this.f16595c = messageObject;
        this.f16601l = keyboardButtonProto;
        this.e = boVar;
        this.f16597g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16598i = inputCheckPasswordSRP;
        this.f16599j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16593a) {
            case 0:
                this.f16594b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16600k, (TLRPC.TL_messages_addPollAnswer) this.f16601l, this.f16595c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16596f, (SendMessagesHelper.DelayedMessage) this.f16597g, this.h, (HashMap) this.f16598i, this.f16599j, tLObject, tL_error);
                return;
            case 1:
                this.f16594b.lambda$performSendMessageRequest$101((TLObject) this.f16600k, this.f16595c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16596f, (SendMessagesHelper.DelayedMessage) this.f16597g, this.h, (HashMap) this.f16598i, this.f16599j, (TLRPC.Message) this.f16601l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16599j;
                String str = this.d;
                MessageObject messageObject = this.f16595c;
                this.f16594b.lambda$sendCallback$46(str, (List) this.f16600k, this.f16596f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16601l, (bo) this.e, (TwoStepVerificationActivity) this.f16597g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16598i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16594b = sendMessagesHelper;
        this.f16600k = tLObject;
        this.f16595c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16596f = z10;
        this.f16597g = delayedMessage2;
        this.h = obj;
        this.f16598i = hashMap;
        this.f16599j = z11;
        this.f16601l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16594b = sendMessagesHelper;
        this.f16600k = tL_messages_addPollAnswer;
        this.f16601l = tL_messages_addPollAnswer2;
        this.f16595c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16596f = z10;
        this.f16597g = delayedMessage2;
        this.h = obj;
        this.f16598i = hashMap;
        this.f16599j = z11;
    }
}
