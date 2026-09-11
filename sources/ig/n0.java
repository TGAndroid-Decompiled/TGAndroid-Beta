package ig;

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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.co;
import org.telegram.ui.hh1;
public final class n0 implements RequestDelegate {
    public final int f12156a;
    public final Object f12157b;
    public final boolean f12158c;
    public final Object d;
    public final Object f12159e;
    public final Object f12160f;

    public n0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f12156a = 0;
        this.d = u0Var;
        this.f12159e = iArr;
        this.f12157b = arrayList;
        this.f12158c = z10;
        this.f12160f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12156a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0((u0) this.d, tL_error, tLObject, (int[]) this.f12159e, (ArrayList) this.f12157b, this.f12158c, (TLRPC.User) this.f12160f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f12157b, (ArrayList) this.f12159e, this.f12158c, (String) this.f12160f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.f12159e, (co) this.f12157b, (String) this.f12160f, this.f12158c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.f12158c, (MessageObject) this.f12159e, (TLRPC.TL_messages_editMessage) this.f12157b, (n2) this.f12160f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q0((hh1) this.d, tL_error, this.f12158c, tLObject, (byte[]) this.f12159e, (String) this.f12157b, (TL_account.passwordInputSettings) this.f12160f));
                return;
            default:
                xh.n nVar = (xh.n) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f12159e;
                TLRPC.User user = (TLRPC.User) this.f12160f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f12157b;
                if (tL_error == null) {
                    MessagesController.getInstance(nVar.f49450k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q0(nVar, tL_error, tLObject, tL_chatInviteImporter, this.f12158c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f12156a = i10;
        this.d = obj;
        this.f12158c = z10;
        this.f12159e = obj2;
        this.f12157b = obj3;
        this.f12160f = obj4;
    }

    public n0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f12156a = 1;
        this.d = contactsController;
        this.f12157b = arrayList;
        this.f12159e = arrayList2;
        this.f12158c = z10;
        this.f12160f = str;
    }

    public n0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, co coVar, String str, boolean z10) {
        this.f12156a = 2;
        this.d = sendMessagesHelper;
        this.f12159e = tL_messages_requestUrlAuth;
        this.f12157b = coVar;
        this.f12160f = str;
        this.f12158c = z10;
    }

    public n0(xh.n nVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f12156a = 5;
        this.d = nVar;
        this.f12159e = tL_chatInviteImporter;
        this.f12158c = z10;
        this.f12160f = user;
        this.f12157b = tL_messages_hideChatJoinRequest;
    }
}
