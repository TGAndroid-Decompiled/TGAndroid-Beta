package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class tt0 implements View.OnFocusChangeListener {
    public final byte a;
    public final Object b;

    public tt0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        u67 u67Var;
        q2a q2aVar;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                wt0 wt0Var = ((au0) obj).W;
                if (z) {
                    f = 1.0f;
                }
                wt0Var.b(f, f, true);
                return;
            case 1:
                wt0 wt0Var2 = ((ik1) obj).K0;
                if (z) {
                    f = 1.0f;
                }
                wt0Var2.b(f, f, true);
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((jn2) obj).c;
                if (!z && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((kn2) obj).d;
                if (!z && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    return;
                }
                return;
            case 4:
                k92 k92Var = (k92) obj;
                if (z) {
                    k92Var.K(true);
                    Runnable runnable = k92Var.g2;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                k92Var.J();
                return;
            case 5:
                nk3 nk3Var = (nk3) obj;
                if (z) {
                    nk3Var.Z.b(true);
                    return;
                }
                return;
            case 6:
                mh6 mh6Var = ((ze6) obj).a0;
                if (z) {
                    mh6Var.c.setEditText((EditText) view);
                    mh6Var.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                gt7 gt7Var = (gt7) obj;
                if (z) {
                    f = 1.0f;
                }
                gt7Var.b(f, f, true);
                return;
            case 8:
                gt7 gt7Var2 = ((if6) obj).y;
                if (z) {
                    f = 1.0f;
                }
                gt7Var2.b(f, f, true);
                return;
            case 9:
                gt7 gt7Var3 = ((pf6) obj).b;
                if (z) {
                    f = 1.0f;
                }
                gt7Var3.b(f, f, true);
                return;
            case 10:
                mh6 mh6Var2 = ((sf6) obj).E;
                if (z) {
                    mh6Var2.c.setEditText((EditText) view);
                    mh6Var2.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 11:
                gt7 gt7Var4 = ((cg6) obj).a;
                if (z) {
                    f = 1.0f;
                }
                gt7Var4.b(f, f, true);
                return;
            case 12:
                mh6 mh6Var3 = ((rg6) obj).v0;
                if (z) {
                    mh6Var3.c.setEditText((EditText) view);
                    mh6Var3.c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 13:
                gt7 gt7Var5 = ((lh6) obj).e;
                if (z) {
                    f = 1.0f;
                }
                gt7Var5.b(f, f, true);
                return;
            case 14:
                ((u67) obj).o1.c(z, !TextUtils.isEmpty(u67Var.p1.getText()));
                return;
            case 15:
                gt7 gt7Var6 = ((PasscodeActivity) obj).f;
                if (z) {
                    f = 1.0f;
                }
                gt7Var6.b(f, f, true);
                return;
            case 16:
                ((xk9) obj).o(z);
                return;
            case 17:
                ((q2a) obj).l1.c(z, !TextUtils.isEmpty(q2aVar.m1.getText()));
                return;
            case 18:
                njb njbVar = ((zob) obj).d;
                if (z) {
                    njbVar.setText(gm.S2(jb6.M0(2131743869, null)));
                    return;
                } else {
                    njbVar.setText(gm.S2(jb6.M0(2131743870, null)));
                    return;
                }
            case 19:
                gt7 gt7Var7 = ((TwoStepVerificationActivity) obj).w;
                if (z) {
                    f = 1.0f;
                }
                gt7Var7.b(f, f, true);
                return;
            default:
                nsc nscVar = (nsc) obj;
                if (z) {
                    nscVar.setError(false);
                    nscVar.e();
                    String lowerCase = nscVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        nscVar.a();
                    } else {
                        nscVar.f(lowerCase);
                    }
                } else {
                    nscVar.a();
                    if (!nscVar.w && !nscVar.b()) {
                        nscVar.setError(true);
                    }
                }
                nscVar.d();
                return;
        }
    }
}
