package kg;

import ai.d2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ei.i7;
import ei.z6;
import gi.j8;
import ii.y3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.mo;
import org.telegram.messenger.r2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.pw;
import org.telegram.ui.uw;
import org.telegram.ui.yu;
public class m extends sj0 implements p2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public tj0 L;
    public ng0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final uw S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean f17087a0;
    public final Context f17089c;
    public ArrayList d;
    public boolean f17090e;
    public int f17091f;
    public int h;
    public boolean f17092n;
    public final int f17093r;
    public long f17094s;
    public int f17095w;
    public final boolean f17096x;
    public final ArrayList f17097y;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int f17088b0 = -1;

    static {
        boolean z10 = r2.f25040a;
    }

    public m(uw uwVar, Context context, int i3, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f17089c = context;
        this.S = uwVar;
        this.h = i3;
        this.f17093r = i10;
        this.f17096x = z10;
        if (i10 == 0 && i3 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        this.f17097y = arrayList;
        this.G = i11;
        this.W = uwVar.Z2;
        if (i10 == 0) {
            ?? obj = new Object();
            obj.f17052a = new HashSet();
            obj.f17053b = new HashSet();
            obj.f17054c = new HashSet();
            obj.d = new ArrayList();
            obj.f17055e = new ai.y1(obj, 19);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                r6.y(view, drawable, k6.f27843b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i3 = k6.f27824a7;
        y3 y3Var = new y3(13);
        y3 y3Var2 = new y3(14);
        int Q = r6.Q(i3, -1, 0, 0.0f, null);
        y3Var2.f(Q, view);
        l6 x10 = r6.x(101, view);
        x10.c(i3, -1, 0, 0.0f, null);
        x10.f28325n = y3Var;
        x10.f28326o = y3Var2;
        x10.f28324m = false;
        x10.f28319g = Q;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 1 && i3 != 5 && i3 != 3 && i3 != 8 && i3 != 7 && i3 != 10 && i3 != 11 && i3 != 13 && i3 != 15 && i3 != 16 && i3 != 18 && i3 != 19 && i3 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i3 = this.h;
        int i10 = this.f17093r;
        if (i3 != 7 && i3 != 8) {
            if (i10 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (hp.s1(this.G).c2.get(i10)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j10) {
        for (int i3 = 0; i3 < this.N.size(); i3++) {
            if (((k) this.N.get(i3)).f17061c != null && ((k) this.N.get(i3)).f17061c.f27005id == j10) {
                return i3;
            }
        }
        return -1;
    }

    public final int H(int i3) {
        if (this.F) {
            i3--;
        }
        if (this.E) {
            i3 = k2.p1.f(2, i3, hp.s1(this.G).f23113s);
        }
        if (this.f17092n && this.h == 3) {
            i3--;
        }
        int i10 = this.h;
        if (i10 != 11 && i10 != 13) {
            if (i10 == 12) {
                return i3 - 1;
            }
            return i3;
        }
        return i3 - 2;
    }

    public final mo I() {
        int i3 = this.h;
        if (i3 != 7 && i3 != 8) {
            return null;
        }
        return hp.s1(this.G).N[this.h - 7];
    }

    public final Object J(int i3) {
        if (i3 >= 0 && i3 < this.N.size()) {
            k kVar = (k) this.N.get(i3);
            String str = kVar.f17068l;
            TLRPC.TL_contact tL_contact = kVar.f17062e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f17069m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f17070n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f17061c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return hp.s1(this.G).a2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.f17092n = z10;
    }

    public final void O(ng0 ng0Var) {
        this.M = ng0Var;
    }

    public final void P(tj0 tj0Var, boolean z10) {
        this.K = z10;
        for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
            if (tj0Var.getChildAt(i3) instanceof t2) {
                ((t2) tj0Var.getChildAt(i3)).f30490f = z10;
            }
        }
        for (int i10 = 0; i10 < tj0Var.getCachedChildCount(); i10++) {
            if (tj0Var.P(i10) instanceof t2) {
                ((t2) tj0Var.P(i10)).f30490f = z10;
            }
        }
        for (int i11 = 0; i11 < tj0Var.getHiddenChildCount(); i11++) {
            if (tj0Var.V(i11) instanceof t2) {
                ((t2) tj0Var.V(i11)).f30490f = z10;
            }
        }
        for (int i12 = 0; i12 < tj0Var.getAttachedScrapChildCount(); i12++) {
            if (tj0Var.O(i12) instanceof t2) {
                ((t2) tj0Var.O(i12)).f30490f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j10) {
        this.f17094s = j10;
    }

    public final void S(pw pwVar) {
        this.L = pwVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i3 = this.G;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                    Collections.sort(this.d, new d(hp.s1(i3), currentTime, 1));
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
        if (this.f17093r == 0 && this.h == 0 && !this.f17096x && !hp.s1(this.G).f23113s.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: kg.m.W():void");
    }

    public final void X(yu yuVar) {
        if (this.f17087a0) {
            return;
        }
        this.f17087a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        W();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        arrayList3.size();
        o4.c c2 = u4.o.c(gVar, true);
        this.f17087a0 = false;
        if (yuVar != null) {
            yuVar.run();
        }
        this.N = arrayList2;
        c2.c(this);
    }

    @Override
    public final int b() {
        int size = this.N.size();
        this.f17095w = size;
        return size;
    }

    @Override
    public final long c(int i3) {
        return ((k) this.N.get(i3)).f17067k;
    }

    @Override
    public final int d(int i3) {
        return ((k) this.N.get(i3)).f54715a;
    }

    @Override
    public void f() {
        if (this.f17087a0) {
            this.N = new ArrayList();
        }
        this.f17087a0 = false;
        W();
        super.f();
    }

    @Override
    public final boolean m() {
        return this.f17097y.isEmpty();
    }

    @Override
    public final void q() {
        boolean z10;
        z6 P1 = hp.s1(this.G).P1();
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long o10 = m5.o(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (!z10 || P1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        this.S.getOrCreateStoryViewer().U(this.f17089c, null, arrayList2, 0, null, null, new i7(this.L, true), false);
    }

    @Override
    public final void t(u4.d1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: kg.m.t(u4.d1, int):void");
    }

    @Override
    public final void u(t2 t2Var) {
        int i3 = this.G;
        hp.s1(i3);
        if (hp.s1(i3).P1().K(t2Var.getDialogId())) {
            uw uwVar = this.S;
            uwVar.getOrCreateStoryViewer().getClass();
            uwVar.getOrCreateStoryViewer().R(uwVar.getParentActivity(), t2Var.getDialogId(), i7.a((tj0) t2Var.getParent()));
        }
    }

    @Override
    public final void w(t2 t2Var) {
        this.S.T4(t2Var);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ?? r22;
        int i10;
        int i11;
        n4 n4Var;
        int i12;
        long j10 = this.W;
        Context context = this.f17089c;
        switch (i3) {
            case 0:
            case 21:
                int i13 = this.h;
                if (i13 != 2 && i13 != 15) {
                    t2 t2Var = new t2(this.S, this.f17089c, false, this.G, null);
                    if (T()) {
                        j8 j8Var = new j8(this, 4);
                        t2Var.K1 = true;
                        t2Var.L1 = j8Var;
                    }
                    t2Var.setArchivedPullAnimation(this.M);
                    t2Var.setPreloader(this.Q);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.T);
                    if (i3 == 21) {
                        b7 b7Var = new b7(t2Var.getContext(), t2Var, false, 2131231208, t2Var.K4);
                        t2Var = t2Var;
                        t2Var.H = b7Var;
                        t2Var.G = true;
                    }
                    if (j10 != 0) {
                        t2Var.P0 = true;
                    }
                    r22 = t2Var;
                } else {
                    r22 = new f6(context, null);
                }
                if (this.h == 15) {
                    r6.i(k6.f27878d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new iz(context, null);
                r22.setIsSingleCell(true);
                if (i3 == 13) {
                    i10 = 18;
                } else {
                    i10 = 7;
                }
                r22.setViewType(i10);
                if (i10 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i3 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.f22608q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new n4(context);
                r22.setText(bd.M0(2131746368, null));
                TextView textView = new TextView(context);
                k2.p1.t(textView, 1, 15.0f);
                org.telegram.messenger.camera.q.o(textView, k6.L6, null, null, 2131746367);
                int i14 = 3;
                if (bd.f21784a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView.setGravity(i11 | 16);
                if (!bd.f21784a0) {
                    i14 = 5;
                }
                r22.addView(textView, mf.d(-1, -1.0f, i14 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ii.m(this, 6));
                break;
            case 3:
                d2 d2Var = new d2(context, 4);
                r6.i(k6.f27824a7, d2Var, null);
                View view = new View(context);
                r6.a0(view, context, 2131231229, k6.f27843b7);
                d2Var.addView(view, mf.c(-1.0f, -1));
                r22 = d2Var;
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f30632n = new u8((e6) null);
                r22.f30636x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = h10.f22829t0;
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
                uw uwVar = this.S;
                if (uwVar == null || !uwVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new x6(context, (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = k6.Y0(context, 2131231229, k6.f27843b7);
                xp xpVar = new xp(new ColorDrawable(k6.x0(null, k6.f27824a7, false)), Y0);
                xpVar.f40447x = true;
                r22.setBackgroundDrawable(xpVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new l8(context);
                if (this.h == 15) {
                    r6.i(k6.f27878d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = k6.Y0(context, 2131231229, k6.f27843b7);
                xp xpVar2 = new xp(new ColorDrawable(k6.x0(null, k6.f27824a7, false)), Y02);
                xpVar2.f40447x = true;
                r22.setBackgroundDrawable(xpVar2);
                E(r22, Y02);
                break;
            case 14:
                n4 n4Var2 = new n4(this.f17089c, k6.f27918f7, 16, 0, false, null);
                n4Var2.setHeight(32);
                n4Var2.setClickable(false);
                n4Var = n4Var2;
                r22 = n4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f29678b = new ArrayList();
                r22.setOrientation(1);
                r6.i(k6.f27824a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new sm(context, 5);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new n6(this.f17089c, this.G, null, new f(this, 1), null), mf.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new x3(context, null);
                break;
            case 22:
                r22 = new n4(context);
                break;
            case 23:
                ?? t2Var2 = new t2(this.S, this.f17089c, false, this.G, null);
                n4Var = t2Var2;
                if (j10 != 0) {
                    t2Var2.P0 = true;
                    t2Var2.Q0 = true;
                    n4Var = t2Var2;
                }
                r22 = n4Var;
                break;
        }
        if (i3 != 5 && i3 != 19) {
            i12 = -2;
        } else {
            i12 = -1;
        }
        r22.setLayoutParams(new u4.p0(-1, i12));
        return new u4.d1(r22);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.a0(this.I, false);
            t2Var.c0(this.f17097y.contains(Long.valueOf(t2Var.getDialogId())), false);
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
