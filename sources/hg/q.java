package hg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.b61;
public final class q extends b61 {
    public boolean Z1;
    public final s a2;

    public q(s sVar, s sVar2, Activity activity, b6 b6Var, int i9) {
        super(sVar2, activity, false, null, 6, false, b6Var, 16, i9);
        this.a2 = sVar;
        this.Z1 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f10720b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.a2;
        int i9 = sVar.F;
        ArrayList arrayList = sVar.B;
        LinkedHashMap linkedHashMap = sVar.A;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            t5 t5Var = (t5) linkedHashMap.remove(l10);
            t5Var.setRemoved(new h3.g0(3, this, t5Var));
            sVar.V(t5Var);
            sVar.f10720b.x(l10, true);
            sVar.X(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i9) {
            oc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i9, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = sVar.f10724n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                t5 e10 = t0.e(document, l10, sVar.f10724n.getFontMetricsInt());
                e10.cacheType = k5.g();
                e10.setAdded();
                arrayList.add(g7.n.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e10);
                spannableString.setSpan(e10, 0, spannableString.length(), 33);
                sVar.f10724n.getText().insert(editTextSelectionEnd, spannableString);
                sVar.f10724n.setSelection(editTextSelectionEnd + spannableString.length());
                sVar.f10720b.x(l10, true);
                sVar.X(true);
                sVar.V(e10);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
    }
}
