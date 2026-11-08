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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wz;
import org.telegram.ui.jn0;
import org.telegram.ui.n6;
public final class d4 implements c20 {
    public final int f14618a;
    public final int f14619b;
    public final Object f14620c;
    public final Object d;

    public d4(int i7, l2.w wVar, aa.d0 d0Var) {
        this.f14618a = 2;
        this.f14619b = i7;
        this.f14620c = wVar;
        this.d = d0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f14618a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.a1((TLRPC.UserFull) obj, (org.telegram.ui.web.n) this.f14620c, this.f14619b, (TLRPC.User) this.d, 5));
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f14620c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                f2Var.showDialog(new ki.a(f2Var.getContext(), chat, -chat2.f26956id, new ya(f2Var, this.f14619b, chat2, chat, 1)));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ai.a1(this.f14619b, (l2.w) this.f14620c, (SparseIntArray) obj, (aa.d0) this.d, 12));
                return;
            case 3:
                float f10 = this.f14619b;
                ((n6) this.f14620c).a(Float.valueOf((j9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 4:
                wz wzVar = (wz) this.f14620c;
                int i7 = this.f14619b;
                wzVar.getClass();
                wzVar.f40144s2 = ((Boolean) obj).booleanValue();
                wzVar.dismiss();
                ((c20) this.d).a(Integer.valueOf(i7));
                return;
            case 5:
                Utilities.f21339i.c(new ub((tg.c2) this.f14620c, this.f14619b, (List) obj, new ArrayList(), (jn0) this.d, 25));
                return;
            default:
                zh.d2 d2Var = (zh.d2) this.f14620c;
                int i10 = this.f14619b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = d2Var.f60283a;
                t9 t9Var = d2Var.f60286e;
                t9Var.a(i10, arrayList);
                ((zh.z1) this.d).f(true);
                d2Var.f(true);
                d2Var.o();
                TL_stars.TL_starGiftCollection c10 = t9Var.c(i10);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        cc R = hc.a0(f2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(id.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f32553r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        cc R2 = hc.a0(f2Var2).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750394, k7.A1(savedStarGift.gift), c10.title)));
                        R2.f32553r = false;
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
        this.f14618a = i10;
        this.f14620c = obj;
        this.f14619b = i7;
        this.d = obj2;
    }

    public d4(Object obj, Object obj2, int i7, int i10) {
        this.f14618a = i10;
        this.f14620c = obj;
        this.d = obj2;
        this.f14619b = i7;
    }
}
