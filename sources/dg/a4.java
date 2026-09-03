package dg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.fe0;
public final class a4 implements TextWatcher {
    public final int f4379a = 0;
    public boolean f4380b;
    public final ViewGroup f4381c;

    public a4(b4 b4Var) {
        this.f4381c = b4Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f4379a) {
            case 0:
                b4 b4Var = (b4) this.f4381c;
                z3 z3Var = b4Var.f4412n0;
                if (this.f4380b && b4Var.f4418t0 > 0 && b4Var.f4419u0 > 0 && !b4Var.f4421w0 && z3Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = z3Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * b4Var.getBaseFontSize()), b4Var.f4419u0, b4Var.f4418t0)) != b4Var.getBaseFontSize()) {
                        b4Var.setBaseFontSize(clamp);
                        Runnable runnable = b4Var.f4420v0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                b4Var.s();
                return;
            default:
                fe0 fe0Var = (fe0) this.f4381c;
                if (this.f4380b) {
                    if (fe0Var.f34052f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (fe0Var.f34058y) {
                            fe0Var.f34052f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(fe0Var.f34052f, true, 0.1f, true);
                        return;
                    } else if (fe0Var.f34052f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(fe0Var.f34052f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4;
        switch (this.f4379a) {
            case 0:
                if (i12 > 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f4380b = z4;
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f4379a;
    }

    public a4(fe0 fe0Var, boolean z4) {
        this.f4381c = fe0Var;
        this.f4380b = z4;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
