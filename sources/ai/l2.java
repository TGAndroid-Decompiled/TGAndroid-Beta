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
    public final int f1758a = 0;
    public final boolean f1759b;
    public final boolean f1760c;
    public final Object d;
    public final Object e;
    public final Object f1761f;
    public final Object h;
    public final Object f1762n;

    public l2(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.e = tLObject;
        this.f1759b = z10;
        this.f1761f = document;
        this.f1760c = z11;
        this.h = tL_error;
        this.f1762n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f1758a) {
            case 0:
                k7.Z0((k7) this.d, (TLObject) this.e, this.f1759b, (TLRPC.Document) this.f1761f, this.f1760c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f1762n);
                return;
            case 1:
                sn snVar = (sn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f1761f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1762n;
                if (str.startsWith("video?")) {
                    snVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f1759b && !this.f1760c) {
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
                Runnable runnable = (Runnable) this.f1761f;
                String str2 = (String) this.f1762n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f49897w = false;
                kVar.f49900z = true;
                if (this.f1759b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.f49892q, false, false);
                if (TextUtils.equals(str2, kVar.f49895t) && tL_error == null) {
                    kVar.f49900z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f1760c, false);
                    return;
                }
                return;
        }
    }

    public l2(sn snVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.d = snVar;
        this.e = str;
        this.f1761f = characterStyle;
        this.h = messageObject;
        this.f1762n = u1Var;
        this.f1759b = z10;
        this.f1760c = z11;
    }

    public l2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f1759b = z10;
        this.f1761f = runnable;
        this.f1762n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f1760c = z11;
    }
}
