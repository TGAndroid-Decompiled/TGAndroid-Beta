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
public class oj3 extends n39 implements qe3 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public yi3 L;
    public dh3 M;
    public Drawable P;
    public final lj3 Q;
    public boolean R;
    public final cj3 S;
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
        boolean z = w01.a;
    }

    public oj3(cj3 cj3Var, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        boolean z2;
        this.c = context;
        this.S = cj3Var;
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
        this.W = cj3Var.a3;
        if (i2 == 0) {
            ?? obj = new Object();
            obj.a = new HashSet();
            obj.b = new HashSet();
            obj.c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new jc(obj, (byte) 29);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                zkb.x(view, drawable, bkb.a7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        int i = bkb.Z6;
        k93 k93Var = new k93((byte) 11);
        k93 k93Var2 = new k93((byte) 12);
        int P = zkb.P(i, -1, 0, 0.0f, null);
        k93Var2.d(P, view);
        tkb w = zkb.w(101, view);
        w.c(i, -1, 0, 0.0f, null);
        w.n = k93Var;
        w.o = k93Var2;
        w.m = false;
        w.g = P;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 1 && i != 5 && i != 3 && i != 8 && i != 7 && i != 10 && i != 11 && i != 13 && i != 15 && i != 16 && i != 18 && i != 19 && i != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj3.F():int");
    }

    public final int G(long j) {
        for (int i = 0; i < this.N.size(); i++) {
            if (((mj3) this.N.get(i)).c != null && ((mj3) this.N.get(i)).c.id == j) {
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
            i = ir2.k(2, i, na7.q1(this.G).s);
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

    public final t97 I() {
        int i = this.h;
        if (i != 7 && i != 8) {
            return null;
        }
        return na7.q1(this.G).N[this.h - 7];
    }

    public final Object J(int i) {
        if (i >= 0 && i < this.N.size()) {
            mj3 mj3Var = (mj3) this.N.get(i);
            String str = mj3Var.l;
            TLRPC.TL_contact tL_contact = mj3Var.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = mj3Var.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = mj3Var.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = mj3Var.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return na7.q1(this.G).V1(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = mj3Var.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
            return null;
        }
        return null;
    }

    public final void N(o39 o39Var, boolean z) {
        this.K = z;
        for (int i = 0; i < o39Var.getChildCount(); i++) {
            if (o39Var.getChildAt(i) instanceof ue3) {
                ((ue3) o39Var.getChildAt(i)).f = z;
            }
        }
        for (int i2 = 0; i2 < o39Var.getCachedChildCount(); i2++) {
            if (o39Var.P(i2) instanceof ue3) {
                ((ue3) o39Var.P(i2)).f = z;
            }
        }
        for (int i3 = 0; i3 < o39Var.getHiddenChildCount(); i3++) {
            if (o39Var.W(i3) instanceof ue3) {
                ((ue3) o39Var.W(i3)).f = z;
            }
        }
        for (int i4 = 0; i4 < o39Var.getAttachedScrapChildCount(); i4++) {
            if (o39Var.O(i4) instanceof ue3) {
                ((ue3) o39Var.O(i4)).f = z;
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
                    Collections.sort(this.d, new st2(na7.q1(i), currentTime, (byte) 1));
                    if (z) {
                        f();
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void Q() {
        boolean z;
        if (this.r == 0 && this.h == 0 && !this.x && !na7.q1(this.G).s.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj3.R():void");
    }

    public final void S(zg3 zg3Var) {
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
        ij3 ij3Var = new ij3(this, arrayList2, (byte) 0);
        arrayList3.size();
        gm2 a = vu7.a(ij3Var, true);
        this.a0 = false;
        if (zg3Var != null) {
            zg3Var.run();
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
        return ((mj3) this.N.get(i)).k;
    }

    @Override
    public final int d(int i) {
        return ((mj3) this.N.get(i)).a;
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
    public final void k(ue3 ue3Var) {
        int i = this.G;
        na7.q1(i);
        if (na7.q1(i).M1().J(ue3Var.getDialogId())) {
            cj3 cj3Var = this.S;
            cj3Var.getOrCreateStoryViewer().getClass();
            cj3Var.getOrCreateStoryViewer().H(cj3Var.getParentActivity(), ue3Var.getDialogId(), p2b.a((o39) ue3Var.getParent()));
        }
    }

    @Override
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override
    public final void s() {
        boolean z;
        g2b M1 = na7.q1(this.G).M1();
        ArrayList arrayList = M1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (M1.D(0, cf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || M1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        this.S.getOrCreateStoryViewer().K(this.c, null, arrayList2, 0, null, null, new p2b(this.L, true), false);
    }

    @Override
    public final void t(defpackage.s49 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj3.t(s49, int):void");
    }

    @Override
    public final void v(ue3 ue3Var) {
        this.S.Y4(ue3Var);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        View view;
        ?? pi4Var;
        int i2;
        ue3 ue3Var;
        int i3;
        int i4 = 7;
        cj3 cj3Var = this.S;
        long j = this.W;
        Context context = this.c;
        switch (i) {
            case 0:
            case 21:
                int i5 = this.h;
                if (i5 != 2 && i5 != 15) {
                    wjbVar = null;
                    ?? ue3Var2 = new ue3(cj3Var, this.c, false, this.G, null);
                    if (O()) {
                        hj3 hj3Var = new hj3(this, (byte) 0);
                        ue3Var2.K1 = true;
                        ue3Var2.L1 = hj3Var;
                    }
                    ue3Var2.setArchivedPullAnimation(this.M);
                    ue3Var2.setPreloader(this.Q);
                    ue3Var2.setDialogCellDelegate(this);
                    ue3Var2.setIsTransitionSupport(this.T);
                    if (i == 21) {
                        ue3Var2.H = new vaa(ue3Var2.getContext(), ue3Var2, false, 2131231211, ue3Var2.K4);
                        ue3Var2.G = true;
                    }
                    if (j != 0) {
                        ue3Var2.P0 = true;
                    }
                    view = ue3Var2;
                } else {
                    wjbVar = null;
                    view = new rr8(context, null);
                }
                ue3Var = view;
                if (this.h == 15) {
                    zkb.h(bkb.c6, wjbVar, view);
                    ue3Var = view;
                    break;
                }
                break;
            case 1:
            case 13:
                pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                if (i == 13) {
                    i4 = 18;
                }
                pi4Var.setViewType(i4);
                if (i4 == 18) {
                    pi4Var.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    pi4Var.setItemsCount((int) ((gl.q.y * 0.5f) / gl.L(64.0f)));
                }
                ue3Var = pi4Var;
                break;
            case 2:
                ?? ld5Var = new ld5(context);
                ld5Var.setText(k96.M0(2131746167, null));
                TextView textView = new TextView(context);
                ir2.t(textView, 1, 15.0f);
                ug8.x(textView, bkb.K6, null, null, 2131746166);
                int i6 = 3;
                if (k96.a0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                textView.setGravity(i2 | 16);
                if (!k96.a0) {
                    i6 = 5;
                }
                ld5Var.addView(textView, nme.d(-1, -1.0f, i6 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new x91(this, (byte) 29));
                ue3Var = ld5Var;
                break;
            case 3:
                ViewGroup a6Var = new a6(context, (byte) 11);
                zkb.h(bkb.Z6, null, a6Var);
                View view2 = new View(context);
                zkb.Z(view2, context, 2131231232, bkb.a7);
                a6Var.addView(view2, nme.c(-1.0f, -1));
                ue3Var = a6Var;
                break;
            case 4:
                ?? hf0Var = new hf0(context);
                ImageReceiver imageReceiver = new ImageReceiver(hf0Var);
                hf0Var.h = imageReceiver;
                hf0Var.n = new pb0((wjb) null);
                hf0Var.x = gl.L(40.0f);
                hf0Var.G = gl.L(10.0f);
                hf0Var.I = y6c.t0;
                bkb.S(context);
                imageReceiver.q0(gl.L(26.0f));
                ue3Var = hf0Var;
                break;
            case 5:
                ue3Var = new ck3(context);
                break;
            case 6:
                ue3Var = new v6c(context, 8, 0, false);
                break;
            case 7:
                View ld5Var2 = new ld5(context);
                ue3Var = ld5Var2;
                if (!cj3Var.O0) {
                    ld5Var2.setPadding(0, 0, 0, gl.L(12.0f));
                    ue3Var = ld5Var2;
                    break;
                }
                break;
            case 8:
                View b9aVar = new b9a(context, (de9) null);
                Drawable W0 = bkb.W0(context, 2131231232, bkb.a7);
                fm2 fm2Var = new fm2(new ColorDrawable(bkb.w0(null, bkb.Z6, false)), W0);
                fm2Var.x = true;
                b9aVar.setBackgroundDrawable(fm2Var);
                E(b9aVar, W0);
                ue3Var = b9aVar;
                break;
            case 9:
            case 12:
            default:
                View wgbVar = new wgb(context);
                ue3Var = wgbVar;
                if (this.h == 15) {
                    zkb.h(bkb.c6, null, wgbVar);
                    ue3Var = wgbVar;
                    break;
                }
                break;
            case 10:
                ue3Var = new nj3(this, context);
                break;
            case 11:
                View kj3Var = new kj3(this, context);
                Drawable W02 = bkb.W0(context, 2131231232, bkb.a7);
                fm2 fm2Var2 = new fm2(new ColorDrawable(bkb.w0(null, bkb.Z6, false)), W02);
                fm2Var2.x = true;
                kj3Var.setBackgroundDrawable(fm2Var2);
                E(kj3Var, W02);
                ue3Var = kj3Var;
                break;
            case 14:
                ld5 ld5Var3 = new ld5(this.c, bkb.e7, 16, 0, false, null);
                ld5Var3.setHeight(32);
                ld5Var3.setClickable(false);
                ue3Var = ld5Var3;
                break;
            case 15:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.b = new ArrayList();
                linearLayout.setOrientation(1);
                zkb.h(bkb.Z6, null, linearLayout);
                ue3Var = linearLayout;
                break;
            case 16:
                ue3Var = new jj3(this, context);
                break;
            case 17:
                ue3Var = new dk3(context);
                break;
            case 18:
                pi4Var = new d62(context, (byte) 7);
                ue3Var = pi4Var;
                break;
            case 19:
                ViewGroup nj3Var = new nj3(this, context);
                nj3Var.addView(new yr(this.c, this.G, null, new gj3(this, (byte) 1), null), nme.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                ue3Var = nj3Var;
                break;
            case 20:
                ue3Var = new l35(context, null);
                break;
            case 22:
                ue3Var = new ld5(context);
                break;
            case 23:
                ue3 ue3Var3 = new ue3(cj3Var, this.c, false, this.G, null);
                if (j != 0) {
                    ue3Var3.P0 = true;
                    ue3Var3.Q0 = true;
                }
                ue3Var = ue3Var3;
                break;
        }
        if (i != 5 && i != 19) {
            i3 = -2;
        } else {
            i3 = -1;
        }
        ue3Var.setLayoutParams(new e49(-1, i3));
        return new s49(ue3Var);
    }

    @Override
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof ue3) {
            ue3 ue3Var = (ue3) view;
            ue3Var.c0(this.I, false);
            ue3Var.e0(this.y.contains(Long.valueOf(ue3Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    public void o(ue3 ue3Var) {
    }

    public void w(ue3 ue3Var) {
    }
}
