package jg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.ui.bd0;
public final class f3 implements TextWatcher {
    public final int f9975a;
    public boolean f9976b;
    public final View f9977c;

    public f3(int i10, View view) {
        this.f9975a = i10;
        this.f9977c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int j10;
        int i10;
        int i11 = this.f9975a;
        View view = this.f9977c;
        switch (i11) {
            case 0:
                g3 g3Var = (g3) view;
                e3 e3Var = g3Var.f9983q0;
                if (this.f9976b && g3Var.f9989w0 > 0 && g3Var.f9990x0 > 0 && !g3Var.f9992z0 && e3Var.getLayout() != null) {
                    float f7 = org.telegram.messenger.i0.f16026q.y / 3.0f;
                    float height = e3Var.getLayout().getHeight();
                    if (height > f7 && (j10 = Utilities.j((int) ((f7 / height) * g3Var.getBaseFontSize()), g3Var.f9990x0, g3Var.f9989w0)) != g3Var.getBaseFontSize()) {
                        g3Var.setBaseFontSize(j10);
                        Runnable runnable = g3Var.f9991y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                g3Var.s();
                return;
            case 1:
                bd0 bd0Var = (bd0) view;
                if (this.f9976b) {
                    if (bd0Var.f36179f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (bd0Var.D) {
                            bd0Var.f36179f.callOnClick();
                        }
                        org.telegram.messenger.i0.Y3(bd0Var.f36179f, true, 0.1f, true, true);
                        return;
                    } else if (bd0Var.f36179f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(bd0Var.f36179f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f9976b) {
                    TextView textView = (TextView) view;
                    this.f9976b = isEmpty;
                    if (isEmpty) {
                        i10 = 2131746336;
                    } else {
                        i10 = 2131754486;
                    }
                    textView.setText(cd.L0(i10, null));
                    return;
                }
                return;
            default:
                ph.t1 t1Var = (ph.t1) view;
                if (!this.f9976b && editable.length() > 12) {
                    this.f9976b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.i0.E3(t1Var);
                    try {
                        t1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f9976b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f9975a) {
            case 0:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9976b = z10;
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f9975a;
    }

    public f3(ag.a2 a2Var, TextView textView) {
        this.f9975a = 2;
        this.f9977c = textView;
        this.f9976b = TextUtils.isEmpty(a2Var.getText());
    }

    public f3(bd0 bd0Var, boolean z10) {
        this.f9975a = 1;
        this.f9977c = bd0Var;
        this.f9976b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
