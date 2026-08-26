package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public final class SendMessagesHelper$$ExternalSyntheticLambda27 implements Runnable {
    public final int $r8$classId = 3;
    public final Object f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final boolean f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public SendMessagesHelper$$ExternalSyntheticLambda27(String str, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.passwordInputSettings passwordinputsettings, TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, boolean z, byte[] bArr) {
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$1 = tL_error;
        this.f$3 = z;
        this.f$2 = tLObject;
        this.f$6 = bArr;
        this.f$4 = str;
        this.f$5 = passwordinputsettings;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequestMulti$73(this.f$1, this.f$2, this.f$3, (ArrayList) this.f$4, (ArrayList) this.f$5, (TLObject) this.f$6);
                break;
            case 1:
                ((ChatbotsActivity) this.f$0).lambda$processDone$19(this.f$1, this.f$2, (int[]) this.f$6, (ArrayList) this.f$4, this.f$3, (TLRPC.User) this.f$5);
                break;
            case 2:
                ((MemberRequestsDelegate) this.f$0).lambda$hideChatJoinRequest$6(this.f$1, this.f$2, (TLRPC.TL_chatInviteImporter) this.f$6, this.f$3, (TLRPC.User) this.f$4, (TLRPC.TL_messages_hideChatJoinRequest) this.f$5);
                break;
            default:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$48(this.f$1, this.f$3, this.f$2, (byte[]) this.f$6, (String) this.f$4, (TL_account.passwordInputSettings) this.f$5);
                break;
        }
    }

    public SendMessagesHelper$$ExternalSyntheticLambda27(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = z;
        this.f$4 = arrayList;
        this.f$5 = arrayList2;
        this.f$6 = tLObject2;
    }

    public SendMessagesHelper$$ExternalSyntheticLambda27(ChatbotsActivity chatbotsActivity, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.f$0 = chatbotsActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$6 = iArr;
        this.f$4 = arrayList;
        this.f$3 = z;
        this.f$5 = user;
    }

    public SendMessagesHelper$$ExternalSyntheticLambda27(MemberRequestsDelegate memberRequestsDelegate, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f$0 = memberRequestsDelegate;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$6 = tL_chatInviteImporter;
        this.f$3 = z;
        this.f$4 = user;
        this.f$5 = tL_messages_hideChatJoinRequest;
    }
}
