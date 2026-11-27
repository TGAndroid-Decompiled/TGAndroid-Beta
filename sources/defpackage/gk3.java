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
public class gk3 extends c79 implements kf3 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public qj3 L;
    public xh3 M;
    public Drawable P;
    public final dk3 Q;
    public boolean R;
    public final uj3 S;
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
        boolean z = f11.a;
    }

    public gk3(uj3 uj3Var, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        boolean z2;
        this.c = context;
        this.S = uj3Var;
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
        this.W = uj3Var.a3;
        if (i2 == 0) {
            ?? obj = new Object();
            obj.a = new HashSet();
            obj.b = new HashSet();
            obj.c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new kc(obj, (byte) 29);
            this.Q = obj;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                yob.x(view, drawable, aob.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        int i = aob.a7;
        da3 da3Var = new da3((byte) 17);
        da3 da3Var2 = new da3((byte) 18);
        int P = yob.P(i, -1, 0, 0.0f, null);
        da3Var2.e(P, view);
        sob w = yob.w(101, view);
        w.c(i, -1, 0, 0.0f, null);
        w.n = da3Var;
        w.o = da3Var2;
        w.m = false;
        w.g = P;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 1 && i != 5 && i != 3 && i != 8 && i != 7 && i != 10 && i != 11 && i != 13 && i != 15 && i != 16 && i != 18 && i != 19 && i != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.F():int");
    }

    public final int G(long j) {
        for (int i = 0; i < this.N.size(); i++) {
            if (((ek3) this.N.get(i)).c != null && ((ek3) this.N.get(i)).c.id == j) {
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
            i = bs2.k(2, i, uc7.s1(this.G).s);
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

    public final ac7 I() {
        int i = this.h;
        if (i != 7 && i != 8) {
            return null;
        }
        return uc7.s1(this.G).N[this.h - 7];
    }

    public final Object J(int i) {
        if (i >= 0 && i < this.N.size()) {
            ek3 ek3Var = (ek3) this.N.get(i);
            String str = ek3Var.l;
            TLRPC.TL_contact tL_contact = ek3Var.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = ek3Var.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = ek3Var.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = ek3Var.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return uc7.s1(this.G).X1(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = ek3Var.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
            return null;
        }
        return null;
    }

    public final void N(d79 d79Var, boolean z) {
        this.K = z;
        for (int i = 0; i < d79Var.getChildCount(); i++) {
            if (d79Var.getChildAt(i) instanceof of3) {
                ((of3) d79Var.getChildAt(i)).f = z;
            }
        }
        for (int i2 = 0; i2 < d79Var.getCachedChildCount(); i2++) {
            if (d79Var.Q(i2) instanceof of3) {
                ((of3) d79Var.Q(i2)).f = z;
            }
        }
        for (int i3 = 0; i3 < d79Var.getHiddenChildCount(); i3++) {
            if (d79Var.X(i3) instanceof of3) {
                ((of3) d79Var.X(i3)).f = z;
            }
        }
        for (int i4 = 0; i4 < d79Var.getAttachedScrapChildCount(); i4++) {
            if (d79Var.P(i4) instanceof of3) {
                ((of3) d79Var.P(i4)).f = z;
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
                    Collections.sort(this.d, new mu2(uc7.s1(i), currentTime, (byte) 1));
                    if (z) {
                        f();
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void Q() {
        boolean z;
        if (this.r == 0 && this.h == 0 && !this.x && !uc7.s1(this.G).s.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
    }

    public final void R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.R():void");
    }

    public final void S(th3 th3Var) {
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
        ak3 ak3Var = new ak3(this, arrayList2, (byte) 0);
        arrayList3.size();
        an2 a = cy7.a(ak3Var, true);
        this.a0 = false;
        if (th3Var != null) {
            th3Var.run();
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
        return ((ek3) this.N.get(i)).k;
    }

    @Override
    public final int d(int i) {
        return ((ek3) this.N.get(i)).a;
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
    public final void k(of3 of3Var) {
        int i = this.G;
        uc7.s1(i);
        if (uc7.s1(i).O1().J(of3Var.getDialogId())) {
            uj3 uj3Var = this.S;
            uj3Var.getOrCreateStoryViewer().getClass();
            uj3Var.getOrCreateStoryViewer().H(uj3Var.getParentActivity(), of3Var.getDialogId(), l6b.a((d79) of3Var.getParent()));
        }
    }

    @Override
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override
    public final void r() {
        boolean z;
        c6b O1 = uc7.s1(this.G).O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (O1.D(0, wf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || O1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        this.S.getOrCreateStoryViewer().K(this.c, null, arrayList2, 0, null, null, new l6b(this.L, true), false);
    }

    @Override
    public final void t(defpackage.f89 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk3.t(f89, int):void");
    }

    @Override
    public final void v(of3 of3Var) {
        this.S.c5(of3Var);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        View view;
        ?? tk4Var;
        int i2;
        of3 of3Var;
        int i3;
        int i4 = 7;
        uj3 uj3Var = this.S;
        long j = this.W;
        Context context = this.c;
        switch (i) {
            case 0:
            case 21:
                int i5 = this.h;
                if (i5 != 2 && i5 != 15) {
                    vnbVar = null;
                    ?? of3Var2 = new of3(uj3Var, this.c, false, this.G, null);
                    if (O()) {
                        zj3 zj3Var = new zj3(this, (byte) 0);
                        of3Var2.K1 = true;
                        of3Var2.L1 = zj3Var;
                    }
                    of3Var2.setArchivedPullAnimation(this.M);
                    of3Var2.setPreloader(this.Q);
                    of3Var2.setDialogCellDelegate(this);
                    of3Var2.setIsTransitionSupport(this.T);
                    if (i == 21) {
                        of3Var2.H = new mea(of3Var2.getContext(), of3Var2, false, 2131231211, of3Var2.K4);
                        of3Var2.G = true;
                    }
                    if (j != 0) {
                        of3Var2.P0 = true;
                    }
                    view = of3Var2;
                } else {
                    vnbVar = null;
                    view = new bv8(context, null);
                }
                of3Var = view;
                if (this.h == 15) {
                    yob.h(aob.d6, vnbVar, view);
                    of3Var = view;
                    break;
                }
                break;
            case 1:
            case 13:
                tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                if (i == 13) {
                    i4 = 18;
                }
                tk4Var.setViewType(i4);
                if (i4 == 18) {
                    tk4Var.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    tk4Var.setItemsCount((int) ((hl.q.y * 0.5f) / hl.L(64.0f)));
                }
                of3Var = tk4Var;
                break;
            case 2:
                ?? mf5Var = new mf5(context);
                mf5Var.setText(ob6.M0(2131746087, null));
                TextView textView = new TextView(context);
                bs2.t(textView, 1, 15.0f);
                ik8.x(textView, aob.L6, null, null, 2131746086);
                int i6 = 3;
                if (ob6.a0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                textView.setGravity(i2 | 16);
                if (!ob6.a0) {
                    i6 = 5;
                }
                mf5Var.addView(textView, tre.d(-1, -1.0f, i6 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new mh3(this, (byte) 1));
                of3Var = mf5Var;
                break;
            case 3:
                ViewGroup b6Var = new b6(context, (byte) 11);
                yob.h(aob.a7, null, b6Var);
                View view2 = new View(context);
                yob.Z(view2, context, 2131231232, aob.b7);
                b6Var.addView(view2, tre.c(-1.0f, -1));
                of3Var = b6Var;
                break;
            case 4:
                ?? jf0Var = new jf0(context);
                ImageReceiver imageReceiver = new ImageReceiver(jf0Var);
                jf0Var.h = imageReceiver;
                jf0Var.n = new rb0((vnb) null);
                jf0Var.x = hl.L(40.0f);
                jf0Var.G = hl.L(10.0f);
                jf0Var.I = yac.t0;
                aob.S(context);
                imageReceiver.q0(hl.L(26.0f));
                of3Var = jf0Var;
                break;
            case 5:
                of3Var = new tk3(context);
                break;
            case 6:
                of3Var = new vac(context, 8, 0, false);
                break;
            case 7:
                View mf5Var2 = new mf5(context);
                of3Var = mf5Var2;
                if (!uj3Var.O0) {
                    mf5Var2.setPadding(0, 0, 0, hl.L(12.0f));
                    of3Var = mf5Var2;
                    break;
                }
                break;
            case 8:
                View scaVar = new sca(context, (uh9) null);
                Drawable W0 = aob.W0(context, 2131231232, aob.b7);
                zm2 zm2Var = new zm2(new ColorDrawable(aob.w0(null, aob.a7, false)), W0);
                zm2Var.x = true;
                scaVar.setBackgroundDrawable(zm2Var);
                E(scaVar, W0);
                of3Var = scaVar;
                break;
            case 9:
            case 12:
            default:
                View skbVar = new skb(context);
                of3Var = skbVar;
                if (this.h == 15) {
                    yob.h(aob.d6, null, skbVar);
                    of3Var = skbVar;
                    break;
                }
                break;
            case 10:
                of3Var = new fk3(this, context);
                break;
            case 11:
                View ck3Var = new ck3(this, context);
                Drawable W02 = aob.W0(context, 2131231232, aob.b7);
                zm2 zm2Var2 = new zm2(new ColorDrawable(aob.w0(null, aob.a7, false)), W02);
                zm2Var2.x = true;
                ck3Var.setBackgroundDrawable(zm2Var2);
                E(ck3Var, W02);
                of3Var = ck3Var;
                break;
            case 14:
                mf5 mf5Var3 = new mf5(this.c, aob.f7, 16, 0, false, null);
                mf5Var3.setHeight(32);
                mf5Var3.setClickable(false);
                of3Var = mf5Var3;
                break;
            case 15:
                ?? linearLayout = new LinearLayout(context);
                linearLayout.b = new ArrayList();
                linearLayout.setOrientation(1);
                yob.h(aob.a7, null, linearLayout);
                of3Var = linearLayout;
                break;
            case 16:
                of3Var = new bk3(this, context);
                break;
            case 17:
                of3Var = new uk3(context);
                break;
            case 18:
                tk4Var = new t62(context, (byte) 7);
                of3Var = tk4Var;
                break;
            case 19:
                ViewGroup fk3Var = new fk3(this, context);
                fk3Var.addView(new zr(this.c, this.G, null, new yj3(this, (byte) 1), null), tre.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                of3Var = fk3Var;
                break;
            case 20:
                of3Var = new p55(context, null);
                break;
            case 22:
                of3Var = new mf5(context);
                break;
            case 23:
                of3 of3Var3 = new of3(uj3Var, this.c, false, this.G, null);
                if (j != 0) {
                    of3Var3.P0 = true;
                    of3Var3.Q0 = true;
                }
                of3Var = of3Var3;
                break;
        }
        if (i != 5 && i != 19) {
            i3 = -2;
        } else {
            i3 = -1;
        }
        of3Var.setLayoutParams(new r79(-1, i3));
        return new f89(of3Var);
    }

    @Override
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof of3) {
            of3 of3Var = (of3) view;
            of3Var.b0(this.I, false);
            of3Var.d0(this.y.contains(Long.valueOf(of3Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    @Override
    public void o(of3 of3Var) {
    }

    @Override
    public void w(of3 of3Var) {
    }
}
