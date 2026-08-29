package bg;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ud0;
public final class e4 implements TextWatcher {
    public final int f2187a = 0;
    public boolean f2188b;
    public final ViewGroup f2189c;

    public e4(f4 f4Var) {
        this.f2189c = f4Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f2187a) {
            case 0:
                f4 f4Var = (f4) this.f2189c;
                d4 d4Var = f4Var.m0;
                if (this.f2188b && f4Var.f2215s0 > 0 && f4Var.f2216t0 > 0 && !f4Var.f2218v0 && d4Var.getLayout() != null) {
                    float f9 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = d4Var.getLayout().getHeight();
                    if (height > f9 && (clamp = Utilities.clamp((int) ((f9 / height) * f4Var.getBaseFontSize()), f4Var.f2216t0, f4Var.f2215s0)) != f4Var.getBaseFontSize()) {
                        f4Var.setBaseFontSize(clamp);
                        Runnable runnable = f4Var.f2217u0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                f4Var.s();
                return;
            default:
                ud0 ud0Var = (ud0) this.f2189c;
                if (this.f2188b) {
                    if (ud0Var.f43234f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ud0Var.f43240y) {
                            ud0Var.f43234f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f43234f, true, 0.1f, true);
                        return;
                    } else if (ud0Var.f43234f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f43234f, false, 0.1f, true);
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
        boolean z10;
        switch (this.f2187a) {
            case 0:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f2188b = z10;
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f2187a;
    }

    public e4(ud0 ud0Var, boolean z10) {
        this.f2189c = ud0Var;
        this.f2188b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
