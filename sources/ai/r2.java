package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sn;
public final class r2 implements Runnable {
    public final int f2102a = 0;
    public final boolean f2103b;
    public final boolean f2104c;
    public final Object d;
    public final Object e;
    public final Object f2105f;
    public final Object h;
    public final Object f2106n;

    public r2(l7 l7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = l7Var;
        this.e = tLObject;
        this.f2103b = z10;
        this.f2105f = document;
        this.f2104c = z11;
        this.h = tL_error;
        this.f2106n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f2102a) {
            case 0:
                l7.v0((l7) this.d, (TLObject) this.e, this.f2103b, (TLRPC.Document) this.f2105f, this.f2104c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f2106n);
                return;
            case 1:
                sn snVar = (sn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f2105f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f2106n;
                if (str.startsWith("video?")) {
                    snVar.X7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f2103b && !this.f2104c) {
                    snVar.getParentActivity();
                    pf.d.m(str);
                    return;
                } else {
                    snVar.O9(messageObject, false, false);
                    snVar.ea(characterStyle, str, false, t1Var, messageObject);
                    return;
                }
            default:
                xh.k kVar = (xh.k) this.d;
                Runnable runnable = (Runnable) this.f2105f;
                String str2 = (String) this.f2106n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f50325w = false;
                kVar.f50328z = true;
                if (this.f2103b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.f50320q, false, false);
                if (TextUtils.equals(str2, kVar.f50323t) && tL_error == null) {
                    kVar.f50328z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f2104c, false);
                    return;
                }
                return;
        }
    }

    public r2(sn snVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.d = snVar;
        this.e = str;
        this.f2105f = characterStyle;
        this.h = messageObject;
        this.f2106n = t1Var;
        this.f2103b = z10;
        this.f2104c = z11;
    }

    public r2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f2103b = z10;
        this.f2105f = runnable;
        this.f2106n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f2104c = z11;
    }
}
