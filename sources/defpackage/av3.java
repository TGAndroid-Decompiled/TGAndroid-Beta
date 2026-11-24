package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class av3 implements f24 {
    public final cv3 a;

    public av3(cv3 cv3Var) {
        this.a = cv3Var;
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
        cv3 cv3Var = this.a;
        if (cv3Var.b()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            cv3Var.y = z;
            cv3Var.y();
            ela elaVar = cv3Var.f;
            if (elaVar != null) {
                elaVar.R();
            }
        }
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        wu3 wu3Var = this.a.a;
        if (wu3Var.length() == 0) {
            return false;
        }
        wu3Var.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void m(String str) {
        wu3 wu3Var = this.a.a;
        int selectionEnd = wu3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence m = gw3.m(str, wu3Var.getPaint().getFontMetricsInt(), false, null, 0);
            wu3Var.setText(wu3Var.getText().insert(selectionEnd, m));
            int length = selectionEnd + m.length();
            wu3Var.setSelection(length, length);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void n() {
        cv3 cv3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cv3Var.N, cv3Var.getContext());
        String M0 = jb6.M0(2131752005, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752006, null);
        alertDialog$Builder.j(jb6.M0(2131752036, null), new yu3(this, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        d dVar = cv3Var.h;
        if (dVar != null) {
            dVar.showDialog(heVar);
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
        d dVar = this.a.h;
        if (dVar == null) {
            new kj8((d) new qv0(this, (byte) 2), 11, false).show();
        } else {
            dVar.showDialog(new kj8(dVar, 11, false));
        }
    }

    @Override
    public final void w(long j, TLRPC.Document document, String str, boolean z) {
        gn gnVar;
        cv3 cv3Var = this.a;
        wu3 wu3Var = cv3Var.a;
        int selectionEnd = wu3Var.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                gnVar = new gn(document, wu3Var.getPaint().getFontMetricsInt());
            } else {
                gnVar = new gn(j, wu3Var.getPaint().getFontMetricsInt());
            }
            gnVar.cacheType = cv3Var.d.c;
            spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
            wu3Var.setText(wu3Var.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            wu3Var.setSelection(length, length);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean z() {
        return this.a.y;
    }

    @Override
    public final void g(d4c d4cVar) {
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
