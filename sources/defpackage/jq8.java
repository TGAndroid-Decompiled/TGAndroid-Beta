package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class jq8 implements n8c, o8c {
    public final pq8 a;

    public jq8(pq8 pq8Var) {
        this.a = pq8Var;
    }

    @Override
    public final java.lang.Boolean d(defpackage.c4c r31, android.view.View r32, java.lang.Integer r33, java.lang.Float r34, java.lang.Float r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.d(c4c, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        pq8 pq8Var = this.a;
        lca lcaVar = pq8Var.a;
        int i = pq8Var.b;
        if (pq8Var.e != null) {
            Object obj3 = c4cVar.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (pq8Var.h) {
                    if (!pq8Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z = savedStarGift.pinned_to_top;
                        boolean z2 = !z;
                        if (!z && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = pq8Var.e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                        }
                        if (pq8Var.e.q(savedStarGift, z2, true)) {
                            u21.b0(lcaVar.a).Q(2131623982, 36, k96.H(',', "GiftsPinLimit", na7.q1(i).k4.J1.f())).j();
                        }
                        if (!z) {
                            pq8Var.f.w0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                vqa vqaVar = new vqa(pq8Var.getContext(), pq8Var.b, lcaVar.c, pq8Var.c, null);
                vqaVar.i3 = new eq8(pq8Var, (byte) 2);
                vqaVar.M2 = new kq8(pq8Var, savedStarGift, (byte) 0);
                vqaVar.n2(savedStarGift, pq8Var.e);
                vqaVar.show();
            }
        }
    }
}
