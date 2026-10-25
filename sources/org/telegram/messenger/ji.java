package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.un;
public final class ji implements RequestDelegate {
    public final int f20446a = 0;
    public final SendMessagesHelper f20447b;
    public final MessageObject f20448c;
    public final String d;
    public final boolean e;
    public final boolean f20449f;
    public final Object f20450g;
    public final Object h;
    public final Object f20451i;
    public final Object f20452j;
    public final Object f20453k;
    public final Object f20454l;

    public ji(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, un unVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f20447b = sendMessagesHelper;
        this.d = str;
        this.f20450g = list;
        this.e = z10;
        this.f20448c = messageObject;
        this.h = keyboardButtonProto;
        this.f20451i = unVar;
        this.f20452j = twoStepVerificationActivity;
        this.f20453k = tLObjectArr;
        this.f20454l = inputCheckPasswordSRP;
        this.f20449f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20446a) {
            case 0:
                List list = (List) this.f20450g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                un unVar = (un) this.f20451i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f20452j;
                TLObject[] tLObjectArr = (TLObject[]) this.f20453k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f20454l;
                boolean z10 = this.f20449f;
                this.f20447b.lambda$sendCallback$49(this.d, list, this.e, this.f20448c, keyboardButtonProto, unVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f20447b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f20450g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f20448c, this.d, (SendMessagesHelper.DelayedMessage) this.f20451i, this.e, (SendMessagesHelper.DelayedMessage) this.f20452j, this.f20453k, (HashMap) this.f20454l, this.f20449f, tLObject, tL_error);
                return;
            default:
                this.f20447b.lambda$performSendMessageRequest$104((TLObject) this.f20450g, this.f20448c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.e, (SendMessagesHelper.DelayedMessage) this.f20451i, this.f20452j, (HashMap) this.f20453k, this.f20449f, (TLRPC.Message) this.f20454l, tLObject, tL_error);
                return;
        }
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f20447b = sendMessagesHelper;
        this.f20450g = tLObject;
        this.f20448c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.e = z10;
        this.f20451i = delayedMessage2;
        this.f20452j = obj;
        this.f20453k = hashMap;
        this.f20449f = z11;
        this.f20454l = message;
    }

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f20447b = sendMessagesHelper;
        this.f20450g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f20448c = messageObject;
        this.d = str;
        this.f20451i = delayedMessage;
        this.e = z10;
        this.f20452j = delayedMessage2;
        this.f20453k = obj;
        this.f20454l = hashMap;
        this.f20449f = z11;
    }
}
