package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Wallet.c;
public final class uw1 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object h;

    public uw1(cf7 cf7Var, long j, ArrayList arrayList, boolean z, int i, int i2) {
        this.f = cf7Var;
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
                int i2 = ChatActivityEnterView.z7;
                chatActivityEnterView.g0 = null;
                chatActivityEnterView.N0(true);
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null) {
                    sy1Var.setText("");
                }
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    uz1Var.w(charSequence, this.c, this.d, this.e, this.b);
                    return;
                }
                return;
            case 1:
                ((cf7) obj2).N0(this.d, this.e, this.b, (ArrayList) obj, this.c);
                return;
            default:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                boolean z = tLObject instanceof TL_stars.TL_payments_uniqueStarGift;
                int i3 = this.d;
                if (z) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    oc7.r1(i3).d4(tL_payments_uniqueStarGift.users, false);
                    oc7.r1(i3).X3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                boolean z2 = this.c;
                long j = this.b;
                if ((tL_starGiftUnique == null || fs7.m(tL_starGiftUnique) != z2 || (z2 && j != 0 && tL_starGiftUnique.getResellAmount(ok.b).b != j)) && (i = this.e + 1) < 8) {
                    gm.d3(new tw1(i3, i, j, str, z2), fs7.a[i]);
                    return;
                } else if (tL_starGiftUnique != null) {
                    c.C(i3).A().i(tL_starGiftUnique);
                    jva.v(i3, false).a0(tL_starGiftUnique);
                    ArrayList arrayList = zb9.U;
                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                        boolean m = fs7.m(tL_starGiftUnique);
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            WeakReference weakReference = (WeakReference) obj3;
                            qb9 qb9Var = (qb9) weakReference.get();
                            if (qb9Var == null) {
                                arrayList.remove(weakReference);
                            } else {
                                ArrayList arrayList3 = qb9Var.d;
                                if (qb9Var.a == i3 && qb9Var.b == tL_starGiftUnique.gift_id) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < arrayList3.size()) {
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList3.get(i5);
                                            if (!tL_starGiftUnique.slug.equals(tL_starGiftUnique2.slug)) {
                                                i5++;
                                            } else if (fs7.m(tL_starGiftUnique2)) {
                                                if (!m) {
                                                    qb9Var.n(tL_starGiftUnique2);
                                                } else {
                                                    arrayList3.set(i5, tL_starGiftUnique);
                                                    qac qacVar = qb9Var.c;
                                                    if (qacVar != null) {
                                                        qacVar.a(Boolean.FALSE);
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

    public uw1(TLObject tLObject, int i, boolean z, long j, int i2, String str) {
        this.f = tLObject;
        this.d = i;
        this.c = z;
        this.b = j;
        this.e = i2;
        this.h = str;
    }

    public uw1(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z, int i, int i2, long j) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = j;
    }
}
