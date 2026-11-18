package bi;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import di.ua;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.jk;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
public final class j3 extends sa implements fs {
    public static final int F2 = 0;
    public final f71 A2;
    public final ArrayList B2;
    public boolean C2;
    public int D2;
    public boolean E2;
    public final int T1;
    public z41 U1;
    public List V1;
    public TLRPC.DisallowedGiftsSettings W1;
    public final long X1;
    public final boolean Y1;
    public final String Z1;
    public final p2 f3722a2;
    public final FrameLayout f3723b2;
    public final LinearLayout f3724c2;
    public final uy d2;
    public final t2 f3725e2;
    public final q2 f3726f2;
    public final q2 f3727g2;
    public final ArrayList f3728h2;
    public final di.o8 f3729i2;
    public int f3730j2;
    public int f3731k2;
    public int f3732l2;
    public int f3733m2;
    public boolean f3734n2;
    public boolean f3735o2;
    public boolean f3736p2;
    public ua f3737q2;
    public final k80 f3738r2;
    public final TextView f3739s2;
    public final TextView f3740t2;
    public boolean f3741u2;
    public final org.telegram.ui.ActionBar.a5 f3742v2;
    public final te.a f3743w2;
    public final View f3744x2;
    public final View f3745y2;
    public final ai.k0 f3746z2;

    public j3(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.T1, 0, true, new b(this, 6), this.J0);
        this.U1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        if (this.Y1) {
            return gd.M0(2131749923, null);
        }
        return org.telegram.messenger.j6.m(gd.a0(null, null, 2131749832, this.Z1), null, false, null, 0);
    }

    @Override
    public final void S0(android.graphics.Canvas r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j3.S0(android.graphics.Canvas, int):void");
    }

    @Override
    public final void c1() {
        super.c1();
        org.telegram.ui.ActionBar.a5 a5Var = this.f3742v2;
        if (a5Var != null) {
            a5Var.setTitle(P0());
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i7 == ks.f25154m5) {
            h1();
        } else if (i7 == ks.H3) {
            z41 z41Var2 = this.U1;
            if (z41Var2 != null) {
                z41Var2.O(true);
            }
        } else if (i7 == ks.E0) {
            if (!this.J) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.X1;
                if (longValue == j3 && j3 > 0) {
                    int i11 = this.T1;
                    TLRPC.UserFull d2 = mp.u1(i11).d2(j3);
                    if (j3 != j10.i(i11).e() && d2 != null) {
                        disallowedGiftsSettings = d2.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.W1 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                        if (T != null) {
                            n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(j3)), lc.b0(T), 2131624012, 36);
                            return;
                        }
                        return;
                    }
                    z41 z41Var3 = this.U1;
                    if (z41Var3 != null) {
                        z41Var3.O(true);
                    }
                }
                ArrayList arrayList = this.f3728h2;
                if (arrayList == null || arrayList.isEmpty()) {
                    h1();
                    z41 z41Var4 = this.U1;
                    if (z41Var4 != null) {
                        z41Var4.O(true);
                    }
                }
            }
        } else if (i7 == ks.K3) {
            if (!this.J) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new lc(this.f30193c, this.J0).s(starGift.sticker, gd.M0(2131749951, null), org.telegram.messenger.g0.W2(gd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
                z41 z41Var5 = this.U1;
                if (z41Var5 != null) {
                    z41Var5.O(true);
                }
            }
        } else if (i7 == ks.I3 && objArr[1] == this.f3729i2 && (z41Var = this.U1) != null) {
            z41Var.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i7 = this.T1;
        ks.f(i7).n(this, ks.f25154m5);
        ks.f(i7).n(this, ks.H3);
        ks.f(i7).n(this, ks.E0);
        ks.f(i7).n(this, ks.K3);
        ks.f(i7).n(this, ks.I3);
    }

    public final void e1(ArrayList arrayList, z41 z41Var) {
        long j3;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        TL_stars.StarGift starGift;
        boolean z13;
        boolean z14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z15;
        boolean z16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        this.C2 = false;
        this.f3741u2 = false;
        p2 p2Var = this.f3722a2;
        long j10 = this.X1;
        long j11 = 0;
        boolean z17 = this.Y1;
        if (z17 || j10 < 0 || ((disallowedGiftsSettings4 = this.W1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(l41.k(p2Var));
            this.f3741u2 = true;
            arrayList.add(l41.k(this.f3723b2));
            ArrayList arrayList3 = this.f3728h2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList3.get(i7);
                    i7++;
                    int i10 = b3.f3432b;
                    l41 K = l41.K(b3.class);
                    K.v = 1;
                    K.H = (ug.j) obj;
                    arrayList.add(K);
                    j11 = j11;
                }
                j3 = j11;
            } else {
                j3 = 0;
                l41 q10 = l41.q(1, 34);
                q10.v = 1;
                arrayList.add(q10);
                l41 q11 = l41.q(2, 34);
                q11.v = 1;
                arrayList.add(q11);
                l41 q12 = l41.q(3, 34);
                q12.v = 1;
                arrayList.add(q12);
            }
            z10 = true;
        }
        int i11 = this.T1;
        di.x8 y10 = di.x8.y(i11, false);
        if (this.f3734n2) {
            arrayList2 = y10.J;
        } else {
            arrayList2 = y10.I;
        }
        if (this.W1 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ki.i1(this, 2)).collect(Collectors.toCollection(new jk(1)));
        }
        int i12 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i12 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new aa.m(3)).collect(Collectors.toCollection(new jk(1)));
        }
        int i13 = (j10 > j10.i(i11).e() ? 1 : (j10 == j10.i(i11).e() ? 0 : -1));
        di.o8 o8Var = this.f3729i2;
        if (i13 != 0 && o8Var != null) {
            ArrayList arrayList4 = o8Var.f9467l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !u4.m(starGift2)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        float f14 = 300.0f;
        if (!mp.u1(i11).f25610b6 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.W1) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && o8Var != null && !o8Var.f9467l.isEmpty()))) {
            if (!z10) {
                arrayList.add(l41.k(p2Var));
            } else {
                arrayList.add(l41.D(org.telegram.messenger.g0.L(16.0f)));
            }
            arrayList.add(l41.k(this.f3724c2));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.W1;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f3731k2 = -1;
            this.f3730j2 = -1;
            if (!arrayList2.isEmpty()) {
                this.f3730j2 = arrayList5.size();
                arrayList5.add(gd.M0(2131749934, null));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.W1;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f3731k2 = arrayList5.size();
                arrayList5.add(gd.M0(2131749930, null));
            }
            this.f3732l2 = arrayList5.size();
            arrayList5.add(gd.M0(2131749933, null));
            if (this.f3735o2 && !this.f3736p2) {
                this.f3736p2 = true;
                this.f3733m2 = this.f3732l2;
            }
            arrayList.add(l41.n(this.f3745y2, 52));
            this.C2 = true;
            f71 f71Var = this.A2;
            float f15 = 1.0f;
            if (f71Var != null) {
                ArrayList arrayList6 = this.B2;
                if (!arrayList6.equals(arrayList5)) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    f71Var.c();
                    for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                        f71Var.a(i16, (CharSequence) arrayList5.get(i16));
                    }
                    f71Var.f35018y.f();
                    this.f3746z2.requestLayout();
                }
                int currentTabId = f71Var.getCurrentTabId();
                int i17 = this.f3733m2;
                if (currentTabId != i17) {
                    f71Var.g(1.0f, i17);
                }
            }
            if (this.f3733m2 == this.f3732l2 && !z17 && i12 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.E2) {
                this.E2 = z12;
                ViewPropertyAnimator animate = this.f3726f2.animate();
                float f16 = 0.0f;
                if (!z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (!z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(380L);
                lr lrVar = lr.h;
                duration.setInterpolator(lrVar).start();
                ViewPropertyAnimator animate2 = this.f3727g2.animate();
                if (z12) {
                    f16 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f16);
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z12) {
                    f15 = 0.85f;
                }
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(lrVar).start();
            }
            if (o8Var != null && this.f3733m2 == this.f3731k2) {
                arrayList2 = new ArrayList();
                ArrayList arrayList7 = o8Var.f9467l;
                int size3 = arrayList7.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList7.get(i18);
                    i18++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                    TL_stars.StarGift starGift3 = savedStarGift.gift;
                    if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !u4.m(starGift3)) {
                        arrayList2.add(savedStarGift.gift);
                    }
                }
            }
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                TL_stars.StarGift starGift4 = (TL_stars.StarGift) arrayList2.get(i20);
                int i21 = this.f3733m2;
                if (i21 == this.f3730j2 || i21 == this.f3731k2 || (i21 == this.f3732l2 && (starGift4.availability_resale > j3 || starGift4.require_premium || starGift4.locked_until_date != 0))) {
                    if (!starGift4.sold_out && starGift4.availability_resale > j3 && i21 != this.f3732l2) {
                        if (i21 == this.f3731k2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift4.limited && (disallowedGiftsSettings2 = this.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        l41 i22 = b3.i(i21, starGift4, z15, z16, false, false, false);
                        starGift = starGift4;
                        arrayList.add(i22);
                        i19++;
                    } else {
                        starGift = starGift4;
                    }
                    int i23 = this.f3733m2;
                    if (i23 == this.f3731k2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.W1) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(b3.i(i23, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i24 = this.f3733m2;
            int i25 = this.f3731k2;
            if (i24 == i25 && o8Var != null && !o8Var.f9465j) {
                o8Var.a();
                l41 q13 = l41.q(4, 34);
                q13.v = 1;
                arrayList.add(q13);
                l41 q14 = l41.q(5, 34);
                q14.v = 1;
                arrayList.add(q14);
                l41 q15 = l41.q(6, 34);
                q15.v = 1;
                arrayList.add(q15);
            } else if (i24 != i25 && y10.C) {
                l41 q16 = l41.q(4, 34);
                q16.v = 1;
                arrayList.add(q16);
                l41 q17 = l41.q(5, 34);
                q17.v = 1;
                arrayList.add(q17);
                l41 q18 = l41.q(6, 34);
                q18.v = 1;
                arrayList.add(q18);
            }
            if (i19 >= 9) {
                f14 = 40.0f;
            }
            arrayList.add(l41.D(org.telegram.messenger.g0.L(f14)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.W1;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(l41.D(org.telegram.messenger.g0.L(300.0f)));
        }
    }

    public final float f1() {
        int i7 = 0;
        float f10 = Float.MAX_VALUE;
        while (true) {
            ck0 ck0Var = this.f39534o1;
            if (i7 < ck0Var.getChildCount()) {
                View childAt = ck0Var.getChildAt(i7);
                int R = RecyclerView.R(childAt);
                if (R == 1) {
                    return ck0Var.getY() + childAt.getY();
                }
                if (R > 1) {
                    f10 = -3.4028235E38f;
                }
                i7++;
            } else if (f10 == Float.MAX_VALUE) {
                return ck0Var.getHeight();
            } else {
                return f10;
            }
        }
    }

    public final void g1(boolean z10) {
        this.f3734n2 = z10;
        this.U1.O(false);
    }

    public final void h1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f3728h2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.V1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
            for (int size = this.V1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.V1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.V1.iterator();
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
                    ug.j jVar = new ug.j(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(jVar);
                    if (org.telegram.messenger.s2.b()) {
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        f5.a aVar = new f5.a();
                        aVar.f11245c = "inapp";
                        aVar.f11244b = jVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.s2.b()) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ug.j) obj).f58708g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new b2(this));
            }
        }
        if (arrayList.isEmpty()) {
            wg.s.j(this.T1, null, new c2(this, 1));
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        int i7 = this.T1;
        if (mp.u1(i7).A2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.W1;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T != null) {
                n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(this.X1)), lc.b0(T), 2131624012, 36);
                return;
            }
            return;
        }
        super.show();
    }

    public j3(final android.content.Context r33, final int r34, final long r35, java.util.List r37, final org.telegram.messenger.x10 r38) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j3.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.x10):void");
    }
}
