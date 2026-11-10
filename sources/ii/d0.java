package ii;

import a8.j7;
import ai.f1;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.ec;
import c8.ha;
import di.i7;
import fi.g1;
import fi.l9;
import fi.r7;
import fi.x7;
import hi.d4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o0;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.b00;
import org.telegram.ui.cn;
public final class d0 extends w2 implements ls, te.b, p2 {
    public static final int P1 = 0;
    public final r41 A1;
    public final ec B1;
    public final ec C1;
    public final bg.c0 D1;
    public final bg.c0 E1;
    public final View F1;
    public final l0 G1;
    public final boolean H1;
    public final c20 I1;
    public final Paint J1;
    public ArrayList K1;
    public String L1;
    public String M1;
    public i0.b N1;
    public i0.b O1;
    public final te.a l1;
    public final te.a f15505m1;
    public final g1 n1;
    public final long f15506o1;
    public TLRPC.Chat f15507p1;
    public boolean f15508q1;
    public fi.d f15509r1;
    public fi.d f15510s1;
    public final f2 f15511t1;
    public final z f15512u1;
    public final y f15513v1;
    public final y f15514w1;
    public final r00 f15515x1;
    public final r00 f15516y1;
    public final b00 f15517z1;

    public d0(f2 f2Var, long j3) {
        this(f2Var, j3, null, null);
    }

    @Override
    public final boolean G() {
        if (!this.l1.f55499f && !this.f15505m1.f55499f) {
            View currentView = this.n1.getCurrentView();
            if (currentView instanceof b0) {
                return ((b0) currentView).f15495e;
            }
            return true;
        }
        return false;
    }

    public final boolean I0(x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j3 = fVar.f17083a;
            TLRPC.Chat M0 = qp.s1(this.f28669a).M0(Long.valueOf(-j3));
            TLRPC.User a22 = qp.s1(this.f28669a).a2(Long.valueOf(j3));
            f2 f2Var = this.f15511t1;
            if (a22 != null) {
                f2Var.presentFragment(cn.ta(a22.f27109id));
                return true;
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new ki.b(getContext(), M0, new ha.b(10, this, fVar)).show();
                return true;
            } else {
                f2Var.presentFragment(cn.ta(-M0.f26960id));
                return true;
            }
        }
        return false;
    }

    public final void J0(ArrayList arrayList, boolean z9) {
        String str;
        String str2;
        int i7 = 0;
        if (!z9) {
            arrayList.add(x31.E(99, (int) (org.telegram.messenger.g0.f22567q.y * 0.35f)));
            arrayList.add(x31.E(0, org.telegram.messenger.g0.L(56.0f)));
        }
        if (this.K1 != null) {
            if (z9 && (str2 = this.M1) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.K1;
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z9 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(x31.w(chat));
                    }
                } else {
                    arrayList.add(x31.w(chat));
                }
            }
        }
    }

    @Override
    public final void K() {
        qs.f(this.f28669a).n(this, qs.T);
        qs.f(this.f28669a).n(this, qs.f25067r);
        super.K();
    }

    public final void K0(TLRPC.Chat chat, long j3, boolean z9) {
        long j10 = -chat.f26960id;
        boolean V = t3.V(chat);
        if (!t3.T(chat)) {
            u1 u1Var = new u1(3, getContext(), null);
            u1Var.r(250L);
            qp.s1(this.f28669a).T(getContext(), -j10, null, new d(this, u1Var, j3, z9, 1), null);
            return;
        }
        qp.s1(this.f28669a).Q2(j10, j3, false, z9, new l9(1, this, V));
    }

    public final void L0(x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.H1) {
                this.I1.a(chat);
                dismiss();
                return;
            }
            new ki.a(getContext(), this.f15507p1, -chat.f26960id, new f1(22, this, chat)).show();
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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
            float a10 = j7.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            z zVar = this.f15512u1;
            zVar.f15492a.setAlpha(a10);
            zVar.f15492a.setScaleX(T1);
            zVar.f15492a.setScaleY(T1);
            org.telegram.ui.ActionBar.l lVar = zVar.f15492a;
            int i20 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            lVar.setVisibility(i14);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            r00 r00Var = this.f15515x1;
            r00Var.setAlpha(f10);
            r00Var.setScaleX(T12);
            r00Var.setScaleY(T12);
            int i21 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            r00Var.setVisibility(i15);
            zVar.d.setAlpha(a10);
            r41 r41Var = zVar.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            r41Var.setVisibility(i16);
            this.f15509r1.setAlpha(a10);
            this.f15509r1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.f15509r1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            fi.d dVar = this.f15509r1;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            dVar.setVisibility(i17);
            b00 b00Var = this.f15517z1;
            b00Var.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            b00Var.setVisibility(i18);
            this.f28672b.invalidate();
            this.B1.invalidate();
        }
        if (i7 == 2) {
            float a11 = j7.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            y yVar = this.f15514w1;
            yVar.f15492a.setAlpha(a11);
            yVar.f15492a.setScaleX(T13);
            yVar.f15492a.setScaleY(T13);
            org.telegram.ui.ActionBar.l lVar2 = yVar.f15492a;
            int i22 = (a11 > 0.0f ? 1 : (a11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            lVar2.setVisibility(i10);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            r00 r00Var2 = this.f15516y1;
            r00Var2.setAlpha(f10);
            r00Var2.setScaleX(T14);
            r00Var2.setScaleY(T14);
            int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r00Var2.setVisibility(i11);
            yVar.d.setAlpha(a11);
            r41 r41Var2 = yVar.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            r41Var2.setVisibility(i12);
            if (!this.H1) {
                this.f15510s1.setAlpha(a11);
                this.f15510s1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.f15510s1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                fi.d dVar2 = this.f15510s1;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar2.setVisibility(i13);
            }
            r41 r41Var3 = this.A1;
            r41Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            r41Var3.setVisibility(i19);
            this.f28672b.invalidate();
            this.C1.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.T;
        long j3 = this.f15506o1;
        z zVar = this.f15512u1;
        if (i7 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f26961id == j3) {
                zVar.d.f37496f3.O(true);
            }
        } else if (i7 == qs.f25067r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = qp.C8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat M0 = qp.s1(this.f28669a).M0(Long.valueOf(j3));
                this.f15507p1 = M0;
                zVar.f15492a.setTitle(m5.m(M0));
                zVar.h.e(this.f15507p1, zVar.f15617n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.n1.getCurrentPosition() > 0) {
            if (this.n1.getCurrentPosition() == 2) {
                te.a aVar = this.f15505m1;
                if (aVar.f55499f) {
                    this.f15514w1.d.f37495e3.h1(1, this.O1.f15123b);
                    aVar.a(false, true);
                    this.f28700q0 = true;
                    r00 r00Var = this.f15516y1;
                    org.telegram.messenger.g0.v1(r00Var.f37446r);
                    r00Var.f37446r.clearFocus();
                    return;
                }
            }
            this.n1.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(t2 t2Var) {
        TLRPC.TL_forumTopic f10;
        if (t2Var.getMessage() != null && (f10 = qp.s1(this.f28669a).f24881q7.f(-t2Var.getDialogId(), ij.b2(this.f28669a, t2Var.getMessage().f23266k, true, false))) != null) {
            qg.d.m(this.f15511t1, -t2Var.getDialogId(), f10, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.J1;
        try {
            super.s0();
            int w02 = m6.w0(m6.f27834a7, this.I0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f28672b;
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
        if (qp.s1(this.f28669a).P1().K(t2Var.getDialogId())) {
            f2 f2Var = this.f15511t1;
            f2Var.getOrCreateStoryViewer().getClass();
            f2Var.getOrCreateStoryViewer().J(f2Var.getContext(), t2Var.getDialogId(), i7.a((pj0) t2Var.getParent()));
        }
    }

    public d0(f2 f2Var, long j3, ArrayList arrayList, d4 d4Var) {
        super(f2Var.getContext(), f2Var.getResourceProvider(), true, true);
        wq wqVar = wq.h;
        this.l1 = new te.a(1, this, wqVar, 350L, false);
        this.f15505m1 = new te.a(2, this, wqVar, 350L, false);
        this.D1 = new bg.c0(2);
        this.E1 = new bg.c0(8);
        Paint paint = new Paint(1);
        this.J1 = paint;
        i0.b bVar = i0.b.f15121e;
        this.N1 = bVar;
        this.O1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f15511t1 = f2Var;
        this.H1 = arrayList != null;
        this.K1 = arrayList;
        this.I1 = d4Var;
        Context context = f2Var.getContext();
        qs.f(this.f28669a).c(this, qs.T);
        qs.f(this.f28669a).c(this, qs.f25067r);
        int i7 = m6.f27834a7;
        paint.setColor(m6.w0(i7, this.I0));
        P(i7);
        this.f28672b = new x7(this, context);
        g1 g1Var = new g1(2, context, this);
        this.n1 = g1Var;
        int i10 = this.f28705t0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.f28672b.addView(this.n1, ha.e(-1, -1, 119));
        this.B1 = new ec(5, context, this);
        this.C1 = new ec(5, context, this);
        r00 r00Var = new r00(context, this.I0);
        this.f15515x1 = r00Var;
        r00Var.setCloseButtonVisible(true);
        r00Var.f37450y = true;
        r00Var.updateColors();
        String M0 = id.M0(2131745836, null);
        ah.i iVar = r00Var.f37446r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new w(this, 0));
        r00Var.setVisibility(8);
        r00 r00Var2 = new r00(context, this.I0);
        this.f15516y1 = r00Var2;
        r00Var2.setCloseButtonVisible(true);
        r00Var2.f37450y = true;
        r00Var2.updateColors();
        String M02 = id.M0(2131745836, null);
        ah.i iVar2 = r00Var2.f37446r;
        iVar2.setHint(M02);
        iVar2.addTextChangedListener(new w(this, 1));
        r00Var2.setVisibility(8);
        r41 r41Var = new r41(context, this.f28669a, 0, false, new t(this, 0), new u(this, 0), null, this.I0);
        this.A1 = r41Var;
        r41Var.j(new ai.b(this, 17));
        r41Var.setClipToPadding(false);
        r41Var.setVisibility(8);
        r41Var.r1();
        r41Var.f37496f3.f35845r = false;
        r41Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.f22561m, 0, org.telegram.messenger.g0.f22562n);
        b00 b00Var = new b00(f2Var);
        this.f15517z1 = b00Var;
        b00Var.setVisibility(8);
        b00Var.setBackground(null);
        b00Var.setChatPreviewDelegate(new qb.a(11));
        b00Var.setUiCallback(new gf.g(this, 6));
        b00Var.f43862b.setClipToPadding(false);
        this.F1 = new View(getContext());
        Context context2 = getContext();
        h6 h6Var = this.I0;
        l0 l0Var = new l0(context2, h6Var, new gc((FrameLayout) this.f28672b, h6Var), this.f28669a, j3);
        this.G1 = l0Var;
        l0Var.h = new wf.b(this, f2Var, false, 23);
        this.f15506o1 = j3;
        this.f15507p1 = qp.s1(this.f28669a).M0(Long.valueOf(j3));
        qp.s1(this.f28669a).N0(j3);
        TLRPC.Chat chat = this.f15507p1;
        this.f15508q1 = chat != null && chat.collapsed_in_dialogs;
        o0 o0Var = new o0(2131232690, 4, m5.u(chat));
        o0Var.f16874f = this.f15507p1;
        o0Var.h = false;
        ArrayList arrayList2 = r00Var.F;
        arrayList2.add(o0Var);
        r00Var.I = arrayList2.size() - 1;
        r00Var.e();
        v0(m6.w0(i7, this.I0));
        this.f15513v1 = new y(this, context, 1);
        this.f15512u1 = new z(this, context);
        this.f15514w1 = new y(this, context, 0);
        this.n1.setAdapter(new x(this, 0));
        r00Var.setCloseButtonOnClickListener(new v(this, 0));
        r00Var2.setCloseButtonOnClickListener(new v(this, 1));
        l0Var.d();
        qp.s1(this.f28669a).V2(0, j3, true);
        bc.a((FrameLayout) this.f28672b, new r7(5));
        ViewGroup viewGroup = this.f28672b;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(viewGroup, uVar);
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
    public final void F(float f10, int i7) {
    }
}
