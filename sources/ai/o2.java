package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qn;
public final class o2 implements Runnable {
    public final int f1923a = 0;
    public final boolean f1924b;
    public final boolean f1925c;
    public final Object d;
    public final Object e;
    public final Object f1926f;
    public final Object h;
    public final Object f1927n;

    public o2(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.e = tLObject;
        this.f1924b = z10;
        this.f1926f = document;
        this.f1925c = z11;
        this.h = tL_error;
        this.f1927n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f1923a) {
            case 0:
                k7.d1((k7) this.d, (TLObject) this.e, this.f1924b, (TLRPC.Document) this.f1926f, this.f1925c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f1927n);
                return;
            case 1:
                qn qnVar = (qn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f1926f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1927n;
                if (str.startsWith("video?")) {
                    qnVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f1924b && !this.f1925c) {
                    qnVar.getParentActivity();
                    pf.d.m(str);
                    return;
                } else {
                    qnVar.O9(messageObject, false, false);
                    qnVar.ea(characterStyle, str, false, u1Var, messageObject);
                    return;
                }
            default:
                xh.k kVar = (xh.k) this.d;
                Runnable runnable = (Runnable) this.f1926f;
                String str2 = (String) this.f1927n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f49874w = false;
                kVar.f49877z = true;
                if (this.f1924b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.f49869q, false, false);
                if (TextUtils.equals(str2, kVar.f49872t) && tL_error == null) {
                    kVar.f49877z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f1925c, false);
                    return;
                }
                return;
        }
    }

    public o2(qn qnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.d = qnVar;
        this.e = str;
        this.f1926f = characterStyle;
        this.h = messageObject;
        this.f1927n = u1Var;
        this.f1924b = z10;
        this.f1925c = z11;
    }

    public o2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f1924b = z10;
        this.f1926f = runnable;
        this.f1927n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f1925c = z11;
    }
}
