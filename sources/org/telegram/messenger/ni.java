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
public final class ni implements RequestDelegate {
    public final int f17928a = 2;
    public final SendMessagesHelper f17929b;
    public final MessageObject f17930c;
    public final String d;
    public final Object e;
    public final boolean f17931f;
    public final Object f17932g;
    public final Object h;
    public final Object f17933i;
    public final boolean f17934j;
    public final Object f17935k;
    public final Object f17936l;

    public ni(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z10) {
        this.f17929b = sendMessagesHelper;
        this.d = str;
        this.f17935k = list;
        this.f17931f = z4;
        this.f17930c = messageObject;
        this.f17936l = keyboardButtonProto;
        this.e = znVar;
        this.f17932g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f17933i = inputCheckPasswordSRP;
        this.f17934j = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17928a) {
            case 0:
                this.f17929b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f17935k, (TLRPC.TL_messages_addPollAnswer) this.f17936l, this.f17930c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f17931f, (SendMessagesHelper.DelayedMessage) this.f17932g, this.h, (HashMap) this.f17933i, this.f17934j, tLObject, tL_error);
                return;
            case 1:
                this.f17929b.lambda$performSendMessageRequest$101((TLObject) this.f17935k, this.f17930c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f17931f, (SendMessagesHelper.DelayedMessage) this.f17932g, this.h, (HashMap) this.f17933i, this.f17934j, (TLRPC.Message) this.f17936l, tLObject, tL_error);
                return;
            default:
                boolean z4 = this.f17934j;
                String str = this.d;
                MessageObject messageObject = this.f17930c;
                this.f17929b.lambda$sendCallback$46(str, (List) this.f17935k, this.f17931f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f17936l, (zn) this.e, (TwoStepVerificationActivity) this.f17932g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f17933i, z4, tLObject, tL_error);
                return;
        }
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, TLRPC.Message message) {
        this.f17929b = sendMessagesHelper;
        this.f17935k = tLObject;
        this.f17930c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17931f = z4;
        this.f17932g = delayedMessage2;
        this.h = obj;
        this.f17933i = hashMap;
        this.f17934j = z10;
        this.f17936l = message;
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f17929b = sendMessagesHelper;
        this.f17935k = tL_messages_addPollAnswer;
        this.f17936l = tL_messages_addPollAnswer2;
        this.f17930c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f17931f = z4;
        this.f17932g = delayedMessage2;
        this.h = obj;
        this.f17933i = hashMap;
        this.f17934j = z10;
    }
}
