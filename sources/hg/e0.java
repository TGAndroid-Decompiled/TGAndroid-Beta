package hg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nz;
public final class e0 implements TextWatcher {
    public final k0 f10242a;

    public e0(k0 k0Var) {
        this.f10242a = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        k0 k0Var = this.f10242a;
        ai.w0 w0Var = k0Var.f10312s;
        nz nzVar = k0Var.E;
        h0 h0Var = k0Var.f10314x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (nzVar != null) {
                nzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (w0Var.getAdapter() != h0Var) {
            currentTop = k0Var.getCurrentTop();
            nzVar.c();
            w0Var.setAdapter(h0Var);
            h0Var.l();
            if (currentTop > 0) {
                k0Var.v.h1(0, -currentTop);
            }
        }
        i0 i0Var = k0Var.f10315y;
        if (i0Var != null) {
            k0 k0Var2 = i0Var.f10297f;
            ai.w0 w0Var2 = k0Var2.f10312s;
            ArrayList arrayList = i0Var.d;
            arrayList.clear();
            i0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = c2.f(UserConfig.selectedAccount).f10225b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                b2 b2Var = (b2) arrayList2.get(i10);
                if (!c2.g(b2Var.f10206b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(b2Var.f10206b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(b2Var);
                    }
                }
            }
            s4.h0 adapter = w0Var2.getAdapter();
            i0 i0Var2 = k0Var2.f10315y;
            if (adapter != i0Var2) {
                w0Var2.setAdapter(i0Var2);
            }
            i0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
