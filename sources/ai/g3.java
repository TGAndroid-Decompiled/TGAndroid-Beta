package ai;

import android.util.SparseIntArray;
import b8.be;
import ci.s8;
import ci.u8;
import ci.w9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.rz;
import org.telegram.ui.en0;
public final class g3 implements u10 {
    public final int f657a;
    public final int f658b;
    public final Object f659c;
    public final Object d;

    public g3(int i3, lg.n nVar, u8 u8Var) {
        this.f657a = 3;
        this.f658b = i3;
        this.f659c = nVar;
        this.d = u8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f657a) {
            case 0:
                u4 u4Var = (u4) this.f659c;
                int i3 = this.f658b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.d2 d2Var = u4Var.f1010a;
                s8 s8Var = u4Var.f1013e;
                s8Var.a(i3, arrayList);
                ((o4) this.d).f(true);
                u4Var.f(true);
                u4Var.o();
                TL_stars.TL_starGiftCollection c2 = s8Var.c(i3);
                if (c2 != null) {
                    if (arrayList.size() > 1) {
                        ac R = fc.a0(d2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(bd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c2.title)));
                        R.f31800r = false;
                        R.j();
                        return;
                    } else if (arrayList.size() == 1) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                        ac R2 = fc.a0(d2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750401, ci.l6.A1(savedStarGift.gift), c2.title)));
                        R2.f31800r = false;
                        R2.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new bi.q0((TLRPC.UserFull) obj, (org.telegram.ui.web.p) this.f659c, this.f658b, (TLRPC.User) this.d, 5));
                return;
            case 2:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f659c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                d2Var2.showDialog(new li.a(d2Var2.getContext(), chat, -chat2.f27001id, new w9(d2Var2, this.f658b, chat2, chat, 1)));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.q0(this.f658b, (lg.n) this.f659c, (SparseIntArray) obj, (u8) this.d, 13));
                return;
            case 4:
                float f10 = this.f658b;
                ((org.telegram.ui.o6) this.f659c).a(Float.valueOf((be.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (((int[]) this.d)[0] / f10)), Boolean.FALSE);
                return;
            case 5:
                rz rzVar = (rz) this.f659c;
                int i10 = this.f658b;
                rzVar.getClass();
                rzVar.f37864t2 = ((Boolean) obj).booleanValue();
                rzVar.dismiss();
                ((u10) this.d).a(Integer.valueOf(i10));
                return;
            default:
                Utilities.f21390i.c(new p1((ug.c2) this.f659c, this.f658b, (List) obj, new ArrayList(), (en0) this.d, 26));
                return;
        }
    }

    public g3(Object obj, int i3, Object obj2, int i10) {
        this.f657a = i10;
        this.f659c = obj;
        this.f658b = i3;
        this.d = obj2;
    }

    public g3(Object obj, Object obj2, int i3, int i10) {
        this.f657a = i10;
        this.f659c = obj;
        this.d = obj2;
        this.f658b = i3;
    }
}
