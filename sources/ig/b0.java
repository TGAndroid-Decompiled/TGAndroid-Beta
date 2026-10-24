package ig;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.tz;
public final class b0 implements TextWatcher {
    public final h0 f12859a;

    public b0(h0 h0Var) {
        this.f12859a = h0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        h0 h0Var = this.f12859a;
        ai.u1 u1Var = h0Var.f12943s;
        tz tzVar = h0Var.E;
        e0 e0Var = h0Var.f12945x;
        String obj = editable.toString();
        if (!obj.isEmpty()) {
            if (tzVar != null) {
                tzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else if (u1Var.getAdapter() != e0Var) {
            currentTop = h0Var.getCurrentTop();
            tzVar.c();
            u1Var.setAdapter(e0Var);
            e0Var.l();
            if (currentTop > 0) {
                h0Var.v.h1(0, -currentTop);
            }
        }
        f0 f0Var = h0Var.f12946y;
        if (f0Var != null) {
            h0 h0Var2 = f0Var.f12927f;
            ai.u1 u1Var2 = h0Var2.f12943s;
            ArrayList arrayList = f0Var.d;
            arrayList.clear();
            f0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = z1.f(UserConfig.selectedAccount).f13139b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                y1 y1Var = (y1) arrayList2.get(i10);
                if (!z1.g(y1Var.f13130b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(y1Var.f13130b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(y1Var);
                    }
                }
            }
            s4.g0 adapter = u1Var2.getAdapter();
            f0 f0Var2 = h0Var2.f12946y;
            if (adapter != f0Var2) {
                u1Var2.setAdapter(f0Var2);
            }
            f0Var.l();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
