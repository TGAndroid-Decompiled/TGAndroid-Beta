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
    public final int f18180a = 2;
    public final SendMessagesHelper f18181b;
    public final MessageObject f18182c;
    public final String d;
    public final Object f18183e;
    public final boolean f18184f;
    public final Object f18185g;
    public final Object h;
    public final Object f18186i;
    public final boolean f18187j;
    public final Object f18188k;
    public final Object f18189l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18181b = sendMessagesHelper;
        this.d = str;
        this.f18188k = list;
        this.f18184f = z10;
        this.f18182c = messageObject;
        this.f18189l = keyboardButtonProto;
        this.f18183e = coVar;
        this.f18185g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18186i = inputCheckPasswordSRP;
        this.f18187j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18180a) {
            case 0:
                this.f18181b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18188k, (TLRPC.TL_messages_addPollAnswer) this.f18189l, this.f18182c, this.d, (SendMessagesHelper.DelayedMessage) this.f18183e, this.f18184f, (SendMessagesHelper.DelayedMessage) this.f18185g, this.h, (HashMap) this.f18186i, this.f18187j, tLObject, tL_error);
                return;
            case 1:
                this.f18181b.lambda$performSendMessageRequest$101((TLObject) this.f18188k, this.f18182c, this.d, (SendMessagesHelper.DelayedMessage) this.f18183e, this.f18184f, (SendMessagesHelper.DelayedMessage) this.f18185g, this.h, (HashMap) this.f18186i, this.f18187j, (TLRPC.Message) this.f18189l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18187j;
                String str = this.d;
                MessageObject messageObject = this.f18182c;
                this.f18181b.lambda$sendCallback$46(str, (List) this.f18188k, this.f18184f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18189l, (co) this.f18183e, (TwoStepVerificationActivity) this.f18185g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18186i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18181b = sendMessagesHelper;
        this.f18188k = tLObject;
        this.f18182c = messageObject;
        this.d = str;
        this.f18183e = delayedMessage;
        this.f18184f = z10;
        this.f18185g = delayedMessage2;
        this.h = obj;
        this.f18186i = hashMap;
        this.f18187j = z11;
        this.f18189l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18181b = sendMessagesHelper;
        this.f18188k = tL_messages_addPollAnswer;
        this.f18189l = tL_messages_addPollAnswer2;
        this.f18182c = messageObject;
        this.d = str;
        this.f18183e = delayedMessage;
        this.f18184f = z10;
        this.f18185g = delayedMessage2;
        this.h = obj;
        this.f18186i = hashMap;
        this.f18187j = z11;
    }
}
