package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.tl.TL_stars;
public final class qqa extends AnimatorListenerAdapter {
    public final rqa a;

    public qqa(rqa rqaVar) {
        this.a = rqaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rqa rqaVar = this.a;
        z6a z6aVar = rqaVar.p0;
        rqaVar.z0 = rqaVar.y0;
        rqaVar.d(rqaVar.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = rqaVar.e;
        int i = 2 - rqaVar.y0;
        stargiftattributemodelArr[i] = (TL_stars.starGiftAttributeModel) rqaVar.d0.f;
        jva.d1(rqaVar.d[i].getImageReceiver(), stargiftattributemodelArr[2 - rqaVar.y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) rqaVar.e0.f;
        if (stargiftattributepattern != null) {
            vl l = vl.l(y6c.t0, 7, stargiftattributepattern.document);
            l.m = true;
            l.u();
        }
        gl.r(z6aVar);
        gl.d3(z6aVar, 2500L);
    }
}
