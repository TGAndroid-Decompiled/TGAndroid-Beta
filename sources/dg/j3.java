package dg;

import java.util.ArrayList;
import java.util.List;
import lh.e8;
import lh.g5;
import lh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ct;
import org.telegram.ui.p6;
import org.telegram.ui.sq0;
public final class j3 implements Utilities.Callback {
    public final int f4608a;
    public final int f4609b;
    public final Object f4610c;
    public final Object d;

    public j3(Object obj, int i10, Object obj2, int i11) {
        this.f4608a = i11;
        this.f4610c = obj;
        this.f4609b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f4608a) {
            case 0:
                Utilities.themeQueue.postRunnable(new f3((q3) this.f4610c, this.f4609b, (List) obj, new ArrayList(), (sq0) this.d, 0));
                return;
            case 1:
                kh.x3 x3Var = (kh.x3) this.f4610c;
                int i10 = this.f4609b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var = x3Var.f10939a;
                j7 j7Var = x3Var.e;
                j7Var.a(i10, arrayList);
                ((kh.n3) this.d).f(true);
                x3Var.f(true);
                x3Var.n();
                TL_stars.TL_starGiftCollection c3 = j7Var.c(i10);
                if (c3 != null) {
                    if (arrayList.size() > 1) {
                        ic R = qc.a0(p2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c3.title)));
                        R.f25680r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        ic R2 = qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, g5.D1(savedStarGift.gift), c3.title)));
                        R2.f25680r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                float f10 = this.f4609b;
                ((p6) this.f4610c).run(Float.valueOf((k7.n.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 3:
                c10 c10Var = (c10) this.f4610c;
                int i11 = this.f4609b;
                c10Var.getClass();
                c10Var.f23804x0 = ((Boolean) obj).booleanValue();
                c10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ct((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.f4610c, this.f4609b, (TLRPC.User) this.d, 13));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f4610c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                p2Var2.showDialog(new uh.a(p2Var2.getContext(), chat, -chat2.f19184id, new e8(p2Var2, this.f4609b, chat2, chat, 3)));
                return;
        }
    }

    public j3(Object obj, Object obj2, int i10, int i11) {
        this.f4608a = i11;
        this.f4610c = obj;
        this.d = obj2;
        this.f4609b = i10;
    }
}
