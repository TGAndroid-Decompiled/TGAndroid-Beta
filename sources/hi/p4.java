package hi;

import a8.ee;
import android.util.SparseIntArray;
import bi.h7;
import bi.q9;
import bi.s9;
import bi.ua;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.dr0;
import org.telegram.ui.fi1;
import org.telegram.ui.q6;
public final class p4 implements Utilities.Callback {
    public final int f13206a;
    public final int f13207b;
    public final Object f13208c;
    public final Object d;

    public p4(int i10, org.telegram.ui.ActionBar.q qVar, s9 s9Var) {
        this.f13206a = 2;
        this.f13207b = i10;
        this.f13208c = qVar;
        this.d = s9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13206a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.h1((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.f13208c, this.f13207b, (TLRPC.User) this.d, 5));
                return;
            case 1:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f13208c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                r2Var.showDialog(new ki.a(r2Var.getContext(), chat, -chat2.f22027id, new ua(r2Var, this.f13207b, chat2, chat, 1)));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.h1(this.f13207b, (org.telegram.ui.ActionBar.q) this.f13208c, (SparseIntArray) obj, (s9) this.d, 12));
                return;
            case 3:
                float f7 = this.f13207b;
                ((q6) this.f13208c).run(Float.valueOf((ee.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f7)) + (((int[]) this.d)[0] / f7)), Boolean.FALSE);
                return;
            case 4:
                n10 n10Var = (n10) this.f13208c;
                int i10 = this.f13207b;
                n10Var.getClass();
                n10Var.A0 = ((Boolean) obj).booleanValue();
                n10Var.dismiss();
                ((Utilities.Callback) this.d).run(Integer.valueOf(i10));
                return;
            case 5:
                Utilities.themeQueue.postRunnable(new fi1((sg.p2) this.f13208c, this.f13207b, (List) obj, new ArrayList(), (dr0) this.d, 1));
                return;
            default:
                zh.r2 r2Var2 = (zh.r2) this.f13208c;
                int i11 = this.f13207b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2.f53227a;
                q9 q9Var = r2Var2.e;
                q9Var.a(i11, arrayList);
                ((zh.m2) this.d).f(true);
                r2Var2.f(true);
                r2Var2.o();
                TL_stars.TL_starGiftCollection c10 = q9Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() > 1) {
                        qc S = wc.b0(r2Var3).S(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        S.f31896s = false;
                        S.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        qc S2 = wc.b0(r2Var3).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h7.X1(savedStarGift.gift), c10.title)));
                        S2.f31896s = false;
                        S2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public p4(Object obj, int i10, Object obj2, int i11) {
        this.f13206a = i11;
        this.f13208c = obj;
        this.f13207b = i10;
        this.d = obj2;
    }

    public p4(Object obj, Object obj2, int i10, int i11) {
        this.f13206a = i11;
        this.f13208c = obj;
        this.d = obj2;
        this.f13207b = i10;
    }
}
