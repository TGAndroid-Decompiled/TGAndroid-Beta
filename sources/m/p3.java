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
import org.telegram.ui.Components.n70;
import w7.x5;
public final class p3 implements n5.b {
    public Object f14292a;
    public Object f14293b;
    public Object f14294c;
    public Object d;
    public Object e;
    public Object f14295f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f14292a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f14294c = fVar2;
        this.d = str;
        this.e = str2;
        this.f14295f = aVar == null ? n8.a.f15195a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f14293b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        n70 n70Var = (n70) this.f14294c;
        if (n70Var != null) {
            n70Var.u();
            this.f14294c = null;
        }
        this.d = null;
        this.e = null;
        this.f14295f = null;
    }

    public void b(d6 d6Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f14293b;
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
                n0Var.setBackground(j6.Y(j6.v0(j6.f18953i6, f6Var), 0, 0));
                n0Var.setOnClickListener(new ai.d0(this, d6Var, o0Var, 10));
                ((LinearLayout) this.d).addView(n0Var, x5.n(-1, 48));
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
        n70 n70Var;
        n70 n70Var2;
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
        if (((d6) this.f14295f) == d6Var && a2.equals((ArrayList) this.e) && (n70Var2 = (n70) this.f14294c) != null && n70Var2.D()) {
            return;
        }
        if (((d6) this.f14295f) == d6Var && (n70Var = (n70) this.f14294c) != null && n70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((n70) this.f14294c).O();
            return;
        }
        a();
        c(d6Var);
        this.f14295f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        n70 a10 = ((ii.p0) this.f14292a).a(d6Var.getEditText());
        a10.Q = true;
        a10.f26387s = 0;
        a10.f26388t = false;
        a10.r((LinearLayout) this.d, x5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f26369i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f26382p = new i2.g0(this, 4);
        a10.f26362d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f14294c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f7581a = (Context) ((fd.a) this.f14292a).mo28get();
        obj.f7582b = (m5.d) ((fd.a) this.f14293b).mo28get();
        obj.f7583c = (s5.d) ((fd.a) this.f14294c).mo28get();
        obj.d = (lf.i) ((lf.i) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f7584f = (t5.c) ((fd.a) this.f14295f).mo28get();
        obj.f7585g = aVar;
        obj.h = bVar;
        obj.f7586i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ii.p0 p0Var, f6 f6Var) {
        this.f14292a = p0Var;
        this.f14293b = f6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f14295f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f14294c = str;
        this.f14292a = new x9.f(cVar);
        this.f14293b = tVar;
    }
}
