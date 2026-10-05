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
public final class ki implements RequestDelegate {
    public final int f18389a = 2;
    public final SendMessagesHelper f18390b;
    public final MessageObject f18391c;
    public final String d;
    public final Object f18392e;
    public final boolean f18393f;
    public final Object f18394g;
    public final Object h;
    public final Object f18395i;
    public final boolean f18396j;
    public final Object f18397k;
    public final Object f18398l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18390b = sendMessagesHelper;
        this.d = str;
        this.f18397k = list;
        this.f18393f = z10;
        this.f18391c = messageObject;
        this.f18398l = keyboardButtonProto;
        this.f18392e = ynVar;
        this.f18394g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f18395i = inputCheckPasswordSRP;
        this.f18396j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18389a) {
            case 0:
                this.f18390b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f18397k, (TLRPC.TL_messages_addPollAnswer) this.f18398l, this.f18391c, this.d, (SendMessagesHelper.DelayedMessage) this.f18392e, this.f18393f, (SendMessagesHelper.DelayedMessage) this.f18394g, this.h, (HashMap) this.f18395i, this.f18396j, tLObject, tL_error);
                return;
            case 1:
                this.f18390b.lambda$performSendMessageRequest$101((TLObject) this.f18397k, this.f18391c, this.d, (SendMessagesHelper.DelayedMessage) this.f18392e, this.f18393f, (SendMessagesHelper.DelayedMessage) this.f18394g, this.h, (HashMap) this.f18395i, this.f18396j, (TLRPC.Message) this.f18398l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f18396j;
                String str = this.d;
                MessageObject messageObject = this.f18391c;
                this.f18390b.lambda$sendCallback$46(str, (List) this.f18397k, this.f18393f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f18398l, (yn) this.f18392e, (TwoStepVerificationActivity) this.f18394g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f18395i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18390b = sendMessagesHelper;
        this.f18397k = tLObject;
        this.f18391c = messageObject;
        this.d = str;
        this.f18392e = delayedMessage;
        this.f18393f = z10;
        this.f18394g = delayedMessage2;
        this.h = obj;
        this.f18395i = hashMap;
        this.f18396j = z11;
        this.f18398l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18390b = sendMessagesHelper;
        this.f18397k = tL_messages_addPollAnswer;
        this.f18398l = tL_messages_addPollAnswer2;
        this.f18391c = messageObject;
        this.d = str;
        this.f18392e = delayedMessage;
        this.f18393f = z10;
        this.f18394g = delayedMessage2;
        this.h = obj;
        this.f18395i = hashMap;
        this.f18396j = z11;
    }
}
