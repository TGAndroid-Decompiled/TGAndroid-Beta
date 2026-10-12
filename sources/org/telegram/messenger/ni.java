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
    public final int f18400a = 0;
    public final SendMessagesHelper f18401b;
    public final MessageObject f18402c;
    public final String d;
    public final boolean f18403e;
    public final boolean f18404f;
    public final Object f18405g;
    public final Object h;
    public final Object f18406i;
    public final Object f18407j;
    public final Object f18408k;
    public final Object f18409l;

    public ni(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18401b = sendMessagesHelper;
        this.d = str;
        this.f18405g = list;
        this.f18403e = z10;
        this.f18402c = messageObject;
        this.h = keyboardButtonProto;
        this.f18406i = eoVar;
        this.f18407j = twoStepVerificationActivity;
        this.f18408k = tLObjectArr;
        this.f18409l = inputCheckPasswordSRP;
        this.f18404f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18400a) {
            case 0:
                List list = (List) this.f18405g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                eo eoVar = (eo) this.f18406i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18407j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18408k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18409l;
                boolean z10 = this.f18404f;
                this.f18401b.lambda$sendCallback$49(this.d, list, this.f18403e, this.f18402c, keyboardButtonProto, eoVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18401b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18405g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18402c, this.d, (SendMessagesHelper.DelayedMessage) this.f18406i, this.f18403e, (SendMessagesHelper.DelayedMessage) this.f18407j, this.f18408k, (HashMap) this.f18409l, this.f18404f, tLObject, tL_error);
                return;
            default:
                this.f18401b.lambda$performSendMessageRequest$104((TLObject) this.f18405g, this.f18402c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.f18403e, (SendMessagesHelper.DelayedMessage) this.f18406i, this.f18407j, (HashMap) this.f18408k, this.f18404f, (TLRPC.Message) this.f18409l, tLObject, tL_error);
                return;
        }
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18401b = sendMessagesHelper;
        this.f18405g = tLObject;
        this.f18402c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.f18403e = z10;
        this.f18406i = delayedMessage2;
        this.f18407j = obj;
        this.f18408k = hashMap;
        this.f18404f = z11;
        this.f18409l = message;
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18401b = sendMessagesHelper;
        this.f18405g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18402c = messageObject;
        this.d = str;
        this.f18406i = delayedMessage;
        this.f18403e = z10;
        this.f18407j = delayedMessage2;
        this.f18408k = obj;
        this.f18409l = hashMap;
        this.f18404f = z11;
    }
}
