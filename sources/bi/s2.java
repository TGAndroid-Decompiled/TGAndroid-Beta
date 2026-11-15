package bi;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import di.bb;
import di.m8;
import di.ra;
import di.v8;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.lk;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
public final class s2 extends ja implements is {
    public static final int f3841u2 = 0;
    public final int T1;
    public p41 U1;
    public List V1;
    public TLRPC.DisallowedGiftsSettings W1;
    public final long X1;
    public final boolean Y1;
    public final String Z1;
    public final bb f3842a2;
    public final v1 f3843b2;
    public final FrameLayout f3844c2;
    public final LinearLayout d2;
    public final oy f3845e2;
    public final z1 f3846f2;
    public final w1 f3847g2;
    public final w1 f3848h2;
    public final ArrayList f3849i2;
    public final m8 f3850j2;
    public int f3851k2;
    public int f3852l2;
    public int f3853m2;
    public int f3854n2;
    public boolean f3855o2;
    public boolean f3856p2;
    public boolean f3857q2;
    public ra f3858r2;
    public final z70 f3859s2;
    public boolean f3860t2;

    public s2(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.T1, 0, true, new b(this, 5), this.J0);
        this.U1 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.Y1) {
            return hd.M0(2131749939, null);
        }
        return org.telegram.messenger.j6.m(hd.a0(null, null, 2131749848, this.Z1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, p41 p41Var) {
        long j3;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        float f10;
        TL_stars.StarGift starGift;
        boolean z13;
        boolean z14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z15;
        boolean z16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f11;
        float f12;
        float f13;
        float f14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        v1 v1Var = this.f3843b2;
        long j10 = this.X1;
        long j11 = 0;
        boolean z17 = this.Y1;
        if (z17 || j10 < 0 || ((disallowedGiftsSettings4 = this.W1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z10 = false;
        } else {
            arrayList.add(b41.k(v1Var));
            arrayList.add(b41.k(this.f3844c2));
            ArrayList arrayList3 = this.f3849i2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList3.get(i7);
                    i7++;
                    int i10 = h2.f3561b;
                    b41 K = b41.K(h2.class);
                    K.f33190u = 1;
                    K.G = (ug.j) obj;
                    arrayList.add(K);
                    j11 = j11;
                }
                j3 = j11;
            } else {
                j3 = 0;
                b41 q10 = b41.q(1, 34);
                q10.f33190u = 1;
                arrayList.add(q10);
                b41 q11 = b41.q(2, 34);
                q11.f33190u = 1;
                arrayList.add(q11);
                b41 q12 = b41.q(3, 34);
                q12.f33190u = 1;
                arrayList.add(q12);
            }
            z10 = true;
        }
        int i11 = this.T1;
        v8 y10 = v8.y(i11, false);
        if (this.f3855o2) {
            arrayList2 = y10.J;
        } else {
            arrayList2 = y10.I;
        }
        if (this.W1 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ki.k1(this, 2)).collect(Collectors.toCollection(new lk(1)));
        }
        int i12 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i12 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new aa.m(3)).collect(Collectors.toCollection(new lk(1)));
        }
        int i13 = (j10 > m10.i(i11).e() ? 1 : (j10 == m10.i(i11).e() ? 0 : -1));
        m8 m8Var = this.f3850j2;
        if (i13 != 0 && m8Var != null) {
            ArrayList arrayList4 = m8Var.f9051l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!np.s1(i11).Z5 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.W1) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && m8Var != null && !m8Var.f9051l.isEmpty()))) {
            if (!z10) {
                arrayList.add(b41.k(v1Var));
            } else {
                arrayList.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
            }
            arrayList.add(b41.k(this.d2));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.W1;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f3852l2 = -1;
            this.f3851k2 = -1;
            if (!arrayList2.isEmpty()) {
                this.f3851k2 = arrayList5.size();
                arrayList5.add(hd.M0(2131749950, null));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.W1;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f3852l2 = arrayList5.size();
                arrayList5.add(hd.M0(2131749946, null));
            }
            this.f3853m2 = arrayList5.size();
            arrayList5.add(hd.M0(2131749949, null));
            if (this.f3856p2 && !this.f3857q2) {
                this.f3857q2 = true;
                this.f3854n2 = this.f3853m2;
            }
            int i16 = this.f3854n2;
            n1 n1Var = new n1(this, 0);
            int i17 = q2.f3802b;
            b41 K2 = b41.K(q2.class);
            K2.d = 1;
            K2.G = arrayList5;
            K2.f33194z = i16;
            K2.H = n1Var;
            arrayList.add(K2);
            if (this.f3854n2 == this.f3853m2 && !z17 && i12 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f3860t2) {
                this.f3860t2 = z12;
                ViewPropertyAnimator animate = this.f3847g2.animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
                if (!z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (!z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (!z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f13).setDuration(380L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                ViewPropertyAnimator animate2 = this.f3848h2.animate();
                if (z12) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (z12) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f14);
                if (!z12) {
                    f16 = 0.85f;
                }
                scaleX2.scaleY(f16).setDuration(380L).setInterpolator(erVar).start();
            }
            if (m8Var != null && this.f3854n2 == this.f3852l2) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = m8Var.f9051l;
                int size3 = arrayList6.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList6.get(i18);
                    i18++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i20);
                int i21 = this.f3854n2;
                if (i21 == this.f3851k2 || i21 == this.f3852l2 || (i21 == this.f3853m2 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j3 && i21 != this.f3853m2) {
                        if (i21 == this.f3852l2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        b41 i22 = h2.i(i21, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(i22);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f3854n2;
                    if (i23 == this.f3852l2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.W1) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(h2.i(i23, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i24 = this.f3854n2;
            int i25 = this.f3852l2;
            if (i24 == i25 && m8Var != null && !m8Var.f9049j) {
                m8Var.a();
                b41 q13 = b41.q(4, 34);
                q13.f33190u = 1;
                arrayList.add(q13);
                b41 q14 = b41.q(5, 34);
                q14.f33190u = 1;
                arrayList.add(q14);
                b41 q15 = b41.q(6, 34);
                q15.f33190u = 1;
                arrayList.add(q15);
            } else if (i24 != i25 && y10.C) {
                b41 q16 = b41.q(4, 34);
                q16.f33190u = 1;
                arrayList.add(q16);
                b41 q17 = b41.q(5, 34);
                q17.f33190u = 1;
                arrayList.add(q17);
                b41 q18 = b41.q(6, 34);
                q18.f33190u = 1;
                arrayList.add(q18);
            }
            if (i19 < 9) {
                f10 = 300.0f;
            } else {
                f10 = 40.0f;
            }
            arrayList.add(b41.D(org.telegram.messenger.g0.L(f10)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.W1;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(b41.D(org.telegram.messenger.g0.L(300.0f)));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i7 == ns.f25520j5) {
            f1();
        } else if (i7 == ns.F3) {
            p41 p41Var2 = this.U1;
            if (p41Var2 != null) {
                p41Var2.O(true);
            }
        } else if (i7 == ns.E0) {
            if (!this.J) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.X1;
                if (longValue == j3 && j3 > 0) {
                    int i11 = this.T1;
                    TLRPC.UserFull b22 = np.s1(i11).b2(j3);
                    if (j3 != m10.i(i11).e() && b22 != null) {
                        disallowedGiftsSettings = b22.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.W1 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), cc.a0(T), 2131624012, 36);
                            return;
                        }
                        return;
                    }
                    p41 p41Var3 = this.U1;
                    if (p41Var3 != null) {
                        p41Var3.O(true);
                    }
                }
                ArrayList arrayList = this.f3849i2;
                if (arrayList == null || arrayList.isEmpty()) {
                    f1();
                    p41 p41Var4 = this.U1;
                    if (p41Var4 != null) {
                        p41Var4.O(true);
                    }
                }
            }
        } else if (i7 == ns.I3) {
            if (!this.J) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new cc(this.f29685c, this.J0).s(starGift.sticker, hd.M0(2131749967, null), org.telegram.messenger.g0.X2(hd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
                p41 p41Var5 = this.U1;
                if (p41Var5 != null) {
                    p41Var5.O(true);
                }
            }
        } else if (i7 == ns.G3 && objArr[1] == this.f3850j2 && (p41Var = this.U1) != null) {
            p41Var.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i7 = this.T1;
        ns.f(i7).n(this, ns.f25520j5);
        ns.f(i7).n(this, ns.F3);
        ns.f(i7).n(this, ns.E0);
        ns.f(i7).n(this, ns.I3);
        ns.f(i7).n(this, ns.G3);
    }

    public final void e1(boolean z10) {
        this.f3855o2 = z10;
        this.U1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f3849i2;
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
                    if (org.telegram.messenger.r2.b()) {
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        f5.a aVar = new f5.a();
                        aVar.f10926c = "inapp";
                        aVar.f10925b = jVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.r2.b()) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ug.j) obj).f58129g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new a1.c(this, 14));
            }
        }
        if (arrayList.isEmpty()) {
            wg.q.j(this.T1, null, new n1(this, 1));
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        int i7 = this.T1;
        if (np.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.W1;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T != null) {
                i20.t(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(this.X1)), cc.a0(T), 2131624012, 36);
                return;
            }
            return;
        }
        super.show();
    }

    public s2(final android.content.Context r29, final int r30, final long r31, java.util.List r33, final org.telegram.messenger.z10 r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.s2.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.z10):void");
    }
}
