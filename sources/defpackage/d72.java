package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d72 implements u04 {
    public final e72 a;

    public d72(e72 e72Var) {
        this.a = e72Var;
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
        mc9 focusedEditTextOrNull;
        boolean z = false;
        e72 e72Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = e72Var.r.getFocusedEditTextOrNull()) != null) {
            e72Var.G = focusedEditTextOrNull;
            e72Var.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i != 0) {
            z = true;
        }
        e72Var.E = z;
        e72Var.S();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        mc9 V = this.a.V();
        if (V == null || V.length() == 0) {
            return false;
        }
        V.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        e72 e72Var = this.a;
        mc9 V = e72Var.V();
        if (V != null) {
            int W = e72Var.W(V);
            try {
                CharSequence m = vu3.m(str, V.getPaint().getFontMetricsInt(), false, null, 0);
                V.setText(V.getText().insert(W, m));
                int length = W + m.length();
                V.setSelection(length, length);
                if (V == e72Var.G) {
                    e72Var.H = length;
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
        gm gmVar;
        e72 e72Var = this.a;
        mc9 V = e72Var.V();
        if (V != null) {
            int W = e72Var.W(V);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    gmVar = new gm(document, V.getPaint().getFontMetricsInt());
                } else {
                    gmVar = new gm(j, V.getPaint().getFontMetricsInt());
                }
                gmVar.cacheType = vl.f();
                spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
                V.setText(V.getText().insert(W, spannableString));
                int length = W + spannableString.length();
                V.setSelection(length, length);
                if (V == e72Var.G) {
                    e72Var.H = length;
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
    public final void g(d2c d2cVar) {
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
    public final void x(View view, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, int i) {
    }
}
