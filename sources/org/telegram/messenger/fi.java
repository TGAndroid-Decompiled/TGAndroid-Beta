package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.rn;

public final class fi implements RequestDelegate {

    public final int f20282a = 2;

    public final SendMessagesHelper f20283b;

    public final MessageObject f20284c;
    public final String d;

    public final Object f20285e;

    public final boolean f20286f;

    public final Object f20287g;
    public final Object h;

    public final Object f20288i;

    public final boolean f20289j;

    public final Object f20290k;

    public final Object f20291l;

    public fi(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, rn rnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f20283b = sendMessagesHelper;
        this.d = str;
        this.f20290k = list;
        this.f20286f = z10;
        this.f20284c = messageObject;
        this.f20291l = keyboardButtonProto;
        this.f20285e = rnVar;
        this.f20287g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f20288i = inputCheckPasswordSRP;
        this.f20289j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20282a) {
            case 0:
                this.f20283b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f20290k, (TLRPC.TL_messages_addPollAnswer) this.f20291l, this.f20284c, this.d, (SendMessagesHelper.DelayedMessage) this.f20285e, this.f20286f, (SendMessagesHelper.DelayedMessage) this.f20287g, this.h, (HashMap) this.f20288i, this.f20289j, tLObject, tL_error);
                break;
            case 1:
                this.f20283b.lambda$performSendMessageRequest$101((TLObject) this.f20290k, this.f20284c, this.d, (SendMessagesHelper.DelayedMessage) this.f20285e, this.f20286f, (SendMessagesHelper.DelayedMessage) this.f20287g, this.h, (HashMap) this.f20288i, this.f20289j, (TLRPC.Message) this.f20291l, tLObject, tL_error);
                break;
            default:
                List list = (List) this.f20290k;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f20291l;
                rn rnVar = (rn) this.f20285e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f20287g;
                TLObject[] tLObjectArr = (TLObject[]) this.h;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f20288i;
                boolean z10 = this.f20289j;
                this.f20283b.lambda$sendCallback$46(this.d, list, this.f20286f, this.f20284c, keyboardButtonProto, rnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                break;
        }
    }

    public fi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z11, TLRPC.Message message) {
        this.f20283b = sendMessagesHelper;
        this.f20290k = tLObject;
        this.f20284c = messageObject;
        this.d = str;
        this.f20285e = delayedMessage;
        this.f20286f = z10;
        this.f20287g = delayedMessage2;
        this.h = obj;
        this.f20288i = map;
        this.f20289j = z11;
        this.f20291l = message;
    }

    public fi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z11) {
        this.f20283b = sendMessagesHelper;
        this.f20290k = tL_messages_addPollAnswer;
        this.f20291l = tL_messages_addPollAnswer2;
        this.f20284c = messageObject;
        this.d = str;
        this.f20285e = delayedMessage;
        this.f20286f = z10;
        this.f20287g = delayedMessage2;
        this.h = obj;
        this.f20288i = map;
        this.f20289j = z11;
    }
}
