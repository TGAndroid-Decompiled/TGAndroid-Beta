package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.r10;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.ll0;
public final class v6 implements ll0, v10, OnSuccessListener, sj0, r10, rj0, fi.x6, fi.z8, xh.j, r0.m, h9.h1, org.telegram.ui.ActionBar.q1, gj0, sg.j1, CameraController.VideoTakeCallback, rt0, f3.g {
    public final int f9954a;
    public final Object f9955b;

    public v6(Object obj, int i7) {
        this.f9954a = i7;
        this.f9955b = obj;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int a10;
        fi.f9 f9Var = (fi.f9) this.f9955b;
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f9Var.f12042w.getLayoutParams();
        if (!f9Var.f11999c) {
            i7 = l1Var.d();
        }
        marginLayoutParams.topMargin = i7;
        if (f9Var.f11999c) {
            a10 = l1Var.f56299a.f(2).d;
        } else {
            a10 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a10;
        marginLayoutParams.leftMargin = I0.f15914a;
        marginLayoutParams.rightMargin = I0.f15916c;
        fi.t8 t8Var = f9Var.f12033s;
        if (t8Var != null) {
            t8Var.requestLayout();
        }
        fi.u8 u8Var = f9Var.f12042w;
        if (u8Var != null) {
            u8Var.requestLayout();
        }
        return r0.l1.f56298b;
    }

    @Override
    public void a(xh.f fVar, float f10, float f11) {
        fi.w7 w7Var;
        fi.v7 v7Var = (fi.v7) this.f9955b;
        if (!v7Var.v.f12752y) {
            fVar.f60602q = new fi.u7(v7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(w7Var.getHeight(), 2.0d) + Math.pow(w7Var.getWidth(), 2.0d));
            ArrayList arrayList = v7Var.f12697i;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xh.f) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    @Override
    public void b(boolean z10) {
        fi.a5 a5Var = (fi.a5) this.f9955b;
        if (a5Var != null) {
            a5Var.c();
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: di.v6.c(int, android.view.View):boolean");
    }

    @Override
    public void d(int i7) {
        switch (this.f9954a) {
            case 0:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f9955b;
                if (i7 == 1) {
                    e0Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    e0Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                bi.f8 f8Var = (bi.f8) this.f9955b;
                if (i7 == 1) {
                    f8Var.a(Boolean.TRUE, null);
                    return;
                } else if (i7 != 3) {
                    f8Var.a(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12;
        fi.a2 a2Var = (fi.a2) this.f9955b;
        b1 b1Var = a2Var.f12599c;
        ArrayList arrayList = a2Var.f12609r;
        fi.s0 s0Var = ((fi.q0) view).f12489f;
        int i13 = a2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j3 = 0;
            if (i15 >= s0Var.f12555f.size()) {
                break;
            }
            fi.r0 r0Var = (fi.r0) s0Var.f12555f.get(i15);
            long j11 = r0Var.f12519g;
            if (j11 > 0 && currentTime - r0Var.d <= fi.t.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(r0Var.f12514a));
            }
            i15++;
        }
        fi.c1 c1Var = a2Var.Q;
        if (c1Var != null) {
            j3 = c1Var.j();
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            fi.r0 r0Var2 = (fi.r0) arrayList.get(i16);
            if (!r0Var2.f12515b && r0Var2.f12517e && r0Var2.f12519g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(r0Var2.f12514a))) {
                    j10 = j3;
                    if (a2Var.f12612x != s0Var.f12552b || (i12 = a2Var.f12613y) == 0 || r0Var2.f12514a < i12) {
                        i10 = r0Var2.f12514a;
                        break;
                    }
                } else {
                    j10 = j3;
                }
                i17++;
            }
            i16++;
            j3 = j10;
        }
        j10 = j3;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    fi.r0 r0Var3 = (fi.r0) arrayList.get(i14);
                    if (r0Var3.f12515b || !r0Var3.f12517e || r0Var3.f12519g >= j10) {
                        if (hashSet.contains(Integer.valueOf(r0Var3.f12514a))) {
                            i11 = r0Var3.f12514a;
                            i17 = i18;
                            break;
                        }
                        i18++;
                    }
                    i14++;
                } else {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        a2Var.f12612x = s0Var.f12552b;
        a2Var.f12613y = i11;
        a2Var.E = true;
        v4.n0 itemAnimator = b1Var.getItemAnimator();
        b1Var.setItemAnimator(null);
        a2Var.d.i1(i17, b1Var.getHeight() / 2, true);
        a2Var.f12602e.g(i17);
        b1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public Object g(Number number, Object obj) {
        int i7 = this.f9954a;
        Object obj2 = this.f9955b;
        switch (i7) {
            case 6:
                Long l10 = (Long) number;
                return fi.t0.a((fi.t0) obj2, (Long) obj);
            default:
                fq0 fq0Var = (fq0) obj2;
                Integer num = (Integer) obj;
                if (((Integer) number).intValue() == -1) {
                    new gi.p(fq0Var.f13693a, gd.N0(2131746497, null), new ai.h0(fq0Var, 20)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9954a) {
            case 17:
                hi.sa saVar = ((hi.ia) ((hi.t) this.f9955b)).S1;
                hi.ga gaVar = saVar.Y0;
                if (gaVar != null) {
                    gaVar.s(null, null, true);
                }
                hi.u9 u9Var = saVar.f15453w1;
                if (u9Var != null) {
                    u9Var.n0();
                }
                hi.ia iaVar = saVar.f15394d1;
                if (iaVar != null) {
                    iaVar.setHasRoundVideo(false);
                }
                hi.c7 c7Var = saVar.L1;
                if (c7Var != null) {
                    File file = c7Var.f14366o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        saVar.L1.f14366o0 = null;
                    }
                    if (saVar.L1.f14368p0 != null) {
                        try {
                            new File(saVar.L1.f14368p0).delete();
                        } catch (Exception unused2) {
                        }
                        saVar.L1.f14368p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ((hi.d5) this.f9955b).f14508a.Z1.r();
                return;
            case 24:
                ((TwoStepVerificationActivity) this.f9955b).presentFragment(new bb1(6, null));
                return;
            default:
                kg.s1 s1Var = (kg.s1) ((bi.v1) this.f9955b).f4170b;
                kg.v1 f10 = kg.v1.f(kg.s1.g0(s1Var));
                ArrayList arrayList = s1Var.f18507b;
                int i10 = f10.f18541a;
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i11)).intValue()) == null) {
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        kg.u1 c10 = f10.c(((Integer) arrayList.get(i12)).intValue());
                        f10.f18542b.remove(c10);
                        f10.a(c10.f18531b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f18530a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new fi.l5(6));
                        if ("hello".equals(c10.f18531b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull d2 = mp.u1(i10).d2(j10.i(i10).e());
                            if (d2 != null) {
                                d2.flags2 &= -5;
                                d2.business_greeting_message = null;
                                tr.a0(i10).j2(d2, true);
                            }
                        } else if ("away".equals(c10.f18531b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull d22 = mp.u1(i10).d2(j10.i(i10).e());
                            if (d22 != null) {
                                d22.flags2 &= -9;
                                d22.business_away_message = null;
                                tr.a0(i10).j2(d22, true);
                            }
                        }
                    }
                    f10.l();
                    tr a02 = tr.a0(i10);
                    a02.f27080a.c(new hi.z0(a02, arrayList, 2));
                    ks.f(i10).k(121, new Object[0]);
                }
                kg.s1.c0(s1Var);
                return;
        }
    }

    @Override
    public void i() {
        ((hi.o1) this.f9955b).invalidate();
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public long k(long j3) {
        f3.u uVar = (f3.u) this.f9955b;
        return h2.l0.j((j3 * uVar.f11232e) / 1000000, 0L, uVar.f11236j - 1);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.ActionBar.g2 T;
        int i7;
        kg.d1 d1Var;
        kg.d1 d1Var2;
        int i10;
        switch (this.f9954a) {
            case 2:
                mb mbVar = (mb) this.f9955b;
                o41 o41Var = (o41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                Object obj3 = o41Var.H;
                if (obj3 instanceof TL_stars.StarsTransaction) {
                    pb.l1(mbVar.getContext(), false, 0L, mbVar.f9360c, (TL_stars.StarsTransaction) o41Var.H, mbVar.f9359b);
                    return;
                } else if ((obj3 instanceof TL_wallet.walletTransaction) && (T = LaunchActivity.T()) != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.n6());
                    return;
                } else {
                    return;
                }
            case 20:
                hi.l9 l9Var = (hi.l9) this.f9955b;
                o41 o41Var2 = (o41) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = o41Var2.d;
                hi.c7 c7Var = (hi.c7) o41Var2.H;
                l9Var.c(false, true);
                hi.sa saVar = l9Var.P;
                if (c7Var != saVar.L1 && !saVar.Y1) {
                    saVar.f15397e1.setSelected(i11);
                    saVar.Y1 = true;
                    ai.y0 y0Var = new ai.y0(saVar, i11, 12);
                    hi.u9 u9Var = saVar.f15453w1;
                    hi.c7 c7Var2 = saVar.L1;
                    if (u9Var != null && c7Var2 != null) {
                        if (!u9Var.r0()) {
                            y0Var.run();
                            return;
                        }
                        c7Var2.f();
                        Utilities.f22809g.c(new hi.u8(saVar, u9Var, c7Var2.f14355i0, c7Var2.f14357j0, c7Var2, u9Var.f14911y0.getPainting().E, u9Var.r0(), y0Var, 0));
                        return;
                    }
                    y0Var.run();
                    return;
                }
                return;
            case 27:
                kg.e1 e1Var = (kg.e1) this.f9955b;
                o41 o41Var3 = (o41) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f14 = (Float) serializable2;
                int i12 = o41Var3.d;
                if (i12 == -1) {
                    boolean z10 = !e1Var.d;
                    e1Var.d = z10;
                    ((org.telegram.ui.Cells.s8) view3).setChecked(z10);
                    e1Var.f18331a.f35796g3.O(true);
                    e1Var.d0(true);
                    return;
                } else if (i12 == -2) {
                    ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                    g2Var.f18572n = e1Var.f18336n;
                    g2Var.f18569c = new ai.x1(25, e1Var, view3);
                    e1Var.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                    return;
                } else if (o41Var3.f56630a == 5 && i12 >= 0 && i12 < e1Var.f18335f.length) {
                    if (!gd.f24241a0 ? floatValue >= view3.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue <= org.telegram.messenger.g0.L(76.0f)) {
                        if (e1Var.f18335f[o41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view3).setChecked(true);
                            e1Var.f18335f[o41Var3.d].add(new kg.d1(0, 1439));
                            e1Var.c0(o41Var3.d);
                        } else {
                            e1Var.f18335f[o41Var3.d].clear();
                            ((org.telegram.ui.Cells.j5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view3).setValue(kg.e1.f0(e1Var.f18335f[o41Var3.d]));
                        e1Var.d0(true);
                        return;
                    }
                    int i13 = (o41Var3.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < e1Var.f18335f[i13].size(); i15++) {
                        if (((kg.d1) e1Var.f18335f[i13].get(i15)).f18315b > i14) {
                            i14 = ((kg.d1) e1Var.f18335f[i13].get(i15)).f18315b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (o41Var3.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < e1Var.f18335f[i16].size(); i18++) {
                        if (((kg.d1) e1Var.f18335f[i16].get(i18)).f18314a < i17) {
                            i17 = ((kg.d1) e1Var.f18335f[i16].get(i18)).f18314a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = o41Var3.f38098m;
                    ArrayList arrayList = e1Var.f18335f[o41Var3.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = e1Var.f18335f[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    kg.g1 g1Var = new kg.g1(charSequence, arrayList, max, i19, 28 - i20);
                    g1Var.f18355f = new kg.i0(e1Var, 3);
                    g1Var.h = new ji.i(4, e1Var, o41Var3);
                    e1Var.presentFragment(g1Var);
                    return;
                } else {
                    return;
                }
            default:
                final kg.g1 g1Var2 = (kg.g1) this.f9955b;
                o41 o41Var4 = (o41) obj;
                final View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f15 = (Float) serializable;
                Float f16 = (Float) serializable2;
                int i22 = g1Var2.f18353c;
                int i23 = g1Var2.d;
                ArrayList arrayList3 = g1Var2.f18352b;
                int i24 = o41Var4.d;
                if (i24 == -1) {
                    g1Var2.f18357r = !g1Var2.f18357r;
                    arrayList3.clear();
                    if (g1Var2.f18357r) {
                        arrayList3.add(new kg.d1(0, 1439));
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view4;
                    boolean z11 = g1Var2.f18357r;
                    o41Var4.f38091e = z11;
                    s8Var.setChecked(z11);
                    boolean z12 = g1Var2.f18357r;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.m6.f29416f6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f29397e6;
                    }
                    s8Var.b(org.telegram.ui.ActionBar.m6.x0(null, i10, false), z12);
                    g1Var2.f18356n.f35796g3.O(true);
                    kg.i0 i0Var = g1Var2.f18355f;
                    if (i0Var != null) {
                        i0Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !g1Var2.Z()) {
                        int i25 = ((kg.d1) i5.c.h(1, arrayList3)).f18315b;
                        int j3 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new kg.d1(j3, Utilities.j((i25 + 1560) / 2, i23, j3 + 1)));
                    } else {
                        if (g1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j10 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new kg.d1(j10, Utilities.j(1200, i23, j10 + 1)));
                    }
                    kg.i0 i0Var2 = g1Var2.f18355f;
                    if (i0Var2 != null) {
                        i0Var2.run();
                    }
                    g1Var2.f18356n.f35796g3.O(true);
                    return;
                } else if (o41Var4.f56630a == 3 && (i7 = i24 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i26 = i7 - 1;
                    if (i26 >= 0) {
                        d1Var = (kg.d1) arrayList3.get(i26);
                    } else {
                        d1Var = null;
                    }
                    final kg.d1 d1Var3 = (kg.d1) arrayList3.get(i7);
                    int i27 = i7 + 1;
                    if (i27 < arrayList3.size()) {
                        d1Var2 = (kg.d1) arrayList3.get(i27);
                    } else {
                        d1Var2 = null;
                    }
                    int i28 = o41Var4.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = g1Var2.getParentActivity();
                        String N0 = gd.N0(2131752738, null);
                        int i29 = d1Var3.f18314a;
                        if (d1Var != null) {
                            i22 = d1Var.f18315b + 1;
                        }
                        org.telegram.ui.Components.c5.U(parentActivity, N0, i29, i22, d1Var3.f18315b - 1, new x10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num5 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean a02 = g1Var3.a0();
                                        int intValue = num5.intValue();
                                        d1Var3.f18314a = intValue;
                                        ((n8) view4).w(d1.a(intValue), true);
                                        if (a02 != g1Var3.a0()) {
                                            g1Var3.f18356n.f35796g3.O(true);
                                        }
                                        i0 i0Var3 = g1Var3.f18355f;
                                        if (i0Var3 != null) {
                                            i0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean a03 = g1Var4.a0();
                                        int intValue2 = num5.intValue();
                                        d1Var3.f18315b = intValue2;
                                        ((n8) view4).w(d1.a(intValue2), true);
                                        if (a03 != g1Var4.a0()) {
                                            g1Var4.f18356n.f35796g3.O(true);
                                        }
                                        i0 i0Var4 = g1Var4.f18355f;
                                        if (i0Var4 != null) {
                                            i0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = g1Var2.getParentActivity();
                        String N02 = gd.N0(2131752744, null);
                        int i30 = d1Var3.f18315b;
                        int i31 = d1Var3.f18314a + 1;
                        if (d1Var2 != null) {
                            i23 = d1Var2.f18314a - 1;
                        }
                        org.telegram.ui.Components.c5.U(parentActivity2, N02, i30, i31, i23, new x10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num5 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean a02 = g1Var3.a0();
                                        int intValue = num5.intValue();
                                        d1Var3.f18314a = intValue;
                                        ((n8) view4).w(d1.a(intValue), true);
                                        if (a02 != g1Var3.a0()) {
                                            g1Var3.f18356n.f35796g3.O(true);
                                        }
                                        i0 i0Var3 = g1Var3.f18355f;
                                        if (i0Var3 != null) {
                                            i0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean a03 = g1Var4.a0();
                                        int intValue2 = num5.intValue();
                                        d1Var3.f18315b = intValue2;
                                        ((n8) view4).w(d1.a(intValue2), true);
                                        if (a03 != g1Var4.a0()) {
                                            g1Var4.f18356n.f35796g3.O(true);
                                        }
                                        i0 i0Var4 = g1Var4.f18355f;
                                        if (i0Var4 != null) {
                                            i0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 2) {
                        arrayList3.remove(i7);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new kg.d1(0, 1439));
                        }
                        g1Var2.f18356n.f35796g3.O(true);
                        kg.i0 i0Var3 = g1Var2.f18355f;
                        if (i0Var3 != null) {
                            i0Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    @Override
    public Object m(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.m1) this.f9955b).f14054f, obj, false, 24));
    }

    @Override
    public RecyclerView n(View view) {
        ((ob) this.f9955b).getClass();
        return ((mb) view).f9358a;
    }

    @Override
    public void o(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f9955b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        hi.p9 p9Var = (hi.p9) this.f9955b;
        hi.sa saVar = p9Var.f15279a;
        hi.d6 d6Var = saVar.P0;
        int i7 = saVar.f15389c;
        if (d6Var != null) {
            d6Var.g(true);
        }
        if (saVar.p0()) {
            saVar.f15438s.d();
        }
        if (saVar.H1 != null && saVar.C0 != null) {
            saVar.R1 = false;
            saVar.S1 = false;
            hi.z5 z5Var = saVar.D0;
            if (z5Var != null) {
                z5Var.c(false);
            }
            if (j3 <= 800) {
                saVar.g(false, true);
                saVar.c0(false);
                saVar.K0.b(false, true);
                hi.d6 d6Var2 = saVar.P0;
                if (d6Var2 != null) {
                    d6Var2.g(true);
                }
                try {
                    saVar.H1.delete();
                    saVar.H1 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
            }
            saVar.h0(false, true);
            hi.c7 o4 = hi.c7.o(saVar.H1, str, j3);
            o4.J0 = saVar.f15452w0;
            o4.K0 = saVar.f15456x0;
            o4.B();
            saVar.g(false, true);
            saVar.c0(false);
            saVar.K0.b(false, true);
            hi.d6 d6Var3 = saVar.P0;
            if (d6Var3 != null) {
                d6Var3.g(true);
            }
            if (saVar.B0.j()) {
                saVar.H1 = null;
                o4.P = 1.0f;
                if (saVar.B0.l(o4)) {
                    hi.c7 a10 = hi.c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                    saVar.L1 = a10;
                    hi.q8.a(i7, a10);
                    saVar.M1 = false;
                    int videoWidth = saVar.C0.getVideoWidth();
                    int videoHeight = saVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        hi.c7 c7Var = saVar.L1;
                        c7Var.f14359k0 = videoWidth;
                        c7Var.f14361l0 = videoHeight;
                        c7Var.A();
                    }
                }
                saVar.l0(true);
                return;
            }
            saVar.L1 = o4;
            hi.q8.a(i7, o4);
            saVar.M1 = false;
            int videoWidth2 = saVar.C0.getVideoWidth();
            int videoHeight2 = saVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.c7 c7Var2 = saVar.L1;
                c7Var2.f14359k0 = videoWidth2;
                c7Var2.f14361l0 = videoHeight2;
                c7Var2.A();
            }
            saVar.K(new hi.n9(p9Var, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f9954a) {
            case 3:
                ((e1.b) this.f9955b).invoke(obj);
                return;
            case 4:
                ((e1.b) this.f9955b).invoke(obj);
                return;
            default:
                ((ae.d) this.f9955b).invoke(obj);
                return;
        }
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override
    public void u() {
        float f10;
        hi.u9 u9Var = (hi.u9) this.f9955b;
        TextView textView = u9Var.Y0;
        boolean a10 = u9Var.f14890n0.a();
        ImageView imageView = u9Var.X0;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a10) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
