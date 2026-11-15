package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.tb0;
public final class l3 implements TextWatcher {
    public final int f3670a;
    public boolean f3671b;
    public final View f3672c;

    public l3(int i7, View view) {
        this.f3670a = i7;
        this.f3672c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f3670a;
        View view = this.f3672c;
        switch (i10) {
            case 0:
                j3 j3Var = (j3) view;
                if (!this.f3671b && editable.length() > 12) {
                    this.f3671b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.E3(j3Var);
                    try {
                        j3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f3671b = false;
                    return;
                }
                return;
            case 1:
                tb0 tb0Var = (tb0) view;
                if (this.f3671b) {
                    if (tb0Var.f51527f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (tb0Var.E) {
                            tb0Var.f51527f.callOnClick();
                        }
                        org.telegram.messenger.g0.Y3(tb0Var.f51527f, true, 0.1f, true, true);
                        return;
                    } else if (tb0Var.f51527f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Y3(tb0Var.f51527f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f3671b) {
                    TextView textView = (TextView) view;
                    this.f3671b = isEmpty;
                    if (isEmpty) {
                        i7 = 2131746321;
                    } else {
                        i7 = 2131754486;
                    }
                    textView.setText(hd.M0(i7, null));
                    return;
                }
                return;
            default:
                tg.o2 o2Var = (tg.o2) view;
                tg.n2 n2Var = o2Var.f57496r0;
                if (this.f3671b && o2Var.f57502x0 > 0 && o2Var.f57503y0 > 0 && !o2Var.A0 && n2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f23609q.y / 3.0f;
                    float height = n2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * o2Var.getBaseFontSize()), o2Var.f57503y0, o2Var.f57502x0)) != o2Var.getBaseFontSize()) {
                        o2Var.setBaseFontSize(j3);
                        Runnable runnable = o2Var.f57504z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                o2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.f3670a) {
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
                this.f3671b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f3670a;
    }

    public l3(kg.x0 x0Var, TextView textView) {
        this.f3670a = 2;
        this.f3672c = textView;
        this.f3671b = TextUtils.isEmpty(x0Var.getText());
    }

    public l3(tb0 tb0Var, boolean z10) {
        this.f3670a = 1;
        this.f3672c = tb0Var;
        this.f3671b = z10;
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
