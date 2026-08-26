package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.TwoStepVerificationActivity;

public final class SendMessagesHelper$$ExternalSyntheticLambda97 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final SendMessagesHelper f$0;
    public final String f$1;
    public final boolean f$10;
    public final Object f$2;
    public final boolean f$3;
    public final MessageObject f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;
    public final Object f$9;

    public SendMessagesHelper$$ExternalSyntheticLambda97(SendMessagesHelper sendMessagesHelper, String str, List list, boolean z, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, ChatActivity chatActivity, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z2) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = str;
        this.f$2 = list;
        this.f$3 = z;
        this.f$4 = messageObject;
        this.f$5 = keyboardButtonProto;
        this.f$6 = chatActivity;
        this.f$7 = twoStepVerificationActivity;
        this.f$8 = tLObjectArr;
        this.f$9 = inputCheckPasswordSRP;
        this.f$10 = z2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendCallback$46(this.f$1, (List) this.f$2, this.f$3, this.f$4, (TL_keyboard.KeyboardButtonProto) this.f$5, (ChatActivity) this.f$6, (TwoStepVerificationActivity) this.f$7, (TLObject[]) this.f$8, (TLRPC.InputCheckPasswordSRP) this.f$9, this.f$10, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$performSendMessageRequest$76((TLRPC.TL_messages_addPollAnswer) this.f$2, (TLRPC.TL_messages_addPollAnswer) this.f$5, this.f$4, this.f$1, (SendMessagesHelper.DelayedMessage) this.f$6, this.f$3, (SendMessagesHelper.DelayedMessage) this.f$7, this.f$8, (HashMap) this.f$9, this.f$10, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$101((TLObject) this.f$2, this.f$4, this.f$1, (SendMessagesHelper.DelayedMessage) this.f$5, this.f$3, (SendMessagesHelper.DelayedMessage) this.f$6, this.f$7, (HashMap) this.f$8, this.f$10, (TLRPC.Message) this.f$9, tLObject, tL_error);
                break;
        }
    }

    public SendMessagesHelper$$ExternalSyntheticLambda97(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z2, TLRPC.Message message) {
        this.f$0 = sendMessagesHelper;
        this.f$2 = tLObject;
        this.f$4 = messageObject;
        this.f$1 = str;
        this.f$5 = delayedMessage;
        this.f$3 = z;
        this.f$6 = delayedMessage2;
        this.f$7 = obj;
        this.f$8 = map;
        this.f$10 = z2;
        this.f$9 = message;
    }

    public SendMessagesHelper$$ExternalSyntheticLambda97(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z2) {
        this.f$0 = sendMessagesHelper;
        this.f$2 = tL_messages_addPollAnswer;
        this.f$5 = tL_messages_addPollAnswer2;
        this.f$4 = messageObject;
        this.f$1 = str;
        this.f$6 = delayedMessage;
        this.f$3 = z;
        this.f$7 = delayedMessage2;
        this.f$8 = obj;
        this.f$9 = map;
        this.f$10 = z2;
    }
}
