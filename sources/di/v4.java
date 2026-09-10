package di;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.m6;
import org.telegram.ui.or0;
import xh.l5;
public final class v4 implements Utilities.Callback {
    public final int f6966a;
    public final int f6967b;
    public final Object f6968c;
    public final Object d;

    public v4(Object obj, int i10, Object obj2, int i11) {
        this.f6966a = i11;
        this.f6968c = obj;
        this.f6967b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6966a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f6968c, this.f6967b, (TLRPC.User) this.d, 1));
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f6968c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                p2Var.showDialog(new gi.b(p2Var.getContext(), chat, -chat2.f17195id, new ei.m0(p2Var, this.f6967b, chat2, chat, 0)));
                return;
            case 2:
                float f7 = this.f6967b;
                ((m6) this.f6968c).run(Float.valueOf((w7.q.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 3:
                k10 k10Var = (k10) this.f6968c;
                int i10 = this.f6967b;
                k10Var.getClass();
                k10Var.A0 = ((Boolean) obj).booleanValue();
                k10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 4:
                Utilities.themeQueue.postRunnable(new o3((pg.n2) this.f6968c, this.f6967b, (List) obj, new ArrayList(), (or0) this.d, 28));
                return;
            default:
                wh.q2 q2Var = (wh.q2) this.f6968c;
                int i11 = this.f6967b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var2 = q2Var.f44317a;
                l5 l5Var = q2Var.e;
                l5Var.a(i11, arrayList);
                ((wh.m2) this.d).f(true);
                q2Var.f(true);
                q2Var.n();
                TL_stars.TL_starGiftCollection c10 = l5Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        pc R = wc.a0(p2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f26089r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        pc R2 = wc.a0(p2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, xh.x3.D1(savedStarGift.gift), c10.title)));
                        R2.f26089r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public v4(Object obj, Object obj2, int i10, int i11) {
        this.f6966a = i11;
        this.f6968c = obj;
        this.d = obj2;
        this.f6967b = i10;
    }
}
