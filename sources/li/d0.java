package li;

import a8.m7;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.o2;
import bi.w2;
import bi.z4;
import c8.ja;
import fi.b7;
import hi.i1;
import hi.j9;
import hi.v7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import kg.t1;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
import org.telegram.ui.zz;
public final class d0 extends u2 implements is, te.b, p2 {
    public static final int Q1 = 0;
    public final zz A1;
    public final u41 B1;
    public final o2 C1;
    public final o2 D1;
    public final bg.c0 E1;
    public final bg.c0 F1;
    public final View G1;
    public final k0 H1;
    public final boolean I1;
    public final z10 J1;
    public final Paint K1;
    public ArrayList L1;
    public String M1;
    public String N1;
    public i0.c O1;
    public i0.c P1;
    public final te.a f19540m1;
    public final te.a n1;
    public final i1 f19541o1;
    public final long f19542p1;
    public TLRPC.Chat f19543q1;
    public boolean f19544r1;
    public hi.d f19545s1;
    public hi.d f19546t1;
    public final e2 f19547u1;
    public final z f19548v1;
    public final y f19549w1;
    public final y f19550x1;
    public final v00 f19551y1;
    public final v00 f19552z1;

    public d0(e2 e2Var, long j3) {
        this(e2Var, j3, null, null);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
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
            z zVar = this.f19548v1;
            zVar.f19526a.setAlpha(a10);
            zVar.f19526a.setScaleX(T1);
            zVar.f19526a.setScaleY(T1);
            org.telegram.ui.ActionBar.k kVar = zVar.f19526a;
            int i20 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            kVar.setVisibility(i14);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            v00 v00Var = this.f19551y1;
            v00Var.setAlpha(f10);
            v00Var.setScaleX(T12);
            v00Var.setScaleY(T12);
            int i21 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            v00Var.setVisibility(i15);
            zVar.d.setAlpha(a10);
            u41 u41Var = zVar.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            u41Var.setVisibility(i16);
            this.f19545s1.setAlpha(a10);
            this.f19545s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.f19545s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            hi.d dVar = this.f19545s1;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            dVar.setVisibility(i17);
            zz zzVar = this.A1;
            zzVar.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            zzVar.setVisibility(i18);
            this.f29682b.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 2) {
            float a11 = m7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            y yVar = this.f19550x1;
            yVar.f19526a.setAlpha(a11);
            yVar.f19526a.setScaleX(T13);
            yVar.f19526a.setScaleY(T13);
            org.telegram.ui.ActionBar.k kVar2 = yVar.f19526a;
            int i22 = (a11 > 0.0f ? 1 : (a11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar2.setVisibility(i10);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            v00 v00Var2 = this.f19552z1;
            v00Var2.setAlpha(f10);
            v00Var2.setScaleX(T14);
            v00Var2.setScaleY(T14);
            int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            v00Var2.setVisibility(i11);
            yVar.d.setAlpha(a11);
            u41 u41Var2 = yVar.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            u41Var2.setVisibility(i12);
            if (!this.I1) {
                this.f19546t1.setAlpha(a11);
                this.f19546t1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.f19546t1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                hi.d dVar2 = this.f19546t1;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar2.setVisibility(i13);
            }
            u41 u41Var3 = this.B1;
            u41Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            u41Var3.setVisibility(i19);
            this.f29682b.invalidate();
            this.D1.invalidate();
        }
    }

    @Override
    public final boolean H() {
        if (!this.f19540m1.f57086f && !this.n1.f57086f) {
            View currentView = this.f19541o1.getCurrentView();
            if (currentView instanceof b0) {
                return ((b0) currentView).f19529e;
            }
            return true;
        }
        return false;
    }

    public final boolean I0(b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f20657a;
            TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
            TLRPC.User a22 = np.s1(this.f29679a).a2(Long.valueOf(j3));
            e2 e2Var = this.f19547u1;
            if (a22 != null) {
                e2Var.presentFragment(an.ua(a22.f28200id));
                return true;
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new ni.b(getContext(), M0, new t1(14, this, fVar)).show();
                return true;
            } else {
                e2Var.presentFragment(an.ua(-M0.f28051id));
                return true;
            }
        }
        return false;
    }

    public final void J0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i7 = 0;
        if (!z10) {
            arrayList.add(b41.E(99, (int) (org.telegram.messenger.g0.f23611q.y * 0.35f)));
            arrayList.add(b41.E(0, org.telegram.messenger.g0.L(56.0f)));
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
                        arrayList.add(b41.w(chat));
                    }
                } else {
                    arrayList.add(b41.w(chat));
                }
            }
        }
    }

    public final void K0(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f28051id;
        boolean V = t3.V(chat);
        if (!t3.T(chat)) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(250L);
            np.s1(this.f29679a).T(getContext(), -j10, null, new c(this, t1Var, j3, z10, 1), null);
            return;
        }
        np.s1(this.f29679a).Q2(j10, j3, false, z10, new j9(1, this, V));
    }

    @Override
    public final void L() {
        ns.f(this.f29679a).n(this, ns.T);
        ns.f(this.f29679a).n(this, ns.f25560r);
        super.L();
    }

    public final void L0(b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.I1) {
                this.J1.a(chat);
                dismiss();
                return;
            }
            new ni.a(getContext(), this.f19543q1, -chat.f28051id, new v(0, this, chat)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.T;
        long j3 = this.f19542p1;
        z zVar = this.f19548v1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f28052id == j3) {
                zVar.d.f39892g3.O(true);
            }
        } else if (i7 == ns.f25560r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = np.D8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(j3));
                this.f19543q1 = M0;
                zVar.f19526a.setTitle(m5.m(M0));
                zVar.h.f(this.f19543q1, zVar.f19648n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f19541o1.getCurrentPosition() > 0) {
            if (this.f19541o1.getCurrentPosition() == 2) {
                te.a aVar = this.n1;
                if (aVar.f57086f) {
                    this.f19550x1.d.f39891f3.h1(1, this.P1.f15575b);
                    aVar.a(false, true);
                    this.f29713r0 = true;
                    v00 v00Var = this.f19552z1;
                    org.telegram.messenger.g0.v1(v00Var.f40202r);
                    v00Var.f40202r.clearFocus();
                    return;
                }
            }
            this.f19541o1.C(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(t2 t2Var) {
        TLRPC.TL_forumTopic f10;
        if (t2Var.getMessage() != null && (f10 = np.s1(this.f29679a).f25386r7.f(-t2Var.getDialogId(), gj.b2(this.f29679a, t2Var.getMessage().f23819k, true, false))) != null) {
            qg.c.m(this.f19547u1, -t2Var.getDialogId(), f10, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.K1;
        try {
            super.s0();
            int w02 = j6.w0(j6.f28792a7, this.J0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f29682b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void u(t2 t2Var) {
        if (np.s1(this.f29679a).P1().K(t2Var.getDialogId())) {
            e2 e2Var = this.f19547u1;
            e2Var.getOrCreateStoryViewer().getClass();
            e2Var.getOrCreateStoryViewer().J(e2Var.getContext(), t2Var.getDialogId(), b7.a((uj0) t2Var.getParent()));
        }
    }

    public d0(e2 e2Var, long j3, ArrayList arrayList, w2 w2Var) {
        super(e2Var.getContext(), e2Var.getResourceProvider(), true, true);
        er erVar = er.h;
        this.f19540m1 = new te.a(1, this, erVar, 350L, false);
        this.n1 = new te.a(2, this, erVar, 350L, false);
        this.E1 = new bg.c0(2);
        this.F1 = new bg.c0(8);
        Paint paint = new Paint(1);
        this.K1 = paint;
        i0.c cVar = i0.c.f15573e;
        this.O1 = cVar;
        this.P1 = cVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f19547u1 = e2Var;
        this.I1 = arrayList != null;
        this.L1 = arrayList;
        this.J1 = w2Var;
        Context context = e2Var.getContext();
        ns.f(this.f29679a).c(this, ns.T);
        ns.f(this.f29679a).c(this, ns.f25560r);
        int i7 = j6.f28792a7;
        paint.setColor(j6.w0(i7, this.J0));
        Q(i7);
        this.f29682b = new v7(this, context);
        i1 i1Var = new i1(2, context, this);
        this.f19541o1 = i1Var;
        int i10 = this.f29717u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.f29682b.addView(this.f19541o1, ja.e(-1, -1, 119));
        this.C1 = new o2(8, context, this);
        this.D1 = new o2(8, context, this);
        v00 v00Var = new v00(context, this.J0);
        this.f19551y1 = v00Var;
        v00Var.setCloseButtonVisible(true);
        v00Var.f40206y = true;
        v00Var.updateColors();
        String M0 = hd.M0(2131745836, null);
        ah.i iVar = v00Var.f40202r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new w(this, 0));
        v00Var.setVisibility(8);
        v00 v00Var2 = new v00(context, this.J0);
        this.f19552z1 = v00Var2;
        v00Var2.setCloseButtonVisible(true);
        v00Var2.f40206y = true;
        v00Var2.updateColors();
        String M02 = hd.M0(2131745836, null);
        ah.i iVar2 = v00Var2.f40202r;
        iVar2.setHint(M02);
        iVar2.addTextChangedListener(new w(this, 1));
        v00Var2.setVisibility(8);
        u41 u41Var = new u41(context, this.f29679a, 0, false, new s(this, 0), new t(this, 0), null, this.J0);
        this.B1 = u41Var;
        u41Var.j(new z4(this, 23));
        u41Var.setClipToPadding(false);
        u41Var.setVisibility(8);
        u41Var.r1();
        u41Var.f39892g3.f38199r = false;
        u41Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.f23605m, 0, org.telegram.messenger.g0.f23606n);
        zz zzVar = new zz(e2Var);
        this.A1 = zzVar;
        zzVar.setVisibility(8);
        zzVar.setBackground(null);
        zzVar.setChatPreviewDelegate(new pb.b(13));
        zzVar.setUiCallback(new gc.b(this, 15));
        zzVar.f54075b.setClipToPadding(false);
        this.G1 = new View(getContext());
        Context context2 = getContext();
        e6 e6Var = this.J0;
        k0 k0Var = new k0(context2, e6Var, new cc((FrameLayout) this.f29682b, e6Var), this.f29679a, j3);
        this.H1 = k0Var;
        k0Var.h = new k8.a(2, this, e2Var);
        this.f19542p1 = j3;
        this.f19543q1 = np.s1(this.f29679a).M0(Long.valueOf(j3));
        np.s1(this.f29679a).N0(j3);
        TLRPC.Chat chat = this.f19543q1;
        this.f19544r1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(2131232691, 4, m5.u(chat));
        o0Var.f17223f = this.f19543q1;
        o0Var.h = false;
        ArrayList arrayList2 = v00Var.G;
        arrayList2.add(o0Var);
        v00Var.J = arrayList2.size() - 1;
        v00Var.e();
        v0(j6.w0(i7, this.J0));
        this.f19549w1 = new y(this, context, 1);
        this.f19548v1 = new z(this, context);
        this.f19550x1 = new y(this, context, 0);
        this.f19541o1.setAdapter(new x(this, 0));
        v00Var.setCloseButtonOnClickListener(new u(this, 0));
        v00Var2.setCloseButtonOnClickListener(new u(this, 1));
        k0Var.d();
        np.s1(this.f29679a).V2(0, j3, true);
        xb.a((FrameLayout) this.f29682b, new bi.t(6));
        ViewGroup viewGroup = this.f29682b;
        t tVar = new t(this, 1);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(viewGroup, tVar);
    }

    @Override
    public final void q() {
    }

    @Override
    public final void l(t2 t2Var) {
    }

    @Override
    public final void w(t2 t2Var) {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
