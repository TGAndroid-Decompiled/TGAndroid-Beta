package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
public final class ki implements RequestDelegate {
    public final int f18207a = 2;
    public final SendMessagesHelper f18208b;
    public final MessageObject f18209c;
    public final String d;
    public final Object f18210e;
    public final boolean f18211f;
    public final Object f18212g;
    public final Object h;
    public final Object f18213i;
    public final boolean f18214j;
    public final Object f18215k;
    public final Object f18216l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18208b = sendMessagesHelper;
        this.d = str;
        this.f18215k = list;
        this.f18211f = z10;
        this.f18209c = messageObject;
        this.f18216l = keyboardButtonProto;
        this.f18210e = coVar;
        this.f18212g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18213i = inputCheckPasswordSRP;
        this.f18214j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18207a) {
            case 0:
                this.f18208b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18215k, (TLRPC.TL_messages_addPollAnswer) this.f18216l, this.f18209c, this.d, (SendMessagesHelper.DelayedMessage) this.f18210e, this.f18211f, (SendMessagesHelper.DelayedMessage) this.f18212g, this.h, (HashMap) this.f18213i, this.f18214j, tLObject, tL_error);
                return;
            case 1:
                this.f18208b.lambda$performSendMessageRequest$101((TLObject) this.f18215k, this.f18209c, this.d, (SendMessagesHelper.DelayedMessage) this.f18210e, this.f18211f, (SendMessagesHelper.DelayedMessage) this.f18212g, this.h, (HashMap) this.f18213i, this.f18214j, (TLRPC.Message) this.f18216l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18214j;
                String str = this.d;
                MessageObject messageObject = this.f18209c;
                this.f18208b.lambda$sendCallback$46(str, (List) this.f18215k, this.f18211f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18216l, (co) this.f18210e, (TwoStepVerificationActivity) this.f18212g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18213i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18208b = sendMessagesHelper;
        this.f18215k = tLObject;
        this.f18209c = messageObject;
        this.d = str;
        this.f18210e = delayedMessage;
        this.f18211f = z10;
        this.f18212g = delayedMessage2;
        this.h = obj;
        this.f18213i = hashMap;
        this.f18214j = z11;
        this.f18216l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18208b = sendMessagesHelper;
        this.f18215k = tL_messages_addPollAnswer;
        this.f18216l = tL_messages_addPollAnswer2;
        this.f18209c = messageObject;
        this.d = str;
        this.f18210e = delayedMessage;
        this.f18211f = z10;
        this.f18212g = delayedMessage2;
        this.h = obj;
        this.f18213i = hashMap;
        this.f18214j = z11;
    }
}
