package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class pp2 extends my0 implements jm7, g94, dg3 {
    public static final int P1 = 0;
    public final q7c A1;
    public final sb B1;
    public final sb C1;
    public final i15 D1;
    public final i15 E1;
    public final View F1;
    public final xp2 G1;
    public final boolean H1;
    public final h71 I1;
    public final Paint J1;
    public ArrayList K1;
    public String L1;
    public String M1;
    public iq5 N1;
    public iq5 O1;
    public final fn0 l1;
    public final fn0 m1;
    public final hs1 n1;
    public final long o1;
    public TLRPC.Chat p1;
    public boolean q1;
    public b61 r1;
    public b61 s1;
    public final d t1;
    public final kp2 u1;
    public final jp2 v1;
    public final jp2 w1;
    public final oq4 x1;
    public final oq4 y1;
    public final ch4 z1;

    public pp2(d dVar, long j, ArrayList arrayList, h71 h71Var) {
        super(dVar.getResourceProvider(), dVar.getContext(), true, true);
        boolean z;
        boolean z2;
        d53 d53Var = d53.h;
        this.l1 = new fn0(1, this, d53Var, 350L, false);
        this.m1 = new fn0(2, this, d53Var, 350L, false);
        this.D1 = new i15(2);
        this.E1 = new i15(8);
        Paint paint = new Paint(1);
        this.J1 = paint;
        iq5 iq5Var = iq5.e;
        this.N1 = iq5Var;
        this.O1 = iq5Var;
        gm.S(getWindow());
        this.t1 = dVar;
        if (arrayList != null) {
            z = true;
        } else {
            z = false;
        }
        this.H1 = z;
        this.K1 = arrayList;
        this.I1 = h71Var;
        Context context = dVar.getContext();
        nm7.f(this.a).b(this, nm7.T);
        nm7.f(this.a).b(this, 2);
        int i = cmb.Z6;
        paint.setColor(cmb.v0(i, this.J0));
        L(i);
        this.b = new lp2(this, context);
        hs1 hs1Var = new hs1((byte) 1, context, this);
        this.n1 = hs1Var;
        int i2 = this.u0;
        hs1Var.setPadding(i2, 0, i2, 0);
        this.b.addView(this.n1, qoe.e(-1, -1, 119));
        this.B1 = new sb((byte) 9, context, this);
        this.C1 = new sb((byte) 9, context, this);
        oq4 oq4Var = new oq4(context, this.J0);
        this.x1 = oq4Var;
        oq4Var.setCloseButtonVisible(true);
        oq4Var.y = true;
        oq4Var.updateColors();
        String M0 = jb6.M0(2131745570, null);
        l7 l7Var = oq4Var.r;
        l7Var.setHint(M0);
        l7Var.addTextChangedListener(new hp2(this, (byte) 0));
        oq4Var.setVisibility(8);
        oq4 oq4Var2 = new oq4(context, this.J0);
        this.y1 = oq4Var2;
        oq4Var2.setCloseButtonVisible(true);
        oq4Var2.y = true;
        oq4Var2.updateColors();
        String M02 = jb6.M0(2131745570, null);
        l7 l7Var2 = oq4Var2.r;
        l7Var2.setHint(M02);
        l7Var2.addTextChangedListener(new hp2(this, (byte) 1));
        oq4Var2.setVisibility(8);
        q7c q7cVar = new q7c(context, this.a, 0, false, new dp2(this, (byte) 0), new ep2(this, (byte) 0), null, this.J0);
        this.A1 = q7cVar;
        q7cVar.j(new ip2(this, (byte) 0));
        q7cVar.setClipToPadding(false);
        q7cVar.setVisibility(8);
        q7cVar.r1();
        q7cVar.g3.r = false;
        q7cVar.setPadding(0, gm.L(52.0f) + gm.m, 0, gm.n);
        ch4 ch4Var = new ch4(dVar);
        this.z1 = ch4Var;
        ch4Var.setVisibility(8);
        ch4Var.setBackground(null);
        ch4Var.setChatPreviewDelegate(new k4f((byte) 15));
        ch4Var.setUiCallback(new sz4(this));
        ch4Var.b.setClipToPadding(false);
        this.F1 = new View(getContext());
        Context context2 = getContext();
        ylb ylbVar = this.J0;
        xp2 xp2Var = new xp2(context2, ylbVar, new c41((FrameLayout) this.b, ylbVar), this.a, j);
        this.G1 = xp2Var;
        xp2Var.h = new hi2(this, dVar, false, (byte) 17);
        this.o1 = j;
        this.p1 = oc7.r1(this.a).L0(Long.valueOf(j));
        oc7.r1(this.a).M0(j);
        TLRPC.Chat chat = this.p1;
        if (chat != null && chat.collapsed_in_dialogs) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.q1 = z2;
        sh4 sh4Var = new sh4(2131232707, 4, pg3.t(chat));
        sh4Var.f = this.p1;
        sh4Var.h = false;
        ArrayList arrayList2 = oq4Var.G;
        arrayList2.add(sh4Var);
        oq4Var.J = arrayList2.size() - 1;
        oq4Var.e();
        s0(cmb.v0(i, this.J0));
        this.v1 = new jp2(this, context, (byte) 1);
        this.u1 = new kp2(this, context);
        this.w1 = new jp2(this, context, (byte) 0);
        this.n1.setAdapter(new fn2(this, (byte) 1));
        oq4Var.setCloseButtonOnClickListener(new fp2(this, (byte) 0));
        oq4Var2.setCloseButtonOnClickListener(new fp2(this, (byte) 1));
        xp2Var.d();
        oc7.r1(this.a).a3(0, j, true);
        u31.a((FrameLayout) this.b, new oz((byte) 6));
        ViewGroup viewGroup = this.b;
        ep2 ep2Var = new ep2(this, (byte) 1);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(viewGroup, ep2Var);
    }

    @Override
    public final boolean C() {
        if (!this.l1.f && !this.m1.f) {
            View currentView = this.n1.getCurrentView();
            if (currentView instanceof np2) {
                return ((np2) currentView).e;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 8;
        if (i == 1) {
            float a = aie.a(f);
            float R1 = gm.R1(0.9f, 1.0f, a);
            kp2 kp2Var = this.u1;
            kp2Var.a.setAlpha(a);
            kp2Var.a.setScaleX(R1);
            kp2Var.a.setScaleY(R1);
            a aVar = kp2Var.a;
            int i12 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            aVar.setVisibility(i6);
            float R12 = gm.R1(0.9f, 1.0f, f);
            oq4 oq4Var = this.x1;
            oq4Var.setAlpha(f);
            oq4Var.setScaleX(R12);
            oq4Var.setScaleY(R12);
            int i13 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            oq4Var.setVisibility(i7);
            kp2Var.d.setAlpha(a);
            q7c q7cVar = kp2Var.d;
            if (i12 > 0) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            q7cVar.setVisibility(i8);
            this.r1.setAlpha(a);
            this.r1.setScaleX(gm.R1(0.95f, 1.0f, a));
            this.r1.setScaleY(gm.R1(0.95f, 1.0f, a));
            b61 b61Var = this.r1;
            if (i12 > 0) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            b61Var.setVisibility(i9);
            ch4 ch4Var = this.z1;
            ch4Var.setAlpha(f);
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ch4Var.setVisibility(i10);
            this.b.invalidate();
            this.B1.invalidate();
        }
        if (i == 2) {
            float a2 = aie.a(f);
            float R13 = gm.R1(0.9f, 1.0f, a2);
            jp2 jp2Var = this.w1;
            jp2Var.a.setAlpha(a2);
            jp2Var.a.setScaleX(R13);
            jp2Var.a.setScaleY(R13);
            a aVar2 = jp2Var.a;
            int i14 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i14 > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            aVar2.setVisibility(i2);
            float R14 = gm.R1(0.9f, 1.0f, f);
            oq4 oq4Var2 = this.y1;
            oq4Var2.setAlpha(f);
            oq4Var2.setScaleX(R14);
            oq4Var2.setScaleY(R14);
            int i15 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            oq4Var2.setVisibility(i3);
            jp2Var.d.setAlpha(a2);
            q7c q7cVar2 = jp2Var.d;
            if (i14 > 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            q7cVar2.setVisibility(i4);
            if (!this.H1) {
                this.s1.setAlpha(a2);
                this.s1.setScaleX(gm.R1(0.95f, 1.0f, a2));
                this.s1.setScaleY(gm.R1(0.95f, 1.0f, a2));
                b61 b61Var2 = this.s1;
                if (i14 > 0) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                b61Var2.setVisibility(i5);
            }
            q7c q7cVar3 = this.A1;
            q7cVar3.setAlpha(f);
            if (i15 > 0) {
                i11 = 0;
            }
            q7cVar3.setVisibility(i11);
            this.b.invalidate();
            this.C1.invalidate();
        }
    }

    public final boolean D0(c6c c6cVar) {
        Object obj = c6cVar.H;
        if (obj instanceof vo2) {
            vo2 vo2Var = (vo2) obj;
            long j = vo2Var.a;
            TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-j));
            TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(j));
            d dVar = this.t1;
            if (W1 != null) {
                dVar.presentFragment(yv1.ga(W1.id));
                return true;
            } else if (!sd2.t0(L0) && !sd2.j0(L0)) {
                new qo2(getContext(), L0, new ra2(this, vo2Var, (byte) 24)).show();
                return true;
            } else {
                dVar.presentFragment(yv1.ga(-L0.id));
                return true;
            }
        }
        return false;
    }

    public final void E0(ArrayList arrayList, boolean z) {
        String str;
        String str2;
        int i = 0;
        if (!z) {
            arrayList.add(c6c.E(99, (int) (gm.q.y * 0.35f)));
            arrayList.add(c6c.E(0, gm.L(56.0f)));
        }
        if (this.K1 != null) {
            if (z && (str2 = this.M1) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.K1;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(c6c.w(chat));
                    }
                } else {
                    arrayList.add(c6c.w(chat));
                }
            }
        }
    }

    public final void F0(TLRPC.Chat chat, long j, boolean z) {
        long j2 = -chat.id;
        boolean V = sd2.V(chat);
        if (!sd2.T(chat)) {
            he heVar = new he(3, null, getContext());
            heVar.q(250L);
            oc7.r1(this.a).P(getContext(), -j2, null, new go2(this, heVar, j, z, (byte) 1), null);
            return;
        }
        oc7.r1(this.a).V2(j2, j, false, z, new gp2(this, V, (byte) 0));
    }

    public final void G0(c6c c6cVar) {
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.H1) {
                this.I1.a(chat);
                dismiss();
                return;
            }
            new co2(getContext(), this.p1, -chat.id, new qy1(this, chat, (byte) 10)).show();
        }
    }

    @Override
    public final void H() {
        nm7.f(this.a).n(this, nm7.T);
        nm7.f(this.a).n(this, 2);
        super.H();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.T;
        long j = this.o1;
        kp2 kp2Var = this.u1;
        if (i == i3) {
            if (((TLRPC.ChatFull) objArr[0]).id == j) {
                kp2Var.d.g3.O(true);
            }
        } else if (i == 2) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i4 = oc7.s5;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(j));
                this.p1 = L0;
                kp2Var.a.setTitle(pg3.l(L0));
                kp2Var.h.f(this.p1, kp2Var.n);
            }
        }
    }

    @Override
    public final void k(hg3 hg3Var) {
        if (oc7.r1(this.a).N1().J(hg3Var.getDialogId())) {
            d dVar = this.t1;
            dVar.getOrCreateStoryViewer().getClass();
            dVar.getOrCreateStoryViewer().H(dVar.getContext(), hg3Var.getDialogId(), q4b.a((r59) hg3Var.getParent()));
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void o(hg3 hg3Var) {
        TLRPC.TL_forumTopic f;
        if (hg3Var.getMessage() != null && (f = oc7.r1(this.a).g4.f(-hg3Var.getDialogId(), k47.b2(this.a, hg3Var.getMessage().k, true, false))) != null) {
            no4.n(this.t1, -hg3Var.getDialogId(), f, 0);
        }
    }

    @Override
    public final void onBackPressed() {
        hs1 hs1Var = this.n1;
        if (hs1Var.getCurrentPosition() > 0) {
            if (hs1Var.getCurrentPosition() == 2) {
                fn0 fn0Var = this.m1;
                if (fn0Var.f) {
                    this.w1.d.f3.g1(1, this.O1.b);
                    fn0Var.a(false, true);
                    this.r0 = true;
                    oq4 oq4Var = this.y1;
                    gm.t1(oq4Var.r);
                    oq4Var.r.clearFocus();
                    return;
                }
            }
            hs1Var.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void p0() {
        Paint paint = this.J1;
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (paint.getColor() != v0) {
                s0(v0);
                paint.setColor(v0);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void r() {
    }

    @Override
    public final void u(hg3 hg3Var) {
    }

    @Override
    public final void v(hg3 hg3Var) {
    }

    @Override
    public final void V(float f, int i) {
    }

    public pp2(d dVar, long j) {
        this(dVar, j, null, null);
    }
}
