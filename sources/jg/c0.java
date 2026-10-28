package jg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.uz;
public final class c0 implements TextWatcher {
    public final i0 f15654a;

    public c0(i0 i0Var) {
        this.f15654a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        i0 i0Var = this.f15654a;
        bi.r1 r1Var = i0Var.f15728s;
        uz uzVar = i0Var.E;
        f0 f0Var = i0Var.f15730x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (uzVar != null) {
                uzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (r1Var.getAdapter() != f0Var) {
            currentTop = i0Var.getCurrentTop();
            uzVar.c();
            r1Var.setAdapter(f0Var);
            f0Var.l();
            if (currentTop > 0) {
                i0Var.v.h1(0, -currentTop);
            }
        }
        g0 g0Var = i0Var.f15731y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f15711f;
            bi.r1 r1Var2 = i0Var2.f15728s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = c2.f(UserConfig.selectedAccount).f15659b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                b2 b2Var = (b2) arrayList2.get(i10);
                if (!c2.g(b2Var.f15640b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(b2Var.f15640b);
                    if (translitSafe2.startsWith(translitSafe) || wh.u(" ", translitSafe, translitSafe2)) {
                        arrayList.add(b2Var);
                    }
                }
            }
            s4.h0 adapter = r1Var2.getAdapter();
            g0 g0Var2 = i0Var2.f15731y;
            if (adapter != g0Var2) {
                r1Var2.setAdapter(g0Var2);
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
