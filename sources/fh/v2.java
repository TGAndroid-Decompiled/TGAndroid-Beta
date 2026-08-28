package fh;

import gh.g8;
import gh.l7;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.oc;
import org.telegram.ui.mq0;
public final class v2 implements Utilities.Callback {
    public final int f6813a;
    public final int f6814b;
    public final Object f6815c;
    public final Object d;

    public v2(Object obj, int i9, Object obj2, int i10) {
        this.f6813a = i10;
        this.f6815c = obj;
        this.f6814b = i9;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6813a) {
            case 0:
                j4 j4Var = (j4) this.f6815c;
                int i9 = this.f6814b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var = j4Var.f6545a;
                l7 l7Var = j4Var.f6548e;
                l7Var.a(i9, arrayList);
                ((y3) this.d).f(true);
                j4Var.f(true);
                j4Var.n();
                TL_stars.TL_starGiftCollection c10 = l7Var.c(i9);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        gc R = oc.a0(o2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f28745r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        gc R2 = oc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, gh.k5.D1(savedStarGift.gift), c10.title)));
                        R2.f28745r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c3.d((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f6815c, this.f6814b, (TLRPC.User) this.d, 4));
                return;
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f6815c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                o2Var2.showDialog(new ph.a(o2Var2.getContext(), chat, -chat2.f22380id, new g8(o2Var2, this.f6814b, chat2, chat, 1)));
                return;
            case 3:
                float f10 = this.f6814b;
                ((org.telegram.ui.l6) this.f6815c).run(Float.valueOf((g7.n.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 4:
                n00 n00Var = (n00) this.f6815c;
                int i10 = this.f6814b;
                n00Var.getClass();
                n00Var.f30979w0 = ((Boolean) obj).booleanValue();
                n00Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            default:
                Utilities.themeQueue.postRunnable(new g1((yf.m2) this.f6815c, this.f6814b, (List) obj, new ArrayList(), (mq0) this.d, 29));
                return;
        }
    }

    public v2(Object obj, Object obj2, int i9, int i10) {
        this.f6813a = i10;
        this.f6815c = obj;
        this.d = obj2;
        this.f6814b = i9;
    }
}
