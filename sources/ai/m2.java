package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sn;
public final class m2 implements Runnable {
    public final int f1805a = 0;
    public final boolean f1806b;
    public final boolean f1807c;
    public final Object d;
    public final Object e;
    public final Object f1808f;
    public final Object h;
    public final Object f1809n;

    public m2(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.e = tLObject;
        this.f1806b = z10;
        this.f1808f = document;
        this.f1807c = z11;
        this.h = tL_error;
        this.f1809n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f1805a) {
            case 0:
                k7.c1((k7) this.d, (TLObject) this.e, this.f1806b, (TLRPC.Document) this.f1808f, this.f1807c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f1809n);
                return;
            case 1:
                sn snVar = (sn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f1808f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1809n;
                if (str.startsWith("video?")) {
                    snVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f1806b && !this.f1807c) {
                    snVar.getParentActivity();
                    pf.d.m(str);
                    return;
                } else {
                    snVar.O9(messageObject, false, false);
                    snVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            default:
                xh.k kVar = (xh.k) this.d;
                Runnable runnable = (Runnable) this.f1808f;
                String str2 = (String) this.f1809n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f49922w = false;
                kVar.f49925z = true;
                if (this.f1806b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.f49917q, false, false);
                if (TextUtils.equals(str2, kVar.f49920t) && tL_error == null) {
                    kVar.f49925z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f1807c, false);
                    return;
                }
                return;
        }
    }

    public m2(sn snVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.d = snVar;
        this.e = str;
        this.f1808f = characterStyle;
        this.h = messageObject;
        this.f1809n = u1Var;
        this.f1806b = z10;
        this.f1807c = z11;
    }

    public m2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f1806b = z10;
        this.f1808f = runnable;
        this.f1809n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f1807c = z11;
    }
}
