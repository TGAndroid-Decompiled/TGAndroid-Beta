package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
public final class ki implements RequestDelegate {
    public final int f17405a = 0;
    public final SendMessagesHelper f17406b;
    public final MessageObject f17407c;
    public final String d;
    public final boolean e;
    public final boolean f17408f;
    public final Object f17409g;
    public final Object h;
    public final Object f17410i;
    public final Object f17411j;
    public final Object f17412k;
    public final Object f17413l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, fo foVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f17406b = sendMessagesHelper;
        this.d = str;
        this.f17409g = list;
        this.e = z10;
        this.f17407c = messageObject;
        this.h = keyboardButtonProto;
        this.f17410i = foVar;
        this.f17411j = twoStepVerificationActivity;
        this.f17412k = tLObjectArr;
        this.f17413l = inputCheckPasswordSRP;
        this.f17408f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17405a) {
            case 0:
                List list = (List) this.f17409g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                fo foVar = (fo) this.f17410i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f17411j;
                TLObject[] tLObjectArr = (TLObject[]) this.f17412k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f17413l;
                boolean z10 = this.f17408f;
                this.f17406b.lambda$sendCallback$49(this.d, list, this.e, this.f17407c, keyboardButtonProto, foVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f17406b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f17409g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f17407c, this.d, (SendMessagesHelper.DelayedMessage) this.f17410i, this.e, (SendMessagesHelper.DelayedMessage) this.f17411j, this.f17412k, (HashMap) this.f17413l, this.f17408f, tLObject, tL_error);
                return;
            default:
                this.f17406b.lambda$performSendMessageRequest$104((TLObject) this.f17409g, this.f17407c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f17410i, this.f17411j, (HashMap) this.f17412k, this.f17408f, (TLRPC.Message) this.f17413l, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f17406b = sendMessagesHelper;
        this.f17409g = tLObject;
        this.f17407c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f17410i = delayedMessage2;
        this.f17411j = obj;
        this.f17412k = hashMap;
        this.f17408f = z11;
        this.f17413l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17406b = sendMessagesHelper;
        this.f17409g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f17407c = messageObject;
        this.d = str;
        this.f17410i = delayedMessage;
        this.e = z10;
        this.f17411j = delayedMessage2;
        this.f17412k = obj;
        this.f17413l = hashMap;
        this.f17408f = z11;
    }
}
