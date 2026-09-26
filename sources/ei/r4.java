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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.gr0;
import org.telegram.ui.l6;
import yh.j5;
public final class r4 implements Utilities.Callback {
    public final int f8579a;
    public final int f8580b;
    public final Object f8581c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f8579a = i11;
        this.f8581c = obj;
        this.f8580b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8579a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9((TLRPC.UserFull) obj, (org.telegram.ui.web.q) this.f8581c, this.f8580b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f8581c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                m2Var.showDialog(new hi.b(m2Var.getContext(), chat, -chat2.f18335id, new fi.m0(m2Var, this.f8580b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f8580b;
                ((l6) this.f8581c).run(Float.valueOf((w7.q.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                e10 e10Var = (e10) this.f8581c;
                int i10 = this.f8580b;
                e10Var.getClass();
                e10Var.A0 = ((Boolean) obj).booleanValue();
                e10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new l3((qg.n2) this.f8581c, this.f8580b, (List) obj, new ArrayList(), (gr0) this.d, 29));
                return;
            default:
                xh.s2 s2Var = (xh.s2) this.f8581c;
                int i11 = this.f8580b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = s2Var.f46395a;
                j5 j5Var = s2Var.e;
                j5Var.a(i11, arrayList);
                ((xh.o2) this.d).f(true);
                s2Var.f(true);
                s2Var.n();
                TL_stars.TL_starGiftCollection c10 = j5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        qc R = xc.a0(m2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f27643r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        qc R2 = xc.a0(m2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), c10.title)));
                        R2.f27643r = false;
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
        this.f8579a = i11;
        this.f8581c = obj;
        this.d = obj2;
        this.f8580b = i10;
    }
}
