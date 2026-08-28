package kh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class q7 implements TextWatcher {
    public final s7 f15885a;

    public q7(s7 s7Var) {
        this.f15885a = s7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i9;
        boolean z10;
        String obj = editable.toString();
        s7 s7Var = this.f15885a;
        s7Var.f16046o0 = obj;
        if (!s7Var.V) {
            String str = s7Var.f16051t0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                s7Var.Y();
                String str3 = s7Var.f16046o0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s7Var.f16050s0 = z10;
            }
            String str4 = s7Var.E0;
            String str5 = s7Var.f16046o0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                s7Var.X();
                String str6 = s7Var.f16046o0;
                if (str6 != null && str6.length() > 3) {
                    i9 = ((org.telegram.ui.ActionBar.f3) s7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i9).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                s7Var.f16057z0 = z11;
            }
            m7 m7Var = s7Var.f16053v0;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            AndroidUtilities.runOnUIThread(m7Var, 400L);
            m7 m7Var2 = s7Var.G0;
            AndroidUtilities.cancelRunOnUIThread(m7Var2);
            AndroidUtilities.runOnUIThread(m7Var2, 400L);
        }
        s7Var.m0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
