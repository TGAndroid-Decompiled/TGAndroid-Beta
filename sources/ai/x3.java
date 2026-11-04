package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.s8;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.dj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.x90;
public final class x3 implements View.OnClickListener {
    public final int f1095a;
    public final boolean f1096b;
    public final FrameLayout f1097c;
    public final Object d;
    public final Object f1098e;
    public final Object f1099f;

    public x3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i3) {
        this.f1095a = i3;
        this.f1097c = frameLayout;
        this.f1096b = z10;
        this.d = obj;
        this.f1098e = obj2;
        this.f1099f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f1095a;
        Object obj = this.f1099f;
        Object obj2 = this.f1098e;
        Object obj3 = this.d;
        boolean z10 = this.f1096b;
        FrameLayout frameLayout = this.f1097c;
        switch (i3) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                f60 f60Var = (f60) obj;
                vp0 vp0Var = ((o4) frameLayout).f856a;
                if (!z10) {
                    s8 s8Var = vp0Var.f1013e;
                    int i10 = tL_starGiftCollection.collection_id;
                    s8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    s8Var.a(i10, arrayList);
                    fc.a0(vp0Var.f1010a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750401, ci.l6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    vp0Var.f1013e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    fc.a0(vp0Var.f1010a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750045, ci.l6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                f60Var.u();
                vp0Var.o();
                return;
            default:
                x90 x90Var = (x90) frameLayout;
                Context context = (Context) obj3;
                ca0 ca0Var = (ca0) obj2;
                ca0 ca0Var2 = (ca0) obj;
                da0 da0Var = x90Var.f40291d0;
                dj djVar = da0Var.d;
                if (!z10) {
                    new fc(da0Var, da0Var.G).Q(2131624216, 36, org.telegram.messenger.g0.U2(bd.M0(2131750584, null), new n90(x90Var, context, 0))).j();
                    return;
                }
                boolean z11 = djVar.f22205k;
                djVar.f22205k = !z11;
                da0Var.f33043y = false;
                if (z11) {
                    djVar.f22206l = false;
                    if (ca0Var != null) {
                        ca0Var.a(false, true);
                    }
                }
                ca0Var2.a(djVar.f22205k, true);
                x90Var.i();
                x90Var.l(true);
                return;
        }
    }
}
