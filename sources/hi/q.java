package hi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.sy;
public final class q implements sy {
    public final s f9792a;

    public q(s sVar) {
        this.f9792a = sVar;
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
        k1 focusedEditTextOrNull;
        boolean z10 = false;
        s sVar = this.f9792a;
        if (i10 != 0 && (focusedEditTextOrNull = sVar.f9835r.getFocusedEditTextOrNull()) != null) {
            sVar.F = focusedEditTextOrNull;
            sVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        sVar.f9839y = z10;
        sVar.S();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        k1 M = s.M(this.f9792a);
        if (M == null || M.length() == 0) {
            return false;
        }
        M.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        s sVar = this.f9792a;
        k1 M = s.M(sVar);
        if (M != null) {
            int N = s.N(sVar, M);
            try {
                CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, M.getPaint().getFontMetricsInt(), false, (int[]) null);
                M.setText(M.getText().insert(N, replaceEmoji));
                int length = N + replaceEmoji.length();
                M.setSelection(length, length);
                if (M == sVar.F) {
                    sVar.G = length;
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
        org.telegram.ui.Components.y5 y5Var;
        s sVar = this.f9792a;
        k1 M = s.M(sVar);
        if (M != null) {
            int N = s.N(sVar, M);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new org.telegram.ui.Components.y5(document, M.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new org.telegram.ui.Components.y5(j3, M.getPaint().getFontMetricsInt());
                }
                y5Var.cacheType = org.telegram.ui.Components.p5.g();
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                M.setText(M.getText().insert(N, spannableString));
                int length = N + spannableString.length();
                M.setSelection(length, length);
                if (M == sVar.F) {
                    sVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f9792a.f9839y;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void o(r51 r51Var) {
    }

    @Override
    public final void q() {
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
    public final void u() {
    }

    @Override
    public final void w() {
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
