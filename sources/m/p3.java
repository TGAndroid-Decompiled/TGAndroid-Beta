package m;

import android.content.Context;
import android.widget.LinearLayout;
import ii.f6;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import w7.z5;
public final class p3 implements n5.b {
    public Object f15849a;
    public Object f15850b;
    public Object f15851c;
    public Object d;
    public Object f15852e;
    public Object f15853f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f15849a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f15851c = fVar2;
        this.d = str;
        this.f15852e = str2;
        this.f15853f = aVar == null ? n8.a.f16848a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f15850b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        b80 b80Var = (b80) this.f15851c;
        if (b80Var != null) {
            b80Var.u();
            this.f15851c = null;
        }
        this.d = null;
        this.f15852e = null;
        this.f15853f = null;
    }

    public void b(f6 f6Var, ArrayList arrayList) {
        d6 d6Var = (d6) this.f15850b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(f6Var.getContext(), o0Var, d6Var);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(i6.Y(i6.v0(i6.f20908i6, d6Var), 0, 0));
                n0Var.setOnClickListener(new ai.d0(this, f6Var, o0Var, 10));
                ((LinearLayout) this.d).addView(n0Var, z5.n(-1, 48));
            }
        }
    }

    public void c(f6 f6Var) {
        f6 f6Var2 = (f6) this.h;
        if (f6Var2 != f6Var) {
            if (f6Var2 != null) {
                f6Var2.setShowCommandBackground(false);
            }
            this.h = f6Var;
            if (f6Var != null) {
                f6Var.setShowCommandBackground(true);
            }
        }
    }

    public void d(f6 f6Var, String str) {
        b80 b80Var;
        b80 b80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(f6Var);
        if (((f6) this.f15853f) == f6Var && a2.equals((ArrayList) this.f15852e) && (b80Var2 = (b80) this.f15851c) != null && b80Var2.D()) {
            return;
        }
        if (((f6) this.f15853f) == f6Var && (b80Var = (b80) this.f15851c) != null && b80Var.D() && ((LinearLayout) this.d) != null) {
            this.f15852e = a2;
            b(f6Var, a2);
            ((b80) this.f15851c).O();
            return;
        }
        a();
        c(f6Var);
        this.f15853f = f6Var;
        this.f15852e = a2;
        LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(f6Var, a2);
        b80 a10 = ((ii.p0) this.f15849a).a(f6Var.getEditText());
        a10.Q = true;
        a10.f24844s = 0;
        a10.f24845t = false;
        a10.r((LinearLayout) this.d, z5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f24826i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f24839p = new i2.h0(this, 4);
        a10.f24818d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f15851c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f8179a = (Context) ((fd.a) this.f15849a).mo28get();
        obj.f8180b = (m5.d) ((fd.a) this.f15850b).mo28get();
        obj.f8181c = (s5.d) ((fd.a) this.f15851c).mo28get();
        obj.d = (la.h) ((la.h) this.d).mo28get();
        obj.f8182e = (Executor) ((fd.a) this.f15852e).mo28get();
        obj.f8183f = (t5.c) ((fd.a) this.f15853f).mo28get();
        obj.f8184g = aVar;
        obj.h = bVar;
        obj.f8185i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ii.p0 p0Var, d6 d6Var) {
        this.f15849a = p0Var;
        this.f15850b = d6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.f15852e = new com.google.firebase.messaging.m(this, true);
        this.f15853f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f15851c = str;
        this.f15849a = new x9.f(cVar);
        this.f15850b = sVar;
    }
}
