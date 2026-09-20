package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.zn;
public final class ki implements RequestDelegate {
    public final int f16823a = 2;
    public final SendMessagesHelper f16824b;
    public final MessageObject f16825c;
    public final String d;
    public final Object e;
    public final boolean f16826f;
    public final Object f16827g;
    public final Object h;
    public final Object f16828i;
    public final boolean f16829j;
    public final Object f16830k;
    public final Object f16831l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16824b = sendMessagesHelper;
        this.d = str;
        this.f16830k = list;
        this.f16826f = z10;
        this.f16825c = messageObject;
        this.f16831l = keyboardButtonProto;
        this.e = znVar;
        this.f16827g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16828i = inputCheckPasswordSRP;
        this.f16829j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16823a) {
            case 0:
                this.f16824b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16830k, (TLRPC.TL_messages_addPollAnswer) this.f16831l, this.f16825c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16826f, (SendMessagesHelper.DelayedMessage) this.f16827g, this.h, (HashMap) this.f16828i, this.f16829j, tLObject, tL_error);
                return;
            case 1:
                this.f16824b.lambda$performSendMessageRequest$101((TLObject) this.f16830k, this.f16825c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16826f, (SendMessagesHelper.DelayedMessage) this.f16827g, this.h, (HashMap) this.f16828i, this.f16829j, (TLRPC.Message) this.f16831l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16829j;
                String str = this.d;
                MessageObject messageObject = this.f16825c;
                this.f16824b.lambda$sendCallback$46(str, (List) this.f16830k, this.f16826f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16831l, (zn) this.e, (TwoStepVerificationActivity) this.f16827g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16828i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16824b = sendMessagesHelper;
        this.f16830k = tLObject;
        this.f16825c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16826f = z10;
        this.f16827g = delayedMessage2;
        this.h = obj;
        this.f16828i = hashMap;
        this.f16829j = z11;
        this.f16831l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16824b = sendMessagesHelper;
        this.f16830k = tL_messages_addPollAnswer;
        this.f16831l = tL_messages_addPollAnswer2;
        this.f16825c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16826f = z10;
        this.f16827g = delayedMessage2;
        this.h = obj;
        this.f16828i = hashMap;
        this.f16829j = z11;
    }
}
