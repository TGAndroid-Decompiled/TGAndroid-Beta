package gi;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.n31;
public final class f5 implements fx {
    public final m5 f12699a;

    public f5(m5 m5Var) {
        this.f12699a = m5Var;
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
        ug.b editText = ((ug.l2) this.f12699a.f13229t0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ug.l2 l2Var;
        ug.b editText;
        org.telegram.messenger.f6[] f6VarArr;
        ug.j jVar = this.f12699a.f13229t0;
        if (!(jVar instanceof ug.l2) || (editText = (l2Var = (ug.l2) jVar).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(str, l2Var.getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.f6.class)) != null) {
                for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                    f6Var.f22453b = 0.85f;
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
        m5 m5Var = this.f12699a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m5Var.getContext(), m5Var.f13224q1);
        String M0 = bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131752069, null);
        alertDialog$Builder.k(bd.M0(2131752099, null), new ei.y8(this, 10));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.p5 p5Var;
        ug.b editText = ((ug.l2) this.f12699a.f13229t0).getEditText();
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
                p5Var = new org.telegram.ui.Components.p5(document.f27007id, 1.0f, editText.getPaint().getFontMetricsInt());
                p5Var.document = document;
            } else {
                p5Var = new org.telegram.ui.Components.p5(j10, 1.0f, editText.getPaint().getFontMetricsInt());
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
    public final void i(int i3) {
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
    public final void m(View view, TLRPC.Document document, String str, Object obj, vi viVar, boolean z10, int i3) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
    }
}
