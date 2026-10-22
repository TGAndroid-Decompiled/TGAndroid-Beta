package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qn;
public final class r2 implements Runnable {
    public final int f2097a = 0;
    public final boolean f2098b;
    public final boolean f2099c;
    public final Object d;
    public final Object e;
    public final Object f2100f;
    public final Object h;
    public final Object f2101n;

    public r2(l7 l7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = l7Var;
        this.e = tLObject;
        this.f2098b = z10;
        this.f2100f = document;
        this.f2099c = z11;
        this.h = tL_error;
        this.f2101n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f2097a) {
            case 0:
                l7.w0((l7) this.d, (TLObject) this.e, this.f2098b, (TLRPC.Document) this.f2100f, this.f2099c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f2101n);
                return;
            case 1:
                qn qnVar = (qn) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f2100f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f2101n;
                if (str.startsWith("video?")) {
                    qnVar.X7(characterStyle, false, messageObject, u1Var);
                    return;
                } else if (this.f2098b && !this.f2099c) {
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
                Runnable runnable = (Runnable) this.f2100f;
                String str2 = (String) this.f2101n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f49884w = false;
                kVar.f49887z = true;
                if (this.f2098b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xh.k.k(kVar.f49879q, false, false);
                if (TextUtils.equals(str2, kVar.f49882t) && tL_error == null) {
                    kVar.f49887z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f2099c, false);
                    return;
                }
                return;
        }
    }

    public r2(qn qnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11) {
        this.d = qnVar;
        this.e = str;
        this.f2100f = characterStyle;
        this.h = messageObject;
        this.f2101n = u1Var;
        this.f2098b = z10;
        this.f2099c = z11;
    }

    public r2(xh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f2098b = z10;
        this.f2100f = runnable;
        this.f2101n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f2099c = z11;
    }
}
