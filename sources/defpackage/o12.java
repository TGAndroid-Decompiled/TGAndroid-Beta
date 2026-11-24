package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.ui.ActionBar.d;
public final class o12 implements TextWatcher {
    public boolean a;
    public boolean b;
    public final d c;
    public final i22 d;

    public o12(i22 i22Var, d dVar) {
        this.d = i22Var;
        this.c = dVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        i22 i22Var = this.d;
        io ioVar = i22Var.t1;
        m12 m12Var = i22Var.M2;
        int i2 = i22Var.G3;
        io ioVar2 = i22Var.u1;
        if (this.b != TextUtils.isEmpty(editable)) {
            a22 a22Var = i22Var.v2;
            if (a22Var != null) {
                a22Var.E(a22Var.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z4 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            gw3.l(editable, m12Var.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        i22Var.F1 = codePointCount;
        fn0 fn0Var = i22Var.o1;
        if (codePointCount > 0) {
            z = true;
        } else {
            z = false;
        }
        fn0Var.a(z, true);
        int i3 = i22Var.E1;
        if (i3 > 0 && (i = i3 - i22Var.F1) <= 100) {
            if (i < -9999) {
                i = -9999;
            }
            long j = i;
            String E = jb6.E(j, ',');
            if (ioVar2.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ioVar2.c(E, z3, true);
            if (ioVar2.getVisibility() != 0) {
                ioVar2.setVisibility(0);
                ioVar2.setAlpha(0.0f);
                ioVar2.setScaleX(0.5f);
                ioVar2.setScaleY(0.5f);
            }
            ioVar2.animate().setListener(null).cancel();
            ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                anb.U(ioVar2, cmb.o7, i22Var.J0);
                z2 = false;
            } else {
                anb.U(ioVar2, cmb.x6, i22Var.J0);
                z2 = true;
            }
            ioVar.c(jb6.E(j, ','), false, true);
            ioVar.setAlpha(1.0f);
        } else {
            ioVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new b91(this, (byte) 14));
            ioVar.setAlpha(0.0f);
            z2 = true;
        }
        if (i22Var.R2 != z2) {
            i22Var.R2 = z2;
            i22Var.F2.invalidate();
        }
        if (!i22Var.f4 && !oc7.r1(i2).H3() && !z8c.h(i2).p() && i22Var.F1 > oc7.r1(i2).l4.g1.f() && i22Var.F1 < oc7.r1(i2).l4.h1.f()) {
            i22Var.f4 = true;
            i22Var.y1(this.c);
        }
        if (i22Var.W1) {
            if (m12Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(m12Var.getText().toString().trim())) {
                z4 = true;
            }
            i22Var.w1(z4);
        }
        i22Var.I0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 - i2 >= 1) {
            this.a = true;
        }
        i22 i22Var = this.d;
        if (i22Var.B4 == null) {
            i22Var.O0();
        }
        if (i22Var.B4.getAdapter() != null) {
            i22Var.B4.setReversed(true);
            i22Var.B4.getAdapter().U(charSequence, i22Var.M2.getEditText().getSelectionStart(), null, false, false);
            i22Var.E1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
