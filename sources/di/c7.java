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
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.ll0;
public final class c7 implements ll0, v10, OnSuccessListener, qj0, r10, pj0, fi.x6, fi.z8, xh.j, r0.m, h9.h1, org.telegram.ui.ActionBar.r1, ej0, sg.j1, CameraController.VideoTakeCallback, ot0, f3.g {
    public final int f8608a;
    public final Object f8609b;

    public c7(Object obj, int i7) {
        this.f8608a = i7;
        this.f8609b = obj;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int a10;
        fi.f9 f9Var = (fi.f9) this.f8609b;
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f9Var.f12001w.getLayoutParams();
        if (!f9Var.f11958c) {
            i7 = l1Var.d();
        }
        marginLayoutParams.topMargin = i7;
        if (f9Var.f11958c) {
            a10 = l1Var.f56258a.f(2).d;
        } else {
            a10 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a10;
        marginLayoutParams.leftMargin = I0.f15889a;
        marginLayoutParams.rightMargin = I0.f15891c;
        fi.t8 t8Var = f9Var.f11992s;
        if (t8Var != null) {
            t8Var.requestLayout();
        }
        fi.u8 u8Var = f9Var.f12001w;
        if (u8Var != null) {
            u8Var.requestLayout();
        }
        return r0.l1.f56257b;
    }

    @Override
    public void a(xh.f fVar, float f10, float f11) {
        fi.w7 w7Var;
        fi.v7 v7Var = (fi.v7) this.f8609b;
        if (!v7Var.v.f12710y) {
            fVar.f60561q = new fi.u7(v7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(w7Var.getHeight(), 2.0d) + Math.pow(w7Var.getWidth(), 2.0d));
            ArrayList arrayList = v7Var.f12655i;
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
        fi.z4 z4Var = (fi.z4) this.f8609b;
        if (z4Var != null) {
            z4Var.c();
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: di.c7.c(int, android.view.View):boolean");
    }

    @Override
    public void d(int i7) {
        bi.b8 b8Var = (bi.b8) this.f8609b;
        if (i7 == 1) {
            b8Var.a(Boolean.TRUE, null);
        } else if (i7 != 3) {
            b8Var.a(Boolean.FALSE, null);
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12;
        fi.a2 a2Var = (fi.a2) this.f8609b;
        b1 b1Var = a2Var.f12558c;
        ArrayList arrayList = a2Var.f12568r;
        fi.s0 s0Var = ((fi.q0) view).f12449f;
        int i13 = a2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j3 = 0;
            if (i15 >= s0Var.f12515f.size()) {
                break;
            }
            fi.r0 r0Var = (fi.r0) s0Var.f12515f.get(i15);
            long j11 = r0Var.f12488g;
            if (j11 > 0 && currentTime - r0Var.d <= fi.t.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(r0Var.f12483a));
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
            if (!r0Var2.f12484b && r0Var2.f12486e && r0Var2.f12488g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(r0Var2.f12483a))) {
                    j10 = j3;
                    if (a2Var.f12571x != s0Var.f12512b || (i12 = a2Var.f12572y) == 0 || r0Var2.f12483a < i12) {
                        i10 = r0Var2.f12483a;
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
                    if (r0Var3.f12484b || !r0Var3.f12486e || r0Var3.f12488g >= j10) {
                        if (hashSet.contains(Integer.valueOf(r0Var3.f12483a))) {
                            i11 = r0Var3.f12483a;
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
        a2Var.f12571x = s0Var.f12512b;
        a2Var.f12572y = i11;
        a2Var.E = true;
        v4.n0 itemAnimator = b1Var.getItemAnimator();
        b1Var.setItemAnimator(null);
        a2Var.d.i1(i17, b1Var.getHeight() / 2, true);
        a2Var.f12561e.g(i17);
        b1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public Object g(Number number, Object obj) {
        int i7 = this.f8608a;
        Object obj2 = this.f8609b;
        switch (i7) {
            case 5:
                Long l10 = (Long) number;
                return fi.t0.a((fi.t0) obj2, (Long) obj);
            default:
                dq0 dq0Var = (dq0) obj2;
                Integer num = (Integer) obj;
                if (((Integer) number).intValue() == -1) {
                    new gi.p(dq0Var.f13664a, gd.M0(2131746498, null), new ai.g0(dq0Var, 20)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f8608a) {
            case 16:
                hi.ta taVar = ((hi.ja) ((hi.s) this.f8609b)).S1;
                hi.ha haVar = taVar.Y0;
                if (haVar != null) {
                    haVar.s(null, null, true);
                }
                hi.v9 v9Var = taVar.f15492w1;
                if (v9Var != null) {
                    v9Var.n0();
                }
                hi.ja jaVar = taVar.f15433d1;
                if (jaVar != null) {
                    jaVar.setHasRoundVideo(false);
                }
                hi.d7 d7Var = taVar.L1;
                if (d7Var != null) {
                    File file = d7Var.f14416o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        taVar.L1.f14416o0 = null;
                    }
                    if (taVar.L1.f14418p0 != null) {
                        try {
                            new File(taVar.L1.f14418p0).delete();
                        } catch (Exception unused2) {
                        }
                        taVar.L1.f14418p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((hi.e5) this.f8609b).f14557a.Z1.r();
                return;
            case 23:
                ((TwoStepVerificationActivity) this.f8609b).presentFragment(new bb1(6, null));
                return;
            default:
                kg.t1 t1Var = (kg.t1) ((bi.r1) this.f8609b).f3992b;
                kg.w1 f10 = kg.w1.f(kg.t1.g0(t1Var));
                ArrayList arrayList = t1Var.f18487b;
                int i10 = f10.f18519a;
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
                        kg.v1 c10 = f10.c(((Integer) arrayList.get(i12)).intValue());
                        f10.f18520b.remove(c10);
                        f10.a(c10.f18507b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f18506a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new fi.k5(6));
                        if ("hello".equals(c10.f18507b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull d2 = mp.u1(i10).d2(j10.i(i10).e());
                            if (d2 != null) {
                                d2.flags2 &= -5;
                                d2.business_greeting_message = null;
                                tr.a0(i10).j2(d2, true);
                            }
                        } else if ("away".equals(c10.f18507b)) {
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
                    a02.f27052a.c(new hi.z0(a02, arrayList, 2));
                    ks.f(i10).k(121, new Object[0]);
                }
                kg.t1.c0(t1Var);
                return;
        }
    }

    @Override
    public void i() {
        ((hi.o1) this.f8609b).invalidate();
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public long k(long j3) {
        f3.u uVar = (f3.u) this.f8609b;
        return h2.l0.j((j3 * uVar.f11203e) / 1000000, 0L, uVar.f11207j - 1);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.ActionBar.h2 T;
        int i7;
        kg.e1 e1Var;
        kg.e1 e1Var2;
        int i10;
        switch (this.f8608a) {
            case 1:
                mb mbVar = (mb) this.f8609b;
                l41 l41Var = (l41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                Object obj3 = l41Var.H;
                if (obj3 instanceof TL_stars.StarsTransaction) {
                    pb.l1(mbVar.getContext(), false, 0L, mbVar.f9336c, (TL_stars.StarsTransaction) l41Var.H, mbVar.f9335b);
                    return;
                } else if ((obj3 instanceof TL_wallet.walletTransaction) && (T = LaunchActivity.T()) != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.n6());
                    return;
                } else {
                    return;
                }
            case 19:
                hi.m9 m9Var = (hi.m9) this.f8609b;
                l41 l41Var2 = (l41) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = l41Var2.d;
                hi.d7 d7Var = (hi.d7) l41Var2.H;
                m9Var.c(false, true);
                hi.ta taVar = m9Var.P;
                if (d7Var != taVar.L1 && !taVar.Y1) {
                    taVar.f15436e1.setSelected(i11);
                    taVar.Y1 = true;
                    ai.w0 w0Var = new ai.w0(taVar, i11, 12);
                    hi.v9 v9Var = taVar.f15492w1;
                    hi.d7 d7Var2 = taVar.L1;
                    if (v9Var != null && d7Var2 != null) {
                        if (!v9Var.r0()) {
                            w0Var.run();
                            return;
                        }
                        d7Var2.f();
                        Utilities.f22781g.c(new hi.v8(taVar, v9Var, d7Var2.f14405i0, d7Var2.f14407j0, d7Var2, v9Var.f14936y0.getPainting().E, v9Var.r0(), w0Var, 0));
                        return;
                    }
                    w0Var.run();
                    return;
                }
                return;
            case 26:
                kg.f1 f1Var = (kg.f1) this.f8609b;
                l41 l41Var3 = (l41) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f14 = (Float) serializable2;
                int i12 = l41Var3.d;
                if (i12 == -1) {
                    boolean z10 = !f1Var.d;
                    f1Var.d = z10;
                    ((org.telegram.ui.Cells.s8) view3).setChecked(z10);
                    f1Var.f18309a.f34607g3.O(true);
                    f1Var.d0(true);
                    return;
                } else if (i12 == -2) {
                    ?? h2Var = new org.telegram.ui.ActionBar.h2(null);
                    h2Var.f18545n = f1Var.f18314n;
                    h2Var.f18542c = new ai.v1(25, f1Var, view3);
                    f1Var.presentFragment((org.telegram.ui.ActionBar.h2) h2Var);
                    return;
                } else if (l41Var3.f56589a == 5 && i12 >= 0 && i12 < f1Var.f18313f.length) {
                    if (!gd.f24213a0 ? floatValue >= view3.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue <= org.telegram.messenger.g0.L(76.0f)) {
                        if (f1Var.f18313f[l41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view3).setChecked(true);
                            f1Var.f18313f[l41Var3.d].add(new kg.e1(0, 1439));
                            f1Var.c0(l41Var3.d);
                        } else {
                            f1Var.f18313f[l41Var3.d].clear();
                            ((org.telegram.ui.Cells.j5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view3).setValue(kg.f1.f0(f1Var.f18313f[l41Var3.d]));
                        f1Var.d0(true);
                        return;
                    }
                    int i13 = (l41Var3.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < f1Var.f18313f[i13].size(); i15++) {
                        if (((kg.e1) f1Var.f18313f[i13].get(i15)).f18302b > i14) {
                            i14 = ((kg.e1) f1Var.f18313f[i13].get(i15)).f18302b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (l41Var3.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < f1Var.f18313f[i16].size(); i18++) {
                        if (((kg.e1) f1Var.f18313f[i16].get(i18)).f18301a < i17) {
                            i17 = ((kg.e1) f1Var.f18313f[i16].get(i18)).f18301a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = l41Var3.f37018m;
                    ArrayList arrayList = f1Var.f18313f[l41Var3.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = f1Var.f18313f[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    kg.h1 h1Var = new kg.h1(charSequence, arrayList, max, i19, 28 - i20);
                    h1Var.f18335f = new kg.j0(f1Var, 3);
                    h1Var.h = new kg.h0(2, f1Var, l41Var3);
                    f1Var.presentFragment(h1Var);
                    return;
                } else {
                    return;
                }
            case 27:
                final kg.h1 h1Var2 = (kg.h1) this.f8609b;
                l41 l41Var4 = (l41) obj;
                final View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f15 = (Float) serializable;
                Float f16 = (Float) serializable2;
                int i22 = h1Var2.f18333c;
                int i23 = h1Var2.d;
                ArrayList arrayList3 = h1Var2.f18332b;
                int i24 = l41Var4.d;
                if (i24 == -1) {
                    h1Var2.f18337r = !h1Var2.f18337r;
                    arrayList3.clear();
                    if (h1Var2.f18337r) {
                        arrayList3.add(new kg.e1(0, 1439));
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view4;
                    boolean z11 = h1Var2.f18337r;
                    l41Var4.f37011e = z11;
                    s8Var.setChecked(z11);
                    boolean z12 = h1Var2.f18337r;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.n6.f29432f6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.n6.f29413e6;
                    }
                    s8Var.b(org.telegram.ui.ActionBar.n6.x0(null, i10, false), z12);
                    h1Var2.f18336n.f34607g3.O(true);
                    kg.j0 j0Var = h1Var2.f18335f;
                    if (j0Var != null) {
                        j0Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !h1Var2.Z()) {
                        int i25 = ((kg.e1) i5.c.h(1, arrayList3)).f18302b;
                        int j3 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new kg.e1(j3, Utilities.j((i25 + 1560) / 2, i23, j3 + 1)));
                    } else {
                        if (h1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j10 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new kg.e1(j10, Utilities.j(1200, i23, j10 + 1)));
                    }
                    kg.j0 j0Var2 = h1Var2.f18335f;
                    if (j0Var2 != null) {
                        j0Var2.run();
                    }
                    h1Var2.f18336n.f34607g3.O(true);
                    return;
                } else if (l41Var4.f56589a == 3 && (i7 = i24 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i26 = i7 - 1;
                    if (i26 >= 0) {
                        e1Var = (kg.e1) arrayList3.get(i26);
                    } else {
                        e1Var = null;
                    }
                    final kg.e1 e1Var3 = (kg.e1) arrayList3.get(i7);
                    int i27 = i7 + 1;
                    if (i27 < arrayList3.size()) {
                        e1Var2 = (kg.e1) arrayList3.get(i27);
                    } else {
                        e1Var2 = null;
                    }
                    int i28 = l41Var4.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = h1Var2.getParentActivity();
                        String M0 = gd.M0(2131752739, null);
                        int i29 = e1Var3.f18301a;
                        if (e1Var != null) {
                            i22 = e1Var.f18302b + 1;
                        }
                        org.telegram.ui.Components.b5.U(parentActivity, M0, i29, i22, e1Var3.f18302b - 1, new x10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num5 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        h1 h1Var3 = h1Var2;
                                        boolean a02 = h1Var3.a0();
                                        int intValue = num5.intValue();
                                        e1Var3.f18301a = intValue;
                                        ((n8) view4).w(e1.a(intValue), true);
                                        if (a02 != h1Var3.a0()) {
                                            h1Var3.f18336n.f34607g3.O(true);
                                        }
                                        j0 j0Var3 = h1Var3.f18335f;
                                        if (j0Var3 != null) {
                                            j0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        h1 h1Var4 = h1Var2;
                                        boolean a03 = h1Var4.a0();
                                        int intValue2 = num5.intValue();
                                        e1Var3.f18302b = intValue2;
                                        ((n8) view4).w(e1.a(intValue2), true);
                                        if (a03 != h1Var4.a0()) {
                                            h1Var4.f18336n.f34607g3.O(true);
                                        }
                                        j0 j0Var4 = h1Var4.f18335f;
                                        if (j0Var4 != null) {
                                            j0Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = h1Var2.getParentActivity();
                        String M02 = gd.M0(2131752745, null);
                        int i30 = e1Var3.f18302b;
                        int i31 = e1Var3.f18301a + 1;
                        if (e1Var2 != null) {
                            i23 = e1Var2.f18301a - 1;
                        }
                        org.telegram.ui.Components.b5.U(parentActivity2, M02, i30, i31, i23, new x10() {
                            @Override
                            public final void a(Object obj4) {
                                Integer num5 = (Integer) obj4;
                                switch (r4) {
                                    case 0:
                                        h1 h1Var3 = h1Var2;
                                        boolean a02 = h1Var3.a0();
                                        int intValue = num5.intValue();
                                        e1Var3.f18301a = intValue;
                                        ((n8) view4).w(e1.a(intValue), true);
                                        if (a02 != h1Var3.a0()) {
                                            h1Var3.f18336n.f34607g3.O(true);
                                        }
                                        j0 j0Var3 = h1Var3.f18335f;
                                        if (j0Var3 != null) {
                                            j0Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        h1 h1Var4 = h1Var2;
                                        boolean a03 = h1Var4.a0();
                                        int intValue2 = num5.intValue();
                                        e1Var3.f18302b = intValue2;
                                        ((n8) view4).w(e1.a(intValue2), true);
                                        if (a03 != h1Var4.a0()) {
                                            h1Var4.f18336n.f34607g3.O(true);
                                        }
                                        j0 j0Var4 = h1Var4.f18335f;
                                        if (j0Var4 != null) {
                                            j0Var4.run();
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
                            arrayList3.add(new kg.e1(0, 1439));
                        }
                        h1Var2.f18336n.f34607g3.O(true);
                        kg.j0 j0Var3 = h1Var2.f18335f;
                        if (j0Var3 != null) {
                            j0Var3.run();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                Integer num5 = (Integer) number;
                Float f17 = (Float) serializable;
                Float f18 = (Float) serializable2;
                kg.y1.Z((kg.y1) this.f8609b, (l41) obj, (View) obj2);
                return;
        }
    }

    @Override
    public Object m(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.m1) this.f8609b).f14025f, obj, false, 24));
    }

    @Override
    public RecyclerView n(View view) {
        ((ob) this.f8609b).getClass();
        return ((mb) view).f9334a;
    }

    @Override
    public void o(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f8609b;
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
        hi.q9 q9Var = (hi.q9) this.f8609b;
        hi.ta taVar = q9Var.f15293a;
        hi.e6 e6Var = taVar.P0;
        int i7 = taVar.f15428c;
        if (e6Var != null) {
            e6Var.g(true);
        }
        if (taVar.p0()) {
            taVar.f15477s.d();
        }
        if (taVar.H1 != null && taVar.C0 != null) {
            taVar.R1 = false;
            taVar.S1 = false;
            hi.a6 a6Var = taVar.D0;
            if (a6Var != null) {
                a6Var.c(false);
            }
            if (j3 <= 800) {
                taVar.g(false, true);
                taVar.c0(false);
                taVar.K0.b(false, true);
                hi.e6 e6Var2 = taVar.P0;
                if (e6Var2 != null) {
                    e6Var2.g(true);
                }
                try {
                    taVar.H1.delete();
                    taVar.H1 = null;
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
            taVar.h0(false, true);
            hi.d7 o4 = hi.d7.o(taVar.H1, str, j3);
            o4.J0 = taVar.f15491w0;
            o4.K0 = taVar.f15495x0;
            o4.B();
            taVar.g(false, true);
            taVar.c0(false);
            taVar.K0.b(false, true);
            hi.e6 e6Var3 = taVar.P0;
            if (e6Var3 != null) {
                e6Var3.g(true);
            }
            if (taVar.B0.j()) {
                taVar.H1 = null;
                o4.P = 1.0f;
                if (taVar.B0.l(o4)) {
                    hi.d7 a10 = hi.d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
                    taVar.L1 = a10;
                    hi.r8.a(i7, a10);
                    taVar.M1 = false;
                    int videoWidth = taVar.C0.getVideoWidth();
                    int videoHeight = taVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        hi.d7 d7Var = taVar.L1;
                        d7Var.f14409k0 = videoWidth;
                        d7Var.f14411l0 = videoHeight;
                        d7Var.A();
                    }
                }
                taVar.l0(true);
                return;
            }
            taVar.L1 = o4;
            hi.r8.a(i7, o4);
            taVar.M1 = false;
            int videoWidth2 = taVar.C0.getVideoWidth();
            int videoHeight2 = taVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.d7 d7Var2 = taVar.L1;
                d7Var2.f14409k0 = videoWidth2;
                d7Var2.f14411l0 = videoHeight2;
                d7Var2.A();
            }
            taVar.K(new hi.o9(q9Var, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f8608a) {
            case 2:
                ((e1.b) this.f8609b).invoke(obj);
                return;
            case 3:
                ((e1.b) this.f8609b).invoke(obj);
                return;
            default:
                ((ae.d) this.f8609b).invoke(obj);
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
        hi.v9 v9Var = (hi.v9) this.f8609b;
        TextView textView = v9Var.Y0;
        boolean a10 = v9Var.f14915n0.a();
        ImageView imageView = v9Var.X0;
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
