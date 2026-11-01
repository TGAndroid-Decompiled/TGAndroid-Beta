package lh;

import ag.a1;
import ag.l;
import ag.u;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.j6;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jg.b1;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.l0;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import r0.z;
import s4.j;
import w7.b6;
import w7.e6;
public final class g extends ha implements fe.e {
    public static final int f12017j2 = 0;
    public final fe.f P1;
    public final fe.b Q1;
    public final HashMap R1;
    public final ArrayList S1;
    public final ArrayList T1;
    public String U1;
    public q51 V1;
    public final vh.d W1;
    public final j6 X1;
    public final b1 Y1;
    public final l10 Z1;
    public final z3 a2;
    public final HashMap f12018b2;
    public l2.f f12019c2;
    public int f12020d2;
    public final int f12021e2;
    public final FrameLayout f12022f2;
    public HashSet f12023g2;
    public final Rect f12024h2;
    public s20 f12025i2;

    public g(Context context, p6 p6Var) {
        super(context, p6Var, true);
        String country;
        gr grVar = gr.h;
        this.P1 = new fe.f(3, this, grVar, 350L);
        this.Q1 = new fe.b(4, this, grVar, 320L, false);
        this.R1 = new HashMap();
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.f12018b2 = new HashMap();
        this.f12024h2 = new Rect();
        this.f21621x = true;
        this.f21607n = false;
        this.C1 = false;
        this.f26731s1 = false;
        this.f12021e2 = ((l0) wp.r1(this.f21584a).f19300y7.H.f10701a).f16855c;
        i0.S(getWindow());
        uk0 uk0Var = this.f26724k1;
        int i10 = this.f21616t0;
        uk0Var.setPadding(i10, 0, i10, i0.L(68.0f) + i0.f16167n);
        this.f26724k1.setClipToPadding(false);
        this.f26724k1.j(new u(this, 5));
        this.f26724k1.setOnItemClickListener(new d(context, this, p6Var));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.W1 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(dd.L0(2131745963, null));
        dVar.setOnClickListener(new a(this, 0));
        j6 j6Var = new j6(this, context);
        this.X1 = j6Var;
        a7.V(j6Var, t6.Gi, p6Var);
        j6Var.setText(dd.L0(2131745963, null));
        j6Var.setTypeface(i0.o());
        j6Var.setTextSize(1, 14.0f);
        j6Var.setGravity(17);
        j6Var.setPadding(i0.L(16.0f), 0, i0.L(16.0f), 0);
        j6Var.setVisibility(8);
        e6.a(j6Var);
        this.l1.p().addView(j6Var, b6.t(-2, 48, 16, 12, 0, 12, 0));
        j6Var.setOnClickListener(new a(this, 1));
        h10 h10Var = new h10(context, p6Var);
        String L0 = dd.L0(2131747142, null);
        n0 n0Var = h10Var.f26635r;
        n0Var.setHint(L0);
        n0Var.addTextChangedListener(new a1(this, 4));
        l10 l10Var = new l10(context, this.f21584a);
        this.Z1 = l10Var;
        l10Var.setDelegate(new b(this));
        b1 b1Var = new b1(context, this, p6Var);
        this.Y1 = b1Var;
        int i11 = this.f21616t0;
        b1Var.setPadding(i11, 0, i11, 0);
        b1Var.addView(h10Var, b6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        b1Var.addView(l10Var, b6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        z3 z3Var = new z3(18, context, p6Var);
        this.a2 = z3Var;
        z3Var.setTranslationY(i0.L(48.0f));
        z3Var.b(dd.L0(2131745827, null), dd.L0(2131751458, null), new a(this, 2));
        b1Var.addView(z3Var, b6.e(-1, 32, 48));
        this.f21587b.addView(b1Var, b6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(i0.L(10.0f) + this.f21616t0, i0.L(10.0f), i0.L(10.0f) + this.f21616t0, i0.L(10.0f) + i0.f16167n);
        frameLayout.addView(dVar, b6.c(48.0f, -1));
        this.f21587b.addView(frameLayout, b6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12022f2 = frameLayout2;
        frameLayout2.setTranslationY((-i0.f16167n) - i0.L(68.0f));
        this.f21587b.addView(frameLayout2, b6.e(-1, 150, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(grVar);
        jVar.C = false;
        jVar.f47938m = false;
        this.f26724k1.setItemAnimator(jVar);
        this.f26724k1.i(new e(this, p6Var));
        l lVar = new l(this, 17);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e20.f15506s0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (dd.D0().B != null) {
            country = dd.D0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new ag.c(lVar, 9));
        z.i(this.f21590c, new b(this));
    }

    public static void d1(g gVar, Pair pair) {
        HashMap hashMap = gVar.f12018b2;
        HashMap hashMap2 = gVar.R1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.S1;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.f12023g2;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
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
                    s20 s20Var = new s20(gVar.getContext(), tL_help_country);
                    s20Var.setOnClickListener(new a(gVar, 3));
                    gVar.Z1.a(s20Var);
                    hashMap.put(tL_help_country.iso2, s20Var);
                }
            }
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, true, new ag.a(this, 16), this.I0);
        this.V1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return dd.L0(2131753288, null);
    }

    @Override
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        boolean z10;
        int L = i0.L(56.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i0.f16166m + ((int) this.P1.f7032f);
        int measuredHeight = (this.f21587b.getMeasuredHeight() - i0.f16167n) - i0.L(34.0f);
        Rect rect = this.f12024h2;
        if (rect.top == L && rect.bottom == measuredHeight) {
            z10 = false;
        } else {
            z10 = true;
        }
        rect.set(0, L, this.f21587b.getMeasuredWidth(), measuredHeight);
        uk0 uk0Var = this.f26724k1;
        uk0Var.setClipBounds(rect);
        if (z10) {
            uk0Var.invalidate();
        }
    }

    public final void f1() {
        uk0 uk0Var;
        float f7 = i0.f16172q.y;
        int i10 = 0;
        while (true) {
            uk0Var = this.f26724k1;
            if (i10 >= uk0Var.getChildCount()) {
                break;
            }
            View childAt = uk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i0.f16166m, f7 + i0.L(8.0f));
        b1 b1Var = this.Y1;
        if (b1Var.getTranslationY() != max) {
            b1Var.setTranslationY(max);
            uk0Var.invalidate();
        }
    }

    public final void g1(View view) {
        s20 s20Var = (s20) view;
        if (s20Var.D) {
            this.f12025i2 = null;
            this.Z1.c(s20Var);
            String countryIso2 = s20Var.getCountryIso2();
            HashMap hashMap = this.f12018b2;
            hashMap.remove(countryIso2);
            this.W1.c(hashMap.size(), true);
            this.V1.O(true);
            return;
        }
        s20 s20Var2 = this.f12025i2;
        if (s20Var2 != null) {
            s20Var2.a();
        }
        this.f12025i2 = s20Var;
        s20Var.b();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 3) {
            e1();
            this.a2.setTranslationY(i0.L(48.0f) + f7);
            this.Y1.invalidate();
        } else if (i10 == 4) {
            f10.d(this.X1, f7);
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
