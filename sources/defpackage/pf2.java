package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
public final class pf2 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public pf2(uf2 uf2Var, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.a = (byte) 0;
        this.d = uf2Var;
        this.e = iArr;
        this.b = arrayList;
        this.c = z;
        this.f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.a) {
            case 0:
                uf2 uf2Var = (uf2) this.d;
                uf2Var.getClass();
                gl.d3(new o2a(uf2Var, tL_error, tLObject, (int[]) this.e, (ArrayList) this.b, this.c, (TLRPC.User) this.f));
                return;
            case 1:
                qu2 qu2Var = (qu2) this.d;
                ArrayList arrayList = (ArrayList) this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                boolean z = this.c;
                String str = (String) this.f;
                if (tL_error == null) {
                    qu2Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    ad7 messagesStorage = qu2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new i41(messagesStorage, arrayList, (byte) 23));
                    }
                    Utilities.h.c(new fu2(qu2Var, arrayList2, (byte) 2));
                    for (int i = 0; i < arrayList2.size(); i++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i);
                        if (!TextUtils.isEmpty(user.phone)) {
                            qu2Var.getMessagesStorage().e(user.phone, "");
                            nu2 nu2Var = (nu2) qu2Var.a0.get(user.phone);
                            if (nu2Var != null && (indexOf = nu2Var.g.indexOf(user.phone)) != -1) {
                                nu2Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    gl.d3(new qg(qu2Var, arrayList2, z, str, (byte) 14));
                    return;
                }
                return;
            case 2:
                xy6 xy6Var = (xy6) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                boolean z2 = this.c;
                TLRPC.User user2 = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.b;
                if (tL_error == null) {
                    na7.q1(xy6Var.k).Q3((TLRPC.TL_updates) tLObject, false);
                }
                gl.d3(new o2a(xy6Var, tL_error, tLObject, tL_chatInviteImporter, z2, user2, tL_messages_hideChatJoinRequest));
                return;
            case 3:
                gl.d3(new z2a((z3a) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (mu1) this.b, (String) this.f, this.c, (byte) 0));
                return;
            case 4:
                z3a z3aVar = (z3a) this.d;
                boolean z3 = this.c;
                k27 k27Var = (k27) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.b;
                d dVar = (d) this.f;
                if (tL_error == null) {
                    if (z3 && k27Var != null) {
                        k27Var.A2 = true;
                    }
                    z3aVar.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new os1(z3aVar, k27Var));
                    return;
                }
                if (ab4.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    z77 z77Var = new z77(z3aVar, tL_messages_editMessage, k27Var, dVar, z3);
                    if (k27Var != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c = ab4.c(str2);
                            z3aVar.getFileRefController().u(new Object[]{arrayList3.get((c < 0 || c >= arrayList3.size()) ? 0 : 0), z77Var}, k27Var);
                            return;
                        }
                    }
                }
                gl.d3(new tj9(z3aVar, k27Var, (byte) 23));
                if (dVar != null) {
                    gl.d3(new t1a(z3aVar, tL_error, dVar, tL_messages_editMessage, (byte) 1));
                    return;
                }
                return;
            default:
                gl.d3(new o2a((p3c) this.d, tL_error, this.c, tLObject, (byte[]) this.e, (String) this.b, (TL_account.passwordInputSettings) this.f));
                return;
        }
    }

    public pf2(qu2 qu2Var, ArrayList arrayList, ArrayList arrayList2, boolean z, String str) {
        this.a = (byte) 1;
        this.d = qu2Var;
        this.b = arrayList;
        this.e = arrayList2;
        this.c = z;
        this.f = str;
    }

    public pf2(xy6 xy6Var, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = (byte) 2;
        this.d = xy6Var;
        this.e = tL_chatInviteImporter;
        this.c = z;
        this.f = user;
        this.b = tL_messages_hideChatJoinRequest;
    }

    public pf2(z3a z3aVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, mu1 mu1Var, String str, boolean z) {
        this.a = (byte) 3;
        this.d = z3aVar;
        this.e = tL_messages_requestUrlAuth;
        this.b = mu1Var;
        this.f = str;
        this.c = z;
    }

    public pf2(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }
}
