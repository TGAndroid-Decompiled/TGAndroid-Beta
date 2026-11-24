package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o82 implements f24 {
    public final p82 a;

    public o82(p82 p82Var) {
        this.a = p82Var;
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
        ne9 focusedEditTextOrNull;
        boolean z = false;
        p82 p82Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = p82Var.r.getFocusedEditTextOrNull()) != null) {
            p82Var.G = focusedEditTextOrNull;
            p82Var.H = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i != 0) {
            z = true;
        }
        p82Var.E = z;
        p82Var.R();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        ne9 U = this.a.U();
        if (U == null || U.length() == 0) {
            return false;
        }
        U.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        p82 p82Var = this.a;
        ne9 U = p82Var.U();
        if (U != null) {
            int W = p82Var.W(U);
            try {
                CharSequence m = gw3.m(str, U.getPaint().getFontMetricsInt(), false, null, 0);
                U.setText(U.getText().insert(W, m));
                int length = W + m.length();
                U.setSelection(length, length);
                if (U == p82Var.G) {
                    p82Var.H = length;
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
        gn gnVar;
        p82 p82Var = this.a;
        ne9 U = p82Var.U();
        if (U != null) {
            int W = p82Var.W(U);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    gnVar = new gn(document, U.getPaint().getFontMetricsInt());
                } else {
                    gnVar = new gn(j, U.getPaint().getFontMetricsInt());
                }
                gnVar.cacheType = vm.f();
                spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                U.setText(U.getText().insert(W, spannableString));
                int length = W + spannableString.length();
                U.setSelection(length, length);
                if (U == p82Var.G) {
                    p82Var.H = length;
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
    public final void g(d4c d4cVar) {
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
    public final void x(View view, TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, int i) {
    }
}
