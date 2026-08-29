package hh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.tn;
public final class k implements Runnable {
    public final int f8084a = 0;
    public final Object f8085b;
    public final boolean f8086c;
    public final boolean d;
    public final Object f8087e;
    public final Object f8088f;
    public final Object h;
    public final Object f8089n;

    public k(v vVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f8088f = vVar;
        this.f8086c = z10;
        this.h = runnable;
        this.f8089n = str;
        this.f8087e = tL_error;
        this.f8085b = tLObject;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f8084a) {
            case 0:
                v vVar = (v) this.f8088f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.f8089n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f8087e;
                TLObject tLObject = (TLObject) this.f8085b;
                vVar.f8139w = false;
                vVar.f8142z = true;
                if (this.f8086c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v.k(vVar.f8134q, false, false);
                if (TextUtils.equals(str, vVar.f8137t) && tL_error == null) {
                    vVar.f8142z = true;
                    vVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    return;
                }
                return;
            case 1:
                h5.z0((h5) this.f8088f, (TLObject) this.f8085b, this.f8086c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.f8087e, (TL_stars.saveStarGift) this.f8089n);
                return;
            default:
                tn tnVar = (tn) this.f8088f;
                String str2 = (String) this.f8089n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.f8087e;
                s1 s1Var = (s1) this.f8085b;
                if (str2.startsWith("video?")) {
                    tnVar.U7(characterStyle, false, messageObject, s1Var);
                    return;
                } else if (this.f8086c && !this.d) {
                    tnVar.getParentActivity();
                    ye.d.n(str2);
                    return;
                } else {
                    tnVar.J9(messageObject, false, false);
                    tnVar.Z9(characterStyle, str2, false, s1Var, messageObject);
                    return;
                }
        }
    }

    public k(h5 h5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f8088f = h5Var;
        this.f8085b = tLObject;
        this.f8086c = z10;
        this.h = document;
        this.d = z11;
        this.f8087e = tL_error;
        this.f8089n = savestargift;
    }

    public k(tn tnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, s1 s1Var, boolean z10, boolean z11) {
        this.f8088f = tnVar;
        this.f8089n = str;
        this.h = characterStyle;
        this.f8087e = messageObject;
        this.f8085b = s1Var;
        this.f8086c = z10;
        this.d = z11;
    }
}
