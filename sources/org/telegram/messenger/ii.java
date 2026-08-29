package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.tn;
public final class ii implements RequestDelegate {
    public final int f20579a = 2;
    public final SendMessagesHelper f20580b;
    public final MessageObject f20581c;
    public final String d;
    public final Object f20582e;
    public final boolean f20583f;
    public final Object f20584g;
    public final Object h;
    public final Object f20585i;
    public final boolean f20586j;
    public final Object f20587k;
    public final Object f20588l;

    public ii(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f20580b = sendMessagesHelper;
        this.d = str;
        this.f20587k = list;
        this.f20583f = z10;
        this.f20581c = messageObject;
        this.f20588l = keyboardButtonProto;
        this.f20582e = tnVar;
        this.f20584g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f20585i = inputCheckPasswordSRP;
        this.f20586j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20579a) {
            case 0:
                this.f20580b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f20587k, (TLRPC.TL_messages_addPollAnswer) this.f20588l, this.f20581c, this.d, (SendMessagesHelper.DelayedMessage) this.f20582e, this.f20583f, (SendMessagesHelper.DelayedMessage) this.f20584g, this.h, (HashMap) this.f20585i, this.f20586j, tLObject, tL_error);
                return;
            case 1:
                this.f20580b.lambda$performSendMessageRequest$101((TLObject) this.f20587k, this.f20581c, this.d, (SendMessagesHelper.DelayedMessage) this.f20582e, this.f20583f, (SendMessagesHelper.DelayedMessage) this.f20584g, this.h, (HashMap) this.f20585i, this.f20586j, (TLRPC.Message) this.f20588l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f20586j;
                String str = this.d;
                MessageObject messageObject = this.f20581c;
                this.f20580b.lambda$sendCallback$46(str, (List) this.f20587k, this.f20583f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f20588l, (tn) this.f20582e, (TwoStepVerificationActivity) this.f20584g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f20585i, z10, tLObject, tL_error);
                return;
        }
    }

    public ii(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f20580b = sendMessagesHelper;
        this.f20587k = tLObject;
        this.f20581c = messageObject;
        this.d = str;
        this.f20582e = delayedMessage;
        this.f20583f = z10;
        this.f20584g = delayedMessage2;
        this.h = obj;
        this.f20585i = hashMap;
        this.f20586j = z11;
        this.f20588l = message;
    }

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f20580b = sendMessagesHelper;
        this.f20587k = tL_messages_addPollAnswer;
        this.f20588l = tL_messages_addPollAnswer2;
        this.f20581c = messageObject;
        this.d = str;
        this.f20582e = delayedMessage;
        this.f20583f = z10;
        this.f20584g = delayedMessage2;
        this.h = obj;
        this.f20585i = hashMap;
        this.f20586j = z11;
    }
}
