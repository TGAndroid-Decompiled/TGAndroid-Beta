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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a80;
import w7.y5;
public final class p3 implements n5.b {
    public Object f14550a;
    public Object f14551b;
    public Object f14552c;
    public Object d;
    public Object e;
    public Object f14553f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f14550a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f14552c = fVar2;
        this.d = str;
        this.e = str2;
        this.f14553f = aVar == null ? n8.a.f15447a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f14551b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a() {
        c(null);
        a80 a80Var = (a80) this.f14552c;
        if (a80Var != null) {
            a80Var.u();
            this.f14552c = null;
        }
        this.d = null;
        this.e = null;
        this.f14553f = null;
    }

    public void b(e6 e6Var, ArrayList arrayList) {
        org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.f14551b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(e6Var.getContext(), o0Var, e6Var2);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(i6.Y(i6.v0(i6.f19147i6, e6Var2), 0, 0));
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
        a80 a80Var;
        a80 a80Var2;
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
        if (((e6) this.f14553f) == e6Var && a2.equals((ArrayList) this.e) && (a80Var2 = (a80) this.f14552c) != null && a80Var2.D()) {
            return;
        }
        if (((e6) this.f14553f) == e6Var && (a80Var = (a80) this.f14552c) != null && a80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(e6Var, a2);
            ((a80) this.f14552c).O();
            return;
        }
        a();
        c(e6Var);
        this.f14553f = e6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(e6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(e6Var, a2);
        a80 a10 = ((ii.p0) this.f14550a).a(e6Var.getEditText());
        a10.Q = true;
        a10.f22606s = 0;
        a10.f22607t = false;
        a10.r((LinearLayout) this.d, y5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f22588i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f22601p = new i2.h0(this, 4);
        a10.f22581d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f14552c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f7565a = (Context) ((fd.a) this.f14550a).mo28get();
        obj.f7566b = (m5.d) ((fd.a) this.f14551b).mo28get();
        obj.f7567c = (s5.d) ((fd.a) this.f14552c).mo28get();
        obj.d = (la.h) ((la.h) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f7568f = (t5.c) ((fd.a) this.f14553f).mo28get();
        obj.f7569g = aVar;
        obj.h = bVar;
        obj.f7570i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public p3(ii.p0 p0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f14550a = p0Var;
        this.f14551b = e6Var;
    }

    public p3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f14553f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f14552c = str;
        this.f14550a = new x9.f(cVar);
        this.f14551b = tVar;
    }
}
