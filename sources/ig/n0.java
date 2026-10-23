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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.bg1;
import org.telegram.ui.sn;
public final class n0 implements RequestDelegate {
    public final int f13005a;
    public final Object f13006b;
    public final boolean f13007c;
    public final Object d;
    public final Object e;
    public final Object f13008f;

    public n0(s0 s0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f13005a = 0;
        this.d = s0Var;
        this.e = iArr;
        this.f13006b = arrayList;
        this.f13007c = z10;
        this.f13008f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13005a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0((s0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f13006b, this.f13007c, (TLRPC.User) this.f13008f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f13006b, (ArrayList) this.e, this.f13007c, (String) this.f13008f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.e, (sn) this.f13006b, (String) this.f13008f, this.f13007c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f13007c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f13006b, (o2) this.f13008f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q0((bg1) this.d, tL_error, this.f13007c, tLObject, (byte[]) this.e, (String) this.f13006b, (TL_account.passwordInputSettings) this.f13008f));
                return;
            default:
                xh.k kVar = (xh.k) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f13008f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f13006b;
                if (tL_error == null) {
                    MessagesController.getInstance(kVar.f50314k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q0(kVar, tL_error, tLObject, tL_chatInviteImporter, this.f13007c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f13005a = i10;
        this.d = obj;
        this.f13007c = z10;
        this.e = obj2;
        this.f13006b = obj3;
        this.f13008f = obj4;
    }

    public n0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f13005a = 1;
        this.d = contactsController;
        this.f13006b = arrayList;
        this.e = arrayList2;
        this.f13007c = z10;
        this.f13008f = str;
    }

    public n0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, sn snVar, String str, boolean z10) {
        this.f13005a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f13006b = snVar;
        this.f13008f = str;
        this.f13007c = z10;
    }

    public n0(xh.k kVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f13005a = 5;
        this.d = kVar;
        this.e = tL_chatInviteImporter;
        this.f13007c = z10;
        this.f13008f = user;
        this.f13006b = tL_messages_hideChatJoinRequest;
    }
}
