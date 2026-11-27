package defpackage;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class py5 implements p14 {
    public final wy5 a;

    public py5(wy5 wy5Var) {
        this.a = wy5Var;
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
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        ju3 editText = ((rlb) this.a.C0).getEditText();
        if (editText == null || editText.length() == 0) {
            return false;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        rlb rlbVar;
        ju3 editText;
        mv3[] mv3VarArr;
        h44 h44Var = this.a.C0;
        if (!(h44Var instanceof rlb) || (editText = (rlbVar = (rlb) h44Var).getEditText()) == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = pv3.m(str, rlbVar.getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (mv3VarArr = (mv3[]) ((Spanned) m).getSpans(0, m.length(), mv3.class)) != null) {
                for (mv3 mv3Var : mv3VarArr) {
                    mv3Var.b = 0.85f;
                }
            }
            editText.setText(editText.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void n() {
        wy5 wy5Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wy5Var.A1, wy5Var.getContext());
        String M0 = ob6.M0(2131752033, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752034, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new e05(this, (byte) 19));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    @Override
    public final float o() {
        return 0.0f;
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        hm hmVar;
        ju3 editText = ((rlb) this.a.C0).getEditText();
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
                hmVar = new hm(document, editText.getPaint().getFontMetricsInt());
            } else {
                hmVar = new hm(j, editText.getPaint().getFontMetricsInt());
            }
            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
            editText.setText(editText.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void v() {
    }

    @Override
    public final void g(d6c d6cVar) {
    }

    @Override
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void j(int i) {
    }

    @Override
    public final void q(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void r(int i) {
    }

    @Override
    public final void s(ArrayList arrayList) {
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
    public final void x(View view, TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, int i) {
    }
}
