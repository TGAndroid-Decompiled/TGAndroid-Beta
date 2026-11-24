package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l92 extends vz9 {
    public boolean f2;
    public final n92 g2;

    public l92(n92 n92Var, n92 n92Var2, Activity activity, ylb ylbVar, int i) {
        super(n92Var2, activity, false, null, 6, false, ylbVar, 16, i);
        this.g2 = n92Var;
        this.f2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        n92 n92Var = this.g2;
        int i = n92Var.O;
        ArrayList arrayList = n92Var.J;
        LinkedHashMap linkedHashMap = n92Var.I;
        if (linkedHashMap.containsKey(l)) {
            arrayList.remove(l);
            gn gnVar = (gn) linkedHashMap.remove(l);
            gnVar.setRemoved(new lx1(this, gnVar, (byte) 26));
            n92Var.c0(gnVar);
            n92Var.b.x(l, true);
            n92Var.e0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i) {
            c41.b0(n92Var).t(jb6.G(i, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = n92Var.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                gn e = n39.e(document, l, n92Var.h.getFontMetricsInt());
                e.cacheType = vm.f();
                e.setAdded();
                arrayList.add(pqe.b(editTextSelectionEnd, 0, arrayList.size()), l);
                linkedHashMap.put(l, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                n92Var.h.getText().insert(editTextSelectionEnd, spannableString);
                n92Var.h.setSelection(editTextSelectionEnd + spannableString.length());
                n92Var.b.x(l, true);
                n92Var.e0(true);
                n92Var.c0(e);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.r(null);
        }
    }
}
