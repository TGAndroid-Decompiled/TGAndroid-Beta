package m;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import w7.x5;
public final class q3 implements n5.b {
    public Object f14288a;
    public Object f14289b;
    public Object f14290c;
    public Object d;
    public Object e;
    public Object f14291f;
    public Object h;

    public q3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f14288a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f14290c = fVar2;
        this.d = str;
        this.e = str2;
        this.f14291f = aVar == null ? n8.a.f15185a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f14289b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static void d(ViewGroup viewGroup, int i10, int i11, int i12) {
        int min = Math.min(0, i10 - AndroidUtilities.dp(48.0f));
        int min2 = Math.min(0, i11 - AndroidUtilities.dp(48.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, min, 0, min2);
        viewGroup.setPadding(0, (i10 + i12) - min, 0, i11 - min2);
    }

    public void a() {
        c(null);
        n70 n70Var = (n70) this.f14290c;
        if (n70Var != null) {
            n70Var.u();
            this.f14290c = null;
        }
        this.d = null;
        this.e = null;
        this.f14291f = null;
    }

    public void b(d6 d6Var, ArrayList arrayList) {
        e6 e6Var = (e6) this.f14289b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(d6Var.getContext(), o0Var, e6Var);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(i6.Y(i6.v0(i6.f18926i6, e6Var), 0, 0));
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

    public void e(FrameLayout frameLayout, ll0 ll0Var, org.telegram.ui.ActionBar.k kVar, e6 e6Var) {
        this.e = frameLayout;
        this.f14291f = ll0Var;
        ll0Var.setCaptureSectionsDecoratorAllowed(true);
        this.h = new ki.a(0, ll0Var, frameLayout);
        ((ki.h) this.f14288a).a(ll0Var);
        kVar.setCenterTitleAndGlass(true);
        dh.e eVar = new dh.e(e6Var);
        eVar.e = new d2.c(6);
        eVar.f(-1, 553648127);
        eVar.e(-1, 352321535);
        eVar.d(255013683, 0);
        float dpf2 = AndroidUtilities.dpf2(6.6666665f);
        float dpf22 = AndroidUtilities.dpf2(2.0f);
        eVar.f7738n = dpf2;
        eVar.f7739r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.55f);
        float dpf24 = AndroidUtilities.dpf2(0.55f);
        eVar.f7737f = dpf23;
        eVar.h = dpf24;
        kVar.M((ah.c) this.f14289b, eVar, false);
        kVar.setAddToContainer(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, x5.e(-1, -2, 48));
        ah.d dVar = new ah.d(((ah.c) this.f14290c).c(kVar, null, false));
        dVar.b(-AndroidUtilities.dp(50.0f), true);
        dVar.f439q = 224;
        kVar.setBackground(dVar);
        kVar.setExtraHeight(AndroidUtilities.dp(12.0f));
        ll0Var.setClipToPadding(false);
    }

    public void f(d6 d6Var, String str) {
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
        if (((d6) this.f14291f) == d6Var && a2.equals((ArrayList) this.e) && (n70Var2 = (n70) this.f14290c) != null && n70Var2.D()) {
            return;
        }
        if (((d6) this.f14291f) == d6Var && (n70Var = (n70) this.f14290c) != null && n70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((n70) this.f14290c).O();
            return;
        }
        a();
        c(d6Var);
        this.f14291f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        n70 a10 = ((ii.p0) this.f14288a).a(d6Var.getEditText());
        a10.Q = true;
        a10.f26368s = 0;
        a10.f26369t = false;
        a10.r((LinearLayout) this.d, x5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f26350i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f26363p = new i2.g0(this, 4);
        a10.f26343d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f14290c = a10;
    }

    @Override
    public Object mo28get() {
        rb.a aVar = new rb.a(23);
        qb.b bVar = new qb.b(23);
        ?? obj = new Object();
        obj.f7576a = (Context) ((fd.a) this.f14288a).mo28get();
        obj.f7577b = (m5.d) ((fd.a) this.f14289b).mo28get();
        obj.f7578c = (s5.d) ((fd.a) this.f14290c).mo28get();
        obj.d = (e3) ((e3) this.d).mo28get();
        obj.e = (Executor) ((fd.a) this.e).mo28get();
        obj.f7579f = (t5.c) ((fd.a) this.f14291f).mo28get();
        obj.f7580g = aVar;
        obj.h = bVar;
        obj.f7581i = (s5.c) ((fd.a) this.h).mo28get();
        return obj;
    }

    public q3(ii.p0 p0Var, e6 e6Var) {
        this.f14288a = p0Var;
        this.f14289b = e6Var;
    }

    public q3(ki.h hVar, ki.e eVar) {
        this.f14288a = hVar;
        hVar.f13661a = new k2.v(this, 1);
        hVar.d = new li.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        cVar.a(eVar.e());
        hVar.f13675r.add(new ki.f(cVar, eVar));
        this.f14290c = new ah.c(cVar);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar2 = new ah.h(false);
            this.d = hVar2;
            fh.d dVar = new fh.d(cVar);
            dVar.f9072f = cVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f14289b = cVar2;
            cVar2.h = hVar;
            int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f421b = dp;
            cVar2.f422c = dp;
            cVar2.f425i = LiteMode.isEnabled(262144);
            int i10 = LiteMode.isEnabled(262144) ? -2 : -3;
            dVar.d = hVar2;
            dVar.e = i10;
            return;
        }
        this.d = null;
        ah.c cVar3 = new ah.c(cVar);
        this.f14289b = cVar3;
        cVar3.h = hVar;
    }

    public q3(String str, ba.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f14291f = new c5.b0(10, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f14290c = str;
        this.f14288a = new x9.f(cVar);
        this.f14289b = tVar;
    }
}
