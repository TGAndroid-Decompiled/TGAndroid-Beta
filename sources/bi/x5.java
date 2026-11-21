package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.wa0;
public final class x5 implements View.OnClickListener {
    public final int f4245a;
    public final boolean f4246b;
    public final FrameLayout f4247c;
    public final Object d;
    public final Object f4248e;
    public final Object f4249f;

    public x5(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.f4245a = i7;
        this.f4247c = frameLayout;
        this.f4246b = z10;
        this.d = obj;
        this.f4248e = obj2;
        this.f4249f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f4245a;
        Object obj = this.f4249f;
        Object obj2 = this.f4248e;
        Object obj3 = this.d;
        boolean z10 = this.f4246b;
        FrameLayout frameLayout = this.f4247c;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                a70 a70Var = (a70) obj;
                gq0 gq0Var = ((n6) frameLayout).f3944a;
                if (!z10) {
                    di.n8 n8Var = gq0Var.f4117e;
                    int i10 = tL_starGiftCollection.collection_id;
                    n8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    n8Var.a(i10, arrayList);
                    lc.b0(gq0Var.f4114a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    gq0Var.f4117e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    lc.b0(gq0Var.f4114a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750020, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                a70Var.v();
                gq0Var.o();
                return;
            default:
                qa0 qa0Var = (qa0) frameLayout;
                Context context = (Context) obj3;
                va0 va0Var = (va0) obj2;
                va0 va0Var2 = (va0) obj;
                wa0 wa0Var = qa0Var.f38864d0;
                jj jjVar = wa0Var.d;
                if (!z10) {
                    new lc(wa0Var, wa0Var.G).Q(2131624217, 36, org.telegram.messenger.g0.T2(gd.N0(2131750566, null), new ga0(qa0Var, context, 0))).j();
                    return;
                }
                boolean z11 = jjVar.f24900k;
                jjVar.f24900k = !z11;
                wa0Var.f41753y = false;
                if (z11) {
                    jjVar.f24901l = false;
                    if (va0Var != null) {
                        va0Var.a(false, true);
                    }
                }
                va0Var2.a(jjVar.f24900k, true);
                qa0Var.i();
                qa0Var.l(true);
                return;
        }
    }
}
