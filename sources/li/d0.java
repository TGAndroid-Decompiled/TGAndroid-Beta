package li;

import a8.m7;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.g5;
import bi.m3;
import bi.u1;
import c8.ma;
import fi.y6;
import hi.i1;
import hi.j9;
import hi.u7;
import hi.w4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
import org.telegram.ui.c00;
public final class d0 extends w2 implements gs, te.b, q2 {
    public static final int Q1 = 0;
    public final c00 A1;
    public final h51 B1;
    public final m3 C1;
    public final m3 D1;
    public final bg.d0 E1;
    public final bg.d0 F1;
    public final View G1;
    public final k0 H1;
    public final boolean I1;
    public final y10 J1;
    public final Paint K1;
    public ArrayList L1;
    public String M1;
    public String N1;
    public i0.b O1;
    public i0.b P1;
    public final te.a f19932m1;
    public final te.a n1;
    public final i1 f19933o1;
    public final long f19934p1;
    public TLRPC.Chat f19935q1;
    public boolean f19936r1;
    public hi.e f19937s1;
    public hi.e f19938t1;
    public final g2 f19939u1;
    public final z f19940v1;
    public final y f19941w1;
    public final y f19942x1;
    public final e10 f19943y1;
    public final e10 f19944z1;

    public d0(g2 g2Var, long j3) {
        this(g2Var, j3, null, null);
    }

    @Override
    public final boolean G() {
        if (!this.f19932m1.f57701f && !this.n1.f57701f) {
            View currentView = this.f19933o1.getCurrentView();
            if (currentView instanceof b0) {
                return ((b0) currentView).f19924e;
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
            z zVar = this.f19940v1;
            zVar.f19921a.setAlpha(a10);
            zVar.f19921a.setScaleX(T1);
            zVar.f19921a.setScaleY(T1);
            org.telegram.ui.ActionBar.k kVar = zVar.f19921a;
            int i20 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            kVar.setVisibility(i14);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            e10 e10Var = this.f19943y1;
            e10Var.setAlpha(f10);
            e10Var.setScaleX(T12);
            e10Var.setScaleY(T12);
            int i21 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            e10Var.setVisibility(i15);
            zVar.d.setAlpha(a10);
            h51 h51Var = zVar.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            h51Var.setVisibility(i16);
            this.f19937s1.setAlpha(a10);
            this.f19937s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.f19937s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            hi.e eVar = this.f19937s1;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            eVar.setVisibility(i17);
            c00 c00Var = this.A1;
            c00Var.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            c00Var.setVisibility(i18);
            this.f30176b.invalidate();
            this.C1.invalidate();
        }
        if (i7 == 2) {
            float a11 = m7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            y yVar = this.f19942x1;
            yVar.f19921a.setAlpha(a11);
            yVar.f19921a.setScaleX(T13);
            yVar.f19921a.setScaleY(T13);
            org.telegram.ui.ActionBar.k kVar2 = yVar.f19921a;
            int i22 = (a11 > 0.0f ? 1 : (a11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar2.setVisibility(i10);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            e10 e10Var2 = this.f19944z1;
            e10Var2.setAlpha(f10);
            e10Var2.setScaleX(T14);
            e10Var2.setScaleY(T14);
            int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            e10Var2.setVisibility(i11);
            yVar.d.setAlpha(a11);
            h51 h51Var2 = yVar.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            h51Var2.setVisibility(i12);
            if (!this.I1) {
                this.f19938t1.setAlpha(a11);
                this.f19938t1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.f19938t1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                hi.e eVar2 = this.f19938t1;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                eVar2.setVisibility(i13);
            }
            h51 h51Var3 = this.B1;
            h51Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            h51Var3.setVisibility(i19);
            this.f30176b.invalidate();
            this.D1.invalidate();
        }
    }

    public final boolean J0(o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f21049a;
            TLRPC.Chat O0 = np.u1(this.f30173a).O0(Long.valueOf(-j3));
            TLRPC.User c22 = np.u1(this.f30173a).c2(Long.valueOf(j3));
            g2 g2Var = this.f19939u1;
            if (c22 != null) {
                g2Var.presentFragment(bn.ua(c22.f28583id));
                return true;
            } else if (!v3.t0(O0) && !v3.j0(O0)) {
                new ni.b(getContext(), O0, new ji.i(19, this, fVar)).show();
                return true;
            } else {
                g2Var.presentFragment(bn.ua(-O0.f28434id));
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
            arrayList.add(o41.E(99, (int) (org.telegram.messenger.g0.f24046q.y * 0.35f)));
            arrayList.add(o41.E(0, org.telegram.messenger.g0.L(56.0f)));
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
                        arrayList.add(o41.w(chat));
                    }
                } else {
                    arrayList.add(o41.w(chat));
                }
            }
        }
    }

    @Override
    public final void L() {
        ls.f(this.f30173a).n(this, ls.T);
        ls.f(this.f30173a).n(this, ls.f25371r);
        super.L();
    }

    public final void L0(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f28434id;
        boolean V = v3.V(chat);
        if (!v3.T(chat)) {
            t1 t1Var = new t1(3, getContext(), null);
            t1Var.r(250L);
            np.u1(this.f30173a).T(getContext(), -j10, null, new e(this, t1Var, j3, z10, 1), null);
            return;
        }
        np.u1(this.f30173a).W2(j10, j3, false, z10, new j9(this, V, 1));
    }

    public final void M0(o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.I1) {
                this.J1.a(chat);
                dismiss();
                return;
            }
            new ni.a(getContext(), this.f19935q1, -chat.f28434id, new d(2, this, chat)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.T;
        long j3 = this.f19934p1;
        z zVar = this.f19940v1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f28435id == j3) {
                zVar.d.f35790g3.O(true);
            }
        } else if (i7 == ls.f25371r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = np.I8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat O0 = np.u1(this.f30173a).O0(Long.valueOf(j3));
                this.f19935q1 = O0;
                zVar.f19921a.setTitle(n5.m(O0));
                zVar.h.f(this.f19935q1, zVar.f20043n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f19933o1.getCurrentPosition() > 0) {
            if (this.f19933o1.getCurrentPosition() == 2) {
                te.a aVar = this.n1;
                if (aVar.f57701f) {
                    this.f19942x1.d.f35789f3.h1(1, this.P1.f15918b);
                    aVar.a(false, true);
                    this.f30207r0 = true;
                    e10 e10Var = this.f19944z1;
                    org.telegram.messenger.g0.v1(e10Var.f34642r);
                    e10Var.f34642r.clearFocus();
                    return;
                }
            }
            this.f19933o1.A(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(u2 u2Var) {
        TLRPC.TL_forumTopic f10;
        if (u2Var.getMessage() != null && (f10 = np.u1(this.f30173a).f25968t7.f(-u2Var.getDialogId(), gj.b2(this.f30173a, u2Var.getMessage().f24213k, true, false))) != null) {
            qg.c.n(this.f19939u1, -u2Var.getDialogId(), f10, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.K1;
        try {
            super.s0();
            int w02 = m6.w0(m6.f29324a7, this.J0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f30176b;
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
        if (np.u1(this.f30173a).R1().K(u2Var.getDialogId())) {
            g2 g2Var = this.f19939u1;
            g2Var.getOrCreateStoryViewer().getClass();
            g2Var.getOrCreateStoryViewer().J(g2Var.getContext(), u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
        }
    }

    public d0(g2 g2Var, long j3, ArrayList arrayList, g5 g5Var) {
        super(g2Var.getContext(), g2Var.getResourceProvider(), true, true);
        nr nrVar = nr.h;
        this.f19932m1 = new te.a(1, this, nrVar, 350L, false);
        this.n1 = new te.a(2, this, nrVar, 350L, false);
        this.E1 = new bg.d0(2);
        this.F1 = new bg.d0(8);
        Paint paint = new Paint(1);
        this.K1 = paint;
        i0.b bVar = i0.b.f15916e;
        this.O1 = bVar;
        this.P1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f19939u1 = g2Var;
        this.I1 = arrayList != null;
        this.L1 = arrayList;
        this.J1 = g5Var;
        Context context = g2Var.getContext();
        ls.f(this.f30173a).c(this, ls.T);
        ls.f(this.f30173a).c(this, ls.f25371r);
        int i7 = m6.f29324a7;
        paint.setColor(m6.w0(i7, this.J0));
        Q(i7);
        this.f30176b = new u7(this, context);
        i1 i1Var = new i1(2, context, this);
        this.f19933o1 = i1Var;
        int i10 = this.f30211u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.f30176b.addView(this.f19933o1, ma.e(-1, -1, 119));
        this.C1 = new m3(8, context, this);
        this.D1 = new m3(8, context, this);
        e10 e10Var = new e10(context, this.J0);
        this.f19943y1 = e10Var;
        e10Var.setCloseButtonVisible(true);
        e10Var.f34646y = true;
        e10Var.updateColors();
        String N0 = hd.N0(2131745640, null);
        ah.i iVar = e10Var.f34642r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new w(this, 0));
        e10Var.setVisibility(8);
        e10 e10Var2 = new e10(context, this.J0);
        this.f19944z1 = e10Var2;
        e10Var2.setCloseButtonVisible(true);
        e10Var2.f34646y = true;
        e10Var2.updateColors();
        String N02 = hd.N0(2131745640, null);
        ah.i iVar2 = e10Var2.f34642r;
        iVar2.setHint(N02);
        iVar2.addTextChangedListener(new w(this, 1));
        e10Var2.setVisibility(8);
        h51 h51Var = new h51(context, this.f30173a, 0, false, new t(this, 0), new u(this, 0), null, this.J0);
        this.B1 = h51Var;
        h51Var.j(new u1(this, 24));
        h51Var.setClipToPadding(false);
        h51Var.setVisibility(8);
        h51Var.r1();
        h51Var.f35790g3.f34062r = false;
        h51Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.f24040m, 0, org.telegram.messenger.g0.f24041n);
        c00 c00Var = new c00(g2Var);
        this.A1 = c00Var;
        c00Var.setVisibility(8);
        c00Var.setBackground(null);
        c00Var.setChatPreviewDelegate(new pb.b(13));
        c00Var.setUiCallback(new w4(this, 10));
        c00Var.f46348b.setClipToPadding(false);
        this.G1 = new View(getContext());
        Context context2 = getContext();
        h6 h6Var = this.J0;
        k0 k0Var = new k0(context2, h6Var, new lc((FrameLayout) this.f30176b, h6Var), this.f30173a, j3);
        this.H1 = k0Var;
        k0Var.h = new k8.a(2, this, g2Var);
        this.f19934p1 = j3;
        this.f19935q1 = np.u1(this.f30173a).O0(Long.valueOf(j3));
        np.u1(this.f30173a).P0(j3);
        TLRPC.Chat chat = this.f19935q1;
        this.f19936r1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(2131232692, 4, n5.u(chat));
        o0Var.f17634f = this.f19935q1;
        o0Var.h = false;
        ArrayList arrayList2 = e10Var.G;
        arrayList2.add(o0Var);
        e10Var.J = arrayList2.size() - 1;
        e10Var.e();
        v0(m6.w0(i7, this.J0));
        this.f19941w1 = new y(this, context, 1);
        this.f19940v1 = new z(this, context);
        this.f19942x1 = new y(this, context, 0);
        this.f19933o1.setAdapter(new x(this, 0));
        e10Var.setCloseButtonOnClickListener(new v(this, 0));
        e10Var2.setCloseButtonOnClickListener(new v(this, 1));
        k0Var.d();
        np.u1(this.f30173a).b3(0, j3, true);
        gc.a((FrameLayout) this.f30176b, new bi.t(6));
        ViewGroup viewGroup = this.f30176b;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56289a;
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
