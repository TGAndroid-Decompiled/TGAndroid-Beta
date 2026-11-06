package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class q4 implements RequestDelegate {
    public final int f24661a = 0;
    public final Object f24662b;
    public final boolean f24663c;
    public final c1 d;
    public final Object f24664e;
    public final Object f24665f;

    public q4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z9, String str) {
        this.d = g5Var;
        this.f24664e = arrayList;
        this.f24665f = arrayList2;
        this.f24663c = z9;
        this.f24662b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f24661a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.f24664e;
                ArrayList arrayList2 = (ArrayList) this.f24665f;
                boolean z9 = this.f24663c;
                String str = (String) this.f24662b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f26688a.c(new sp(messagesStorage, arrayList, 0));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, 2));
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.Z.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.f21961g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.h3(new aa.d0(g5Var, arrayList2, z9, str, 11));
                    return;
                }
                return;
            case 1:
                g0.h3(new iy(0, (gz) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.f24664e, (org.telegram.ui.an) this.f24665f, (String) this.f24662b, this.f24663c));
                return;
            default:
                gz gzVar = (gz) this.d;
                boolean z10 = this.f24663c;
                ij ijVar = (ij) this.f24664e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f24665f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f24662b;
                if (tL_error == null) {
                    if (z10 && ijVar != null) {
                        ijVar.f23292y2 = true;
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
                g0.h3(new yq(18, gzVar, ijVar));
                if (f2Var != null) {
                    g0.h3(new uw(gzVar, tL_error, f2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public q4(ij ijVar, gz gzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this.d = gzVar;
        this.f24663c = z9;
        this.f24664e = ijVar;
        this.f24665f = tL_messages_editMessage;
        this.f24662b = f2Var;
    }

    public q4(gz gzVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.an anVar, String str, boolean z9) {
        this.d = gzVar;
        this.f24664e = tL_messages_requestUrlAuth;
        this.f24665f = anVar;
        this.f24662b = str;
        this.f24663c = z9;
    }
}
