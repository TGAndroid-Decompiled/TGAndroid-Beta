package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.ui.qb0;
public final class w3 implements TextWatcher {
    public final int f1062a;
    public boolean f1063b;
    public final View f1064c;

    public w3(int i3, View view) {
        this.f1062a = i3;
        this.f1064c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3;
        int j10;
        int i10 = this.f1062a;
        View view = this.f1064c;
        switch (i10) {
            case 0:
                u3 u3Var = (u3) view;
                if (!this.f1063b && editable.length() > 12) {
                    this.f1063b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.F3(u3Var);
                    try {
                        u3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f1063b = false;
                    return;
                }
                return;
            case 1:
                qb0 qb0Var = (qb0) view;
                if (this.f1063b) {
                    if (qb0Var.f48839f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (qb0Var.E) {
                            qb0Var.f48839f.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(qb0Var.f48839f, true, 0.1f, true, true);
                        return;
                    } else if (qb0Var.f48839f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(qb0Var.f48839f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f1063b) {
                    TextView textView = (TextView) view;
                    this.f1063b = isEmpty;
                    if (isEmpty) {
                        i3 = 2131746329;
                    } else {
                        i3 = 2131754486;
                    }
                    textView.setText(bd.M0(i3, null));
                    return;
                }
                return;
            default:
                ug.l2 l2Var = (ug.l2) view;
                ug.k2 k2Var = l2Var.f56141r0;
                if (this.f1063b && l2Var.f56147x0 > 0 && l2Var.f56148y0 > 0 && !l2Var.A0 && k2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f22608q.y / 3.0f;
                    float height = k2Var.getLayout().getHeight();
                    if (height > f10 && (j10 = Utilities.j((int) ((f10 / height) * l2Var.getBaseFontSize()), l2Var.f56148y0, l2Var.f56147x0)) != l2Var.getBaseFontSize()) {
                        l2Var.setBaseFontSize(j10);
                        Runnable runnable = l2Var.f56149z0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                l2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        boolean z10;
        switch (this.f1062a) {
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
                this.f1063b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f1062a;
    }

    public w3(lg.y0 y0Var, TextView textView) {
        this.f1062a = 2;
        this.f1064c = textView;
        this.f1063b = TextUtils.isEmpty(y0Var.getText());
    }

    public w3(qb0 qb0Var, boolean z10) {
        this.f1062a = 1;
        this.f1064c = qb0Var;
        this.f1063b = z10;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
