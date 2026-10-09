package ii;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.l61;
public final class p implements az {
    public final r f12609a;

    public p(r rVar) {
        this.f12609a = rVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(int i10) {
        i1 focusedEditTextOrNull;
        boolean z10 = false;
        r rVar = this.f12609a;
        if (i10 != 0 && (focusedEditTextOrNull = rVar.f12650r.getFocusedEditTextOrNull()) != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        rVar.f12654y = z10;
        rVar.V();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        i1 P = r.P(this.f12609a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        r rVar = this.f12609a;
        i1 P = r.P(rVar);
        if (P != null) {
            int Q = r.Q(rVar, P);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, P.getPaint().getFontMetricsInt(), false, (int[]) null);
                P.setText(P.getText().insert(Q, replaceEmoji));
                int length = Q + replaceEmoji.length();
                P.setSelection(length, length);
                if (P == rVar.F) {
                    rVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.b6 b6Var;
        r rVar = this.f12609a;
        i1 P = r.P(rVar);
        if (P != null) {
            int Q = r.Q(rVar, P);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    b6Var = new org.telegram.ui.Components.b6(document, P.getPaint().getFontMetricsInt());
                } else {
                    b6Var = new org.telegram.ui.Components.b6(j3, P.getPaint().getFontMetricsInt());
                }
                b6Var.cacheType = org.telegram.ui.Components.s5.g();
                spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                P.setText(P.getText().insert(Q, spannableString));
                int length = Q + spannableString.length();
                P.setSelection(length, length);
                if (P == rVar.F) {
                    rVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f12609a.f12654y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(l61 l61Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j3) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
