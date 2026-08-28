package eh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ag1;
import org.telegram.ui.qn;
import pf.m0;
public final class g implements RequestDelegate {
    public final int f5188a;
    public final boolean f5189b;
    public final Object f5190c;
    public final Object d;
    public final Object f5191e;
    public final Object f5192f;

    public g(x xVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f5188a = 0;
        this.f5190c = xVar;
        this.d = tL_chatInviteImporter;
        this.f5189b = z10;
        this.f5191e = user;
        this.f5192f = tL_messages_hideChatJoinRequest;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5188a) {
            case 0:
                x xVar = (x) this.f5190c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f5191e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f5192f;
                if (tL_error == null) {
                    MessagesController.getInstance(xVar.f5254k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h(xVar, tL_error, tLObject, tL_chatInviteImporter, this.f5189b, user, tL_messages_hideChatJoinRequest));
                return;
            case 1:
                ((ContactsController) this.f5190c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.f5191e, this.f5189b, (String) this.f5192f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.f5190c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (qn) this.f5191e, (String) this.f5192f, this.f5189b, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.f5190c).lambda$sendEditRichMessageRequest$26(this.f5189b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.f5191e, (o2) this.f5192f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((ag1) this.f5190c, tL_error, this.f5189b, tLObject, (byte[]) this.d, (String) this.f5191e, (TL_account.passwordInputSettings) this.f5192f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h((m0) this.f5190c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f5192f, this.f5189b, (TLRPC.User) this.f5191e));
                return;
        }
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i9) {
        this.f5188a = i9;
        this.f5190c = obj;
        this.f5189b = z10;
        this.d = obj2;
        this.f5191e = obj3;
        this.f5192f = obj4;
    }

    public g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f5188a = 1;
        this.f5190c = contactsController;
        this.d = arrayList;
        this.f5191e = arrayList2;
        this.f5189b = z10;
        this.f5192f = str;
    }

    public g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, qn qnVar, String str, boolean z10) {
        this.f5188a = 2;
        this.f5190c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.f5191e = qnVar;
        this.f5192f = str;
        this.f5189b = z10;
    }

    public g(m0 m0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f5188a = 5;
        this.f5190c = m0Var;
        this.d = iArr;
        this.f5192f = arrayList;
        this.f5189b = z10;
        this.f5191e = user;
    }
}
