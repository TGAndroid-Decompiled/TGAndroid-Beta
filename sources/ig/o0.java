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
import org.telegram.ui.sn;
import org.telegram.ui.xf1;
public final class o0 implements RequestDelegate {
    public final int f12982a;
    public final Object f12983b;
    public final boolean f12984c;
    public final Object d;
    public final Object e;
    public final Object f12985f;

    public o0(t0 t0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f12982a = 0;
        this.d = t0Var;
        this.e = iArr;
        this.f12983b = arrayList;
        this.f12984c = z10;
        this.f12985f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12982a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0((t0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f12983b, this.f12984c, (TLRPC.User) this.f12985f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f12983b, (ArrayList) this.e, this.f12984c, (String) this.f12985f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.e, (sn) this.f12983b, (String) this.f12985f, this.f12984c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f12984c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f12983b, (n2) this.f12985f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r0((xf1) this.d, tL_error, this.f12984c, tLObject, (byte[]) this.e, (String) this.f12983b, (TL_account.passwordInputSettings) this.f12985f));
                return;
            default:
                xh.k kVar = (xh.k) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f12985f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f12983b;
                if (tL_error == null) {
                    MessagesController.getInstance(kVar.f49911k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r0(kVar, tL_error, tLObject, tL_chatInviteImporter, this.f12984c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f12982a = i10;
        this.d = obj;
        this.f12984c = z10;
        this.e = obj2;
        this.f12983b = obj3;
        this.f12985f = obj4;
    }

    public o0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f12982a = 1;
        this.d = contactsController;
        this.f12983b = arrayList;
        this.e = arrayList2;
        this.f12984c = z10;
        this.f12985f = str;
    }

    public o0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, sn snVar, String str, boolean z10) {
        this.f12982a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f12983b = snVar;
        this.f12985f = str;
        this.f12984c = z10;
    }

    public o0(xh.k kVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f12982a = 5;
        this.d = kVar;
        this.e = tL_chatInviteImporter;
        this.f12984c = z10;
        this.f12985f = user;
        this.f12983b = tL_messages_hideChatJoinRequest;
    }
}
