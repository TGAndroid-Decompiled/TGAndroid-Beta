package fh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import hh.i5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.rn;

public final class k implements Runnable {

    public final int f6137a = 0;

    public final Object f6138b;

    public final boolean f6139c;
    public final boolean d;

    public final Object f6140e;

    public final Object f6141f;
    public final Object h;

    public final Object f6142n;

    public k(v vVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.f6141f = vVar;
        this.f6139c = z10;
        this.h = runnable;
        this.f6142n = str;
        this.f6140e = tL_error;
        this.f6138b = tLObject;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f6137a) {
            case 0:
                v vVar = (v) this.f6141f;
                Runnable runnable = (Runnable) this.h;
                String str = (String) this.f6142n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6140e;
                TLObject tLObject = (TLObject) this.f6138b;
                vVar.f6192w = false;
                vVar.f6195z = true;
                if (this.f6139c) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v.k(vVar.f6187q, false, false);
                if (TextUtils.equals(str, vVar.f6190t) && tL_error == null) {
                    vVar.f6195z = true;
                    vVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, this.d, false);
                }
                break;
            case 1:
                i5.z0((i5) this.f6141f, (TLObject) this.f6138b, this.f6139c, (TLRPC.Document) this.h, this.d, (TLRPC.TL_error) this.f6140e, (TL_stars.saveStarGift) this.f6142n);
                break;
            default:
                rn rnVar = (rn) this.f6141f;
                String str2 = (String) this.f6142n;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                MessageObject messageObject = (MessageObject) this.f6140e;
                s1 s1Var = (s1) this.f6138b;
                if (str2.startsWith("video?")) {
                    rnVar.U7(characterStyle, false, messageObject, s1Var);
                } else if (this.f6139c && !this.d) {
                    rnVar.getParentActivity();
                    we.e.n(str2);
                } else {
                    rnVar.J9(messageObject, false, false);
                    rnVar.Z9(characterStyle, str2, false, s1Var, messageObject);
                }
                break;
        }
    }

    public k(i5 i5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f6141f = i5Var;
        this.f6138b = tLObject;
        this.f6139c = z10;
        this.h = document;
        this.d = z11;
        this.f6140e = tL_error;
        this.f6142n = savestargift;
    }

    public k(rn rnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, s1 s1Var, boolean z10, boolean z11) {
        this.f6141f = rnVar;
        this.f6142n = str;
        this.h = characterStyle;
        this.f6140e = messageObject;
        this.f6138b = s1Var;
        this.f6139c = z10;
        this.d = z11;
    }
}
