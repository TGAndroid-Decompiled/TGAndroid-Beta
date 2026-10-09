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
import org.telegram.ui.ih1;
import org.telegram.ui.zn;
public final class o0 implements RequestDelegate {
    public final int f11337a;
    public final Object f11338b;
    public final boolean f11339c;
    public final Object d;
    public final Object f11340e;
    public final Object f11341f;

    public o0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f11337a = 0;
        this.d = u0Var;
        this.f11340e = iArr;
        this.f11338b = arrayList;
        this.f11339c = z10;
        this.f11341f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11337a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0((u0) this.d, tL_error, tLObject, (int[]) this.f11340e, (ArrayList) this.f11338b, this.f11339c, (TLRPC.User) this.f11341f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f11338b, (ArrayList) this.f11340e, this.f11339c, (String) this.f11341f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.f11340e, (zn) this.f11338b, (String) this.f11341f, this.f11339c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f11339c, (MessageObject) this.f11340e, (TLRPC.TL_messages_editMessage) this.f11338b, (n2) this.f11341f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r0((ih1) this.d, tL_error, this.f11339c, tLObject, (byte[]) this.f11340e, (String) this.f11338b, (TL_account.passwordInputSettings) this.f11341f));
                return;
            default:
                wh.l lVar = (wh.l) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f11340e;
                TLRPC.User user = (TLRPC.User) this.f11341f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f11338b;
                if (tL_error == null) {
                    MessagesController.getInstance(lVar.f50436k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.f11339c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f11337a = i10;
        this.d = obj;
        this.f11339c = z10;
        this.f11340e = obj2;
        this.f11338b = obj3;
        this.f11341f = obj4;
    }

    public o0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f11337a = 1;
        this.d = contactsController;
        this.f11338b = arrayList;
        this.f11340e = arrayList2;
        this.f11339c = z10;
        this.f11341f = str;
    }

    public o0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, zn znVar, String str, boolean z10) {
        this.f11337a = 2;
        this.d = sendMessagesHelper;
        this.f11340e = tL_messages_requestUrlAuth;
        this.f11338b = znVar;
        this.f11341f = str;
        this.f11339c = z10;
    }

    public o0(wh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11337a = 5;
        this.d = lVar;
        this.f11340e = tL_chatInviteImporter;
        this.f11339c = z10;
        this.f11341f = user;
        this.f11338b = tL_messages_hideChatJoinRequest;
    }
}
