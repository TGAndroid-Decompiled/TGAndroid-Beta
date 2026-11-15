package bi;

import android.util.SparseIntArray;
import c8.i9;
import di.j8;
import di.l9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ln0;
public final class w2 implements z10 {
    public final int f3954a;
    public final int f3955b;
    public final Object f3956c;
    public final Object d;

    public w2(int i7, kg.j1 j1Var, aa.c0 c0Var) {
        this.f3954a = 3;
        this.f3955b = i7;
        this.f3956c = j1Var;
        this.d = c0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3954a) {
            case 0:
                i4 i4Var = (i4) this.f3956c;
                int i7 = this.f3955b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.e2 e2Var = i4Var.f3610a;
                j8 j8Var = i4Var.f3613e;
                j8Var.a(i7, arrayList);
                ((c4) this.d).f(true);
                i4Var.f(true);
                i4Var.o();
                TL_stars.TL_starGiftCollection c10 = j8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        xb R = cc.a0(e2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(hd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f41643r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        xb R2 = cc.a0(e2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), c10.title)));
                        R2.f41643r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ci.p0((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.f3956c, this.f3955b, (TLRPC.User) this.d, 9));
                return;
            case 2:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.f3956c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                e2Var2.showDialog(new ni.a(e2Var2.getContext(), chat, -chat2.f28051id, new l9(e2Var2, this.f3955b, chat2, chat, 1)));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ci.p0(this.f3955b, (kg.j1) this.f3956c, (SparseIntArray) obj, (aa.c0) this.d, 12));
                return;
            case 4:
                float f10 = this.f3955b;
                ((org.telegram.ui.n6) this.f3956c).a(Float.valueOf((i9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 5:
                zz zzVar = (zz) this.f3956c;
                int i10 = this.f3955b;
                zzVar.getClass();
                zzVar.f42518w2 = ((Boolean) obj).booleanValue();
                zzVar.dismiss();
                ((z10) this.d).a(Integer.valueOf(i10));
                return;
            default:
                Utilities.f22419i.c(new ai.g1((tg.e2) this.f3956c, this.f3955b, (List) obj, new ArrayList(), (ln0) this.d, 27));
                return;
        }
    }

    public w2(Object obj, int i7, Object obj2, int i10) {
        this.f3954a = i10;
        this.f3956c = obj;
        this.f3955b = i7;
        this.d = obj2;
    }

    public w2(Object obj, Object obj2, int i7, int i10) {
        this.f3954a = i10;
        this.f3956c = obj;
        this.d = obj2;
        this.f3955b = i7;
    }
}
