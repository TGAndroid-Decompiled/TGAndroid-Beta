package ji;

import ai.g3;
import ai.j5;
import ai.o1;
import ai.x2;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.mf;
import b8.v9;
import ei.i7;
import gi.g1;
import gi.m9;
import gi.w5;
import gi.w7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kg.l0;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wm;
import org.telegram.ui.wz;
public final class b0 extends t2 implements cs, qe.b, p2 {
    public static final int N1 = 0;
    public final x2 A1;
    public final cg.b0 B1;
    public final cg.b0 C1;
    public final View D1;
    public final i0 E1;
    public final boolean F1;
    public final u10 G1;
    public final Paint H1;
    public ArrayList I1;
    public String J1;
    public String K1;
    public i0.b L1;
    public i0.b M1;
    public final qe.a f16264j1;
    public final qe.a k1;
    public final g1 f16265l1;
    public final long m1;
    public TLRPC.Chat f16266n1;
    public boolean f16267o1;
    public gi.d f16268p1;
    public gi.d f16269q1;
    public final d2 f16270r1;
    public final x f16271s1;
    public final w f16272t1;
    public final w f16273u1;
    public final n00 f16274v1;
    public final n00 f16275w1;
    public final wz f16276x1;
    public final l41 f16277y1;
    public final x2 f16278z1;

    public b0(d2 d2Var, long j10) {
        this(d2Var, j10, null, null);
    }

    @Override
    public final boolean G() {
        if (!this.f16264j1.f53841f && !this.k1.f53841f) {
            View currentView = this.f16265l1.getCurrentView();
            if (currentView instanceof z) {
                return ((z) currentView).f16382e;
            }
            return true;
        }
        return false;
    }

    public final boolean I0(r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof ki.f) {
            ki.f fVar = (ki.f) obj;
            long j10 = fVar.f17325a;
            TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
            TLRPC.User a22 = hp.s1(this.f28583a).a2(Long.valueOf(j10));
            d2 d2Var = this.f16270r1;
            if (a22 != null) {
                d2Var.presentFragment(wm.ra(a22.f27150id));
                return true;
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new li.b(getContext(), M0, new ii.e(9, this, fVar)).show();
                return true;
            } else {
                d2Var.presentFragment(wm.ra(-M0.f27001id));
                return true;
            }
        }
        return false;
    }

    public final void J0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i3 = 0;
        if (!z10) {
            arrayList.add(r31.E(99, (int) (org.telegram.messenger.g0.f22608q.y * 0.35f)));
            arrayList.add(r31.E(0, org.telegram.messenger.g0.L(56.0f)));
        }
        if (this.I1 != null) {
            if (z10 && (str2 = this.K1) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.I1;
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(r31.w(chat));
                    }
                } else {
                    arrayList.add(r31.w(chat));
                }
            }
        }
    }

    @Override
    public final void K() {
        hs.f(this.f28583a).n(this, hs.T);
        hs.f(this.f28583a).n(this, hs.f23292r);
        super.K();
    }

    public final void K0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f27001id;
        boolean V = t3.V(chat);
        if (!t3.T(chat)) {
            s1 s1Var = new s1(3, getContext(), null);
            s1Var.r(250L);
            hp.s1(this.f28583a).T(getContext(), -j11, null, new c(this, s1Var, j10, z10, 1), null);
            return;
        }
        hp.s1(this.f28583a).Q2(j11, j10, false, z10, new m9(1, this, V));
    }

    public final void L0(r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.F1) {
                this.G1.a(chat);
                dismiss();
                return;
            }
            new li.a(getContext(), this.f16266n1, -chat.f27001id, new o1(26, this, chat)).show();
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
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
        if (i3 == 1) {
            float a10 = v9.a(f10);
            float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
            x xVar = this.f16271s1;
            xVar.f16379a.setAlpha(a10);
            xVar.f16379a.setScaleX(T1);
            xVar.f16379a.setScaleY(T1);
            org.telegram.ui.ActionBar.k kVar = xVar.f16379a;
            int i20 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            kVar.setVisibility(i14);
            float T12 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            n00 n00Var = this.f16274v1;
            n00Var.setAlpha(f10);
            n00Var.setScaleX(T12);
            n00Var.setScaleY(T12);
            int i21 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            n00Var.setVisibility(i15);
            xVar.d.setAlpha(a10);
            l41 l41Var = xVar.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            l41Var.setVisibility(i16);
            this.f16268p1.setAlpha(a10);
            this.f16268p1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            this.f16268p1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a10));
            gi.d dVar = this.f16268p1;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            dVar.setVisibility(i17);
            wz wzVar = this.f16276x1;
            wzVar.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            wzVar.setVisibility(i18);
            this.f28586b.invalidate();
            this.f16278z1.invalidate();
        }
        if (i3 == 2) {
            float a11 = v9.a(f10);
            float T13 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a11);
            w wVar = this.f16273u1;
            wVar.f16379a.setAlpha(a11);
            wVar.f16379a.setScaleX(T13);
            wVar.f16379a.setScaleY(T13);
            org.telegram.ui.ActionBar.k kVar2 = wVar.f16379a;
            int i22 = (a11 > 0.0f ? 1 : (a11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar2.setVisibility(i10);
            float T14 = org.telegram.messenger.g0.T1(0.9f, 1.0f, f10);
            n00 n00Var2 = this.f16275w1;
            n00Var2.setAlpha(f10);
            n00Var2.setScaleX(T14);
            n00Var2.setScaleY(T14);
            int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            n00Var2.setVisibility(i11);
            wVar.d.setAlpha(a11);
            l41 l41Var2 = wVar.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            l41Var2.setVisibility(i12);
            if (!this.F1) {
                this.f16269q1.setAlpha(a11);
                this.f16269q1.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                this.f16269q1.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, a11));
                gi.d dVar2 = this.f16269q1;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar2.setVisibility(i13);
            }
            l41 l41Var3 = this.f16277y1;
            l41Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            l41Var3.setVisibility(i19);
            this.f28586b.invalidate();
            this.A1.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.T;
        long j10 = this.m1;
        x xVar = this.f16271s1;
        if (i3 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f27002id == j10) {
                xVar.d.f35594g3.O(true);
            }
        } else if (i3 == hs.f23292r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i12 = hp.C8;
            if ((intValue & 8192) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(j10));
                this.f16266n1 = M0;
                xVar.f16379a.setTitle(m5.m(M0));
                xVar.h.e(this.f16266n1, xVar.f16377n);
            }
        }
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f16265l1.getCurrentPosition() > 0) {
            if (this.f16265l1.getCurrentPosition() == 2) {
                qe.a aVar = this.k1;
                if (aVar.f53841f) {
                    this.f16273u1.d.f35593f3.h1(1, this.M1.f14496b);
                    aVar.a(false, true);
                    this.f28614r0 = true;
                    n00 n00Var = this.f16275w1;
                    org.telegram.messenger.g0.v1(n00Var.f36302r);
                    n00Var.f36302r.clearFocus();
                    return;
                }
            }
            this.f16265l1.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        TLRPC.TL_forumTopic f10;
        if (t2Var.getMessage() != null && (f10 = hp.s1(this.f28583a).f23102q7.f(-t2Var.getDialogId(), zi.c2(this.f28583a, t2Var.getMessage().f26868k, true, false))) != null) {
            rg.c.m(this.f16270r1, -t2Var.getDialogId(), f10, 0);
        }
    }

    @Override
    public final void s0() {
        Paint paint = this.H1;
        try {
            super.s0();
            int w02 = k6.w0(k6.f27824a7, this.J0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.f28586b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        if (hp.s1(this.f28583a).P1().K(t2Var.getDialogId())) {
            d2 d2Var = this.f16270r1;
            d2Var.getOrCreateStoryViewer().getClass();
            d2Var.getOrCreateStoryViewer().R(d2Var.getContext(), t2Var.getDialogId(), i7.a((tj0) t2Var.getParent()));
        }
    }

    public b0(d2 d2Var, long j10, ArrayList arrayList, g3 g3Var) {
        super(d2Var.getContext(), d2Var.getResourceProvider(), true, true);
        xq xqVar = xq.h;
        this.f16264j1 = new qe.a(1, this, xqVar, 350L, false);
        this.k1 = new qe.a(2, this, xqVar, 350L, false);
        this.B1 = new cg.b0(2);
        this.C1 = new cg.b0(8);
        Paint paint = new Paint(1);
        this.H1 = paint;
        i0.b bVar = i0.b.f14494e;
        this.L1 = bVar;
        this.M1 = bVar;
        org.telegram.messenger.g0.S(getWindow());
        this.f16270r1 = d2Var;
        this.F1 = arrayList != null;
        this.I1 = arrayList;
        this.G1 = g3Var;
        Context context = d2Var.getContext();
        hs.f(this.f28583a).c(this, hs.T);
        hs.f(this.f28583a).c(this, hs.f23292r);
        int i3 = k6.f27824a7;
        paint.setColor(k6.w0(i3, this.J0));
        P(i3);
        this.f28586b = new w7(this, context);
        g1 g1Var = new g1(2, context, this);
        this.f16265l1 = g1Var;
        int i10 = this.f28618u0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.f28586b.addView(this.f16265l1, mf.e(-1, -1, 119));
        this.f16278z1 = new x2(6, context, this);
        this.A1 = new x2(6, context, this);
        n00 n00Var = new n00(context, this.J0);
        this.f16274v1 = n00Var;
        n00Var.setCloseButtonVisible(true);
        n00Var.f36306y = true;
        n00Var.updateColors();
        String M0 = bd.M0(2131745846, null);
        bh.g gVar = n00Var.f36302r;
        gVar.setHint(M0);
        gVar.addTextChangedListener(new u(this, 0));
        n00Var.setVisibility(8);
        n00 n00Var2 = new n00(context, this.J0);
        this.f16275w1 = n00Var2;
        n00Var2.setCloseButtonVisible(true);
        n00Var2.f36306y = true;
        n00Var2.updateColors();
        String M02 = bd.M0(2131745846, null);
        bh.g gVar2 = n00Var2.f36302r;
        gVar2.setHint(M02);
        gVar2.addTextChangedListener(new u(this, 1));
        n00Var2.setVisibility(8);
        l41 l41Var = new l41(context, this.f28583a, 0, false, new r(this, 0), new s(this, 0), null, this.J0);
        this.f16277y1 = l41Var;
        l41Var.j(new j5(this, 20));
        l41Var.setClipToPadding(false);
        l41Var.setVisibility(8);
        l41Var.r1();
        l41Var.f35594g3.f33698r = false;
        l41Var.setPadding(0, org.telegram.messenger.g0.L(52.0f) + org.telegram.messenger.g0.f22602m, 0, org.telegram.messenger.g0.f22603n);
        wz wzVar = new wz(d2Var);
        this.f16276x1 = wzVar;
        wzVar.setVisibility(8);
        wzVar.setBackground(null);
        wzVar.setChatPreviewDelegate(new v7.s(12));
        wzVar.setUiCallback(new w5(this, 5));
        wzVar.f51638b.setClipToPadding(false);
        this.D1 = new View(getContext());
        Context context2 = getContext();
        e6 e6Var = this.J0;
        i0 i0Var = new i0(context2, e6Var, new fc((FrameLayout) this.f28586b, e6Var), this.f28583a, j10);
        this.E1 = i0Var;
        i0Var.h = new tf.b(this, d2Var, false);
        this.m1 = j10;
        this.f16266n1 = hp.s1(this.f28583a).M0(Long.valueOf(j10));
        hp.s1(this.f28583a).N0(j10);
        TLRPC.Chat chat = this.f16266n1;
        this.f16267o1 = chat != null && chat.collapsed_in_dialogs;
        l0 l0Var = new l0(2131232688, 4, m5.u(chat));
        l0Var.f17084f = this.f16266n1;
        l0Var.h = false;
        ArrayList arrayList2 = n00Var.G;
        arrayList2.add(l0Var);
        n00Var.J = arrayList2.size() - 1;
        n00Var.e();
        v0(k6.w0(i3, this.J0));
        this.f16272t1 = new w(this, context, 1);
        this.f16271s1 = new x(this, context);
        this.f16273u1 = new w(this, context, 0);
        this.f16265l1.setAdapter(new v(this, 0));
        n00Var.setCloseButtonOnClickListener(new t(this, 0));
        n00Var2.setCloseButtonOnClickListener(new t(this, 1));
        i0Var.d();
        hp.s1(this.f28583a).V2(0, j10, true);
        ac.a((FrameLayout) this.f28586b, new ai.y(6));
        ViewGroup viewGroup = this.f28586b;
        s sVar = new s(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(viewGroup, sVar);
    }

    @Override
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
