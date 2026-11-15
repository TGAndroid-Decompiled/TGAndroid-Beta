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
import c8.ja;
import fi.b7;
import fi.s6;
import hi.g7;
import hi.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.r2;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.cv;
import org.telegram.ui.uw;
import org.telegram.ui.yw;
public class m extends tj0 implements p2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public uj0 L;
    public ng0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final yw S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean f17190a0;
    public final Context f17192c;
    public ArrayList d;
    public boolean f17193e;
    public int f17194f;
    public int h;
    public boolean f17195n;
    public final int f17196r;
    public long f17197s;
    public int f17198w;
    public final boolean f17199x;
    public final ArrayList f17200y;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int f17191b0 = -1;

    static {
        boolean z10 = r2.f26198a;
    }

    public m(yw ywVar, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f17192c = context;
        this.S = ywVar;
        this.h = i7;
        this.f17196r = i10;
        this.f17199x = z10;
        if (i10 == 0 && i7 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        this.f17200y = arrayList;
        this.G = i11;
        this.W = ywVar.f53648a3;
        if (i10 == 0) {
            ?? obj = new Object();
            obj.f17154a = new HashSet();
            obj.f17155b = new HashSet();
            obj.f17156c = new HashSet();
            obj.d = new ArrayList();
            obj.f17157e = new ai.o(obj, 18);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                q6.x(view, drawable, j6.f28813b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = j6.f28792a7;
        i0.b bVar = new i0.b(4);
        i0.b bVar2 = new i0.b(5);
        int P = q6.P(i7, -1, 0, 0.0f, null);
        bVar2.f(P, view);
        k6 w10 = q6.w(101, view);
        w10.c(i7, -1, 0, 0.0f, null);
        w10.f29354n = bVar;
        w10.f29355o = bVar2;
        w10.f29353m = false;
        w10.f29348g = P;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 1 && i7 != 5 && i7 != 3 && i7 != 8 && i7 != 7 && i7 != 10 && i7 != 11 && i7 != 13 && i7 != 15 && i7 != 16 && i7 != 18 && i7 != 19 && i7 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i7 = this.h;
        int i10 = this.f17196r;
        if (i7 != 7 && i7 != 8) {
            if (i10 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (np.s1(this.G).f25247c2.get(i10)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            if (((k) this.N.get(i7)).f17163c != null && ((k) this.N.get(i7)).f17163c.f28055id == j3) {
                return i7;
            }
        }
        return -1;
    }

    public final int H(int i7) {
        if (this.F) {
            i7--;
        }
        if (this.E) {
            i7 = i5.c.f(2, i7, np.s1(this.G).f25385s);
        }
        if (this.f17195n && this.h == 3) {
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

    public final so I() {
        int i7 = this.h;
        if (i7 != 7 && i7 != 8) {
            return null;
        }
        return np.s1(this.G).N[this.h - 7];
    }

    public final Object J(int i7) {
        if (i7 >= 0 && i7 < this.N.size()) {
            k kVar = (k) this.N.get(i7);
            String str = kVar.f17170l;
            TLRPC.TL_contact tL_contact = kVar.f17164e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f17171m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f17172n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f17163c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return np.s1(this.G).a2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.f17195n = z10;
    }

    public final void O(ng0 ng0Var) {
        this.M = ng0Var;
    }

    public final void P(uj0 uj0Var, boolean z10) {
        this.K = z10;
        for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
            if (uj0Var.getChildAt(i7) instanceof t2) {
                ((t2) uj0Var.getChildAt(i7)).f31566f = z10;
            }
        }
        for (int i10 = 0; i10 < uj0Var.getCachedChildCount(); i10++) {
            if (uj0Var.P(i10) instanceof t2) {
                ((t2) uj0Var.P(i10)).f31566f = z10;
            }
        }
        for (int i11 = 0; i11 < uj0Var.getHiddenChildCount(); i11++) {
            if (uj0Var.V(i11) instanceof t2) {
                ((t2) uj0Var.V(i11)).f31566f = z10;
            }
        }
        for (int i12 = 0; i12 < uj0Var.getAttachedScrapChildCount(); i12++) {
            if (uj0Var.O(i12) instanceof t2) {
                ((t2) uj0Var.O(i12)).f31566f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j3) {
        this.f17197s = j3;
    }

    public final void S(uw uwVar) {
        this.L = uwVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i7 = this.G;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    Collections.sort(this.d, new d(np.s1(i7), currentTime, 1));
                    if (z10) {
                        f();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void V() {
        boolean z10;
        if (this.f17196r == 0 && this.h == 0 && !this.f17199x && !np.s1(this.G).f25385s.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: jg.m.W():void");
    }

    public final void X(cv cvVar) {
        if (this.f17190a0) {
            return;
        }
        this.f17190a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        W();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        arrayList3.size();
        p4.c c10 = v4.o.c(gVar, true);
        this.f17190a0 = false;
        if (cvVar != null) {
            cvVar.run();
        }
        this.N = arrayList2;
        c10.c(this);
    }

    @Override
    public final int b() {
        int size = this.N.size();
        this.f17198w = size;
        return size;
    }

    @Override
    public final long c(int i7) {
        return ((k) this.N.get(i7)).f17169k;
    }

    @Override
    public final int d(int i7) {
        return ((k) this.N.get(i7)).f56015a;
    }

    @Override
    public void f() {
        if (this.f17190a0) {
            this.N = new ArrayList();
        }
        this.f17190a0 = false;
        W();
        super.f();
    }

    @Override
    public final boolean m() {
        return this.f17200y.isEmpty();
    }

    @Override
    public final void q() {
        boolean z10;
        s6 P1 = np.s1(this.G).P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (P1.E(0, m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        this.S.getOrCreateStoryViewer().M(this.f17192c, null, arrayList2, 0, null, null, new b7(this.L, true), false);
    }

    @Override
    public final void t(v4.e1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: jg.m.t(v4.e1, int):void");
    }

    @Override
    public final void u(t2 t2Var) {
        int i7 = this.G;
        np.s1(i7);
        if (np.s1(i7).P1().K(t2Var.getDialogId())) {
            yw ywVar = this.S;
            ywVar.getOrCreateStoryViewer().getClass();
            ywVar.getOrCreateStoryViewer().J(ywVar.getParentActivity(), t2Var.getDialogId(), b7.a((uj0) t2Var.getParent()));
        }
    }

    @Override
    public final void w(t2 t2Var) {
        this.S.T4(t2Var);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        int i10;
        int i11;
        n4 n4Var;
        int i12;
        int i13 = 3;
        long j3 = this.W;
        Context context = this.f17192c;
        switch (i7) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    t2 t2Var = new t2(this.S, this.f17192c, false, this.G, null);
                    if (T()) {
                        g7 g7Var = new g7(this, 3);
                        t2Var.K1 = true;
                        t2Var.L1 = g7Var;
                    }
                    t2Var.setArchivedPullAnimation(this.M);
                    t2Var.setPreloader(this.Q);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.T);
                    if (i7 == 21) {
                        t2Var.H = new org.telegram.ui.Cells.b7(t2Var.getContext(), t2Var, false, 2131231208, t2Var.K4);
                        t2Var.G = true;
                    }
                    r22 = t2Var;
                    if (j3 != 0) {
                        t2Var.P0 = true;
                        r22 = t2Var;
                    }
                } else {
                    r22 = new f6(context, null);
                }
                if (this.h == 15) {
                    q6.h(j6.f28849d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new pz(context, null);
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
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.f23609q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                n4 n4Var2 = new n4(context);
                n4Var2.setText(hd.M0(2131746360, null));
                TextView textView = new TextView(context);
                i5.c.v(textView, 1, 15.0f);
                i20.q(textView, j6.L6, null, null, 2131746359);
                if (hd.f24101a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView.setGravity(i11 | 16);
                if (!hd.f24101a0) {
                    i13 = 5;
                }
                n4Var2.addView(textView, ja.d(-1, -1.0f, i13 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new p5(this, 2));
                r22 = n4Var2;
                break;
            case 3:
                r22 = new bi.v1(context, 4);
                q6.h(j6.f28792a7, r22, null);
                View view = new View(context);
                q6.Z(view, context, 2131231229, j6.f28813b7);
                r22.addView(view, ja.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f31708n = new t8((e6) null);
                r22.f31712x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = m10.f24934t0;
                j6.T(context);
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
                yw ywVar = this.S;
                if (ywVar == null || !ywVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new x6(context, (org.telegram.ui.Cells.y0) null);
                Drawable Y0 = j6.Y0(context, 2131231229, j6.f28813b7);
                fq fqVar = new fq(new ColorDrawable(j6.x0(null, j6.f28792a7, false)), Y0);
                fqVar.f34678x = true;
                r22.setBackgroundDrawable(fqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new l8(context);
                if (this.h == 15) {
                    q6.h(j6.f28849d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = j6.Y0(context, 2131231229, j6.f28813b7);
                fq fqVar2 = new fq(new ColorDrawable(j6.x0(null, j6.f28792a7, false)), Y02);
                fqVar2.f34678x = true;
                r22.setBackgroundDrawable(fqVar2);
                E(r22, Y02);
                break;
            case 14:
                n4 n4Var3 = new n4(this.f17192c, j6.f28888f7, 16, 0, false, null);
                n4Var3.setHeight(32);
                n4Var3.setClickable(false);
                n4Var = n4Var3;
                r22 = n4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f30739b = new ArrayList();
                r22.setOrientation(1);
                q6.h(j6.f28792a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new bn(context, 3);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new n6(this.f17192c, this.G, null, new f(this, 1), null), ja.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new x3(context, null);
                break;
            case 22:
                r22 = new n4(context);
                break;
            case 23:
                ?? t2Var2 = new t2(this.S, this.f17192c, false, this.G, null);
                n4Var = t2Var2;
                if (j3 != 0) {
                    t2Var2.P0 = true;
                    t2Var2.Q0 = true;
                    n4Var = t2Var2;
                }
                r22 = n4Var;
                break;
        }
        if (i7 != 5 && i7 != 19) {
            i12 = -2;
        } else {
            i12 = -1;
        }
        r22.setLayoutParams(new v4.p0(-1, i12));
        return new v4.e1(r22);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.c0(this.I, false);
            t2Var.e0(this.f17200y.contains(Long.valueOf(t2Var.getDialogId())), false);
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
