package kh;

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
import org.telegram.ui.vg1;
import org.telegram.ui.xn;
import vf.l0;
public final class g implements RequestDelegate {
    public final int f11250a;
    public final boolean f11251b;
    public final Object f11252c;
    public final Object d;
    public final Object f11253e;
    public final Object f11254f;

    public g(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.f11250a = i10;
        this.f11252c = obj;
        this.f11251b = z4;
        this.d = obj2;
        this.f11253e = obj3;
        this.f11254f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11250a) {
            case 0:
                v vVar = (v) this.f11252c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f11253e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f11254f;
                if (tL_error == null) {
                    MessagesController.getInstance(vVar.f11312k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h(vVar, tL_error, tLObject, tL_chatInviteImporter, this.f11251b, user, tL_messages_hideChatJoinRequest));
                return;
            case 1:
                ((ContactsController) this.f11252c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.f11253e, this.f11251b, (String) this.f11254f, tLObject, tL_error);
                return;
            case 2:
                ((SendMessagesHelper) this.f11252c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (xn) this.f11253e, (String) this.f11254f, this.f11251b, tLObject, tL_error);
                return;
            case 3:
                ((SendMessagesHelper) this.f11252c).lambda$sendEditRichMessageRequest$26(this.f11251b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.f11253e, (p2) this.f11254f, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((vg1) this.f11252c, tL_error, this.f11251b, tLObject, (byte[]) this.d, (String) this.f11253e, (TL_account.passwordInputSettings) this.f11254f));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h((l0) this.f11252c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f11254f, this.f11251b, (TLRPC.User) this.f11253e));
                return;
        }
    }

    public g(v vVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f11250a = 0;
        this.f11252c = vVar;
        this.d = tL_chatInviteImporter;
        this.f11251b = z4;
        this.f11253e = user;
        this.f11254f = tL_messages_hideChatJoinRequest;
    }

    public g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z4, String str) {
        this.f11250a = 1;
        this.f11252c = contactsController;
        this.d = arrayList;
        this.f11253e = arrayList2;
        this.f11251b = z4;
        this.f11254f = str;
    }

    public g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, xn xnVar, String str, boolean z4) {
        this.f11250a = 2;
        this.f11252c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.f11253e = xnVar;
        this.f11254f = str;
        this.f11251b = z4;
    }

    public g(l0 l0Var, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        this.f11250a = 5;
        this.f11252c = l0Var;
        this.d = iArr;
        this.f11254f = arrayList;
        this.f11251b = z4;
        this.f11253e = user;
    }
}
