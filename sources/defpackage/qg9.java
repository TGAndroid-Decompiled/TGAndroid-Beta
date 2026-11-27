package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
public final class qg9 implements p14 {
    public final yg9 a;

    public qg9(yg9 yg9Var) {
        this.a = yg9Var;
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
        yg9 yg9Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = yg9Var.Q.getFocusedEditTextOrNull()) != null) {
            yg9Var.S0 = focusedEditTextOrNull;
            yg9Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i != 0) {
            z = true;
        }
        yg9Var.D0 = z;
        yg9Var.a0(z);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        dg9 s0 = this.a.s0();
        if (s0 == null || s0.length() == 0) {
            return false;
        }
        s0.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        yg9 yg9Var = this.a;
        dg9 s0 = yg9Var.s0();
        if (s0 != null) {
            int t0 = yg9Var.t0(s0);
            try {
                CharSequence m = pv3.m(str, s0.getPaint().getFontMetricsInt(), false, null, 0);
                s0.setText(s0.getText().insert(t0, m));
                int length = t0 + m.length();
                s0.setSelection(length, length);
                if (s0 == yg9Var.S0) {
                    yg9Var.T0 = length;
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
    public final void s(ArrayList arrayList) {
        this.a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void v() {
        this.a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        hm hmVar;
        yg9 yg9Var = this.a;
        dg9 s0 = yg9Var.s0();
        if (s0 != null) {
            int t0 = yg9Var.t0(s0);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    hmVar = new hm(document, s0.getPaint().getFontMetricsInt());
                } else {
                    hmVar = new hm(j, s0.getPaint().getFontMetricsInt());
                }
                hmVar.cacheType = wl.f();
                spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                s0.setText(s0.getText().insert(t0, spannableString));
                int length = t0 + spannableString.length();
                s0.setSelection(length, length);
                if (s0 == yg9Var.S0) {
                    yg9Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.a.D0;
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
