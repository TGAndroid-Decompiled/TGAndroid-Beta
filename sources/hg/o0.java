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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.hh1;
import org.telegram.ui.zn;
public final class o0 implements RequestDelegate {
    public final int f11336a;
    public final Object f11337b;
    public final boolean f11338c;
    public final Object d;
    public final Object f11339e;
    public final Object f11340f;

    public o0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f11336a = 0;
        this.d = u0Var;
        this.f11339e = iArr;
        this.f11337b = arrayList;
        this.f11338c = z10;
        this.f11340f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11336a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0((u0) this.d, tL_error, tLObject, (int[]) this.f11339e, (ArrayList) this.f11337b, this.f11338c, (TLRPC.User) this.f11340f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f11337b, (ArrayList) this.f11339e, this.f11338c, (String) this.f11340f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.f11339e, (zn) this.f11337b, (String) this.f11340f, this.f11338c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f11338c, (MessageObject) this.f11339e, (TLRPC.TL_messages_editMessage) this.f11337b, (m2) this.f11340f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r0((hh1) this.d, tL_error, this.f11338c, tLObject, (byte[]) this.f11339e, (String) this.f11337b, (TL_account.passwordInputSettings) this.f11340f));
                return;
            default:
                wh.l lVar = (wh.l) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f11339e;
                TLRPC.User user = (TLRPC.User) this.f11340f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f11337b;
                if (tL_error == null) {
                    MessagesController.getInstance(lVar.f50558k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f11338c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f11336a = i10;
        this.d = obj;
        this.f11338c = z10;
        this.f11339e = obj2;
        this.f11337b = obj3;
        this.f11340f = obj4;
    }

    public o0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f11336a = 1;
        this.d = contactsController;
        this.f11337b = arrayList;
        this.f11339e = arrayList2;
        this.f11338c = z10;
        this.f11340f = str;
    }

    public o0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, zn znVar, String str, boolean z10) {
        this.f11336a = 2;
        this.d = sendMessagesHelper;
        this.f11339e = tL_messages_requestUrlAuth;
        this.f11337b = znVar;
        this.f11340f = str;
        this.f11338c = z10;
    }

    public o0(wh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11336a = 5;
        this.d = lVar;
        this.f11339e = tL_chatInviteImporter;
        this.f11338c = z10;
        this.f11340f = user;
        this.f11337b = tL_messages_hideChatJoinRequest;
    }
}
