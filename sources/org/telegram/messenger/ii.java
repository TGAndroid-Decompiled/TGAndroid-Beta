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
public final class ii implements RequestDelegate {
    public final int f18176a = 0;
    public final SendMessagesHelper f18177b;
    public final MessageObject f18178c;
    public final String d;
    public final boolean f18179e;
    public final boolean f18180f;
    public final Object f18181g;
    public final Object h;
    public final Object f18182i;
    public final Object f18183j;
    public final Object f18184k;
    public final Object f18185l;

    public ii(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18177b = sendMessagesHelper;
        this.d = str;
        this.f18181g = list;
        this.f18179e = z10;
        this.f18178c = messageObject;
        this.h = keyboardButtonProto;
        this.f18182i = znVar;
        this.f18183j = twoStepVerificationActivity;
        this.f18184k = tLObjectArr;
        this.f18185l = inputCheckPasswordSRP;
        this.f18180f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18176a) {
            case 0:
                List list = (List) this.f18181g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                zn znVar = (zn) this.f18182i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18183j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18184k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18185l;
                boolean z10 = this.f18180f;
                this.f18177b.lambda$sendCallback$49(this.d, list, this.f18179e, this.f18178c, keyboardButtonProto, znVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18177b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18181g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18178c, this.d, (SendMessagesHelper.DelayedMessage) this.f18182i, this.f18179e, (SendMessagesHelper.DelayedMessage) this.f18183j, this.f18184k, (HashMap) this.f18185l, this.f18180f, tLObject, tL_error);
                return;
            default:
                this.f18177b.lambda$performSendMessageRequest$104((TLObject) this.f18181g, this.f18178c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.f18179e, (SendMessagesHelper.DelayedMessage) this.f18182i, this.f18183j, (HashMap) this.f18184k, this.f18180f, (TLRPC.Message) this.f18185l, tLObject, tL_error);
                return;
        }
    }

    public ii(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18177b = sendMessagesHelper;
        this.f18181g = tLObject;
        this.f18178c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.f18179e = z10;
        this.f18182i = delayedMessage2;
        this.f18183j = obj;
        this.f18184k = hashMap;
        this.f18180f = z11;
        this.f18185l = message;
    }

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18177b = sendMessagesHelper;
        this.f18181g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18178c = messageObject;
        this.d = str;
        this.f18182i = delayedMessage;
        this.f18179e = z10;
        this.f18183j = delayedMessage2;
        this.f18184k = obj;
        this.f18185l = hashMap;
        this.f18180f = z11;
    }
}
