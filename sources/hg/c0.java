package hg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.mz;
public final class c0 implements TextWatcher {
    public final i0 f10248a;

    public c0(i0 i0Var) {
        this.f10248a = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        i0 i0Var = this.f10248a;
        ai.w0 w0Var = i0Var.f10312s;
        mz mzVar = i0Var.E;
        f0 f0Var = i0Var.f10314x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (w0Var.getAdapter() != f0Var) {
            currentTop = i0Var.getCurrentTop();
            mzVar.c();
            w0Var.setAdapter(f0Var);
            f0Var.l();
            if (currentTop > 0) {
                i0Var.v.h1(0, -currentTop);
            }
        }
        g0 g0Var = i0Var.f10315y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f10298f;
            ai.w0 w0Var2 = i0Var2.f10312s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = b2.f(UserConfig.selectedAccount).f10235b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                a2 a2Var = (a2) arrayList2.get(i10);
                if (!b2.g(a2Var.f10223b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(a2Var.f10223b);
                    if (translitSafe2.startsWith(translitSafe) || wh.u(" ", translitSafe, translitSafe2)) {
                        arrayList.add(a2Var);
                    }
                }
            }
            s4.h0 adapter = w0Var2.getAdapter();
            g0 g0Var2 = i0Var2.f10315y;
            if (adapter != g0Var2) {
                w0Var2.setAdapter(g0Var2);
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
