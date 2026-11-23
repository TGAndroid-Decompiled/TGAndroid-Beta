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
import c8.na;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
public final class f2 extends sa implements gs {
    public static f2 f3527t2;
    public final boolean T1;
    public final org.telegram.messenger.t1 U1;
    public final b2 V1;
    public final d2 W1;
    public oq X1;
    public oq Y1;
    public oq Z1;
    public final LinkedHashMap f3528a2;
    public final hi.d f3529b2;
    public final ArrayList f3530c2;
    public final HashMap d2;
    public final ArrayList f3531e2;
    public final ArrayList f3532f2;
    public final ArrayList f3533g2;
    public final ArrayList f3534h2;
    public final ArrayList f3535i2;
    public c51 f3536j2;
    public final boolean f3537k2;
    public String f3538l2;
    public int f3539m2;
    public boolean f3540n2;
    public int f3541o2;
    public int f3542p2;
    public final org.telegram.ui.ActionBar.z4 f3543q2;
    public final si.f f3544r2;
    public final n1 f3545s2;

    public f2(Context context, int i7, boolean z10, org.telegram.messenger.t1 t1Var, b2 b2Var, d2 d2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, h6Var);
        org.telegram.messenger.t1 t1Var2;
        boolean z11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3528a2 = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        this.f3530c2 = arrayList;
        HashMap hashMap = new HashMap();
        this.d2 = hashMap;
        ArrayList arrayList2 = new ArrayList();
        this.f3531e2 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f3532f2 = arrayList3;
        this.f3533g2 = new ArrayList();
        this.f3534h2 = new ArrayList();
        this.f3535i2 = new ArrayList();
        this.f3539m2 = -1;
        this.f3545s2 = new n1(this, 0);
        this.f30139a = i7;
        this.T1 = z10;
        if (b2Var != null) {
            t1Var2 = null;
        } else {
            t1Var2 = t1Var;
        }
        this.U1 = t1Var2;
        this.V1 = b2Var;
        this.W1 = d2Var;
        this.f39494v1 = 0.35f;
        int i10 = org.telegram.ui.ActionBar.m6.f29290a7;
        w0(i10);
        Q(i10);
        org.telegram.messenger.g0.E2(this.f39488p1);
        this.f39495w1 = false;
        ri.a aVar = new ri.a(this.Y0, new a1.c(this, 15));
        ek0 ek0Var = this.f39487o1;
        int i11 = this.f30177u0;
        ek0Var.setPadding(i11, 0, i11, 0);
        this.f39487o1.r1();
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39487o1.setItemAnimator(kVar);
        this.f39487o1.setOnScrollListener(new v1(this, 0));
        this.f39487o1.addOnLayoutChangeListener(new t1(this, 0));
        this.f39487o1.setOnItemClickListener(new u1(this, d2Var, b2Var, 0));
        org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(context, h6Var);
        this.f3543q2 = z4Var;
        z4Var.setBackButtonImage(2131231240);
        z4Var.setTitle(P0());
        if (b2Var != null) {
            z4Var.setSubtitle(null);
        }
        z4Var.setActionBarMenuOnItemClick(new w1(this, 0));
        org.telegram.ui.ActionBar.g5 b10 = z4Var.t().b(2, 2131232488);
        b10.setContentDescription(hd.N0(2131745640, null));
        b10.O();
        b10.C0 = new x1(this, 0);
        z4Var.setSearchFieldHint(hd.N0(2131745640, null));
        aVar.f((FrameLayout) this.f30142b, this.f39487o1, z4Var, h6Var);
        int i12 = this.f30177u0;
        org.telegram.messenger.g0.z3(z4Var, i12, 0, i12, 0);
        si.f a10 = aVar.a(z4Var);
        this.f3544r2 = a10;
        z4Var.setBackground(a10);
        this.Y0.i(this.f30142b);
        if (b2Var != null) {
            int L = org.telegram.messenger.g0.L(72.0f);
            ek0 ek0Var2 = this.f39487o1;
            int i13 = this.f30177u0;
            ek0Var2.setPadding(i13, 0, i13, L);
            this.f39487o1.setClipToPadding(false);
            lh.f fVar = new lh.f(context);
            fVar.setupColorKey(i10);
            fVar.setFadeZoneBottom(L);
            fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            ViewGroup viewGroup = this.f30142b;
            int i14 = this.f30177u0;
            viewGroup.addView(fVar, na.f(72.0f, -1, 80, i14, 0, i14, 0));
            hi.d g10 = o10.g(24, context, h6Var, true);
            this.f3529b2 = g10;
            g10.setShowZero(false);
            g10.i(b2Var.f3403b, false, true);
            g10.setOnClickListener(new ah.d(this, 5));
            this.f30142b.addView(g10, na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f) + this.f30177u0, 0, org.telegram.messenger.g0.L(12.0f) + this.f30177u0, org.telegram.messenger.g0.L(12.0f)));
            g10.c(linkedHashMap.size(), false);
            g10.setEnabled(!linkedHashMap.isEmpty());
        }
        arrayList.addAll(org.telegram.messenger.i5.r(i7).f24569f0);
        hashMap.putAll(org.telegram.messenger.i5.r(i7).f24571h0);
        arrayList2.addAll(org.telegram.messenger.i5.r(i7).f24572i0);
        arrayList3.addAll(si.d0(i7).f26798j1);
        if (!z10 && b2Var == null && d2Var == null) {
            wg.s.j(i7, null, new p1(this, 1));
            z11 = false;
            di.y8.y(i7, false).T();
        } else {
            z11 = false;
        }
        this.f3537k2 = true;
        this.f3536j2.O(z11);
    }

    public static void e1(f2 f2Var, String str) {
        n1 n1Var = f2Var.f3545s2;
        if (TextUtils.equals(f2Var.f3538l2, str)) {
            return;
        }
        f2Var.f3538l2 = str;
        org.telegram.messenger.g0.r(n1Var);
        if (f2Var.f3539m2 > 0) {
            ConnectionsManager.getInstance(f2Var.f30139a).cancelRequest(f2Var.f3539m2, true);
        }
        f2Var.f3539m2 = -1;
        f2Var.f3533g2.clear();
        f2Var.f3534h2.clear();
        if (!TextUtils.isEmpty(f2Var.f3538l2)) {
            f2Var.f3539m2 = 0;
            org.telegram.messenger.g0.h3(n1Var, 350L);
        }
        f2Var.f3536j2.O(true);
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

    public static f2 k1(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.messenger.t1 t1Var, b2 b2Var) {
        if (g2Var != null && g2Var.getContext() != null) {
            f2 f2Var = f3527t2;
            if (f2Var != null) {
                return f2Var;
            }
            f2 f2Var2 = new f2(g2Var.getContext(), g2Var.getCurrentAccount(), z10, t1Var, b2Var, null, g2Var.getResourceProvider());
            if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(g2Var)) {
                f2Var2.a0(g2Var);
            }
            g2Var.showDialog(f2Var2);
            f3527t2 = f2Var2;
            return f2Var2;
        }
        return null;
    }

    public static f2 l1(boolean z10, org.telegram.messenger.t1 t1Var) {
        return k1(LaunchActivity.Q(), z10, t1Var, null);
    }

    public static void m1(org.telegram.messenger.t1 t1Var) {
        l1(true, t1Var);
    }

    public static int o1(CharSequence charSequence, ArrayList arrayList) {
        int i7;
        if (arrayList.size() > 1) {
            arrayList.add(o41.C(null));
            i7 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i7 = 0;
        }
        if (charSequence != null) {
            arrayList.add(o41.u(charSequence));
            return org.telegram.messenger.g0.L(40.0f) + i7;
        }
        return i7;
    }

    @Override
    public final void L() {
        super.L();
        f3527t2 = null;
        org.telegram.messenger.g0.r(this.f3545s2);
        if (this.f3539m2 > 0) {
            ConnectionsManager.getInstance(this.f30139a).cancelRequest(this.f3539m2, true);
        }
        this.f3539m2 = -1;
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30139a, 0, false, new b(this, 5), this.J0);
        this.f3536j2 = c51Var;
        c51Var.f34026r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        b2 b2Var = this.V1;
        if (b2Var != null) {
            return b2Var.f3402a;
        }
        d2 d2Var = this.W1;
        if (d2Var != null) {
            return (String) d2Var.d;
        }
        if (this.T1) {
            i7 = 2131749431;
        } else {
            i7 = 2131749425;
        }
        return hd.N0(i7, null);
    }

    @Override
    public final void T0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size != this.f3541o2) {
            this.f3541o2 = size;
            this.f3542p2 = 0;
        }
        int max = Math.max(this.f3542p2, this.f39490r1);
        this.f3542p2 = max;
        this.f39490r1 = max;
    }

    @Override
    public final void X0(Canvas canvas, View view) {
        p1();
        super.X0(canvas, view);
    }

    @Override
    public final void c0(Configuration configuration) {
        this.f3536j2.O(false);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.U2) {
            dismiss();
        } else if (i7 == ls.O) {
            ArrayList arrayList = this.f3530c2;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.f30139a);
                arrayList.addAll(r10.f24569f0);
                this.d2.putAll(r10.f24571h0);
                this.f3531e2.addAll(r10.f24572i0);
                this.f3536j2.O(true);
            }
        } else if (i7 == ls.S0) {
            ArrayList arrayList2 = this.f3532f2;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(si.d0(this.f30139a).f26798j1);
                this.f3536j2.O(true);
            }
        } else if (i7 == ls.E0) {
            this.f3536j2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.f3543q2);
        super.dismiss();
    }

    public final void f1(ArrayList arrayList, HashSet hashSet) {
        np u12 = np.u1(this.f30139a);
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
                        this.f3534h2.add(O0);
                    }
                } else {
                    TLRPC.User c22 = u12.c2(Long.valueOf(o4));
                    if (c22 != null) {
                        this.f3533g2.add(c22);
                    }
                }
            }
        }
    }

    public final int g1(ArrayList arrayList, int i7, String str, List list, String str2) {
        b2 b2Var;
        ai.o2 o2Var;
        Iterator it = list.iterator();
        boolean z10 = true;
        int i10 = 0;
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            if (user != null && !user.bot && !p10.B(user.f28547id) && ((b2Var = this.V1) == null || (!user.self && !p10.y(user)))) {
                if (z10) {
                    i10 += o1(str, arrayList);
                    z10 = false;
                }
                if (b2Var != null) {
                    boolean containsKey = this.f3528a2.containsKey(Long.valueOf(user.f28547id));
                    int i11 = a2.f3349b;
                    o41 K = o41.K(a2.class);
                    K.d = i7;
                    K.f38069y = user.f28547id;
                    K.H = user;
                    K.f38051e = containsKey;
                    arrayList.add(K);
                } else {
                    if (str2 == null && this.W1 == null) {
                        o2Var = new ai.o2(2, this, user);
                    } else {
                        o2Var = null;
                    }
                    int i12 = e2.f3480b;
                    o41 K2 = o41.K(e2.class);
                    K2.d = i7;
                    K2.f38069y = user.f28547id;
                    K2.H = user;
                    K2.f38059n = str2;
                    K2.E = o2Var;
                    arrayList.add(K2);
                }
                i10 += org.telegram.messenger.g0.L(56.0f);
            }
        }
        return i10;
    }

    public final oq h1(int i7, int i10) {
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oq oqVar = new oq(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), i10), mutate);
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        oqVar.f38303e = L;
        oqVar.f38304f = L2;
        return oqVar;
    }

    public final float i1() {
        float f10 = Float.MAX_VALUE;
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f39487o1;
            if (i7 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i7);
                int R = RecyclerView.R(childAt);
                if (R == 1) {
                    return ek0Var.getY() + childAt.getY();
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
        org.telegram.messenger.g0.v1(this.f3543q2);
        y10 y10Var = (y10) this.W1.f3458e;
        if (y10Var != null) {
            y10Var.a(Long.valueOf(j3));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls f10 = ls.f(this.f30139a);
        f10.c(this, ls.U2);
        f10.c(this, ls.E0);
        f10.c(this, ls.O);
        f10.c(this, ls.S0);
    }

    @Override
    public final void onBackPressed() {
        if (this.f3543q2.A()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls f10 = ls.f(this.f30139a);
        f10.n(this, ls.U2);
        f10.n(this, ls.E0);
        f10.n(this, ls.O);
        f10.n(this, ls.S0);
    }

    public final void p1() {
        float i12 = i1();
        if (i12 == Float.MAX_VALUE) {
            i12 = this.f39487o1.getHeight();
        }
        float max = Math.max(0.0f, i12 - org.telegram.messenger.g0.f24004m);
        this.f3543q2.setTranslationY(max);
        this.f3544r2.setAlpha((int) (Utilities.l(1.0f - (max / org.telegram.messenger.g0.L(24.0f))) * 255.0f));
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
        this.f3536j2.O(false);
    }
}
