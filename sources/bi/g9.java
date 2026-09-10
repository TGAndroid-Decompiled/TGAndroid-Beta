package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class g9 implements TextWatcher {
    public final i9 f2753a;

    public g9(i9 i9Var) {
        this.f2753a = i9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        i9 i9Var = this.f2753a;
        i9Var.f2879s0 = obj;
        if (!i9Var.Z) {
            String str = i9Var.f2884x0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                i9Var.Z();
                String str3 = i9Var.f2879s0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i9Var.f2883w0 = z10;
            }
            String str4 = i9Var.I0;
            String str5 = i9Var.f2879s0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                i9Var.Y();
                String str6 = i9Var.f2879s0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) i9Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                i9Var.D0 = z11;
            }
            z8 z8Var = i9Var.f2886z0;
            AndroidUtilities.cancelRunOnUIThread(z8Var);
            AndroidUtilities.runOnUIThread(z8Var, 400L);
            z8 z8Var2 = i9Var.K0;
            AndroidUtilities.cancelRunOnUIThread(z8Var2);
            AndroidUtilities.runOnUIThread(z8Var2, 400L);
        }
        i9Var.f2877q0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
