package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class l38 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        m38 m38Var = (m38) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) b8cVar.H;
        tx4 tx4Var = m38Var.h;
        px4 px4Var = m38Var.e;
        m38Var.a = savedStarGift.gift.id;
        m38Var.setPadding(0, 0, 0, 0);
        m38Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        m38Var.b = (TL_stars.starGiftAttributeBackdrop) jxa.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m38Var.c = (TL_stars.starGiftAttributePattern) jxa.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        px4Var.d(m38Var.b);
        px4Var.e(m38Var.c);
        if (tx4Var != null) {
            tx4Var.setBackdrop(m38Var.b);
            String concat = "#".concat(ob6.E(savedStarGift.gift.num, ','));
            tx4Var.b = concat;
            tx4Var.a.g(9, concat, false);
        }
        m38Var.b(b8cVar.e, false);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new m38(vnbVar, context, true);
    }
}
