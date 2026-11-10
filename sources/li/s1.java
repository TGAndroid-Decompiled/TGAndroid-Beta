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
import org.telegram.ui.StickersActivity;
public final class s1 implements hx {
    public final b2 f18830a;

    public s1(b2 b2Var) {
        this.f18830a = b2Var;
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
        b2 b2Var = this.f18830a;
        if (i7 != 0 && (focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull()) != null) {
            b2Var.R0 = focusedEditTextOrNull;
            b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i7 != 0) {
            z9 = true;
        }
        b2Var.C0 = z9;
        b2Var.j0(z9);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        g1 f02 = b2.f0(this.f18830a);
        if (f02 == null || f02.length() == 0) {
            return false;
        }
        f02.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        b2 b2Var = this.f18830a;
        g1 f02 = b2.f0(b2Var);
        if (f02 != null) {
            int g02 = b2.g0(b2Var, f02);
            try {
                CharSequence m10 = i6.m(str, f02.getPaint().getFontMetricsInt(), false, null, 0);
                f02.setText(f02.getText().insert(g02, m10));
                int length = g02 + m10.length();
                f02.setSelection(length, length);
                if (f02 == b2Var.R0) {
                    b2Var.S0 = length;
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
        this.f18830a.presentFragment(new StickersActivity(5, arrayList));
    }

    @Override
    public final void w() {
        this.f18830a.presentFragment(new StickersActivity(0, null));
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        org.telegram.ui.Components.q5 q5Var;
        b2 b2Var = this.f18830a;
        g1 f02 = b2.f0(b2Var);
        if (f02 != null) {
            int g02 = b2.g0(b2Var, f02);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    q5Var = new org.telegram.ui.Components.q5(document, f02.getPaint().getFontMetricsInt());
                } else {
                    q5Var = new org.telegram.ui.Components.q5(j3, f02.getPaint().getFontMetricsInt());
                }
                q5Var.cacheType = org.telegram.ui.Components.h5.f();
                spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
                f02.setText(f02.getText().insert(g02, spannableString));
                int length = g02 + spannableString.length();
                f02.setSelection(length, length);
                if (f02 == b2Var.R0) {
                    b2Var.S0 = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f18830a.C0;
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
    public final void o(t31 t31Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, ej ejVar, boolean z9, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
