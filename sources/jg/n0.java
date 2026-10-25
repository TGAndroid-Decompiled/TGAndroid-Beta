package jg;

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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.dg1;
import org.telegram.ui.un;
public final class n0 implements RequestDelegate {
    public final int f15787a;
    public final Object f15788b;
    public final boolean f15789c;
    public final Object d;
    public final Object e;
    public final Object f15790f;

    public n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f15787a = i10;
        this.d = obj;
        this.f15789c = z10;
        this.e = obj2;
        this.f15788b = obj3;
        this.f15790f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15787a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0((t0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f15788b, this.f15789c, (TLRPC.User) this.f15790f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f15788b, (ArrayList) this.e, this.f15789c, (String) this.f15790f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.e, (un) this.f15788b, (String) this.f15790f, this.f15789c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$29(this.f15789c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f15788b, (r2) this.f15790f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q0((dg1) this.d, tL_error, this.f15789c, tLObject, (byte[]) this.e, (String) this.f15788b, (TL_account.passwordInputSettings) this.f15790f));
                return;
            default:
                yh.k kVar = (yh.k) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f15790f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f15788b;
                if (tL_error == null) {
                    MessagesController.getInstance(kVar.f52614k).lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q0(kVar, tL_error, tLObject, tL_chatInviteImporter, this.f15789c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public n0(t0 t0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f15787a = 0;
        this.d = t0Var;
        this.e = iArr;
        this.f15788b = arrayList;
        this.f15789c = z10;
        this.f15790f = user;
    }

    public n0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f15787a = 1;
        this.d = contactsController;
        this.f15788b = arrayList;
        this.e = arrayList2;
        this.f15789c = z10;
        this.f15790f = str;
    }

    public n0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, un unVar, String str, boolean z10) {
        this.f15787a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f15788b = unVar;
        this.f15790f = str;
        this.f15789c = z10;
    }

    public n0(yh.k kVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f15787a = 5;
        this.d = kVar;
        this.e = tL_chatInviteImporter;
        this.f15789c = z10;
        this.f15790f = user;
        this.f15788b = tL_messages_hideChatJoinRequest;
    }
}
