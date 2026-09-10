package m;

import android.content.Context;
import android.widget.LinearLayout;
import hi.g6;
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
import org.telegram.ui.Components.w70;
import w7.a6;
public final class r3 implements n5.b {
    public Object f13137a;
    public Object f13138b;
    public Object f13139c;
    public Object d;
    public Object e;
    public Object f13140f;
    public Object h;

    public r3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f13137a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f13139c = fVar2;
        this.d = str;
        this.e = str2;
        this.f13140f = aVar == null ? n8.a.f14015a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f13138b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        w70 w70Var = (w70) this.f13139c;
        if (w70Var != null) {
            w70Var.u();
            this.f13139c = null;
        }
        this.d = null;
        this.e = null;
        this.f13140f = null;
    }

    public void b(g6 g6Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f13138b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                hi.p0 p0Var = (hi.p0) obj;
                hi.o0 o0Var = new hi.o0(g6Var.getContext(), p0Var, f6Var);
                o0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                o0Var.setBackground(j6.Y(j6.v0(j6.f18017i6, f6Var), 0, 0));
                o0Var.setOnClickListener(new bi.q(this, g6Var, p0Var, 6));
                ((LinearLayout) this.d).addView(o0Var, a6.n(-1, 48));
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
        w70 w70Var;
        w70 w70Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = hi.p0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        c(g6Var);
        if (((g6) this.f13140f) == g6Var && a2.equals((ArrayList) this.e) && (w70Var2 = (w70) this.f13139c) != null && w70Var2.D()) {
            return;
        }
        if (((g6) this.f13140f) == g6Var && (w70Var = (w70) this.f13139c) != null && w70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(g6Var, a2);
            ((w70) this.f13139c).O();
            return;
        }
        a();
        c(g6Var);
        this.f13140f = g6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(g6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(g6Var, a2);
        w70 g10 = ((hi.q0) this.f13137a).g(g6Var.getEditText());
        g10.Q = true;
        g10.f28701s = 0;
        g10.f28702t = false;
        g10.r((LinearLayout) this.d, a6.n(220, -2));
        g10.X = AndroidUtilities.dp(240.0f);
        g10.f28683i = 3;
        g10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        g10.f28696p = new gg.v1(this, 6);
        g10.f28676d0 = true;
        if (g10.D()) {
            g10.C();
        }
        g10.Z();
        this.f13139c = g10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f6352a = (Context) ((fd.a) this.f13137a).mo28get();
        obj.f6353b = (m5.d) ((fd.a) this.f13138b).mo28get();
        obj.f6354c = (s5.d) ((fd.a) this.f13139c).mo28get();
        obj.d = (e3) ((e3) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f6355f = (t5.c) ((fd.a) this.f13140f).mo28get();
        obj.f6356g = aVar;
        obj.h = bVar;
        obj.f6357i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public r3(hi.q0 q0Var, f6 f6Var) {
        this.f13137a = q0Var;
        this.f13138b = f6Var;
    }

    public r3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f13140f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f13139c = str;
        this.f13137a = new x9.f(cVar);
        this.f13138b = sVar;
    }
}
