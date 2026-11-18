package bi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
public final class a2 extends sa implements fs {
    public static a2 f3380t2;
    public final boolean T1;
    public final org.telegram.messenger.t1 U1;
    public final w1 V1;
    public final y1 W1;
    public mq X1;
    public mq Y1;
    public mq Z1;
    public final LinkedHashMap f3381a2;
    public final hi.d f3382b2;
    public final ArrayList f3383c2;
    public final HashMap d2;
    public final ArrayList f3384e2;
    public final ArrayList f3385f2;
    public final ArrayList f3386g2;
    public final ArrayList f3387h2;
    public final ArrayList f3388i2;
    public z41 f3389j2;
    public final boolean f3390k2;
    public String f3391l2;
    public int f3392m2;
    public boolean f3393n2;
    public int f3394o2;
    public int f3395p2;
    public final org.telegram.ui.ActionBar.a5 f3396q2;
    public final si.f f3397r2;
    public final j1 f3398s2;

    public a2(Context context, int i7, boolean z10, org.telegram.messenger.t1 t1Var, w1 w1Var, y1 y1Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, true, false, i6Var);
        org.telegram.messenger.t1 t1Var2;
        boolean z11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3381a2 = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        this.f3383c2 = arrayList;
        HashMap hashMap = new HashMap();
        this.d2 = hashMap;
        ArrayList arrayList2 = new ArrayList();
        this.f3384e2 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f3385f2 = arrayList3;
        this.f3386g2 = new ArrayList();
        this.f3387h2 = new ArrayList();
        this.f3388i2 = new ArrayList();
        this.f3392m2 = -1;
        this.f3398s2 = new j1(this, 0);
        this.f30187a = i7;
        this.T1 = z10;
        if (w1Var != null) {
            t1Var2 = null;
        } else {
            t1Var2 = t1Var;
        }
        this.U1 = t1Var2;
        this.V1 = w1Var;
        this.W1 = y1Var;
        this.f39541v1 = 0.35f;
        int i10 = org.telegram.ui.ActionBar.n6.f29337a7;
        w0(i10);
        Q(i10);
        org.telegram.messenger.g0.E2(this.f39535p1);
        this.f39542w1 = false;
        ri.a aVar = new ri.a(this.Y0, new a1.c(this, 14));
        ck0 ck0Var = this.f39534o1;
        int i11 = this.f30225u0;
        ck0Var.setPadding(i11, 0, i11, 0);
        this.f39534o1.r1();
        v4.k kVar = new v4.k();
        kVar.f59152m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.f39534o1.setItemAnimator(kVar);
        this.f39534o1.setOnScrollListener(new q1(this, 0));
        this.f39534o1.addOnLayoutChangeListener(new o1(this, 0));
        this.f39534o1.setOnItemClickListener(new p1(this, y1Var, w1Var, 0));
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(context, i6Var);
        this.f3396q2 = a5Var;
        a5Var.setBackButtonImage(2131231240);
        a5Var.setTitle(P0());
        if (w1Var != null) {
            a5Var.setSubtitle(null);
        }
        a5Var.setActionBarMenuOnItemClick(new r1(this, 0));
        org.telegram.ui.ActionBar.h5 b10 = a5Var.t().b(2, 2131232488);
        b10.setContentDescription(gd.M0(2131745641, null));
        b10.O();
        b10.C0 = new s1(this, 0);
        a5Var.setSearchFieldHint(gd.M0(2131745641, null));
        aVar.f((FrameLayout) this.f30190b, this.f39534o1, a5Var, i6Var);
        int i12 = this.f30225u0;
        org.telegram.messenger.g0.z3(a5Var, i12, 0, i12, 0);
        si.f a10 = aVar.a(a5Var);
        this.f3397r2 = a10;
        a5Var.setBackground(a10);
        this.Y0.i(this.f30190b);
        if (w1Var != null) {
            int L = org.telegram.messenger.g0.L(72.0f);
            ck0 ck0Var2 = this.f39534o1;
            int i13 = this.f30225u0;
            ck0Var2.setPadding(i13, 0, i13, L);
            this.f39534o1.setClipToPadding(false);
            lh.f fVar = new lh.f(context);
            fVar.setupColorKey(i10);
            fVar.setFadeZoneBottom(L);
            fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            ViewGroup viewGroup = this.f30190b;
            int i14 = this.f30225u0;
            viewGroup.addView(fVar, ma.f(72.0f, -1, 80, i14, 0, i14, 0));
            hi.d g10 = n10.g(24, context, i6Var, true);
            this.f3382b2 = g10;
            g10.setShowZero(false);
            g10.i(w1Var.f4142b, false, true);
            g10.setOnClickListener(new ah.d(this, 6));
            this.f30190b.addView(g10, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f) + this.f30225u0, 0, org.telegram.messenger.g0.L(12.0f) + this.f30225u0, org.telegram.messenger.g0.L(12.0f)));
            g10.c(linkedHashMap.size(), false);
            g10.setEnabled(!linkedHashMap.isEmpty());
        }
        arrayList.addAll(org.telegram.messenger.i5.r(i7).f24567f0);
        hashMap.putAll(org.telegram.messenger.i5.r(i7).f24569h0);
        arrayList2.addAll(org.telegram.messenger.i5.r(i7).f24570i0);
        arrayList3.addAll(ri.d0(i7).f26620j1);
        if (!z10 && w1Var == null && y1Var == null) {
            wg.s.j(i7, null, new l1(this, 1));
            z11 = false;
            di.x8.y(i7, false).T();
        } else {
            z11 = false;
        }
        this.f3390k2 = true;
        this.f3389j2.O(z11);
    }

    public static void e1(a2 a2Var, String str) {
        j1 j1Var = a2Var.f3398s2;
        if (TextUtils.equals(a2Var.f3391l2, str)) {
            return;
        }
        a2Var.f3391l2 = str;
        org.telegram.messenger.g0.r(j1Var);
        if (a2Var.f3392m2 > 0) {
            ConnectionsManager.getInstance(a2Var.f30187a).cancelRequest(a2Var.f3392m2, true);
        }
        a2Var.f3392m2 = -1;
        a2Var.f3386g2.clear();
        a2Var.f3387h2.clear();
        if (!TextUtils.isEmpty(a2Var.f3391l2)) {
            a2Var.f3392m2 = 0;
            org.telegram.messenger.g0.h3(j1Var, 350L);
        }
        a2Var.f3389j2.O(true);
    }

    public static boolean j1(Intent intent) {
        String lowerCase;
        String path;
        Uri data = intent.getData();
        if (data != null && data.getScheme() != null) {
            String scheme = data.getScheme();
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        l1(false, null);
                        return true;
                    }
                }
            } else {
                if (data.getHost() == null) {
                    lowerCase = "";
                } else {
                    lowerCase = data.getHost().toLowerCase();
                }
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    l1(false, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static a2 k1(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.messenger.t1 t1Var, w1 w1Var) {
        if (h2Var != null && h2Var.getContext() != null) {
            a2 a2Var = f3380t2;
            if (a2Var != null) {
                return a2Var;
            }
            a2 a2Var2 = new a2(h2Var.getContext(), h2Var.getCurrentAccount(), z10, t1Var, w1Var, null, h2Var.getResourceProvider());
            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(h2Var)) {
                a2Var2.a0(h2Var);
            }
            h2Var.showDialog(a2Var2);
            f3380t2 = a2Var2;
            return a2Var2;
        }
        return null;
    }

    public static a2 l1(boolean z10, org.telegram.messenger.t1 t1Var) {
        return k1(LaunchActivity.Q(), z10, t1Var, null);
    }

    public static void m1(org.telegram.messenger.t1 t1Var) {
        l1(true, t1Var);
    }

    public static int o1(CharSequence charSequence, ArrayList arrayList) {
        int i7;
        if (arrayList.size() > 1) {
            arrayList.add(l41.C(null));
            i7 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i7 = 0;
        }
        if (charSequence != null) {
            arrayList.add(l41.u(charSequence));
            return org.telegram.messenger.g0.L(40.0f) + i7;
        }
        return i7;
    }

    @Override
    public final void L() {
        super.L();
        f3380t2 = null;
        org.telegram.messenger.g0.r(this.f3398s2);
        if (this.f3392m2 > 0) {
            ConnectionsManager.getInstance(this.f30187a).cancelRequest(this.f3392m2, true);
        }
        this.f3392m2 = -1;
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30187a, 0, false, new b(this, 5), this.J0);
        this.f3389j2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        w1 w1Var = this.V1;
        if (w1Var != null) {
            return w1Var.f4141a;
        }
        y1 y1Var = this.W1;
        if (y1Var != null) {
            return (String) y1Var.d;
        }
        if (this.T1) {
            i7 = 2131749432;
        } else {
            i7 = 2131749426;
        }
        return gd.M0(i7, null);
    }

    @Override
    public final void T0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size != this.f3394o2) {
            this.f3394o2 = size;
            this.f3395p2 = 0;
        }
        int max = Math.max(this.f3395p2, this.f39537r1);
        this.f3395p2 = max;
        this.f39537r1 = max;
    }

    @Override
    public final void X0(Canvas canvas, View view) {
        p1();
        super.X0(canvas, view);
    }

    @Override
    public final void c0(Configuration configuration) {
        this.f3389j2.O(false);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.U2) {
            dismiss();
        } else if (i7 == ks.O) {
            ArrayList arrayList = this.f3383c2;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.f30187a);
                arrayList.addAll(r10.f24567f0);
                this.d2.putAll(r10.f24569h0);
                this.f3384e2.addAll(r10.f24570i0);
                this.f3389j2.O(true);
            }
        } else if (i7 == ks.S0) {
            ArrayList arrayList2 = this.f3385f2;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(ri.d0(this.f30187a).f26620j1);
                this.f3389j2.O(true);
            }
        } else if (i7 == ks.E0) {
            this.f3389j2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.f3396q2);
        super.dismiss();
    }

    public final void f1(ArrayList arrayList, HashSet hashSet) {
        mp u12 = mp.u1(this.f30187a);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) obj);
            int i10 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            if (i10 != 0 && hashSet.add(Long.valueOf(o4))) {
                if (i10 < 0) {
                    TLRPC.Chat O0 = u12.O0(Long.valueOf(-o4));
                    if (this.W1 != null && O0 != null && org.telegram.messenger.v3.V(O0)) {
                        this.f3387h2.add(O0);
                    }
                } else {
                    TLRPC.User c22 = u12.c2(Long.valueOf(o4));
                    if (c22 != null) {
                        this.f3386g2.add(c22);
                    }
                }
            }
        }
    }

    public final int g1(ArrayList arrayList, int i7, String str, List list, String str2) {
        w1 w1Var;
        ai.v2 v2Var;
        Iterator it = list.iterator();
        boolean z10 = true;
        int i10 = 0;
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            if (user != null && !user.bot && !o10.B(user.f28552id) && ((w1Var = this.V1) == null || (!user.self && !o10.y(user)))) {
                if (z10) {
                    i10 += o1(str, arrayList);
                    z10 = false;
                }
                if (w1Var != null) {
                    boolean containsKey = this.f3381a2.containsKey(Long.valueOf(user.f28552id));
                    int i11 = v1.f4116b;
                    l41 K = l41.K(v1.class);
                    K.d = i7;
                    K.f37029y = user.f28552id;
                    K.H = user;
                    K.f37011e = containsKey;
                    arrayList.add(K);
                } else {
                    if (str2 == null && this.W1 == null) {
                        v2Var = new ai.v2(3, this, user);
                    } else {
                        v2Var = null;
                    }
                    int i12 = z1.f4263b;
                    l41 K2 = l41.K(z1.class);
                    K2.d = i7;
                    K2.f37029y = user.f28552id;
                    K2.H = user;
                    K2.f37019n = str2;
                    K2.E = v2Var;
                    arrayList.add(K2);
                }
                i10 += org.telegram.messenger.g0.L(56.0f);
            }
        }
        return i10;
    }

    public final mq h1(int i7, int i10) {
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mq mqVar = new mq(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(40.0f), i10), mutate);
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        mqVar.f37610e = L;
        mqVar.f37611f = L2;
        return mqVar;
    }

    public final float i1() {
        float f10 = Float.MAX_VALUE;
        int i7 = 0;
        while (true) {
            ck0 ck0Var = this.f39534o1;
            if (i7 < ck0Var.getChildCount()) {
                View childAt = ck0Var.getChildAt(i7);
                int R = RecyclerView.R(childAt);
                if (R == 1) {
                    return ck0Var.getY() + childAt.getY();
                }
                if (R > 1) {
                    f10 = -3.4028235E38f;
                }
                i7++;
            } else {
                return f10;
            }
        }
    }

    public final void n1(long j3) {
        org.telegram.messenger.g0.v1(this.f3396q2);
        x10 x10Var = (x10) this.W1.f4219e;
        if (x10Var != null) {
            x10Var.a(Long.valueOf(j3));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks f10 = ks.f(this.f30187a);
        f10.c(this, ks.U2);
        f10.c(this, ks.E0);
        f10.c(this, ks.O);
        f10.c(this, ks.S0);
    }

    @Override
    public final void onBackPressed() {
        if (this.f3396q2.A()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks f10 = ks.f(this.f30187a);
        f10.n(this, ks.U2);
        f10.n(this, ks.E0);
        f10.n(this, ks.O);
        f10.n(this, ks.S0);
    }

    public final void p1() {
        float i12 = i1();
        if (i12 == Float.MAX_VALUE) {
            i12 = this.f39534o1.getHeight();
        }
        float max = Math.max(0.0f, i12 - org.telegram.messenger.g0.f24112m);
        this.f3396q2.setTranslationY(max);
        this.f3397r2.setAlpha((int) (Utilities.l(1.0f - (max / org.telegram.messenger.g0.L(24.0f))) * 255.0f));
    }

    @Override
    public final void s0() {
        super.s0();
        if (this.X1 == null && this.Y1 == null && this.Z1 == null) {
            return;
        }
        this.Z1 = null;
        this.Y1 = null;
        this.X1 = null;
        this.f3389j2.O(false);
    }
}
