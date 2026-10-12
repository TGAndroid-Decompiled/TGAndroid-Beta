package hg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.f00;
public final class d0 implements TextWatcher {
    public final j0 f11196a;

    public d0(j0 j0Var) {
        this.f11196a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        j0 j0Var = this.f11196a;
        ai.w0 w0Var = j0Var.f11274s;
        f00 f00Var = j0Var.E;
        g0 g0Var = j0Var.f11276x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (f00Var != null) {
                f00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (w0Var.getAdapter() != g0Var) {
            currentTop = j0Var.getCurrentTop();
            f00Var.c();
            w0Var.setAdapter(g0Var);
            g0Var.l();
            if (currentTop > 0) {
                j0Var.v.h1(0, -currentTop);
            }
        }
        h0 h0Var = j0Var.f11277y;
        if (h0Var != null) {
            j0 j0Var2 = h0Var.f11259f;
            ai.w0 w0Var2 = j0Var2.f11274s;
            ArrayList arrayList = h0Var.d;
            arrayList.clear();
            h0Var.f11258e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = c2.f(UserConfig.selectedAccount).f11181b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                b2 b2Var = (b2) arrayList2.get(i10);
                if (!c2.g(b2Var.f11173b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(b2Var.f11173b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(b2Var);
                    }
                }
            }
            s4.i0 adapter = w0Var2.getAdapter();
            h0 h0Var2 = j0Var2.f11277y;
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
