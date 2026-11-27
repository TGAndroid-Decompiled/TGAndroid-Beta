package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class gu3 implements p14 {
    public final iu3 a;

    public gu3(iu3 iu3Var) {
        this.a = iu3Var;
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
        iu3 iu3Var = this.a;
        if (iu3Var.b()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            iu3Var.y = z;
            iu3Var.y();
            wma wmaVar = iu3Var.f;
            if (wmaVar != null) {
                wmaVar.R();
            }
        }
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        du3 du3Var = this.a.a;
        if (du3Var.length() == 0) {
            return false;
        }
        du3Var.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        du3 du3Var = this.a.a;
        int selectionEnd = du3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = pv3.m(str, du3Var.getPaint().getFontMetricsInt(), false, null, 0);
            du3Var.setText(du3Var.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            du3Var.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void n() {
        iu3 iu3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, iu3Var.N, iu3Var.getContext());
        String M0 = ob6.M0(2131752033, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752034, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new ht2(this, (byte) 29));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        e eVar = iu3Var.h;
        if (eVar != null) {
            eVar.showDialog(idVar);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override
    public final float o() {
        return 0.0f;
    }

    @Override
    public final void p() {
        e eVar = this.a.h;
        if (eVar == null) {
            new xk8((e) new qu0(this, (byte) 2), 11, false).show();
        } else {
            eVar.showDialog(new xk8(eVar, 11, false));
        }
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        hm hmVar;
        iu3 iu3Var = this.a;
        du3 du3Var = iu3Var.a;
        int selectionEnd = du3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                hmVar = new hm(document, du3Var.getPaint().getFontMetricsInt());
            } else {
                hmVar = new hm(j, du3Var.getPaint().getFontMetricsInt());
            }
            hmVar.cacheType = iu3Var.d.c;
            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
            du3Var.setText(du3Var.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            du3Var.setSelection(length, length);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean z() {
        return this.a.y;
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
