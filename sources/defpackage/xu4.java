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
public final class xu4 extends fy0 implements gk7 {
    public static xu4 s2;
    public final boolean S1;
    public final mj0 T1;
    public final tu4 U1;
    public final vu4 V1;
    public fm2 W1;
    public fm2 X1;
    public fm2 Y1;
    public final LinkedHashMap Z1;
    public final u41 a2;
    public final ArrayList b2;
    public final HashMap c2;
    public final ArrayList d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final ArrayList g2;
    public final ArrayList h2;
    public l5c i2;
    public final boolean j2;
    public String k2;
    public int l2;
    public boolean m2;
    public int n2;
    public int o2;
    public final pha p2;
    public final ww4 q2;
    public final nu4 r2;

    public xu4(Context context, int i, boolean z, mj0 mj0Var, tu4 tu4Var, vu4 vu4Var, wjb wjbVar) {
        super(context, null, true, false, wjbVar);
        mj0 mj0Var2;
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
        this.r2 = new nu4(this, (byte) 0);
        this.a = i;
        this.S1 = z;
        if (tu4Var != null) {
            mj0Var2 = null;
        } else {
            mj0Var2 = mj0Var;
        }
        this.T1 = mj0Var2;
        this.U1 = tu4Var;
        this.V1 = vu4Var;
        this.u1 = 0.35f;
        int i2 = bkb.Z6;
        t0(i2);
        M(i2);
        gl.B2(this.o1);
        this.v1 = false;
        dg0 dg0Var = new dg0(this.X0, new kx3(this, (byte) 26));
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, 0);
        this.n1.r1();
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        this.n1.setOnScrollListener(new ao2(this, (byte) 13));
        this.n1.addOnLayoutChangeListener(new gk1(this, (byte) 2));
        this.n1.setOnItemClickListener(new ir(this, vu4Var, tu4Var, (byte) 1));
        pha phaVar = new pha(context, wjbVar);
        this.p2 = phaVar;
        phaVar.setBackButtonImage(2131231243);
        phaVar.setTitle(J0());
        if (tu4Var != null) {
            phaVar.setSubtitle(null);
        }
        phaVar.setActionBarMenuOnItemClick(new vm2(this, (byte) 19));
        xha a = phaVar.t().a(2, 2131232491);
        a.setContentDescription(k96.M0(2131745644, null));
        a.N();
        a.C0 = new q10(this, (byte) 11);
        phaVar.setSearchFieldHint(k96.M0(2131745644, null));
        dg0Var.f((FrameLayout) this.b, this.n1, phaVar, wjbVar);
        int i4 = this.u0;
        gl.v3(phaVar, i4, 0, i4, 0);
        ww4 a2 = dg0Var.a(phaVar);
        this.q2 = a2;
        phaVar.setBackground(a2);
        this.X0.i(this.b);
        if (tu4Var != null) {
            int L = gl.L(72.0f);
            o39 o39Var2 = this.n1;
            int i5 = this.u0;
            o39Var2.setPadding(i5, 0, i5, L);
            this.n1.setClipToPadding(false);
            ry1 ry1Var = new ry1(context);
            ry1Var.setupColorKey(i2);
            ry1Var.setFadeZoneBottom(L);
            ry1Var.setFadeHeightBottom(gl.L(24.0f));
            ViewGroup viewGroup = this.b;
            int i6 = this.u0;
            viewGroup.addView(ry1Var, nme.f(72.0f, -1, 80, i6, 0, i6, 0));
            u41 i7 = yjb.i(24, wjbVar, context, true);
            this.a2 = i7;
            i7.setShowZero(false);
            i7.i(tu4Var.b, false, true);
            i7.setOnClickListener(new yj3(this, (byte) 23));
            this.b.addView(i7, nme.f(48.0f, -1, 80, gl.L(12.0f) + this.u0, 0, gl.L(12.0f) + this.u0, gl.L(12.0f)));
            i7.c(linkedHashMap.size(), false);
            i7.setEnabled(!linkedHashMap.isEmpty());
        }
        arrayList.addAll(qu2.r(i).f0);
        hashMap.putAll(qu2.r(i).h0);
        arrayList2.addAll(qu2.r(i).i0);
        arrayList3.addAll(hq6.d0(i).j1);
        if (!z && tu4Var == null && vu4Var == null) {
            z2 = true;
            on0.l(i, null, new ou4(this, (byte) 1));
            z3 = false;
            gta.v(i, false).T();
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

    public static xu4 e1(d dVar, boolean z, mj0 mj0Var, tu4 tu4Var) {
        if (dVar != null && dVar.getContext() != null) {
            xu4 xu4Var = s2;
            if (xu4Var != null) {
                return xu4Var;
            }
            xu4 xu4Var2 = new xu4(dVar.getContext(), dVar.getCurrentAccount(), z, mj0Var, tu4Var, null, dVar.getResourceProvider());
            if (!gl.O1() && !gl.s1(dVar)) {
                xu4Var2.X(dVar);
            }
            dVar.showDialog(xu4Var2);
            s2 = xu4Var2;
            return xu4Var2;
        }
        return null;
    }

    public static xu4 f1(boolean z, mj0 mj0Var) {
        return e1(LaunchActivity.Q(), z, mj0Var, null);
    }

    public static void g1(mj0 mj0Var) {
        f1(true, mj0Var);
    }

    public static int i1(String str, ArrayList arrayList) {
        int i;
        if (arrayList.size() > 1) {
            arrayList.add(c4c.C(null));
            i = gl.L(12.0f);
        } else {
            i = 0;
        }
        if (str != null) {
            arrayList.add(c4c.u(str));
            return gl.L(40.0f) + i;
        }
        return i;
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new ur4(this, (byte) 2), this.J0);
        this.i2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final void I() {
        super.I();
        s2 = null;
        gl.r(this.r2);
        if (this.l2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l2, true);
        }
        this.l2 = -1;
    }

    @Override
    public final CharSequence J0() {
        int i;
        tu4 tu4Var = this.U1;
        if (tu4Var != null) {
            return tu4Var.a;
        }
        vu4 vu4Var = this.V1;
        if (vu4Var != null) {
            return vu4Var.a;
        }
        if (this.S1) {
            i = 2131749432;
        } else {
            i = 2131749426;
        }
        return k96.M0(i, null);
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
        na7 q1 = na7.q1(this.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long n = cf3.n((TLRPC.Peer) obj);
            int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            if (i2 != 0 && hashSet.add(Long.valueOf(n))) {
                if (i2 < 0) {
                    TLRPC.Chat K0 = q1.K0(Long.valueOf(-n));
                    if (this.V1 != null && K0 != null && hc2.V(K0)) {
                        this.g2.add(K0);
                    }
                } else {
                    TLRPC.User V1 = q1.V1(Long.valueOf(n));
                    if (V1 != null) {
                        this.f2.add(V1);
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
        tu4 tu4Var;
        xf3 xf3Var;
        int size = arrayList2.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !l7c.C(user.id) && ((tu4Var = this.U1) == null || (!user.self && !l7c.z(user)))) {
                if (z) {
                    i2 += i1(str, arrayList);
                    z = false;
                }
                if (tu4Var != null) {
                    boolean containsKey = this.Z1.containsKey(Long.valueOf(user.id));
                    int i4 = su4.b;
                    c4c K = c4c.K(su4.class);
                    K.d = i;
                    K.y = user.id;
                    K.H = user;
                    K.e = containsKey;
                    arrayList.add(K);
                } else {
                    if (str2 == null && this.V1 == null) {
                        xf3Var = new xf3(this, user, (byte) 17);
                    } else {
                        xf3Var = null;
                    }
                    int i5 = wu4.b;
                    c4c K2 = c4c.K(wu4.class);
                    K2.d = i;
                    K2.y = user.id;
                    K2.H = user;
                    K2.n = str2;
                    K2.E = xf3Var;
                    arrayList.add(K2);
                }
                i2 += gl.L(56.0f);
            }
        }
        return i2;
    }

    public final fm2 a1(int i, int i2) {
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fm2 fm2Var = new fm2(bkb.K(gl.L(40.0f), i2), mutate);
        int L = gl.L(24.0f);
        int L2 = gl.L(24.0f);
        fm2Var.e = L;
        fm2Var.f = L2;
        return fm2Var;
    }

    public final float b1() {
        float f = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            o39 o39Var = this.n1;
            if (i < o39Var.getChildCount()) {
                View childAt = o39Var.getChildAt(i);
                int R = RecyclerView.R(childAt);
                if (R == 1) {
                    return o39Var.getY() + childAt.getY();
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
        nu4 nu4Var = this.r2;
        gl.r(nu4Var);
        if (this.l2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l2, true);
        }
        this.l2 = -1;
        this.f2.clear();
        this.g2.clear();
        if (!TextUtils.isEmpty(this.k2)) {
            this.l2 = 0;
            gl.d3(nu4Var, 350L);
        }
        this.i2.O(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.T2) {
            dismiss();
        } else if (i == kk7.N) {
            ArrayList arrayList = this.b2;
            if (arrayList.isEmpty()) {
                qu2 r = qu2.r(this.a);
                arrayList.addAll(r.f0);
                this.c2.putAll(r.h0);
                this.d2.addAll(r.i0);
                this.i2.O(true);
            }
        } else if (i == kk7.R0) {
            ArrayList arrayList2 = this.e2;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(hq6.d0(this.a).j1);
                this.i2.O(true);
            }
        } else if (i == kk7.D0) {
            this.i2.O(true);
        }
    }

    @Override
    public final void dismiss() {
        gl.t1(this.p2);
        super.dismiss();
    }

    public final void h1(long j) {
        gl.t1(this.p2);
        p8c p8cVar = this.V1.e;
        if (p8cVar != null) {
            p8cVar.a(Long.valueOf(j));
        }
    }

    public final void j1() {
        float b1 = b1();
        if (b1 == Float.MAX_VALUE) {
            b1 = this.n1.getHeight();
        }
        float max = Math.max(0.0f, b1 - gl.m);
        this.p2.setTranslationY(max);
        this.q2.setAlpha((int) (Utilities.l(1.0f - (max / gl.L(24.0f))) * 255.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7 f = kk7.f(this.a);
        f.b(this, kk7.T2);
        f.b(this, kk7.D0);
        f.b(this, kk7.N);
        f.b(this, kk7.R0);
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
        kk7 f = kk7.f(this.a);
        f.n(this, kk7.T2);
        f.n(this, kk7.D0);
        f.n(this, kk7.N);
        f.n(this, kk7.R0);
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
