package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sn;
public final class l2 implements Runnable {
    public final int f1753a = 0;
    public final boolean f1754b;
    public final boolean f1755c;
    public final Object d;
    public final Object e;
    public final Object f1756f;
    public final Object h;
    public final Object f1757n;

    public l2(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.e = tLObject;
        this.f1754b = z10;
        this.f1756f = document;
        this.f1755c = z11;
        this.h = tL_error;
        this.f1757n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f1753a) {
            case 0:
                k7.a1((k7) this.d, (TLObject) this.e, this.f1754b, (TLRPC.Document) this.f1756f, this.f1755c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f1757n);
                return;
            case 1:
                sn snVar = (sn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f1756f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1757n;
                if (str.startsWith("video?")) {
                    snVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f1754b && !this.f1755c) {
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
                Runnable runnable = (Runnable) this.f1756f;
                String str2 = (String) this.f1757n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f49875w = false;
                kVar.f49878z = true;
                if (this.f1754b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.f49870q, false, false);
                if (TextUtils.equals(str2, kVar.f49873t) && tL_error == null) {
                    kVar.f49878z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f1755c, false);
                    return;
                }
                return;
        }
    }

    public l2(sn snVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.d = snVar;
        this.e = str;
        this.f1756f = characterStyle;
        this.h = messageObject;
        this.f1757n = u1Var;
        this.f1754b = z10;
        this.f1755c = z11;
    }

    public l2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f1754b = z10;
        this.f1756f = runnable;
        this.f1757n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f1755c = z11;
    }
}
