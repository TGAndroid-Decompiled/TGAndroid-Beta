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
public final class ji implements RequestDelegate {
    public final int f18135a = 2;
    public final SendMessagesHelper f18136b;
    public final MessageObject f18137c;
    public final String d;
    public final Object f18138e;
    public final boolean f18139f;
    public final Object f18140g;
    public final Object h;
    public final Object f18141i;
    public final boolean f18142j;
    public final Object f18143k;
    public final Object f18144l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18136b = sendMessagesHelper;
        this.d = str;
        this.f18143k = list;
        this.f18139f = z10;
        this.f18137c = messageObject;
        this.f18144l = keyboardButtonProto;
        this.f18138e = coVar;
        this.f18140g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18141i = inputCheckPasswordSRP;
        this.f18142j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18135a) {
            case 0:
                this.f18136b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18143k, (TLRPC.TL_messages_addPollAnswer) this.f18144l, this.f18137c, this.d, (SendMessagesHelper.DelayedMessage) this.f18138e, this.f18139f, (SendMessagesHelper.DelayedMessage) this.f18140g, this.h, (HashMap) this.f18141i, this.f18142j, tLObject, tL_error);
                return;
            case 1:
                this.f18136b.lambda$performSendMessageRequest$101((TLObject) this.f18143k, this.f18137c, this.d, (SendMessagesHelper.DelayedMessage) this.f18138e, this.f18139f, (SendMessagesHelper.DelayedMessage) this.f18140g, this.h, (HashMap) this.f18141i, this.f18142j, (TLRPC.Message) this.f18144l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18142j;
                String str = this.d;
                MessageObject messageObject = this.f18137c;
                this.f18136b.lambda$sendCallback$46(str, (List) this.f18143k, this.f18139f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18144l, (co) this.f18138e, (TwoStepVerificationActivity) this.f18140g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18141i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18136b = sendMessagesHelper;
        this.f18143k = tLObject;
        this.f18137c = messageObject;
        this.d = str;
        this.f18138e = delayedMessage;
        this.f18139f = z10;
        this.f18140g = delayedMessage2;
        this.h = obj;
        this.f18141i = hashMap;
        this.f18142j = z11;
        this.f18144l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18136b = sendMessagesHelper;
        this.f18143k = tL_messages_addPollAnswer;
        this.f18144l = tL_messages_addPollAnswer2;
        this.f18137c = messageObject;
        this.d = str;
        this.f18138e = delayedMessage;
        this.f18139f = z10;
        this.f18140g = delayedMessage2;
        this.h = obj;
        this.f18141i = hashMap;
        this.f18142j = z11;
    }
}
