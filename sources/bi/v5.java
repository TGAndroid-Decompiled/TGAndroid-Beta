package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.ub0;
public final class v5 implements TextWatcher {
    public final int f4188a;
    public boolean f4189b;
    public final View f4190c;

    public v5(int i7, View view) {
        this.f4188a = i7;
        this.f4190c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f4188a;
        View view = this.f4190c;
        switch (i10) {
            case 0:
                t5 t5Var = (t5) view;
                if (!this.f4189b && editable.length() > 12) {
                    this.f4189b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.D3(t5Var);
                    try {
                        t5Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f4189b = false;
                    return;
                }
                return;
            case 1:
                ub0 ub0Var = (ub0) view;
                if (this.f4189b) {
                    if (ub0Var.f52524f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ub0Var.E) {
                            ub0Var.f52524f.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(ub0Var.f52524f, true, 0.1f, true, true);
                        return;
                    } else if (ub0Var.f52524f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(ub0Var.f52524f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f4189b) {
                    TextView textView = (TextView) view;
                    this.f4189b = isEmpty;
                    if (isEmpty) {
                        i7 = 2131746125;
                    } else {
                        i7 = 2131754483;
                    }
                    textView.setText(hd.N0(i7, null));
                    return;
                }
                return;
            default:
                tg.n2 n2Var = (tg.n2) view;
                tg.m2 m2Var = n2Var.f58087r0;
                if (this.f4189b && n2Var.f58093x0 > 0 && n2Var.f58094y0 > 0 && !n2Var.A0 && m2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f24046q.y / 3.0f;
                    float height = m2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * n2Var.getBaseFontSize()), n2Var.f58094y0, n2Var.f58093x0)) != n2Var.getBaseFontSize()) {
                        n2Var.setBaseFontSize(j3);
                        Runnable runnable = n2Var.f58095z0;
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
        switch (this.f4188a) {
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
                this.f4189b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f4188a;
    }

    public v5(kg.z0 z0Var, TextView textView) {
        this.f4188a = 2;
        this.f4190c = textView;
        this.f4189b = TextUtils.isEmpty(z0Var.getText());
    }

    public v5(ub0 ub0Var, boolean z10) {
        this.f4188a = 1;
        this.f4190c = ub0Var;
        this.f4189b = z10;
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
