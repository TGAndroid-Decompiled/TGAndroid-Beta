package jg;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.gj;
import org.telegram.messenger.h6;
import org.telegram.messenger.k6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.x41;
public final class i0 implements vx {
    public final r0 f10016a;

    public i0(r0 r0Var) {
        this.f10016a = r0Var;
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
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        b editText = ((g3) this.f10016a.B0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        g3 g3Var;
        b editText;
        h6[] h6VarArr;
        j jVar = this.f10016a.B0;
        if (!(jVar instanceof g3) || (editText = (g3Var = (g3) jVar).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = k6.m(str, g3Var.getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (h6VarArr = (h6[]) ((Spanned) m10).getSpans(0, m10.length(), h6.class)) != null) {
                for (h6 h6Var : h6VarArr) {
                    h6Var.f16025b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void n() {
        r0 r0Var = this.f10016a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r0Var.getContext(), r0Var.f10204z1);
        String L0 = dd.L0(2131752068, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = dd.L0(2131752069, null);
        alertDialog$Builder.k(dd.L0(2131752099, null), new ig.c0(this, 11));
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        o5 o5Var;
        b editText = ((g3) this.f10016a.B0).getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                o5Var = new o5(document, editText.getPaint().getFontMetricsInt());
            } else {
                o5Var = new o5(j10, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            f8.g(e, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void i(int i10) {
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
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j10) {
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
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, gj gjVar, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
