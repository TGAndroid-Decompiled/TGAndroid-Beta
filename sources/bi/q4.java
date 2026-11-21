package bi;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.ng;
public final class q4 implements Runnable {
    public final int f4024a = 1;
    public final long f4025b;
    public final boolean f4026c;
    public final int d;
    public final int f4027e;
    public final Object f4028f;
    public final Object h;

    public q4(tr trVar, long j3, ArrayList arrayList, boolean z10, int i7, int i10) {
        this.f4028f = trVar;
        this.f4025b = j3;
        this.h = arrayList;
        this.f4026c = z10;
        this.d = i7;
        this.f4027e = i10;
    }

    @Override
    public final void run() {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z10;
        long j3;
        int i7;
        switch (this.f4024a) {
            case 0:
                TLObject tLObject = (TLObject) this.f4028f;
                String str = (String) this.h;
                boolean z11 = tLObject instanceof TL_stars.TL_payments_uniqueStarGift;
                int i10 = this.d;
                if (z11) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    mp.u1(i10).f4(tL_payments_uniqueStarGift.users, false);
                    mp.u1(i10).Z3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        z10 = this.f4026c;
                        j3 = this.f4025b;
                        if ((tL_starGiftUnique != null || y4.m(tL_starGiftUnique) != z10 || (z10 && j3 != 0 && tL_starGiftUnique.getResellAmount(cg.b.f5303b).f5301b != j3)) && (i7 = this.f4027e + 1) < 8) {
                            org.telegram.messenger.g0.h3(new o4(i10, i7, j3, str, z10), y4.f4286a[i7]);
                            return;
                        } else if (tL_starGiftUnique != null) {
                            org.telegram.ui.Wallet.u0.D(i10).B().i(tL_starGiftUnique);
                            di.y8.y(i10, false).a0(tL_starGiftUnique);
                            ArrayList arrayList = k8.U;
                            if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                                boolean m10 = y4.m(tL_starGiftUnique);
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj = arrayList2.get(i11);
                                    i11++;
                                    WeakReference weakReference = (WeakReference) obj;
                                    y7 y7Var = (y7) weakReference.get();
                                    if (y7Var == null) {
                                        arrayList.remove(weakReference);
                                    } else {
                                        ArrayList arrayList3 = y7Var.d;
                                        if (y7Var.f4293a == i10 && y7Var.f4294b == tL_starGiftUnique.gift_id) {
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < arrayList3.size()) {
                                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList3.get(i12);
                                                    if (!tL_starGiftUnique.slug.equals(tL_starGiftUnique2.slug)) {
                                                        i12++;
                                                    } else if (y4.m(tL_starGiftUnique2)) {
                                                        if (!m10) {
                                                            y7Var.n(tL_starGiftUnique2);
                                                        } else {
                                                            arrayList3.set(i12, tL_starGiftUnique);
                                                            x10 x10Var = y7Var.f4295c;
                                                            if (x10Var != null) {
                                                                x10Var.a(Boolean.FALSE);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
                tL_starGiftUnique = null;
                z10 = this.f4026c;
                j3 = this.f4025b;
                if (tL_starGiftUnique != null) {
                }
                org.telegram.messenger.g0.h3(new o4(i10, i7, j3, str, z10), y4.f4286a[i7]);
                return;
            case 1:
                ((tr) this.f4028f).Q0(this.d, this.f4027e, this.f4025b, (ArrayList) this.h, this.f4026c);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4028f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f32619g0 = null;
                chatActivityEnterView.O0(true);
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null) {
                    gfVar.setText("");
                }
                ng ngVar = chatActivityEnterView.P3;
                if (ngVar != null) {
                    ngVar.H(charSequence, this.f4026c, this.d, this.f4027e, this.f4025b);
                    return;
                }
                return;
        }
    }

    public q4(TLObject tLObject, int i7, boolean z10, long j3, int i10, String str) {
        this.f4028f = tLObject;
        this.d = i7;
        this.f4026c = z10;
        this.f4025b = j3;
        this.f4027e = i10;
        this.h = str;
    }

    public q4(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        this.f4028f = chatActivityEnterView;
        this.h = charSequence;
        this.f4026c = z10;
        this.d = i7;
        this.f4027e = i10;
        this.f4025b = j3;
    }
}
