package ig;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.yz;
public final class c0 implements TextWatcher {
    public final i0 f11465a;

    public c0(i0 i0Var) {
        this.f11465a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        i0 i0Var = this.f11465a;
        bi.o0 o0Var = i0Var.f11529s;
        yz yzVar = i0Var.E;
        f0 f0Var = i0Var.f11531x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (yzVar != null) {
                yzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (o0Var.getAdapter() != f0Var) {
            currentTop = i0Var.getCurrentTop();
            yzVar.c();
            o0Var.setAdapter(f0Var);
            f0Var.l();
            if (currentTop > 0) {
                i0Var.v.h1(0, -currentTop);
            }
        }
        g0 g0Var = i0Var.f11532y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f11515f;
            bi.o0 o0Var2 = i0Var2.f11529s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = b2.f(UserConfig.selectedAccount).f11452b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                a2 a2Var = (a2) arrayList2.get(i10);
                if (!b2.g(a2Var.f11439b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(a2Var.f11439b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(a2Var);
                    }
                }
            }
            s4.g0 adapter = o0Var2.getAdapter();
            g0 g0Var2 = i0Var2.f11532y;
            if (adapter != g0Var2) {
                o0Var2.setAdapter(g0Var2);
            }
            g0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
