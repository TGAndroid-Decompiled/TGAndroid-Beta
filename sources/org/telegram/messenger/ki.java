package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
public final class ki implements RequestDelegate {
    public final int f16602a = 2;
    public final SendMessagesHelper f16603b;
    public final MessageObject f16604c;
    public final String d;
    public final Object e;
    public final boolean f16605f;
    public final Object f16606g;
    public final Object h;
    public final Object f16607i;
    public final boolean f16608j;
    public final Object f16609k;
    public final Object f16610l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16603b = sendMessagesHelper;
        this.d = str;
        this.f16609k = list;
        this.f16605f = z10;
        this.f16604c = messageObject;
        this.f16610l = keyboardButtonProto;
        this.e = boVar;
        this.f16606g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16607i = inputCheckPasswordSRP;
        this.f16608j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16602a) {
            case 0:
                this.f16603b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16609k, (TLRPC.TL_messages_addPollAnswer) this.f16610l, this.f16604c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16605f, (SendMessagesHelper.DelayedMessage) this.f16606g, this.h, (HashMap) this.f16607i, this.f16608j, tLObject, tL_error);
                return;
            case 1:
                this.f16603b.lambda$performSendMessageRequest$101((TLObject) this.f16609k, this.f16604c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16605f, (SendMessagesHelper.DelayedMessage) this.f16606g, this.h, (HashMap) this.f16607i, this.f16608j, (TLRPC.Message) this.f16610l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16608j;
                String str = this.d;
                MessageObject messageObject = this.f16604c;
                this.f16603b.lambda$sendCallback$46(str, (List) this.f16609k, this.f16605f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16610l, (bo) this.e, (TwoStepVerificationActivity) this.f16606g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16607i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16603b = sendMessagesHelper;
        this.f16609k = tLObject;
        this.f16604c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16605f = z10;
        this.f16606g = delayedMessage2;
        this.h = obj;
        this.f16607i = hashMap;
        this.f16608j = z11;
        this.f16610l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16603b = sendMessagesHelper;
        this.f16609k = tL_messages_addPollAnswer;
        this.f16610l = tL_messages_addPollAnswer2;
        this.f16604c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16605f = z10;
        this.f16606g = delayedMessage2;
        this.h = obj;
        this.f16607i = hashMap;
        this.f16608j = z11;
    }
}
