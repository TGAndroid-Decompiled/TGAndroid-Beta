package mg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import lh.n2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.q61;
public final class q extends q61 {
    public boolean a2;
    public final s f14103b2;

    public q(s sVar, s sVar2, Activity activity, f6 f6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, f6Var, 16, i10);
        this.f14103b2 = sVar;
        this.a2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.f14103b2.f14136b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.f14103b2;
        int i10 = sVar.G;
        ArrayList arrayList = sVar.C;
        LinkedHashMap linkedHashMap = sVar.B;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            u5 u5Var = (u5) linkedHashMap.remove(l10);
            u5Var.setRemoved(new n2(18, this, u5Var));
            sVar.W(u5Var);
            sVar.f14136b.x(l10, true);
            sVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            qc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = sVar.f14139n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                u5 e = s0.e(document, l10, sVar.f14139n.getFontMetricsInt());
                e.cacheType = l5.g();
                e.setAdded();
                arrayList.add(k7.n.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                sVar.f14139n.getText().insert(editTextSelectionEnd, spannableString);
                sVar.f14139n.setSelection(editTextSelectionEnd + spannableString.length());
                sVar.f14136b.x(l10, true);
                sVar.Y(true);
                sVar.W(e);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }
}
