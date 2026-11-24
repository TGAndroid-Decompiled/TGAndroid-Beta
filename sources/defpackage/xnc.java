package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class xnc extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ync yncVar = (ync) view;
        koc kocVar = yncVar.y0;
        if (kocVar != null) {
            kocVar.h.remove(yncVar);
        }
        ValueAnimator valueAnimator = yncVar.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        yncVar.z0 = 1.0f;
        yncVar.E.setAlpha(1.0f);
        yncVar.x0 = (TL_wallet.nftItem) c4cVar.H;
        yncVar.y0 = (koc) c4cVar.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = yncVar.x0.gift;
        yncVar.k(false, true, 0.0f);
        yncVar.i(savedStarGift, true, false);
        koc kocVar2 = yncVar.y0;
        if (kocVar2 != null) {
            kocVar2.i(yncVar);
        }
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ?? nv4Var = new nv4(i, wjbVar, context);
        nv4Var.z0 = 1.0f;
        nv4Var.setStateListAnimator(null);
        nv4Var.setWillNotDraw(false);
        return nv4Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return TextUtils.equals(((TL_wallet.nftItem) c4cVar.H).address, ((TL_wallet.nftItem) c4cVar2.H).address);
    }

    @Override
    public final boolean f() {
        return true;
    }
}
