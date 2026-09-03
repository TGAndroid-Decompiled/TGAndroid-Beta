package jh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.zn;
public final class k implements Runnable {
    public final int f9428a = 0;
    public final Object f9429b;
    public final boolean f9430c;
    public final boolean d;
    public final Object e;
    public final Object f9431f;
    public final Object h;
    public final Object f9432n;

    public k(v vVar, boolean z4, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f9431f = vVar;
        this.f9430c = z4;
        this.h = runnable;
        this.f9432n = str;
        this.e = tL_error;
        this.f9429b = tLObject;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f9428a) {
            case 0:
                v vVar = (v) this.f9431f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.f9432n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f9429b;
                vVar.f9478w = false;
                vVar.f9481z = true;
                if (this.f9430c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v.k(vVar.f9473q, false, false);
                if (TextUtils.equals(str, vVar.f9476t) && tL_error == null) {
                    vVar.f9481z = true;
                    vVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    return;
                }
                return;
            case 1:
                g5.z0((g5) this.f9431f, (TLObject) this.f9429b, this.f9430c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.e, (TL_stars.saveStarGift) this.f9432n);
                return;
            default:
                zn znVar = (zn) this.f9431f;
                String str2 = (String) this.f9432n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.e;
                s1 s1Var = (s1) this.f9429b;
                if (str2.startsWith("video?")) {
                    znVar.U7(characterStyle, false, messageObject, s1Var);
                    return;
                } else if (this.f9430c && !this.d) {
                    znVar.getParentActivity();
                    ze.d.n(str2);
                    return;
                } else {
                    znVar.J9(messageObject, false, false);
                    znVar.Z9(characterStyle, str2, false, s1Var, messageObject);
                    return;
                }
        }
    }

    public k(g5 g5Var, TLObject tLObject, boolean z4, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f9431f = g5Var;
        this.f9429b = tLObject;
        this.f9430c = z4;
        this.h = document;
        this.d = z10;
        this.e = tL_error;
        this.f9432n = savestargift;
    }

    public k(zn znVar, String str, CharacterStyle characterStyle, MessageObject messageObject, s1 s1Var, boolean z4, boolean z10) {
        this.f9431f = znVar;
        this.f9432n = str;
        this.h = characterStyle;
        this.e = messageObject;
        this.f9429b = s1Var;
        this.f9430c = z4;
        this.d = z10;
    }
}
