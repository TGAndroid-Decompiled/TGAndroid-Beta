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
    public final int f16771a = 2;
    public final SendMessagesHelper f16772b;
    public final MessageObject f16773c;
    public final String d;
    public final Object e;
    public final boolean f16774f;
    public final Object f16775g;
    public final Object h;
    public final Object f16776i;
    public final boolean f16777j;
    public final Object f16778k;
    public final Object f16779l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16772b = sendMessagesHelper;
        this.d = str;
        this.f16778k = list;
        this.f16774f = z10;
        this.f16773c = messageObject;
        this.f16779l = keyboardButtonProto;
        this.e = wnVar;
        this.f16775g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16776i = inputCheckPasswordSRP;
        this.f16777j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16771a) {
            case 0:
                this.f16772b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16778k, (TLRPC.TL_messages_addPollAnswer) this.f16779l, this.f16773c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16774f, (SendMessagesHelper.DelayedMessage) this.f16775g, this.h, (HashMap) this.f16776i, this.f16777j, tLObject, tL_error);
                return;
            case 1:
                this.f16772b.lambda$performSendMessageRequest$101((TLObject) this.f16778k, this.f16773c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16774f, (SendMessagesHelper.DelayedMessage) this.f16775g, this.h, (HashMap) this.f16776i, this.f16777j, (TLRPC.Message) this.f16779l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16777j;
                String str = this.d;
                MessageObject messageObject = this.f16773c;
                this.f16772b.lambda$sendCallback$46(str, (List) this.f16778k, this.f16774f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16779l, (wn) this.e, (TwoStepVerificationActivity) this.f16775g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16776i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16772b = sendMessagesHelper;
        this.f16778k = tLObject;
        this.f16773c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16774f = z10;
        this.f16775g = delayedMessage2;
        this.h = obj;
        this.f16776i = hashMap;
        this.f16777j = z11;
        this.f16779l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16772b = sendMessagesHelper;
        this.f16778k = tL_messages_addPollAnswer;
        this.f16779l = tL_messages_addPollAnswer2;
        this.f16773c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16774f = z10;
        this.f16775g = delayedMessage2;
        this.h = obj;
        this.f16776i = hashMap;
        this.f16777j = z11;
    }
}
