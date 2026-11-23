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
import bi.v2;
import c8.na;
import fi.p6;
import fi.y6;
import hi.c7;
import hi.z4;
import hi.z9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.ro;
import org.telegram.messenger.s2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.t6;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.bx;
import org.telegram.ui.ev;
import org.telegram.ui.xw;
public class m extends dk0 implements q2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public ek0 L;
    public yg0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final bx S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean f17669a0;
    public final Context f17671c;
    public ArrayList d;
    public boolean f17672e;
    public int f17673f;
    public int h;
    public boolean f17674n;
    public final int f17675r;
    public long f17676s;
    public int f17677w;
    public final boolean f17678x;
    public final ArrayList f17679y;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int f17670b0 = -1;

    static {
        boolean z10 = s2.f26829a;
    }

    public m(bx bxVar, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f17671c = context;
        this.S = bxVar;
        this.h = i7;
        this.f17675r = i10;
        this.f17678x = z10;
        if (i10 == 0 && i7 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        this.f17679y = arrayList;
        this.G = i11;
        this.W = bxVar.f46524a3;
        if (i10 == 0) {
            ?? obj = new Object();
            obj.f17633a = new HashSet();
            obj.f17634b = new HashSet();
            obj.f17635c = new HashSet();
            obj.d = new ArrayList();
            obj.f17636e = new ai.k(obj, 20);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                u6.x(view, drawable, n6.f29415b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = n6.f29394a7;
        z9 z9Var = new z9(5);
        z9 z9Var2 = new z9(6);
        int P = u6.P(i7, -1, 0, 0.0f, null);
        z9Var2.g(P, view);
        o6 w10 = u6.w(101, view);
        w10.c(i7, -1, 0, 0.0f, null);
        w10.f29912n = z9Var;
        w10.f29913o = z9Var2;
        w10.f29911m = false;
        w10.f29906g = P;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 1 && i7 != 5 && i7 != 3 && i7 != 8 && i7 != 7 && i7 != 10 && i7 != 11 && i7 != 13 && i7 != 15 && i7 != 16 && i7 != 18 && i7 != 19 && i7 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i7 = this.G;
        int i10 = this.f17675r;
        bx bxVar = this.S;
        if (bxVar != null && this.W == 0 && bxVar.w4(this.h)) {
            if (this.h == 0 || mp.u1(i7).f25729e2.get(i10)) {
                return 4;
            }
            return 3;
        }
        int i11 = this.h;
        if (i11 != 7 && i11 != 8) {
            if (i10 != 1) {
                if (this.d != null) {
                    return 1;
                }
                return 0;
            }
            return 2;
        } else if (mp.u1(i7).f25729e2.get(i10)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            if (((k) this.N.get(i7)).f17642c != null && ((k) this.N.get(i7)).f17642c.f28496id == j3) {
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
            i7 = i5.c.f(2, i7, mp.u1(this.G).f25849s);
        }
        if (this.f17674n && this.h == 3) {
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

    public final ro I() {
        int i7 = this.h;
        if (i7 != 7 && i7 != 8) {
            return null;
        }
        return mp.u1(this.G).N[this.h - 7];
    }

    public final Object J(int i7) {
        if (i7 >= 0 && i7 < this.N.size()) {
            k kVar = (k) this.N.get(i7);
            String str = kVar.f17649l;
            TLRPC.TL_contact tL_contact = kVar.f17643e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f17650m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f17651n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f17642c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return mp.u1(this.G).c2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.f17674n = z10;
    }

    public final void O(yg0 yg0Var) {
        this.M = yg0Var;
    }

    public final void P(ek0 ek0Var, boolean z10) {
        this.K = z10;
        for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
            if (ek0Var.getChildAt(i7) instanceof u2) {
                ((u2) ek0Var.getChildAt(i7)).f31997f = z10;
            }
        }
        for (int i10 = 0; i10 < ek0Var.getCachedChildCount(); i10++) {
            if (ek0Var.P(i10) instanceof u2) {
                ((u2) ek0Var.P(i10)).f31997f = z10;
            }
        }
        for (int i11 = 0; i11 < ek0Var.getHiddenChildCount(); i11++) {
            if (ek0Var.V(i11) instanceof u2) {
                ((u2) ek0Var.V(i11)).f31997f = z10;
            }
        }
        for (int i12 = 0; i12 < ek0Var.getAttachedScrapChildCount(); i12++) {
            if (ek0Var.O(i12) instanceof u2) {
                ((u2) ek0Var.O(i12)).f31997f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j3) {
        this.f17676s = j3;
    }

    public final void S(xw xwVar) {
        this.L = xwVar;
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
                    Collections.sort(this.d, new d(mp.u1(i7), currentTime, 1));
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
        if (this.f17675r == 0 && this.h == 0 && !this.f17678x && !mp.u1(this.G).f25849s.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: jg.m.W():void");
    }

    public final void X(ev evVar) {
        if (this.f17669a0) {
            return;
        }
        this.f17669a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        W();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        arrayList3.size();
        p4.c c10 = v4.p.c(gVar, true);
        this.f17669a0 = false;
        if (evVar != null) {
            evVar.run();
        }
        this.N = arrayList2;
        c10.c(this);
    }

    @Override
    public final int b() {
        int size = this.N.size();
        this.f17677w = size;
        return size;
    }

    @Override
    public final long c(int i7) {
        return ((k) this.N.get(i7)).f17648k;
    }

    @Override
    public final int d(int i7) {
        return ((k) this.N.get(i7)).f56712a;
    }

    @Override
    public void f() {
        if (this.f17669a0) {
            this.N = new ArrayList();
        }
        this.f17669a0 = false;
        W();
        super.f();
    }

    @Override
    public final boolean m() {
        return this.f17679y.isEmpty();
    }

    @Override
    public final void q() {
        boolean z10;
        p6 R1 = mp.u1(this.G).R1();
        ArrayList arrayList = R1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (R1.E(0, n5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = n5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || R1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        this.S.getOrCreateStoryViewer().M(this.f17671c, null, arrayList2, 0, null, null, new y6(this.L, true), false);
    }

    @Override
    public final void t(v4.f1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: jg.m.t(v4.f1, int):void");
    }

    @Override
    public final void u(u2 u2Var) {
        int i7 = this.G;
        mp.u1(i7);
        if (mp.u1(i7).R1().K(u2Var.getDialogId())) {
            bx bxVar = this.S;
            bxVar.getOrCreateStoryViewer().getClass();
            bxVar.getOrCreateStoryViewer().J(bxVar.getParentActivity(), u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
        }
    }

    @Override
    public final void w(u2 u2Var) {
        this.S.b5(u2Var);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        int i10;
        int i11;
        int i12;
        o4 o4Var;
        int i13;
        long j3 = this.W;
        Context context = this.f17671c;
        switch (i7) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    u2 u2Var = new u2(this.S, this.f17671c, false, this.G, null);
                    if (T()) {
                        c7 c7Var = new c7(this, 4);
                        u2Var.K1 = true;
                        u2Var.L1 = c7Var;
                    }
                    u2Var.setArchivedPullAnimation(this.M);
                    u2Var.setPreloader(this.Q);
                    u2Var.setDialogCellDelegate(this);
                    u2Var.setIsTransitionSupport(this.T);
                    if (i7 == 21) {
                        u2Var.H = new org.telegram.ui.Cells.c7(u2Var.getContext(), u2Var, false, 2131231211, u2Var.K4);
                        u2Var.G = true;
                    }
                    if (j3 != 0) {
                        u2Var.P0 = true;
                    }
                    r22 = u2Var;
                } else {
                    r22 = new g6(context, null);
                }
                if (this.h == 15) {
                    u6.h(n6.f29451d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new vz(context, null);
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
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.f24226q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new o4(context);
                r22.setText(gd.N0(2131746164, null));
                TextView textView = new TextView(context);
                i5.c.x(textView, 1, 15.0f);
                m10.r(textView, n6.L6, null, null, 2131746163);
                if (gd.f24314a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView.setGravity(i11 | 16);
                if (gd.f24314a0) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                r22.addView(textView, na.d(-1, -1.0f, i12 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new z4(this, 3));
                break;
            case 3:
                v2 v2Var = new v2(context, 4);
                u6.h(n6.f29394a7, v2Var, null);
                View view = new View(context);
                u6.Z(view, context, 2131231232, n6.f29415b7);
                v2Var.addView(view, na.c(-1.0f, -1));
                r22 = v2Var;
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f32230n = new a9((i6) null);
                r22.f32234x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = i10.f24637t0;
                n6.T(context);
                imageReceiver.K0(org.telegram.messenger.g0.L(26.0f));
                break;
            case 5:
                r22 = new a3(context);
                break;
            case 6:
                r22 = new sa(context, 8, 0, false);
                break;
            case 7:
                r22 = new o4(context);
                bx bxVar = this.S;
                if (bxVar == null || !bxVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                Drawable Y0 = n6.Y0(context, 2131231232, n6.f29415b7);
                lq lqVar = new lq(new ColorDrawable(n6.x0(null, n6.f29394a7, false)), Y0);
                lqVar.f37204x = true;
                r22.setBackgroundDrawable(lqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new m8(context);
                if (this.h == 15) {
                    u6.h(n6.f29451d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = n6.Y0(context, 2131231232, n6.f29415b7);
                lq lqVar2 = new lq(new ColorDrawable(n6.x0(null, n6.f29394a7, false)), Y02);
                lqVar2.f37204x = true;
                r22.setBackgroundDrawable(lqVar2);
                E(r22, Y02);
                break;
            case 14:
                o4 o4Var2 = new o4(this.f17671c, n6.f29490f7, 16, 0, false, null);
                o4Var2.setHeight(32);
                o4Var2.setClickable(false);
                o4Var = o4Var2;
                r22 = o4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f31258b = new ArrayList();
                r22.setOrientation(1);
                u6.h(n6.f29394a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new c3(context);
                break;
            case 18:
                r22 = new in(context, 3);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new t6(this.f17671c, this.G, null, new f(this, 1), null), na.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new y3(context, null);
                break;
            case 22:
                r22 = new o4(context);
                break;
            case 23:
                ?? u2Var2 = new u2(this.S, this.f17671c, false, this.G, null);
                o4Var = u2Var2;
                if (j3 != 0) {
                    u2Var2.P0 = true;
                    u2Var2.Q0 = true;
                    o4Var = u2Var2;
                }
                r22 = o4Var;
                break;
        }
        if (i7 != 5 && i7 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new v4.q0(-1, i13));
        return new v4.f1(r22);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof u2) {
            u2 u2Var = (u2) view;
            u2Var.c0(this.I, false);
            u2Var.e0(this.f17679y.contains(Long.valueOf(u2Var.getDialogId())), false);
        }
    }

    public void M(TLRPC.User user) {
    }

    @Override
    public void l(u2 u2Var) {
    }

    @Override
    public void r(u2 u2Var) {
    }

    public void K() {
    }

    public void L() {
    }
}
