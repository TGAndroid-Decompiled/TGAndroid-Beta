package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.ub0;
public final class w5 implements TextWatcher {
    public final int f4217a;
    public boolean f4218b;
    public final View f4219c;

    public w5(int i7, View view) {
        this.f4217a = i7;
        this.f4219c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f4217a;
        View view = this.f4219c;
        switch (i10) {
            case 0:
                u5 u5Var = (u5) view;
                if (!this.f4218b && editable.length() > 12) {
                    this.f4218b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.D3(u5Var);
                    try {
                        u5Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f4218b = false;
                    return;
                }
                return;
            case 1:
                ub0 ub0Var = (ub0) view;
                if (this.f4218b) {
                    if (ub0Var.f52520f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ub0Var.E) {
                            ub0Var.f52520f.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(ub0Var.f52520f, true, 0.1f, true, true);
                        return;
                    } else if (ub0Var.f52520f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(ub0Var.f52520f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f4218b) {
                    TextView textView = (TextView) view;
                    this.f4218b = isEmpty;
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
                tg.n2 n2Var = (tg.n2) view;
                tg.m2 m2Var = n2Var.f58083r0;
                if (this.f4218b && n2Var.f58089x0 > 0 && n2Var.f58090y0 > 0 && !n2Var.A0 && m2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f24146q.y / 3.0f;
                    float height = m2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * n2Var.getBaseFontSize()), n2Var.f58090y0, n2Var.f58089x0)) != n2Var.getBaseFontSize()) {
                        n2Var.setBaseFontSize(j3);
                        Runnable runnable = n2Var.f58091z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                n2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.f4217a) {
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
                this.f4218b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f4217a;
    }

    public w5(kg.z0 z0Var, TextView textView) {
        this.f4217a = 2;
        this.f4219c = textView;
        this.f4218b = TextUtils.isEmpty(z0Var.getText());
    }

    public w5(ub0 ub0Var, boolean z10) {
        this.f4217a = 1;
        this.f4219c = ub0Var;
        this.f4218b = z10;
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
