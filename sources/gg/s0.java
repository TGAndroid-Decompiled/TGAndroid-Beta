package gg;

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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.eo;
import org.telegram.ui.mh1;
public final class s0 implements RequestDelegate {
    public final int f9031a;
    public final Object f9032b;
    public final boolean f9033c;
    public final Object d;
    public final Object e;
    public final Object f9034f;

    public s0(y0 y0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f9031a = 0;
        this.d = y0Var;
        this.e = iArr;
        this.f9032b = arrayList;
        this.f9033c = z10;
        this.f9034f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9031a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v0((y0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f9032b, this.f9033c, (TLRPC.User) this.f9034f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f9032b, (ArrayList) this.e, this.f9033c, (String) this.f9034f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.e, (eo) this.f9032b, (String) this.f9034f, this.f9033c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.f9033c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f9032b, (p2) this.f9034f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new v0((mh1) this.d, tL_error, this.f9033c, tLObject, (byte[]) this.e, (String) this.f9032b, (TL_account.passwordInputSettings) this.f9034f));
                return;
            default:
                vh.p pVar = (vh.p) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f9034f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f9032b;
                if (tL_error == null) {
                    MessagesController.getInstance(pVar.f43405k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new v0(pVar, tL_error, tLObject, tL_chatInviteImporter, this.f9033c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public s0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f9031a = i10;
        this.d = obj;
        this.f9033c = z10;
        this.e = obj2;
        this.f9032b = obj3;
        this.f9034f = obj4;
    }

    public s0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f9031a = 1;
        this.d = contactsController;
        this.f9032b = arrayList;
        this.e = arrayList2;
        this.f9033c = z10;
        this.f9034f = str;
    }

    public s0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, eo eoVar, String str, boolean z10) {
        this.f9031a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f9032b = eoVar;
        this.f9034f = str;
        this.f9033c = z10;
    }

    public s0(vh.p pVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f9031a = 5;
        this.d = pVar;
        this.e = tL_chatInviteImporter;
        this.f9033c = z10;
        this.f9034f = user;
        this.f9032b = tL_messages_hideChatJoinRequest;
    }
}
