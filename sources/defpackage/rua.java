package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.tl.TL_stars;
public final class rua extends AnimatorListenerAdapter {
    public final sua a;

    public rua(sua suaVar) {
        this.a = suaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        sua suaVar = this.a;
        uoa uoaVar = suaVar.p0;
        suaVar.z0 = suaVar.y0;
        suaVar.d(suaVar.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = suaVar.e;
        int i = 2 - suaVar.y0;
        stargiftattributemodelArr[i] = (TL_stars.starGiftAttributeModel) suaVar.d0.f;
        nza.e1(suaVar.d[i].getImageReceiver(), stargiftattributemodelArr[2 - suaVar.y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) suaVar.e0.f;
        if (stargiftattributepattern != null) {
            wl l = wl.l(yac.t0, 7, stargiftattributepattern.document);
            l.m = true;
            l.u();
        }
        hl.r(uoaVar);
        hl.d3(uoaVar, 2500L);
    }
}
