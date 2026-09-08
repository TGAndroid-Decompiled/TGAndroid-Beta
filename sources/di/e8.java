package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class e8 implements TextWatcher {
    public final g8 f7198a;

    public e8(g8 g8Var) {
        this.f7198a = g8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        g8 g8Var = this.f7198a;
        g8Var.f7317s0 = obj;
        if (!g8Var.Z) {
            String str = g8Var.f7322x0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                g8Var.Z();
                String str3 = g8Var.f7317s0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g8Var.f7321w0 = z10;
            }
            String str4 = g8Var.I0;
            String str5 = g8Var.f7317s0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                g8Var.Y();
                String str6 = g8Var.f7317s0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) g8Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                g8Var.D0 = z11;
            }
            y7 y7Var = g8Var.f7324z0;
            AndroidUtilities.cancelRunOnUIThread(y7Var);
            AndroidUtilities.runOnUIThread(y7Var, 400L);
            y7 y7Var2 = g8Var.K0;
            AndroidUtilities.cancelRunOnUIThread(y7Var2);
            AndroidUtilities.runOnUIThread(y7Var2, 400L);
        }
        g8Var.f7315q0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
