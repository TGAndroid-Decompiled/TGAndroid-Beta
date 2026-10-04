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
import org.telegram.ui.bh1;
import org.telegram.ui.yn;
public final class o0 implements RequestDelegate {
    public final int f11287a;
    public final Object f11288b;
    public final boolean f11289c;
    public final Object d;
    public final Object f11290e;
    public final Object f11291f;

    public o0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f11287a = 0;
        this.d = u0Var;
        this.f11290e = iArr;
        this.f11288b = arrayList;
        this.f11289c = z10;
        this.f11291f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11287a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0((u0) this.d, tL_error, tLObject, (int[]) this.f11290e, (ArrayList) this.f11288b, this.f11289c, (TLRPC.User) this.f11291f));
                return;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.f11288b, (ArrayList) this.f11290e, this.f11289c, (String) this.f11291f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.f11290e, (yn) this.f11288b, (String) this.f11291f, this.f11289c, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.f11289c, (MessageObject) this.f11290e, (TLRPC.TL_messages_editMessage) this.f11288b, (n2) this.f11291f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new r0((bh1) this.d, tL_error, this.f11289c, tLObject, (byte[]) this.f11290e, (String) this.f11288b, (TL_account.passwordInputSettings) this.f11291f));
                return;
            default:
                wh.n nVar = (wh.n) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f11290e;
                TLRPC.User user = (TLRPC.User) this.f11291f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f11288b;
                if (tL_error == null) {
                    MessagesController.getInstance(nVar.f49142k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r0(nVar, tL_error, tLObject, tL_chatInviteImporter, this.f11289c, user, tL_messages_hideChatJoinRequest));
                return;
        }
    }

    public o0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f11287a = i10;
        this.d = obj;
        this.f11289c = z10;
        this.f11290e = obj2;
        this.f11288b = obj3;
        this.f11291f = obj4;
    }

    public o0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.f11287a = 1;
        this.d = contactsController;
        this.f11288b = arrayList;
        this.f11290e = arrayList2;
        this.f11289c = z10;
        this.f11291f = str;
    }

    public o0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, yn ynVar, String str, boolean z10) {
        this.f11287a = 2;
        this.d = sendMessagesHelper;
        this.f11290e = tL_messages_requestUrlAuth;
        this.f11288b = ynVar;
        this.f11291f = str;
        this.f11289c = z10;
    }

    public o0(wh.n nVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11287a = 5;
        this.d = nVar;
        this.f11290e = tL_chatInviteImporter;
        this.f11289c = z10;
        this.f11291f = user;
        this.f11288b = tL_messages_hideChatJoinRequest;
    }
}
