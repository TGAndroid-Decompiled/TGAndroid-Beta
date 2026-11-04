package ai;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.bb;
import ci.e9;
import ci.lb;
import ci.v8;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.ek;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class b3 extends ma implements cs {
    public static final int f508r2 = 0;
    public final int Q1;
    public f41 R1;
    public List S1;
    public TLRPC.DisallowedGiftsSettings T1;
    public final long U1;
    public final boolean V1;
    public final String W1;
    public final lb X1;
    public final d2 Y1;
    public final FrameLayout Z1;
    public final LinearLayout f509a2;
    public final hy f510b2;
    public final h2 c2;
    public final e2 f511d2;
    public final e2 f512e2;
    public final ArrayList f513f2;
    public final v8 f514g2;
    public int f515h2;
    public int f516i2;
    public int f517j2;
    public int f518k2;
    public boolean f519l2;
    public boolean f520m2;
    public boolean f521n2;
    public bb f522o2;
    public final s70 f523p2;
    public boolean f524q2;

    public b3(LaunchActivity launchActivity, int i3, long j10) {
        this(launchActivity, i3, j10, null, null);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.Q1, 0, true, new c(this, 5), this.J0);
        this.R1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.V1) {
            return bd.M0(2131749947, null);
        }
        return org.telegram.messenger.i6.m(bd.a0(null, null, 2131749856, this.W1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, f41 f41Var) {
        long j10;
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
        d2 d2Var = this.Y1;
        long j11 = this.U1;
        long j12 = 0;
        boolean z17 = this.V1;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.T1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(r31.k(d2Var));
            arrayList.add(r31.k(this.Z1));
            ArrayList arrayList3 = this.f513f2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList3.get(i3);
                    i3++;
                    int i10 = p2.f878b;
                    long j13 = j12;
                    r31 K = r31.K(p2.class);
                    K.f37636u = 1;
                    K.G = (vg.j) obj;
                    arrayList.add(K);
                    j12 = j13;
                }
                j10 = j12;
            } else {
                j10 = 0;
                r31 q10 = r31.q(1, 34);
                q10.f37636u = 1;
                arrayList.add(q10);
                r31 q11 = r31.q(2, 34);
                q11.f37636u = 1;
                arrayList.add(q11);
                r31 q12 = r31.q(3, 34);
                q12.f37636u = 1;
                arrayList.add(q12);
            }
            z10 = true;
        }
        int i11 = this.Q1;
        e9 y9 = e9.y(i11, false);
        if (this.f519l2) {
            arrayList2 = y9.J;
        } else {
            arrayList2 = y9.I;
        }
        if (this.T1 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ii.k1(this, 2)).collect(Collectors.toCollection(new ek(1)));
        }
        int i12 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i12 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new t1(0)).collect(Collectors.toCollection(new ek(1)));
        }
        int i13 = (j11 > h10.i(i11).e() ? 1 : (j11 == h10.i(i11).e() ? 0 : -1));
        v8 v8Var = this.f514g2;
        if (i13 != 0 && v8Var != null) {
            ArrayList arrayList4 = v8Var.f6203l;
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
        float f14 = 300.0f;
        if (!hp.s1(i11).Y5 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.T1) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && v8Var != null && !v8Var.f6203l.isEmpty()))) {
            if (!z10) {
                arrayList.add(r31.k(d2Var));
            } else {
                arrayList.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
            }
            arrayList.add(r31.k(this.f509a2));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.T1;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f516i2 = -1;
            this.f515h2 = -1;
            if (!arrayList2.isEmpty()) {
                this.f515h2 = arrayList5.size();
                arrayList5.add(bd.M0(2131749958, null));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.T1;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f516i2 = arrayList5.size();
                arrayList5.add(bd.M0(2131749954, null));
            }
            this.f517j2 = arrayList5.size();
            arrayList5.add(bd.M0(2131749957, null));
            if (this.f520m2 && !this.f521n2) {
                this.f521n2 = true;
                this.f518k2 = this.f517j2;
            }
            int i16 = this.f518k2;
            u1 u1Var = new u1(this, 0);
            int i17 = z2.f1127b;
            r31 K2 = r31.K(z2.class);
            K2.d = 1;
            K2.G = arrayList5;
            K2.f37640z = i16;
            K2.H = u1Var;
            arrayList.add(K2);
            if (this.f518k2 == this.f517j2 && !z17 && i12 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f524q2) {
                this.f524q2 = z12;
                ViewPropertyAnimator animate = this.f511d2.animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
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
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate2 = this.f512e2.animate();
                if (z12) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z12) {
                    f16 = 0.85f;
                }
                scaleX2.scaleY(f16).setDuration(380L).setInterpolator(xqVar).start();
            }
            if (v8Var != null && this.f518k2 == this.f516i2) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = v8Var.f6203l;
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
                int i21 = this.f518k2;
                if (i21 == this.f515h2 || i21 == this.f516i2 || (i21 == this.f517j2 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i21 != this.f517j2) {
                        if (i21 == this.f516i2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.T1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        r31 i22 = p2.i(i21, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(i22);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f518k2;
                    if (i23 == this.f516i2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.T1) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(p2.i(i23, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i24 = this.f518k2;
            int i25 = this.f516i2;
            if (i24 == i25 && v8Var != null && !v8Var.f6201j) {
                v8Var.a();
                r31 q13 = r31.q(4, 34);
                q13.f37636u = 1;
                arrayList.add(q13);
                r31 q14 = r31.q(5, 34);
                q14.f37636u = 1;
                arrayList.add(q14);
                r31 q15 = r31.q(6, 34);
                q15.f37636u = 1;
                arrayList.add(q15);
            } else if (i24 != i25 && y9.C) {
                r31 q16 = r31.q(4, 34);
                q16.f37636u = 1;
                arrayList.add(q16);
                r31 q17 = r31.q(5, 34);
                q17.f37636u = 1;
                arrayList.add(q17);
                r31 q18 = r31.q(6, 34);
                q18.f37636u = 1;
                arrayList.add(q18);
            }
            if (i19 >= 9) {
                f14 = 40.0f;
            }
            arrayList.add(r31.D(org.telegram.messenger.g0.L(f14)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.T1;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(r31.D(org.telegram.messenger.g0.L(300.0f)));
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i3 == hs.f23253j5) {
            f1();
        } else if (i3 == hs.F3) {
            f41 f41Var2 = this.R1;
            if (f41Var2 != null) {
                f41Var2.O(true);
            }
        } else if (i3 == hs.E0) {
            if (!this.J) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.U1;
                if (longValue == j10 && j10 > 0) {
                    int i11 = this.Q1;
                    TLRPC.UserFull b22 = hp.s1(i11).b2(j10);
                    if (j10 != h10.i(i11).e() && b22 != null) {
                        disallowedGiftsSettings = b22.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.T1 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(j10)), fc.a0(T), 2131624011, 36);
                            return;
                        }
                        return;
                    }
                    f41 f41Var3 = this.R1;
                    if (f41Var3 != null) {
                        f41Var3.O(true);
                    }
                }
                ArrayList arrayList = this.f513f2;
                if (arrayList == null || arrayList.isEmpty()) {
                    f1();
                    f41 f41Var4 = this.R1;
                    if (f41Var4 != null) {
                        f41Var4.O(true);
                    }
                }
            }
        } else if (i3 == hs.I3) {
            if (!this.J) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new fc(this.f28589c, this.J0).s(starGift.sticker, bd.M0(2131749975, null), org.telegram.messenger.g0.X2(bd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
                f41 f41Var5 = this.R1;
                if (f41Var5 != null) {
                    f41Var5.O(true);
                }
            }
        } else if (i3 == hs.G3 && objArr[1] == this.f514g2 && (f41Var = this.R1) != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i3 = this.Q1;
        hs.f(i3).n(this, hs.f23253j5);
        hs.f(i3).n(this, hs.F3);
        hs.f(i3).n(this, hs.E0);
        hs.f(i3).n(this, hs.I3);
        hs.f(i3).n(this, hs.G3);
    }

    public final void e1(boolean z10) {
        this.f519l2 = z10;
        this.R1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f513f2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.S1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.S1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.S1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.S1.iterator();
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
                    vg.j jVar = new vg.j(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(jVar);
                    if (org.telegram.messenger.r2.b()) {
                        if (jVar.f() > j10) {
                            j10 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        e5.a aVar = new e5.a();
                        aVar.f9555c = "inapp";
                        aVar.f9554b = jVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.r2.b()) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((vg.j) obj).f56682g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new a1.c(this, 5));
            }
        }
        if (arrayList.isEmpty()) {
            xg.s.j(this.Q1, null, new u1(this, 1));
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
        int i3 = this.Q1;
        if (hp.s1(i3).v2()) {
            org.telegram.ui.b.b(i3);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.T1;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, org.telegram.messenger.m5.t(this.U1)), fc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        super.show();
    }

    public b3(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final org.telegram.messenger.u10 r33) {
        throw new UnsupportedOperationException("Method not decompiled: ai.b3.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.u10):void");
    }
}
