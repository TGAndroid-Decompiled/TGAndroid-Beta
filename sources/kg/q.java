package kg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jh.w2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.d61;
public final class q extends d61 {
    public boolean Z1;
    public final s a2;

    public q(s sVar, s sVar2, Activity activity, c6 c6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, c6Var, 16, i10);
        this.a2 = sVar;
        this.Z1 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f13855b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.a2;
        int i10 = sVar.F;
        ArrayList arrayList = sVar.B;
        LinkedHashMap linkedHashMap = sVar.A;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            y5 y5Var = (y5) linkedHashMap.remove(l10);
            y5Var.setRemoved(new w2(16, this, y5Var));
            sVar.W(y5Var);
            sVar.f13855b.x(l10, true);
            sVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            tc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = sVar.f13859n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                y5 e10 = s0.e(document, l10, sVar.f13859n.getFontMetricsInt());
                e10.cacheType = p5.g();
                e10.setAdded();
                arrayList.add(i7.w.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e10);
                spannableString.setSpan(e10, 0, spannableString.length(), 33);
                sVar.f13859n.getText().insert(editTextSelectionEnd, spannableString);
                sVar.f13859n.setSelection(editTextSelectionEnd + spannableString.length());
                sVar.f13855b.x(l10, true);
                sVar.Y(true);
                sVar.W(e10);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }
}
