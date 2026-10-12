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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.r71;
public final class y extends r71 {
    public boolean f901d2;
    public final a0 f902e2;

    public y(a0 a0Var, a0 a0Var2, Activity activity, c6 c6Var, int i10) {
        super(a0Var2, activity, false, null, 6, false, c6Var, 16, i10);
        this.f902e2 = a0Var;
        this.f901d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f901d2) {
            this.f901d2 = false;
            this.f902e2.f636b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        a0 a0Var = this.f902e2;
        int i10 = a0Var.J;
        ArrayList arrayList = a0Var.F;
        LinkedHashMap linkedHashMap = a0Var.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            b6 b6Var = (b6) linkedHashMap.remove(l4);
            b6Var.setRemoved(new a1.f(9, this, b6Var));
            a0Var.W(b6Var);
            a0Var.f636b.x(l4, true);
            a0Var.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            zc.a0(a0Var).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = a0Var.f639n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                b6 e = l1.e(document, l4, a0Var.f639n.getFontMetricsInt());
                e.cacheType = s5.g();
                e.setAdded();
                arrayList.add(w7.s.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                a0Var.f639n.getText().insert(editTextSelectionEnd, spannableString);
                a0Var.f639n.setSelection(editTextSelectionEnd + spannableString.length());
                a0Var.f636b.x(l4, true);
                a0Var.Y(true);
                a0Var.W(e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
