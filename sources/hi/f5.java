package hi;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.x31;
public final class f5 implements mx {
    public final m5 f14274a;

    public f5(m5 m5Var) {
        this.f14274a = m5Var;
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
        tg.b editText = ((tg.n2) this.f14274a.f14690t0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        tg.n2 n2Var;
        tg.b editText;
        org.telegram.messenger.g6[] g6VarArr;
        tg.j jVar = this.f14274a.f14690t0;
        if (!(jVar instanceof tg.n2) || (editText = (n2Var = (tg.n2) jVar).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(str, n2Var.getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                    g6Var.f23696b = 0.85f;
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
        m5 m5Var = this.f14274a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m5Var.getContext(), m5Var.f14685q1);
        String M0 = hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131752069, null);
        alertDialog$Builder.k(hd.M0(2131752099, null), new di.z6(this, 21));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.p5 p5Var;
        tg.b editText = ((tg.n2) this.f14274a.f14690t0).getEditText();
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
                p5Var = new org.telegram.ui.Components.p5(document.f28057id, 1.0f, editText.getPaint().getFontMetricsInt());
                p5Var.document = document;
            } else {
                p5Var = new org.telegram.ui.Components.p5(j3, 1.0f, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
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
    public final void o(x31 x31Var) {
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
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, cj cjVar, boolean z10, int i7) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
    }
}
