package m;

import android.content.Context;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ji.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.n70;
import w7.x5;
public final class p3 implements n5.b {
    public Object f15634a;
    public Object f15635b;
    public Object f15636c;
    public Object d;
    public Object f15637e;
    public Object f15638f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f15634a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f15636c = fVar2;
        this.d = str;
        this.f15637e = str2;
        this.f15638f = aVar == null ? n8.a.f16705a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f15635b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        n70 n70Var = (n70) this.f15636c;
        if (n70Var != null) {
            n70Var.u();
            this.f15636c = null;
        }
        this.d = null;
        this.f15637e = null;
        this.f15638f = null;
    }

    public void b(g6 g6Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f15635b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ji.n0 n0Var = (ji.n0) obj;
                ji.m0 m0Var = new ji.m0(g6Var.getContext(), n0Var, f6Var);
                m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m0Var.setBackground(j6.Y(j6.v0(j6.f20753i6, f6Var), 0, 0));
                m0Var.setOnClickListener(new bi.x(this, g6Var, n0Var, 10));
                ((LinearLayout) this.d).addView(m0Var, x5.n(-1, 48));
            }
        }
    }

    public void c(g6 g6Var) {
        g6 g6Var2 = (g6) this.h;
        if (g6Var2 != g6Var) {
            if (g6Var2 != null) {
                g6Var2.setShowCommandBackground(false);
            }
            this.h = g6Var;
            if (g6Var != null) {
                g6Var.setShowCommandBackground(true);
            }
        }
    }

    public void d(g6 g6Var, String str) {
        n70 n70Var;
        n70 n70Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ji.n0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(g6Var);
        if (((g6) this.f15638f) == g6Var && a2.equals((ArrayList) this.f15637e) && (n70Var2 = (n70) this.f15636c) != null && n70Var2.D()) {
            return;
        }
        if (((g6) this.f15638f) == g6Var && (n70Var = (n70) this.f15636c) != null && n70Var.D() && ((LinearLayout) this.d) != null) {
            this.f15637e = a2;
            b(g6Var, a2);
            ((n70) this.f15636c).O();
            return;
        }
        a();
        c(g6Var);
        this.f15638f = g6Var;
        this.f15637e = a2;
        LinearLayout linearLayout = new LinearLayout(g6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(g6Var, a2);
        n70 i10 = ((ji.o0) this.f15634a).i(g6Var.getEditText());
        i10.Q = true;
        i10.f28660s = 0;
        i10.f28661t = false;
        i10.r((LinearLayout) this.d, x5.n(220, -2));
        i10.X = AndroidUtilities.dp(240.0f);
        i10.f28642i = 3;
        i10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        i10.f28655p = new ig.t0(this, 9);
        i10.f28634d0 = true;
        if (i10.D()) {
            i10.C();
        }
        i10.Z();
        this.f15636c = i10;
    }

    @Override
    public Object mo28get() {
        t7.u uVar = new t7.u(23);
        rb.a aVar = new rb.a(23);
        ?? obj = new Object();
        obj.f6651a = (Context) ((fd.a) this.f15634a).mo28get();
        obj.f6652b = (m5.d) ((fd.a) this.f15635b).mo28get();
        obj.f6653c = (s5.d) ((fd.a) this.f15636c).mo28get();
        obj.d = (m2.t) ((m2.t) this.d).mo28get();
        obj.f6654e = (Executor) ((fd.a) this.f15637e).mo28get();
        obj.f6655f = (t5.c) ((fd.a) this.f15638f).mo28get();
        obj.f6656g = uVar;
        obj.h = aVar;
        obj.f6657i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ji.o0 o0Var, f6 f6Var) {
        this.f15634a = o0Var;
        this.f15635b = f6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.f15637e = new com.google.firebase.messaging.m(this, true);
        this.f15638f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f15636c = str;
        this.f15634a = new x9.f(cVar);
        this.f15635b = sVar;
    }
}
