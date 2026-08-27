package fh;

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
import org.telegram.ui.rn;
import org.telegram.ui.zf1;
import qf.m0;

public final class g implements RequestDelegate {

    public final int f6119a;

    public final boolean f6120b;

    public final Object f6121c;
    public final Object d;

    public final Object f6122e;

    public final Object f6123f;

    public g(v vVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f6119a = 0;
        this.f6121c = vVar;
        this.d = tL_chatInviteImporter;
        this.f6120b = z10;
        this.f6122e = user;
        this.f6123f = tL_messages_hideChatJoinRequest;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6119a) {
            case 0:
                v vVar = (v) this.f6121c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f6122e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f6123f;
                if (tL_error == null) {
                    MessagesController.getInstance(vVar.f6181k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h(vVar, tL_error, tLObject, tL_chatInviteImporter, this.f6120b, user, tL_messages_hideChatJoinRequest));
                break;
            case 1:
                ((ContactsController) this.f6121c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.f6122e, this.f6120b, (String) this.f6123f, tLObject, tL_error);
                break;
            case 2:
                ((SendMessagesHelper) this.f6121c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (rn) this.f6122e, (String) this.f6123f, this.f6120b, tLObject, tL_error);
                break;
            case 3:
                ((SendMessagesHelper) this.f6121c).lambda$sendEditRichMessageRequest$26(this.f6120b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.f6122e, (n2) this.f6123f, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new h((zf1) this.f6121c, tL_error, this.f6120b, tLObject, (byte[]) this.d, (String) this.f6122e, (TL_account.passwordInputSettings) this.f6123f));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h((m0) this.f6121c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f6123f, this.f6120b, (TLRPC.User) this.f6122e));
                break;
        }
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f6119a = i10;
        this.f6121c = obj;
        this.f6120b = z10;
        this.d = obj2;
        this.f6122e = obj3;
        this.f6123f = obj4;
    }

    public g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f6119a = 1;
        this.f6121c = contactsController;
        this.d = arrayList;
        this.f6122e = arrayList2;
        this.f6120b = z10;
        this.f6123f = str;
    }

    public g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, rn rnVar, String str, boolean z10) {
        this.f6119a = 2;
        this.f6121c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.f6122e = rnVar;
        this.f6123f = str;
        this.f6120b = z10;
    }

    public g(m0 m0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f6119a = 5;
        this.f6121c = m0Var;
        this.d = iArr;
        this.f6123f = arrayList;
        this.f6120b = z10;
        this.f6122e = user;
    }
}
