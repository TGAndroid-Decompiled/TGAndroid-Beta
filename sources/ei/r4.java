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
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.m6;
import org.telegram.ui.or0;
import yh.l5;
public final class r4 implements Utilities.Callback {
    public final int f8594a;
    public final int f8595b;
    public final Object f8596c;
    public final Object d;

    public r4(Object obj, int i10, Object obj2, int i11) {
        this.f8594a = i11;
        this.f8596c = obj;
        this.f8595b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8594a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f8596c, this.f8595b, (TLRPC.User) this.d, 2));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8596c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new hi.b(n2Var.getContext(), chat, -chat2.f18109id, new fi.m0(n2Var, this.f8595b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f8595b;
                ((m6) this.f8596c).run(Float.valueOf((w7.p.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                c10 c10Var = (c10) this.f8596c;
                int i10 = this.f8595b;
                c10Var.getClass();
                c10Var.A0 = ((Boolean) obj).booleanValue();
                c10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new l3((qg.p2) this.f8596c, this.f8595b, (List) obj, new ArrayList(), (or0) this.d, 28));
                return;
            default:
                xh.r2 r2Var = (xh.r2) this.f8596c;
                int i11 = this.f8595b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = r2Var.f46101a;
                l5 l5Var = r2Var.e;
                l5Var.a(i11, arrayList);
                ((xh.n2) this.d).f(true);
                r2Var.f(true);
                r2Var.n();
                TL_stars.TL_starGiftCollection c10 = l5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        oc R = vc.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f26759r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        oc R2 = vc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.z3.D1(savedStarGift.gift), c10.title)));
                        R2.f26759r = false;
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
        this.f8594a = i11;
        this.f8596c = obj;
        this.d = obj2;
        this.f8595b = i10;
    }
}
