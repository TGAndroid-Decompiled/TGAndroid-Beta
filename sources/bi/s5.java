package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.ub0;
public final class s5 implements TextWatcher {
    public final int f4033a;
    public boolean f4034b;
    public final View f4035c;

    public s5(int i7, View view) {
        this.f4033a = i7;
        this.f4035c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f4033a;
        View view = this.f4035c;
        switch (i10) {
            case 0:
                q5 q5Var = (q5) view;
                if (!this.f4034b && editable.length() > 12) {
                    this.f4034b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.D3(q5Var);
                    try {
                        q5Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f4034b = false;
                    return;
                }
                return;
            case 1:
                ub0 ub0Var = (ub0) view;
                if (this.f4034b) {
                    if (ub0Var.f52506f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ub0Var.E) {
                            ub0Var.f52506f.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(ub0Var.f52506f, true, 0.1f, true, true);
                        return;
                    } else if (ub0Var.f52506f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(ub0Var.f52506f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f4034b) {
                    TextView textView = (TextView) view;
                    this.f4034b = isEmpty;
                    if (isEmpty) {
                        i7 = 2131746126;
                    } else {
                        i7 = 2131754484;
                    }
                    textView.setText(gd.M0(i7, null));
                    return;
                }
                return;
            default:
                tg.m2 m2Var = (tg.m2) view;
                tg.l2 l2Var = m2Var.f58027r0;
                if (this.f4034b && m2Var.f58033x0 > 0 && m2Var.f58034y0 > 0 && !m2Var.A0 && l2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f24118q.y / 3.0f;
                    float height = l2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * m2Var.getBaseFontSize()), m2Var.f58034y0, m2Var.f58033x0)) != m2Var.getBaseFontSize()) {
                        m2Var.setBaseFontSize(j3);
                        Runnable runnable = m2Var.f58035z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                m2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.f4033a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                if (i11 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4034b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f4033a;
    }

    public s5(kg.a1 a1Var, TextView textView) {
        this.f4033a = 2;
        this.f4035c = textView;
        this.f4034b = TextUtils.isEmpty(a1Var.getText());
    }

    public s5(ub0 ub0Var, boolean z10) {
        this.f4033a = 1;
        this.f4035c = ub0Var;
        this.f4034b = z10;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
