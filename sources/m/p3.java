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
import org.telegram.ui.Components.v70;
import w7.y5;
public final class p3 implements n5.b {
    public Object f14503a;
    public Object f14504b;
    public Object f14505c;
    public Object d;
    public Object e;
    public Object f14506f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f14503a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f14505c = fVar2;
        this.d = str;
        this.e = str2;
        this.f14506f = aVar == null ? n8.a.f15404a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f14504b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        v70 v70Var = (v70) this.f14505c;
        if (v70Var != null) {
            v70Var.u();
            this.f14505c = null;
        }
        this.d = null;
        this.e = null;
        this.f14506f = null;
    }

    public void b(d6 d6Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f14504b;
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
                n0Var.setBackground(j6.Y(j6.v0(j6.f19184i6, f6Var), 0, 0));
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
        v70 v70Var;
        v70 v70Var2;
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
        if (((d6) this.f14506f) == d6Var && a2.equals((ArrayList) this.e) && (v70Var2 = (v70) this.f14505c) != null && v70Var2.D()) {
            return;
        }
        if (((d6) this.f14506f) == d6Var && (v70Var = (v70) this.f14505c) != null && v70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((v70) this.f14505c).O();
            return;
        }
        a();
        c(d6Var);
        this.f14506f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        v70 a10 = ((ii.p0) this.f14503a).a(d6Var.getEditText());
        a10.Q = true;
        a10.f28994s = 0;
        a10.f28995t = false;
        a10.r((LinearLayout) this.d, y5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f28976i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f28989p = new i2.g0(this, 4);
        a10.f28969d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f14505c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f7581a = (Context) ((fd.a) this.f14503a).mo28get();
        obj.f7582b = (m5.d) ((fd.a) this.f14504b).mo28get();
        obj.f7583c = (s5.d) ((fd.a) this.f14505c).mo28get();
        obj.d = (lf.h) ((lf.h) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f7584f = (t5.c) ((fd.a) this.f14506f).mo28get();
        obj.f7585g = aVar;
        obj.h = bVar;
        obj.f7586i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ii.p0 p0Var, f6 f6Var) {
        this.f14503a = p0Var;
        this.f14504b = f6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f14506f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f14505c = str;
        this.f14503a = new x9.f(cVar);
        this.f14504b = tVar;
    }
}
