package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class a8 implements TextWatcher {
    public final c8 f6628a;

    public a8(c8 c8Var) {
        this.f6628a = c8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        c8 c8Var = this.f6628a;
        c8Var.f6728s0 = obj;
        if (!c8Var.Z) {
            String str = c8Var.f6733x0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                c8Var.a0();
                String str3 = c8Var.f6728s0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c8Var.f6732w0 = z10;
            }
            String str4 = c8Var.I0;
            String str5 = c8Var.f6728s0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                c8Var.Z();
                String str6 = c8Var.f6728s0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.e3) c8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                c8Var.D0 = z11;
            }
            u7 u7Var = c8Var.f6735z0;
            AndroidUtilities.cancelRunOnUIThread(u7Var);
            AndroidUtilities.runOnUIThread(u7Var, 400L);
            u7 u7Var2 = c8Var.K0;
            AndroidUtilities.cancelRunOnUIThread(u7Var2);
            AndroidUtilities.runOnUIThread(u7Var2, 400L);
        }
        c8Var.f6726q0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
