package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ls0 implements View.OnFocusChangeListener {
    public final byte a;
    public final Object b;

    public ls0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        t47 t47Var;
        o0a o0aVar;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                os0 os0Var = ((ss0) obj).W;
                if (z) {
                    f = 1.0f;
                }
                os0Var.b(f, f, true);
                return;
            case 1:
                os0 os0Var2 = ((zi1) obj).K0;
                if (z) {
                    f = 1.0f;
                }
                os0Var2.b(f, f, true);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((wl2) obj).c;
                if (!z && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((xl2) obj).d;
                if (!z && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 4:
                z72 z72Var = (z72) obj;
                if (z) {
                    z72Var.K(true);
                    Runnable runnable = z72Var.g2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                z72Var.J();
                return;
            case 5:
                cj3 cj3Var = (cj3) obj;
                if (z) {
                    cj3Var.Z.b(true);
                    return;
                }
                return;
            case 6:
                mf6 mf6Var = ((ad6) obj).a0;
                if (z) {
                    mf6Var.c.setEditText((EditText) view);
                    mf6Var.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                er7 er7Var = (er7) obj;
                if (z) {
                    f = 1.0f;
                }
                er7Var.b(f, f, true);
                return;
            case 8:
                er7 er7Var2 = ((jd6) obj).y;
                if (z) {
                    f = 1.0f;
                }
                er7Var2.b(f, f, true);
                return;
            case 9:
                er7 er7Var3 = ((qd6) obj).b;
                if (z) {
                    f = 1.0f;
                }
                er7Var3.b(f, f, true);
                return;
            case 10:
                mf6 mf6Var2 = ((td6) obj).E;
                if (z) {
                    mf6Var2.c.setEditText((EditText) view);
                    mf6Var2.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 11:
                er7 er7Var4 = ((de6) obj).a;
                if (z) {
                    f = 1.0f;
                }
                er7Var4.b(f, f, true);
                return;
            case 12:
                mf6 mf6Var3 = ((qe6) obj).v0;
                if (z) {
                    mf6Var3.c.setEditText((EditText) view);
                    mf6Var3.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 13:
                er7 er7Var5 = ((lf6) obj).e;
                if (z) {
                    f = 1.0f;
                }
                er7Var5.b(f, f, true);
                return;
            case 14:
                ((t47) obj).o1.c(z, !TextUtils.isEmpty(t47Var.p1.getText()));
                return;
            case 15:
                er7 er7Var6 = ((PasscodeActivity) obj).f;
                if (z) {
                    f = 1.0f;
                }
                er7Var6.b(f, f, true);
                return;
            case 16:
                ((wi9) obj).o(z);
                return;
            case 17:
                ((o0a) obj).l1.c(z, !TextUtils.isEmpty(o0aVar.m1.getText()));
                return;
            case 18:
                mhb mhbVar = ((ymb) obj).d;
                if (z) {
                    mhbVar.setText(gl.T2(k96.M0(2131743943, null)));
                    return;
                } else {
                    mhbVar.setText(gl.T2(k96.M0(2131743944, null)));
                    return;
                }
            case 19:
                er7 er7Var7 = ((TwoStepVerificationActivity) obj).w;
                if (z) {
                    f = 1.0f;
                }
                er7Var7.b(f, f, true);
                return;
            default:
                lqc lqcVar = (lqc) obj;
                if (z) {
                    lqcVar.setError(false);
                    lqcVar.e();
                    String lowerCase = lqcVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        lqcVar.a();
                    } else {
                        lqcVar.f(lowerCase);
                    }
                } else {
                    lqcVar.a();
                    if (!lqcVar.w && !lqcVar.b()) {
                        lqcVar.setError(true);
                    }
                }
                lqcVar.d();
                return;
        }
    }
}
