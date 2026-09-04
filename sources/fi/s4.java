package fi;

import bi.k8;
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
import org.telegram.ui.Components.yc;
import org.telegram.ui.m6;
import org.telegram.ui.or0;
import zh.i5;
public final class s4 implements Utilities.Callback {
    public final int f9960a;
    public final int f9961b;
    public final Object f9962c;
    public final Object d;

    public s4(Object obj, int i10, Object obj2, int i11) {
        this.f9960a = i11;
        this.f9962c = obj;
        this.f9961b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9960a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k8((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.f9962c, this.f9961b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9962c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new ii.b(n2Var.getContext(), chat, -chat2.f19869id, new gi.m0(n2Var, this.f9961b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f9961b;
                ((m6) this.f9962c).run(Float.valueOf((w7.p.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                c10 c10Var = (c10) this.f9962c;
                int i10 = this.f9961b;
                c10Var.getClass();
                c10Var.A0 = ((Boolean) obj).booleanValue();
                c10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new l3((rg.o2) this.f9962c, this.f9961b, (List) obj, new ArrayList(), (or0) this.d, 28));
                return;
            default:
                yh.q2 q2Var = (yh.q2) this.f9962c;
                int i11 = this.f9961b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = q2Var.f50515a;
                i5 i5Var = q2Var.f50518e;
                i5Var.a(i11, arrayList);
                ((yh.m2) this.d).f(true);
                q2Var.f(true);
                q2Var.n();
                TL_stars.TL_starGiftCollection c10 = i5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        qc R = yc.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f29687r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        qc R2 = yc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.w3.D1(savedStarGift.gift), c10.title)));
                        R2.f29687r = false;
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
        this.f9960a = i11;
        this.f9962c = obj;
        this.d = obj2;
        this.f9961b = i10;
    }
}
