package ah;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.z51;
public final class y extends z51 {
    public boolean f907d2;
    public final a0 f908e2;

    public y(a0 a0Var, a0 a0Var2, Activity activity, d6 d6Var, int i10) {
        super(a0Var2, activity, false, null, 6, false, d6Var, 16, i10);
        this.f908e2 = a0Var;
        this.f907d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f907d2) {
            this.f907d2 = false;
            this.f908e2.f642b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.f908e2;
        int i10 = a0Var.J;
        ArrayList arrayList = a0Var.F;
        LinkedHashMap linkedHashMap = a0Var.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            a6 a6Var = (a6) linkedHashMap.remove(l4);
            a6Var.setRemoved(new a1.f(9, this, a6Var));
            a0Var.W(a6Var);
            a0Var.f642b.x(l4, true);
            a0Var.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            xc.a0(a0Var).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = a0Var.f645n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                a6 e = l1.e(document, l4, a0Var.f645n.getFontMetricsInt());
                e.cacheType = r5.g();
                e.setAdded();
                arrayList.add(w7.r.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                a0Var.f645n.getText().insert(editTextSelectionEnd, spannableString);
                a0Var.f645n.setSelection(editTextSelectionEnd + spannableString.length());
                a0Var.f642b.x(l4, true);
                a0Var.Y(true);
                a0Var.W(e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
