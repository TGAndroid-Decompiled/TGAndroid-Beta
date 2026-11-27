package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u72 implements p14 {
    public final v72 a;

    public u72(v72 v72Var) {
        this.a = v72Var;
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
    public final boolean h() {
        return false;
    }

    @Override
    public final void j(int i) {
        dg9 focusedEditTextOrNull;
        boolean z = false;
        v72 v72Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = v72Var.r.getFocusedEditTextOrNull()) != null) {
            v72Var.G = focusedEditTextOrNull;
            v72Var.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i != 0) {
            z = true;
        }
        v72Var.E = z;
        v72Var.R();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        dg9 U = this.a.U();
        if (U == null || U.length() == 0) {
            return false;
        }
        U.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        v72 v72Var = this.a;
        dg9 U = v72Var.U();
        if (U != null) {
            int V = v72Var.V(U);
            try {
                CharSequence m = pv3.m(str, U.getPaint().getFontMetricsInt(), false, null, 0);
                U.setText(U.getText().insert(V, m));
                int length = V + m.length();
                U.setSelection(length, length);
                if (U == v72Var.G) {
                    v72Var.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final float o() {
        return 0.0f;
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        hm hmVar;
        v72 v72Var = this.a;
        dg9 U = v72Var.U();
        if (U != null) {
            int V = v72Var.V(U);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    hmVar = new hm(document, U.getPaint().getFontMetricsInt());
                } else {
                    hmVar = new hm(j, U.getPaint().getFontMetricsInt());
                }
                hmVar.cacheType = wl.f();
                spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                U.setText(U.getText().insert(V, spannableString));
                int length = V + spannableString.length();
                U.setSelection(length, length);
                if (U == v72Var.G) {
                    v72Var.H = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.a.E;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void g(d6c d6cVar) {
    }

    @Override
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void r(int i) {
    }

    @Override
    public final void s(ArrayList arrayList) {
    }

    @Override
    public final void y(long j) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void u(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void x(View view, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, int i) {
    }
}
