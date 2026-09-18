package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.zn;
public final class li implements RequestDelegate {
    public final int f16869a = 2;
    public final SendMessagesHelper f16870b;
    public final MessageObject f16871c;
    public final String d;
    public final Object e;
    public final boolean f16872f;
    public final Object f16873g;
    public final Object h;
    public final Object f16874i;
    public final boolean f16875j;
    public final Object f16876k;
    public final Object f16877l;

    public li(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16870b = sendMessagesHelper;
        this.d = str;
        this.f16876k = list;
        this.f16872f = z10;
        this.f16871c = messageObject;
        this.f16877l = keyboardButtonProto;
        this.e = znVar;
        this.f16873g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16874i = inputCheckPasswordSRP;
        this.f16875j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16869a) {
            case 0:
                this.f16870b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16876k, (TLRPC.TL_messages_addPollAnswer) this.f16877l, this.f16871c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16872f, (SendMessagesHelper.DelayedMessage) this.f16873g, this.h, (HashMap) this.f16874i, this.f16875j, tLObject, tL_error);
                return;
            case 1:
                this.f16870b.lambda$performSendMessageRequest$101((TLObject) this.f16876k, this.f16871c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16872f, (SendMessagesHelper.DelayedMessage) this.f16873g, this.h, (HashMap) this.f16874i, this.f16875j, (TLRPC.Message) this.f16877l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16875j;
                String str = this.d;
                MessageObject messageObject = this.f16871c;
                this.f16870b.lambda$sendCallback$46(str, (List) this.f16876k, this.f16872f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16877l, (zn) this.e, (TwoStepVerificationActivity) this.f16873g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16874i, z10, tLObject, tL_error);
                return;
        }
    }

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16870b = sendMessagesHelper;
        this.f16876k = tLObject;
        this.f16871c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16872f = z10;
        this.f16873g = delayedMessage2;
        this.h = obj;
        this.f16874i = hashMap;
        this.f16875j = z11;
        this.f16877l = message;
    }

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16870b = sendMessagesHelper;
        this.f16876k = tL_messages_addPollAnswer;
        this.f16877l = tL_messages_addPollAnswer2;
        this.f16871c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16872f = z10;
        this.f16873g = delayedMessage2;
        this.h = obj;
        this.f16874i = hashMap;
        this.f16875j = z11;
    }
}
