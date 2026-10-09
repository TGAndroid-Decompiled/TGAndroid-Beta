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
public final class ji implements RequestDelegate {
    public final int f18273a = 0;
    public final SendMessagesHelper f18274b;
    public final MessageObject f18275c;
    public final String d;
    public final boolean f18276e;
    public final boolean f18277f;
    public final Object f18278g;
    public final Object h;
    public final Object f18279i;
    public final Object f18280j;
    public final Object f18281k;
    public final Object f18282l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18274b = sendMessagesHelper;
        this.d = str;
        this.f18278g = list;
        this.f18276e = z10;
        this.f18275c = messageObject;
        this.h = keyboardButtonProto;
        this.f18279i = znVar;
        this.f18280j = twoStepVerificationActivity;
        this.f18281k = tLObjectArr;
        this.f18282l = inputCheckPasswordSRP;
        this.f18277f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18273a) {
            case 0:
                List list = (List) this.f18278g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                zn znVar = (zn) this.f18279i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18280j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18281k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18282l;
                boolean z10 = this.f18277f;
                this.f18274b.lambda$sendCallback$49(this.d, list, this.f18276e, this.f18275c, keyboardButtonProto, znVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18274b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18278g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18275c, this.d, (SendMessagesHelper.DelayedMessage) this.f18279i, this.f18276e, (SendMessagesHelper.DelayedMessage) this.f18280j, this.f18281k, (HashMap) this.f18282l, this.f18277f, tLObject, tL_error);
                return;
            default:
                this.f18274b.lambda$performSendMessageRequest$104((TLObject) this.f18278g, this.f18275c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.f18276e, (SendMessagesHelper.DelayedMessage) this.f18279i, this.f18280j, (HashMap) this.f18281k, this.f18277f, (TLRPC.Message) this.f18282l, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18274b = sendMessagesHelper;
        this.f18278g = tLObject;
        this.f18275c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.f18276e = z10;
        this.f18279i = delayedMessage2;
        this.f18280j = obj;
        this.f18281k = hashMap;
        this.f18277f = z11;
        this.f18282l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18274b = sendMessagesHelper;
        this.f18278g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18275c = messageObject;
        this.d = str;
        this.f18279i = delayedMessage;
        this.f18276e = z10;
        this.f18280j = delayedMessage2;
        this.f18281k = obj;
        this.f18282l = hashMap;
        this.f18277f = z11;
    }
}
