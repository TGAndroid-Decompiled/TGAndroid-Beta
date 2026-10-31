package jg;

import android.util.SparseIntArray;
import bi.i6;
import bi.n4;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.wb;
import org.telegram.ui.n6;
import org.telegram.ui.wo0;
import rh.e4;
import rh.u5;
public final class o2 implements q20 {
    public final int f10124a;
    public final int f10125b;
    public final Object f10126c;
    public final Object d;

    public o2(int i10, lg.s sVar, n4 n4Var) {
        this.f10124a = 1;
        this.f10125b = i10;
        this.f10126c = sVar;
        this.d = n4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f10124a) {
            case 0:
                Utilities.f14523i.c(new i2.g1((v2) this.f10126c, this.f10125b, (List) obj, new ArrayList(), (wo0) this.d, 1));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ag.g3(this.f10125b, (lg.s) this.f10126c, (SparseIntArray) obj, (n4) this.d));
                return;
            case 2:
                float f7 = this.f10125b;
                ((n6) this.f10126c).a(Float.valueOf((w7.u.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                j00 j00Var = (j00) this.f10126c;
                int i10 = this.f10125b;
                j00Var.getClass();
                j00Var.f27181s2 = ((Boolean) obj).booleanValue();
                j00Var.dismiss();
                ((q20) this.d).a(Integer.valueOf(i10));
                return;
            case 4:
                ph.j2 j2Var = (ph.j2) this.f10126c;
                int i11 = this.f10125b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.k2 k2Var = j2Var.f45128a;
                u5 u5Var = j2Var.e;
                u5Var.a(i11, arrayList);
                ((ph.f2) this.d).f(true);
                j2Var.f(true);
                j2Var.o();
                TL_stars.TL_starGiftCollection c10 = u5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        wb R = cc.a0(k2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.i0.W2(cd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f32143r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        wb R2 = cc.a0(k2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750402, e4.A1(savedStarGift.gift), c10.title)));
                        R2.f32143r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.messenger.i0.g3(new c11((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.f10126c, this.f10125b, (TLRPC.User) this.d, 22));
                return;
            default:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.f10126c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                k2Var2.showDialog(new ai.a(k2Var2.getContext(), chat, -chat2.f19793id, new i6(k2Var2, this.f10125b, chat2, chat, 5)));
                return;
        }
    }

    public o2(Object obj, int i10, Object obj2, int i11) {
        this.f10124a = i11;
        this.f10126c = obj;
        this.f10125b = i10;
        this.d = obj2;
    }

    public o2(Object obj, Object obj2, int i10, int i11) {
        this.f10124a = i11;
        this.f10126c = obj;
        this.d = obj2;
        this.f10125b = i10;
    }
}
