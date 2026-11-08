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
import bi.ad;
import bi.cd;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.h9;
import fi.ja;
import fi.la;
import fi.va;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.x31;
public final class q4 implements g7, j9, xh.j, r0.m, OnSuccessListener, w10, dj0, org.telegram.ui.ActionBar.r1, qi0, a20, sg.l1, CameraController.VideoTakeCallback, ft0, h9.h1, f3.g, h2.o {
    public final int f9633a;
    public final Object f9634b;

    public q4(Object obj, int i7) {
        this.f9633a = i7;
        this.f9634b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        int a10;
        p9 p9Var = (p9) this.f9634b;
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p9Var.f9578w.getLayoutParams();
        if (!p9Var.f9535c) {
            i7 = k1Var.d();
        }
        marginLayoutParams.topMargin = i7;
        if (p9Var.f9535c) {
            a10 = k1Var.f54201a.f(2).d;
        } else {
            a10 = k1Var.a();
        }
        marginLayoutParams.bottomMargin = a10;
        marginLayoutParams.leftMargin = I0.f15120a;
        marginLayoutParams.rightMargin = I0.f15122c;
        d9 d9Var = p9Var.f9569s;
        if (d9Var != null) {
            d9Var.requestLayout();
        }
        e9 e9Var = p9Var.f9578w;
        if (e9Var != null) {
            e9Var.requestLayout();
        }
        return r0.k1.f54200b;
    }

    @Override
    public void b(boolean z9) {
        j5 j5Var = (j5) this.f9634b;
        if (j5Var != null) {
            j5Var.c();
        }
    }

    @Override
    public boolean c(int r6, android.view.View r7) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.c(int, android.view.View):boolean");
    }

    @Override
    public Object d(Number number, Object obj) {
        sp0 sp0Var = (sp0) this.f9634b;
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == -1) {
            new ei.q(sp0Var.f10844a, id.M0(2131746694, null), new ai.i(sp0Var, 15)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void e() {
        ((fi.m1) this.f9634b).invalidate();
    }

    @Override
    public void f() {
        float f10;
        fi.x9 x9Var = (fi.x9) this.f9634b;
        TextView textView = x9Var.X0;
        boolean a10 = x9Var.m0.a();
        ImageView imageView = x9Var.W0;
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
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f9633a) {
            case 9:
                va vaVar = ((la) ((fi.r) this.f9634b)).R1;
                ja jaVar = vaVar.X0;
                if (jaVar != null) {
                    jaVar.s(null, null, true);
                }
                fi.x9 x9Var = vaVar.f13002v1;
                if (x9Var != null) {
                    x9Var.n0();
                }
                la laVar = vaVar.f12944c1;
                if (laVar != null) {
                    laVar.setHasRoundVideo(false);
                }
                fi.e7 e7Var = vaVar.K1;
                if (e7Var != null) {
                    File file = e7Var.f11907o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        vaVar.K1.f11907o0 = null;
                    }
                    if (vaVar.K1.f11909p0 != null) {
                        try {
                            new File(vaVar.K1.f11909p0).delete();
                        } catch (Exception unused2) {
                        }
                        vaVar.K1.f11909p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((fi.h5) this.f9634b).f12133a.Y1.r();
                return;
            case 19:
                ((hi.d) this.f9634b).run();
                return;
            case 20:
                hi.j jVar = (hi.j) this.f9634b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().o1(jVar.R);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, jVar.getParentActivity(), null);
                u1Var2.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new hi.b(jVar, u1Var2, 0));
                return;
            default:
                kg.q1 q1Var = (kg.q1) ((bi.s) this.f9634b).f4656b;
                kg.t1 f10 = kg.t1.f(kg.q1.g0(q1Var));
                ArrayList arrayList = q1Var.f17513b;
                int i10 = f10.f17547a;
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
                        kg.s1 c10 = f10.c(((Integer) arrayList.get(i12)).intValue());
                        f10.f17548b.remove(c10);
                        f10.a(c10.f17533b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.f17532a;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_deleteQuickReplyShortcut, new u5(6));
                        if ("hello".equals(c10.f17533b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull b22 = qp.s1(i10).b2(p10.i(i10).e());
                            if (b22 != null) {
                                b22.flags2 &= -5;
                                b22.business_greeting_message = null;
                                yr.a0(i10).j2(b22, true);
                            }
                        } else if ("away".equals(c10.f17533b)) {
                            ConnectionsManager.getInstance(i10).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull b23 = qp.s1(i10).b2(p10.i(i10).e());
                            if (b23 != null) {
                                b23.flags2 &= -9;
                                b23.business_away_message = null;
                                yr.a0(i10).j2(b23, true);
                            }
                        }
                    }
                    f10.l();
                    yr a02 = yr.a0(i10);
                    a02.f26719a.c(new fi.x0(a02, arrayList, 2));
                    qs.f(i10).k(121, new Object[0]);
                }
                kg.q1.c0(q1Var);
                return;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        kg.b1 b1Var;
        kg.b1 b1Var2;
        int i10;
        switch (this.f9633a) {
            case 12:
                fi.o9 o9Var = (fi.o9) this.f9634b;
                x31 x31Var = (x31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                int i11 = x31Var.d;
                fi.e7 e7Var = (fi.e7) x31Var.G;
                o9Var.c(false, true);
                va vaVar = o9Var.O;
                if (e7Var != vaVar.K1 && !vaVar.X1) {
                    vaVar.f12947d1.setSelected(i11);
                    vaVar.X1 = true;
                    bg.m0 m0Var = new bg.m0(vaVar, i11, 9);
                    fi.x9 x9Var = vaVar.f13002v1;
                    fi.e7 e7Var2 = vaVar.K1;
                    if (x9Var != null && e7Var2 != null) {
                        if (!x9Var.r0()) {
                            m0Var.run();
                            return;
                        }
                        e7Var2.f();
                        Utilities.f21338g.c(new fi.x8(vaVar, x9Var, e7Var2.f11896i0, e7Var2.f11898j0, e7Var2, x9Var.f12555x0.getPainting().E, x9Var.r0(), m0Var, 0));
                        return;
                    }
                    m0Var.run();
                    return;
                }
                return;
            case 21:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                hi.q.a0((hi.q) this.f9634b, (x31) obj);
                return;
            case 22:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                ((hi.p4) this.f9634b).a0((x31) obj);
                return;
            case 24:
                kg.c1 c1Var = (kg.c1) this.f9634b;
                x31 x31Var2 = (x31) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                float floatValue = ((Float) serializable).floatValue();
                Float f16 = (Float) serializable2;
                int i12 = x31Var2.d;
                if (i12 == -1) {
                    boolean z9 = !c1Var.d;
                    c1Var.d = z9;
                    ((org.telegram.ui.Cells.r8) view4).setChecked(z9);
                    c1Var.f17329a.f37190f3.O(true);
                    c1Var.d0(true);
                    return;
                } else if (i12 == -2) {
                    ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                    f2Var.f17575n = c1Var.f17334n;
                    f2Var.f17572c = new ai.f1(25, c1Var, view4);
                    c1Var.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                    return;
                } else if (x31Var2.f54531a == 5 && i12 >= 0 && i12 < c1Var.f17333f.length) {
                    if (!id.f23157a0 ? floatValue >= view4.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue <= org.telegram.messenger.g0.L(76.0f)) {
                        if (c1Var.f17333f[x31Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.h5) view4).setChecked(true);
                            c1Var.f17333f[x31Var2.d].add(new kg.b1(0, 1439));
                            c1Var.c0(x31Var2.d);
                        } else {
                            c1Var.f17333f[x31Var2.d].clear();
                            ((org.telegram.ui.Cells.h5) view4).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.h5) view4).setValue(kg.c1.f0(c1Var.f17333f[x31Var2.d]));
                        c1Var.d0(true);
                        return;
                    }
                    int i13 = (x31Var2.d + 6) % 7;
                    int i14 = 0;
                    for (int i15 = 0; i15 < c1Var.f17333f[i13].size(); i15++) {
                        if (((kg.b1) c1Var.f17333f[i13].get(i15)).f17317b > i14) {
                            i14 = ((kg.b1) c1Var.f17333f[i13].get(i15)).f17317b;
                        }
                    }
                    int max = Math.max(0, i14 - 1439);
                    int i16 = (x31Var2.d + 1) % 7;
                    int i17 = 1440;
                    for (int i18 = 0; i18 < c1Var.f17333f[i16].size(); i18++) {
                        if (((kg.b1) c1Var.f17333f[i16].get(i18)).f17316a < i17) {
                            i17 = ((kg.b1) c1Var.f17333f[i16].get(i18)).f17316a;
                        }
                    }
                    int i19 = i17 + 1439;
                    CharSequence charSequence = x31Var2.f40180l;
                    ArrayList arrayList = c1Var.f17333f[x31Var2.d];
                    int i20 = 0;
                    for (int i21 = 0; i21 < 7; i21++) {
                        ArrayList arrayList2 = c1Var.f17333f[i21];
                        if (arrayList2 != null) {
                            i20 = Math.max(1, arrayList2.size()) + i20;
                        }
                    }
                    kg.e1 e1Var = new kg.e1(charSequence, arrayList, max, i19, 28 - i20);
                    e1Var.f17362f = new fi.h9(c1Var, 27);
                    e1Var.h = new ha.b(19, c1Var, x31Var2);
                    c1Var.presentFragment(e1Var);
                    return;
                } else {
                    return;
                }
            case 25:
                final kg.e1 e1Var2 = (kg.e1) this.f9634b;
                x31 x31Var3 = (x31) obj;
                final View view5 = (View) obj2;
                Integer num5 = (Integer) number;
                Float f17 = (Float) serializable;
                Float f18 = (Float) serializable2;
                int i22 = e1Var2.f17360c;
                int i23 = e1Var2.d;
                ArrayList arrayList3 = e1Var2.f17359b;
                int i24 = x31Var3.d;
                if (i24 == -1) {
                    e1Var2.f17364r = !e1Var2.f17364r;
                    arrayList3.clear();
                    if (e1Var2.f17364r) {
                        arrayList3.add(new kg.b1(0, 1439));
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view5;
                    boolean z10 = e1Var2.f17364r;
                    x31Var3.f40174e = z10;
                    r8Var.setChecked(z10);
                    boolean z11 = e1Var2.f17364r;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.k6.f27890f6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f27871e6;
                    }
                    r8Var.b(org.telegram.ui.ActionBar.k6.x0(null, i10, false), z11);
                    e1Var2.f17363n.f37190f3.O(true);
                    fi.h9 h9Var = e1Var2.f17362f;
                    if (h9Var != null) {
                        h9Var.run();
                        return;
                    }
                    return;
                } else if (i24 == -2) {
                    if (!arrayList3.isEmpty() && !e1Var2.Z()) {
                        int i25 = ((kg.b1) jg.g.i(1, arrayList3)).f17317b;
                        int j3 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new kg.b1(j3, Utilities.j((i25 + 1560) / 2, i23, j3 + 1)));
                    } else {
                        if (e1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j10 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new kg.b1(j10, Utilities.j(1200, i23, j10 + 1)));
                    }
                    fi.h9 h9Var2 = e1Var2.f17362f;
                    if (h9Var2 != null) {
                        h9Var2.run();
                    }
                    e1Var2.f17363n.f37190f3.O(true);
                    return;
                } else if (x31Var3.f54531a == 3 && (i7 = i24 / 3) >= 0 && i7 < arrayList3.size()) {
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
                    int i28 = x31Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = e1Var2.getParentActivity();
                        String M0 = id.M0(2131752750, null);
                        int i29 = b1Var3.f17316a;
                        if (b1Var != null) {
                            i22 = b1Var.f17317b + 1;
                        }
                        org.telegram.ui.Components.v4.U(parentActivity, M0, i29, i22, b1Var3.f17317b - 1, new c20() {
                            @Override
                            public final void a(Object obj3) {
                                Integer num6 = (Integer) obj3;
                                switch (r4) {
                                    case 0:
                                        e1 e1Var3 = e1Var2;
                                        boolean a02 = e1Var3.a0();
                                        int intValue = num6.intValue();
                                        b1Var3.f17316a = intValue;
                                        ((m8) view5).w(b1.a(intValue), true);
                                        if (a02 != e1Var3.a0()) {
                                            e1Var3.f17363n.f37190f3.O(true);
                                        }
                                        h9 h9Var3 = e1Var3.f17362f;
                                        if (h9Var3 != null) {
                                            h9Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        e1 e1Var4 = e1Var2;
                                        boolean a03 = e1Var4.a0();
                                        int intValue2 = num6.intValue();
                                        b1Var3.f17317b = intValue2;
                                        ((m8) view5).w(b1.a(intValue2), true);
                                        if (a03 != e1Var4.a0()) {
                                            e1Var4.f17363n.f37190f3.O(true);
                                        }
                                        h9 h9Var4 = e1Var4.f17362f;
                                        if (h9Var4 != null) {
                                            h9Var4.run();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = e1Var2.getParentActivity();
                        String M02 = id.M0(2131752756, null);
                        int i30 = b1Var3.f17317b;
                        int i31 = b1Var3.f17316a + 1;
                        if (b1Var2 != null) {
                            i23 = b1Var2.f17316a - 1;
                        }
                        org.telegram.ui.Components.v4.U(parentActivity2, M02, i30, i31, i23, new c20() {
                            @Override
                            public final void a(Object obj3) {
                                Integer num6 = (Integer) obj3;
                                switch (r4) {
                                    case 0:
                                        e1 e1Var3 = e1Var2;
                                        boolean a02 = e1Var3.a0();
                                        int intValue = num6.intValue();
                                        b1Var3.f17316a = intValue;
                                        ((m8) view5).w(b1.a(intValue), true);
                                        if (a02 != e1Var3.a0()) {
                                            e1Var3.f17363n.f37190f3.O(true);
                                        }
                                        h9 h9Var3 = e1Var3.f17362f;
                                        if (h9Var3 != null) {
                                            h9Var3.run();
                                            return;
                                        }
                                        return;
                                    default:
                                        e1 e1Var4 = e1Var2;
                                        boolean a03 = e1Var4.a0();
                                        int intValue2 = num6.intValue();
                                        b1Var3.f17317b = intValue2;
                                        ((m8) view5).w(b1.a(intValue2), true);
                                        if (a03 != e1Var4.a0()) {
                                            e1Var4.f17363n.f37190f3.O(true);
                                        }
                                        h9 h9Var4 = e1Var4.f17362f;
                                        if (h9Var4 != null) {
                                            h9Var4.run();
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
                        e1Var2.f17363n.f37190f3.O(true);
                        fi.h9 h9Var3 = e1Var2.f17362f;
                        if (h9Var3 != null) {
                            h9Var3.run();
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
                Integer num6 = (Integer) number;
                Float f19 = (Float) serializable;
                Float f20 = (Float) serializable2;
                kg.w1.Z((kg.w1) this.f9634b, (x31) obj, (View) obj2);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9633a) {
            case 28:
                ((e2.a1) obj).o((e2.e) this.f9634b);
                return;
            default:
                ((e2.a1) obj).D((e2.q1) this.f9634b);
                return;
        }
    }

    @Override
    public Object j(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.m1) this.f9634b).f14351f, obj, false, 26));
    }

    @Override
    public void k(float f10, Canvas canvas, RectF rectF, boolean z9) {
        Path path = (Path) this.f9634b;
        if (z9) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public RecyclerView l(View view) {
        ((cd) this.f9634b).getClass();
        return ((ad) view).f3468a;
    }

    @Override
    public void m(xh.f fVar, float f10, float f11) {
        g8 g8Var;
        f8 f8Var = (f8) this.f9634b;
        if (!f8Var.v.f9061y) {
            fVar.f58803q = new e8(f8Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(g8Var.getHeight(), 2.0d) + Math.pow(g8Var.getWidth(), 2.0d));
            ArrayList arrayList = f8Var.f9009i;
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
    public void onFinishVideoRecording(String str, long j3) {
        fi.s9 s9Var = (fi.s9) this.f9634b;
        va vaVar = s9Var.f12819a;
        fi.g6 g6Var = vaVar.O0;
        int i7 = vaVar.f12942c;
        if (g6Var != null) {
            g6Var.g(true);
        }
        if (vaVar.p0()) {
            vaVar.f12991s.d();
        }
        if (vaVar.G1 != null && vaVar.B0 != null) {
            vaVar.Q1 = false;
            vaVar.R1 = false;
            fi.c6 c6Var = vaVar.C0;
            if (c6Var != null) {
                c6Var.c(false);
            }
            if (j3 <= 800) {
                vaVar.g(false, true);
                vaVar.c0(false);
                vaVar.J0.b(false, true);
                fi.g6 g6Var2 = vaVar.O0;
                if (g6Var2 != null) {
                    g6Var2.g(true);
                }
                try {
                    vaVar.G1.delete();
                    vaVar.G1 = null;
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
            vaVar.h0(false, true);
            fi.e7 o4 = fi.e7.o(vaVar.G1, str, j3);
            o4.J0 = vaVar.f13001v0;
            o4.K0 = vaVar.f13005w0;
            o4.B();
            vaVar.g(false, true);
            vaVar.c0(false);
            vaVar.J0.b(false, true);
            fi.g6 g6Var3 = vaVar.O0;
            if (g6Var3 != null) {
                g6Var3.g(true);
            }
            if (vaVar.A0.j()) {
                vaVar.G1 = null;
                o4.P = 1.0f;
                if (vaVar.A0.l(o4)) {
                    fi.e7 a10 = fi.e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
                    vaVar.K1 = a10;
                    fi.t8.a(i7, a10);
                    vaVar.L1 = false;
                    int videoWidth = vaVar.B0.getVideoWidth();
                    int videoHeight = vaVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        fi.e7 e7Var = vaVar.K1;
                        e7Var.f11900k0 = videoWidth;
                        e7Var.f11902l0 = videoHeight;
                        e7Var.A();
                    }
                }
                vaVar.l0(true);
                return;
            }
            vaVar.K1 = o4;
            fi.t8.a(i7, o4);
            vaVar.L1 = false;
            int videoWidth2 = vaVar.B0.getVideoWidth();
            int videoHeight2 = vaVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                fi.e7 e7Var2 = vaVar.K1;
                e7Var2.f11900k0 = videoWidth2;
                e7Var2.f11902l0 = videoHeight2;
                e7Var2.A();
            }
            vaVar.K(new fi.q9(s9Var, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f9633a) {
            case 5:
                ((e1.b) this.f9634b).invoke(obj);
                return;
            case 8:
                ((e1.b) this.f9634b).invoke(obj);
                return;
            default:
                ((ae.d) this.f9634b).invoke(obj);
                return;
        }
    }

    @Override
    public long q(long j3) {
        f3.u uVar = (f3.u) this.f9634b;
        return h2.m0.j((j3 * uVar.f11077e) / 1000000, 0L, uVar.f11081j - 1);
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }
}
