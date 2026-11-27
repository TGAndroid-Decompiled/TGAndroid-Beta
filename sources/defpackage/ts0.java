package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ts0 implements View.OnFocusChangeListener {
    public final byte a;
    public final Object b;

    public ts0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        a77 a77Var;
        h4a h4aVar;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                ws0 ws0Var = ((at0) obj).W;
                if (z) {
                    f = 1.0f;
                }
                ws0Var.b(f, f, true);
                return;
            case 1:
                ws0 ws0Var2 = ((ij1) obj).K0;
                if (z) {
                    f = 1.0f;
                }
                ws0Var2.b(f, f, true);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((qm2) obj).c;
                if (!z && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((rm2) obj).d;
                if (!z && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 4:
                q82 q82Var = (q82) obj;
                if (z) {
                    q82Var.K(true);
                    Runnable runnable = q82Var.h2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                q82Var.J();
                return;
            case 5:
                uj3 uj3Var = (uj3) obj;
                if (z) {
                    uj3Var.Z.b(true);
                    return;
                }
                return;
            case 6:
                qh6 qh6Var = ((df6) obj).a0;
                if (z) {
                    qh6Var.c.setEditText((EditText) view);
                    qh6Var.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                lu7 lu7Var = (lu7) obj;
                if (z) {
                    f = 1.0f;
                }
                lu7Var.b(f, f, true);
                return;
            case 8:
                lu7 lu7Var2 = ((lf6) obj).y;
                if (z) {
                    f = 1.0f;
                }
                lu7Var2.b(f, f, true);
                return;
            case 9:
                lu7 lu7Var3 = ((sf6) obj).b;
                if (z) {
                    f = 1.0f;
                }
                lu7Var3.b(f, f, true);
                return;
            case 10:
                qh6 qh6Var2 = ((vf6) obj).E;
                if (z) {
                    qh6Var2.c.setEditText((EditText) view);
                    qh6Var2.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 11:
                lu7 lu7Var4 = ((fg6) obj).a;
                if (z) {
                    f = 1.0f;
                }
                lu7Var4.b(f, f, true);
                return;
            case 12:
                qh6 qh6Var3 = ((tg6) obj).v0;
                if (z) {
                    qh6Var3.c.setEditText((EditText) view);
                    qh6Var3.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 13:
                lu7 lu7Var5 = ((ph6) obj).e;
                if (z) {
                    f = 1.0f;
                }
                lu7Var5.b(f, f, true);
                return;
            case 14:
                ((a77) obj).o1.c(z, !TextUtils.isEmpty(a77Var.p1.getText()));
                return;
            case 15:
                lm7 lm7Var = (lm7) obj;
                if (z && lm7Var.y != null) {
                    lm7Var.I0(true);
                    lm7Var.y.setCloseButtonVisible(true);
                    if (!lm7Var.y.r.isFocused()) {
                        lm7Var.y.r.requestFocus();
                    }
                    hl.E3(lm7Var.y.r);
                    return;
                }
                return;
            case 16:
                lu7 lu7Var6 = ((PasscodeActivity) obj).f;
                if (z) {
                    f = 1.0f;
                }
                lu7Var6.b(f, f, true);
                return;
            case 17:
                ((km9) obj).o(z);
                return;
            case 18:
                ((h4a) obj).l1.c(z, !TextUtils.isEmpty(h4aVar.m1.getText()));
                return;
            case 19:
                ilb ilbVar = ((xqb) obj).d;
                if (z) {
                    ilbVar.setText(hl.S2(ob6.M0(2131743837, null)));
                    return;
                } else {
                    ilbVar.setText(hl.S2(ob6.M0(2131743838, null)));
                    return;
                }
            case 20:
                lu7 lu7Var7 = ((TwoStepVerificationActivity) obj).w;
                if (z) {
                    f = 1.0f;
                }
                lu7Var7.b(f, f, true);
                return;
            default:
                zuc zucVar = (zuc) obj;
                if (z) {
                    zucVar.setError(false);
                    zucVar.e();
                    String lowerCase = zucVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        zucVar.a();
                    } else {
                        zucVar.f(lowerCase);
                    }
                } else {
                    zucVar.a();
                    if (!zucVar.w && !zucVar.b()) {
                        zucVar.setError(true);
                    }
                }
                zucVar.d();
                return;
        }
    }
}
