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
    public final int f16736a = 2;
    public final SendMessagesHelper f16737b;
    public final MessageObject f16738c;
    public final String d;
    public final Object e;
    public final boolean f16739f;
    public final Object f16740g;
    public final Object h;
    public final Object f16741i;
    public final boolean f16742j;
    public final Object f16743k;
    public final Object f16744l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16737b = sendMessagesHelper;
        this.d = str;
        this.f16743k = list;
        this.f16739f = z10;
        this.f16738c = messageObject;
        this.f16744l = keyboardButtonProto;
        this.e = wnVar;
        this.f16740g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16741i = inputCheckPasswordSRP;
        this.f16742j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16736a) {
            case 0:
                this.f16737b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16743k, (TLRPC.TL_messages_addPollAnswer) this.f16744l, this.f16738c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16739f, (SendMessagesHelper.DelayedMessage) this.f16740g, this.h, (HashMap) this.f16741i, this.f16742j, tLObject, tL_error);
                return;
            case 1:
                this.f16737b.lambda$performSendMessageRequest$101((TLObject) this.f16743k, this.f16738c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16739f, (SendMessagesHelper.DelayedMessage) this.f16740g, this.h, (HashMap) this.f16741i, this.f16742j, (TLRPC.Message) this.f16744l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16742j;
                String str = this.d;
                MessageObject messageObject = this.f16738c;
                this.f16737b.lambda$sendCallback$46(str, (List) this.f16743k, this.f16739f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16744l, (wn) this.e, (TwoStepVerificationActivity) this.f16740g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16741i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16737b = sendMessagesHelper;
        this.f16743k = tLObject;
        this.f16738c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16739f = z10;
        this.f16740g = delayedMessage2;
        this.h = obj;
        this.f16741i = hashMap;
        this.f16742j = z11;
        this.f16744l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16737b = sendMessagesHelper;
        this.f16743k = tL_messages_addPollAnswer;
        this.f16744l = tL_messages_addPollAnswer2;
        this.f16738c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16739f = z10;
        this.f16740g = delayedMessage2;
        this.h = obj;
        this.f16741i = hashMap;
        this.f16742j = z11;
    }
}
