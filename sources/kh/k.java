package kh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.xn;
public final class k implements Runnable {
    public final int f11268a = 0;
    public final Object f11269b;
    public final boolean f11270c;
    public final boolean d;
    public final Object f11271e;
    public final Object f11272f;
    public final Object h;
    public final Object f11273n;

    public k(v vVar, boolean z4, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f11272f = vVar;
        this.f11270c = z4;
        this.h = runnable;
        this.f11273n = str;
        this.f11271e = tL_error;
        this.f11269b = tLObject;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f11268a) {
            case 0:
                v vVar = (v) this.f11272f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.f11273n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f11271e;
                TLObject tLObject = (TLObject) this.f11269b;
                vVar.f11323w = false;
                vVar.f11326z = true;
                if (this.f11270c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v.k(vVar.f11318q, false, false);
                if (TextUtils.equals(str, vVar.f11321t) && tL_error == null) {
                    vVar.f11326z = true;
                    vVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    return;
                }
                return;
            case 1:
                g5.z0((g5) this.f11272f, (TLObject) this.f11269b, this.f11270c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.f11271e, (TL_stars.saveStarGift) this.f11273n);
                return;
            default:
                xn xnVar = (xn) this.f11272f;
                String str2 = (String) this.f11273n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.f11271e;
                t1 t1Var = (t1) this.f11269b;
                if (str2.startsWith("video?")) {
                    xnVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f11270c && !this.d) {
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
        this.f11272f = g5Var;
        this.f11269b = tLObject;
        this.f11270c = z4;
        this.h = document;
        this.d = z10;
        this.f11271e = tL_error;
        this.f11273n = savestargift;
    }

    public k(xn xnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, t1 t1Var, boolean z4, boolean z10) {
        this.f11272f = xnVar;
        this.f11273n = str;
        this.h = characterStyle;
        this.f11271e = messageObject;
        this.f11269b = t1Var;
        this.f11270c = z4;
        this.d = z10;
    }
}
