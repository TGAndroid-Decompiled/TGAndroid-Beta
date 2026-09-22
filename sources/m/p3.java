package m;

import android.content.Context;
import android.widget.LinearLayout;
import ii.d6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.y70;
import w7.y5;
public final class p3 implements n5.b {
    public Object f14518a;
    public Object f14519b;
    public Object f14520c;
    public Object d;
    public Object e;
    public Object f14521f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f14518a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f14520c = fVar2;
        this.d = str;
        this.e = str2;
        this.f14521f = aVar == null ? n8.a.f15417a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f14519b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        y70 y70Var = (y70) this.f14520c;
        if (y70Var != null) {
            y70Var.u();
            this.f14520c = null;
        }
        this.d = null;
        this.e = null;
        this.f14521f = null;
    }

    public void b(d6 d6Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f14519b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(d6Var.getContext(), o0Var, f6Var);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(j6.Y(j6.v0(j6.f19199i6, f6Var), 0, 0));
                n0Var.setOnClickListener(new ai.d0(this, d6Var, o0Var, 10));
                ((LinearLayout) this.d).addView(n0Var, y5.n(-1, 48));
            }
        }
    }

    public void c(d6 d6Var) {
        d6 d6Var2 = (d6) this.h;
        if (d6Var2 != d6Var) {
            if (d6Var2 != null) {
                d6Var2.setShowCommandBackground(false);
            }
            this.h = d6Var;
            if (d6Var != null) {
                d6Var.setShowCommandBackground(true);
            }
        }
    }

    public void d(d6 d6Var, String str) {
        y70 y70Var;
        y70 y70Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(d6Var);
        if (((d6) this.f14521f) == d6Var && a2.equals((ArrayList) this.e) && (y70Var2 = (y70) this.f14520c) != null && y70Var2.D()) {
            return;
        }
        if (((d6) this.f14521f) == d6Var && (y70Var = (y70) this.f14520c) != null && y70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((y70) this.f14520c).O();
            return;
        }
        a();
        c(d6Var);
        this.f14521f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        y70 a10 = ((ii.p0) this.f14518a).a(d6Var.getEditText());
        a10.Q = true;
        a10.f30568s = 0;
        a10.f30569t = false;
        a10.r((LinearLayout) this.d, y5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f30550i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f30563p = new i2.g0(this, 4);
        a10.f30543d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f14520c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f7580a = (Context) ((fd.a) this.f14518a).mo28get();
        obj.f7581b = (m5.d) ((fd.a) this.f14519b).mo28get();
        obj.f7582c = (s5.d) ((fd.a) this.f14520c).mo28get();
        obj.d = (lf.h) ((lf.h) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f7583f = (t5.c) ((fd.a) this.f14521f).mo28get();
        obj.f7584g = aVar;
        obj.h = bVar;
        obj.f7585i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ii.p0 p0Var, f6 f6Var) {
        this.f14518a = p0Var;
        this.f14519b = f6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f14521f = new c5.a0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f14520c = str;
        this.f14518a = new x9.f(cVar);
        this.f14519b = tVar;
    }
}
