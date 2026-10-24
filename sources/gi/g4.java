package gi;

import ai.db;
import ai.l7;
import ai.v9;
import ai.va;
import ai.x9;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ci1;
import org.telegram.ui.p6;
import org.telegram.ui.yq0;
public final class g4 implements Utilities.Callback {
    public final int f11252a;
    public final int f11253b;
    public final Object f11254c;
    public final Object d;

    public g4(int i10, org.telegram.ui.ActionBar.p pVar, x9 x9Var) {
        this.f11252a = 2;
        this.f11253b = i10;
        this.f11254c = pVar;
        this.d = x9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11252a) {
            case 0:
                AndroidUtilities.runOnUIThread(new db((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f11254c, this.f11253b, (TLRPC.User) this.d, 3));
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f11254c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                o2Var.showDialog(new ji.a(o2Var.getContext(), chat, -chat2.f20344id, new va(o2Var, this.f11253b, chat2, chat, 1)));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new db(this.f11253b, (org.telegram.ui.ActionBar.p) this.f11254c, (SparseIntArray) obj, (x9) this.d, 10));
                return;
            case 3:
                float f7 = this.f11253b;
                ((p6) this.f11254c).run(Float.valueOf((w7.r.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 4:
                i10 i10Var = (i10) this.f11254c;
                int i10 = this.f11253b;
                i10Var.getClass();
                i10Var.A0 = ((Boolean) obj).booleanValue();
                i10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 5:
                Utilities.themeQueue.postRunnable(new ci1((rg.o2) this.f11254c, this.f11253b, (List) obj, new ArrayList(), (yq0) this.d, 1));
                return;
            default:
                yh.p2 p2Var = (yh.p2) this.f11254c;
                int i11 = this.f11253b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = p2Var.f50923a;
                v9 v9Var = p2Var.e;
                v9Var.a(i11, arrayList);
                ((yh.l2) this.d).f(true);
                p2Var.f(true);
                p2Var.n();
                TL_stars.TL_starGiftCollection c10 = v9Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        oc R = vc.a0(o2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R.f29211r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        oc R2 = vc.a0(o2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.X1(savedStarGift.gift), c10.title)));
                        R2.f29211r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public g4(Object obj, int i10, Object obj2, int i11) {
        this.f11252a = i11;
        this.f11254c = obj;
        this.f11253b = i10;
        this.d = obj2;
    }

    public g4(Object obj, Object obj2, int i10, int i11) {
        this.f11252a = i11;
        this.f11254c = obj;
        this.d = obj2;
        this.f11253b = i10;
    }
}
