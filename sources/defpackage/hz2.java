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
public final class hz2 extends mz0 implements g94 {
    public static final int m2 = 0;
    public final h94 S1;
    public final fn0 T1;
    public final HashMap U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public String X1;
    public l7c Y1;
    public final b61 Z1;
    public final t8 a2;
    public final jp0 b2;
    public final sq4 c2;
    public final l55 d2;
    public final HashMap e2;
    public sz4 f2;
    public int g2;
    public final int h2;
    public final FrameLayout i2;
    public HashSet j2;
    public final Rect k2;
    public wc5 l2;

    public hz2(Context context, ylb ylbVar) {
        super(ylbVar, context, true);
        String country;
        d53 d53Var = d53.h;
        this.S1 = new h94(3, this, d53Var, 350L);
        this.T1 = new fn0(4, this, d53Var, 320L, false);
        this.U1 = new HashMap();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.e2 = new HashMap();
        this.k2 = new Rect();
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.v1 = false;
        this.h2 = oc7.r1(this.a).l4.L.f();
        gm.S(getWindow());
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, gm.L(68.0f) + gm.n);
        this.n1.setClipToPadding(false);
        this.n1.j(new ip2(this, (byte) 4));
        this.n1.setOnItemClickListener(new ez2(this, ylbVar, context));
        b61 b61Var = new b61(ylbVar, context, true);
        this.Z1 = b61Var;
        b61Var.f();
        b61Var.setCountFilled(true);
        b61Var.setText(jb6.M0(2131745680, null));
        b61Var.setOnClickListener(new bz2(this, (byte) 0));
        t8 t8Var = new t8(this, context);
        this.a2 = t8Var;
        anb.X(t8Var, cmb.Ii, ylbVar);
        t8Var.setText(jb6.M0(2131745680, null));
        t8Var.setTypeface(gm.o());
        t8Var.setTextSize(1, 14.0f);
        t8Var.setGravity(17);
        t8Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        t8Var.setVisibility(8);
        rve.a(t8Var);
        this.o1.t().addView(t8Var, qoe.t(-2, 48, 16, 12, 0, 12, 0));
        t8Var.setOnClickListener(new bz2(this, (byte) 1));
        oq4 oq4Var = new oq4(context, ylbVar);
        String M0 = jb6.M0(2131746860, null);
        l7 l7Var = oq4Var.r;
        l7Var.setHint(M0);
        l7Var.addTextChangedListener(new b7(this, (byte) 17));
        sq4 sq4Var = new sq4(context, this.a);
        this.c2 = sq4Var;
        sq4Var.setDelegate(new cz2(this));
        jp0 jp0Var = new jp0(this, ylbVar, context);
        this.b2 = jp0Var;
        int i2 = this.u0;
        jp0Var.setPadding(i2, 0, i2, 0);
        jp0Var.addView(oq4Var, qoe.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        jp0Var.addView(sq4Var, qoe.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        l55 l55Var = new l55(18, ylbVar, context);
        this.d2 = l55Var;
        l55Var.setTranslationY(gm.L(48.0f));
        l55Var.b(jb6.M0(2131745544, null), jb6.M0(2131751394, null), new bz2(this, (byte) 2));
        jp0Var.addView(l55Var, qoe.e(-1, 32, 48));
        this.b.addView(jp0Var, qoe.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gm.L(10.0f) + this.u0, gm.L(10.0f), gm.L(10.0f) + this.u0, gm.L(10.0f) + gm.n);
        frameLayout.addView(b61Var, qoe.c(48.0f, -1));
        this.b.addView(frameLayout, qoe.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        frameLayout2.setTranslationY((-gm.n) - gm.L(68.0f));
        this.b.addView(frameLayout2, qoe.e(-1, 150, 80));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53Var);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        this.n1.i(new fz2(this, ylbVar));
        mf2 mf2Var = new mf2(this, (byte) 28);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (jb6.D0().B != null) {
            country = jb6.D0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new tg(mf2Var, (byte) 5));
        dy0 dy0Var = this.c;
        cz2 cz2Var = new cz2(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(dy0Var, cz2Var);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 3) {
            Y0();
            this.d2.setTranslationY(gm.L(48.0f) + f);
            this.b2.invalidate();
        } else if (i == 4) {
            wp4.d(this.a2, f);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new h92(this, (byte) 13), this.J0);
        this.Y1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131753253, null);
    }

    public final void Y0() {
        boolean z;
        int L = gm.L(56.0f) + a.getCurrentActionBarHeight() + gm.m + ((int) this.S1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - gm.n) - gm.L(34.0f);
        Rect rect = this.k2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z = false;
        } else {
            z = true;
        }
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        r59 r59Var = this.n1;
        r59Var.setClipBounds(rect);
        if (z) {
            r59Var.invalidate();
        }
    }

    public final void Z0() {
        r59 r59Var;
        float f = gm.q.y;
        int i = 0;
        while (true) {
            r59Var = this.n1;
            if (i >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f) {
                f = childAt.getY();
            }
            i++;
        }
        float max = Math.max(a.getCurrentActionBarHeight() + gm.m, f + gm.L(8.0f));
        jp0 jp0Var = this.b2;
        if (jp0Var.getTranslationY() != max) {
            jp0Var.setTranslationY(max);
            r59Var.invalidate();
        }
    }

    public final void a1(Pair pair) {
        HashMap hashMap = this.U1;
        hashMap.putAll((Map) pair.first);
        ArrayList arrayList = this.V1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap, new dz2(this, (byte) 0));
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
                    wc5 wc5Var = new wc5(getContext(), tL_help_country);
                    wc5Var.setOnClickListener(new bz2(this, (byte) 3));
                    this.c2.a(wc5Var);
                    hashMap2.put(tL_help_country.iso2, wc5Var);
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
        wc5 wc5Var = (wc5) view;
        if (wc5Var.E) {
            this.l2 = null;
            this.c2.c(wc5Var);
            String countryIso2 = wc5Var.getCountryIso2();
            HashMap hashMap = this.e2;
            hashMap.remove(countryIso2);
            this.Z1.c(hashMap.size(), true);
            this.Y1.O(true);
            return;
        }
        wc5 wc5Var2 = this.l2;
        if (wc5Var2 != null) {
            wc5Var2.a();
        }
        this.l2 = wc5Var;
        wc5Var.b();
    }

    @Override
    public final void V(float f, int i) {
    }
}
