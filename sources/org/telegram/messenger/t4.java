package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class t4 implements RequestDelegate {
    public final int f18006a = 0;
    public final Object f18007b;
    public final boolean f18008c;
    public final f1 d;
    public final Object e;
    public final Object f18009f;

    public t4(i5 i5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = i5Var;
        this.e = arrayList;
        this.f18009f = arrayList2;
        this.f18008c = z10;
        this.f18007b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f18006a) {
            case 0:
                i5 i5Var = (i5) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = (ArrayList) this.f18009f;
                boolean z10 = this.f18008c;
                String str = (String) this.f18007b;
                if (tL_error == null) {
                    i5Var.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    hs messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f15938a.c(new xp(messagesStorage, arrayList, 0));
                    }
                    Utilities.h.c(new z4(i5Var, arrayList2, 2));
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                        if (!TextUtils.isEmpty(user.phone)) {
                            i5Var.getMessagesStorage().f(user.phone, "");
                            f5 f5Var = (f5) i5Var.Z.get(user.phone);
                            if (f5Var != null && (indexOf = f5Var.f15512g.indexOf(user.phone)) != -1) {
                                f5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    i0.g3(new bi.n4(i5Var, arrayList2, z10, str, 9));
                    return;
                }
                return;
            case 1:
                i0.g3(new sy((qz) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (org.telegram.ui.un) this.f18009f, (String) this.f18007b, this.f18008c, 0));
                return;
            default:
                qz qzVar = (qz) this.d;
                boolean z11 = this.f18008c;
                jj jjVar = (jj) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f18009f;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f18007b;
                if (tL_error == null) {
                    if (z11 && jjVar != null) {
                        jjVar.f16393y2 = true;
                    }
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ms(qzVar, jjVar));
                    return;
                }
                if (w8.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    rn rnVar = new rn(jjVar, qzVar, tL_messages_editMessage, k2Var, z11);
                    qzVar = qzVar;
                    if (jjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c10 = w8.c(str2);
                            qzVar.getFileRefController().u(new Object[]{arrayList3.get((c10 < 0 || c10 >= arrayList3.size()) ? 0 : 0), rnVar}, jjVar);
                            return;
                        }
                    }
                }
                i0.g3(new hr(16, qzVar, jjVar));
                if (k2Var != null) {
                    i0.g3(new fx(qzVar, tL_error, k2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public t4(jj jjVar, qz qzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.d = qzVar;
        this.f18008c = z10;
        this.e = jjVar;
        this.f18009f = tL_messages_editMessage;
        this.f18007b = k2Var;
    }

    public t4(qz qzVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.un unVar, String str, boolean z10) {
        this.d = qzVar;
        this.e = tL_messages_requestUrlAuth;
        this.f18009f = unVar;
        this.f18007b = str;
        this.f18008c = z10;
    }
}
