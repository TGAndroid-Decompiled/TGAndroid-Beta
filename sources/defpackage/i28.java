package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class i28 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        j28 j28Var = (j28) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) c6cVar.H;
        px4 px4Var = j28Var.h;
        lx4 lx4Var = j28Var.e;
        j28Var.a = savedStarGift.gift.id;
        j28Var.setPadding(0, 0, 0, 0);
        j28Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        j28Var.b = (TL_stars.starGiftAttributeBackdrop) jva.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        j28Var.c = (TL_stars.starGiftAttributePattern) jva.i(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        lx4Var.d(j28Var.b);
        lx4Var.e(j28Var.c);
        if (px4Var != null) {
            px4Var.setBackdrop(j28Var.b);
            String concat = "#".concat(jb6.E(savedStarGift.gift.num, ','));
            px4Var.b = concat;
            px4Var.a.g(9, concat, false);
        }
        j28Var.b(c6cVar.e, false);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new j28(ylbVar, context, true);
    }
}
