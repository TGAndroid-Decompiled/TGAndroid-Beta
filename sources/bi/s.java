package bi;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.w41;
public final class s implements vx {
    public final t f3334a;

    public s(t tVar) {
        this.f3334a = tVar;
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
        t tVar = this.f3334a;
        if (i10 != 0 && (focusedEditTextOrNull = tVar.f3350r.getFocusedEditTextOrNull()) != null) {
            tVar.F = focusedEditTextOrNull;
            tVar.G = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        }
        if (i10 != 0) {
            z10 = true;
        }
        tVar.D = z10;
        tVar.V();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        n1 P = t.P(this.f3334a);
        if (P == null || P.length() == 0) {
            return false;
        }
        P.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        t tVar = this.f3334a;
        n1 P = t.P(tVar);
        if (P != null) {
            int Q = t.Q(tVar, P);
            try {
                CharSequence m10 = org.telegram.messenger.k6.m(str, P.getPaint().getFontMetricsInt(), false, null, 0);
                P.setText(P.getText().insert(Q, m10));
                int length = Q + m10.length();
                P.setSelection(length, length);
                if (P == tVar.F) {
                    tVar.G = length;
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
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.o5 o5Var;
        t tVar = this.f3334a;
        n1 P = t.P(tVar);
        if (P != null) {
            int Q = t.Q(tVar, P);
            try {
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    o5Var = new org.telegram.ui.Components.o5(document, P.getPaint().getFontMetricsInt());
                } else {
                    o5Var = new org.telegram.ui.Components.o5(j10, P.getPaint().getFontMetricsInt());
                }
                o5Var.cacheType = org.telegram.ui.Components.f5.f();
                spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                P.setText(P.getText().insert(Q, spannableString));
                int length = Q + spannableString.length();
                P.setSelection(length, length);
                if (P == tVar.F) {
                    tVar.G = length;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean z() {
        return this.f3334a.D;
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
    public final void o(w41 w41Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, fj fjVar, boolean z10, int i10) {
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
