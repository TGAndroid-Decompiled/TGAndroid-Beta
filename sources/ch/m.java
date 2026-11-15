package ch;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import c8.i9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.n11;
public final class m extends n11 {
    public boolean f5138f2;
    public final o f5139g2;

    public m(o oVar, o oVar2, Activity activity, e6 e6Var, int i7) {
        super(oVar2, activity, false, null, 6, false, e6Var, 16, i7);
        this.f5139g2 = oVar;
        this.f5138f2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f5138f2) {
            this.f5138f2 = false;
            this.f5139g2.f5173b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.f5139g2;
        int i7 = oVar.O;
        ArrayList arrayList = oVar.J;
        LinkedHashMap linkedHashMap = oVar.I;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            p5 p5Var = (p5) linkedHashMap.remove(l10);
            p5Var.setRemoved(new c1.c(4, this, p5Var));
            oVar.c0(p5Var);
            oVar.f5173b.x(l10, true);
            oVar.e0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i7) {
            cc.a0(oVar).t(hd.G(i7, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                p5 e10 = s0.e(document, l10, oVar.h.getFontMetricsInt());
                e10.cacheType = g5.f();
                e10.setAdded();
                arrayList.add(i9.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e10);
                spannableString.setSpan(e10, 0, spannableString.length(), 33);
                oVar.h.getText().insert(editTextSelectionEnd, spannableString);
                oVar.h.setSelection(editTextSelectionEnd + spannableString.length());
                oVar.f5173b.x(l10, true);
                oVar.e0(true);
                oVar.c0(e10);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
    }
}
