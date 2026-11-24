package defpackage;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class yw4 extends mz0 implements jm7 {
    public static yw4 s2;
    public final boolean S1;
    public final mk0 T1;
    public final uw4 U1;
    public final ww4 V1;
    public sn2 W1;
    public sn2 X1;
    public sn2 Y1;
    public final LinkedHashMap Z1;
    public final b61 a2;
    public final ArrayList b2;
    public final HashMap c2;
    public final ArrayList d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final ArrayList g2;
    public final ArrayList h2;
    public l7c i2;
    public final boolean j2;
    public String k2;
    public int l2;
    public boolean m2;
    public int n2;
    public int o2;
    public final rja p2;
    public final yy4 q2;
    public final ow4 r2;

    public yw4(Context context, int i, boolean z, mk0 mk0Var, uw4 uw4Var, ww4 ww4Var, ylb ylbVar) {
        super(context, null, true, false, ylbVar);
        mk0 mk0Var2;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.Z1 = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        this.b2 = arrayList;
        HashMap hashMap = new HashMap();
        this.c2 = hashMap;
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.e2 = arrayList3;
        this.f2 = new ArrayList();
        this.g2 = new ArrayList();
        this.h2 = new ArrayList();
        this.l2 = -1;
        this.r2 = new ow4(this, (byte) 0);
        this.a = i;
        this.S1 = z;
        if (uw4Var != null) {
            mk0Var2 = null;
        } else {
            mk0Var2 = mk0Var;
        }
        this.T1 = mk0Var2;
        this.U1 = uw4Var;
        this.V1 = ww4Var;
        this.u1 = 0.35f;
        int i2 = cmb.Z6;
        t0(i2);
        L(i2);
        gm.B2(this.o1);
        this.v1 = false;
        eh0 eh0Var = new eh0(this.X0, new yu3(this, (byte) 29));
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, 0);
        this.n1.r1();
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        this.n1.setOnScrollListener(new ip2(this, (byte) 14));
        this.n1.addOnLayoutChangeListener(new ol1(this, (byte) 2));
        this.n1.setOnItemClickListener(new is(this, ww4Var, uw4Var, (byte) 1));
        rja rjaVar = new rja(context, ylbVar);
        this.p2 = rjaVar;
        rjaVar.setBackButtonImage(2131231244);
        rjaVar.setTitle(J0());
        if (uw4Var != null) {
            rjaVar.setSubtitle(null);
        }
        rjaVar.setActionBarMenuOnItemClick(new fh2(this, (byte) 20));
        zja a = rjaVar.t().a(2, 2131232503);
        a.setContentDescription(jb6.M0(2131745570, null));
        a.N();
        a.C0 = new q20(this, (byte) 11);
        rjaVar.setSearchFieldHint(jb6.M0(2131745570, null));
        eh0Var.f((FrameLayout) this.b, this.n1, rjaVar, ylbVar);
        int i4 = this.u0;
        gm.v3(rjaVar, i4, 0, i4, 0);
        yy4 a2 = eh0Var.a(rjaVar);
        this.q2 = a2;
        rjaVar.setBackground(a2);
        this.X0.i(this.b);
        if (uw4Var != null) {
            int L = gm.L(72.0f);
            r59 r59Var2 = this.n1;
            int i5 = this.u0;
            r59Var2.setPadding(i5, 0, i5, L);
            this.n1.setClipToPadding(false);
            e02 e02Var = new e02(context);
            e02Var.setupColorKey(i2);
            e02Var.setFadeZoneBottom(L);
            e02Var.setFadeHeightBottom(gm.L(24.0f));
            ViewGroup viewGroup = this.b;
            int i6 = this.u0;
            viewGroup.addView(e02Var, qoe.f(72.0f, -1, 80, i6, 0, i6, 0));
            b61 i7 = mlb.i(24, ylbVar, context, true);
            this.a2 = i7;
            i7.setShowZero(false);
            i7.i(uw4Var.b, false, true);
            i7.setOnClickListener(new sf3(this, (byte) 26));
            this.b.addView(i7, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(12.0f)));
            i7.c(linkedHashMap.size(), false);
            i7.setEnabled(!linkedHashMap.isEmpty());
        }
        arrayList.addAll(bw2.r(i).f0);
        hashMap.putAll(bw2.r(i).h0);
        arrayList2.addAll(bw2.r(i).i0);
        arrayList3.addAll(hs6.d0(i).j1);
        if (!z && uw4Var == null && ww4Var == null) {
            z2 = true;
            oo0.l(i, null, new pw4(this, (byte) 1));
            z3 = false;
            jva.v(i, false).T();
        } else {
            z2 = true;
            z3 = false;
        }
        this.j2 = z2;
        this.i2.O(z3);
    }

    public static boolean c1(Intent intent) {
        String lowerCase;
        String path;
        Uri data = intent.getData();
        if (data != null && data.getScheme() != null) {
            String scheme = data.getScheme();
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        f1(false, null);
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
                    f1(false, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static yw4 e1(d dVar, boolean z, mk0 mk0Var, uw4 uw4Var) {
        if (dVar != null && dVar.getContext() != null) {
            yw4 yw4Var = s2;
            if (yw4Var != null) {
                return yw4Var;
            }
            yw4 yw4Var2 = new yw4(dVar.getContext(), dVar.getCurrentAccount(), z, mk0Var, uw4Var, null, dVar.getResourceProvider());
            if (!gm.O1() && !gm.s1(dVar)) {
                yw4Var2.X(dVar);
            }
            dVar.showDialog(yw4Var2);
            s2 = yw4Var2;
            return yw4Var2;
        }
        return null;
    }

    public static yw4 f1(boolean z, mk0 mk0Var) {
        return e1(LaunchActivity.Q(), z, mk0Var, null);
    }

    public static void g1(mk0 mk0Var) {
        f1(true, mk0Var);
    }

    public static int i1(String str, ArrayList arrayList) {
        int i;
        if (arrayList.size() > 1) {
            arrayList.add(c6c.C(null));
            i = gm.L(12.0f);
        } else {
            i = 0;
        }
        if (str != null) {
            arrayList.add(c6c.u(str));
            return gm.L(40.0f) + i;
        }
        return i;
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vt4(this, (byte) 2), this.J0);
        this.i2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final void H() {
        super.H();
        s2 = null;
        gm.r(this.r2);
        if (this.l2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l2, true);
        }
        this.l2 = -1;
    }

    @Override
    public final CharSequence J0() {
        int i;
        uw4 uw4Var = this.U1;
        if (uw4Var != null) {
            return uw4Var.a;
        }
        ww4 ww4Var = this.V1;
        if (ww4Var != null) {
            return ww4Var.a;
        }
        if (this.S1) {
            i = 2131749381;
        } else {
            i = 2131749375;
        }
        return jb6.M0(i, null);
    }

    @Override
    public final void N0(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.n2) {
            this.n2 = size;
            this.o2 = 0;
        }
        int max = Math.max(this.o2, this.q1);
        this.o2 = max;
        this.q1 = max;
    }

    @Override
    public final void R0(Canvas canvas, View view) {
        j1();
        super.R0(canvas, view);
    }

    public final void Y0(ArrayList arrayList, HashSet hashSet) {
        oc7 r1 = oc7.r1(this.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long n = pg3.n((TLRPC.Peer) obj);
            int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if (i2 != 0 && hashSet.add(Long.valueOf(n))) {
                if (i2 < 0) {
                    TLRPC.Chat L0 = r1.L0(Long.valueOf(-n));
                    if (this.V1 != null && L0 != null && sd2.V(L0)) {
                        this.g2.add(L0);
                    }
                } else {
                    TLRPC.User W1 = r1.W1(Long.valueOf(n));
                    if (W1 != null) {
                        this.f2.add(W1);
                    }
                }
            }
        }
    }

    @Override
    public final void Z(Configuration configuration) {
        this.i2.O(false);
    }

    public final int Z0(ArrayList arrayList, int i, String str, ArrayList arrayList2, String str2) {
        uw4 uw4Var;
        tf3 tf3Var;
        int size = arrayList2.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !m9c.C(user.id) && ((uw4Var = this.U1) == null || (!user.self && !m9c.z(user)))) {
                if (z) {
                    i2 += i1(str, arrayList);
                    z = false;
                }
                if (uw4Var != null) {
                    boolean containsKey = this.Z1.containsKey(Long.valueOf(user.id));
                    int i4 = tw4.b;
                    c6c K = c6c.K(tw4.class);
                    K.d = i;
                    K.y = user.id;
                    K.H = user;
                    K.e = containsKey;
                    arrayList.add(K);
                } else {
                    if (str2 == null && this.V1 == null) {
                        tf3Var = new tf3(this, user, (byte) 18);
                    } else {
                        tf3Var = null;
                    }
                    int i5 = xw4.b;
                    c6c K2 = c6c.K(xw4.class);
                    K2.d = i;
                    K2.y = user.id;
                    K2.H = user;
                    K2.n = str2;
                    K2.E = tf3Var;
                    arrayList.add(K2);
                }
                i2 += gm.L(56.0f);
            }
        }
        return i2;
    }

    public final sn2 a1(int i, int i2) {
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        sn2 sn2Var = new sn2(cmb.K(gm.L(40.0f), i2), mutate);
        int L = gm.L(24.0f);
        int L2 = gm.L(24.0f);
        sn2Var.e = L;
        sn2Var.f = L2;
        return sn2Var;
    }

    public final float b1() {
        float f = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            r59 r59Var = this.n1;
            if (i < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i);
                int R = RecyclerView.R(childAt);
                if (R == 1) {
                    return r59Var.getY() + childAt.getY();
                }
                if (R > 1) {
                    f = -3.4028235E38f;
                }
                i++;
            } else {
                return f;
            }
        }
    }

    public final void d1(String str) {
        if (TextUtils.equals(this.k2, str)) {
            return;
        }
        this.k2 = str;
        ow4 ow4Var = this.r2;
        gm.r(ow4Var);
        if (this.l2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l2, true);
        }
        this.l2 = -1;
        this.f2.clear();
        this.g2.clear();
        if (!TextUtils.isEmpty(this.k2)) {
            this.l2 = 0;
            gm.d3(ow4Var, 350L);
        }
        this.i2.O(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.U2) {
            dismiss();
        } else if (i == nm7.N) {
            ArrayList arrayList = this.b2;
            if (arrayList.isEmpty()) {
                bw2 r = bw2.r(this.a);
                arrayList.addAll(r.f0);
                this.c2.putAll(r.h0);
                this.d2.addAll(r.i0);
                this.i2.O(true);
            }
        } else if (i == nm7.S0) {
            ArrayList arrayList2 = this.e2;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(hs6.d0(this.a).j1);
                this.i2.O(true);
            }
        } else if (i == nm7.E0) {
            this.i2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        gm.t1(this.p2);
        super.dismiss();
    }

    public final void h1(long j) {
        gm.t1(this.p2);
        qac qacVar = this.V1.e;
        if (qacVar != null) {
            qacVar.a(Long.valueOf(j));
        }
    }

    public final void j1() {
        float b1 = b1();
        if (b1 == Float.MAX_VALUE) {
            b1 = this.n1.getHeight();
        }
        float max = Math.max(0.0f, b1 - gm.m);
        this.p2.setTranslationY(max);
        this.q2.setAlpha((int) (Utilities.l(1.0f - (max / gm.L(24.0f))) * 255.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7 f = nm7.f(this.a);
        f.b(this, nm7.U2);
        f.b(this, nm7.E0);
        f.b(this, nm7.N);
        f.b(this, nm7.S0);
    }

    @Override
    public final void onBackPressed() {
        if (this.p2.B()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7 f = nm7.f(this.a);
        f.n(this, nm7.U2);
        f.n(this, nm7.E0);
        f.n(this, nm7.N);
        f.n(this, nm7.S0);
    }

    @Override
    public final void p0() {
        super.p0();
        if (this.W1 == null && this.X1 == null && this.Y1 == null) {
            return;
        }
        this.Y1 = null;
        this.X1 = null;
        this.W1 = null;
        this.i2.O(false);
    }
}
