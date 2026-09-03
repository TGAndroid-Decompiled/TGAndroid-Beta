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
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.et;
import org.telegram.ui.r6;
import org.telegram.ui.zq0;
public final class j3 implements Utilities.Callback {
    public final int f4614a;
    public final int f4615b;
    public final Object f4616c;
    public final Object d;

    public j3(Object obj, int i10, Object obj2, int i11) {
        this.f4614a = i11;
        this.f4616c = obj;
        this.f4615b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f4614a) {
            case 0:
                Utilities.themeQueue.postRunnable(new f3((q3) this.f4616c, this.f4615b, (List) obj, new ArrayList(), (zq0) this.d, 0));
                return;
            case 1:
                kh.w3 w3Var = (kh.w3) this.f4616c;
                int i10 = this.f4615b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var = w3Var.f11015a;
                j7 j7Var = w3Var.e;
                j7Var.a(i10, arrayList);
                ((kh.m3) this.d).f(true);
                w3Var.f(true);
                w3Var.n();
                TL_stars.TL_starGiftCollection c3 = j7Var.c(i10);
                if (c3 != null) {
                    if (arrayList.size() > 1) {
                        ic R = qc.a0(p2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c3.title)));
                        R.f25679r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        ic R2 = qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, g5.D1(savedStarGift.gift), c3.title)));
                        R2.f25679r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                float f10 = this.f4615b;
                ((r6) this.f4616c).run(Float.valueOf((k7.n.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 3:
                d10 d10Var = (d10) this.f4616c;
                int i11 = this.f4615b;
                d10Var.getClass();
                d10Var.f24102x0 = ((Boolean) obj).booleanValue();
                d10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new et((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f4616c, this.f4615b, (TLRPC.User) this.d, 14));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f4616c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                p2Var2.showDialog(new uh.a(p2Var2.getContext(), chat, -chat2.f19159id, new e8(p2Var2, this.f4615b, chat2, chat, 3)));
                return;
        }
    }

    public j3(Object obj, Object obj2, int i10, int i11) {
        this.f4614a = i11;
        this.f4616c = obj;
        this.d = obj2;
        this.f4615b = i10;
    }
}
