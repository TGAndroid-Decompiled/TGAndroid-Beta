package li;

import a8.n7;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.j5;
import bi.o3;
import bi.v1;
import c8.na;
import fi.y6;
import hi.ea;
import hi.p8;
import hi.q1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import ki.n2;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.b00;
import org.telegram.ui.bn;
public final class c0 extends w2 implements fs, te.b, q2 {
    public static final int Q1 = 0;
    public final b00 A1;
    public final g51 B1;
    public final o3 C1;
    public final o3 D1;
    public final bg.d0 E1;
    public final bg.d0 F1;
    public final View G1;
    public final j0 H1;
    public final boolean I1;
    public final w10 J1;
    public final Paint K1;
    public ArrayList L1;
    public String M1;
    public String N1;
    public i0.b O1;
    public i0.b P1;
    public final te.a f19995m1;
    public final te.a n1;
    public final q1 f19996o1;
    public final long f19997p1;
    public TLRPC.Chat f19998q1;
    public boolean f19999r1;
    public hi.e f20000s1;
    public hi.e f20001t1;
    public final g2 f20002u1;
    public final y f20003v1;
    public final x f20004w1;
    public final x f20005x1;
    public final c10 f20006y1;
    public final c10 f20007z1;

    public c0(g2 g2Var, long j3) {
        this(g2Var, j3, null, null);
    }

    @Override
    public final boolean F() {
        if (!this.f19995m1.f57780f && !this.n1.f57780f) {
            View currentView = this.f19996o1.getCurrentView();
            if (currentView instanceof a0) {
                return ((a0) currentView).f19989e;
            }
            return true;
        }
        return false;
    }

    public final boolean J0(n41 n41Var) {
        Object obj = n41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f21111a;
            TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(-j3));
            TLRPC.User c22 = mp.u1(this.f30223a).c2(Long.valueOf(j3));
            g2 g2Var = this.f20002u1;
            if (c22 != null) {
                g2Var.presentFragment(bn.ua(c22.f28641id));
                return true;
            } else if (!v3.t0(O0) && !v3.j0(O0)) {
                new ni.b(getContext(), O0, new ji.f(21, this, fVar)).show();
                return true;
            } else {
                g2Var.presentFragment(bn.ua(-O0.f28492id));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        if (i7 == 1) {
            float a10 = n7.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            y yVar = this.f20003v1;
            yVar.f19986a.setAlpha(a10);
            yVar.f19986a.setScaleX(T1);
            yVar.f19986a.setScaleY(T1);
            org.telegram.ui.ActionBar.k kVar = yVar.f19986a;
            int i20 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            kVar.setVisibility(i14);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            c10 c10Var = this.f20006y1;
            c10Var.setAlpha(f10);
            c10Var.setScaleX(T12);
            c10Var.setScaleY(T12);
            int i21 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            c10Var.setVisibility(i15);
            yVar.d.setAlpha(a10);
            g51 g51Var = yVar.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            g51Var.setVisibility(i16);
            this.f20000s1.setAlpha(a10);
            this.f20000s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.f20000s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            hi.e eVar = this.f20000s1;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            eVar.setVisibility(i17);
            b00 b00Var = this.A1;
            b00Var.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            b00Var.setVisibility(i18);
            this.f30226b.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 2) {
            float a11 = n7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            x xVar = this.f20005x1;
            xVar.f19986a.setAlpha(a11);
            xVar.f19986a.setScaleX(T13);
            xVar.f19986a.setScaleY(T13);
            org.telegram.ui.ActionBar.k kVar2 = xVar.f19986a;
            int i22 = (a11 > 0.0f ? 1 : (a11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar2.setVisibility(i10);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            c10 c10Var2 = this.f20007z1;
            c10Var2.setAlpha(f10);
            c10Var2.setScaleX(T14);
            c10Var2.setScaleY(T14);
            int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c10Var2.setVisibility(i11);
            xVar.d.setAlpha(a11);
            g51 g51Var2 = xVar.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            g51Var2.setVisibility(i12);
            if (!this.I1) {
                this.f20001t1.setAlpha(a11);
                this.f20001t1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.f20001t1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                hi.e eVar2 = this.f20001t1;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                eVar2.setVisibility(i13);
            }
            g51 g51Var3 = this.B1;
            g51Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            g51Var3.setVisibility(i19);
            this.f30226b.invalidate();
            this.D1.invalidate();
        }
    }

    public final void K0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i7 = 0;
        if (!z10) {
            arrayList.add(n41.E(99, (int) (org.telegram.messenger.g0.f24226q.y * 0.35f)));
            arrayList.add(n41.E(0, org.telegram.messenger.g0.L(56.0f)));
        }
        if (this.L1 != null) {
            if (z10 && (str2 = this.N1) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.L1;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(n41.w(chat));
                    }
                } else {
                    arrayList.add(n41.w(chat));
                }
            }
        }
    }

    @Override
    public final void L() {
        ks.f(this.f30223a).n(this, ks.T);
        ks.f(this.f30223a).n(this, ks.f25276r);
        super.L();
    }

    public final void L0(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f28492id;
        boolean V = v3.V(chat);
        if (!v3.T(chat)) {
            t1 t1Var = new t1(3, getContext(), null);
            t1Var.r(250L);
            mp.u1(this.f30223a).T(getContext(), -j10, null, new d(this, t1Var, j3, z10, 1), null);
            return;
        }
        mp.u1(this.f30223a).W2(j10, j3, false, z10, new ea(this, V, 1));
    }

    public final void M0(n41 n41Var) {
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.I1) {
                this.J1.a(chat);
                dismiss();
                return;
            }
            new ni.a(getContext(), this.f19998q1, -chat.f28492id, new n2(3, this, chat)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.T;
        long j3 = this.f19997p1;
        y yVar = this.f20003v1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f28493id == j3) {
                yVar.d.f35323g3.O(true);
            }
        } else if (i7 == ks.f25276r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = mp.I8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(j3));
                this.f19998q1 = O0;
                yVar.f19986a.setTitle(n5.m(O0));
                yVar.h.f(this.f19998q1, yVar.f20106n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f19996o1.getCurrentPosition() > 0) {
            if (this.f19996o1.getCurrentPosition() == 2) {
                te.a aVar = this.n1;
                if (aVar.f57780f) {
                    this.f20005x1.d.f35322f3.h1(1, this.P1.f15979b);
                    aVar.a(false, true);
                    this.f30257r0 = true;
                    c10 c10Var = this.f20007z1;
                    org.telegram.messenger.g0.v1(c10Var.f33883r);
                    c10Var.f33883r.clearFocus();
                    return;
                }
            }
            this.f19996o1.C(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(u2 u2Var) {
        TLRPC.TL_forumTopic f10;
        if (u2Var.getMessage() != null && (f10 = mp.u1(this.f30223a).f25864t7.f(-u2Var.getDialogId(), fj.b2(this.f30223a, u2Var.getMessage().f24073k, true, false))) != null) {
            qg.c.n(this.f20002u1, -u2Var.getDialogId(), f10, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.K1;
        try {
            super.s0();
            int w02 = n6.w0(n6.f29394a7, this.J0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f30226b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void u(u2 u2Var) {
        if (mp.u1(this.f30223a).R1().K(u2Var.getDialogId())) {
            g2 g2Var = this.f20002u1;
            g2Var.getOrCreateStoryViewer().getClass();
            g2Var.getOrCreateStoryViewer().J(g2Var.getContext(), u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
        }
    }

    public c0(g2 g2Var, long j3, ArrayList arrayList, j5 j5Var) {
        super(g2Var.getContext(), g2Var.getResourceProvider(), true, true);
        kr krVar = kr.h;
        this.f19995m1 = new te.a(1, this, krVar, 350L, false);
        this.n1 = new te.a(2, this, krVar, 350L, false);
        this.E1 = new bg.d0(2);
        this.F1 = new bg.d0(8);
        Paint paint = new Paint(1);
        this.K1 = paint;
        i0.b bVar = i0.b.f15977e;
        this.O1 = bVar;
        this.P1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f20002u1 = g2Var;
        this.I1 = arrayList != null;
        this.L1 = arrayList;
        this.J1 = j5Var;
        Context context = g2Var.getContext();
        ks.f(this.f30223a).c(this, ks.T);
        ks.f(this.f30223a).c(this, ks.f25276r);
        int i7 = n6.f29394a7;
        paint.setColor(n6.w0(i7, this.J0));
        Q(i7);
        this.f30226b = new p8(this, context);
        q1 q1Var = new q1(2, context, this);
        this.f19996o1 = q1Var;
        int i10 = this.f30261u0;
        q1Var.setPadding(i10, 0, i10, 0);
        this.f30226b.addView(this.f19996o1, na.e(-1, -1, 119));
        this.C1 = new o3(8, context, this);
        this.D1 = new o3(8, context, this);
        c10 c10Var = new c10(context, this.J0);
        this.f20006y1 = c10Var;
        c10Var.setCloseButtonVisible(true);
        c10Var.f33887y = true;
        c10Var.updateColors();
        String N0 = gd.N0(2131745640, null);
        ah.i iVar = c10Var.f33883r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new v(this, 0));
        c10Var.setVisibility(8);
        c10 c10Var2 = new c10(context, this.J0);
        this.f20007z1 = c10Var2;
        c10Var2.setCloseButtonVisible(true);
        c10Var2.f33887y = true;
        c10Var2.updateColors();
        String N02 = gd.N0(2131745640, null);
        ah.i iVar2 = c10Var2.f33883r;
        iVar2.setHint(N02);
        iVar2.addTextChangedListener(new v(this, 1));
        c10Var2.setVisibility(8);
        g51 g51Var = new g51(context, this.f30223a, 0, false, new s(this, 0), new t(this, 0), null, this.J0);
        this.B1 = g51Var;
        g51Var.j(new v1(this, 24));
        g51Var.setClipToPadding(false);
        g51Var.setVisibility(8);
        g51Var.r1();
        g51Var.f35323g3.f33631r = false;
        g51Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.f24220m, 0, org.telegram.messenger.g0.f24221n);
        b00 b00Var = new b00(g2Var);
        this.A1 = b00Var;
        b00Var.setVisibility(8);
        b00Var.setBackground(null);
        b00Var.setChatPreviewDelegate(new pb.b(13));
        b00Var.setUiCallback(new h6.o(this, 12));
        b00Var.f45845b.setClipToPadding(false);
        this.G1 = new View(getContext());
        Context context2 = getContext();
        i6 i6Var = this.J0;
        j0 j0Var = new j0(context2, i6Var, new kc((FrameLayout) this.f30226b, i6Var), this.f30223a, j3);
        this.H1 = j0Var;
        j0Var.h = new jb.m(this, g2Var, false, 3);
        this.f19997p1 = j3;
        this.f19998q1 = mp.u1(this.f30223a).O0(Long.valueOf(j3));
        mp.u1(this.f30223a).P0(j3);
        TLRPC.Chat chat = this.f19998q1;
        this.f19999r1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(2131232695, 4, n5.u(chat));
        o0Var.f17702f = this.f19998q1;
        o0Var.h = false;
        ArrayList arrayList2 = c10Var.G;
        arrayList2.add(o0Var);
        c10Var.J = arrayList2.size() - 1;
        c10Var.e();
        v0(n6.w0(i7, this.J0));
        this.f20004w1 = new x(this, context, 1);
        this.f20003v1 = new y(this, context);
        this.f20005x1 = new x(this, context, 0);
        this.f19996o1.setAdapter(new w(this, 0));
        c10Var.setCloseButtonOnClickListener(new u(this, 0));
        c10Var2.setCloseButtonOnClickListener(new u(this, 1));
        j0Var.d();
        mp.u1(this.f30223a).b3(0, j3, true);
        fc.a((FrameLayout) this.f30226b, new bi.t(6));
        ViewGroup viewGroup = this.f30226b;
        t tVar = new t(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(viewGroup, tVar);
    }

    @Override
    public final void q() {
    }

    @Override
    public final void l(u2 u2Var) {
    }

    @Override
    public final void w(u2 u2Var) {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
