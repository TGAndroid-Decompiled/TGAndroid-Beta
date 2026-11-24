package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class tv4 extends fy0 implements gk7 {
    public final ArrayList A2;
    public boolean B2;
    public int C2;
    public boolean D2;
    public final int S1;
    public l5c T1;
    public List U1;
    public TLRPC.DisallowedGiftsSettings V1;
    public final long W1;
    public final boolean X1;
    public final String Y1;
    public final a6 Z1;
    public final FrameLayout a2;
    public final LinearLayout b2;
    public final w64 c2;
    public final fv4 d2;
    public final s11 e2;
    public final s11 f2;
    public final ArrayList g2;
    public final xsa h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public qua p2;
    public final l46 q2;
    public final TextView r2;
    public final TextView s2;
    public boolean t2;
    public final pha u2;
    public final fm0 v2;
    public final View w2;
    public final View x2;
    public final st y2;
    public final vec z2;

    public tv4(final android.content.Context r34, final int r35, final long r36, java.util.List r38, final defpackage.p8c r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv4.<init>(android.content.Context, int, long, java.util.List, p8c):void");
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.S1, 0, true, new ur4(this, (byte) 3), this.J0);
        this.T1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        if (this.X1) {
            return k96.M0(2131749923, null);
        }
        return vu3.m(k96.a0(null, null, 2131749832, this.Y1), null, false, null, 0);
    }

    @Override
    public final void M0(android.graphics.Canvas r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv4.M0(android.graphics.Canvas, int):void");
    }

    @Override
    public final void W0() {
        super.W0();
        pha phaVar = this.u2;
        if (phaVar != null) {
            phaVar.setTitle(J0());
        }
    }

    public final void Y0(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        float f3;
        long j;
        float f4;
        xsa xsaVar;
        TL_stars.StarGift starGift;
        boolean z4;
        boolean z5;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z6;
        boolean z7;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        vec vecVar;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        xsa xsaVar2;
        xsa xsaVar3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        this.B2 = false;
        this.t2 = false;
        if (!this.X1 && this.W1 >= 0 && ((disallowedGiftsSettings4 = this.V1) == null || !disallowedGiftsSettings4.disallow_premium_gifts)) {
            arrayList.add(c4c.k(this.Z1));
            this.t2 = true;
            arrayList.add(c4c.k(this.a2));
            ArrayList arrayList3 = this.g2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                ArrayList arrayList4 = this.g2;
                int size = arrayList4.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList4.get(i);
                    i++;
                    int i2 = mv4.b;
                    c4c K = c4c.K(mv4.class);
                    K.v = 1;
                    K.H = (mu4) obj;
                    arrayList.add(K);
                }
            } else {
                c4c q = c4c.q(1, 34);
                q.v = 1;
                arrayList.add(q);
                c4c q2 = c4c.q(2, 34);
                q2.v = 1;
                arrayList.add(q2);
                c4c q3 = c4c.q(3, 34);
                q3.v = 1;
                arrayList.add(q3);
            }
            z = true;
        } else {
            z = false;
        }
        gta v = gta.v(this.S1, false);
        if (this.m2) {
            arrayList2 = v.J;
        } else {
            arrayList2 = v.I;
        }
        if (this.V1 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new km1(this, (byte) 3)).collect(Collectors.toCollection(new lm1((byte) 0)));
        }
        if (this.W1 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new sd((byte) 5)).collect(Collectors.toCollection(new lm1((byte) 0)));
        }
        if (this.W1 != y6c.h(this.S1).e() && (xsaVar3 = this.h2) != null) {
            ArrayList arrayList5 = xsaVar3.l;
            int size2 = arrayList5.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList5.get(i3);
                i3++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !cq7.m(starGift2)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        float f5 = 300.0f;
        if (!na7.q1(this.S1).k4.x2.f && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.V1) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && (xsaVar2 = this.h2) != null && !xsaVar2.l.isEmpty()))) {
            if (!z) {
                arrayList.add(c4c.k(this.Z1));
            } else {
                arrayList.add(c4c.D(gl.L(16.0f)));
            }
            arrayList.add(c4c.k(this.b2));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.V1;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i4)).stars));
                }
            }
            ArrayList arrayList6 = new ArrayList();
            this.j2 = -1;
            this.i2 = -1;
            if (!arrayList2.isEmpty()) {
                this.i2 = arrayList6.size();
                arrayList6.add(k96.M0(2131749934, null));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.V1;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z2) {
                this.j2 = arrayList6.size();
                arrayList6.add(k96.M0(2131749930, null));
            }
            this.k2 = arrayList6.size();
            arrayList6.add(k96.M0(2131749933, null));
            if (this.n2 && !this.o2) {
                this.o2 = true;
                this.l2 = this.k2;
            }
            arrayList.add(c4c.n(this.x2, 52));
            this.B2 = true;
            ArrayList arrayList7 = this.A2;
            float f6 = 1.0f;
            if (this.z2 != null) {
                if (!arrayList7.equals(arrayList6)) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    this.z2.c();
                    int i5 = 0;
                    while (true) {
                        int size3 = arrayList6.size();
                        vecVar = this.z2;
                        if (i5 >= size3) {
                            break;
                        }
                        vecVar.a(i5, (CharSequence) arrayList6.get(i5));
                        i5++;
                    }
                    vecVar.y.f();
                    this.y2.requestLayout();
                }
                int currentTabId = this.z2.getCurrentTabId();
                int i6 = this.l2;
                if (currentTabId != i6) {
                    this.z2.g(1.0f, i6);
                }
            }
            if (this.l2 == this.k2 && !this.X1 && this.W1 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.D2) {
                j = 0;
            } else {
                this.D2 = z3;
                ViewPropertyAnimator animate = this.e2.animate();
                float f7 = 0.0f;
                if (!z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f);
                if (!z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                if (!z3) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.85f;
                }
                j = 0;
                ViewPropertyAnimator duration = scaleX.scaleY(f3).setDuration(380L);
                s33 s33Var = s33.h;
                duration.setInterpolator(s33Var).start();
                ViewPropertyAnimator animate2 = this.f2.animate();
                if (z3) {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f7);
                if (z3) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f4);
                if (!z3) {
                    f6 = 0.85f;
                }
                scaleX2.scaleY(f6).setDuration(380L).setInterpolator(s33Var).start();
            }
            if (this.h2 != null && this.l2 == this.j2) {
                arrayList2 = new ArrayList();
                ArrayList arrayList8 = this.h2.l;
                int size4 = arrayList8.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj3 = arrayList8.get(i7);
                    i7++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    TL_stars.StarGift starGift3 = savedStarGift.gift;
                    if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !cq7.m(starGift3)) {
                        arrayList2.add(savedStarGift.gift);
                    }
                }
            }
            int i8 = 0;
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TL_stars.StarGift starGift4 = (TL_stars.StarGift) arrayList2.get(i9);
                int i10 = this.l2;
                if (i10 == this.i2 || i10 == this.j2 || (i10 == this.k2 && (starGift4.availability_resale > j || starGift4.require_premium || starGift4.locked_until_date != 0))) {
                    if (!starGift4.sold_out && starGift4.availability_resale > j && i10 != this.k2) {
                        if (i10 == this.j2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (starGift4.limited && (disallowedGiftsSettings2 = this.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        c4c i11 = mv4.i(i10, starGift4, z6, z7, false, false, false);
                        starGift = starGift4;
                        arrayList.add(i11);
                        i8++;
                    } else {
                        starGift = starGift4;
                    }
                    int i12 = this.l2;
                    if (i12 == this.j2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.V1) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList.add(mv4.i(i12, starGift, z4, z5, true, false, false));
                    i8++;
                }
            }
            int i13 = this.l2;
            int i14 = this.j2;
            if (i13 == i14 && (xsaVar = this.h2) != null && !xsaVar.j) {
                xsaVar.a();
                c4c q4 = c4c.q(4, 34);
                q4.v = 1;
                arrayList.add(q4);
                c4c q5 = c4c.q(5, 34);
                q5.v = 1;
                arrayList.add(q5);
                c4c q6 = c4c.q(6, 34);
                q6.v = 1;
                arrayList.add(q6);
            } else if (i13 != i14 && v.C) {
                c4c q7 = c4c.q(4, 34);
                q7.v = 1;
                arrayList.add(q7);
                c4c q8 = c4c.q(5, 34);
                q8.v = 1;
                arrayList.add(q8);
                c4c q9 = c4c.q(6, 34);
                q9.v = 1;
                arrayList.add(q9);
            }
            if (i8 >= 9) {
                f5 = 40.0f;
            }
            arrayList.add(c4c.D(gl.L(f5)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.V1;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(c4c.D(gl.L(300.0f)));
        }
    }

    public final float Z0() {
        int i = 0;
        float f = Float.MAX_VALUE;
        while (true) {
            o39 o39Var = this.n1;
            if (i < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i);
                int R = RecyclerView.R(childAt);
                if (R == 1) {
                    return o39Var.getY() + childAt.getY();
                }
                if (R > 1) {
                    f = -3.4028235E38f;
                }
                i++;
            } else if (f == Float.MAX_VALUE) {
                return o39Var.getHeight();
            } else {
                return f;
            }
        }
    }

    public final void a1(boolean z) {
        this.m2 = z;
        this.T1.O(false);
    }

    public final void b1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.g2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.U1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j = 0;
            for (int size = this.U1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.U1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.U1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                            if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                                break;
                            }
                        } else {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                    }
                    mu4 mu4Var = new mu4(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(mu4Var);
                    if (w01.b()) {
                        if (mu4Var.f() > j) {
                            j = mu4Var.f();
                        }
                    } else if (mu4Var.h() != null && ci0.h().j()) {
                        ?? obj = new Object();
                        obj.b = "inapp";
                        obj.a = mu4Var.h();
                        arrayList2.add(obj.a());
                    }
                }
            }
            if (w01.b()) {
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((mu4) obj2).g = j;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                ci0.h().o(arrayList2, new yu4(this));
            }
        }
        if (arrayList.isEmpty()) {
            on0.l(this.S1, null, new zu4(this, (byte) 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i == kk7.l5) {
            b1();
        } else if (i == kk7.G3) {
            l5c l5cVar2 = this.T1;
            if (l5cVar2 != null) {
                l5cVar2.O(true);
            }
        } else if (i == kk7.D0) {
            if (!this.J) {
                long longValue = ((Long) objArr[0]).longValue();
                long j = this.W1;
                if (longValue == j && j > 0) {
                    int i3 = this.S1;
                    TLRPC.UserFull W1 = na7.q1(i3).W1(j);
                    if (j != y6c.h(i3).e() && W1 != null) {
                        disallowedGiftsSettings = W1.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.V1 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        d S = LaunchActivity.S();
                        if (S != null) {
                            b00.u(k96.a0(null, null, 2131743503, cf3.s(j)), u21.b0(S), 2131624012, 36);
                            return;
                        }
                        return;
                    }
                    l5c l5cVar3 = this.T1;
                    if (l5cVar3 != null) {
                        l5cVar3.O(true);
                    }
                }
                ArrayList arrayList = this.g2;
                if (arrayList == null || arrayList.isEmpty()) {
                    b1();
                    l5c l5cVar4 = this.T1;
                    if (l5cVar4 != null) {
                        l5cVar4.O(true);
                    }
                }
            }
        } else if (i == kk7.J3) {
            if (!this.J) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new u21(this.c, this.J0).s(starGift.sticker, k96.M0(2131749951, null), gl.T2(k96.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
                l5c l5cVar5 = this.T1;
                if (l5cVar5 != null) {
                    l5cVar5.O(true);
                }
            }
        } else if (i == kk7.H3 && objArr[1] == this.h2 && (l5cVar = this.T1) != null) {
            l5cVar.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i = this.S1;
        kk7.f(i).n(this, kk7.l5);
        kk7.f(i).n(this, kk7.G3);
        kk7.f(i).n(this, kk7.D0);
        kk7.f(i).n(this, kk7.J3);
        kk7.f(i).n(this, kk7.H3);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void show() {
        int i = this.S1;
        if (na7.q1(i).t2()) {
            h5.b(i);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.V1;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            d S = LaunchActivity.S();
            if (S != null) {
                b00.u(k96.a0(null, null, 2131743503, cf3.s(this.W1)), u21.b0(S), 2131624012, 36);
                return;
            }
            return;
        }
        super.show();
    }

    public tv4(LaunchActivity launchActivity, int i, long j) {
        this(launchActivity, i, j, null, null);
    }
}
