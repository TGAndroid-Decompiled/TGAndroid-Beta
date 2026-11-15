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
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t10;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.jl0;
public final class z6 implements jl0, x10, OnSuccessListener, ij0, t10, hj0, fi.a7, fi.c9, xh.j, r0.m, h9.g1, org.telegram.ui.ActionBar.q1, vi0, sg.j1, CameraController.VideoTakeCallback, gt0, f3.g {
    public final int f9835a;
    public final Object f9836b;

    public z6(Object obj, int i7) {
        this.f9835a = i7;
        this.f9836b = obj;
    }

    @Override
    public void C() {
        float f10;
        hi.u9 u9Var = (hi.u9) this.f9836b;
        TextView textView = u9Var.Y0;
        boolean a10 = u9Var.f14679n0.a();
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
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int a10;
        fi.i9 i9Var = (fi.i9) this.f9836b;
        int i7 = 0;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.f11879w.getLayoutParams();
        if (!i9Var.f11836c) {
            i7 = k1Var.d();
        }
        marginLayoutParams.topMargin = i7;
        if (i9Var.f11836c) {
            a10 = k1Var.f55682a.f(2).d;
        } else {
            a10 = k1Var.a();
        }
        marginLayoutParams.bottomMargin = a10;
        marginLayoutParams.leftMargin = I0.f15574a;
        marginLayoutParams.rightMargin = I0.f15576c;
        fi.w8 w8Var = i9Var.f11870s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        fi.x8 x8Var = i9Var.f11879w;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.k1.f55681b;
    }

    @Override
    public Object a(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.l1) this.f9836b).f13703f, obj, false, 24));
    }

    @Override
    public boolean b(int r37, final android.view.View r38) {
        throw new UnsupportedOperationException("Method not decompiled: di.z6.b(int, android.view.View):boolean");
    }

    @Override
    public void c(boolean z10) {
        fi.b5 b5Var = (fi.b5) this.f9836b;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7 = this.f9835a;
        Object obj2 = this.f9836b;
        switch (i7) {
            case 5:
                Long l10 = (Long) number;
                return fi.u0.a((fi.u0) obj2, (Long) obj);
            default:
                vp0 vp0Var = (vp0) obj2;
                Integer num = (Integer) obj;
                if (((Integer) number).intValue() == -1) {
                    new gi.p(vp0Var.f13352a, hd.M0(2131746693, null), new ai.g0(vp0Var, 19)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void e(int i7) {
        bi.v5 v5Var = (bi.v5) this.f9836b;
        if (i7 == 1) {
            v5Var.a(Boolean.TRUE, null);
        } else if (i7 != 3) {
            v5Var.a(Boolean.FALSE, null);
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12;
        fi.c2 c2Var = (fi.c2) this.f9836b;
        c1 c1Var = c2Var.f12379c;
        ArrayList arrayList = c2Var.f12389r;
        fi.t0 t0Var = ((fi.r0) view).f12256f;
        int i13 = c2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j3 = 0;
            if (i15 >= t0Var.f12350f.size()) {
                break;
            }
            fi.s0 s0Var = (fi.s0) t0Var.f12350f.get(i15);
            long j11 = s0Var.f12302g;
            if (j11 > 0 && currentTime - s0Var.d <= fi.t.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(s0Var.f12297a));
            }
            i15++;
        }
        fi.e1 e1Var = c2Var.Q;
        if (e1Var != null) {
            j3 = e1Var.j();
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            fi.s0 s0Var2 = (fi.s0) arrayList.get(i16);
            if (!s0Var2.f12298b && s0Var2.f12300e && s0Var2.f12302g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(s0Var2.f12297a))) {
                    j10 = j3;
                    if (c2Var.f12392x != t0Var.f12347b || (i12 = c2Var.f12393y) == 0 || s0Var2.f12297a < i12) {
                        i10 = s0Var2.f12297a;
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
                    fi.s0 s0Var3 = (fi.s0) arrayList.get(i14);
                    if (s0Var3.f12298b || !s0Var3.f12300e || s0Var3.f12302g >= j10) {
                        if (hashSet.contains(Integer.valueOf(s0Var3.f12297a))) {
                            i11 = s0Var3.f12297a;
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
        c2Var.f12392x = t0Var.f12347b;
        c2Var.f12393y = i11;
        c2Var.E = true;
        v4.m0 itemAnimator = c1Var.getItemAnimator();
        c1Var.setItemAnimator(null);
        c2Var.d.i1(i17, c1Var.getHeight() / 2, true);
        c2Var.f12382e.g(i17);
        c1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f9836b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9835a) {
            case 16:
                hi.sa saVar = ((hi.ia) ((hi.r) this.f9836b)).S1;
                hi.ga gaVar = saVar.Y0;
                if (gaVar != null) {
                    gaVar.s(null, null, true);
                }
                hi.u9 u9Var = saVar.f15107w1;
                if (u9Var != null) {
                    u9Var.n0();
                }
                hi.ia iaVar = saVar.f15048d1;
                if (iaVar != null) {
                    iaVar.setHasRoundVideo(false);
                }
                hi.d7 d7Var = saVar.L1;
                if (d7Var != null) {
                    File file = d7Var.f14154o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        saVar.L1.f14154o0 = null;
                    }
                    if (saVar.L1.f14156p0 != null) {
                        try {
                            new File(saVar.L1.f14156p0).delete();
                        } catch (Exception unused2) {
                        }
                        saVar.L1.f14156p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((hi.f5) this.f9836b).f14274a.Z1.r();
                return;
            case 27:
                kg.r1 r1Var = (kg.r1) ((bi.x4) this.f9836b).f3986b;
                kg.v1 f10 = kg.v1.f(kg.r1.g0(r1Var));
                ArrayList arrayList = r1Var.f18083b;
                int i10 = f10.f18123a;
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
                        f10.f18124b.remove(c10);
                        f10.a(c10.f18114b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f18113a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new fi.m5(6));
                        if ("hello".equals(c10.f18114b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull b22 = np.s1(i10).b2(m10.i(i10).e());
                            if (b22 != null) {
                                b22.flags2 &= -5;
                                b22.business_greeting_message = null;
                                vr.a0(i10).j2(b22, true);
                            }
                        } else if ("away".equals(c10.f18114b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull b23 = np.s1(i10).b2(m10.i(i10).e());
                            if (b23 != null) {
                                b23.flags2 &= -9;
                                b23.business_away_message = null;
                                vr.a0(i10).j2(b23, true);
                            }
                        }
                    }
                    f10.l();
                    vr a02 = vr.a0(i10);
                    a02.f27219a.c(new hi.y0(a02, arrayList, 2));
                    ns.f(i10).k(121, new Object[0]);
                }
                kg.r1.c0(r1Var);
                return;
            default:
                ((ki.d) this.f9836b).run();
                return;
        }
    }

    @Override
    public void i() {
        ((hi.o1) this.f9836b).invalidate();
    }

    @Override
    public void j(xh.f fVar, float f10, float f11) {
        fi.z7 z7Var;
        fi.y7 y7Var = (fi.y7) this.f9836b;
        if (!y7Var.v.f12604y) {
            fVar.f59995q = new fi.x7(y7Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
            ArrayList arrayList = y7Var.f12557i;
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
    public float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override
    public long l(long j3) {
        f3.u uVar = (f3.u) this.f9836b;
        return h2.l0.j((j3 * uVar.f10884e) / 1000000, 0L, uVar.f10888j - 1);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        kg.b1 b1Var;
        kg.b1 b1Var2;
        int i10;
        switch (this.f9835a) {
            case 1:
                ib ibVar = (ib) this.f9836b;
                b41 b41Var = (b41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                if (b41Var.G instanceof TL_stars.StarsTransaction) {
                    lb.k1(ibVar.getContext(), false, 0L, ibVar.f8818c, (TL_stars.StarsTransaction) b41Var.G, ibVar.f8817b);
                    return;
                }
                return;
            case 19:
                hi.l9 l9Var = (hi.l9) this.f9836b;
                b41 b41Var2 = (b41) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = b41Var2.d;
                hi.d7 d7Var = (hi.d7) b41Var2.G;
                l9Var.c(false, true);
                hi.sa saVar = l9Var.P;
                if (d7Var != saVar.L1 && !saVar.Y1) {
                    saVar.f15051e1.setSelected(i11);
                    saVar.Y1 = true;
                    ai.w0 w0Var = new ai.w0(saVar, i11, 9);
                    hi.u9 u9Var = saVar.f15107w1;
                    hi.d7 d7Var2 = saVar.L1;
                    if (u9Var != null && d7Var2 != null) {
                        if (!u9Var.r0()) {
                            w0Var.run();
                            return;
                        }
                        d7Var2.f();
                        Utilities.f22418g.c(new hi.v8(saVar, u9Var, d7Var2.f14143i0, d7Var2.f14145j0, d7Var2, u9Var.f14700y0.getPainting().E, u9Var.r0(), w0Var, 0));
                        return;
                    }
                    w0Var.run();
                    return;
                }
                return;
            case 25:
                kg.c1 c1Var = (kg.c1) this.f9836b;
                b41 b41Var3 = (b41) obj;
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f14 = (Float) serializable2;
                int i12 = b41Var3.d;
                if (i12 == -1) {
                    boolean z10 = !c1Var.d;
                    c1Var.d = z10;
                    ((org.telegram.ui.Cells.q8) view3).setChecked(z10);
                    c1Var.f17888a.f39892g3.O(true);
                    c1Var.d0(true);
                    return;
                } else if (i12 == -2) {
                    ?? e2Var = new org.telegram.ui.ActionBar.e2(null);
                    e2Var.f18152n = c1Var.f17893n;
                    e2Var.f18149c = new ai.v1(23, c1Var, view3);
                    c1Var.presentFragment((org.telegram.ui.ActionBar.e2) e2Var);
                    return;
                } else if (b41Var3.f56015a == 5 && i12 >= 0 && i12 < c1Var.f17892f.length) {
                    if (!hd.f24104a0 ? floatValue >= view3.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue <= org.telegram.messenger.g0.L(76.0f)) {
                        if (c1Var.f17892f[b41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.h5) view3).setChecked(true);
                            c1Var.f17892f[b41Var3.d].add(new kg.b1(0, 1439));
                            c1Var.c0(b41Var3.d);
                        } else {
                            c1Var.f17892f[b41Var3.d].clear();
                            ((org.telegram.ui.Cells.h5) view3).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.h5) view3).setValue(kg.c1.f0(c1Var.f17892f[b41Var3.d]));
                        c1Var.d0(true);
                        return;
                    }
                    int i13 = (b41Var3.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < c1Var.f17892f[i13].size(); i15++) {
                        if (((kg.b1) c1Var.f17892f[i13].get(i15)).f17876b > i14) {
                            i14 = ((kg.b1) c1Var.f17892f[i13].get(i15)).f17876b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (b41Var3.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < c1Var.f17892f[i16].size(); i18++) {
                        if (((kg.b1) c1Var.f17892f[i16].get(i18)).f17875a < i17) {
                            i17 = ((kg.b1) c1Var.f17892f[i16].get(i18)).f17875a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = b41Var3.f33184l;
                    ArrayList arrayList = c1Var.f17892f[b41Var3.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = c1Var.f17892f[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    kg.e1 e1Var = new kg.e1(charSequence, arrayList, max, i19, 28 - i20);
                    e1Var.f17921f = new hi.e1(c1Var, 29);
                    e1Var.h = new hi.h4(29, c1Var, b41Var3);
                    c1Var.presentFragment(e1Var);
                    return;
                } else {
                    return;
                }
            case 26:
                final kg.e1 e1Var2 = (kg.e1) this.f9836b;
                b41 b41Var4 = (b41) obj;
                final View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f15 = (Float) serializable;
                Float f16 = (Float) serializable2;
                int i22 = e1Var2.f17919c;
                int i23 = e1Var2.d;
                ArrayList arrayList3 = e1Var2.f17918b;
                int i24 = b41Var4.d;
                if (i24 == -1) {
                    e1Var2.f17923r = !e1Var2.f17923r;
                    arrayList3.clear();
                    if (e1Var2.f17923r) {
                        arrayList3.add(new kg.b1(0, 1439));
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view4;
                    boolean z11 = e1Var2.f17923r;
                    b41Var4.f33178e = z11;
                    q8Var.setChecked(z11);
                    boolean z12 = e1Var2.f17923r;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.j6.f28887f6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f28868e6;
                    }
                    q8Var.b(org.telegram.ui.ActionBar.j6.x0(null, i10, false), z12);
                    e1Var2.f17922n.f39892g3.O(true);
                    hi.e1 e1Var3 = e1Var2.f17921f;
                    if (e1Var3 != null) {
                        e1Var3.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !e1Var2.Z()) {
                        int i25 = ((kg.b1) i5.c.h(1, arrayList3)).f17876b;
                        int j3 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new kg.b1(j3, Utilities.j((i25 + 1560) / 2, i23, j3 + 1)));
                    } else {
                        if (e1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j10 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new kg.b1(j10, Utilities.j(1200, i23, j10 + 1)));
                    }
                    hi.e1 e1Var4 = e1Var2.f17921f;
                    if (e1Var4 != null) {
                        e1Var4.run();
                    }
                    e1Var2.f17922n.f39892g3.O(true);
                    return;
                } else if (b41Var4.f56015a == 3 && (i7 = i24 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i26 = i7 - 1;
                    if (i26 >= 0) {
                        b1Var = (kg.b1) arrayList3.get(i26);
                    } else {
                        b1Var = null;
                    }
                    final kg.b1 b1Var3 = (kg.b1) arrayList3.get(i7);
                    int i27 = i7 + 1;
                    if (i27 < arrayList3.size()) {
                        b1Var2 = (kg.b1) arrayList3.get(i27);
                    } else {
                        b1Var2 = null;
                    }
                    int i28 = b41Var4.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = e1Var2.getParentActivity();
                        String M0 = hd.M0(2131752750, null);
                        int i29 = b1Var3.f17875a;
                        if (b1Var != null) {
                            i22 = b1Var.f17876b + 1;
                        }
                        org.telegram.ui.Components.t4.U(parentActivity, M0, i29, i22, b1Var3.f17876b - 1, new z10() {
                            @Override
                            public final void a(Object obj3) {
                                Integer num5 = (Integer) obj3;
                                switch (r4) {
                                    case 0:
                                        e1 e1Var5 = e1Var2;
                                        boolean a02 = e1Var5.a0();
                                        int intValue = num5.intValue();
                                        b1Var3.f17875a = intValue;
                                        ((l8) view4).w(b1.a(intValue), true);
                                        if (a02 != e1Var5.a0()) {
                                            e1Var5.f17922n.f39892g3.O(true);
                                        }
                                        hi.e1 e1Var6 = e1Var5.f17921f;
                                        if (e1Var6 != null) {
                                            e1Var6.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        e1 e1Var7 = e1Var2;
                                        boolean a03 = e1Var7.a0();
                                        int intValue2 = num5.intValue();
                                        b1Var3.f17876b = intValue2;
                                        ((l8) view4).w(b1.a(intValue2), true);
                                        if (a03 != e1Var7.a0()) {
                                            e1Var7.f17922n.f39892g3.O(true);
                                        }
                                        hi.e1 e1Var8 = e1Var7.f17921f;
                                        if (e1Var8 != null) {
                                            e1Var8.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = e1Var2.getParentActivity();
                        String M02 = hd.M0(2131752756, null);
                        int i30 = b1Var3.f17876b;
                        int i31 = b1Var3.f17875a + 1;
                        if (b1Var2 != null) {
                            i23 = b1Var2.f17875a - 1;
                        }
                        org.telegram.ui.Components.t4.U(parentActivity2, M02, i30, i31, i23, new z10() {
                            @Override
                            public final void a(Object obj3) {
                                Integer num5 = (Integer) obj3;
                                switch (r4) {
                                    case 0:
                                        e1 e1Var5 = e1Var2;
                                        boolean a02 = e1Var5.a0();
                                        int intValue = num5.intValue();
                                        b1Var3.f17875a = intValue;
                                        ((l8) view4).w(b1.a(intValue), true);
                                        if (a02 != e1Var5.a0()) {
                                            e1Var5.f17922n.f39892g3.O(true);
                                        }
                                        hi.e1 e1Var6 = e1Var5.f17921f;
                                        if (e1Var6 != null) {
                                            e1Var6.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        e1 e1Var7 = e1Var2;
                                        boolean a03 = e1Var7.a0();
                                        int intValue2 = num5.intValue();
                                        b1Var3.f17876b = intValue2;
                                        ((l8) view4).w(b1.a(intValue2), true);
                                        if (a03 != e1Var7.a0()) {
                                            e1Var7.f17922n.f39892g3.O(true);
                                        }
                                        hi.e1 e1Var8 = e1Var7.f17921f;
                                        if (e1Var8 != null) {
                                            e1Var8.run();
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
                            arrayList3.add(new kg.b1(0, 1439));
                        }
                        e1Var2.f17922n.f39892g3.O(true);
                        hi.e1 e1Var5 = e1Var2.f17921f;
                        if (e1Var5 != null) {
                            e1Var5.run();
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
                kg.y1.Z((kg.y1) this.f9836b, (b41) obj, (View) obj2);
                return;
        }
    }

    @Override
    public RecyclerView n(View view) {
        ((kb) this.f9836b).getClass();
        return ((ib) view).f8816a;
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        hi.p9 p9Var = (hi.p9) this.f9836b;
        hi.sa saVar = p9Var.f14881a;
        hi.f6 f6Var = saVar.P0;
        int i7 = saVar.f15043c;
        if (f6Var != null) {
            f6Var.g(true);
        }
        if (saVar.p0()) {
            saVar.f15092s.d();
        }
        if (saVar.H1 != null && saVar.C0 != null) {
            saVar.R1 = false;
            saVar.S1 = false;
            hi.b6 b6Var = saVar.D0;
            if (b6Var != null) {
                b6Var.c(false);
            }
            if (j3 <= 800) {
                saVar.g(false, true);
                saVar.c0(false);
                saVar.K0.b(false, true);
                hi.f6 f6Var2 = saVar.P0;
                if (f6Var2 != null) {
                    f6Var2.g(true);
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
            hi.d7 o4 = hi.d7.o(saVar.H1, str, j3);
            o4.J0 = saVar.f15106w0;
            o4.K0 = saVar.f15110x0;
            o4.B();
            saVar.g(false, true);
            saVar.c0(false);
            saVar.K0.b(false, true);
            hi.f6 f6Var3 = saVar.P0;
            if (f6Var3 != null) {
                f6Var3.g(true);
            }
            if (saVar.B0.j()) {
                saVar.H1 = null;
                o4.P = 1.0f;
                if (saVar.B0.l(o4)) {
                    hi.d7 a10 = hi.d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                    saVar.L1 = a10;
                    hi.r8.a(i7, a10);
                    saVar.M1 = false;
                    int videoWidth = saVar.C0.getVideoWidth();
                    int videoHeight = saVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        hi.d7 d7Var = saVar.L1;
                        d7Var.f14147k0 = videoWidth;
                        d7Var.f14149l0 = videoHeight;
                        d7Var.A();
                    }
                }
                saVar.l0(true);
                return;
            }
            saVar.L1 = o4;
            hi.r8.a(i7, o4);
            saVar.M1 = false;
            int videoWidth2 = saVar.C0.getVideoWidth();
            int videoHeight2 = saVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.d7 d7Var2 = saVar.L1;
                d7Var2.f14147k0 = videoWidth2;
                d7Var2.f14149l0 = videoHeight2;
                d7Var2.A();
            }
            saVar.K(new hi.n9(p9Var, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f9835a) {
            case 2:
                ((e1.b) this.f9836b).invoke(obj);
                return;
            case 3:
                ((e1.b) this.f9836b).invoke(obj);
                return;
            default:
                ((ae.d) this.f9836b).invoke(obj);
                return;
        }
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
