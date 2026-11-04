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
import org.telegram.ui.StickersActivity;
public final class t1 implements fx {
    public final c2 f19891a;

    public t1(c2 c2Var) {
        this.f19891a = c2Var;
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
        c2 c2Var = this.f19891a;
        if (i3 != 0 && (focusedEditTextOrNull = c2Var.Q.getFocusedEditTextOrNull()) != null) {
            c2Var.S0 = focusedEditTextOrNull;
            c2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i3 != 0) {
            z10 = true;
        }
        c2Var.D0 = z10;
        c2Var.j0(z10);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        h1 f02 = c2.f0(this.f19891a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        c2 c2Var = this.f19891a;
        h1 f02 = c2.f0(c2Var);
        if (f02 != null) {
            int g02 = c2.g0(c2Var, f02);
            try {
                CharSequence m10 = i6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
                f02.setText(f02.getText().insert(g02, m10));
                int length = g02 + m10.length();
                f02.setSelection(length, length);
                if (f02 == c2Var.S0) {
                    c2Var.T0 = length;
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
        this.f19891a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f19891a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.p5 p5Var;
        c2 c2Var = this.f19891a;
        h1 f02 = c2.f0(c2Var);
        if (f02 != null) {
            int g02 = c2.g0(c2Var, f02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    p5Var = new org.telegram.ui.Components.p5(document, f02.getPaint().getFontMetricsInt());
                } else {
                    p5Var = new org.telegram.ui.Components.p5(j10, f02.getPaint().getFontMetricsInt());
                }
                p5Var.cacheType = org.telegram.ui.Components.g5.f();
                spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                f02.setText(f02.getText().insert(g02, spannableString));
                int length = g02 + spannableString.length();
                f02.setSelection(length, length);
                if (f02 == c2Var.S0) {
                    c2Var.T0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f19891a.D0;
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
    public final void o(n31 n31Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i3) {
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
