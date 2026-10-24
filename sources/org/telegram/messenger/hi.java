package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
public final class hi implements RequestDelegate {
    public final int f18608a = 0;
    public final SendMessagesHelper f18609b;
    public final MessageObject f18610c;
    public final String d;
    public final boolean e;
    public final boolean f18611f;
    public final Object f18612g;
    public final Object h;
    public final Object f18613i;
    public final Object f18614j;
    public final Object f18615k;
    public final Object f18616l;

    public hi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18609b = sendMessagesHelper;
        this.d = str;
        this.f18612g = list;
        this.e = z10;
        this.f18610c = messageObject;
        this.h = keyboardButtonProto;
        this.f18613i = snVar;
        this.f18614j = twoStepVerificationActivity;
        this.f18615k = tLObjectArr;
        this.f18616l = inputCheckPasswordSRP;
        this.f18611f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18608a) {
            case 0:
                List list = (List) this.f18612g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                sn snVar = (sn) this.f18613i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18614j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18615k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18616l;
                boolean z10 = this.f18611f;
                this.f18609b.lambda$sendCallback$49(this.d, list, this.e, this.f18610c, keyboardButtonProto, snVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18609b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18612g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18610c, this.d, (SendMessagesHelper.DelayedMessage) this.f18613i, this.e, (SendMessagesHelper.DelayedMessage) this.f18614j, this.f18615k, (HashMap) this.f18616l, this.f18611f, tLObject, tL_error);
                return;
            default:
                this.f18609b.lambda$performSendMessageRequest$104((TLObject) this.f18612g, this.f18610c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18613i, this.f18614j, (HashMap) this.f18615k, this.f18611f, (TLRPC.Message) this.f18616l, tLObject, tL_error);
                return;
        }
    }

    public hi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18609b = sendMessagesHelper;
        this.f18612g = tLObject;
        this.f18610c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18613i = delayedMessage2;
        this.f18614j = obj;
        this.f18615k = hashMap;
        this.f18611f = z11;
        this.f18616l = message;
    }

    public hi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18609b = sendMessagesHelper;
        this.f18612g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18610c = messageObject;
        this.d = str;
        this.f18613i = delayedMessage;
        this.e = z10;
        this.f18614j = delayedMessage2;
        this.f18615k = obj;
        this.f18616l = hashMap;
        this.f18611f = z11;
    }
}
