package gi;

import ai.cb;
import ai.k7;
import ai.ua;
import ai.v9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.p6;
import org.telegram.ui.yh1;
import org.telegram.ui.yq0;
public final class g4 implements Utilities.Callback {
    public final int f11231a;
    public final int f11232b;
    public final Object f11233c;
    public final Object d;

    public g4(Object obj, int i10, Object obj2, int i11) {
        this.f11231a = i11;
        this.f11233c = obj;
        this.f11232b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11231a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cb((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.f11233c, this.f11232b, (TLRPC.User) this.d, 3));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f11233c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new ji.a(n2Var.getContext(), chat, -chat2.f20272id, new ua(n2Var, this.f11232b, chat2, chat, 1)));
                return;
            case 2:
                float f7 = this.f11232b;
                ((p6) this.f11233c).run(Float.valueOf((w7.r.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                k10 k10Var = (k10) this.f11233c;
                int i10 = this.f11232b;
                k10Var.getClass();
                k10Var.A0 = ((Boolean) obj).booleanValue();
                k10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new yh1((rg.m2) this.f11233c, this.f11232b, (List) obj, new ArrayList(), (yq0) this.d, 1));
                return;
            default:
                yh.p2 p2Var = (yh.p2) this.f11233c;
                int i11 = this.f11232b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = p2Var.f50457a;
                v9 v9Var = p2Var.e;
                v9Var.a(i11, arrayList);
                ((yh.l2) this.d).f(true);
                p2Var.f(true);
                p2Var.n();
                TL_stars.TL_starGiftCollection c10 = v9Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        qc R = xc.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f29646r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        qc R2 = xc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, k7.R1(savedStarGift.gift), c10.title)));
                        R2.f29646r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public g4(Object obj, Object obj2, int i10, int i11) {
        this.f11231a = i11;
        this.f11233c = obj;
        this.d = obj2;
        this.f11232b = i10;
    }
}
