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
import org.telegram.ui.wn;
import org.telegram.ui.zg1;
public final class p0 implements RequestDelegate {
    public final int f10368a;
    public final Object f10369b;
    public final boolean f10370c;
    public final Object d;
    public final Object e;
    public final Object f10371f;

    public p0(v0 v0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f10368a = 0;
        this.d = v0Var;
        this.e = iArr;
        this.f10369b = arrayList;
        this.f10370c = z10;
        this.f10371f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10368a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0((v0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f10369b, this.f10370c, (TLRPC.User) this.f10371f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f10369b, (ArrayList) this.e, this.f10370c, (String) this.f10371f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.e, (wn) this.f10369b, (String) this.f10371f, this.f10370c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.f10370c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.f10369b, (m2) this.f10371f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new s0((zg1) this.d, tL_error, this.f10370c, tLObject, (byte[]) this.e, (String) this.f10369b, (TL_account.passwordInputSettings) this.f10371f));
                return;
            default:
                wh.n nVar = (wh.n) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f10371f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f10369b;
                if (tL_error == null) {
                    MessagesController.getInstance(nVar.f45395k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new s0(nVar, tL_error, tLObject, tL_chatInviteImporter, this.f10370c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public p0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f10368a = i10;
        this.d = obj;
        this.f10370c = z10;
        this.e = obj2;
        this.f10369b = obj3;
        this.f10371f = obj4;
    }

    public p0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f10368a = 1;
        this.d = contactsController;
        this.f10369b = arrayList;
        this.e = arrayList2;
        this.f10370c = z10;
        this.f10371f = str;
    }

    public p0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, wn wnVar, String str, boolean z10) {
        this.f10368a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.f10369b = wnVar;
        this.f10371f = str;
        this.f10370c = z10;
    }

    public p0(wh.n nVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f10368a = 5;
        this.d = nVar;
        this.e = tL_chatInviteImporter;
        this.f10370c = z10;
        this.f10371f = user;
        this.f10369b = tL_messages_hideChatJoinRequest;
    }
}
