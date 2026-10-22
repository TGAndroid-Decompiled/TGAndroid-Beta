package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.qn;
public final class hi implements RequestDelegate {
    public final int f18543a = 0;
    public final SendMessagesHelper f18544b;
    public final MessageObject f18545c;
    public final String d;
    public final boolean e;
    public final boolean f18546f;
    public final Object f18547g;
    public final Object h;
    public final Object f18548i;
    public final Object f18549j;
    public final Object f18550k;
    public final Object f18551l;

    public hi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18544b = sendMessagesHelper;
        this.d = str;
        this.f18547g = list;
        this.e = z10;
        this.f18545c = messageObject;
        this.h = keyboardButtonProto;
        this.f18548i = qnVar;
        this.f18549j = twoStepVerificationActivity;
        this.f18550k = tLObjectArr;
        this.f18551l = inputCheckPasswordSRP;
        this.f18546f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18543a) {
            case 0:
                List list = (List) this.f18547g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                qn qnVar = (qn) this.f18548i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18549j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18550k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18551l;
                boolean z10 = this.f18546f;
                this.f18544b.lambda$sendCallback$49(this.d, list, this.e, this.f18545c, keyboardButtonProto, qnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18544b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18547g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18545c, this.d, (SendMessagesHelper.DelayedMessage) this.f18548i, this.e, (SendMessagesHelper.DelayedMessage) this.f18549j, this.f18550k, (HashMap) this.f18551l, this.f18546f, tLObject, tL_error);
                return;
            default:
                this.f18544b.lambda$performSendMessageRequest$104((TLObject) this.f18547g, this.f18545c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18548i, this.f18549j, (HashMap) this.f18550k, this.f18546f, (TLRPC.Message) this.f18551l, tLObject, tL_error);
                return;
        }
    }

    public hi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18544b = sendMessagesHelper;
        this.f18547g = tLObject;
        this.f18545c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18548i = delayedMessage2;
        this.f18549j = obj;
        this.f18550k = hashMap;
        this.f18546f = z11;
        this.f18551l = message;
    }

    public hi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18544b = sendMessagesHelper;
        this.f18547g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18545c = messageObject;
        this.d = str;
        this.f18548i = delayedMessage;
        this.e = z10;
        this.f18549j = delayedMessage2;
        this.f18550k = obj;
        this.f18551l = hashMap;
        this.f18546f = z11;
    }
}
