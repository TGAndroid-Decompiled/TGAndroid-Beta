package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
import org.telegram.ui.xf1;
public final class j4 implements RequestDelegate {
    public final int f1577a;
    public final boolean f1578b;
    public final Object f1579c;
    public final Object d;
    public final Object e;
    public final Object f1580f;

    public j4(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f1577a = i10;
        this.f1579c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1578b = z10;
        this.f1580f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1577a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4((k7) this.f1579c, tL_error, (byte[]) this.d, (TwoStepVerificationActivity) this.e, this.f1578b, (Utilities.Callback) this.f1580f, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4((ig.r0) this.f1579c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.e, this.f1578b, (TLRPC.User) this.f1580f));
                return;
            case 2:
                ((ContactsController) this.f1579c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.e, this.f1578b, (String) this.f1580f, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.f1579c).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.d, (sn) this.e, (String) this.f1580f, this.f1578b, tLObject, tL_error);
                return;
            case 4:
                ((SendMessagesHelper) this.f1579c).lambda$sendEditRichMessageRequest$29(this.f1578b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.e, (org.telegram.ui.ActionBar.n2) this.f1580f, tLObject, tL_error);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new m4((xf1) this.f1579c, tL_error, this.f1578b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f1580f));
                return;
            default:
                xh.k kVar = (xh.k) this.f1579c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f1580f;
                if (tL_error == null) {
                    MessagesController.getInstance(kVar.f49886k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new m4(kVar, tL_error, tLObject, tL_chatInviteImporter, this.f1578b, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public j4(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1577a = i10;
        this.f1579c = obj;
        this.f1578b = z10;
        this.d = obj2;
        this.e = obj3;
        this.f1580f = obj4;
    }

    public j4(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, sn snVar, String str, boolean z10) {
        this.f1577a = 3;
        this.f1579c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.e = snVar;
        this.f1580f = str;
        this.f1578b = z10;
    }

    public j4(xh.k kVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f1577a = 6;
        this.f1579c = kVar;
        this.d = tL_chatInviteImporter;
        this.f1578b = z10;
        this.e = user;
        this.f1580f = tL_messages_hideChatJoinRequest;
    }
}
