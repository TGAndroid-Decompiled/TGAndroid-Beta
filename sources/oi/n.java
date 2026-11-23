package oi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.tx;
public final class n implements tx {
    public final o f22208a;

    public n(o oVar) {
        this.f22208a = oVar;
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
        e1 focusedEditTextOrNull;
        boolean z10 = false;
        o oVar = this.f22208a;
        if (i7 != 0 && (focusedEditTextOrNull = oVar.f22237r.getFocusedEditTextOrNull()) != null) {
            oVar.G = focusedEditTextOrNull;
            oVar.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i7 != 0) {
            z10 = true;
        }
        oVar.E = z10;
        oVar.X();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        e1 R = o.R(this.f22208a);
        if (R == null || R.length() == 0) {
            return false;
        }
        R.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        o oVar = this.f22208a;
        e1 R = o.R(oVar);
        if (R != null) {
            int S = o.S(oVar, R);
            try {
                CharSequence m10 = j6.m(str, R.getPaint().getFontMetricsInt(), false, null, 0);
                R.setText(R.getText().insert(S, m10));
                int length = S + m10.length();
                R.setSelection(length, length);
                if (R == oVar.G) {
                    oVar.H = length;
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
        o oVar = this.f22208a;
        e1 R = o.R(oVar);
        if (R != null) {
            int S = o.S(oVar, R);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new org.telegram.ui.Components.y5(document, R.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new org.telegram.ui.Components.y5(j3, R.getPaint().getFontMetricsInt());
                }
                y5Var.cacheType = org.telegram.ui.Components.p5.f();
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                R.setText(R.getText().insert(S, spannableString));
                int length = S + spannableString.length();
                R.setSelection(length, length);
                if (R == oVar.G) {
                    oVar.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f22208a.E;
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
    public final void o(k41 k41Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, cj cjVar, boolean z10, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
