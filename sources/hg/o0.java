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
import org.telegram.ui.eo;
import org.telegram.ui.kh1;
public final class o0 implements RequestDelegate {
    public final int f11335a;
    public final Object f11336b;
    public final boolean f11337c;
    public final Object d;
    public final Object f11338e;
    public final Object f11339f;

    public o0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f11335a = 0;
        this.d = u0Var;
        this.f11338e = iArr;
        this.f11336b = arrayList;
        this.f11337c = z10;
        this.f11339f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11335a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0((u0) this.d, tL_error, tLObject, (int[]) this.f11338e, (ArrayList) this.f11336b, this.f11337c, (TLRPC.User) this.f11339f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f11336b, (ArrayList) this.f11338e, this.f11337c, (String) this.f11339f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.f11338e, (eo) this.f11336b, (String) this.f11339f, this.f11337c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f11337c, (MessageObject) this.f11338e, (TLRPC.TL_messages_editMessage) this.f11336b, (m2) this.f11339f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r0((kh1) this.d, tL_error, this.f11337c, tLObject, (byte[]) this.f11338e, (String) this.f11336b, (TL_account.passwordInputSettings) this.f11339f));
                return;
            default:
                wh.l lVar = (wh.l) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f11338e;
                TLRPC.User user = (TLRPC.User) this.f11339f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f11336b;
                if (tL_error == null) {
                    MessagesController.getInstance(lVar.f50673k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f11337c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f11335a = i10;
        this.d = obj;
        this.f11337c = z10;
        this.f11338e = obj2;
        this.f11336b = obj3;
        this.f11339f = obj4;
    }

    public o0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f11335a = 1;
        this.d = contactsController;
        this.f11336b = arrayList;
        this.f11338e = arrayList2;
        this.f11337c = z10;
        this.f11339f = str;
    }

    public o0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, eo eoVar, String str, boolean z10) {
        this.f11335a = 2;
        this.d = sendMessagesHelper;
        this.f11338e = tL_messages_requestUrlAuth;
        this.f11336b = eoVar;
        this.f11339f = str;
        this.f11337c = z10;
    }

    public o0(wh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11335a = 5;
        this.d = lVar;
        this.f11338e = tL_chatInviteImporter;
        this.f11337c = z10;
        this.f11339f = user;
        this.f11336b = tL_messages_hideChatJoinRequest;
    }
}
