package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.wn;
public final class ji implements RequestDelegate {
    public final int f16751a = 2;
    public final SendMessagesHelper f16752b;
    public final MessageObject f16753c;
    public final String d;
    public final Object e;
    public final boolean f16754f;
    public final Object f16755g;
    public final Object h;
    public final Object f16756i;
    public final boolean f16757j;
    public final Object f16758k;
    public final Object f16759l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16752b = sendMessagesHelper;
        this.d = str;
        this.f16758k = list;
        this.f16754f = z10;
        this.f16753c = messageObject;
        this.f16759l = keyboardButtonProto;
        this.e = wnVar;
        this.f16755g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16756i = inputCheckPasswordSRP;
        this.f16757j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16751a) {
            case 0:
                this.f16752b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16758k, (TLRPC.TL_messages_addPollAnswer) this.f16759l, this.f16753c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16754f, (SendMessagesHelper.DelayedMessage) this.f16755g, this.h, (HashMap) this.f16756i, this.f16757j, tLObject, tL_error);
                return;
            case 1:
                this.f16752b.lambda$performSendMessageRequest$101((TLObject) this.f16758k, this.f16753c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16754f, (SendMessagesHelper.DelayedMessage) this.f16755g, this.h, (HashMap) this.f16756i, this.f16757j, (TLRPC.Message) this.f16759l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16757j;
                String str = this.d;
                MessageObject messageObject = this.f16753c;
                this.f16752b.lambda$sendCallback$46(str, (List) this.f16758k, this.f16754f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16759l, (wn) this.e, (TwoStepVerificationActivity) this.f16755g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16756i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16752b = sendMessagesHelper;
        this.f16758k = tLObject;
        this.f16753c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16754f = z10;
        this.f16755g = delayedMessage2;
        this.h = obj;
        this.f16756i = hashMap;
        this.f16757j = z11;
        this.f16759l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16752b = sendMessagesHelper;
        this.f16758k = tL_messages_addPollAnswer;
        this.f16759l = tL_messages_addPollAnswer2;
        this.f16753c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16754f = z10;
        this.f16755g = delayedMessage2;
        this.h = obj;
        this.f16756i = hashMap;
        this.f16757j = z11;
    }
}
