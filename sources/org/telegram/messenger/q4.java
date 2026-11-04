package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class q4 implements RequestDelegate {
    public final int f24851a = 0;
    public final Object f24852b;
    public final boolean f24853c;
    public final c1 d;
    public final Object f24854e;
    public final Object f24855f;

    public q4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = g5Var;
        this.f24854e = arrayList;
        this.f24855f = arrayList2;
        this.f24853c = z10;
        this.f24852b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f24851a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.f24854e;
                ArrayList arrayList2 = (ArrayList) this.f24855f;
                boolean z10 = this.f24853c;
                String str = (String) this.f24852b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    qr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f24934a.c(new jp(messagesStorage, arrayList, 0));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, 2));
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i3);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.f22644a0.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.f22152g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.h3(new ci.u8(g5Var, arrayList2, z10, str, 11));
                    return;
                }
                return;
            case 1:
                g0.h3(new zx(0, (yy) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.f24854e, (org.telegram.ui.wm) this.f24855f, (String) this.f24852b, this.f24853c));
                return;
            default:
                yy yyVar = (yy) this.d;
                boolean z11 = this.f24853c;
                zi ziVar = (zi) this.f24854e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f24855f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24852b;
                if (tL_error == null) {
                    if (z11 && ziVar != null) {
                        ziVar.f26923y2 = true;
                    }
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vs(yyVar, ziVar));
                    return;
                }
                if (r8.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    bn bnVar = new bn(ziVar, yyVar, tL_messages_editMessage, d2Var, z11);
                    yyVar = yyVar;
                    if (ziVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c2 = r8.c(str2);
                            yyVar.getFileRefController().u(new Object[]{arrayList3.get((c2 < 0 || c2 >= arrayList3.size()) ? 0 : 0), bnVar}, ziVar);
                            return;
                        }
                    }
                }
                g0.h3(new pq(18, yyVar, ziVar));
                if (d2Var != null) {
                    g0.h3(new mw(yyVar, tL_error, d2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public q4(zi ziVar, yy yyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        this.d = yyVar;
        this.f24853c = z10;
        this.f24854e = ziVar;
        this.f24855f = tL_messages_editMessage;
        this.f24852b = d2Var;
    }

    public q4(yy yyVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.wm wmVar, String str, boolean z10) {
        this.d = yyVar;
        this.f24854e = tL_messages_requestUrlAuth;
        this.f24855f = wmVar;
        this.f24852b = str;
        this.f24853c = z10;
    }
}
