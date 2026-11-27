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
public final class ry2 extends ny0 implements s84 {
    public static final int m2 = 0;
    public final t84 S1;
    public final fm0 T1;
    public final HashMap U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public String X1;
    public l9c Y1;
    public final c51 Z1;
    public final u8 a2;
    public final jo0 b2;
    public final vq4 c2;
    public final p55 d2;
    public final HashMap e2;
    public wz4 f2;
    public int g2;
    public final int h2;
    public final FrameLayout i2;
    public HashSet j2;
    public final Rect k2;
    public zc5 l2;

    public ry2(Context context, vnb vnbVar) {
        super(vnbVar, context, true);
        String country;
        k43 k43Var = k43.h;
        this.S1 = new t84(3, this, k43Var, 350L);
        this.T1 = new fm0(4, this, k43Var, 320L, false);
        this.U1 = new HashMap();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.e2 = new HashMap();
        this.k2 = new Rect();
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.v1 = false;
        this.h2 = uc7.s1(this.a).k4.S.f();
        hl.S(getWindow());
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, hl.L(68.0f) + hl.n);
        this.n1.setClipToPadding(false);
        this.n1.j(new to2(this, (byte) 3));
        this.n1.setOnItemClickListener(new oy2(this, vnbVar, context));
        c51 c51Var = new c51(vnbVar, context, true);
        this.Z1 = c51Var;
        c51Var.f();
        c51Var.setCountFilled(true);
        c51Var.setText(ob6.M0(2131745674, null));
        c51Var.setOnClickListener(new ly2(this, (byte) 0));
        u8 u8Var = new u8(this, context);
        this.a2 = u8Var;
        yob.X(u8Var, aob.Ji, vnbVar);
        u8Var.setText(ob6.M0(2131745674, null));
        u8Var.setTypeface(hl.o());
        u8Var.setTextSize(1, 14.0f);
        u8Var.setGravity(17);
        u8Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        u8Var.setVisibility(8);
        iye.a(u8Var);
        this.o1.u().addView(u8Var, tre.t(-2, 48, 16, 12, 0, 12, 0));
        u8Var.setOnClickListener(new ly2(this, (byte) 1));
        rq4 rq4Var = new rq4(context, vnbVar);
        String M0 = ob6.M0(2131746854, null);
        m7 m7Var = rq4Var.r;
        m7Var.setHint(M0);
        m7Var.addTextChangedListener(new c7(this, (byte) 16));
        vq4 vq4Var = new vq4(context, this.a);
        this.c2 = vq4Var;
        vq4Var.setDelegate(new my2(this));
        jo0 jo0Var = new jo0(this, vnbVar, context);
        this.b2 = jo0Var;
        int i2 = this.u0;
        jo0Var.setPadding(i2, 0, i2, 0);
        jo0Var.addView(rq4Var, tre.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        jo0Var.addView(vq4Var, tre.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        p55 p55Var = new p55(18, vnbVar, context);
        this.d2 = p55Var;
        p55Var.setTranslationY(hl.L(48.0f));
        p55Var.b(ob6.M0(2131745538, null), ob6.M0(2131751422, null), new ly2(this, (byte) 2));
        jo0Var.addView(p55Var, tre.e(-1, 32, 48));
        this.b.addView(jo0Var, tre.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(hl.L(10.0f) + this.u0, hl.L(10.0f), hl.L(10.0f) + this.u0, hl.L(10.0f) + hl.n);
        frameLayout.addView(c51Var, tre.c(48.0f, -1));
        this.b.addView(frameLayout, tre.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        frameLayout2.setTranslationY((-hl.n) - hl.L(68.0f));
        this.b.addView(frameLayout2, tre.e(-1, 150, 80));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43Var);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        this.n1.i(new py2(this, vnbVar));
        te2 te2Var = new te2(this, (byte) 28);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (ob6.D0().B != null) {
            country = ob6.D0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new ye(te2Var, (byte) 5));
        ex0 ex0Var = this.c;
        my2 my2Var = new my2(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(ex0Var, my2Var);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new n82(this, (byte) 13), this.J0);
        this.Y1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131753281, null);
    }

    public final void Z0() {
        boolean z;
        int L = hl.L(56.0f) + a.getCurrentActionBarHeight() + hl.m + ((int) this.S1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - hl.n) - hl.L(34.0f);
        Rect rect = this.k2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z = false;
        } else {
            z = true;
        }
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        d79 d79Var = this.n1;
        d79Var.setClipBounds(rect);
        if (z) {
            d79Var.invalidate();
        }
    }

    public final void a1() {
        d79 d79Var;
        float f = hl.q.y;
        int i = 0;
        while (true) {
            d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                break;
            }
            View childAt = d79Var.getChildAt(i);
            if (RecyclerView.S(childAt) >= 1 && childAt.getY() < f) {
                f = childAt.getY();
            }
            i++;
        }
        float max = Math.max(a.getCurrentActionBarHeight() + hl.m, f + hl.L(8.0f));
        jo0 jo0Var = this.b2;
        if (jo0Var.getTranslationY() != max) {
            jo0Var.setTranslationY(max);
            d79Var.invalidate();
        }
    }

    @Override
    public final void b0() {
        Z0();
        a1();
    }

    public final void b1(Pair pair) {
        HashMap hashMap = this.U1;
        hashMap.putAll((Map) pair.first);
        ArrayList arrayList = this.V1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap, new ny2(this, (byte) 0));
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
                    zc5 zc5Var = new zc5(getContext(), tL_help_country);
                    zc5Var.setOnClickListener(new ly2(this, (byte) 3));
                    this.c2.a(zc5Var);
                    hashMap2.put(tL_help_country.iso2, zc5Var);
                }
            }
        }
        this.Y1.O(true);
        this.Z1.c(hashMap2.size(), true);
    }

    public final void c1(View view) {
        zc5 zc5Var = (zc5) view;
        if (zc5Var.E) {
            this.l2 = null;
            this.c2.c(zc5Var);
            String countryIso2 = zc5Var.getCountryIso2();
            HashMap hashMap = this.e2;
            hashMap.remove(countryIso2);
            this.Z1.c(hashMap.size(), true);
            this.Y1.O(true);
            return;
        }
        zc5 zc5Var2 = this.l2;
        if (zc5Var2 != null) {
            zc5Var2.a();
        }
        this.l2 = zc5Var;
        zc5Var.b();
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 3) {
            Z0();
            this.d2.setTranslationY(hl.L(48.0f) + f);
            this.b2.invalidate();
        } else if (i == 4) {
            zp4.d(this.a2, f);
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
