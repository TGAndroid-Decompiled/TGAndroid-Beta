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
public final class ki implements RequestDelegate {
    public final int f20529a = 0;
    public final SendMessagesHelper f20530b;
    public final MessageObject f20531c;
    public final String d;
    public final boolean e;
    public final boolean f20532f;
    public final Object f20533g;
    public final Object h;
    public final Object f20534i;
    public final Object f20535j;
    public final Object f20536k;
    public final Object f20537l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f20530b = sendMessagesHelper;
        this.d = str;
        this.f20533g = list;
        this.e = z10;
        this.f20531c = messageObject;
        this.h = keyboardButtonProto;
        this.f20534i = wnVar;
        this.f20535j = twoStepVerificationActivity;
        this.f20536k = tLObjectArr;
        this.f20537l = inputCheckPasswordSRP;
        this.f20532f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20529a) {
            case 0:
                List list = (List) this.f20533g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                wn wnVar = (wn) this.f20534i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f20535j;
                TLObject[] tLObjectArr = (TLObject[]) this.f20536k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f20537l;
                boolean z10 = this.f20532f;
                this.f20530b.lambda$sendCallback$49(this.d, list, this.e, this.f20531c, keyboardButtonProto, wnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f20530b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f20533g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f20531c, this.d, (SendMessagesHelper.DelayedMessage) this.f20534i, this.e, (SendMessagesHelper.DelayedMessage) this.f20535j, this.f20536k, (HashMap) this.f20537l, this.f20532f, tLObject, tL_error);
                return;
            default:
                this.f20530b.lambda$performSendMessageRequest$104((TLObject) this.f20533g, this.f20531c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f20534i, this.f20535j, (HashMap) this.f20536k, this.f20532f, (TLRPC.Message) this.f20537l, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f20530b = sendMessagesHelper;
        this.f20533g = tLObject;
        this.f20531c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f20534i = delayedMessage2;
        this.f20535j = obj;
        this.f20536k = hashMap;
        this.f20532f = z11;
        this.f20537l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f20530b = sendMessagesHelper;
        this.f20533g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f20531c = messageObject;
        this.d = str;
        this.f20534i = delayedMessage;
        this.e = z10;
        this.f20535j = delayedMessage2;
        this.f20536k = obj;
        this.f20537l = hashMap;
        this.f20532f = z11;
    }
}
