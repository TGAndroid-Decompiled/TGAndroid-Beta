package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a82 extends tx9 {
    public boolean f2;
    public final c82 g2;

    public a82(c82 c82Var, c82 c82Var2, Activity activity, wjb wjbVar, int i) {
        super(c82Var2, activity, false, null, 6, false, wjbVar, 16, i);
        this.g2 = c82Var;
        this.f2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        c82 c82Var = this.g2;
        int i = c82Var.O;
        ArrayList arrayList = c82Var.J;
        LinkedHashMap linkedHashMap = c82Var.I;
        if (linkedHashMap.containsKey(l)) {
            arrayList.remove(l);
            gm gmVar = (gm) linkedHashMap.remove(l);
            gmVar.setRemoved(new kx1(this, gmVar, (byte) 25));
            c82Var.b0(gmVar);
            c82Var.b.x(l, true);
            c82Var.d0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i) {
            u21.b0(c82Var).t(k96.G(i, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = c82Var.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                gm e = k19.e(document, l, c82Var.h.getFontMetricsInt());
                e.cacheType = vl.f();
                e.setAdded();
                arrayList.add(moe.b(editTextSelectionEnd, 0, arrayList.size()), l);
                linkedHashMap.put(l, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                c82Var.h.getText().insert(editTextSelectionEnd, spannableString);
                c82Var.h.setSelection(editTextSelectionEnd + spannableString.length());
                c82Var.b.x(l, true);
                c82Var.d0(true);
                c82Var.b0(e);
            } catch (Exception e2) {
                fa4.g(e2, true);
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
