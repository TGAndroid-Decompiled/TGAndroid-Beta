package fi;

import bi.n8;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.q6;
import org.telegram.ui.tr0;
public final class r4 implements Utilities.Callback {
    public final int f9525a;
    public final int f9526b;
    public final Object f9527c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f9525a = i11;
        this.f9527c = obj;
        this.f9526b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9525a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8((TLRPC.UserFull) obj, (org.telegram.ui.web.q) this.f9527c, this.f9526b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f9527c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                m2Var.showDialog(new ii.b(m2Var.getContext(), chat, -chat2.f18916id, new gi.m0(m2Var, this.f9526b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f9526b;
                ((q6) this.f9527c).run(Float.valueOf((w7.r.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                o10 o10Var = (o10) this.f9527c;
                int i10 = this.f9526b;
                o10Var.getClass();
                o10Var.A0 = ((Boolean) obj).booleanValue();
                o10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new rg.g2((rg.p2) this.f9527c, this.f9526b, (List) obj, new ArrayList(), (tr0) this.d));
                return;
            default:
                yh.q2 q2Var = (yh.q2) this.f9527c;
                int i11 = this.f9526b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.m2 m2Var2 = q2Var.f49088a;
                zh.e5 e5Var = q2Var.e;
                e5Var.a(i11, arrayList);
                ((yh.m2) this.d).f(true);
                q2Var.f(true);
                q2Var.n();
                TL_stars.TL_starGiftCollection c10 = e5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        sc R = zc.a0(m2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f28813r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        sc R2 = zc.a0(m2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.r3.E1(savedStarGift.gift), c10.title)));
                        R2.f28813r = false;
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
        this.f9525a = i11;
        this.f9527c = obj;
        this.d = obj2;
        this.f9526b = i10;
    }
}
