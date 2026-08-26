package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class SendMessagesHelper$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final SendMessagesHelper f$0;
    public final Object f$1;
    public final HashMap f$10;
    public final boolean f$11;
    public final TLObject f$2;
    public final TLObject f$3;
    public final MessageObject f$4;
    public final String f$5;
    public final SendMessagesHelper.DelayedMessage f$6;
    public final boolean f$7;
    public final SendMessagesHelper.DelayedMessage f$8;
    public final Object f$9;

    public SendMessagesHelper$$ExternalSyntheticLambda6(SendMessagesHelper sendMessagesHelper, Object obj, TLObject tLObject, TLObject tLObject2, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj2, HashMap map, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = sendMessagesHelper;
        this.f$1 = obj;
        this.f$2 = tLObject;
        this.f$3 = tLObject2;
        this.f$4 = messageObject;
        this.f$5 = str;
        this.f$6 = delayedMessage;
        this.f$7 = z;
        this.f$8 = delayedMessage2;
        this.f$9 = obj2;
        this.f$10 = map;
        this.f$11 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSendMessageRequest$83((BaseFragment) this.f$1, (TLRPC.TL_inputMediaStakeDice) this.f$2, (TLRPC.TL_messages_sendMedia) this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11);
                break;
            default:
                this.f$0.lambda$performSendMessageRequest$75((TLObject) this.f$1, (TLRPC.TL_messages_addPollAnswer) this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11);
                break;
        }
    }
}
