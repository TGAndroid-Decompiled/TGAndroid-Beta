package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class p7 implements TextWatcher {

    public final r7 f16532a;

    public p7(r7 r7Var) {
        this.f16532a = r7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        r7 r7Var = this.f16532a;
        r7Var.f16664o0 = string;
        if (!r7Var.V) {
            String str = r7Var.f16669t0;
            if (string == null) {
                string = "";
            }
            boolean zEquals = TextUtils.equals(str, string);
            boolean z10 = false;
            if (!zEquals) {
                r7Var.Z();
                String str2 = r7Var.f16664o0;
                r7Var.f16668s0 = str2 != null && str2.length() > 0;
            }
            String str3 = r7Var.E0;
            String str4 = r7Var.f16664o0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                r7Var.Y();
                String str5 = r7Var.f16664o0;
                if (str5 != null && str5.length() > 3 && !TextUtils.isEmpty(MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) r7Var).currentAccount).config.musicSearchUsername.get())) {
                    z10 = true;
                }
                r7Var.f16675z0 = z10;
            }
            l7 l7Var = r7Var.f16671v0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 400L);
            l7 l7Var2 = r7Var.G0;
            AndroidUtilities.cancelRunOnUIThread(l7Var2);
            AndroidUtilities.runOnUIThread(l7Var2, 400L);
        }
        r7Var.m0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
