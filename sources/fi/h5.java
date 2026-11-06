package fi;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ej;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.t31;
public final class h5 implements hx {
    public final o5 f12133a;

    public h5(o5 o5Var) {
        this.f12133a = o5Var;
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
        tg.b editText = ((tg.k2) this.f12133a.f12545s0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        tg.k2 k2Var;
        tg.b editText;
        org.telegram.messenger.f6[] f6VarArr;
        tg.j jVar = this.f12133a.f12545s0;
        if (!(jVar instanceof tg.k2) || (editText = (k2Var = (tg.k2) jVar).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, k2Var.getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.f6.class)) != null) {
                for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                    f6Var.f22351b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void n() {
        o5 o5Var = this.f12133a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, o5Var.getContext(), o5Var.f12540p1);
        String M0 = hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = hd.M0(2131752069, null);
        alertDialog$Builder.k(hd.M0(2131752099, null), new di.q4(this, 14));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        org.telegram.ui.Components.r5 r5Var;
        tg.b editText = ((tg.k2) this.f12133a.f12545s0).getEditText();
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
                r5Var = new org.telegram.ui.Components.r5(document.f26959id, 1.0f, editText.getPaint().getFontMetricsInt());
                r5Var.document = document;
            } else {
                r5Var = new org.telegram.ui.Components.r5(j3, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
    public final void i(int i7) {
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
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void y(long j3) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, ej ejVar, boolean z9, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
    }
}
