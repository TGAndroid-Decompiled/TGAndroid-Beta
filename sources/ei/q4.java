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
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.tc;
import org.telegram.ui.l6;
import org.telegram.ui.or0;
public final class q4 implements Utilities.Callback {
    public final int f9311a;
    public final int f9312b;
    public final Object f9313c;
    public final Object d;

    public q4(Object obj, int i10, Object obj2, int i11) {
        this.f9311a = i11;
        this.f9313c = obj;
        this.f9312b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9311a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d9((TLRPC.UserFull) obj, (org.telegram.ui.web.q) this.f9313c, this.f9312b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9313c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new hi.b(n2Var.getContext(), chat, -chat2.f20038id, new fi.m0(n2Var, this.f9312b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f9312b;
                ((l6) this.f9313c).run(Float.valueOf((w7.o.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                s10 s10Var = (s10) this.f9313c;
                int i10 = this.f9312b;
                s10Var.getClass();
                s10Var.A0 = ((Boolean) obj).booleanValue();
                s10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new qg.f2((qg.o2) this.f9313c, this.f9312b, (List) obj, new ArrayList(), (or0) this.d));
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f9313c;
                int i11 = this.f9312b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = s2Var.f51511a;
                yh.d5 d5Var = s2Var.f51514e;
                d5Var.a(i11, arrayList);
                ((xh.o2) this.d).f(true);
                s2Var.f(true);
                s2Var.n();
                TL_stars.TL_starGiftCollection c10 = d5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        tc R = ad.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f31138r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        tc R2 = ad.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), c10.title)));
                        R2.f31138r = false;
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
        this.f9311a = i11;
        this.f9313c = obj;
        this.d = obj2;
        this.f9312b = i10;
    }
}
