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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.m6;
import org.telegram.ui.pr0;
import yh.k5;
public final class r4 implements Utilities.Callback {
    public final int f8596a;
    public final int f8597b;
    public final Object f8598c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f8596a = i11;
        this.f8598c = obj;
        this.f8597b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8596a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f8598c, this.f8597b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8598c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new hi.b(n2Var.getContext(), chat, -chat2.f18296id, new fi.m0(n2Var, this.f8597b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f8597b;
                ((m6) this.f8598c).run(Float.valueOf((w7.q.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                c10 c10Var = (c10) this.f8598c;
                int i10 = this.f8597b;
                c10Var.getClass();
                c10Var.A0 = ((Boolean) obj).booleanValue();
                c10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new l3((qg.m2) this.f8598c, this.f8597b, (List) obj, new ArrayList(), (pr0) this.d, 29));
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f8598c;
                int i11 = this.f8597b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = s2Var.f46369a;
                k5 k5Var = s2Var.e;
                k5Var.a(i11, arrayList);
                ((xh.o2) this.d).f(true);
                s2Var.f(true);
                s2Var.n();
                TL_stars.TL_starGiftCollection c10 = k5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        qc R = xc.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f27558r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        qc R2 = xc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), c10.title)));
                        R2.f27558r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public r4(Object obj, Object obj2, int i10, int i11) {
        this.f8596a = i11;
        this.f8598c = obj;
        this.d = obj2;
        this.f8597b = i10;
    }
}
