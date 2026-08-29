package nh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class e7 implements TextWatcher {
    public final g7 f17599a;

    public e7(g7 g7Var) {
        this.f17599a = g7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        g7 g7Var = this.f17599a;
        g7Var.f17720o0 = obj;
        if (!g7Var.V) {
            String str = g7Var.f17725t0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                g7Var.Z();
                String str3 = g7Var.f17720o0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.f17724s0 = z10;
            }
            String str4 = g7Var.E0;
            String str5 = g7Var.f17720o0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                g7Var.Y();
                String str6 = g7Var.f17720o0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) g7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                g7Var.f17731z0 = z11;
            }
            a7 a7Var = g7Var.f17727v0;
            AndroidUtilities.cancelRunOnUIThread(a7Var);
            AndroidUtilities.runOnUIThread(a7Var, 400L);
            a7 a7Var2 = g7Var.G0;
            AndroidUtilities.cancelRunOnUIThread(a7Var2);
            AndroidUtilities.runOnUIThread(a7Var2, 400L);
        }
        g7Var.m0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
