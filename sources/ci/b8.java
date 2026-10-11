package ci;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class b8 implements TextWatcher {
    public final d8 f4791a;

    public b8(d8 d8Var) {
        this.f4791a = d8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        d8 d8Var = this.f4791a;
        d8Var.f4962s0 = obj;
        if (!d8Var.Z) {
            String str = d8Var.f4967x0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                d8Var.a0();
                String str3 = d8Var.f4962s0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d8Var.f4966w0 = z10;
            }
            String str4 = d8Var.I0;
            String str5 = d8Var.f4962s0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                d8Var.Z();
                String str6 = d8Var.f4962s0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.e3) d8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                d8Var.D0 = z11;
            }
            v7 v7Var = d8Var.f4969z0;
            AndroidUtilities.cancelRunOnUIThread(v7Var);
            AndroidUtilities.runOnUIThread(v7Var, 400L);
            v7 v7Var2 = d8Var.K0;
            AndroidUtilities.cancelRunOnUIThread(v7Var2);
            AndroidUtilities.runOnUIThread(v7Var2, 400L);
        }
        d8Var.f4960q0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
