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
public final class ji implements RequestDelegate {
    public final int f18277a = 0;
    public final SendMessagesHelper f18278b;
    public final MessageObject f18279c;
    public final String d;
    public final boolean f18280e;
    public final boolean f18281f;
    public final Object f18282g;
    public final Object h;
    public final Object f18283i;
    public final Object f18284j;
    public final Object f18285k;
    public final Object f18286l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18278b = sendMessagesHelper;
        this.d = str;
        this.f18282g = list;
        this.f18280e = z10;
        this.f18279c = messageObject;
        this.h = keyboardButtonProto;
        this.f18283i = znVar;
        this.f18284j = twoStepVerificationActivity;
        this.f18285k = tLObjectArr;
        this.f18286l = inputCheckPasswordSRP;
        this.f18281f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18277a) {
            case 0:
                List list = (List) this.f18282g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                zn znVar = (zn) this.f18283i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18284j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18285k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18286l;
                boolean z10 = this.f18281f;
                this.f18278b.lambda$sendCallback$49(this.d, list, this.f18280e, this.f18279c, keyboardButtonProto, znVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18278b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18282g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18279c, this.d, (SendMessagesHelper.DelayedMessage) this.f18283i, this.f18280e, (SendMessagesHelper.DelayedMessage) this.f18284j, this.f18285k, (HashMap) this.f18286l, this.f18281f, tLObject, tL_error);
                return;
            default:
                this.f18278b.lambda$performSendMessageRequest$104((TLObject) this.f18282g, this.f18279c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.f18280e, (SendMessagesHelper.DelayedMessage) this.f18283i, this.f18284j, (HashMap) this.f18285k, this.f18281f, (TLRPC.Message) this.f18286l, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18278b = sendMessagesHelper;
        this.f18282g = tLObject;
        this.f18279c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.f18280e = z10;
        this.f18283i = delayedMessage2;
        this.f18284j = obj;
        this.f18285k = hashMap;
        this.f18281f = z11;
        this.f18286l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18278b = sendMessagesHelper;
        this.f18282g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18279c = messageObject;
        this.d = str;
        this.f18283i = delayedMessage;
        this.f18280e = z10;
        this.f18284j = delayedMessage2;
        this.f18285k = obj;
        this.f18286l = hashMap;
        this.f18281f = z11;
    }
}
