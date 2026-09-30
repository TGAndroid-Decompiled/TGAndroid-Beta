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
    public final int f16755a = 2;
    public final SendMessagesHelper f16756b;
    public final MessageObject f16757c;
    public final String d;
    public final Object e;
    public final boolean f16758f;
    public final Object f16759g;
    public final Object h;
    public final Object f16760i;
    public final boolean f16761j;
    public final Object f16762k;
    public final Object f16763l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16756b = sendMessagesHelper;
        this.d = str;
        this.f16762k = list;
        this.f16758f = z10;
        this.f16757c = messageObject;
        this.f16763l = keyboardButtonProto;
        this.e = wnVar;
        this.f16759g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16760i = inputCheckPasswordSRP;
        this.f16761j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16755a) {
            case 0:
                this.f16756b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16762k, (TLRPC.TL_messages_addPollAnswer) this.f16763l, this.f16757c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16758f, (SendMessagesHelper.DelayedMessage) this.f16759g, this.h, (HashMap) this.f16760i, this.f16761j, tLObject, tL_error);
                return;
            case 1:
                this.f16756b.lambda$performSendMessageRequest$101((TLObject) this.f16762k, this.f16757c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16758f, (SendMessagesHelper.DelayedMessage) this.f16759g, this.h, (HashMap) this.f16760i, this.f16761j, (TLRPC.Message) this.f16763l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16761j;
                String str = this.d;
                MessageObject messageObject = this.f16757c;
                this.f16756b.lambda$sendCallback$46(str, (List) this.f16762k, this.f16758f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16763l, (wn) this.e, (TwoStepVerificationActivity) this.f16759g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16760i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16756b = sendMessagesHelper;
        this.f16762k = tLObject;
        this.f16757c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16758f = z10;
        this.f16759g = delayedMessage2;
        this.h = obj;
        this.f16760i = hashMap;
        this.f16761j = z11;
        this.f16763l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16756b = sendMessagesHelper;
        this.f16762k = tL_messages_addPollAnswer;
        this.f16763l = tL_messages_addPollAnswer2;
        this.f16757c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16758f = z10;
        this.f16759g = delayedMessage2;
        this.h = obj;
        this.f16760i = hashMap;
        this.f16761j = z11;
    }
}
