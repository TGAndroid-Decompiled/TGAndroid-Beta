package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.xn;
public final class ji implements RequestDelegate {
    public final int f16748a = 2;
    public final SendMessagesHelper f16749b;
    public final MessageObject f16750c;
    public final String d;
    public final Object e;
    public final boolean f16751f;
    public final Object f16752g;
    public final Object h;
    public final Object f16753i;
    public final boolean f16754j;
    public final Object f16755k;
    public final Object f16756l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16749b = sendMessagesHelper;
        this.d = str;
        this.f16755k = list;
        this.f16751f = z10;
        this.f16750c = messageObject;
        this.f16756l = keyboardButtonProto;
        this.e = xnVar;
        this.f16752g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16753i = inputCheckPasswordSRP;
        this.f16754j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16748a) {
            case 0:
                this.f16749b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16755k, (TLRPC.TL_messages_addPollAnswer) this.f16756l, this.f16750c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16751f, (SendMessagesHelper.DelayedMessage) this.f16752g, this.h, (HashMap) this.f16753i, this.f16754j, tLObject, tL_error);
                return;
            case 1:
                this.f16749b.lambda$performSendMessageRequest$101((TLObject) this.f16755k, this.f16750c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16751f, (SendMessagesHelper.DelayedMessage) this.f16752g, this.h, (HashMap) this.f16753i, this.f16754j, (TLRPC.Message) this.f16756l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16754j;
                String str = this.d;
                MessageObject messageObject = this.f16750c;
                this.f16749b.lambda$sendCallback$46(str, (List) this.f16755k, this.f16751f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16756l, (xn) this.e, (TwoStepVerificationActivity) this.f16752g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16753i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16749b = sendMessagesHelper;
        this.f16755k = tLObject;
        this.f16750c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16751f = z10;
        this.f16752g = delayedMessage2;
        this.h = obj;
        this.f16753i = hashMap;
        this.f16754j = z11;
        this.f16756l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16749b = sendMessagesHelper;
        this.f16755k = tL_messages_addPollAnswer;
        this.f16756l = tL_messages_addPollAnswer2;
        this.f16750c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16751f = z10;
        this.f16752g = delayedMessage2;
        this.h = obj;
        this.f16753i = hashMap;
        this.f16754j = z11;
    }
}
