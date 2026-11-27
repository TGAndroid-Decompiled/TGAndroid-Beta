package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class e57 implements View.OnClickListener {
    public final byte a;
    public final boolean b;
    public final FrameLayout c;
    public final Object d;
    public final Object e;
    public final Object f;

    public e57(FrameLayout frameLayout, boolean z, Object obj, Object obj2, Object obj3, byte b) {
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
                m57 m57Var = (m57) frameLayout;
                Context context = (Context) obj3;
                r57 r57Var = (r57) obj2;
                r57 r57Var2 = (r57) obj;
                s57 s57Var = m57Var.d0;
                v47 v47Var = s57Var.d;
                if (!z) {
                    new d31(s57Var, s57Var.G).Q(2131624211, 36, hl.N2(ob6.M0(2131750543, null), -1, 0, new c57(m57Var, context, (byte) 0), null)).j();
                    return;
                }
                boolean z2 = v47Var.k;
                v47Var.k = !z2;
                s57Var.y = false;
                if (z2) {
                    v47Var.l = false;
                    if (r57Var != null) {
                        r57Var.a(false, true);
                    }
                }
                r57Var2.a(v47Var.k, true);
                m57Var.i();
                m57Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                fu5 fu5Var = (fu5) obj;
                cga cgaVar = ((au8) frameLayout).a;
                if (!z) {
                    zwa zwaVar = cgaVar.e;
                    int i = tL_starGiftCollection.collection_id;
                    zwaVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    zwaVar.a(i, arrayList);
                    d31.b0(cgaVar.a).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131750354, wua.u1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    cgaVar.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    d31.b0(cgaVar.a).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131749995, wua.u1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                fu5Var.u();
                cgaVar.o();
                return;
        }
    }
}
