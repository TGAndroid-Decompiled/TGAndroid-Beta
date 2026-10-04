package ii;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.oy;
public final class p implements oy {
    public final r f12561a;

    public p(r rVar) {
        this.f12561a = rVar;
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
        r rVar = this.f12561a;
        if (i10 != 0 && (focusedEditTextOrNull = rVar.f12602r.getFocusedEditTextOrNull()) != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        rVar.f12606y = z10;
        rVar.Q();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        i1 K = r.K(this.f12561a);
        if (K == null || K.length() == 0) {
            return false;
        }
        K.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        r rVar = this.f12561a;
        i1 K = r.K(rVar);
        if (K != null) {
            int L = r.L(rVar, K);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, K.getPaint().getFontMetricsInt(), false, (int[]) null);
                K.setText(K.getText().insert(L, replaceEmoji));
                int length = L + replaceEmoji.length();
                K.setSelection(length, length);
                if (K == rVar.F) {
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
        org.telegram.ui.Components.z5 z5Var;
        r rVar = this.f12561a;
        i1 K = r.K(rVar);
        if (K != null) {
            int L = r.L(rVar, K);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    z5Var = new org.telegram.ui.Components.z5(document, K.getPaint().getFontMetricsInt());
                } else {
                    z5Var = new org.telegram.ui.Components.z5(j3, K.getPaint().getFontMetricsInt());
                }
                z5Var.cacheType = org.telegram.ui.Components.q5.g();
                spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                K.setText(K.getText().insert(L, spannableString));
                int length = L + spannableString.length();
                K.setSelection(length, length);
                if (K == rVar.F) {
                    rVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f12561a.f12606y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(c61 c61Var) {
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
