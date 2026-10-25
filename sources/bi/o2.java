package bi;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.un;
public final class o2 implements Runnable {
    public final int f5162a = 0;
    public final boolean f5163b;
    public final boolean f5164c;
    public final Object d;
    public final Object e;
    public final Object f5165f;
    public final Object h;
    public final Object f5166n;

    public o2(h7 h7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = h7Var;
        this.e = tLObject;
        this.f5163b = z10;
        this.f5165f = document;
        this.f5164c = z11;
        this.h = tL_error;
        this.f5166n = savestargift;
    }

    @Override
    public final void run() {
        switch (this.f5162a) {
            case 0:
                h7.v0((h7) this.d, (TLObject) this.e, this.f5163b, (TLRPC.Document) this.f5165f, this.f5164c, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f5166n);
                return;
            case 1:
                un unVar = (un) this.d;
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f5165f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f5166n;
                if (str.startsWith("video?")) {
                    unVar.b8(characterStyle, false, messageObject, s1Var);
                    return;
                } else if (this.f5163b && !this.f5164c) {
                    unVar.getParentActivity();
                    qf.d.m(str);
                    return;
                } else {
                    unVar.T9(messageObject, false, false);
                    unVar.ja(characterStyle, str, false, s1Var, messageObject);
                    return;
                }
            default:
                yh.k kVar = (yh.k) this.d;
                Runnable runnable = (Runnable) this.f5165f;
                String str2 = (String) this.f5166n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.e;
                kVar.f52625w = false;
                kVar.f52628z = true;
                if (this.f5163b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                yh.k.k(kVar.f52620q, false, false);
                if (TextUtils.equals(str2, kVar.f52623t) && tL_error == null) {
                    kVar.f52628z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.f5164c, false);
                    return;
                }
                return;
        }
    }

    public o2(un unVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
        this.d = unVar;
        this.e = str;
        this.f5165f = characterStyle;
        this.h = messageObject;
        this.f5166n = s1Var;
        this.f5163b = z10;
        this.f5164c = z11;
    }

    public o2(yh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.f5163b = z10;
        this.f5165f = runnable;
        this.f5166n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.f5164c = z11;
    }
}
