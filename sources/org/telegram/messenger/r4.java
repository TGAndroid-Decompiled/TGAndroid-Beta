package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class r4 implements RequestDelegate {
    public final int f26524a = 1;
    public final Object f26525b;
    public final boolean f26526c;
    public final c1 d;
    public final Object f26527e;
    public final Object f26528f;

    public r4(i5 i5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = i5Var;
        this.f26527e = arrayList;
        this.f26528f = arrayList2;
        this.f26526c = z10;
        this.f26525b = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.f26524a) {
            case 0:
                i5 i5Var = (i5) this.d;
                ArrayList arrayList = (ArrayList) this.f26527e;
                ArrayList arrayList2 = (ArrayList) this.f26528f;
                boolean z10 = this.f26526c;
                String str = (String) this.f26525b;
                if (tL_error == null) {
                    i5Var.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    ur messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.f27214a.c(new rp(messagesStorage, arrayList, 21));
                    }
                    Utilities.h.c(new y4(i5Var, arrayList2, 2));
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i7);
                        if (!TextUtils.isEmpty(user.phone)) {
                            i5Var.getMessagesStorage().f(user.phone, "");
                            f5 f5Var = (f5) i5Var.f24560a0.get(user.phone);
                            if (f5Var != null && (indexOf = f5Var.f23829g.indexOf(user.phone)) != -1) {
                                f5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.g3(new aa.c0(i5Var, arrayList2, z10, str, 11));
                    return;
                }
                return;
            case 1:
                g0.g3(new zx(0, (az) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.f26527e, (org.telegram.ui.bn) this.f26528f, (String) this.f26525b, this.f26526c));
                return;
            default:
                az azVar = (az) this.d;
                boolean z11 = this.f26526c;
                gj gjVar = (gj) this.f26527e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f26528f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26525b;
                if (tL_error == null) {
                    if (z11 && gjVar != null) {
                        gjVar.A2 = true;
                    }
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new yr(azVar, gjVar));
                    return;
                }
                if (r8.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    jn jnVar = new jn(gjVar, azVar, tL_messages_editMessage, g2Var, z11);
                    azVar = azVar;
                    if (gjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c10 = r8.c(str2);
                            azVar.getFileRefController().u(new Object[]{arrayList3.get((c10 < 0 || c10 >= arrayList3.size()) ? 0 : 0), jnVar}, gjVar);
                            return;
                        }
                    }
                }
                g0.g3(new sq(20, azVar, gjVar));
                if (g2Var != null) {
                    g0.g3(new nw(azVar, tL_error, g2Var, tL_messages_editMessage, 1));
                    return;
                }
                return;
        }
    }

    public r4(gj gjVar, az azVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        this.d = azVar;
        this.f26526c = z10;
        this.f26527e = gjVar;
        this.f26528f = tL_messages_editMessage;
        this.f26525b = g2Var;
    }

    public r4(az azVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.bn bnVar, String str, boolean z10) {
        this.d = azVar;
        this.f26527e = tL_messages_requestUrlAuth;
        this.f26528f = bnVar;
        this.f26525b = str;
        this.f26526c = z10;
    }
}
