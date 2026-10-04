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
public final class ji implements RequestDelegate {
    public final int f18281a = 2;
    public final SendMessagesHelper f18282b;
    public final MessageObject f18283c;
    public final String d;
    public final Object f18284e;
    public final boolean f18285f;
    public final Object f18286g;
    public final Object h;
    public final Object f18287i;
    public final boolean f18288j;
    public final Object f18289k;
    public final Object f18290l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18282b = sendMessagesHelper;
        this.d = str;
        this.f18289k = list;
        this.f18285f = z10;
        this.f18283c = messageObject;
        this.f18290l = keyboardButtonProto;
        this.f18284e = ynVar;
        this.f18286g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18287i = inputCheckPasswordSRP;
        this.f18288j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18281a) {
            case 0:
                this.f18282b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18289k, (TLRPC.TL_messages_addPollAnswer) this.f18290l, this.f18283c, this.d, (SendMessagesHelper.DelayedMessage) this.f18284e, this.f18285f, (SendMessagesHelper.DelayedMessage) this.f18286g, this.h, (HashMap) this.f18287i, this.f18288j, tLObject, tL_error);
                return;
            case 1:
                this.f18282b.lambda$performSendMessageRequest$101((TLObject) this.f18289k, this.f18283c, this.d, (SendMessagesHelper.DelayedMessage) this.f18284e, this.f18285f, (SendMessagesHelper.DelayedMessage) this.f18286g, this.h, (HashMap) this.f18287i, this.f18288j, (TLRPC.Message) this.f18290l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18288j;
                String str = this.d;
                MessageObject messageObject = this.f18283c;
                this.f18282b.lambda$sendCallback$46(str, (List) this.f18289k, this.f18285f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18290l, (yn) this.f18284e, (TwoStepVerificationActivity) this.f18286g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18287i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18282b = sendMessagesHelper;
        this.f18289k = tLObject;
        this.f18283c = messageObject;
        this.d = str;
        this.f18284e = delayedMessage;
        this.f18285f = z10;
        this.f18286g = delayedMessage2;
        this.h = obj;
        this.f18287i = hashMap;
        this.f18288j = z11;
        this.f18290l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18282b = sendMessagesHelper;
        this.f18289k = tL_messages_addPollAnswer;
        this.f18290l = tL_messages_addPollAnswer2;
        this.f18283c = messageObject;
        this.d = str;
        this.f18284e = delayedMessage;
        this.f18285f = z10;
        this.f18286g = delayedMessage2;
        this.h = obj;
        this.f18287i = hashMap;
        this.f18288j = z11;
    }
}
