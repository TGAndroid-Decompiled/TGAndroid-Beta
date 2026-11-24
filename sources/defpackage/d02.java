package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.ui.ActionBar.d;
public final class d02 implements TextWatcher {
    public boolean a;
    public boolean b;
    public final d c;
    public final x02 d;

    public d02(x02 x02Var, d dVar) {
        this.d = x02Var;
        this.c = dVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        x02 x02Var = this.d;
        hn hnVar = x02Var.t1;
        b02 b02Var = x02Var.M2;
        int i2 = x02Var.G3;
        hn hnVar2 = x02Var.u1;
        if (this.b != TextUtils.isEmpty(editable)) {
            p02 p02Var = x02Var.v2;
            if (p02Var != null) {
                p02Var.E(p02Var.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z4 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            vu3.l(editable, b02Var.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        x02Var.F1 = codePointCount;
        fm0 fm0Var = x02Var.o1;
        if (codePointCount > 0) {
            z = true;
        } else {
            z = false;
        }
        fm0Var.a(z, true);
        int i3 = x02Var.E1;
        if (i3 > 0 && (i = i3 - x02Var.F1) <= 100) {
            if (i < -9999) {
                i = -9999;
            }
            long j = i;
            String E = k96.E(j, ',');
            if (hnVar2.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            hnVar2.c(E, z3, true);
            if (hnVar2.getVisibility() != 0) {
                hnVar2.setVisibility(0);
                hnVar2.setAlpha(0.0f);
                hnVar2.setScaleX(0.5f);
                hnVar2.setScaleY(0.5f);
            }
            hnVar2.animate().setListener(null).cancel();
            hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                zkb.U(hnVar2, bkb.o7, x02Var.J0);
                z2 = false;
            } else {
                zkb.U(hnVar2, bkb.x6, x02Var.J0);
                z2 = true;
            }
            hnVar.c(k96.E(j, ','), false, true);
            hnVar.setAlpha(1.0f);
        } else {
            hnVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bb1(this, (byte) 12));
            hnVar.setAlpha(0.0f);
            z2 = true;
        }
        if (x02Var.R2 != z2) {
            x02Var.R2 = z2;
            x02Var.F2.invalidate();
        }
        if (!x02Var.f4 && !na7.q1(i2).F3() && !y6c.h(i2).p() && x02Var.F1 > na7.q1(i2).k4.g1.f() && x02Var.F1 < na7.q1(i2).k4.h1.f()) {
            x02Var.f4 = true;
            x02Var.y1(this.c);
        }
        if (x02Var.W1) {
            if (b02Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(b02Var.getText().toString().trim())) {
                z4 = true;
            }
            x02Var.w1(z4);
        }
        x02Var.I0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 - i2 >= 1) {
            this.a = true;
        }
        x02 x02Var = this.d;
        if (x02Var.B4 == null) {
            x02Var.O0();
        }
        if (x02Var.B4.getAdapter() != null) {
            x02Var.B4.setReversed(true);
            x02Var.B4.getAdapter().U(charSequence, x02Var.M2.getEditText().getSelectionStart(), null, false, false);
            x02Var.E1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
