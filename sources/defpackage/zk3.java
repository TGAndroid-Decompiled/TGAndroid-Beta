package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class zk3 extends q59 implements dg3 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public jk3 L;
    public pi3 M;
    public Drawable P;
    public final wk3 Q;
    public boolean R;
    public final nk3 S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean a0;
    public final Context c;
    public ArrayList d;
    public boolean e;
    public int f;
    public int h;
    public boolean n;
    public final int r;
    public long s;
    public int w;
    public final boolean x;
    public final ArrayList y;
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int b0 = -1;

    static {
        boolean z = e21.a;
    }

    public zk3(nk3 nk3Var, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        boolean z2;
        this.c = context;
        this.S = nk3Var;
        this.h = i;
        this.r = i2;
        this.x = z;
        if (i2 == 0 && i == 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.E = z2;
        this.y = arrayList;
        this.G = i3;
        this.W = nk3Var.a3;
        if (i2 == 0) {
            ?? obj = new Object();
            obj.a = new HashSet();
            obj.b = new HashSet();
            obj.c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new jd(obj, (byte) 29);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                anb.x(view, drawable, cmb.a7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        int i = cmb.Z6;
        wa3 wa3Var = new wa3((byte) 12);
        wa3 wa3Var2 = new wa3((byte) 13);
        int P = anb.P(i, -1, 0, 0.0f, null);
        wa3Var2.e(P, view);
        umb w = anb.w(101, view);
        w.c(i, -1, 0, 0.0f, null);
        w.n = wa3Var;
        w.o = wa3Var2;
        w.m = false;
        w.g = P;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 1 && i != 5 && i != 3 && i != 8 && i != 7 && i != 10 && i != 11 && i != 13 && i != 15 && i != 16 && i != 18 && i != 19 && i != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk3.F():int");
    }

    public final int G(long j) {
        for (int i = 0; i < this.N.size(); i++) {
            if (((xk3) this.N.get(i)).c != null && ((xk3) this.N.get(i)).c.id == j) {
                return i;
            }
        }
        return -1;
    }

    public final int H(int i) {
        if (this.F) {
            i--;
        }
        if (this.E) {
            i = ts2.k(2, i, oc7.r1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i--;
        }
        int i2 = this.h;
        if (i2 != 11 && i2 != 13) {
            if (i2 == 12) {
                return i - 1;
            }
            return i;
        }
        return i - 2;
    }

    public final ub7 I() {
        int i = this.h;
        if (i != 7 && i != 8) {
            return null;
        }
        return oc7.r1(this.G).N[this.h - 7];
    }

    public final Object J(int i) {
        if (i >= 0 && i < this.N.size()) {
            xk3 xk3Var = (xk3) this.N.get(i);
            String str = xk3Var.l;
            TLRPC.TL_contact tL_contact = xk3Var.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = xk3Var.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = xk3Var.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = xk3Var.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return oc7.r1(this.G).W1(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = xk3Var.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
            return null;
        }
        return null;
    }

    public final void N(r59 r59Var, boolean z) {
        this.K = z;
        for (int i = 0; i < r59Var.getChildCount(); i++) {
            if (r59Var.getChildAt(i) instanceof hg3) {
                ((hg3) r59Var.getChildAt(i)).f = z;
            }
        }
        for (int i2 = 0; i2 < r59Var.getCachedChildCount(); i2++) {
            if (r59Var.P(i2) instanceof hg3) {
                ((hg3) r59Var.P(i2)).f = z;
            }
        }
        for (int i3 = 0; i3 < r59Var.getHiddenChildCount(); i3++) {
            if (r59Var.W(i3) instanceof hg3) {
                ((hg3) r59Var.W(i3)).f = z;
            }
        }
        for (int i4 = 0; i4 < r59Var.getAttachedScrapChildCount(); i4++) {
            if (r59Var.O(i4) instanceof hg3) {
                ((hg3) r59Var.O(i4)).f = z;
            }
        }
    }

    public boolean O() {
        return false;
    }

    public final void P(boolean z) {
        int i = this.G;
        if (this.d != null) {
            if (!z || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                    Collections.sort(this.d, new dv2(oc7.r1(i), currentTime, (byte) 1));
                    if (z) {
                        f();
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void Q() {
        boolean z;
        if (this.r == 0 && this.h == 0 && !this.x && !oc7.r1(this.G).s.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk3.R():void");
    }

    public final void S(li3 li3Var) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        R();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        tk3 tk3Var = new tk3(this, arrayList2, (byte) 0);
        arrayList3.size();
        tn2 a = ww7.a(tk3Var, true);
        this.a0 = false;
        if (li3Var != null) {
            li3Var.run();
        }
        this.N = arrayList2;
        a.c(this);
    }

    @Override
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override
    public final long c(int i) {
        return ((xk3) this.N.get(i)).k;
    }

    @Override
    public final int d(int i) {
        return ((xk3) this.N.get(i)).a;
    }

    @Override
    public void f() {
        if (this.a0) {
            this.N = new ArrayList();
        }
        this.a0 = false;
        R();
        super.f();
    }

    @Override
    public final void k(hg3 hg3Var) {
        int i = this.G;
        oc7.r1(i);
        if (oc7.r1(i).N1().J(hg3Var.getDialogId())) {
            nk3 nk3Var = this.S;
            nk3Var.getOrCreateStoryViewer().getClass();
            nk3Var.getOrCreateStoryViewer().H(nk3Var.getParentActivity(), hg3Var.getDialogId(), q4b.a((r59) hg3Var.getParent()));
        }
    }

    @Override
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override
    public final void r() {
        boolean z;
        h4b N1 = oc7.r1(this.G).N1();
        ArrayList arrayList = N1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (N1.D(0, pg3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || N1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        this.S.getOrCreateStoryViewer().K(this.c, null, arrayList2, 0, null, null, new q4b(this.L, true), false);
    }

    @Override
    public final void t(defpackage.u69 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk3.t(u69, int):void");
    }

    @Override
    public final void u(hg3 hg3Var) {
        this.S.c5(hg3Var);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        ylb ylbVar;
        ?? r2;
        int i3;
        hg3 hg3Var;
        int i4;
        int i5 = 7;
        nk3 nk3Var = this.S;
        long j = this.W;
        Context context = this.c;
        switch (i) {
            case 0:
            case 21:
                int i6 = this.h;
                if (i6 != 2 && i6 != 15) {
                    i2 = 15;
                    ylbVar = null;
                    hg3 hg3Var2 = new hg3(nk3Var, this.c, false, this.G, null);
                    if (O()) {
                        sk3 sk3Var = new sk3(this, (byte) 0);
                        hg3Var2.K1 = true;
                        hg3Var2.L1 = sk3Var;
                    }
                    hg3Var2.setArchivedPullAnimation(this.M);
                    hg3Var2.setPreloader(this.Q);
                    hg3Var2.setDialogCellDelegate(this);
                    hg3Var2.setIsTransitionSupport(this.T);
                    if (i == 21) {
                        hg3Var2.H = new vca(hg3Var2.getContext(), hg3Var2, false, 2131231212, hg3Var2.K4);
                        hg3Var2.G = true;
                    }
                    if (j != 0) {
                        hg3Var2.P0 = true;
                    }
                    r2 = hg3Var2;
                } else {
                    i2 = 15;
                    ylbVar = null;
                    r2 = new ut8(context, null);
                }
                if (this.h == i2) {
                    anb.h(cmb.c6, ylbVar, r2);
                    break;
                }
                break;
            case 1:
            case 13:
                r2 = new tk4(context, null);
                r2.setIsSingleCell(true);
                if (i == 13) {
                    i5 = 18;
                }
                r2.setViewType(i5);
                if (i5 == 18) {
                    r2.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    r2.setItemsCount((int) ((gm.q.y * 0.5f) / gm.L(64.0f)));
                    break;
                }
                break;
            case 2:
                ?? jf5Var = new jf5(context);
                jf5Var.setText(jb6.M0(2131746093, null));
                TextView textView = new TextView(context);
                ts2.s(textView, 1, 15.0f);
                wi8.x(textView, cmb.K6, null, null, 2131746092);
                int i7 = 3;
                if (jb6.a0) {
                    i3 = 3;
                } else {
                    i3 = 5;
                }
                textView.setGravity(i3 | 16);
                if (!jb6.a0) {
                    i7 = 5;
                }
                jf5Var.addView(textView, qoe.d(-1, -1.0f, i7 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new sf3(this, (byte) 2));
                hg3Var = jf5Var;
                r2 = hg3Var;
                break;
            case 3:
                r2 = new a6(context, (byte) 11);
                anb.h(cmb.Z6, null, r2);
                View view = new View(context);
                anb.Z(view, context, 2131231233, cmb.a7);
                r2.addView(view, qoe.c(-1.0f, -1));
                break;
            case 4:
                r2 = new hg0(context);
                ImageReceiver imageReceiver = new ImageReceiver(r2);
                r2.h = imageReceiver;
                r2.n = new pc0((ylb) null);
                r2.x = gm.L(40.0f);
                r2.G = gm.L(10.0f);
                r2.I = z8c.t0;
                cmb.S(context);
                imageReceiver.q0(gm.L(26.0f));
                break;
            case 5:
                r2 = new ml3(context);
                break;
            case 6:
                r2 = new w8c(context, 8, 0, false);
                break;
            case 7:
                r2 = new jf5(context);
                if (!nk3Var.O0) {
                    r2.setPadding(0, 0, 0, gm.L(12.0f));
                    break;
                }
                break;
            case 8:
                r2 = new bba(context, (hg9) null);
                Drawable W0 = cmb.W0(context, 2131231233, cmb.a7);
                sn2 sn2Var = new sn2(new ColorDrawable(cmb.w0(null, cmb.Z6, false)), W0);
                sn2Var.x = true;
                r2.setBackgroundDrawable(sn2Var);
                E(r2, W0);
                break;
            case 9:
            case 12:
            default:
                r2 = new xib(context);
                if (this.h == 15) {
                    anb.h(cmb.c6, null, r2);
                    break;
                }
                break;
            case 10:
                r2 = new yk3(this, context);
                break;
            case 11:
                r2 = new vk3(this, context);
                Drawable W02 = cmb.W0(context, 2131231233, cmb.a7);
                sn2 sn2Var2 = new sn2(new ColorDrawable(cmb.w0(null, cmb.Z6, false)), W02);
                sn2Var2.x = true;
                r2.setBackgroundDrawable(sn2Var2);
                E(r2, W02);
                break;
            case 14:
                r2 = new jf5(this.c, cmb.e7, 16, 0, false, null);
                r2.setHeight(32);
                r2.setClickable(false);
                break;
            case 15:
                r2 = new LinearLayout(context);
                r2.b = new ArrayList();
                r2.setOrientation(1);
                anb.h(cmb.Z6, null, r2);
                break;
            case 16:
                r2 = new uk3(this, context);
                break;
            case 17:
                r2 = new nl3(context);
                break;
            case 18:
                r2 = new o72(context, (byte) 7);
                break;
            case 19:
                r2 = new yk3(this, context);
                r2.addView(new ys(this.c, this.G, null, new rk3(this, (byte) 1), null), qoe.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r2 = new l55(context, null);
                break;
            case 22:
                r2 = new jf5(context);
                break;
            case 23:
                hg3 hg3Var3 = new hg3(nk3Var, this.c, false, this.G, null);
                hg3Var = hg3Var3;
                if (j != 0) {
                    hg3Var3.P0 = true;
                    hg3Var3.Q0 = true;
                    hg3Var = hg3Var3;
                }
                r2 = hg3Var;
                break;
        }
        if (i != 5 && i != 19) {
            i4 = -2;
        } else {
            i4 = -1;
        }
        r2.setLayoutParams(new g69(-1, i4));
        return new u69(r2);
    }

    @Override
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof hg3) {
            hg3 hg3Var = (hg3) view;
            hg3Var.a0(this.I, false);
            hg3Var.d0(this.y.contains(Long.valueOf(hg3Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    public void o(hg3 hg3Var) {
    }

    public void v(hg3 hg3Var) {
    }
}
