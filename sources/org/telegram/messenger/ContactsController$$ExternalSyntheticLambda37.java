package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Delegates.MemberRequestsDelegate;

public final class ContactsController$$ExternalSyntheticLambda37 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;

    public ContactsController$$ExternalSyntheticLambda37(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z, String str) {
        this.f$0 = contactsController;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = z;
        this.f$4 = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ContactsController) this.f$0).lambda$deleteContact$57((ArrayList) this.f$1, (ArrayList) this.f$2, this.f$3, (String) this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.f$1, (ChatActivity) this.f$2, (String) this.f$4, this.f$3, tLObject, tL_error);
                break;
            case 2:
                ((SendMessagesHelper) this.f$0).lambda$sendEditRichMessageRequest$26(this.f$3, (MessageObject) this.f$1, (TLRPC.TL_messages_editMessage) this.f$2, (BaseFragment) this.f$4, tLObject, tL_error);
                break;
            case 3:
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.f$0;
                chatbotsActivity.getClass();
                AndroidUtilities.runOnUIThread(new SendMessagesHelper$$ExternalSyntheticLambda27(chatbotsActivity, tL_error, tLObject, (int[]) this.f$2, (ArrayList) this.f$1, this.f$3, (TLRPC.User) this.f$4));
                break;
            default:
                ((MemberRequestsDelegate) this.f$0).lambda$hideChatJoinRequest$7((TLRPC.TL_chatInviteImporter) this.f$1, this.f$3, (TLRPC.User) this.f$2, (TLRPC.TL_messages_hideChatJoinRequest) this.f$4, tLObject, tL_error);
                break;
        }
    }

    public ContactsController$$ExternalSyntheticLambda37(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_editMessage tL_messages_editMessage, BaseFragment baseFragment, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$3 = z;
        this.f$1 = messageObject;
        this.f$2 = tL_messages_editMessage;
        this.f$4 = baseFragment;
    }

    public ContactsController$$ExternalSyntheticLambda37(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, ChatActivity chatActivity, String str, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_messages_requestUrlAuth;
        this.f$2 = chatActivity;
        this.f$4 = str;
        this.f$3 = z;
    }

    public ContactsController$$ExternalSyntheticLambda37(ChatbotsActivity chatbotsActivity, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.f$0 = chatbotsActivity;
        this.f$2 = iArr;
        this.f$1 = arrayList;
        this.f$3 = z;
        this.f$4 = user;
    }

    public ContactsController$$ExternalSyntheticLambda37(MemberRequestsDelegate memberRequestsDelegate, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f$0 = memberRequestsDelegate;
        this.f$1 = tL_chatInviteImporter;
        this.f$3 = z;
        this.f$2 = user;
        this.f$4 = tL_messages_hideChatJoinRequest;
    }
}
