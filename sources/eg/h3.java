package eg;

import java.util.ArrayList;
import java.util.List;
import mh.e8;
import mh.g5;
import mh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.dt;
import org.telegram.ui.p6;
import org.telegram.ui.zq0;
public final class h3 implements Utilities.Callback {
    public final int f5236a;
    public final int f5237b;
    public final Object f5238c;
    public final Object d;

    public h3(Object obj, int i10, Object obj2, int i11) {
        this.f5236a = i11;
        this.f5238c = obj;
        this.f5237b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5236a) {
            case 0:
                Utilities.themeQueue.postRunnable(new d3((o3) this.f5238c, this.f5237b, (List) obj, new ArrayList(), (zq0) this.d, 0));
                return;
            case 1:
                lh.x3 x3Var = (lh.x3) this.f5238c;
                int i10 = this.f5237b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var = x3Var.f13100a;
                j7 j7Var = x3Var.f13103e;
                j7Var.a(i10, arrayList);
                ((lh.n3) this.d).f(true);
                x3Var.f(true);
                x3Var.n();
                TL_stars.TL_starGiftCollection c3 = j7Var.c(i10);
                if (c3 != null) {
                    if (arrayList.size() > 1) {
                        ic R = qc.a0(p2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c3.title)));
                        R.f27786r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        ic R2 = qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, g5.D1(savedStarGift.gift), c3.title)));
                        R2.f27786r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                float f10 = this.f5237b;
                ((p6) this.f5238c).run(Float.valueOf((k7.o.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 3:
                d10 d10Var = (d10) this.f5238c;
                int i11 = this.f5237b;
                d10Var.getClass();
                d10Var.f26115x0 = ((Boolean) obj).booleanValue();
                d10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dt((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.f5238c, this.f5237b, (TLRPC.User) this.d, 13));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f5238c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                p2Var2.showDialog(new vh.a(p2Var2.getContext(), chat, -chat2.f20845id, new e8(p2Var2, this.f5237b, chat2, chat, 3)));
                return;
        }
    }

    public h3(Object obj, Object obj2, int i10, int i11) {
        this.f5236a = i11;
        this.f5238c = obj;
        this.d = obj2;
        this.f5237b = i10;
    }
}
