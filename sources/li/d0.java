package li;

import a8.m7;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.d5;
import bi.i3;
import bi.q1;
import c8.ma;
import fi.y6;
import hi.i1;
import hi.k9;
import hi.v7;
import hi.w4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.bn;
import org.telegram.ui.c00;
public final class d0 extends x2 implements fs, te.b, q2 {
    public static final int Q1 = 0;
    public final c00 A1;
    public final e51 B1;
    public final i3 C1;
    public final i3 D1;
    public final bg.d0 E1;
    public final bg.d0 F1;
    public final View G1;
    public final k0 H1;
    public final boolean I1;
    public final x10 J1;
    public final Paint K1;
    public ArrayList L1;
    public String M1;
    public String N1;
    public i0.b O1;
    public i0.b P1;
    public final te.a f19901m1;
    public final te.a n1;
    public final i1 f19902o1;
    public final long f19903p1;
    public TLRPC.Chat f19904q1;
    public boolean f19905r1;
    public hi.d f19906s1;
    public hi.d f19907t1;
    public final h2 f19908u1;
    public final z f19909v1;
    public final y f19910w1;
    public final y f19911x1;
    public final c10 f19912y1;
    public final c10 f19913z1;

    public d0(h2 h2Var, long j3) {
        this(h2Var, j3, null, null);
    }

    @Override
    public final boolean G() {
        if (!this.f19901m1.f57658f && !this.n1.f57658f) {
            View currentView = this.f19902o1.getCurrentView();
            if (currentView instanceof b0) {
                return ((b0) currentView).f19893e;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
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
            float a10 = m7.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            z zVar = this.f19909v1;
            zVar.f19890a.setAlpha(a10);
            zVar.f19890a.setScaleX(T1);
            zVar.f19890a.setScaleY(T1);
            org.telegram.ui.ActionBar.k kVar = zVar.f19890a;
            int i20 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            kVar.setVisibility(i14);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            c10 c10Var = this.f19912y1;
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
            zVar.d.setAlpha(a10);
            e51 e51Var = zVar.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            e51Var.setVisibility(i16);
            this.f19906s1.setAlpha(a10);
            this.f19906s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.f19906s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            hi.d dVar = this.f19906s1;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            dVar.setVisibility(i17);
            c00 c00Var = this.A1;
            c00Var.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            c00Var.setVisibility(i18);
            this.f30190b.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 2) {
            float a11 = m7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            y yVar = this.f19911x1;
            yVar.f19890a.setAlpha(a11);
            yVar.f19890a.setScaleX(T13);
            yVar.f19890a.setScaleY(T13);
            org.telegram.ui.ActionBar.k kVar2 = yVar.f19890a;
            int i22 = (a11 > 0.0f ? 1 : (a11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar2.setVisibility(i10);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            c10 c10Var2 = this.f19913z1;
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
            yVar.d.setAlpha(a11);
            e51 e51Var2 = yVar.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            e51Var2.setVisibility(i12);
            if (!this.I1) {
                this.f19907t1.setAlpha(a11);
                this.f19907t1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.f19907t1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                hi.d dVar2 = this.f19907t1;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar2.setVisibility(i13);
            }
            e51 e51Var3 = this.B1;
            e51Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            e51Var3.setVisibility(i19);
            this.f30190b.invalidate();
            this.D1.invalidate();
        }
    }

    public final boolean J0(l41 l41Var) {
        Object obj = l41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f21018a;
            TLRPC.Chat O0 = mp.u1(this.f30187a).O0(Long.valueOf(-j3));
            TLRPC.User c22 = mp.u1(this.f30187a).c2(Long.valueOf(j3));
            h2 h2Var = this.f19908u1;
            if (c22 != null) {
                h2Var.presentFragment(bn.ua(c22.f28552id));
                return true;
            } else if (!v3.t0(O0) && !v3.j0(O0)) {
                new ni.c(getContext(), O0, new kg.h0(17, this, fVar)).show();
                return true;
            } else {
                h2Var.presentFragment(bn.ua(-O0.f28403id));
                return true;
            }
        }
        return false;
    }

    public final void K0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i7 = 0;
        if (!z10) {
            arrayList.add(l41.E(99, (int) (org.telegram.messenger.g0.f24118q.y * 0.35f)));
            arrayList.add(l41.E(0, org.telegram.messenger.g0.L(56.0f)));
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
                        arrayList.add(l41.w(chat));
                    }
                } else {
                    arrayList.add(l41.w(chat));
                }
            }
        }
    }

    @Override
    public final void L() {
        ks.f(this.f30187a).n(this, ks.T);
        ks.f(this.f30187a).n(this, ks.f25177r);
        super.L();
    }

    public final void L0(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f28403id;
        boolean V = v3.V(chat);
        if (!v3.T(chat)) {
            u1 u1Var = new u1(3, getContext(), null);
            u1Var.r(250L);
            mp.u1(this.f30187a).T(getContext(), -j10, null, new e(this, u1Var, j3, z10, 1), null);
            return;
        }
        mp.u1(this.f30187a).W2(j10, j3, false, z10, new k9(this, V, 1));
    }

    public final void M0(l41 l41Var) {
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.I1) {
                this.J1.a(chat);
                dismiss();
                return;
            }
            new ni.a(getContext(), this.f19904q1, -chat.f28403id, new d(2, this, chat)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.T;
        long j3 = this.f19903p1;
        z zVar = this.f19909v1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f28404id == j3) {
                zVar.d.f34607g3.O(true);
            }
        } else if (i7 == ks.f25177r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = mp.I8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat O0 = mp.u1(this.f30187a).O0(Long.valueOf(j3));
                this.f19904q1 = O0;
                zVar.f19890a.setTitle(n5.m(O0));
                zVar.h.f(this.f19904q1, zVar.f20012n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f19902o1.getCurrentPosition() > 0) {
            if (this.f19902o1.getCurrentPosition() == 2) {
                te.a aVar = this.n1;
                if (aVar.f57658f) {
                    this.f19911x1.d.f34606f3.h1(1, this.P1.f15890b);
                    aVar.a(false, true);
                    this.f30221r0 = true;
                    c10 c10Var = this.f19913z1;
                    org.telegram.messenger.g0.v1(c10Var.f33845r);
                    c10Var.f33845r.clearFocus();
                    return;
                }
            }
            this.f19902o1.A(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(u2 u2Var) {
        TLRPC.TL_forumTopic f10;
        if (u2Var.getMessage() != null && (f10 = mp.u1(this.f30187a).f25769t7.f(-u2Var.getDialogId(), fj.b2(this.f30187a, u2Var.getMessage().f23965k, true, false))) != null) {
            qg.c.n(this.f19908u1, -u2Var.getDialogId(), f10, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.K1;
        try {
            super.s0();
            int w02 = n6.w0(n6.f29337a7, this.J0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f30190b;
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
        if (mp.u1(this.f30187a).R1().K(u2Var.getDialogId())) {
            h2 h2Var = this.f19908u1;
            h2Var.getOrCreateStoryViewer().getClass();
            h2Var.getOrCreateStoryViewer().J(h2Var.getContext(), u2Var.getDialogId(), y6.a((ck0) u2Var.getParent()));
        }
    }

    public d0(h2 h2Var, long j3, ArrayList arrayList, d5 d5Var) {
        super(h2Var.getContext(), h2Var.getResourceProvider(), true, true);
        lr lrVar = lr.h;
        this.f19901m1 = new te.a(1, this, lrVar, 350L, false);
        this.n1 = new te.a(2, this, lrVar, 350L, false);
        this.E1 = new bg.d0(2);
        this.F1 = new bg.d0(8);
        Paint paint = new Paint(1);
        this.K1 = paint;
        i0.b bVar = i0.b.f15888e;
        this.O1 = bVar;
        this.P1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f19908u1 = h2Var;
        this.I1 = arrayList != null;
        this.L1 = arrayList;
        this.J1 = d5Var;
        Context context = h2Var.getContext();
        ks.f(this.f30187a).c(this, ks.T);
        ks.f(this.f30187a).c(this, ks.f25177r);
        int i7 = n6.f29337a7;
        paint.setColor(n6.w0(i7, this.J0));
        Q(i7);
        this.f30190b = new v7(this, context);
        i1 i1Var = new i1(2, context, this);
        this.f19902o1 = i1Var;
        int i10 = this.f30225u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.f30190b.addView(this.f19902o1, ma.e(-1, -1, 119));
        this.C1 = new i3(8, context, this);
        this.D1 = new i3(8, context, this);
        c10 c10Var = new c10(context, this.J0);
        this.f19912y1 = c10Var;
        c10Var.setCloseButtonVisible(true);
        c10Var.f33849y = true;
        c10Var.updateColors();
        String M0 = gd.M0(2131745641, null);
        ah.i iVar = c10Var.f33845r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new w(this, 0));
        c10Var.setVisibility(8);
        c10 c10Var2 = new c10(context, this.J0);
        this.f19913z1 = c10Var2;
        c10Var2.setCloseButtonVisible(true);
        c10Var2.f33849y = true;
        c10Var2.updateColors();
        String M02 = gd.M0(2131745641, null);
        ah.i iVar2 = c10Var2.f33845r;
        iVar2.setHint(M02);
        iVar2.addTextChangedListener(new w(this, 1));
        c10Var2.setVisibility(8);
        e51 e51Var = new e51(context, this.f30187a, 0, false, new t(this, 0), new u(this, 0), null, this.J0);
        this.B1 = e51Var;
        e51Var.j(new q1(this, 24));
        e51Var.setClipToPadding(false);
        e51Var.setVisibility(8);
        e51Var.r1();
        e51Var.f34607g3.f42809r = false;
        e51Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.f24112m, 0, org.telegram.messenger.g0.f24113n);
        c00 c00Var = new c00(h2Var);
        this.A1 = c00Var;
        c00Var.setVisibility(8);
        c00Var.setBackground(null);
        c00Var.setChatPreviewDelegate(new pb.b(13));
        c00Var.setUiCallback(new w4(this, 10));
        c00Var.f46322b.setClipToPadding(false);
        this.G1 = new View(getContext());
        Context context2 = getContext();
        i6 i6Var = this.J0;
        k0 k0Var = new k0(context2, i6Var, new lc((FrameLayout) this.f30190b, i6Var), this.f30187a, j3);
        this.H1 = k0Var;
        k0Var.h = new k8.a(2, this, h2Var);
        this.f19903p1 = j3;
        this.f19904q1 = mp.u1(this.f30187a).O0(Long.valueOf(j3));
        mp.u1(this.f30187a).P0(j3);
        TLRPC.Chat chat = this.f19904q1;
        this.f19905r1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(2131232692, 4, n5.u(chat));
        o0Var.f17606f = this.f19904q1;
        o0Var.h = false;
        ArrayList arrayList2 = c10Var.G;
        arrayList2.add(o0Var);
        c10Var.J = arrayList2.size() - 1;
        c10Var.e();
        v0(n6.w0(i7, this.J0));
        this.f19910w1 = new y(this, context, 1);
        this.f19909v1 = new z(this, context);
        this.f19911x1 = new y(this, context, 0);
        this.f19902o1.setAdapter(new x(this, 0));
        c10Var.setCloseButtonOnClickListener(new v(this, 0));
        c10Var2.setCloseButtonOnClickListener(new v(this, 1));
        k0Var.d();
        mp.u1(this.f30187a).b3(0, j3, true);
        gc.a((FrameLayout) this.f30190b, new bi.t(6));
        ViewGroup viewGroup = this.f30190b;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(viewGroup, uVar);
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
    public final void D(float f10, int i7) {
    }
}
