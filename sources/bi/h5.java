package bi;

import android.util.SparseIntArray;
import c8.l9;
import di.p9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.lc;
import org.telegram.ui.on0;
public final class h5 implements x10 {
    public final int f3702a;
    public final int f3703b;
    public final Object f3704c;
    public final Object d;

    public h5(int i7, oi.c2 c2Var, aa.c0 c0Var) {
        this.f3702a = 3;
        this.f3703b = i7;
        this.f3704c = c2Var;
        this.d = c0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3702a) {
            case 0:
                t6 t6Var = (t6) this.f3704c;
                int i7 = this.f3703b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.g2 g2Var = t6Var.f4114a;
                di.n8 n8Var = t6Var.f4117e;
                n8Var.a(i7, arrayList);
                ((n6) this.d).f(true);
                t6Var.f(true);
                t6Var.o();
                TL_stars.TL_starGiftCollection c10 = n8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        gc R = lc.b0(g2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.W2(gd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f35516r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        gc R2 = lc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), c10.title)));
                        R2.f35516r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new x4((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.f3704c, this.f3703b, (TLRPC.User) this.d, 10));
                return;
            case 2:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.f3704c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                g2Var2.showDialog(new ni.a(g2Var2.getContext(), chat, -chat2.f28431id, new p9(g2Var2, this.f3703b, chat2, chat, 3)));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new x4(this.f3703b, (oi.c2) this.f3704c, (SparseIntArray) obj, (aa.c0) this.d, 13));
                return;
            case 4:
                float f10 = this.f3703b;
                ((org.telegram.ui.m6) this.f3704c).a(Float.valueOf((l9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 5:
                i00 i00Var = (i00) this.f3704c;
                int i10 = this.f3703b;
                i00Var.getClass();
                i00Var.f36095w2 = ((Boolean) obj).booleanValue();
                i00Var.dismiss();
                ((x10) this.d).a(Integer.valueOf(i10));
                return;
            default:
                Utilities.f22810i.c(new ai.i1((tg.f2) this.f3704c, this.f3703b, (List) obj, new ArrayList(), (on0) this.d, 27));
                return;
        }
    }

    public h5(Object obj, int i7, Object obj2, int i10) {
        this.f3702a = i10;
        this.f3704c = obj;
        this.f3703b = i7;
        this.d = obj2;
    }

    public h5(Object obj, Object obj2, int i7, int i10) {
        this.f3702a = i10;
        this.f3704c = obj;
        this.d = obj2;
        this.f3703b = i7;
    }
}
