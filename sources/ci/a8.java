package ci;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class a8 implements TextWatcher {
    public final c8 f4704a;

    public a8(c8 c8Var) {
        this.f4704a = c8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        c8 c8Var = this.f4704a;
        c8Var.f4825q0 = obj;
        if (!c8Var.Z) {
            String str = c8Var.f4830v0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                c8Var.Y();
                String str3 = c8Var.f4825q0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c8Var.f4829u0 = z10;
            }
            String str4 = c8Var.G0;
            String str5 = c8Var.f4825q0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                c8Var.X();
                String str6 = c8Var.f4825q0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) c8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                c8Var.B0 = z11;
            }
            v7 v7Var = c8Var.f4832x0;
            AndroidUtilities.cancelRunOnUIThread(v7Var);
            AndroidUtilities.runOnUIThread(v7Var, 400L);
            v7 v7Var2 = c8Var.I0;
            AndroidUtilities.cancelRunOnUIThread(v7Var2);
            AndroidUtilities.runOnUIThread(v7Var2, 400L);
        }
        c8Var.f4823o0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
