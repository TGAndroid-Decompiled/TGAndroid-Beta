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
public final class ji implements RequestDelegate {
    public final int f16491a = 2;
    public final SendMessagesHelper f16492b;
    public final MessageObject f16493c;
    public final String d;
    public final Object e;
    public final boolean f16494f;
    public final Object f16495g;
    public final Object h;
    public final Object f16496i;
    public final boolean f16497j;
    public final Object f16498k;
    public final Object f16499l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16492b = sendMessagesHelper;
        this.d = str;
        this.f16498k = list;
        this.f16494f = z10;
        this.f16493c = messageObject;
        this.f16499l = keyboardButtonProto;
        this.e = xnVar;
        this.f16495g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16496i = inputCheckPasswordSRP;
        this.f16497j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16491a) {
            case 0:
                this.f16492b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16498k, (TLRPC.TL_messages_addPollAnswer) this.f16499l, this.f16493c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16494f, (SendMessagesHelper.DelayedMessage) this.f16495g, this.h, (HashMap) this.f16496i, this.f16497j, tLObject, tL_error);
                return;
            case 1:
                this.f16492b.lambda$performSendMessageRequest$101((TLObject) this.f16498k, this.f16493c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16494f, (SendMessagesHelper.DelayedMessage) this.f16495g, this.h, (HashMap) this.f16496i, this.f16497j, (TLRPC.Message) this.f16499l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16497j;
                String str = this.d;
                MessageObject messageObject = this.f16493c;
                this.f16492b.lambda$sendCallback$46(str, (List) this.f16498k, this.f16494f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16499l, (xn) this.e, (TwoStepVerificationActivity) this.f16495g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16496i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16492b = sendMessagesHelper;
        this.f16498k = tLObject;
        this.f16493c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16494f = z10;
        this.f16495g = delayedMessage2;
        this.h = obj;
        this.f16496i = hashMap;
        this.f16497j = z11;
        this.f16499l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16492b = sendMessagesHelper;
        this.f16498k = tL_messages_addPollAnswer;
        this.f16499l = tL_messages_addPollAnswer2;
        this.f16493c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16494f = z10;
        this.f16495g = delayedMessage2;
        this.h = obj;
        this.f16496i = hashMap;
        this.f16497j = z11;
    }
}
