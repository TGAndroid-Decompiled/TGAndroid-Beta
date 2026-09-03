package eg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ee0;
public final class y3 implements TextWatcher {
    public final int f5575a = 0;
    public boolean f5576b;
    public final ViewGroup f5577c;

    public y3(z3 z3Var) {
        this.f5577c = z3Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f5575a) {
            case 0:
                z3 z3Var = (z3) this.f5577c;
                x3 x3Var = z3Var.f5599n0;
                if (this.f5576b && z3Var.f5605t0 > 0 && z3Var.f5606u0 > 0 && !z3Var.f5608w0 && x3Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = x3Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * z3Var.getBaseFontSize()), z3Var.f5606u0, z3Var.f5605t0)) != z3Var.getBaseFontSize()) {
                        z3Var.setBaseFontSize(clamp);
                        Runnable runnable = z3Var.f5607v0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                z3Var.s();
                return;
            default:
                ee0 ee0Var = (ee0) this.f5577c;
                if (this.f5576b) {
                    if (ee0Var.f36459f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ee0Var.f36465y) {
                            ee0Var.f36459f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ee0Var.f36459f, true, 0.1f, true);
                        return;
                    } else if (ee0Var.f36459f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ee0Var.f36459f, false, 0.1f, true);
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
        switch (this.f5575a) {
            case 0:
                if (i12 > 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f5576b = z4;
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f5575a;
    }

    public y3(ee0 ee0Var, boolean z4) {
        this.f5577c = ee0Var;
        this.f5576b = z4;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
