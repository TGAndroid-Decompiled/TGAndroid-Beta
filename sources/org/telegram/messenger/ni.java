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
public final class ni implements RequestDelegate {
    public final int f19487a = 2;
    public final SendMessagesHelper f19488b;
    public final MessageObject f19489c;
    public final String d;
    public final Object f19490e;
    public final boolean f19491f;
    public final Object f19492g;
    public final Object h;
    public final Object f19493i;
    public final boolean f19494j;
    public final Object f19495k;
    public final Object f19496l;

    public ni(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z10) {
        this.f19488b = sendMessagesHelper;
        this.d = str;
        this.f19495k = list;
        this.f19491f = z4;
        this.f19489c = messageObject;
        this.f19496l = keyboardButtonProto;
        this.f19490e = xnVar;
        this.f19492g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f19493i = inputCheckPasswordSRP;
        this.f19494j = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19487a) {
            case 0:
                this.f19488b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f19495k, (TLRPC.TL_messages_addPollAnswer) this.f19496l, this.f19489c, this.d, (SendMessagesHelper.DelayedMessage) this.f19490e, this.f19491f, (SendMessagesHelper.DelayedMessage) this.f19492g, this.h, (HashMap) this.f19493i, this.f19494j, tLObject, tL_error);
                return;
            case 1:
                this.f19488b.lambda$performSendMessageRequest$101((TLObject) this.f19495k, this.f19489c, this.d, (SendMessagesHelper.DelayedMessage) this.f19490e, this.f19491f, (SendMessagesHelper.DelayedMessage) this.f19492g, this.h, (HashMap) this.f19493i, this.f19494j, (TLRPC.Message) this.f19496l, tLObject, tL_error);
                return;
            default:
                boolean z4 = this.f19494j;
                String str = this.d;
                MessageObject messageObject = this.f19489c;
                this.f19488b.lambda$sendCallback$46(str, (List) this.f19495k, this.f19491f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f19496l, (xn) this.f19490e, (TwoStepVerificationActivity) this.f19492g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f19493i, z4, tLObject, tL_error);
                return;
        }
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, TLRPC.Message message) {
        this.f19488b = sendMessagesHelper;
        this.f19495k = tLObject;
        this.f19489c = messageObject;
        this.d = str;
        this.f19490e = delayedMessage;
        this.f19491f = z4;
        this.f19492g = delayedMessage2;
        this.h = obj;
        this.f19493i = hashMap;
        this.f19494j = z10;
        this.f19496l = message;
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f19488b = sendMessagesHelper;
        this.f19495k = tL_messages_addPollAnswer;
        this.f19496l = tL_messages_addPollAnswer2;
        this.f19489c = messageObject;
        this.d = str;
        this.f19490e = delayedMessage;
        this.f19491f = z4;
        this.f19492g = delayedMessage2;
        this.h = obj;
        this.f19493i = hashMap;
        this.f19494j = z10;
    }
}
