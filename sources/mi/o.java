package mi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i6;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.n31;
public final class o implements fx {
    public final p f19774a;

    public o(p pVar) {
        this.f19774a = pVar;
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
    public final void i(int i3) {
        h1 focusedEditTextOrNull;
        boolean z10 = false;
        p pVar = this.f19774a;
        if (i3 != 0 && (focusedEditTextOrNull = pVar.f19793r.getFocusedEditTextOrNull()) != null) {
            pVar.G = focusedEditTextOrNull;
            pVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i3 != 0) {
            z10 = true;
        }
        pVar.E = z10;
        pVar.W();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        h1 Q = p.Q(this.f19774a);
        if (Q == null || Q.length() == 0) {
            return false;
        }
        Q.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        p pVar = this.f19774a;
        h1 Q = p.Q(pVar);
        if (Q != null) {
            int R = p.R(pVar, Q);
            try {
                CharSequence m10 = i6.m(str, Q.getPaint().getFontMetricsInt(), false, null, 0);
                Q.setText(Q.getText().insert(R, m10));
                int length = R + m10.length();
                Q.setSelection(length, length);
                if (Q == pVar.G) {
                    pVar.H = length;
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
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.p5 p5Var;
        p pVar = this.f19774a;
        h1 Q = p.Q(pVar);
        if (Q != null) {
            int R = p.R(pVar, Q);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    p5Var = new org.telegram.ui.Components.p5(document, Q.getPaint().getFontMetricsInt());
                } else {
                    p5Var = new org.telegram.ui.Components.p5(j10, Q.getPaint().getFontMetricsInt());
                }
                p5Var.cacheType = org.telegram.ui.Components.g5.f();
                spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                Q.setText(Q.getText().insert(R, spannableString));
                int length = R + spannableString.length();
                Q.setSelection(length, length);
                if (Q == pVar.G) {
                    pVar.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f19774a.E;
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
    public final void o(n31 n31Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i3) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, vi viVar, boolean z10, int i3) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }
}
