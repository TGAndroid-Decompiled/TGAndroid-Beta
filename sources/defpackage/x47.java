package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class x47 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final FrameLayout c;
    public final Object d;
    public final Object e;
    public final Object f;

    public x47(FrameLayout frameLayout, boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                f57 f57Var = (f57) frameLayout;
                Context context = (Context) obj3;
                k57 k57Var = (k57) obj2;
                k57 k57Var2 = (k57) obj;
                l57 l57Var = f57Var.d0;
                o47 o47Var = l57Var.d;
                if (!z) {
                    new c41(l57Var, l57Var.G).Q(2131624211, 36, gm.N2(jb6.M0(2131750515, null), -1, 0, new v47(f57Var, context, (byte) 0), null)).j();
                    return;
                }
                boolean z2 = o47Var.k;
                o47Var.k = !z2;
                l57Var.y = false;
                if (z2) {
                    o47Var.l = false;
                    if (k57Var != null) {
                        k57Var.a(false, true);
                    }
                }
                k57Var2.a(o47Var.k, true);
                f57Var.i();
                f57Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                bu5 bu5Var = (bu5) obj;
                lea leaVar = ((rs8) frameLayout).a;
                if (!z) {
                    yua yuaVar = leaVar.e;
                    int i = tL_starGiftCollection.collection_id;
                    yuaVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    yuaVar.a(i, arrayList);
                    c41.b0(leaVar.a).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131750326, wsa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    leaVar.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    c41.b0(leaVar.a).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131749970, wsa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                bu5Var.u();
                leaVar.o();
                return;
        }
    }
}
