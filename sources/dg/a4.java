package dg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.de0;
public final class a4 implements TextWatcher {
    public final int f4373a = 0;
    public boolean f4374b;
    public final ViewGroup f4375c;

    public a4(b4 b4Var) {
        this.f4375c = b4Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f4373a) {
            case 0:
                b4 b4Var = (b4) this.f4375c;
                z3 z3Var = b4Var.f4406n0;
                if (this.f4374b && b4Var.f4412t0 > 0 && b4Var.f4413u0 > 0 && !b4Var.f4415w0 && z3Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = z3Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * b4Var.getBaseFontSize()), b4Var.f4413u0, b4Var.f4412t0)) != b4Var.getBaseFontSize()) {
                        b4Var.setBaseFontSize(clamp);
                        Runnable runnable = b4Var.f4414v0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                b4Var.s();
                return;
            default:
                de0 de0Var = (de0) this.f4375c;
                if (this.f4374b) {
                    if (de0Var.f33607f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (de0Var.f33613y) {
                            de0Var.f33607f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(de0Var.f33607f, true, 0.1f, true);
                        return;
                    } else if (de0Var.f33607f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(de0Var.f33607f, false, 0.1f, true);
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
        switch (this.f4373a) {
            case 0:
                if (i12 > 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f4374b = z4;
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f4373a;
    }

    public a4(de0 de0Var, boolean z4) {
        this.f4375c = de0Var;
        this.f4374b = z4;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
