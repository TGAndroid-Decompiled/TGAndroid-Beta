package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class r4 implements RequestDelegate {
    public final int f26538a = 2;
    public final Object f26539b;
    public final boolean f26540c;
    public final c1 d;
    public final Object f26541e;
    public final Object f26542f;

    public r4(i5 i5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = i5Var;
        this.f26541e = arrayList;
        this.f26542f = arrayList2;
        this.f26540c = z10;
        this.f26539b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f26538a) {
            case 0:
                i5 i5Var = (i5) this.d;
                ArrayList arrayList = (ArrayList) this.f26541e;
                ArrayList arrayList2 = (ArrayList) this.f26542f;
                boolean z10 = this.f26540c;
                String str = (String) this.f26539b;
                if (tL_error == null) {
                    i5Var.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f27052a.c(new qp(messagesStorage, arrayList, 21));
                    }
                    Utilities.h.c(new y4(i5Var, arrayList2, 2));
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
                        if (!TextUtils.isEmpty(user.phone)) {
                            i5Var.getMessagesStorage().f(user.phone, "");
                            f5 f5Var = (f5) i5Var.f24558a0.get(user.phone);
                            if (f5Var != null && (indexOf = f5Var.f23842g.indexOf(user.phone)) != -1) {
                                f5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.g3(new aa.c0(i5Var, arrayList2, z10, str, 11));
                    return;
                }
                return;
            case 1:
                g0.g3(new yx(0, (zy) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.f26541e, (org.telegram.ui.bn) this.f26542f, (String) this.f26539b, this.f26540c));
                return;
            default:
                zy zyVar = (zy) this.d;
                boolean z11 = this.f26540c;
                fj fjVar = (fj) this.f26541e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f26542f;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f26539b;
                if (tL_error == null) {
                    if (z11 && fjVar != null) {
                        fjVar.A2 = true;
                    }
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new xr(zyVar, fjVar));
                    return;
                }
                if (r8.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    in inVar = new in(fjVar, zyVar, tL_messages_editMessage, h2Var, z11);
                    zyVar = zyVar;
                    if (fjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c10 = r8.c(str2);
                            zyVar.getFileRefController().u(new Object[]{arrayList3.get((c10 < 0 || c10 >= arrayList3.size()) ? 0 : 0), inVar}, fjVar);
                            return;
                        }
                    }
                }
                g0.g3(new rq(20, zyVar, fjVar));
                if (h2Var != null) {
                    g0.g3(new mw(zyVar, tL_error, h2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public r4(fj fjVar, zy zyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        this.d = zyVar;
        this.f26540c = z10;
        this.f26541e = fjVar;
        this.f26542f = tL_messages_editMessage;
        this.f26539b = h2Var;
    }

    public r4(zy zyVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.bn bnVar, String str, boolean z10) {
        this.d = zyVar;
        this.f26541e = tL_messages_requestUrlAuth;
        this.f26542f = bnVar;
        this.f26539b = str;
        this.f26540c = z10;
    }
}
