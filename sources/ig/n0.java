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
    public final int f12182a;
    public final Object f12183b;
    public final boolean f12184c;
    public final Object d;
    public final Object f12185e;
    public final Object f12186f;

    public n0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f12182a = 0;
        this.d = u0Var;
        this.f12185e = iArr;
        this.f12183b = arrayList;
        this.f12184c = z10;
        this.f12186f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12182a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0((u0) this.d, tL_error, tLObject, (int[]) this.f12185e, (ArrayList) this.f12183b, this.f12184c, (TLRPC.User) this.f12186f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f12183b, (ArrayList) this.f12185e, this.f12184c, (String) this.f12186f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.f12185e, (co) this.f12183b, (String) this.f12186f, this.f12184c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.f12184c, (MessageObject) this.f12185e, (TLRPC.TL_messages_editMessage) this.f12183b, (n2) this.f12186f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q0((hh1) this.d, tL_error, this.f12184c, tLObject, (byte[]) this.f12185e, (String) this.f12183b, (TL_account.passwordInputSettings) this.f12186f));
                return;
            default:
                xh.n nVar = (xh.n) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f12185e;
                TLRPC.User user = (TLRPC.User) this.f12186f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f12183b;
                if (tL_error == null) {
                    MessagesController.getInstance(nVar.f49479k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q0(nVar, tL_error, tLObject, tL_chatInviteImporter, this.f12184c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f12182a = i10;
        this.d = obj;
        this.f12184c = z10;
        this.f12185e = obj2;
        this.f12183b = obj3;
        this.f12186f = obj4;
    }

    public n0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f12182a = 1;
        this.d = contactsController;
        this.f12183b = arrayList;
        this.f12185e = arrayList2;
        this.f12184c = z10;
        this.f12186f = str;
    }

    public n0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, co coVar, String str, boolean z10) {
        this.f12182a = 2;
        this.d = sendMessagesHelper;
        this.f12185e = tL_messages_requestUrlAuth;
        this.f12183b = coVar;
        this.f12186f = str;
        this.f12184c = z10;
    }

    public n0(xh.n nVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f12182a = 5;
        this.d = nVar;
        this.f12185e = tL_chatInviteImporter;
        this.f12184c = z10;
        this.f12186f = user;
        this.f12183b = tL_messages_hideChatJoinRequest;
    }
}
