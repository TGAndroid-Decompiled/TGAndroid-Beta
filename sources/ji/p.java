package ji;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ly;
public final class p implements ly {
    public final r f14104a;

    public p(r rVar) {
        this.f14104a = rVar;
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
        h1 focusedEditTextOrNull;
        boolean z10 = false;
        r rVar = this.f14104a;
        if (i10 != 0 && (focusedEditTextOrNull = rVar.f14133r.getFocusedEditTextOrNull()) != null) {
            rVar.F = focusedEditTextOrNull;
            rVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        rVar.f14137y = z10;
        rVar.S();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        h1 M = r.M(this.f14104a);
        if (M == null || M.length() == 0) {
            return false;
        }
        M.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        r rVar = this.f14104a;
        h1 M = r.M(rVar);
        if (M != null) {
            int N = r.N(rVar, M);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, M.getPaint().getFontMetricsInt(), false, (int[]) null);
                M.setText(M.getText().insert(N, replaceEmoji));
                int length = N + replaceEmoji.length();
                M.setSelection(length, length);
                if (M == rVar.F) {
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
        r rVar = this.f14104a;
        h1 M = r.M(rVar);
        if (M != null) {
            int N = r.N(rVar, M);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    z5Var = new org.telegram.ui.Components.z5(document, M.getPaint().getFontMetricsInt());
                } else {
                    z5Var = new org.telegram.ui.Components.z5(j3, M.getPaint().getFontMetricsInt());
                }
                z5Var.cacheType = org.telegram.ui.Components.q5.g();
                spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                M.setText(M.getText().insert(N, spannableString));
                int length = N + spannableString.length();
                M.setSelection(length, length);
                if (M == rVar.F) {
                    rVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f14104a.f14137y;
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
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(d51 d51Var) {
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
