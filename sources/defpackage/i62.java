package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i62 implements p14 {
    public final a72 a;

    public i62(a72 a72Var) {
        this.a = a72Var;
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
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        a72 a72Var = this.a;
        a72Var.i1 = z;
        a72Var.b.o3.requestLayout();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        EditTextBoldCursor editField;
        zh8 zh8Var = this.a.h1;
        if (zh8Var == null || (editField = zh8Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        EditTextBoldCursor editField;
        zh8 zh8Var = this.a.h1;
        if (zh8Var == null || (editField = zh8Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = pv3.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void n() {
        a72 a72Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, a72Var.a, a72Var.getContext());
        String M0 = ob6.M0(2131752033, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752034, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new rd1(this, (byte) 20));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    @Override
    public final float o() {
        return 0.0f;
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        EditTextBoldCursor editField;
        hm hmVar;
        zh8 zh8Var = this.a.h1;
        if (zh8Var == null || (editField = zh8Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                hmVar = new hm(document, editField.getPaint().getFontMetricsInt());
            } else {
                hmVar = new hm(j, editField.getPaint().getFontMetricsInt());
            }
            hmVar.cacheType = 3;
            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean z() {
        return this.a.i1;
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
