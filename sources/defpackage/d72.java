package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d72 implements f24 {
    public final v72 a;

    public d72(v72 v72Var) {
        this.a = v72Var;
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
        v72 v72Var = this.a;
        v72Var.i1 = z;
        v72Var.b.o3.requestLayout();
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        EditTextBoldCursor editField;
        ng8 ng8Var = this.a.h1;
        if (ng8Var == null || (editField = ng8Var.getEditField()) == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        EditTextBoldCursor editField;
        ng8 ng8Var = this.a.h1;
        if (ng8Var == null || (editField = ng8Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = gw3.m(str, editField.getPaint().getFontMetricsInt(), false, null, 0);
            editField.setText(editField.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void n() {
        v72 v72Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v72Var.a, v72Var.getContext());
        String M0 = jb6.M0(2131752005, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752006, null);
        alertDialog$Builder.j(jb6.M0(2131752036, null), new cd1(this, (byte) 21));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.o();
    }

    @Override
    public final float o() {
        return 0.0f;
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        EditTextBoldCursor editField;
        gn gnVar;
        ng8 ng8Var = this.a.h1;
        if (ng8Var == null || (editField = ng8Var.getEditField()) == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                gnVar = new gn(document, editField.getPaint().getFontMetricsInt());
            } else {
                gnVar = new gn(j, editField.getPaint().getFontMetricsInt());
            }
            gnVar.cacheType = 3;
            spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean z() {
        return this.a.i1;
    }

    @Override
    public final void g(d4c d4cVar) {
    }

    @Override
    public final void i(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void p() {
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
    public final void t() {
    }

    @Override
    public final void v() {
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
