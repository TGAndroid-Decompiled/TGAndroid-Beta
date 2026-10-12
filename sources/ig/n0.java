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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.fo;
import org.telegram.ui.oh1;
public final class n0 implements RequestDelegate {
    public final int f11583a;
    public final Object f11584b;
    public final boolean f11585c;
    public final Object d;
    public final Object e;
    public final Object f11586f;

    public n0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f11583a = 0;
        this.d = u0Var;
        this.e = iArr;
        this.f11584b = arrayList;
        this.f11585c = z10;
        this.f11586f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11583a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0((u0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f11584b, this.f11585c, (TLRPC.User) this.f11586f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f11584b, (ArrayList) this.e, this.f11585c, (String) this.f11586f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.e, (fo) this.f11584b, (String) this.f11586f, this.f11585c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f11585c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f11584b, (m2) this.f11586f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q0((oh1) this.d, tL_error, this.f11585c, tLObject, (byte[]) this.e, (String) this.f11584b, (TL_account.passwordInputSettings) this.f11586f));
                return;
            default:
                xh.l lVar = (xh.l) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f11586f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f11584b;
                if (tL_error == null) {
                    MessagesController.getInstance(lVar.f48482k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f11585c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f11583a = i10;
        this.d = obj;
        this.f11585c = z10;
        this.e = obj2;
        this.f11584b = obj3;
        this.f11586f = obj4;
    }

    public n0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f11583a = 1;
        this.d = contactsController;
        this.f11584b = arrayList;
        this.e = arrayList2;
        this.f11585c = z10;
        this.f11586f = str;
    }

    public n0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, fo foVar, String str, boolean z10) {
        this.f11583a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f11584b = foVar;
        this.f11586f = str;
        this.f11585c = z10;
    }

    public n0(xh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11583a = 5;
        this.d = lVar;
        this.e = tL_chatInviteImporter;
        this.f11585c = z10;
        this.f11586f = user;
        this.f11584b = tL_messages_hideChatJoinRequest;
    }
}
