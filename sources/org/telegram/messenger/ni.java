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
public final class ni implements RequestDelegate {
    public final int f19485a = 2;
    public final SendMessagesHelper f19486b;
    public final MessageObject f19487c;
    public final String d;
    public final Object f19488e;
    public final boolean f19489f;
    public final Object f19490g;
    public final Object h;
    public final Object f19491i;
    public final boolean f19492j;
    public final Object f19493k;
    public final Object f19494l;

    public ni(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z10) {
        this.f19486b = sendMessagesHelper;
        this.d = str;
        this.f19493k = list;
        this.f19489f = z4;
        this.f19487c = messageObject;
        this.f19494l = keyboardButtonProto;
        this.f19488e = xnVar;
        this.f19490g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f19491i = inputCheckPasswordSRP;
        this.f19492j = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19485a) {
            case 0:
                this.f19486b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f19493k, (TLRPC.TL_messages_addPollAnswer) this.f19494l, this.f19487c, this.d, (SendMessagesHelper.DelayedMessage) this.f19488e, this.f19489f, (SendMessagesHelper.DelayedMessage) this.f19490g, this.h, (HashMap) this.f19491i, this.f19492j, tLObject, tL_error);
                return;
            case 1:
                this.f19486b.lambda$performSendMessageRequest$101((TLObject) this.f19493k, this.f19487c, this.d, (SendMessagesHelper.DelayedMessage) this.f19488e, this.f19489f, (SendMessagesHelper.DelayedMessage) this.f19490g, this.h, (HashMap) this.f19491i, this.f19492j, (TLRPC.Message) this.f19494l, tLObject, tL_error);
                return;
            default:
                boolean z4 = this.f19492j;
                String str = this.d;
                MessageObject messageObject = this.f19487c;
                this.f19486b.lambda$sendCallback$46(str, (List) this.f19493k, this.f19489f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f19494l, (xn) this.f19488e, (TwoStepVerificationActivity) this.f19490g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f19491i, z4, tLObject, tL_error);
                return;
        }
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, TLRPC.Message message) {
        this.f19486b = sendMessagesHelper;
        this.f19493k = tLObject;
        this.f19487c = messageObject;
        this.d = str;
        this.f19488e = delayedMessage;
        this.f19489f = z4;
        this.f19490g = delayedMessage2;
        this.h = obj;
        this.f19491i = hashMap;
        this.f19492j = z10;
        this.f19494l = message;
    }

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10) {
        this.f19486b = sendMessagesHelper;
        this.f19493k = tL_messages_addPollAnswer;
        this.f19494l = tL_messages_addPollAnswer2;
        this.f19487c = messageObject;
        this.d = str;
        this.f19488e = delayedMessage;
        this.f19489f = z4;
        this.f19490g = delayedMessage2;
        this.h = obj;
        this.f19491i = hashMap;
        this.f19492j = z10;
    }
}
