package jg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.ui.ad0;
public final class f3 implements TextWatcher {
    public final int f9976a;
    public boolean f9977b;
    public final View f9978c;

    public f3(int i10, View view) {
        this.f9976a = i10;
        this.f9978c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int j10;
        int i10;
        int i11 = this.f9976a;
        View view = this.f9978c;
        switch (i11) {
            case 0:
                g3 g3Var = (g3) view;
                e3 e3Var = g3Var.f9984q0;
                if (this.f9977b && g3Var.f9990w0 > 0 && g3Var.f9991x0 > 0 && !g3Var.f9993z0 && e3Var.getLayout() != null) {
                    float f7 = org.telegram.messenger.i0.f16172q.y / 3.0f;
                    float height = e3Var.getLayout().getHeight();
                    if (height > f7 && (j10 = Utilities.j((int) ((f7 / height) * g3Var.getBaseFontSize()), g3Var.f9991x0, g3Var.f9990w0)) != g3Var.getBaseFontSize()) {
                        g3Var.setBaseFontSize(j10);
                        Runnable runnable = g3Var.f9992y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                g3Var.s();
                return;
            case 1:
                ad0 ad0Var = (ad0) view;
                if (this.f9977b) {
                    if (ad0Var.f35756f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ad0Var.D) {
                            ad0Var.f35756f.callOnClick();
                        }
                        org.telegram.messenger.i0.Y3(ad0Var.f35756f, true, 0.1f, true, true);
                        return;
                    } else if (ad0Var.f35756f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(ad0Var.f35756f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f9977b) {
                    TextView textView = (TextView) view;
                    this.f9977b = isEmpty;
                    if (isEmpty) {
                        i10 = 2131746336;
                    } else {
                        i10 = 2131754486;
                    }
                    textView.setText(dd.L0(i10, null));
                    return;
                }
                return;
            default:
                ph.t1 t1Var = (ph.t1) view;
                if (!this.f9977b && editable.length() > 12) {
                    this.f9977b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.i0.E3(t1Var);
                    try {
                        t1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f9977b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f9976a) {
            case 0:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9977b = z10;
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f9976a;
    }

    public f3(ag.a2 a2Var, TextView textView) {
        this.f9976a = 2;
        this.f9978c = textView;
        this.f9977b = TextUtils.isEmpty(a2Var.getText());
    }

    public f3(ad0 ad0Var, boolean z10) {
        this.f9976a = 1;
        this.f9978c = ad0Var;
        this.f9977b = z10;
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
