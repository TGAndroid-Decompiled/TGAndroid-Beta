package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Wallet.c;
public final class jv1 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object h;

    public jv1(ad7 ad7Var, long j, ArrayList arrayList, boolean z, int i, int i2) {
        this.f = ad7Var;
        this.b = j;
        this.h = arrayList;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        Object obj = this.h;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                CharSequence charSequence = (CharSequence) obj;
                int i2 = ChatActivityEnterView.r7;
                chatActivityEnterView.g0 = null;
                chatActivityEnterView.N0(true);
                ex1 ex1Var = chatActivityEnterView.F0;
                if (ex1Var != null) {
                    ex1Var.setText("");
                }
                hy1 hy1Var = chatActivityEnterView.P3;
                if (hy1Var != null) {
                    hy1Var.u(charSequence, this.c, this.d, this.e, this.b);
                    return;
                }
                return;
            case 1:
                ((ad7) obj2).N0(this.d, this.e, this.b, (ArrayList) obj, this.c);
                return;
            default:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                boolean z = tLObject instanceof TL_stars.TL_payments_uniqueStarGift;
                int i3 = this.d;
                if (z) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    na7.q1(i3).b4(tL_payments_uniqueStarGift.users, false);
                    na7.q1(i3).V3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                boolean z2 = this.c;
                long j = this.b;
                if ((tL_starGiftUnique == null || cq7.m(tL_starGiftUnique) != z2 || (z2 && j != 0 && tL_starGiftUnique.getResellAmount(oj.b).b != j)) && (i = this.e + 1) < 8) {
                    gl.d3(new iv1(i3, i, j, str, z2), cq7.a[i]);
                    return;
                } else if (tL_starGiftUnique != null) {
                    c.C(i3).A().i(tL_starGiftUnique);
                    gta.v(i3, false).a0(tL_starGiftUnique);
                    ArrayList arrayList = z99.U;
                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                        boolean m = cq7.m(tL_starGiftUnique);
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            WeakReference weakReference = (WeakReference) obj3;
                            q99 q99Var = (q99) weakReference.get();
                            if (q99Var == null) {
                                arrayList.remove(weakReference);
                            } else {
                                ArrayList arrayList3 = q99Var.d;
                                if (q99Var.a == i3 && q99Var.b == tL_starGiftUnique.gift_id) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < arrayList3.size()) {
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList3.get(i5);
                                            if (!tL_starGiftUnique.slug.equals(tL_starGiftUnique2.slug)) {
                                                i5++;
                                            } else if (cq7.m(tL_starGiftUnique2)) {
                                                if (!m) {
                                                    q99Var.n(tL_starGiftUnique2);
                                                } else {
                                                    arrayList3.set(i5, tL_starGiftUnique);
                                                    p8c p8cVar = q99Var.c;
                                                    if (p8cVar != null) {
                                                        p8cVar.a(Boolean.FALSE);
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

    public jv1(TLObject tLObject, int i, boolean z, long j, int i2, String str) {
        this.f = tLObject;
        this.d = i;
        this.c = z;
        this.b = j;
        this.e = i2;
        this.h = str;
    }

    public jv1(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z, int i, int i2, long j) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = j;
    }
}
