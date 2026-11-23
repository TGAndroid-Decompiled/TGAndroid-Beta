package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.tb0;
public final class y5 implements TextWatcher {
    public final int f4264a;
    public boolean f4265b;
    public final View f4266c;

    public y5(int i7, View view) {
        this.f4264a = i7;
        this.f4266c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f4264a;
        View view = this.f4266c;
        switch (i10) {
            case 0:
                w5 w5Var = (w5) view;
                if (!this.f4265b && editable.length() > 12) {
                    this.f4265b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.D3(w5Var);
                    try {
                        w5Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f4265b = false;
                    return;
                }
                return;
            case 1:
                tb0 tb0Var = (tb0) view;
                if (this.f4265b) {
                    if (tb0Var.f52343f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (tb0Var.E) {
                            tb0Var.f52343f.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(tb0Var.f52343f, true, 0.1f, true, true);
                        return;
                    } else if (tb0Var.f52343f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(tb0Var.f52343f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f4265b) {
                    TextView textView = (TextView) view;
                    this.f4265b = isEmpty;
                    if (isEmpty) {
                        i7 = 2131746125;
                    } else {
                        i7 = 2131754483;
                    }
                    textView.setText(gd.N0(i7, null));
                    return;
                }
                return;
            default:
                tg.q2 q2Var = (tg.q2) view;
                tg.p2 p2Var = q2Var.f58178s0;
                if (this.f4265b && q2Var.f58184y0 > 0 && q2Var.f58185z0 > 0 && !q2Var.B0 && p2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f24226q.y / 3.0f;
                    float height = p2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * q2Var.getBaseFontSize()), q2Var.f58185z0, q2Var.f58184y0)) != q2Var.getBaseFontSize()) {
                        q2Var.setBaseFontSize(j3);
                        Runnable runnable = q2Var.A0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                q2Var.t();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.f4264a) {
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
                this.f4265b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f4264a;
    }

    public y5(kg.z0 z0Var, TextView textView) {
        this.f4264a = 2;
        this.f4266c = textView;
        this.f4265b = TextUtils.isEmpty(z0Var.getText());
    }

    public y5(tb0 tb0Var, boolean z10) {
        this.f4264a = 1;
        this.f4266c = tb0Var;
        this.f4265b = z10;
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
