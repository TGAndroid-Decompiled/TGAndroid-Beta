package ch;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import bi.a4;
import c8.j9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.r5;
import org.telegram.ui.s11;
public final class m extends s11 {
    public boolean f6305e2;
    public final o f6306f2;

    public m(o oVar, o oVar2, Activity activity, g6 g6Var, int i7) {
        super(oVar2, activity, false, null, 6, false, g6Var, 16, i7);
        this.f6306f2 = oVar;
        this.f6305e2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f6305e2) {
            this.f6305e2 = false;
            this.f6306f2.f6340b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.f6306f2;
        int i7 = oVar.N;
        ArrayList arrayList = oVar.I;
        LinkedHashMap linkedHashMap = oVar.H;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            r5 r5Var = (r5) linkedHashMap.remove(l10);
            r5Var.setRemoved(new a4(17, this, r5Var));
            oVar.c0(r5Var);
            oVar.f6340b.x(l10, true);
            oVar.e0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i7) {
            hc.a0(oVar).t(id.G(i7, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                r5 e10 = q0.e(document, l10, oVar.h.getFontMetricsInt());
                e10.cacheType = i5.f();
                e10.setAdded();
                arrayList.add(j9.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e10);
                spannableString.setSpan(e10, 0, spannableString.length(), 33);
                oVar.h.getText().insert(editTextSelectionEnd, spannableString);
                oVar.h.setSelection(editTextSelectionEnd + spannableString.length());
                oVar.f6340b.x(l10, true);
                oVar.e0(true);
                oVar.c0(e10);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
    }
}
