package eh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import gh.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.qn;
public final class m implements Runnable {
    public final int f5210a = 0;
    public final Object f5211b;
    public final boolean f5212c;
    public final boolean d;
    public final Object f5213e;
    public final Object f5214f;
    public final Object h;
    public final Object f5215n;

    public m(x xVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f5214f = xVar;
        this.f5212c = z10;
        this.h = runnable;
        this.f5215n = str;
        this.f5213e = tL_error;
        this.f5211b = tLObject;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f5210a) {
            case 0:
                x xVar = (x) this.f5214f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.f5215n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f5213e;
                TLObject tLObject = (TLObject) this.f5211b;
                xVar.f5265w = false;
                xVar.f5268z = true;
                if (this.f5212c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                x.k(xVar.f5260q, false, false);
                if (TextUtils.equals(str, xVar.f5263t) && tL_error == null) {
                    xVar.f5268z = true;
                    xVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                    return;
                }
                return;
            case 1:
                k5.y0((k5) this.f5214f, (TLObject) this.f5211b, this.f5212c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.f5213e, (TL_stars.saveStarGift) this.f5215n);
                return;
            default:
                qn qnVar = (qn) this.f5214f;
                String str2 = (String) this.f5215n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.f5213e;
                t1 t1Var = (t1) this.f5211b;
                if (str2.startsWith("video?")) {
                    qnVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f5212c && !this.d) {
                    qnVar.getParentActivity();
                    ve.e.n(str2);
                    return;
                } else {
                    qnVar.J9(messageObject, false, false);
                    qnVar.Z9(characterStyle, str2, false, t1Var, messageObject);
                    return;
                }
        }
    }

    public m(k5 k5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f5214f = k5Var;
        this.f5211b = tLObject;
        this.f5212c = z10;
        this.h = document;
        this.d = z11;
        this.f5213e = tL_error;
        this.f5215n = savestargift;
    }

    public m(qn qnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, t1 t1Var, boolean z10, boolean z11) {
        this.f5214f = qnVar;
        this.f5215n = str;
        this.h = characterStyle;
        this.f5213e = messageObject;
        this.f5211b = t1Var;
        this.f5212c = z10;
        this.d = z11;
    }
}
