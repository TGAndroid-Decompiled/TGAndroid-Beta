package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class zpc extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        aqc aqcVar = (aqc) view;
        mqc mqcVar = aqcVar.y0;
        if (mqcVar != null) {
            mqcVar.h.remove(aqcVar);
        }
        ValueAnimator valueAnimator = aqcVar.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        aqcVar.z0 = 1.0f;
        aqcVar.E.setAlpha(1.0f);
        aqcVar.x0 = (TL_wallet.nftItem) c6cVar.H;
        aqcVar.y0 = (mqc) c6cVar.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = aqcVar.x0.gift;
        aqcVar.k(false, true, 0.0f);
        aqcVar.i(savedStarGift, true, false);
        mqc mqcVar2 = aqcVar.y0;
        if (mqcVar2 != null) {
            mqcVar2.i(aqcVar);
        }
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        ?? ox4Var = new ox4(i, ylbVar, context);
        ox4Var.z0 = 1.0f;
        ox4Var.setStateListAnimator(null);
        ox4Var.setWillNotDraw(false);
        return ox4Var;
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return TextUtils.equals(((TL_wallet.nftItem) c6cVar.H).address, ((TL_wallet.nftItem) c6cVar2.H).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
