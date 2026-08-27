package gh;

import hh.f8;
import hh.k7;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q00;
import org.telegram.ui.nq0;

public final class q2 implements Utilities.Callback {

    public final int f7502a;

    public final int f7503b;

    public final Object f7504c;
    public final Object d;

    public q2(Object obj, int i10, Object obj2, int i11) {
        this.f7502a = i11;
        this.f7504c = obj;
        this.f7503b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7502a) {
            case 0:
                d4 d4Var = (d4) this.f7504c;
                int i10 = this.f7503b;
                t3 t3Var = (t3) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var = d4Var.f7197a;
                k7 k7Var = d4Var.f7200e;
                k7Var.a(i10, arrayList);
                t3Var.f(true);
                d4Var.f(true);
                d4Var.n();
                TL_stars.TL_starGiftCollection tL_starGiftCollectionC = k7Var.c(i10);
                if (tL_starGiftCollectionC != null) {
                    if (arrayList.size() > 1) {
                        ec ecVarR = mc.a0(n2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), tL_starGiftCollectionC.title)));
                        ecVarR.f28028r = false;
                        ecVarR.j();
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        ec ecVarR2 = mc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, hh.i5.D1(savedStarGift.gift), tL_starGiftCollectionC.title)));
                        ecVarR2.f28028r = false;
                        ecVarR2.j();
                    }
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ag.k0((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.f7504c, this.f7503b, (TLRPC.User) this.d, 5));
                break;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f7504c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var2.showDialog(new qh.a(n2Var2.getContext(), chat, -chat2.f22380id, new f8(n2Var2, this.f7503b, chat2, chat, 1)));
                break;
            case 3:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f7504c;
                int[] iArr = (int[]) this.d;
                int i11 = this.f7503b;
                float f10 = iArr[0];
                float f11 = i11;
                m6Var.run(Float.valueOf((h7.n.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 4:
                q00 q00Var = (q00) this.f7504c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i12 = this.f7503b;
                q00Var.getClass();
                q00Var.f31743w0 = ((Boolean) obj).booleanValue();
                q00Var.dismiss();
                callback.run(Integer.valueOf(i12));
                break;
            default:
                Utilities.themeQueue.postRunnable(new e1((zf.n2) this.f7504c, this.f7503b, (List) obj, new ArrayList(), (nq0) this.d, 29));
                break;
        }
    }

    public q2(Object obj, Object obj2, int i10, int i11) {
        this.f7502a = i11;
        this.f7504c = obj;
        this.d = obj2;
        this.f7503b = i10;
    }
}
