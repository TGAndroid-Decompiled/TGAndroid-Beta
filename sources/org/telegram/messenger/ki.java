package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.yn;
public final class ki implements RequestDelegate {
    public final int f18384a = 2;
    public final SendMessagesHelper f18385b;
    public final MessageObject f18386c;
    public final String d;
    public final Object f18387e;
    public final boolean f18388f;
    public final Object f18389g;
    public final Object h;
    public final Object f18390i;
    public final boolean f18391j;
    public final Object f18392k;
    public final Object f18393l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18385b = sendMessagesHelper;
        this.d = str;
        this.f18392k = list;
        this.f18388f = z10;
        this.f18386c = messageObject;
        this.f18393l = keyboardButtonProto;
        this.f18387e = ynVar;
        this.f18389g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18390i = inputCheckPasswordSRP;
        this.f18391j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18384a) {
            case 0:
                this.f18385b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18392k, (TLRPC.TL_messages_addPollAnswer) this.f18393l, this.f18386c, this.d, (SendMessagesHelper.DelayedMessage) this.f18387e, this.f18388f, (SendMessagesHelper.DelayedMessage) this.f18389g, this.h, (HashMap) this.f18390i, this.f18391j, tLObject, tL_error);
                return;
            case 1:
                this.f18385b.lambda$performSendMessageRequest$101((TLObject) this.f18392k, this.f18386c, this.d, (SendMessagesHelper.DelayedMessage) this.f18387e, this.f18388f, (SendMessagesHelper.DelayedMessage) this.f18389g, this.h, (HashMap) this.f18390i, this.f18391j, (TLRPC.Message) this.f18393l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18391j;
                String str = this.d;
                MessageObject messageObject = this.f18386c;
                this.f18385b.lambda$sendCallback$46(str, (List) this.f18392k, this.f18388f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18393l, (yn) this.f18387e, (TwoStepVerificationActivity) this.f18389g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18390i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18385b = sendMessagesHelper;
        this.f18392k = tLObject;
        this.f18386c = messageObject;
        this.d = str;
        this.f18387e = delayedMessage;
        this.f18388f = z10;
        this.f18389g = delayedMessage2;
        this.h = obj;
        this.f18390i = hashMap;
        this.f18391j = z11;
        this.f18393l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18385b = sendMessagesHelper;
        this.f18392k = tL_messages_addPollAnswer;
        this.f18393l = tL_messages_addPollAnswer2;
        this.f18386c = messageObject;
        this.d = str;
        this.f18387e = delayedMessage;
        this.f18388f = z10;
        this.f18389g = delayedMessage2;
        this.h = obj;
        this.f18390i = hashMap;
        this.f18391j = z11;
    }
}
