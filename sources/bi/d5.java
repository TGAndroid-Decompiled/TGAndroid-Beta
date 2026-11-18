package bi;

import android.util.SparseIntArray;
import c8.l9;
import di.o9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.on0;
public final class d5 implements x10 {
    public final int f3522a;
    public final int f3523b;
    public final Object f3524c;
    public final Object d;

    public d5(int i7, oi.a2 a2Var, aa.c0 c0Var) {
        this.f3522a = 3;
        this.f3523b = i7;
        this.f3524c = a2Var;
        this.d = c0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3522a) {
            case 0:
                p6 p6Var = (p6) this.f3524c;
                int i7 = this.f3523b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.h2 h2Var = p6Var.f3941a;
                di.m8 m8Var = p6Var.f3944e;
                m8Var.a(i7, arrayList);
                ((j6) this.d).f(true);
                p6Var.f(true);
                p6Var.o();
                TL_stars.TL_starGiftCollection c10 = m8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        gc R = lc.b0(h2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.W2(gd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f35469r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        gc R2 = lc.b0(h2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), c10.title)));
                        R2.f35469r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new t4((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.f3524c, this.f3523b, (TLRPC.User) this.d, 10));
                return;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.f3524c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                h2Var2.showDialog(new ni.a(h2Var2.getContext(), chat, -chat2.f28403id, new o9(h2Var2, this.f3523b, chat2, chat, 2)));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new t4(this.f3523b, (oi.a2) this.f3524c, (SparseIntArray) obj, (aa.c0) this.d, 13));
                return;
            case 4:
                float f10 = this.f3523b;
                ((org.telegram.ui.m6) this.f3524c).a(Float.valueOf((l9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 5:
                g00 g00Var = (g00) this.f3524c;
                int i10 = this.f3523b;
                g00Var.getClass();
                g00Var.f35270w2 = ((Boolean) obj).booleanValue();
                g00Var.dismiss();
                ((x10) this.d).a(Integer.valueOf(i10));
                return;
            default:
                Utilities.f22782i.c(new ai.g1((tg.e2) this.f3524c, this.f3523b, (List) obj, new ArrayList(), (on0) this.d, 27));
                return;
        }
    }

    public d5(Object obj, int i7, Object obj2, int i10) {
        this.f3522a = i10;
        this.f3524c = obj;
        this.f3523b = i7;
        this.d = obj2;
    }

    public d5(Object obj, Object obj2, int i7, int i10) {
        this.f3522a = i10;
        this.f3524c = obj;
        this.d = obj2;
        this.f3523b = i7;
    }
}
