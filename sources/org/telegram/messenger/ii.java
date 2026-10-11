package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.zn;
public final class ii implements RequestDelegate {
    public final int f18212a = 0;
    public final SendMessagesHelper f18213b;
    public final MessageObject f18214c;
    public final String d;
    public final boolean f18215e;
    public final boolean f18216f;
    public final Object f18217g;
    public final Object h;
    public final Object f18218i;
    public final Object f18219j;
    public final Object f18220k;
    public final Object f18221l;

    public ii(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f18213b = sendMessagesHelper;
        this.d = str;
        this.f18217g = list;
        this.f18215e = z10;
        this.f18214c = messageObject;
        this.h = keyboardButtonProto;
        this.f18218i = znVar;
        this.f18219j = twoStepVerificationActivity;
        this.f18220k = tLObjectArr;
        this.f18221l = inputCheckPasswordSRP;
        this.f18216f = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18212a) {
            case 0:
                List list = (List) this.f18217g;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.h;
                zn znVar = (zn) this.f18218i;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f18219j;
                TLObject[] tLObjectArr = (TLObject[]) this.f18220k;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f18221l;
                boolean z10 = this.f18216f;
                this.f18213b.lambda$sendCallback$49(this.d, list, this.f18215e, this.f18214c, keyboardButtonProto, znVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10, tLObject, tL_error);
                return;
            case 1:
                this.f18213b.lambda$performSendMessageRequest$79((TLRPC.TL_messages_addPollAnswer) this.f18217g, (TLRPC.TL_messages_addPollAnswer) this.h, this.f18214c, this.d, (SendMessagesHelper.DelayedMessage) this.f18218i, this.f18215e, (SendMessagesHelper.DelayedMessage) this.f18219j, this.f18220k, (HashMap) this.f18221l, this.f18216f, tLObject, tL_error);
                return;
            default:
                this.f18213b.lambda$performSendMessageRequest$104((TLObject) this.f18217g, this.f18214c, this.d, (SendMessagesHelper.DelayedMessage) this.h, this.f18215e, (SendMessagesHelper.DelayedMessage) this.f18218i, this.f18219j, (HashMap) this.f18220k, this.f18216f, (TLRPC.Message) this.f18221l, tLObject, tL_error);
                return;
        }
    }

    public ii(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f18213b = sendMessagesHelper;
        this.f18217g = tLObject;
        this.f18214c = messageObject;
        this.d = str;
        this.h = delayedMessage;
        this.f18215e = z10;
        this.f18218i = delayedMessage2;
        this.f18219j = obj;
        this.f18220k = hashMap;
        this.f18216f = z11;
        this.f18221l = message;
    }

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f18213b = sendMessagesHelper;
        this.f18217g = tL_messages_addPollAnswer;
        this.h = tL_messages_addPollAnswer2;
        this.f18214c = messageObject;
        this.d = str;
        this.f18218i = delayedMessage;
        this.f18215e = z10;
        this.f18219j = delayedMessage2;
        this.f18220k = obj;
        this.f18221l = hashMap;
        this.f18216f = z11;
    }
}
