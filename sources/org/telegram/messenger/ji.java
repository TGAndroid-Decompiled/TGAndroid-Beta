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
    public final int f18108a = 2;
    public final SendMessagesHelper f18109b;
    public final MessageObject f18110c;
    public final String d;
    public final Object f18111e;
    public final boolean f18112f;
    public final Object f18113g;
    public final Object h;
    public final Object f18114i;
    public final boolean f18115j;
    public final Object f18116k;
    public final Object f18117l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18109b = sendMessagesHelper;
        this.d = str;
        this.f18116k = list;
        this.f18112f = z10;
        this.f18110c = messageObject;
        this.f18117l = keyboardButtonProto;
        this.f18111e = coVar;
        this.f18113g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18114i = inputCheckPasswordSRP;
        this.f18115j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18108a) {
            case 0:
                this.f18109b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18116k, (TLRPC.TL_messages_addPollAnswer) this.f18117l, this.f18110c, this.d, (SendMessagesHelper.DelayedMessage) this.f18111e, this.f18112f, (SendMessagesHelper.DelayedMessage) this.f18113g, this.h, (HashMap) this.f18114i, this.f18115j, tLObject, tL_error);
                return;
            case 1:
                this.f18109b.lambda$performSendMessageRequest$101((TLObject) this.f18116k, this.f18110c, this.d, (SendMessagesHelper.DelayedMessage) this.f18111e, this.f18112f, (SendMessagesHelper.DelayedMessage) this.f18113g, this.h, (HashMap) this.f18114i, this.f18115j, (TLRPC.Message) this.f18117l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18115j;
                String str = this.d;
                MessageObject messageObject = this.f18110c;
                this.f18109b.lambda$sendCallback$46(str, (List) this.f18116k, this.f18112f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18117l, (co) this.f18111e, (TwoStepVerificationActivity) this.f18113g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18114i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18109b = sendMessagesHelper;
        this.f18116k = tLObject;
        this.f18110c = messageObject;
        this.d = str;
        this.f18111e = delayedMessage;
        this.f18112f = z10;
        this.f18113g = delayedMessage2;
        this.h = obj;
        this.f18114i = hashMap;
        this.f18115j = z11;
        this.f18117l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18109b = sendMessagesHelper;
        this.f18116k = tL_messages_addPollAnswer;
        this.f18117l = tL_messages_addPollAnswer2;
        this.f18110c = messageObject;
        this.d = str;
        this.f18111e = delayedMessage;
        this.f18112f = z10;
        this.f18113g = delayedMessage2;
        this.h = obj;
        this.f18114i = hashMap;
        this.f18115j = z11;
    }
}
