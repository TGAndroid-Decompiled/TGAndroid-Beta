package bg;

import java.util.ArrayList;
import java.util.List;
import jh.d8;
import jh.h5;
import jh.i7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.l6;
import org.telegram.ui.mq0;
import org.telegram.ui.vs;
public final class n3 implements Utilities.Callback {
    public final int f2425a;
    public final int f2426b;
    public final Object f2427c;
    public final Object d;

    public n3(Object obj, int i10, Object obj2, int i11) {
        this.f2425a = i11;
        this.f2427c = obj;
        this.f2426b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2425a) {
            case 0:
                Utilities.themeQueue.postRunnable(new j3((u3) this.f2427c, this.f2426b, (List) obj, new ArrayList(), (mq0) this.d, 0));
                return;
            case 1:
                ih.x3 x3Var = (ih.x3) this.f2427c;
                int i10 = this.f2426b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var = x3Var.f9501a;
                i7 i7Var = x3Var.f9504e;
                i7Var.a(i10, arrayList);
                ((ih.n3) this.d).f(true);
                x3Var.f(true);
                x3Var.n();
                TL_stars.TL_starGiftCollection c3 = i7Var.c(i10);
                if (c3 != null) {
                    if (arrayList.size() > 1) {
                        mc R = tc.a0(o2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c3.title)));
                        R.f30660r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        mc R2 = tc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h5.D1(savedStarGift.gift), c3.title)));
                        R2.f30660r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                float f9 = this.f2426b;
                ((l6) this.f2427c).run(Float.valueOf((i7.w.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f9)) + (((int[]) this.d)[0] / f9)), Boolean.FALSE);
                return;
            case 3:
                y00 y00Var = (y00) this.f2427c;
                int i11 = this.f2426b;
                y00Var.getClass();
                y00Var.f34885w0 = ((Boolean) obj).booleanValue();
                y00Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new vs((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.f2427c, this.f2426b, (TLRPC.User) this.d, 13));
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f2427c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                o2Var2.showDialog(new sh.a(o2Var2.getContext(), chat, -chat2.f22392id, new d8(o2Var2, this.f2426b, chat2, chat, 3)));
                return;
        }
    }

    public n3(Object obj, Object obj2, int i10, int i11) {
        this.f2425a = i11;
        this.f2427c = obj;
        this.d = obj2;
        this.f2426b = i10;
    }
}
