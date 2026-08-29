package hh;

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
import org.telegram.ui.cg1;
import org.telegram.ui.tn;
import sf.l0;
public final class g implements RequestDelegate {
    public final int f8066a;
    public final boolean f8067b;
    public final Object f8068c;
    public final Object d;
    public final Object f8069e;
    public final Object f8070f;

    public g(v vVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f8066a = 0;
        this.f8068c = vVar;
        this.d = tL_chatInviteImporter;
        this.f8067b = z10;
        this.f8069e = user;
        this.f8070f = tL_messages_hideChatJoinRequest;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8066a) {
            case 0:
                v vVar = (v) this.f8068c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f8069e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f8070f;
                if (tL_error == null) {
                    MessagesController.getInstance(vVar.f8128k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h(vVar, tL_error, tLObject, tL_chatInviteImporter, this.f8067b, user, tL_messages_hideChatJoinRequest));
                return;
            case 1:
                ((ContactsController) this.f8068c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.f8069e, this.f8067b, (String) this.f8070f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.f8068c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (tn) this.f8069e, (String) this.f8070f, this.f8067b, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.f8068c).lambda$sendEditRichMessageRequest$26(this.f8067b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.f8069e, (o2) this.f8070f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((cg1) this.f8068c, tL_error, this.f8067b, tLObject, (byte[]) this.d, (String) this.f8069e, (TL_account.passwordInputSettings) this.f8070f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h((l0) this.f8068c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f8070f, this.f8067b, (TLRPC.User) this.f8069e));
                return;
        }
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f8066a = i10;
        this.f8068c = obj;
        this.f8067b = z10;
        this.d = obj2;
        this.f8069e = obj3;
        this.f8070f = obj4;
    }

    public g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f8066a = 1;
        this.f8068c = contactsController;
        this.d = arrayList;
        this.f8069e = arrayList2;
        this.f8067b = z10;
        this.f8070f = str;
    }

    public g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, tn tnVar, String str, boolean z10) {
        this.f8066a = 2;
        this.f8068c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.f8069e = tnVar;
        this.f8070f = str;
        this.f8067b = z10;
    }

    public g(l0 l0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f8066a = 5;
        this.f8068c = l0Var;
        this.d = iArr;
        this.f8070f = arrayList;
        this.f8067b = z10;
        this.f8069e = user;
    }
}
