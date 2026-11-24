package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class xx2 extends fy0 implements x74 {
    public static final int m2 = 0;
    public final y74 S1;
    public final fm0 T1;
    public final HashMap U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public String X1;
    public l5c Y1;
    public final u41 Z1;
    public final t8 a2;
    public final jo0 b2;
    public final ro4 c2;
    public final l35 d2;
    public final HashMap e2;
    public lj9 f2;
    public int g2;
    public final int h2;
    public final FrameLayout i2;
    public HashSet j2;
    public final Rect k2;
    public ya5 l2;

    public xx2(Context context, wjb wjbVar) {
        super(wjbVar, context, true);
        String country;
        s33 s33Var = s33.h;
        this.S1 = new y74(3, this, s33Var, 350L);
        this.T1 = new fm0(4, this, s33Var, 320L, false);
        this.U1 = new HashMap();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.e2 = new HashMap();
        this.k2 = new Rect();
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.v1 = false;
        this.h2 = na7.q1(this.a).k4.L.f();
        gl.S(getWindow());
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, gl.L(68.0f) + gl.n);
        this.n1.setClipToPadding(false);
        this.n1.j(new ao2(this, (byte) 3));
        this.n1.setOnItemClickListener(new ux2(this, wjbVar, context));
        u41 u41Var = new u41(wjbVar, context, true);
        this.Z1 = u41Var;
        u41Var.f();
        u41Var.setCountFilled(true);
        u41Var.setText(k96.M0(2131745754, null));
        u41Var.setOnClickListener(new rx2(this, (byte) 0));
        t8 t8Var = new t8(this, context);
        this.a2 = t8Var;
        zkb.X(t8Var, bkb.Ii, wjbVar);
        t8Var.setText(k96.M0(2131745754, null));
        t8Var.setTypeface(gl.o());
        t8Var.setTextSize(1, 14.0f);
        t8Var.setGravity(17);
        t8Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        t8Var.setVisibility(8);
        ote.a(t8Var);
        this.o1.t().addView(t8Var, nme.t(-2, 48, 16, 12, 0, 12, 0));
        t8Var.setOnClickListener(new rx2(this, (byte) 1));
        no4 no4Var = new no4(context, wjbVar);
        String M0 = k96.M0(2131746934, null);
        l7 l7Var = no4Var.r;
        l7Var.setHint(M0);
        l7Var.addTextChangedListener(new b7(this, (byte) 16));
        ro4 ro4Var = new ro4(context, this.a);
        this.c2 = ro4Var;
        ro4Var.setDelegate(new sx2(this));
        jo0 jo0Var = new jo0(this, wjbVar, context);
        this.b2 = jo0Var;
        int i2 = this.u0;
        jo0Var.setPadding(i2, 0, i2, 0);
        jo0Var.addView(no4Var, nme.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        jo0Var.addView(ro4Var, nme.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        l35 l35Var = new l35(18, wjbVar, context);
        this.d2 = l35Var;
        l35Var.setTranslationY(gl.L(48.0f));
        l35Var.b(k96.M0(2131745618, null), k96.M0(2131751445, null), new rx2(this, (byte) 2));
        jo0Var.addView(l35Var, nme.e(-1, 32, 48));
        this.b.addView(jo0Var, nme.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gl.L(10.0f) + this.u0, gl.L(10.0f), gl.L(10.0f) + this.u0, gl.L(10.0f) + gl.n);
        frameLayout.addView(u41Var, nme.c(48.0f, -1));
        this.b.addView(frameLayout, nme.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        frameLayout2.setTranslationY((-gl.n) - gl.L(68.0f));
        this.b.addView(frameLayout2, nme.e(-1, 150, 80));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33Var);
        gb3Var.C = false;
        gb3Var.m = false;
        this.n1.setItemAnimator(gb3Var);
        this.n1.i(new vx2(this, wjbVar));
        be2 be2Var = new be2(this, (byte) 28);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (k96.D0().B != null) {
            country = k96.D0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new tf(be2Var, (byte) 5));
        ww0 ww0Var = this.c;
        sx2 sx2Var = new sx2(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(ww0Var, sx2Var);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new w72(this, (byte) 13), this.J0);
        this.Y1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131753285, null);
    }

    public final void Y0() {
        boolean z;
        int L = gl.L(56.0f) + a.getCurrentActionBarHeight() + gl.m + ((int) this.S1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - gl.n) - gl.L(34.0f);
        Rect rect = this.k2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z = false;
        } else {
            z = true;
        }
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        o39 o39Var = this.n1;
        o39Var.setClipBounds(rect);
        if (z) {
            o39Var.invalidate();
        }
    }

    public final void Z0() {
        o39 o39Var;
        float f = gl.q.y;
        int i = 0;
        while (true) {
            o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f) {
                f = childAt.getY();
            }
            i++;
        }
        float max = Math.max(a.getCurrentActionBarHeight() + gl.m, f + gl.L(8.0f));
        jo0 jo0Var = this.b2;
        if (jo0Var.getTranslationY() != max) {
            jo0Var.setTranslationY(max);
            o39Var.invalidate();
        }
    }

    public final void a1(Pair pair) {
        HashMap hashMap = this.U1;
        hashMap.putAll((Map) pair.first);
        ArrayList arrayList = this.V1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap, new tx2(this, (byte) 0));
        HashSet hashSet = this.j2;
        HashMap hashMap2 = this.e2;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hashMap.get((String) obj)) {
                            if (TextUtils.equals(str, tL_help_country.iso2)) {
                                break;
                            }
                        }
                    } else {
                        tL_help_country = null;
                        break;
                    }
                }
                if (tL_help_country != null) {
                    ya5 ya5Var = new ya5(getContext(), tL_help_country);
                    ya5Var.setOnClickListener(new rx2(this, (byte) 3));
                    this.c2.a(ya5Var);
                    hashMap2.put(tL_help_country.iso2, ya5Var);
                }
            }
        }
        this.Y1.O(true);
        this.Z1.c(hashMap2.size(), true);
    }

    @Override
    public final void b0() {
        Y0();
        Z0();
    }

    public final void b1(View view) {
        ya5 ya5Var = (ya5) view;
        if (ya5Var.E) {
            this.l2 = null;
            this.c2.c(ya5Var);
            String countryIso2 = ya5Var.getCountryIso2();
            HashMap hashMap = this.e2;
            hashMap.remove(countryIso2);
            this.Z1.c(hashMap.size(), true);
            this.Y1.O(true);
            return;
        }
        ya5 ya5Var2 = this.l2;
        if (ya5Var2 != null) {
            ya5Var2.a();
        }
        this.l2 = ya5Var;
        ya5Var.b();
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 3) {
            Y0();
            this.d2.setTranslationY(gl.L(48.0f) + f);
            this.b2.invalidate();
        } else if (i == 4) {
            un4.d(this.a2, f);
        }
    }

    @Override
    public final void F(float f, int i) {
    }
}
