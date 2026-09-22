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
public final class ki implements RequestDelegate {
    public final int f16838a = 2;
    public final SendMessagesHelper f16839b;
    public final MessageObject f16840c;
    public final String d;
    public final Object e;
    public final boolean f16841f;
    public final Object f16842g;
    public final Object h;
    public final Object f16843i;
    public final boolean f16844j;
    public final Object f16845k;
    public final Object f16846l;

    public ki(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.f16839b = sendMessagesHelper;
        this.d = str;
        this.f16845k = list;
        this.f16841f = z10;
        this.f16840c = messageObject;
        this.f16846l = keyboardButtonProto;
        this.e = znVar;
        this.f16842g = twoStepVerificationActivity;
        this.h = tLObjectArr;
        this.f16843i = inputCheckPasswordSRP;
        this.f16844j = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16838a) {
            case 0:
                this.f16839b.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f16845k, (TLRPC.TL_messages_addPollAnswer) this.f16846l, this.f16840c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16841f, (SendMessagesHelper.DelayedMessage) this.f16842g, this.h, (HashMap) this.f16843i, this.f16844j, tLObject, tL_error);
                return;
            case 1:
                this.f16839b.lambda$performSendMessageRequest$101((TLObject) this.f16845k, this.f16840c, this.d, (SendMessagesHelper.DelayedMessage) this.e, this.f16841f, (SendMessagesHelper.DelayedMessage) this.f16842g, this.h, (HashMap) this.f16843i, this.f16844j, (TLRPC.Message) this.f16846l, tLObject, tL_error);
                return;
            default:
                boolean z10 = this.f16844j;
                String str = this.d;
                MessageObject messageObject = this.f16840c;
                this.f16839b.lambda$sendCallback$46(str, (List) this.f16845k, this.f16841f, messageObject, (TL_keyboard.KeyboardButtonProto) this.f16846l, (zn) this.e, (TwoStepVerificationActivity) this.f16842g, (TLObject[]) this.h, (TLRPC.InputCheckPasswordSRP) this.f16843i, z10, tLObject, tL_error);
                return;
        }
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.f16839b = sendMessagesHelper;
        this.f16845k = tLObject;
        this.f16840c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16841f = z10;
        this.f16842g = delayedMessage2;
        this.h = obj;
        this.f16843i = hashMap;
        this.f16844j = z11;
        this.f16846l = message;
    }

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z10, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        this.f16839b = sendMessagesHelper;
        this.f16845k = tL_messages_addPollAnswer;
        this.f16846l = tL_messages_addPollAnswer2;
        this.f16840c = messageObject;
        this.d = str;
        this.e = delayedMessage;
        this.f16841f = z10;
        this.f16842g = delayedMessage2;
        this.h = obj;
        this.f16843i = hashMap;
        this.f16844j = z11;
    }
}
