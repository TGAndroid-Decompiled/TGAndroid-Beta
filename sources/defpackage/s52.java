package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class s52 implements u04 {
    public final k62 a;

    public s52(k62 k62Var) {
        this.a = k62Var;
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
        k62 k62Var = this.a;
        k62Var.i1 = z;
        k62Var.b.o3.requestLayout();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        EditTextBoldCursor editField;
        le8 le8Var = this.a.h1;
        if (le8Var == null || (editField = le8Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        EditTextBoldCursor editField;
        le8 le8Var = this.a.h1;
        if (le8Var == null || (editField = le8Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = vu3.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void n() {
        k62 k62Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k62Var.a, k62Var.getContext());
        String M0 = k96.M0(2131752056, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752057, null);
        alertDialog$Builder.j(k96.M0(2131752087, null), new rh1(this, (byte) 18));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.o();
    }

    @Override
    public final float o() {
        return 0.0f;
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        EditTextBoldCursor editField;
        gm gmVar;
        le8 le8Var = this.a.h1;
        if (le8Var == null || (editField = le8Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                gmVar = new gm(document, editField.getPaint().getFontMetricsInt());
            } else {
                gmVar = new gm(j, editField.getPaint().getFontMetricsInt());
            }
            gmVar.cacheType = 3;
            spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            fa4.g(e, true);
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
    public final void g(d2c d2cVar) {
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
    public final void x(View view, TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, int i) {
    }
}
