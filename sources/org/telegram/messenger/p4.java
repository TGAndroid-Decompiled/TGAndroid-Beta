package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class p4 implements RequestDelegate {
    public final int f25891a = 1;
    public final Object f25892b;
    public final boolean f25893c;
    public final c1 d;
    public final Object f25894e;
    public final Object f25895f;

    public p4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = g5Var;
        this.f25894e = arrayList;
        this.f25895f = arrayList2;
        this.f25893c = z10;
        this.f25892b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f25891a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.f25894e;
                ArrayList arrayList2 = (ArrayList) this.f25895f;
                boolean z10 = this.f25893c;
                String str = (String) this.f25892b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    vr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f27220a.c(new pp(messagesStorage, arrayList, 0));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, 2));
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.f23670a0.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.f23036g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.h3(new aa.c0(g5Var, arrayList2, z10, str, 11));
                    return;
                }
                return;
            case 1:
                g0.h3(new ey(0, (ez) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.f25894e, (org.telegram.ui.an) this.f25895f, (String) this.f25892b, this.f25893c));
                return;
            default:
                ez ezVar = (ez) this.d;
                boolean z11 = this.f25893c;
                gj gjVar = (gj) this.f25894e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f25895f;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f25892b;
                if (tL_error == null) {
                    if (z11 && gjVar != null) {
                        gjVar.A2 = true;
                    }
                    ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new as(ezVar, gjVar));
                    return;
                }
                if (r8.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    in inVar = new in(gjVar, ezVar, tL_messages_editMessage, e2Var, z11);
                    ezVar = ezVar;
                    if (gjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c10 = r8.c(str2);
                            ezVar.getFileRefController().u(new Object[]{arrayList3.get((c10 < 0 || c10 >= arrayList3.size()) ? 0 : 0), inVar}, gjVar);
                            return;
                        }
                    }
                }
                g0.h3(new wq(18, ezVar, gjVar));
                if (e2Var != null) {
                    g0.h3(new rw(ezVar, tL_error, e2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public p4(gj gjVar, ez ezVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        this.d = ezVar;
        this.f25893c = z10;
        this.f25894e = gjVar;
        this.f25895f = tL_messages_editMessage;
        this.f25892b = e2Var;
    }

    public p4(ez ezVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.an anVar, String str, boolean z10) {
        this.d = ezVar;
        this.f25894e = tL_messages_requestUrlAuth;
        this.f25895f = anVar;
        this.f25892b = str;
        this.f25893c = z10;
    }
}
