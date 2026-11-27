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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class bx4 extends ny0 implements fn7 {
    public static bx4 s2;
    public final boolean S1;
    public final nj0 T1;
    public final xw4 U1;
    public final zw4 V1;
    public zm2 W1;
    public zm2 X1;
    public zm2 Y1;
    public final LinkedHashMap Z1;
    public final c51 a2;
    public final ArrayList b2;
    public final HashMap c2;
    public final ArrayList d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final ArrayList g2;
    public final ArrayList h2;
    public l9c i2;
    public final boolean j2;
    public String k2;
    public int l2;
    public boolean m2;
    public int n2;
    public int o2;
    public final jla p2;
    public final bz4 q2;
    public final qw4 r2;

    public bx4(Context context, int i, boolean z, nj0 nj0Var, xw4 xw4Var, zw4 zw4Var, vnb vnbVar) {
        super(context, null, true, false, vnbVar);
        nj0 nj0Var2;
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
        this.r2 = new qw4(this, (byte) 0);
        this.a = i;
        this.S1 = z;
        if (xw4Var != null) {
            nj0Var2 = null;
        } else {
            nj0Var2 = nj0Var;
        }
        this.T1 = nj0Var2;
        this.U1 = xw4Var;
        this.V1 = zw4Var;
        this.u1 = 0.35f;
        int i2 = aob.a7;
        t0(i2);
        L(i2);
        hl.B2(this.o1);
        this.v1 = false;
        eg0 eg0Var = new eg0(this.X0, new lu3(this, (byte) 28));
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, 0);
        this.n1.s1();
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        this.n1.setOnScrollListener(new to2(this, (byte) 13));
        this.n1.addOnLayoutChangeListener(new pk1(this, (byte) 2));
        this.n1.setOnItemClickListener(new jr(this, zw4Var, xw4Var, (byte) 1));
        jla jlaVar = new jla(context, vnbVar);
        this.p2 = jlaVar;
        jlaVar.setBackButtonImage(2131231243);
        jlaVar.setTitle(K0());
        if (xw4Var != null) {
            jlaVar.setSubtitle(null);
        }
        jlaVar.setActionBarMenuOnItemClick(new kg2(this, (byte) 20));
        sla a = jlaVar.v().a(2, 2131232502);
        a.setContentDescription(ob6.M0(2131745564, null));
        a.N();
        a.C0 = new r10(this, (byte) 11);
        jlaVar.setSearchFieldHint(ob6.M0(2131745564, null));
        eg0Var.h((FrameLayout) this.b, this.n1, jlaVar, vnbVar);
        int i4 = this.u0;
        hl.v3(jlaVar, i4, 0, i4, 0);
        bz4 a2 = eg0Var.a(jlaVar);
        this.q2 = a2;
        jlaVar.setBackground(a2);
        this.X0.i(this.b);
        if (xw4Var != null) {
            int L = hl.L(72.0f);
            d79 d79Var2 = this.n1;
            int i5 = this.u0;
            d79Var2.setPadding(i5, 0, i5, L);
            this.n1.setClipToPadding(false);
            jz1 jz1Var = new jz1(context);
            jz1Var.setupColorKey(i2);
            jz1Var.setFadeZoneBottom(L);
            jz1Var.setFadeHeightBottom(hl.L(24.0f));
            ViewGroup viewGroup = this.b;
            int i6 = this.u0;
            viewGroup.addView(jz1Var, tre.f(72.0f, -1, 80, i6, 0, i6, 0));
            c51 i7 = xnb.i(24, vnbVar, context, true);
            this.a2 = i7;
            i7.setShowZero(false);
            i7.i(xw4Var.b, false, true);
            i7.setOnClickListener(new mh3(this, (byte) 25));
            this.b.addView(i7, tre.f(48.0f, -1, 80, hl.L(12.0f) + this.u0, 0, hl.L(12.0f) + this.u0, hl.L(12.0f)));
            i7.c(linkedHashMap.size(), false);
            i7.setEnabled(!linkedHashMap.isEmpty());
        }
        arrayList.addAll(lv2.r(i).f0);
        hashMap.putAll(lv2.r(i).h0);
        arrayList2.addAll(lv2.r(i).i0);
        arrayList3.addAll(ls6.d0(i).j1);
        if (!z && xw4Var == null && zw4Var == null) {
            z2 = true;
            on0.l(i, null, new rw4(this, (byte) 1));
            z3 = false;
            jxa.v(i, false).U();
        } else {
            z2 = true;
            z3 = false;
        }
        this.j2 = z2;
        this.i2.O(z3);
    }

    public static boolean d1(Intent intent) {
        String lowerCase;
        String path;
        Uri data = intent.getData();
        if (data != null && data.getScheme() != null) {
            String scheme = data.getScheme();
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                        g1(false, null);
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
                    g1(false, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static bx4 f1(e eVar, boolean z, nj0 nj0Var, xw4 xw4Var) {
        if (eVar != null && eVar.getContext() != null) {
            bx4 bx4Var = s2;
            if (bx4Var != null) {
                return bx4Var;
            }
            bx4 bx4Var2 = new bx4(eVar.getContext(), eVar.getCurrentAccount(), z, nj0Var, xw4Var, null, eVar.getResourceProvider());
            if (!hl.O1() && !hl.s1(eVar)) {
                bx4Var2.X(eVar);
            }
            eVar.showDialog(bx4Var2);
            s2 = bx4Var2;
            return bx4Var2;
        }
        return null;
    }

    public static bx4 g1(boolean z, nj0 nj0Var) {
        return f1(LaunchActivity.Q(), z, nj0Var, null);
    }

    public static void h1(nj0 nj0Var) {
        g1(true, nj0Var);
    }

    public static int j1(String str, ArrayList arrayList) {
        int i;
        if (arrayList.size() > 1) {
            arrayList.add(b8c.C(null));
            i = hl.L(12.0f);
        } else {
            i = 0;
        }
        if (str != null) {
            arrayList.add(b8c.u(str));
            return hl.L(40.0f) + i;
        }
        return i;
    }

    @Override
    public final void H() {
        super.H();
        s2 = null;
        hl.r(this.r2);
        if (this.l2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l2, true);
        }
        this.l2 = -1;
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new yt4(this, (byte) 2), this.J0);
        this.i2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        int i;
        xw4 xw4Var = this.U1;
        if (xw4Var != null) {
            return xw4Var.a;
        }
        zw4 zw4Var = this.V1;
        if (zw4Var != null) {
            return zw4Var.a;
        }
        if (this.S1) {
            i = 2131749378;
        } else {
            i = 2131749372;
        }
        return ob6.M0(i, null);
    }

    @Override
    public final void O0(int i, int i2) {
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
    public final void S0(Canvas canvas, View view) {
        k1();
        super.S0(canvas, view);
    }

    @Override
    public final void Z(Configuration configuration) {
        this.i2.O(false);
    }

    public final void Z0(ArrayList arrayList, HashSet hashSet) {
        uc7 s1 = uc7.s1(this.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long n = wf3.n((TLRPC.Peer) obj);
            int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if (i2 != 0 && hashSet.add(Long.valueOf(n))) {
                if (i2 < 0) {
                    TLRPC.Chat M0 = s1.M0(Long.valueOf(-n));
                    if (this.V1 != null && M0 != null && xc2.V(M0)) {
                        this.g2.add(M0);
                    }
                } else {
                    TLRPC.User X1 = s1.X1(Long.valueOf(n));
                    if (X1 != null) {
                        this.f2.add(X1);
                    }
                }
            }
        }
    }

    public final int a1(ArrayList arrayList, int i, String str, ArrayList arrayList2, String str2) {
        xw4 xw4Var;
        je3 je3Var;
        int size = arrayList2.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !lbc.C(user.id) && ((xw4Var = this.U1) == null || (!user.self && !lbc.z(user)))) {
                if (z) {
                    i2 += j1(str, arrayList);
                    z = false;
                }
                if (xw4Var != null) {
                    boolean containsKey = this.Z1.containsKey(Long.valueOf(user.id));
                    int i4 = ww4.b;
                    b8c K = b8c.K(ww4.class);
                    K.d = i;
                    K.y = user.id;
                    K.H = user;
                    K.e = containsKey;
                    arrayList.add(K);
                } else {
                    if (str2 == null && this.V1 == null) {
                        je3Var = new je3(this, user, (byte) 20);
                    } else {
                        je3Var = null;
                    }
                    int i5 = ax4.b;
                    b8c K2 = b8c.K(ax4.class);
                    K2.d = i;
                    K2.y = user.id;
                    K2.H = user;
                    K2.n = str2;
                    K2.E = je3Var;
                    arrayList.add(K2);
                }
                i2 += hl.L(56.0f);
            }
        }
        return i2;
    }

    public final zm2 b1(int i, int i2) {
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        zm2 zm2Var = new zm2(aob.K(hl.L(40.0f), i2), mutate);
        int L = hl.L(24.0f);
        int L2 = hl.L(24.0f);
        zm2Var.e = L;
        zm2Var.f = L2;
        return zm2Var;
    }

    public final float c1() {
        float f = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i);
                int S = RecyclerView.S(childAt);
                if (S == 1) {
                    return d79Var.getY() + childAt.getY();
                }
                if (S > 1) {
                    f = -3.4028235E38f;
                }
                i++;
            } else {
                return f;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.U2) {
            dismiss();
        } else if (i == jn7.N) {
            ArrayList arrayList = this.b2;
            if (arrayList.isEmpty()) {
                lv2 r = lv2.r(this.a);
                arrayList.addAll(r.f0);
                this.c2.putAll(r.h0);
                this.d2.addAll(r.i0);
                this.i2.O(true);
            }
        } else if (i == jn7.S0) {
            ArrayList arrayList2 = this.e2;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(ls6.d0(this.a).j1);
                this.i2.O(true);
            }
        } else if (i == jn7.E0) {
            this.i2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        hl.t1(this.p2);
        super.dismiss();
    }

    public final void e1(String str) {
        if (TextUtils.equals(this.k2, str)) {
            return;
        }
        this.k2 = str;
        qw4 qw4Var = this.r2;
        hl.r(qw4Var);
        if (this.l2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l2, true);
        }
        this.l2 = -1;
        this.f2.clear();
        this.g2.clear();
        if (!TextUtils.isEmpty(this.k2)) {
            this.l2 = 0;
            hl.d3(qw4Var, 350L);
        }
        this.i2.O(true);
    }

    public final void i1(long j) {
        hl.t1(this.p2);
        pcc pccVar = this.V1.e;
        if (pccVar != null) {
            pccVar.a(Long.valueOf(j));
        }
    }

    public final void k1() {
        float c1 = c1();
        if (c1 == Float.MAX_VALUE) {
            c1 = this.n1.getHeight();
        }
        float max = Math.max(0.0f, c1 - hl.m);
        this.p2.setTranslationY(max);
        this.q2.setAlpha((int) (Utilities.l(1.0f - (max / hl.L(24.0f))) * 255.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7 f = jn7.f(this.a);
        f.b(this, jn7.U2);
        f.b(this, jn7.E0);
        f.b(this, jn7.N);
        f.b(this, jn7.S0);
    }

    @Override
    public final void onBackPressed() {
        if (this.p2.E()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7 f = jn7.f(this.a);
        f.n(this, jn7.U2);
        f.n(this, jn7.E0);
        f.n(this, jn7.N);
        f.n(this, jn7.S0);
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
