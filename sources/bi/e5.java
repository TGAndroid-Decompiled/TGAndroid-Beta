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
public final class e5 implements x10 {
    public final int f3580a;
    public final int f3581b;
    public final Object f3582c;
    public final Object d;

    public e5(int i7, oi.a2 a2Var, aa.c0 c0Var) {
        this.f3580a = 3;
        this.f3581b = i7;
        this.f3582c = a2Var;
        this.d = c0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3580a) {
            case 0:
                q6 q6Var = (q6) this.f3582c;
                int i7 = this.f3581b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.h2 h2Var = q6Var.f4003a;
                di.m8 m8Var = q6Var.f4006e;
                m8Var.a(i7, arrayList);
                ((k6) this.d).f(true);
                q6Var.f(true);
                q6Var.o();
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
                org.telegram.messenger.g0.g3(new u4((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.f3582c, this.f3581b, (TLRPC.User) this.d, 10));
                return;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.f3582c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                h2Var2.showDialog(new ni.a(h2Var2.getContext(), chat, -chat2.f28405id, new o9(h2Var2, this.f3581b, chat2, chat, 2)));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new u4(this.f3581b, (oi.a2) this.f3582c, (SparseIntArray) obj, (aa.c0) this.d, 13));
                return;
            case 4:
                float f10 = this.f3581b;
                ((org.telegram.ui.m6) this.f3582c).a(Float.valueOf((l9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 5:
                g00 g00Var = (g00) this.f3582c;
                int i10 = this.f3581b;
                g00Var.getClass();
                g00Var.f35270w2 = ((Boolean) obj).booleanValue();
                g00Var.dismiss();
                ((x10) this.d).a(Integer.valueOf(i10));
                return;
            default:
                Utilities.f22785i.c(new ai.g1((tg.e2) this.f3582c, this.f3581b, (List) obj, new ArrayList(), (on0) this.d, 27));
                return;
        }
    }

    public e5(Object obj, int i7, Object obj2, int i10) {
        this.f3580a = i10;
        this.f3582c = obj;
        this.f3581b = i7;
        this.d = obj2;
    }

    public e5(Object obj, Object obj2, int i7, int i10) {
        this.f3580a = i10;
        this.f3582c = obj;
        this.d = obj2;
        this.f3581b = i7;
    }
}
