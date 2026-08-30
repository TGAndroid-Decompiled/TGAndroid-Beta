package jh;

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
import org.telegram.ui.og1;
import org.telegram.ui.xn;
import uf.k0;
public final class g implements RequestDelegate {
    public final int f9432a;
    public final boolean f9433b;
    public final Object f9434c;
    public final Object d;
    public final Object e;
    public final Object f9435f;

    public g(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.f9432a = i10;
        this.f9434c = obj;
        this.f9433b = z4;
        this.d = obj2;
        this.e = obj3;
        this.f9435f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9432a) {
            case 0:
                v vVar = (v) this.f9434c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f9435f;
                if (tL_error == null) {
                    MessagesController.getInstance(vVar.f9486k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h(vVar, tL_error, tLObject, tL_chatInviteImporter, this.f9433b, user, tL_messages_hideChatJoinRequest));
                return;
            case 1:
                ((ContactsController) this.f9434c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.e, this.f9433b, (String) this.f9435f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.f9434c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (xn) this.e, (String) this.f9435f, this.f9433b, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.f9434c).lambda$sendEditRichMessageRequest$26(this.f9433b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.e, (p2) this.f9435f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((og1) this.f9434c, tL_error, this.f9433b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f9435f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h((k0) this.f9434c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f9435f, this.f9433b, (TLRPC.User) this.e));
                return;
        }
    }

    public g(v vVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f9432a = 0;
        this.f9434c = vVar;
        this.d = tL_chatInviteImporter;
        this.f9433b = z4;
        this.e = user;
        this.f9435f = tL_messages_hideChatJoinRequest;
    }

    public g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z4, String str) {
        this.f9432a = 1;
        this.f9434c = contactsController;
        this.d = arrayList;
        this.e = arrayList2;
        this.f9433b = z4;
        this.f9435f = str;
    }

    public g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, xn xnVar, String str, boolean z4) {
        this.f9432a = 2;
        this.f9434c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.e = xnVar;
        this.f9435f = str;
        this.f9433b = z4;
    }

    public g(k0 k0Var, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        this.f9432a = 5;
        this.f9434c = k0Var;
        this.d = iArr;
        this.f9435f = arrayList;
        this.f9433b = z4;
        this.e = user;
    }
}
