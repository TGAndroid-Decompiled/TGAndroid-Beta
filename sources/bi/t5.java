package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.tb0;
public final class t5 implements TextWatcher {
    public final int f4090a;
    public boolean f4091b;
    public final View f4092c;

    public t5(int i7, View view) {
        this.f4090a = i7;
        this.f4092c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f4090a;
        View view = this.f4092c;
        switch (i10) {
            case 0:
                r5 r5Var = (r5) view;
                if (!this.f4091b && editable.length() > 12) {
                    this.f4091b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.D3(r5Var);
                    try {
                        r5Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f4091b = false;
                    return;
                }
                return;
            case 1:
                tb0 tb0Var = (tb0) view;
                if (this.f4091b) {
                    if (tb0Var.f52242f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (tb0Var.E) {
                            tb0Var.f52242f.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(tb0Var.f52242f, true, 0.1f, true, true);
                        return;
                    } else if (tb0Var.f52242f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(tb0Var.f52242f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f4091b) {
                    TextView textView = (TextView) view;
                    this.f4091b = isEmpty;
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
                if (this.f4091b && m2Var.f58033x0 > 0 && m2Var.f58034y0 > 0 && !m2Var.A0 && l2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f24121q.y / 3.0f;
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
        switch (this.f4090a) {
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
                this.f4091b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f4090a;
    }

    public t5(kg.a1 a1Var, TextView textView) {
        this.f4090a = 2;
        this.f4092c = textView;
        this.f4091b = TextUtils.isEmpty(a1Var.getText());
    }

    public t5(tb0 tb0Var, boolean z10) {
        this.f4090a = 1;
        this.f4092c = tb0Var;
        this.f4091b = z10;
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
