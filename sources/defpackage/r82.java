package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r82 extends n1a {
    public boolean f2;
    public final t82 g2;

    public r82(t82 t82Var, t82 t82Var2, Activity activity, vnb vnbVar, int i) {
        super(t82Var2, activity, false, null, 6, false, vnbVar, 16, i);
        this.g2 = t82Var;
        this.f2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        t82 t82Var = this.g2;
        int i = t82Var.O;
        ArrayList arrayList = t82Var.J;
        LinkedHashMap linkedHashMap = t82Var.I;
        if (linkedHashMap.containsKey(l)) {
            arrayList.remove(l);
            hm hmVar = (hm) linkedHashMap.remove(l);
            hmVar.setRemoved(new dy1(this, hmVar, (byte) 24));
            t82Var.b0(hmVar);
            t82Var.b.x(l, true);
            t82Var.d0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i) {
            d31.b0(t82Var).t(ob6.G(i, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = t82Var.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                hm e = z49.e(document, l, t82Var.h.getFontMetricsInt());
                e.cacheType = wl.f();
                e.setAdded();
                arrayList.add(ete.b(editTextSelectionEnd, 0, arrayList.size()), l);
                linkedHashMap.put(l, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                t82Var.h.getText().insert(editTextSelectionEnd, spannableString);
                t82Var.h.setSelection(editTextSelectionEnd + spannableString.length());
                t82Var.b.x(l, true);
                t82Var.d0(true);
                t82Var.b0(e);
            } catch (Exception e2) {
                cc4.g(e2, true);
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
