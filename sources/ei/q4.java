package ei;

import ai.d9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.t10;
import org.telegram.ui.k6;
import org.telegram.ui.nr0;
public final class q4 implements Utilities.Callback {
    public final int f9310a;
    public final int f9311b;
    public final Object f9312c;
    public final Object d;

    public q4(Object obj, int i10, Object obj2, int i11) {
        this.f9310a = i11;
        this.f9312c = obj;
        this.f9311b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9310a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d9((TLRPC.UserFull) obj, (org.telegram.ui.web.q) this.f9312c, this.f9311b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9312c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                m2Var.showDialog(new hi.b(m2Var.getContext(), chat, -chat2.f20068id, new fi.m0(m2Var, this.f9311b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f9311b;
                ((k6) this.f9312c).run(Float.valueOf((w7.o.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                t10 t10Var = (t10) this.f9312c;
                int i10 = this.f9311b;
                t10Var.getClass();
                t10Var.A0 = ((Boolean) obj).booleanValue();
                t10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new qg.e2((qg.n2) this.f9312c, this.f9311b, (List) obj, new ArrayList(), (nr0) this.d));
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f9312c;
                int i11 = this.f9311b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = s2Var.f51632a;
                yh.d5 d5Var = s2Var.f51635e;
                d5Var.a(i11, arrayList);
                ((xh.o2) this.d).f(true);
                s2Var.f(true);
                s2Var.n();
                TL_stars.TL_starGiftCollection c10 = d5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        sc R = ad.a0(m2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f30841r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        sc R2 = ad.a0(m2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), c10.title)));
                        R2.f30841r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public q4(Object obj, Object obj2, int i10, int i11) {
        this.f9310a = i11;
        this.f9312c = obj;
        this.d = obj2;
        this.f9311b = i10;
    }
}
