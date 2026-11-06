package li;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ej;
import org.telegram.messenger.i6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.t31;
public final class o implements hx {
    public final p f18730a;

    public o(p pVar) {
        this.f18730a = pVar;
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
    public final void i(int i7) {
        g1 focusedEditTextOrNull;
        boolean z9 = false;
        p pVar = this.f18730a;
        if (i7 != 0 && (focusedEditTextOrNull = pVar.f18757r.getFocusedEditTextOrNull()) != null) {
            pVar.F = focusedEditTextOrNull;
            pVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i7 != 0) {
            z9 = true;
        }
        pVar.D = z9;
        pVar.W();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        g1 Q = p.Q(this.f18730a);
        if (Q == null || Q.length() == 0) {
            return false;
        }
        Q.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        p pVar = this.f18730a;
        g1 Q = p.Q(pVar);
        if (Q != null) {
            int R = p.R(pVar, Q);
            try {
                CharSequence m10 = i6.m(str, Q.getPaint().getFontMetricsInt(), false, null, 0);
                Q.setText(Q.getText().insert(R, m10));
                int length = R + m10.length();
                Q.setSelection(length, length);
                if (Q == pVar.F) {
                    pVar.G = length;
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
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        org.telegram.ui.Components.r5 r5Var;
        p pVar = this.f18730a;
        g1 Q = p.Q(pVar);
        if (Q != null) {
            int R = p.R(pVar, Q);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    r5Var = new org.telegram.ui.Components.r5(document, Q.getPaint().getFontMetricsInt());
                } else {
                    r5Var = new org.telegram.ui.Components.r5(j3, Q.getPaint().getFontMetricsInt());
                }
                r5Var.cacheType = org.telegram.ui.Components.i5.f();
                spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
                Q.setText(Q.getText().insert(R, spannableString));
                int length = R + spannableString.length();
                Q.setSelection(length, length);
                if (Q == pVar.F) {
                    pVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f18730a.D;
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
    public final void o(t31 t31Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i7) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, ej ejVar, boolean z9, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
