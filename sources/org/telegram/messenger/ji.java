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
    public final int f18282a = 2;
    public final SendMessagesHelper f18283b;
    public final MessageObject f18284c;
    public final String d;
    public final Object f18285e;
    public final boolean f18286f;
    public final Object f18287g;
    public final Object h;
    public final Object f18288i;
    public final boolean f18289j;
    public final Object f18290k;
    public final Object f18291l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18283b = sendMessagesHelper;
        this.d = str;
        this.f18290k = list;
        this.f18286f = z10;
        this.f18284c = messageObject;
        this.f18291l = keyboardButtonProto;
        this.f18285e = ynVar;
        this.f18287g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18288i = inputCheckPasswordSRP;
        this.f18289j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18282a) {
            case 0:
                this.f18283b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18290k, (TLRPC.TL_messages_addPollAnswer) this.f18291l, this.f18284c, this.d, (SendMessagesHelper.DelayedMessage) this.f18285e, this.f18286f, (SendMessagesHelper.DelayedMessage) this.f18287g, this.h, (HashMap) this.f18288i, this.f18289j, tLObject, tL_error);
                return;
            case 1:
                this.f18283b.lambda$performSendMessageRequest$101((TLObject) this.f18290k, this.f18284c, this.d, (SendMessagesHelper.DelayedMessage) this.f18285e, this.f18286f, (SendMessagesHelper.DelayedMessage) this.f18287g, this.h, (HashMap) this.f18288i, this.f18289j, (TLRPC.Message) this.f18291l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18289j;
                String str = this.d;
                MessageObject messageObject = this.f18284c;
                this.f18283b.lambda$sendCallback$46(str, (List) this.f18290k, this.f18286f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18291l, (yn) this.f18285e, (TwoStepVerificationActivity) this.f18287g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18288i, z10, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18283b = sendMessagesHelper;
        this.f18290k = tLObject;
        this.f18284c = messageObject;
        this.d = str;
        this.f18285e = delayedMessage;
        this.f18286f = z10;
        this.f18287g = delayedMessage2;
        this.h = obj;
        this.f18288i = hashMap;
        this.f18289j = z11;
        this.f18291l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18283b = sendMessagesHelper;
        this.f18290k = tL_messages_addPollAnswer;
        this.f18291l = tL_messages_addPollAnswer2;
        this.f18284c = messageObject;
        this.d = str;
        this.f18285e = delayedMessage;
        this.f18286f = z10;
        this.f18287g = delayedMessage2;
        this.h = obj;
        this.f18288i = hashMap;
        this.f18289j = z11;
    }
}
