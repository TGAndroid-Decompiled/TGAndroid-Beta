package jg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.a4;
import di.h7;
import di.y6;
import hi.x3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.bv;
import org.telegram.ui.sw;
import org.telegram.ui.ww;
public class n extends oj0 implements p2 {
    public boolean D;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public pj0 K;
    public kg0 L;
    public Drawable O;
    public final k P;
    public boolean Q;
    public final ww R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public final Context f16851c;
    public ArrayList d;
    public boolean f16852e;
    public int f16853f;
    public int h;
    public boolean f16854n;
    public final int f16855r;
    public long f16856s;
    public int f16857w;
    public final boolean f16858x;
    public final ArrayList f16859y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int f16850a0 = -1;

    static {
        boolean z9 = r2.f25212a;
    }

    public n(ww wwVar, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        boolean z10;
        this.f16851c = context;
        this.R = wwVar;
        this.h = i7;
        this.f16855r = i10;
        this.f16858x = z9;
        if (i10 == 0 && i7 == 0 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        this.f16859y = arrayList;
        this.F = i11;
        this.V = wwVar.Y2;
        if (i10 == 0) {
            ?? obj = new Object();
            obj.f16815a = new HashSet();
            obj.f16816b = new HashSet();
            obj.f16817c = new HashSet();
            obj.d = new ArrayList();
            obj.f16818e = new ai.m0(obj, 15);
            this.P = obj;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                r6.y(view, drawable, k6.f27816b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = k6.f27796a7;
        x3 x3Var = new x3(8);
        x3 x3Var2 = new x3(9);
        int Q = r6.Q(i7, -1, 0, 0.0f, null);
        x3Var2.c(Q, view);
        l6 x10 = r6.x(101, view);
        x10.c(i7, -1, 0, 0.0f, null);
        x10.f28295n = x3Var;
        x10.f28296o = x3Var2;
        x10.f28294m = false;
        x10.f28289g = Q;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 1 && i7 != 5 && i7 != 3 && i7 != 8 && i7 != 7 && i7 != 10 && i7 != 11 && i7 != 13 && i7 != 15 && i7 != 16 && i7 != 18 && i7 != 19 && i7 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i7 = this.h;
        int i10 = this.f16855r;
        if (i7 != 7 && i7 != 8) {
            if (i10 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (qp.s1(this.F).f24741b2.get(i10)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.M.size(); i7++) {
            if (((l) this.M.get(i7)).f16820c != null && ((l) this.M.get(i7)).f16820c.f26960id == j3) {
                return i7;
            }
        }
        return -1;
    }

    public final int H(int i7) {
        if (this.E) {
            i7--;
        }
        if (this.D) {
            i7 = g.g(2, i7, qp.s1(this.F).f24889s);
        }
        if (this.f16854n && this.h == 3) {
            i7--;
        }
        int i10 = this.h;
        if (i10 != 11 && i10 != 13) {
            if (i10 == 12) {
                return i7 - 1;
            }
            return i7;
        }
        return i7 - 2;
    }

    public final vo I() {
        int i7 = this.h;
        if (i7 != 7 && i7 != 8) {
            return null;
        }
        return qp.s1(this.F).M[this.h - 7];
    }

    public final Object J(int i7) {
        if (i7 >= 0 && i7 < this.M.size()) {
            l lVar = (l) this.M.get(i7);
            String str = lVar.f16827l;
            TLRPC.TL_contact tL_contact = lVar.f16821e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = lVar.f16828m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = lVar.f16829n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = lVar.f16820c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return qp.s1(this.F).a2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = lVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z9) {
        this.f16854n = z9;
    }

    public final void O(kg0 kg0Var) {
        this.L = kg0Var;
    }

    public final void P(pj0 pj0Var, boolean z9) {
        this.J = z9;
        for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
            if (pj0Var.getChildAt(i7) instanceof t2) {
                ((t2) pj0Var.getChildAt(i7)).f30414f = z9;
            }
        }
        for (int i10 = 0; i10 < pj0Var.getCachedChildCount(); i10++) {
            if (pj0Var.P(i10) instanceof t2) {
                ((t2) pj0Var.P(i10)).f30414f = z9;
            }
        }
        for (int i11 = 0; i11 < pj0Var.getHiddenChildCount(); i11++) {
            if (pj0Var.V(i11) instanceof t2) {
                ((t2) pj0Var.V(i11)).f30414f = z9;
            }
        }
        for (int i12 = 0; i12 < pj0Var.getAttachedScrapChildCount(); i12++) {
            if (pj0Var.O(i12) instanceof t2) {
                ((t2) pj0Var.O(i12)).f30414f = z9;
            }
        }
    }

    public final void Q(boolean z9) {
        this.Q = z9;
    }

    public final void R(long j3) {
        this.f16856s = j3;
    }

    public final void S(sw swVar) {
        this.K = swVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z9) {
        int i7 = this.F;
        if (this.d != null) {
            if (!z9 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    Collections.sort(this.d, new d(qp.s1(i7), currentTime, 1));
                    if (z9) {
                        f();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void V() {
        boolean z9;
        if (this.f16855r == 0 && this.h == 0 && !this.f16858x && !qp.s1(this.F).f24889s.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.D = z9;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: jg.n.W():void");
    }

    public final void X(bv bvVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        W();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        h hVar = new h(this, arrayList2, 0);
        arrayList3.size();
        p4.c c10 = v4.o.c(hVar, true);
        this.Z = false;
        if (bvVar != null) {
            bvVar.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override
    public final int b() {
        int size = this.M.size();
        this.f16857w = size;
        return size;
    }

    @Override
    public final long c(int i7) {
        return ((l) this.M.get(i7)).f16826k;
    }

    @Override
    public final int d(int i7) {
        return ((l) this.M.get(i7)).f54532a;
    }

    @Override
    public void f() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        W();
        super.f();
    }

    @Override
    public final boolean m() {
        return this.f16859y.isEmpty();
    }

    @Override
    public final void q() {
        boolean z9;
        y6 P1 = qp.s1(this.F).P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (P1.E(0, m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z9 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        this.R.getOrCreateStoryViewer().M(this.f16851c, null, arrayList2, 0, null, null, new h7(this.K, true), false);
    }

    @Override
    public final void t(v4.d1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: jg.n.t(v4.d1, int):void");
    }

    @Override
    public final void u(t2 t2Var) {
        int i7 = this.F;
        qp.s1(i7);
        if (qp.s1(i7).P1().K(t2Var.getDialogId())) {
            ww wwVar = this.R;
            wwVar.getOrCreateStoryViewer().getClass();
            wwVar.getOrCreateStoryViewer().J(wwVar.getParentActivity(), t2Var.getDialogId(), h7.a((pj0) t2Var.getParent()));
        }
    }

    @Override
    public final void w(t2 t2Var) {
        this.R.T4(t2Var);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        int i10;
        int i11;
        int i12;
        n4 n4Var;
        int i13;
        long j3 = this.V;
        Context context = this.f16851c;
        switch (i7) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    t2 t2Var = new t2(this.R, this.f16851c, false, this.F, null);
                    if (T()) {
                        ii.c cVar = new ii.c(this, 1);
                        t2Var.J1 = true;
                        t2Var.K1 = cVar;
                    }
                    t2Var.setArchivedPullAnimation(this.L);
                    t2Var.setPreloader(this.P);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.S);
                    if (i7 == 21) {
                        c7 c7Var = new c7(t2Var.getContext(), t2Var, false, 2131231208, t2Var.J4);
                        t2Var = t2Var;
                        t2Var.G = c7Var;
                        t2Var.F = true;
                    }
                    if (j3 != 0) {
                        t2Var.O0 = true;
                    }
                    r22 = t2Var;
                } else {
                    r22 = new g6(context, null);
                }
                if (this.h == 15) {
                    r6.i(k6.f27852d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new mz(context, null);
                r22.setIsSingleCell(true);
                if (i7 == 13) {
                    i10 = 18;
                } else {
                    i10 = 7;
                }
                r22.setViewType(i10);
                if (i10 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i7 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.f22563q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new n4(context);
                r22.setText(id.M0(2131746361, null));
                TextView textView = new TextView(context);
                com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
                org.telegram.messenger.camera.q.o(textView, k6.L6, null, null, 2131746360);
                if (id.f23157a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView.setGravity(i11 | 16);
                if (id.f23157a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                r22.addView(textView, ha.d(-1, -1.0f, i12 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ii.g(this, 3));
                break;
            case 3:
                a4 a4Var = new a4(context, 2);
                r6.i(k6.f27796a7, a4Var, null);
                View view = new View(context);
                r6.a0(view, context, 2131231229, k6.f27816b7);
                a4Var.addView(view, ha.c(-1.0f, -1));
                r22 = a4Var;
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f30560n = new w8((f6) null);
                r22.f30564x = org.telegram.messenger.g0.L(40.0f);
                r22.F = org.telegram.messenger.g0.L(10.0f);
                r22.H = p10.f24470s0;
                k6.T(context);
                imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
                break;
            case 5:
                r22 = new z2(context);
                break;
            case 6:
                r22 = new pa(context, 8, 0, false);
                break;
            case 7:
                r22 = new n4(context);
                ww wwVar = this.R;
                if (wwVar == null || !wwVar.N0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = k6.Y0(context, 2131231229, k6.f27816b7);
                xp xpVar = new xp(new ColorDrawable(k6.x0(null, k6.f27796a7, false)), Y0);
                xpVar.f40361x = true;
                r22.setBackgroundDrawable(xpVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new m8(context);
                if (this.h == 15) {
                    r6.i(k6.f27852d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new m(this, context);
                break;
            case 11:
                r22 = new j(this, context);
                Drawable Y02 = k6.Y0(context, 2131231229, k6.f27816b7);
                xp xpVar2 = new xp(new ColorDrawable(k6.x0(null, k6.f27796a7, false)), Y02);
                xpVar2.f40361x = true;
                r22.setBackgroundDrawable(xpVar2);
                E(r22, Y02);
                break;
            case 14:
                n4 n4Var2 = new n4(this.f16851c, k6.f27891f7, 16, 0, false, null);
                n4Var2.setHeight(32);
                n4Var2.setClickable(false);
                n4Var = n4Var2;
                r22 = n4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f29659b = new ArrayList();
                r22.setOrientation(1);
                r6.i(k6.f27796a7, r22, null);
                break;
            case 16:
                r22 = new i(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new tm(context, 4);
                break;
            case 19:
                r22 = new m(this, context);
                r22.addView(new p6(this.f16851c, this.F, null, new f(this, 1), null), ha.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new org.telegram.ui.Cells.x3(context, null);
                break;
            case 22:
                r22 = new n4(context);
                break;
            case 23:
                ?? t2Var2 = new t2(this.R, this.f16851c, false, this.F, null);
                n4Var = t2Var2;
                if (j3 != 0) {
                    t2Var2.O0 = true;
                    t2Var2.P0 = true;
                    n4Var = t2Var2;
                }
                r22 = n4Var;
                break;
        }
        if (i7 != 5 && i7 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new v4.o0(-1, i13));
        return new v4.d1(r22);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f57044a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.a0(this.H, false);
            t2Var.c0(this.f16859y.contains(Long.valueOf(t2Var.getDialogId())), false);
        }
    }

    public void M(TLRPC.User user) {
    }

    @Override
    public void l(t2 t2Var) {
    }

    @Override
    public void r(t2 t2Var) {
    }

    public void K() {
    }

    public void L() {
    }
}
