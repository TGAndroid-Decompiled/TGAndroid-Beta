package fi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class m7 implements TextWatcher {
    public final o7 f11255a;

    public m7(o7 o7Var) {
        this.f11255a = o7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        o7 o7Var = this.f11255a;
        o7Var.f11411r0 = obj;
        if (!o7Var.Z) {
            String str = o7Var.f11416w0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                o7Var.Z();
                String str3 = o7Var.f11411r0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o7Var.f11415v0 = z10;
            }
            String str4 = o7Var.H0;
            String str5 = o7Var.f11411r0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                o7Var.Y();
                String str6 = o7Var.f11411r0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.k3) o7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                o7Var.C0 = z11;
            }
            i7 i7Var = o7Var.f11418y0;
            AndroidUtilities.cancelRunOnUIThread(i7Var);
            AndroidUtilities.runOnUIThread(i7Var, 400L);
            i7 i7Var2 = o7Var.J0;
            AndroidUtilities.cancelRunOnUIThread(i7Var2);
            AndroidUtilities.runOnUIThread(i7Var2, 400L);
        }
        o7Var.f11409p0.O(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
