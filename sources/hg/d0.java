package hg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.pz;
public final class d0 implements TextWatcher {
    public final j0 f11147a;

    public d0(j0 j0Var) {
        this.f11147a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        j0 j0Var = this.f11147a;
        ai.w0 w0Var = j0Var.f11224s;
        pz pzVar = j0Var.E;
        g0 g0Var = j0Var.f11226x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (w0Var.getAdapter() != g0Var) {
            currentTop = j0Var.getCurrentTop();
            pzVar.c();
            w0Var.setAdapter(g0Var);
            g0Var.l();
            if (currentTop > 0) {
                j0Var.v.h1(0, -currentTop);
            }
        }
        h0 h0Var = j0Var.f11227y;
        if (h0Var != null) {
            j0 j0Var2 = h0Var.f11209f;
            ai.w0 w0Var2 = j0Var2.f11224s;
            ArrayList arrayList = h0Var.d;
            arrayList.clear();
            h0Var.f11208e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = b2.f(UserConfig.selectedAccount).f11130b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                a2 a2Var = (a2) arrayList2.get(i10);
                if (!b2.g(a2Var.f11105b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(a2Var.f11105b);
                    if (translitSafe2.startsWith(translitSafe) || bi.u(" ", translitSafe, translitSafe2)) {
                        arrayList.add(a2Var);
                    }
                }
            }
            s4.h0 adapter = w0Var2.getAdapter();
            h0 h0Var2 = j0Var2.f11227y;
            if (adapter != h0Var2) {
                w0Var2.setAdapter(h0Var2);
            }
            h0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
