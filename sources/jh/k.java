package jh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.xn;
public final class k implements Runnable {
    public final int f9447a = 0;
    public final Object f9448b;
    public final boolean f9449c;
    public final boolean d;
    public final Object e;
    public final Object f9450f;
    public final Object h;
    public final Object f9451n;

    public k(v vVar, boolean z4, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f9450f = vVar;
        this.f9449c = z4;
        this.h = runnable;
        this.f9451n = str;
        this.e = tL_error;
        this.f9448b = tLObject;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f9447a) {
            case 0:
                v vVar = (v) this.f9450f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.f9451n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f9448b;
                vVar.f9497w = false;
                vVar.f9500z = true;
                if (this.f9449c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v.k(vVar.f9492q, false, false);
                if (TextUtils.equals(str, vVar.f9495t) && tL_error == null) {
                    vVar.f9500z = true;
                    vVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    return;
                }
                return;
            case 1:
                g5.z0((g5) this.f9450f, (TLObject) this.f9448b, this.f9449c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.e, (TL_stars.saveStarGift) this.f9451n);
                return;
            default:
                xn xnVar = (xn) this.f9450f;
                String str2 = (String) this.f9451n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.e;
                t1 t1Var = (t1) this.f9448b;
                if (str2.startsWith("video?")) {
                    xnVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f9449c && !this.d) {
                    xnVar.getParentActivity();
                    af.g.n(str2);
                    return;
                } else {
                    xnVar.J9(messageObject, false, false);
                    xnVar.Z9(characterStyle, str2, false, t1Var, messageObject);
                    return;
                }
        }
    }

    public k(g5 g5Var, TLObject tLObject, boolean z4, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f9450f = g5Var;
        this.f9448b = tLObject;
        this.f9449c = z4;
        this.h = document;
        this.d = z10;
        this.e = tL_error;
        this.f9451n = savestargift;
    }

    public k(xn xnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, t1 t1Var, boolean z4, boolean z10) {
        this.f9450f = xnVar;
        this.f9451n = str;
        this.h = characterStyle;
        this.e = messageObject;
        this.f9448b = t1Var;
        this.f9449c = z4;
        this.d = z10;
    }
}
