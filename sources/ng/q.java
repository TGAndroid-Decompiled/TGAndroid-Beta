package ng;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mh.m2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.w61;
public final class q extends w61 {
    public boolean a2;
    public final s f16175b2;

    public q(s sVar, s sVar2, Activity activity, g6 g6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, g6Var, 16, i10);
        this.f16175b2 = sVar;
        this.a2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.f16175b2.f16210b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.f16175b2;
        int i10 = sVar.G;
        ArrayList arrayList = sVar.C;
        LinkedHashMap linkedHashMap = sVar.B;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            u5 u5Var = (u5) linkedHashMap.remove(l10);
            u5Var.setRemoved(new m2(18, this, u5Var));
            sVar.W(u5Var);
            sVar.f16210b.x(l10, true);
            sVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            qc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = sVar.f16214n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                u5 e6 = s0.e(document, l10, sVar.f16214n.getFontMetricsInt());
                e6.cacheType = l5.g();
                e6.setAdded();
                arrayList.add(k7.o.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e6);
                spannableString.setSpan(e6, 0, spannableString.length(), 33);
                sVar.f16214n.getText().insert(editTextSelectionEnd, spannableString);
                sVar.f16214n.setSelection(editTextSelectionEnd + spannableString.length());
                sVar.f16210b.x(l10, true);
                sVar.Y(true);
                sVar.W(e6);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
