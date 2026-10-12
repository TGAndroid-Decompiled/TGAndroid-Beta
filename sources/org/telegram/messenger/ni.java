package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
public final class ni implements RequestDelegate {
    public final int f18401a = 0;
    public final SendMessagesHelper f18402b;
    public final MessageObject f18403c;
    public final String d;
    public final boolean f18404e;
    public final boolean f18405f;
    public final Object f18406g;
    public final Object h;
    public final Object f18407i;
    public final Object f18408j;
    public final Object f18409k;
    public final Object f18410l;

    public ni(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18402b = sendMessagesHelper;
        this.d = str;
        this.f18406g = list;
        this.f18404e = z10;
        this.f18403c = messageObject;
        this.h = keyboardButtonProto;
        this.f18407i = eoVar;
        this.f18408j = twoStepVerificationActivity;
        this.f18409k = tLObjectArr;
        this.f18410l = inputCheckPasswordSRP;
        this.f18405f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18401a) {
            case 0:
                List list = (List) this.f18406g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                eo eoVar = (eo) this.f18407i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18408j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18409k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18410l;
                boolean z10 = this.f18405f;
                this.f18402b.lambda$sendCallback$49(this.d, list, this.f18404e, this.f18403c, keyboardButtonProto, eoVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18402b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18406g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18403c, this.d, (SendMessagesHelper.DelayedMessage) this.f18407i, this.f18404e, (SendMessagesHelper.DelayedMessage) this.f18408j, this.f18409k, (HashMap) this.f18410l, this.f18405f, tLObject, tL_error);
                return;
            default:
                this.f18402b.lambda$performSendMessageRequest$104((TLObject) this.f18406g, this.f18403c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.f18404e, (SendMessagesHelper.DelayedMessage) this.f18407i, this.f18408j, (HashMap) this.f18409k, this.f18405f, (TLRPC.Message) this.f18410l, tLObject, tL_error);
                return;
        }
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18402b = sendMessagesHelper;
        this.f18406g = tLObject;
        this.f18403c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.f18404e = z10;
        this.f18407i = delayedMessage2;
        this.f18408j = obj;
        this.f18409k = hashMap;
        this.f18405f = z11;
        this.f18410l = message;
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18402b = sendMessagesHelper;
        this.f18406g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18403c = messageObject;
        this.d = str;
        this.f18407i = delayedMessage;
        this.f18404e = z10;
        this.f18408j = delayedMessage2;
        this.f18409k = obj;
        this.f18410l = hashMap;
        this.f18405f = z11;
    }
}
