package bi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.x41;
import org.telegram.ui.StickersActivity;
public final class a2 implements vx {
    public final k2 f2838a;

    public a2(k2 k2Var) {
        this.f2838a = k2Var;
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
        n1 focusedEditTextOrNull;
        boolean z10 = false;
        k2 k2Var = this.f2838a;
        if (i10 != 0 && (focusedEditTextOrNull = k2Var.P.getFocusedEditTextOrNull()) != null) {
            k2Var.R0 = focusedEditTextOrNull;
            k2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        k2Var.C0 = z10;
        k2Var.j0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        n1 f02 = k2.f0(this.f2838a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        k2 k2Var = this.f2838a;
        n1 f02 = k2.f0(k2Var);
        if (f02 != null) {
            int g02 = k2.g0(k2Var, f02);
            try {
                CharSequence m10 = org.telegram.messenger.k6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
                f02.setText(f02.getText().insert(g02, m10));
                int length = g02 + m10.length();
                f02.setSelection(length, length);
                if (f02 == k2Var.R0) {
                    k2Var.S0 = length;
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
        this.f2838a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f2838a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.o5 o5Var;
        k2 k2Var = this.f2838a;
        n1 f02 = k2.f0(k2Var);
        if (f02 != null) {
            int g02 = k2.g0(k2Var, f02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    o5Var = new org.telegram.ui.Components.o5(document, f02.getPaint().getFontMetricsInt());
                } else {
                    o5Var = new org.telegram.ui.Components.o5(j10, f02.getPaint().getFontMetricsInt());
                }
                o5Var.cacheType = org.telegram.ui.Components.f5.f();
                spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                f02.setText(f02.getText().insert(g02, spannableString));
                int length = g02 + spannableString.length();
                f02.setSelection(length, length);
                if (f02 == k2Var.R0) {
                    k2Var.S0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f2838a.C0;
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
    public final void o(x41 x41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void y(long j10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, gj gjVar, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }
}
