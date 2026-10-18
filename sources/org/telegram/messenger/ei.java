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
public final class ei implements RequestDelegate {
    public final int f18281a = 0;
    public final SendMessagesHelper f18282b;
    public final MessageObject f18283c;
    public final String d;
    public final boolean e;
    public final boolean f18284f;
    public final Object f18285g;
    public final Object h;
    public final Object f18286i;
    public final Object f18287j;
    public final Object f18288k;
    public final Object f18289l;

    public ei(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18282b = sendMessagesHelper;
        this.d = str;
        this.f18285g = list;
        this.e = z10;
        this.f18283c = messageObject;
        this.h = keyboardButtonProto;
        this.f18286i = snVar;
        this.f18287j = twoStepVerificationActivity;
        this.f18288k = tLObjectArr;
        this.f18289l = inputCheckPasswordSRP;
        this.f18284f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18281a) {
            case 0:
                List list = (List) this.f18285g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                sn snVar = (sn) this.f18286i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18287j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18288k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18289l;
                boolean z10 = this.f18284f;
                this.f18282b.lambda$sendCallback$49(this.d, list, this.e, this.f18283c, keyboardButtonProto, snVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18282b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18285g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18283c, this.d, (SendMessagesHelper.DelayedMessage) this.f18286i, this.e, (SendMessagesHelper.DelayedMessage) this.f18287j, this.f18288k, (HashMap) this.f18289l, this.f18284f, tLObject, tL_error);
                return;
            default:
                this.f18282b.lambda$performSendMessageRequest$104((TLObject) this.f18285g, this.f18283c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f18286i, this.f18287j, (HashMap) this.f18288k, this.f18284f, (TLRPC.Message) this.f18289l, tLObject, tL_error);
                return;
        }
    }

    public ei(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18282b = sendMessagesHelper;
        this.f18285g = tLObject;
        this.f18283c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f18286i = delayedMessage2;
        this.f18287j = obj;
        this.f18288k = hashMap;
        this.f18284f = z11;
        this.f18289l = message;
    }

    public ei(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18282b = sendMessagesHelper;
        this.f18285g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18283c = messageObject;
        this.d = str;
        this.f18286i = delayedMessage;
        this.e = z10;
        this.f18287j = delayedMessage2;
        this.f18288k = obj;
        this.f18289l = hashMap;
        this.f18284f = z11;
    }
}
