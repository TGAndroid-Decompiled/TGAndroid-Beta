package hi;

import android.util.SparseIntArray;
import bi.k7;
import bi.t9;
import bi.ub;
import bi.ya;
import c8.j9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.vz;
import org.telegram.ui.mn0;
import org.telegram.ui.n6;
public final class d4 implements c20 {
    public final int f14620a;
    public final int f14621b;
    public final Object f14622c;
    public final Object d;

    public d4(int i7, l2.a0 a0Var, aa.d0 d0Var) {
        this.f14620a = 2;
        this.f14621b = i7;
        this.f14622c = a0Var;
        this.d = d0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14620a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.a1((TLRPC.UserFull) obj, (org.telegram.ui.web.n) this.f14622c, this.f14621b, (TLRPC.User) this.d, 5));
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f14622c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                f2Var.showDialog(new ki.a(f2Var.getContext(), chat, -chat2.f26960id, new ya(f2Var, this.f14621b, chat2, chat, 1)));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.a1(this.f14621b, (l2.a0) this.f14622c, (SparseIntArray) obj, (aa.d0) this.d, 12));
                return;
            case 3:
                float f10 = this.f14621b;
                ((n6) this.f14622c).a(Float.valueOf((j9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 4:
                vz vzVar = (vz) this.f14622c;
                int i7 = this.f14621b;
                vzVar.getClass();
                vzVar.f39841v2 = ((Boolean) obj).booleanValue();
                vzVar.dismiss();
                ((c20) this.d).a(Integer.valueOf(i7));
                return;
            case 5:
                Utilities.f21344i.c(new ub((tg.c2) this.f14622c, this.f14621b, (List) obj, new ArrayList(), (mn0) this.d, 25));
                return;
            default:
                zh.d2 d2Var = (zh.d2) this.f14622c;
                int i10 = this.f14621b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = d2Var.f60294a;
                t9 t9Var = d2Var.f60297e;
                t9Var.a(i10, arrayList);
                ((zh.z1) this.d).f(true);
                d2Var.f(true);
                d2Var.o();
                TL_stars.TL_starGiftCollection c10 = t9Var.c(i10);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        bc R = gc.a0(f2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(id.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f32211r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        bc R2 = gc.a0(f2Var2).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750393, k7.z1(savedStarGift.gift), c10.title)));
                        R2.f32211r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public d4(Object obj, int i7, Object obj2, int i10) {
        this.f14620a = i10;
        this.f14622c = obj;
        this.f14621b = i7;
        this.d = obj2;
    }

    public d4(Object obj, Object obj2, int i7, int i10) {
        this.f14620a = i10;
        this.f14622c = obj;
        this.d = obj2;
        this.f14621b = i7;
    }
}
