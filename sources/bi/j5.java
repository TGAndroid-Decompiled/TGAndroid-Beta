package bi;

import android.util.SparseIntArray;
import c8.m9;
import di.p9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.lc;
import org.telegram.ui.on0;
public final class j5 implements y10 {
    public final int f3723a;
    public final int f3724b;
    public final Object f3725c;
    public final Object d;

    public j5(int i7, org.telegram.tgnet.m mVar, aa.c0 c0Var) {
        this.f3723a = 3;
        this.f3724b = i7;
        this.f3725c = mVar;
        this.d = c0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3723a) {
            case 0:
                v6 v6Var = (v6) this.f3725c;
                int i7 = this.f3724b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.g2 g2Var = v6Var.f4148a;
                di.n8 n8Var = v6Var.f4151e;
                n8Var.a(i7, arrayList);
                ((p6) this.d).f(true);
                v6Var.f(true);
                v6Var.o();
                TL_stars.TL_starGiftCollection c10 = n8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        gc R = lc.b0(g2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.W2(hd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R.f35497r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        gc R2 = lc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), c10.title)));
                        R2.f35497r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ai.w0((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.f3725c, this.f3724b, (TLRPC.User) this.d, 11));
                return;
            case 2:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.f3725c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                g2Var2.showDialog(new ni.a(g2Var2.getContext(), chat, -chat2.f28398id, new p9(g2Var2, this.f3724b, chat2, chat, 3)));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new ai.w0(this.f3724b, (org.telegram.tgnet.m) this.f3725c, (SparseIntArray) obj, (aa.c0) this.d, 14));
                return;
            case 4:
                float f10 = this.f3724b;
                ((org.telegram.ui.m6) this.f3725c).a(Float.valueOf((m9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 5:
                i00 i00Var = (i00) this.f3725c;
                int i10 = this.f3724b;
                i00Var.getClass();
                i00Var.f36043w2 = ((Boolean) obj).booleanValue();
                i00Var.dismiss();
                ((y10) this.d).a(Integer.valueOf(i10));
                return;
            default:
                Utilities.f22777i.c(new ai.c1((tg.f2) this.f3725c, this.f3724b, (List) obj, new ArrayList(), (on0) this.d, 27));
                return;
        }
    }

    public j5(Object obj, int i7, Object obj2, int i10) {
        this.f3723a = i10;
        this.f3725c = obj;
        this.f3724b = i7;
        this.d = obj2;
    }

    public j5(Object obj, Object obj2, int i7, int i10) {
        this.f3723a = i10;
        this.f3725c = obj;
        this.d = obj2;
        this.f3724b = i7;
    }
}
