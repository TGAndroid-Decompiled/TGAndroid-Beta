package dh;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import b8.be;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.g11;
public final class m extends g11 {
    public boolean f9089f2;
    public final o f9090g2;

    public m(o oVar, o oVar2, Activity activity, e6 e6Var, int i3) {
        super(oVar2, activity, false, null, 6, false, e6Var, 16, i3);
        this.f9090g2 = oVar;
        this.f9089f2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f9089f2) {
            this.f9089f2 = false;
            this.f9090g2.f9101b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.f9090g2;
        int i3 = oVar.O;
        ArrayList arrayList = oVar.J;
        LinkedHashMap linkedHashMap = oVar.I;
        if (linkedHashMap.containsKey(l10)) {
            arrayList.remove(l10);
            p5 p5Var = (p5) linkedHashMap.remove(l10);
            p5Var.setRemoved(new ci.e0(22, this, p5Var));
            oVar.c0(p5Var);
            oVar.f9101b.x(l10, true);
            oVar.e0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i3) {
            fc.a0(oVar).t(bd.G(i3, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                p5 e10 = p0.e(document, l10, oVar.h.getFontMetricsInt());
                e10.cacheType = g5.f();
                e10.setAdded();
                arrayList.add(be.b(editTextSelectionEnd, 0, arrayList.size()), l10);
                linkedHashMap.put(l10, e10);
                spannableString.setSpan(e10, 0, spannableString.length(), 33);
                oVar.h.getText().insert(editTextSelectionEnd, spannableString);
                oVar.h.setSelection(editTextSelectionEnd + spannableString.length());
                oVar.f9101b.x(l10, true);
                oVar.e0(true);
                oVar.c0(e10);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
    }
}
