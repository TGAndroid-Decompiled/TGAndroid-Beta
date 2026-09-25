package m;

import android.content.Context;
import android.widget.LinearLayout;
import ii.e6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.y70;
import w7.y5;
public final class p3 implements n5.b {
    public Object f14523a;
    public Object f14524b;
    public Object f14525c;
    public Object d;
    public Object e;
    public Object f14526f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f14523a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f14525c = fVar2;
        this.d = str;
        this.e = str2;
        this.f14526f = aVar == null ? n8.a.f15412a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f14524b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a4.a.k(it);
    }

    public void a() {
        c(null);
        y70 y70Var = (y70) this.f14525c;
        if (y70Var != null) {
            y70Var.u();
            this.f14525c = null;
        }
        this.d = null;
        this.e = null;
        this.f14526f = null;
    }

    public void b(e6 e6Var, ArrayList arrayList) {
        d6 d6Var = (d6) this.f14524b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(e6Var.getContext(), o0Var, d6Var);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(h6.Y(h6.v0(h6.f19149i6, d6Var), 0, 0));
                n0Var.setOnClickListener(new ai.d0(this, e6Var, o0Var, 10));
                ((LinearLayout) this.d).addView(n0Var, y5.n(-1, 48));
            }
        }
    }

    public void c(e6 e6Var) {
        e6 e6Var2 = (e6) this.h;
        if (e6Var2 != e6Var) {
            if (e6Var2 != null) {
                e6Var2.setShowCommandBackground(false);
            }
            this.h = e6Var;
            if (e6Var != null) {
                e6Var.setShowCommandBackground(true);
            }
        }
    }

    public void d(e6 e6Var, String str) {
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
        c(e6Var);
        if (((e6) this.f14526f) == e6Var && a2.equals((ArrayList) this.e) && (y70Var2 = (y70) this.f14525c) != null && y70Var2.D()) {
            return;
        }
        if (((e6) this.f14526f) == e6Var && (y70Var = (y70) this.f14525c) != null && y70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(e6Var, a2);
            ((y70) this.f14525c).O();
            return;
        }
        a();
        c(e6Var);
        this.f14526f = e6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(e6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(e6Var, a2);
        y70 a10 = ((ii.p0) this.f14523a).a(e6Var.getEditText());
        a10.Q = true;
        a10.f30555s = 0;
        a10.f30556t = false;
        a10.r((LinearLayout) this.d, y5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f30537i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f30550p = new i2.h0(this, 4);
        a10.f30530d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f14525c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f7563a = (Context) ((fd.a) this.f14523a).mo28get();
        obj.f7564b = (m5.d) ((fd.a) this.f14524b).mo28get();
        obj.f7565c = (s5.d) ((fd.a) this.f14525c).mo28get();
        obj.d = (la.h) ((la.h) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f7566f = (t5.c) ((fd.a) this.f14526f).mo28get();
        obj.f7567g = aVar;
        obj.h = bVar;
        obj.f7568i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ii.p0 p0Var, d6 d6Var) {
        this.f14523a = p0Var;
        this.f14524b = d6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f14526f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f14525c = str;
        this.f14523a = new x9.f(cVar);
        this.f14524b = tVar;
    }
}
