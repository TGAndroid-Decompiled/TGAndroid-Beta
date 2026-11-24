package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
public final class af9 implements f24 {
    public final jf9 a;

    public af9(jf9 jf9Var) {
        this.a = jf9Var;
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
        jf9 jf9Var = this.a;
        if (i != 0 && (focusedEditTextOrNull = jf9Var.Q.getFocusedEditTextOrNull()) != null) {
            jf9Var.S0 = focusedEditTextOrNull;
            jf9Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i != 0) {
            z = true;
        }
        jf9Var.D0 = z;
        jf9Var.b0(z);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        ne9 t0 = this.a.t0();
        if (t0 == null || t0.length() == 0) {
            return false;
        }
        t0.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        jf9 jf9Var = this.a;
        ne9 t0 = jf9Var.t0();
        if (t0 != null) {
            int u0 = jf9Var.u0(t0);
            try {
                CharSequence m = gw3.m(str, t0.getPaint().getFontMetricsInt(), false, null, 0);
                t0.setText(t0.getText().insert(u0, m));
                int length = u0 + m.length();
                t0.setSelection(length, length);
                if (t0 == jf9Var.S0) {
                    jf9Var.T0 = length;
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
        gn gnVar;
        jf9 jf9Var = this.a;
        ne9 t0 = jf9Var.t0();
        if (t0 != null) {
            int u0 = jf9Var.u0(t0);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    gnVar = new gn(document, t0.getPaint().getFontMetricsInt());
                } else {
                    gnVar = new gn(j, t0.getPaint().getFontMetricsInt());
                }
                gnVar.cacheType = vm.f();
                spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                t0.setText(t0.getText().insert(u0, spannableString));
                int length = u0 + spannableString.length();
                t0.setSelection(length, length);
                if (t0 == jf9Var.S0) {
                    jf9Var.T0 = length;
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
