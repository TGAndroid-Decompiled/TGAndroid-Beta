package ig;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.vz;
public final class c0 implements TextWatcher {
    public final i0 f12858a;

    public c0(i0 i0Var) {
        this.f12858a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        i0 i0Var = this.f12858a;
        ai.u1 u1Var = i0Var.f12925s;
        vz vzVar = i0Var.E;
        f0 f0Var = i0Var.f12927x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (u1Var.getAdapter() != f0Var) {
            currentTop = i0Var.getCurrentTop();
            vzVar.c();
            u1Var.setAdapter(f0Var);
            f0Var.l();
            if (currentTop > 0) {
                i0Var.v.h1(0, -currentTop);
            }
        }
        g0 g0Var = i0Var.f12928y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f12907f;
            ai.u1 u1Var2 = i0Var2.f12925s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = y1.f(UserConfig.selectedAccount).f13094b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                x1 x1Var = (x1) arrayList2.get(i10);
                if (!y1.g(x1Var.f13081b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(x1Var.f13081b);
                    if (translitSafe2.startsWith(translitSafe) || wh.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(x1Var);
                    }
                }
            }
            s4.g0 adapter = u1Var2.getAdapter();
            g0 g0Var2 = i0Var2.f12928y;
            if (adapter != g0Var2) {
                u1Var2.setAdapter(g0Var2);
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
