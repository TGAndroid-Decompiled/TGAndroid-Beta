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
import org.telegram.ui.StickersActivity;
public final class s1 implements tx {
    public final b2 f22368a;

    public s1(b2 b2Var) {
        this.f22368a = b2Var;
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
        f1 focusedEditTextOrNull;
        boolean z10 = false;
        b2 b2Var = this.f22368a;
        if (i7 != 0 && (focusedEditTextOrNull = b2Var.Q.getFocusedEditTextOrNull()) != null) {
            b2Var.S0 = focusedEditTextOrNull;
            b2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i7 != 0) {
            z10 = true;
        }
        b2Var.D0 = z10;
        b2Var.j0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        f1 f02 = b2.f0(this.f22368a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        b2 b2Var = this.f22368a;
        f1 f02 = b2.f0(b2Var);
        if (f02 != null) {
            int g02 = b2.g0(b2Var, f02);
            try {
                CharSequence m10 = j6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
                f02.setText(f02.getText().insert(g02, m10));
                int length = g02 + m10.length();
                f02.setSelection(length, length);
                if (f02 == b2Var.S0) {
                    b2Var.T0 = length;
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
    public final void t(ArrayList arrayList) {
        this.f22368a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f22368a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.y5 y5Var;
        b2 b2Var = this.f22368a;
        f1 f02 = b2.f0(b2Var);
        if (f02 != null) {
            int g02 = b2.g0(b2Var, f02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    y5Var = new org.telegram.ui.Components.y5(document, f02.getPaint().getFontMetricsInt());
                } else {
                    y5Var = new org.telegram.ui.Components.y5(j3, f02.getPaint().getFontMetricsInt());
                }
                y5Var.cacheType = org.telegram.ui.Components.p5.f();
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                f02.setText(f02.getText().insert(g02, spannableString));
                int length = g02 + spannableString.length();
                f02.setSelection(length, length);
                if (f02 == b2Var.S0) {
                    b2Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f22368a.D0;
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
