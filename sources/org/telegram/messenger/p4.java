package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class p4 implements RequestDelegate {
    public final int f24512a = 0;
    public final Object f24513b;
    public final boolean f24514c;
    public final c1 d;
    public final Object f24515e;
    public final Object f24516f;

    public p4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z9, String str) {
        this.d = g5Var;
        this.f24515e = arrayList;
        this.f24516f = arrayList2;
        this.f24514c = z9;
        this.f24513b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f24512a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.f24515e;
                ArrayList arrayList2 = (ArrayList) this.f24516f;
                boolean z9 = this.f24514c;
                String str = (String) this.f24513b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f26719a.c(new sp(messagesStorage, arrayList, 0));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, 2));
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.Z.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.f21991g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.h3(new aa.d0(g5Var, arrayList2, z9, str, 11));
                    return;
                }
                return;
            case 1:
                g0.h3(new gy(0, (gz) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.f24515e, (org.telegram.ui.cn) this.f24516f, (String) this.f24513b, this.f24514c));
                return;
            default:
                gz gzVar = (gz) this.d;
                boolean z10 = this.f24514c;
                ij ijVar = (ij) this.f24515e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f24516f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f24513b;
                if (tL_error == null) {
                    if (z10 && ijVar != null) {
                        ijVar.f23317y2 = true;
                    }
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new ds(gzVar, ijVar));
                    return;
                }
                if (r8.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    ln lnVar = new ln(ijVar, gzVar, tL_messages_editMessage, f2Var, z10);
                    gzVar = gzVar;
                    if (ijVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c10 = r8.c(str2);
                            gzVar.getFileRefController().u(new Object[]{arrayList3.get((c10 < 0 || c10 >= arrayList3.size()) ? 0 : 0), lnVar}, ijVar);
                            return;
                        }
                    }
                }
                g0.h3(new zq(18, gzVar, ijVar));
                if (f2Var != null) {
                    g0.h3(new tw(gzVar, tL_error, f2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public p4(ij ijVar, gz gzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this.d = gzVar;
        this.f24514c = z9;
        this.f24515e = ijVar;
        this.f24516f = tL_messages_editMessage;
        this.f24513b = f2Var;
    }

    public p4(gz gzVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.cn cnVar, String str, boolean z9) {
        this.d = gzVar;
        this.f24515e = tL_messages_requestUrlAuth;
        this.f24516f = cnVar;
        this.f24513b = str;
        this.f24514c = z9;
    }
}
