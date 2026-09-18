package hg;

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
import org.telegram.ui.gh1;
import org.telegram.ui.zn;
public final class o0 implements RequestDelegate {
    public final int f10377a;
    public final Object f10378b;
    public final boolean f10379c;
    public final Object d;
    public final Object e;
    public final Object f10380f;

    public o0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f10377a = 0;
        this.d = u0Var;
        this.e = iArr;
        this.f10378b = arrayList;
        this.f10379c = z10;
        this.f10380f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10377a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0((u0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f10378b, this.f10379c, (TLRPC.User) this.f10380f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f10378b, (ArrayList) this.e, this.f10379c, (String) this.f10380f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.e, (zn) this.f10378b, (String) this.f10380f, this.f10379c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.f10379c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f10378b, (n2) this.f10380f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r0((gh1) this.d, tL_error, this.f10379c, tLObject, (byte[]) this.e, (String) this.f10378b, (TL_account.passwordInputSettings) this.f10380f));
                return;
            default:
                wh.n nVar = (wh.n) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f10380f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f10378b;
                if (tL_error == null) {
                    MessagesController.getInstance(nVar.f45369k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r0(nVar, tL_error, tLObject, tL_chatInviteImporter, this.f10379c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f10377a = i10;
        this.d = obj;
        this.f10379c = z10;
        this.e = obj2;
        this.f10378b = obj3;
        this.f10380f = obj4;
    }

    public o0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f10377a = 1;
        this.d = contactsController;
        this.f10378b = arrayList;
        this.e = arrayList2;
        this.f10379c = z10;
        this.f10380f = str;
    }

    public o0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, zn znVar, String str, boolean z10) {
        this.f10377a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f10378b = znVar;
        this.f10380f = str;
        this.f10379c = z10;
    }

    public o0(wh.n nVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f10377a = 5;
        this.d = nVar;
        this.e = tL_chatInviteImporter;
        this.f10379c = z10;
        this.f10380f = user;
        this.f10378b = tL_messages_hideChatJoinRequest;
    }
}
