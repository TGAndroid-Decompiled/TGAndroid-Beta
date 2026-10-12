package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
public final class li implements RequestDelegate {
    public final int f17800a = 0;
    public final SendMessagesHelper f17801b;
    public final MessageObject f17802c;
    public final String d;
    public final boolean e;
    public final boolean f17803f;
    public final Object f17804g;
    public final Object h;
    public final Object f17805i;
    public final Object f17806j;
    public final Object f17807k;
    public final Object f17808l;

    public li(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, fo foVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f17801b = sendMessagesHelper;
        this.d = str;
        this.f17804g = list;
        this.e = z10;
        this.f17802c = messageObject;
        this.h = keyboardButtonProto;
        this.f17805i = foVar;
        this.f17806j = twoStepVerificationActivity;
        this.f17807k = tLObjectArr;
        this.f17808l = inputCheckPasswordSRP;
        this.f17803f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17800a) {
            case 0:
                List list = (List) this.f17804g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                fo foVar = (fo) this.f17805i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f17806j;
                TLObject[] tLObjectArr = (TLObject[]) this.f17807k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f17808l;
                boolean z10 = this.f17803f;
                this.f17801b.lambda$sendCallback$49(this.d, list, this.e, this.f17802c, keyboardButtonProto, foVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f17801b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f17804g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f17802c, this.d, (SendMessagesHelper.DelayedMessage) this.f17805i, this.e, (SendMessagesHelper.DelayedMessage) this.f17806j, this.f17807k, (HashMap) this.f17808l, this.f17803f, tLObject, tL_error);
                return;
            default:
                this.f17801b.lambda$performSendMessageRequest$104((TLObject) this.f17804g, this.f17802c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f17805i, this.f17806j, (HashMap) this.f17807k, this.f17803f, (TLRPC.Message) this.f17808l, tLObject, tL_error);
                return;
        }
    }

    public li(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f17801b = sendMessagesHelper;
        this.f17804g = tLObject;
        this.f17802c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f17805i = delayedMessage2;
        this.f17806j = obj;
        this.f17807k = hashMap;
        this.f17803f = z11;
        this.f17808l = message;
    }

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f17801b = sendMessagesHelper;
        this.f17804g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f17802c = messageObject;
        this.d = str;
        this.f17805i = delayedMessage;
        this.e = z10;
        this.f17806j = delayedMessage2;
        this.f17807k = obj;
        this.f17808l = hashMap;
        this.f17803f = z11;
    }
}
