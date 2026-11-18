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
import c8.ma;
import fi.p6;
import fi.y6;
import hi.f9;
import hi.t6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
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
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.cx;
import org.telegram.ui.fv;
import org.telegram.ui.yw;
public class m extends bk0 implements p2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public ck0 L;
    public xg0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final cx S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean f17576a0;
    public final Context f17578c;
    public ArrayList d;
    public boolean f17579e;
    public int f17580f;
    public int h;
    public boolean f17581n;
    public final int f17582r;
    public long f17583s;
    public int f17584w;
    public final boolean f17585x;
    public final ArrayList f17586y;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int f17577b0 = -1;

    static {
        boolean z10 = s2.f26723a;
    }

    public m(cx cxVar, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f17578c = context;
        this.S = cxVar;
        this.h = i7;
        this.f17582r = i10;
        this.f17585x = z10;
        if (i10 == 0 && i7 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        this.f17586y = arrayList;
        this.G = i11;
        this.W = cxVar.f46658a3;
        if (i10 == 0) {
            ?? obj = new Object();
            obj.f17540a = new HashSet();
            obj.f17541b = new HashSet();
            obj.f17542c = new HashSet();
            obj.d = new ArrayList();
            obj.f17543e = new ai.o(obj, 20);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                u6.x(view, drawable, n6.f29360b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = n6.f29339a7;
        f9 f9Var = new f9(5);
        f9 f9Var2 = new f9(6);
        int P = u6.P(i7, -1, 0, 0.0f, null);
        f9Var2.d(P, view);
        o6 w10 = u6.w(101, view);
        w10.c(i7, -1, 0, 0.0f, null);
        w10.f29843n = f9Var;
        w10.f29844o = f9Var2;
        w10.f29842m = false;
        w10.f29837g = P;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 1 && i7 != 5 && i7 != 3 && i7 != 8 && i7 != 7 && i7 != 10 && i7 != 11 && i7 != 13 && i7 != 15 && i7 != 16 && i7 != 18 && i7 != 19 && i7 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i7 = this.G;
        int i10 = this.f17582r;
        cx cxVar = this.S;
        if (cxVar != null && this.W == 0 && cxVar.w4(this.h)) {
            if (this.h == 0 || mp.u1(i7).f25636e2.get(i10)) {
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
        } else if (mp.u1(i7).f25636e2.get(i10)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            if (((k) this.N.get(i7)).f17549c != null && ((k) this.N.get(i7)).f17549c.f28409id == j3) {
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
            i7 = i5.c.f(2, i7, mp.u1(this.G).f25756s);
        }
        if (this.f17581n && this.h == 3) {
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
            String str = kVar.f17556l;
            TLRPC.TL_contact tL_contact = kVar.f17550e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f17557m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f17558n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f17549c;
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
        this.f17581n = z10;
    }

    public final void O(xg0 xg0Var) {
        this.M = xg0Var;
    }

    public final void P(ck0 ck0Var, boolean z10) {
        this.K = z10;
        for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
            if (ck0Var.getChildAt(i7) instanceof t2) {
                ((t2) ck0Var.getChildAt(i7)).f31868f = z10;
            }
        }
        for (int i10 = 0; i10 < ck0Var.getCachedChildCount(); i10++) {
            if (ck0Var.P(i10) instanceof t2) {
                ((t2) ck0Var.P(i10)).f31868f = z10;
            }
        }
        for (int i11 = 0; i11 < ck0Var.getHiddenChildCount(); i11++) {
            if (ck0Var.V(i11) instanceof t2) {
                ((t2) ck0Var.V(i11)).f31868f = z10;
            }
        }
        for (int i12 = 0; i12 < ck0Var.getAttachedScrapChildCount(); i12++) {
            if (ck0Var.O(i12) instanceof t2) {
                ((t2) ck0Var.O(i12)).f31868f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j3) {
        this.f17583s = j3;
    }

    public final void S(yw ywVar) {
        this.L = ywVar;
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
        if (this.f17582r == 0 && this.h == 0 && !this.f17585x && !mp.u1(this.G).f25756s.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: jg.m.W():void");
    }

    public final void X(fv fvVar) {
        if (this.f17576a0) {
            return;
        }
        this.f17576a0 = true;
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
        this.f17576a0 = false;
        if (fvVar != null) {
            fvVar.run();
        }
        this.N = arrayList2;
        c10.c(this);
    }

    @Override
    public final int b() {
        int size = this.N.size();
        this.f17584w = size;
        return size;
    }

    @Override
    public final long c(int i7) {
        return ((k) this.N.get(i7)).f17555k;
    }

    @Override
    public final int d(int i7) {
        return ((k) this.N.get(i7)).f56589a;
    }

    @Override
    public void f() {
        if (this.f17576a0) {
            this.N = new ArrayList();
        }
        this.f17576a0 = false;
        W();
        super.f();
    }

    @Override
    public final boolean m() {
        return this.f17586y.isEmpty();
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
        this.S.getOrCreateStoryViewer().M(this.f17578c, null, arrayList2, 0, null, null, new y6(this.L, true), false);
    }

    @Override
    public final void t(v4.f1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: jg.m.t(v4.f1, int):void");
    }

    @Override
    public final void u(t2 t2Var) {
        int i7 = this.G;
        mp.u1(i7);
        if (mp.u1(i7).R1().K(t2Var.getDialogId())) {
            cx cxVar = this.S;
            cxVar.getOrCreateStoryViewer().getClass();
            cxVar.getOrCreateStoryViewer().J(cxVar.getParentActivity(), t2Var.getDialogId(), y6.a((ck0) t2Var.getParent()));
        }
    }

    @Override
    public final void w(t2 t2Var) {
        this.S.b5(t2Var);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        int i10;
        int i11;
        n4 n4Var;
        int i12;
        int i13 = 3;
        long j3 = this.W;
        Context context = this.f17578c;
        switch (i7) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    t2 t2Var = new t2(this.S, this.f17578c, false, this.G, null);
                    if (T()) {
                        t6 t6Var = new t6(this, 4);
                        t2Var.K1 = true;
                        t2Var.L1 = t6Var;
                    }
                    t2Var.setArchivedPullAnimation(this.M);
                    t2Var.setPreloader(this.Q);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.T);
                    if (i7 == 21) {
                        t2Var.H = new c7(t2Var.getContext(), t2Var, false, 2131231208, t2Var.K4);
                        t2Var.G = true;
                    }
                    if (j3 != 0) {
                        t2Var.P0 = true;
                    }
                    r22 = t2Var;
                } else {
                    r22 = new g6(context, null);
                }
                if (this.h == 15) {
                    u6.h(n6.f29396d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new wz(context, null);
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
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.f24121q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                n4 n4Var2 = new n4(context);
                n4Var2.setText(gd.M0(2131746165, null));
                TextView textView = new TextView(context);
                i5.c.x(textView, 1, 15.0f);
                n10.r(textView, n6.L6, null, null, 2131746164);
                if (gd.f24216a0) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView.setGravity(i11 | 16);
                if (!gd.f24216a0) {
                    i13 = 5;
                }
                n4Var2.addView(textView, ma.d(-1, -1.0f, i13 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new hi.o0(this, 4));
                r22 = n4Var2;
                break;
            case 3:
                bi.p2 p2Var = new bi.p2(context, 4);
                u6.h(n6.f29339a7, p2Var, null);
                View view = new View(context);
                u6.Z(view, context, 2131231229, n6.f29360b7);
                p2Var.addView(view, ma.c(-1.0f, -1));
                r22 = p2Var;
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f32093n = new b9((i6) null);
                r22.f32097x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = j10.f24773t0;
                n6.T(context);
                imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
                break;
            case 5:
                r22 = new z2(context);
                break;
            case 6:
                r22 = new qa(context, 8, 0, false);
                break;
            case 7:
                r22 = new n4(context);
                cx cxVar = this.S;
                if (cxVar == null || !cxVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                Drawable Y0 = n6.Y0(context, 2131231229, n6.f29360b7);
                mq mqVar = new mq(new ColorDrawable(n6.x0(null, n6.f29339a7, false)), Y0);
                mqVar.f37616x = true;
                r22.setBackgroundDrawable(mqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new m8(context);
                if (this.h == 15) {
                    u6.h(n6.f29396d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = n6.Y0(context, 2131231229, n6.f29360b7);
                mq mqVar2 = new mq(new ColorDrawable(n6.x0(null, n6.f29339a7, false)), Y02);
                mqVar2.f37616x = true;
                r22.setBackgroundDrawable(mqVar2);
                E(r22, Y02);
                break;
            case 14:
                n4 n4Var3 = new n4(this.f17578c, n6.f29435f7, 16, 0, false, null);
                n4Var3.setHeight(32);
                n4Var3.setClickable(false);
                n4Var = n4Var3;
                r22 = n4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f31174b = new ArrayList();
                r22.setOrientation(1);
                u6.h(n6.f29339a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new jn(context, 3);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new org.telegram.ui.Components.t6(this.f17578c, this.G, null, new f(this, 1), null), ma.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new x3(context, null);
                break;
            case 22:
                r22 = new n4(context);
                break;
            case 23:
                ?? t2Var2 = new t2(this.S, this.f17578c, false, this.G, null);
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
        r22.setLayoutParams(new v4.q0(-1, i12));
        return new v4.f1(r22);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.a0(this.I, false);
            t2Var.c0(this.f17586y.contains(Long.valueOf(t2Var.getDialogId())), false);
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
