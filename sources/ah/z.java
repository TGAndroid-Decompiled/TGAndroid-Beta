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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.j71;
public final class z extends j71 {
    public boolean f725d2;
    public final b0 f726e2;

    public z(b0 b0Var, b0 b0Var2, Activity activity, f6 f6Var, int i10) {
        super(b0Var2, activity, false, null, 6, false, f6Var, 16, i10);
        this.f726e2 = b0Var;
        this.f725d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f725d2) {
            this.f725d2 = false;
            this.f726e2.f444b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        b0 b0Var = this.f726e2;
        int i10 = b0Var.J;
        ArrayList arrayList = b0Var.F;
        LinkedHashMap linkedHashMap = b0Var.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            z5 z5Var = (z5) linkedHashMap.remove(l4);
            z5Var.setRemoved(new a1.e(7, this, z5Var));
            b0Var.W(z5Var);
            b0Var.f444b.x(l4, true);
            b0Var.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            yc.a0(b0Var).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = b0Var.f448n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                z5 e7 = m1.e(document, l4, b0Var.f448n.getFontMetricsInt());
                e7.cacheType = q5.g();
                e7.setAdded();
                arrayList.add(w7.p.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e7);
                spannableString.setSpan(e7, 0, spannableString.length(), 33);
                b0Var.f448n.getText().insert(editTextSelectionEnd, spannableString);
                b0Var.f448n.setSelection(editTextSelectionEnd + spannableString.length());
                b0Var.f444b.x(l4, true);
                b0Var.Y(true);
                b0Var.W(e7);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
