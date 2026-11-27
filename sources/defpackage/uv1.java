package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Wallet.c;
public final class uv1 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object h;

    public uv1(kf7 kf7Var, long j, ArrayList arrayList, boolean z, int i, int i2) {
        this.f = kf7Var;
        this.b = j;
        this.h = arrayList;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    @Override
    public final void run() {
        int[] iArr;
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        Object obj = this.h;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                CharSequence charSequence = (CharSequence) obj;
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.g0 = null;
                chatActivityEnterView.R0(true);
                tx1 tx1Var = chatActivityEnterView.F0;
                if (tx1Var != null) {
                    tx1Var.setText("");
                }
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.x(charSequence, this.c, this.d, this.e, this.b);
                    return;
                }
                return;
            case 1:
                ((kf7) obj2).Q0(this.d, this.e, this.b, (ArrayList) obj, this.c);
                return;
            default:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                boolean z = tLObject instanceof TL_stars.TL_payments_uniqueStarGift;
                int i2 = this.d;
                if (z) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    uc7.s1(i2).j4(tL_payments_uniqueStarGift.users, false);
                    uc7.s1(i2).c4(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                boolean z2 = this.c;
                long j = this.b;
                if (tL_starGiftUnique == null || it7.n(tL_starGiftUnique) != z2 || (z2 && j != 0 && tL_starGiftUnique.getResellAmount(pj.b).b != j)) {
                    int i3 = this.e + 1;
                    if (i3 < it7.b.length) {
                        hl.d3(new tv1(i2, i3, j, str, z2), iArr[i3]);
                        return;
                    }
                }
                if (tL_starGiftUnique != null) {
                    c.C(i2).A().i(tL_starGiftUnique);
                    jxa.v(i2, false).b0(tL_starGiftUnique);
                    ArrayList arrayList = nd9.c0;
                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                        boolean n = it7.n(tL_starGiftUnique);
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            WeakReference weakReference = (WeakReference) obj3;
                            ed9 ed9Var = (ed9) weakReference.get();
                            if (ed9Var == null) {
                                arrayList.remove(weakReference);
                            } else {
                                ArrayList arrayList3 = ed9Var.e;
                                if (ed9Var.a == i2) {
                                    if (ed9Var.b.contains(Long.valueOf(tL_starGiftUnique.gift_id))) {
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 < arrayList3.size()) {
                                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList3.get(i5);
                                                if (!tL_starGiftUnique.slug.equals(tL_starGiftUnique2.slug)) {
                                                    i5++;
                                                } else if (it7.n(tL_starGiftUnique2)) {
                                                    if (!n) {
                                                        ed9Var.q(tL_starGiftUnique2);
                                                    } else {
                                                        arrayList3.set(i5, tL_starGiftUnique);
                                                        pcc pccVar = ed9Var.d;
                                                        if (pccVar != null) {
                                                            pccVar.a(Boolean.FALSE);
                                                        }
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
                }
                return;
        }
    }

    public uv1(TLObject tLObject, int i, boolean z, long j, int i2, String str) {
        this.f = tLObject;
        this.d = i;
        this.c = z;
        this.b = j;
        this.e = i2;
        this.h = str;
    }

    public uv1(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z, int i, int i2, long j) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = j;
    }
}
