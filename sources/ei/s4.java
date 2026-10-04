package ei;

import ai.c9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.jr0;
import org.telegram.ui.o6;
import yh.j5;
public final class s4 implements Utilities.Callback {
    public final int f9336a;
    public final int f9337b;
    public final Object f9338c;
    public final Object d;

    public s4(Object obj, int i10, Object obj2, int i11) {
        this.f9336a = i11;
        this.f9338c = obj;
        this.f9337b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9336a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9((TLRPC.UserFull) obj, (org.telegram.ui.web.q) this.f9338c, this.f9337b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9338c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new hi.b(n2Var.getContext(), chat, -chat2.f20042id, new fi.m0(n2Var, this.f9337b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f9337b;
                ((o6) this.f9338c).run(Float.valueOf((w7.q.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                f10 f10Var = (f10) this.f9338c;
                int i10 = this.f9337b;
                f10Var.getClass();
                f10Var.A0 = ((Boolean) obj).booleanValue();
                f10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new m3((qg.n2) this.f9338c, this.f9337b, (List) obj, new ArrayList(), (jr0) this.d, 29));
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f9338c;
                int i11 = this.f9337b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = s2Var.f50225a;
                j5 j5Var = s2Var.f50228e;
                j5Var.a(i11, arrayList);
                ((xh.o2) this.d).f(true);
                s2Var.f(true);
                s2Var.n();
                TL_stars.TL_starGiftCollection c10 = j5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        rc R = yc.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f30353r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        rc R2 = yc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), c10.title)));
                        R2.f30353r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public s4(Object obj, Object obj2, int i10, int i11) {
        this.f9336a = i11;
        this.f9338c = obj;
        this.d = obj2;
        this.f9337b = i10;
    }
}
