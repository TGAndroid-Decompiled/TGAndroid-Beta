package bi;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.mg;
public final class t4 implements Runnable {
    public final int f4074a = 1;
    public final long f4075b;
    public final boolean f4076c;
    public final int d;
    public final int f4077e;
    public final Object f4078f;
    public final Object h;

    public t4(tr trVar, long j3, ArrayList arrayList, boolean z10, int i7, int i10) {
        this.f4078f = trVar;
        this.f4075b = j3;
        this.h = arrayList;
        this.f4076c = z10;
        this.d = i7;
        this.f4077e = i10;
    }

    @Override
    public final void run() {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z10;
        long j3;
        int i7;
        switch (this.f4074a) {
            case 0:
                TLObject tLObject = (TLObject) this.f4078f;
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
                        z10 = this.f4076c;
                        j3 = this.f4075b;
                        if ((tL_starGiftUnique != null || a5.m(tL_starGiftUnique) != z10 || (z10 && j3 != 0 && tL_starGiftUnique.getResellAmount(cg.b.f5269b).f5267b != j3)) && (i7 = this.f4077e + 1) < 8) {
                            org.telegram.messenger.g0.h3(new r4(i10, i7, j3, str, z10), a5.f3354a[i7]);
                            return;
                        } else if (tL_starGiftUnique != null) {
                            org.telegram.ui.Wallet.v0.D(i10).B().i(tL_starGiftUnique);
                            di.y8.y(i10, false).a0(tL_starGiftUnique);
                            ArrayList arrayList = m8.U;
                            if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                                boolean m10 = a5.m(tL_starGiftUnique);
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj = arrayList2.get(i11);
                                    i11++;
                                    WeakReference weakReference = (WeakReference) obj;
                                    a8 a8Var = (a8) weakReference.get();
                                    if (a8Var == null) {
                                        arrayList.remove(weakReference);
                                    } else {
                                        ArrayList arrayList3 = a8Var.d;
                                        if (a8Var.f3361a == i10 && a8Var.f3362b == tL_starGiftUnique.gift_id) {
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < arrayList3.size()) {
                                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList3.get(i12);
                                                    if (!tL_starGiftUnique.slug.equals(tL_starGiftUnique2.slug)) {
                                                        i12++;
                                                    } else if (a5.m(tL_starGiftUnique2)) {
                                                        if (!m10) {
                                                            a8Var.n(tL_starGiftUnique2);
                                                        } else {
                                                            arrayList3.set(i12, tL_starGiftUnique);
                                                            w10 w10Var = a8Var.f3363c;
                                                            if (w10Var != null) {
                                                                w10Var.a(Boolean.FALSE);
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
                z10 = this.f4076c;
                j3 = this.f4075b;
                if (tL_starGiftUnique != null) {
                }
                org.telegram.messenger.g0.h3(new r4(i10, i7, j3, str, z10), a5.f3354a[i7]);
                return;
            case 1:
                ((tr) this.f4078f).Q0(this.d, this.f4077e, this.f4075b, (ArrayList) this.h, this.f4076c);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4078f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f32686g0 = null;
                chatActivityEnterView.P0(true);
                hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null) {
                    hfVar.setText("");
                }
                mg mgVar = chatActivityEnterView.P3;
                if (mgVar != null) {
                    mgVar.G(charSequence, this.f4076c, this.d, this.f4077e, this.f4075b);
                    return;
                }
                return;
        }
    }

    public t4(TLObject tLObject, int i7, boolean z10, long j3, int i10, String str) {
        this.f4078f = tLObject;
        this.d = i7;
        this.f4076c = z10;
        this.f4075b = j3;
        this.f4077e = i10;
        this.h = str;
    }

    public t4(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        this.f4078f = chatActivityEnterView;
        this.h = charSequence;
        this.f4076c = z10;
        this.d = i7;
        this.f4077e = i10;
        this.f4075b = j3;
    }
}
