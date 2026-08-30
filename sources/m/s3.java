package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.q31;
import org.telegram.ui.LaunchActivity;
import ph.ga;
import vh.v5;
public final class s3 implements a3.b {
    public Object f13641a;
    public Object f13642b;
    public Object f13643c;
    public Object d;
    public Object e;
    public Object f13644f;
    public Object h;

    public s3(Set set, a0.f fVar, String str, String str2, b8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f13641a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f13643c = fVar2;
        this.d = str;
        this.e = str2;
        this.f13644f = aVar == null ? b8.a.f1745a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f13642b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a(cf.f fVar) {
        if (((cf.f) this.e) == fVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, fVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            q3.c cVar = (q3.c) this.h;
            if (cVar != null) {
                cVar.d(fVar.f2303l);
            }
        }
        ((cf.a) this.f13643c).invalidate();
    }

    public cf.a b() {
        if (((cf.a) this.f13643c) == null) {
            this.f13643c = new cf.a((LaunchActivity) this.d);
        }
        return (cf.a) this.f13643c;
    }

    public void c() {
        e(null);
        o70 o70Var = (o70) this.f13643c;
        if (o70Var != null) {
            o70Var.u();
            this.f13643c = null;
        }
        this.d = null;
        this.e = null;
        this.f13644f = null;
    }

    public void d(v5 v5Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f13642b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vh.k0 k0Var = (vh.k0) obj;
                vh.j0 j0Var = new vh.j0(v5Var.getContext(), k0Var, f6Var);
                j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                j0Var.setBackground(j6.Y(j6.v0(j6.f19996i6, f6Var), 0, 0));
                j0Var.setOnClickListener(new q31(this, v5Var, k0Var, 8));
                ((LinearLayout) this.d).addView(j0Var, b6.n(-1, 48));
            }
        }
    }

    public void e(v5 v5Var) {
        v5 v5Var2 = (v5) this.h;
        if (v5Var2 != v5Var) {
            if (v5Var2 != null) {
                v5Var2.setShowCommandBackground(false);
            }
            this.h = v5Var;
            if (v5Var != null) {
                v5Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(v5 v5Var, String str) {
        o70 o70Var;
        o70 o70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = vh.k0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(v5Var);
        if (((v5) this.f13644f) == v5Var && a2.equals((ArrayList) this.e) && (o70Var2 = (o70) this.f13643c) != null && o70Var2.D()) {
            return;
        }
        if (((v5) this.f13644f) == v5Var && (o70Var = (o70) this.f13643c) != null && o70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(v5Var, a2);
            ((o70) this.f13643c).O();
            return;
        }
        c();
        e(v5Var);
        this.f13644f = v5Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(v5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(v5Var, a2);
        o70 a10 = ((vh.l0) this.f13641a).a(v5Var.getEditText());
        a10.Q = true;
        a10.f27489s = 0;
        a10.f27490t = false;
        a10.r((LinearLayout) this.d, b6.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f27471i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f27484p = new ga(this, 27);
        a10.f27464d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f13643c = a10;
    }

    public void g() {
        String str;
        boolean z4;
        boolean z10;
        cf.f fVar = (cf.f) this.e;
        cf.f fVar2 = null;
        for (cf.f fVar3 : ((HashMap) this.f13641a).values()) {
            if (fVar3.f2304m || fVar3.f2296b.f5196a != 0) {
                if (fVar2 == null || fVar3.d > fVar2.d) {
                    fVar2 = fVar3;
                }
            }
        }
        if (fVar != fVar2) {
            this.e = fVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb = new StringBuilder("onMaxPrioritySourceChanged ");
            if (fVar2 != null) {
                str = fVar2.f2297c;
            } else {
                str = null;
            }
            sb.append(str);
            Log.i("PIP_DEBUG", sb.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, fVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if (fVar != null && fVar.f2298f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fVar2 != null && fVar2.f2298f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 != z10) {
                q3.c cVar = (q3.c) this.h;
                if (cVar != null) {
                    cVar.d(null);
                    this.h = null;
                }
                android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.f13644f;
                if (c0Var != null) {
                    c0Var.c(false);
                    ((android.support.v4.media.session.c0) this.f13644f).b();
                    this.f13644f = null;
                }
                if (fVar2 != null) {
                    android.support.v4.media.session.c0 c0Var2 = new android.support.v4.media.session.c0(launchActivity, "pip-media-session", null, null);
                    this.f13644f = c0Var2;
                    c0Var2.g(null);
                    ((android.support.v4.media.session.c0) this.f13644f).c(true);
                    this.h = new q3.c((android.support.v4.media.session.c0) this.f13644f);
                }
            }
            if (fVar != null) {
                ef.f fVar4 = fVar.f2296b;
                fVar4.f5206n = false;
                fVar4.h();
                cf.f fVar5 = fVar4.f5202j;
                s3 s3Var = fVar5.f2295a;
                cf.c cVar2 = (cf.c) s3Var.f13642b;
                ((cf.c) s3Var.f13642b).f2271a.remove(fVar4);
                cVar2.f2272b.remove(fVar4);
                String str2 = fVar5.f2297c;
                HashMap hashMap = cVar2.f2273c;
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str2);
                    }
                }
            }
            if (fVar2 != null) {
                q3.c cVar3 = (q3.c) this.h;
                if (cVar3 != null) {
                    cVar3.d(fVar2.f2303l);
                }
                ((cf.a) this.f13643c).bringToFront();
                ef.f fVar6 = fVar2.f2296b;
                cf.f fVar7 = fVar6.f5202j;
                s3 s3Var2 = fVar7.f2295a;
                cf.c cVar4 = (cf.c) s3Var2.f13642b;
                ((cf.c) s3Var2.f13642b).f2271a.add(fVar6);
                cVar4.f2272b.add(fVar6);
                String str3 = fVar7.f2297c;
                HashMap hashMap2 = cVar4.f2273c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (fVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((cf.a) this.f13643c).invalidate();
        }
    }

    @Override
    public Object mo0get() {
        z9.d dVar = new z9.d(7);
        h7.u uVar = new h7.u(7);
        ?? obj = new Object();
        obj.f5095a = (Context) ((rc.a) this.f13641a).mo0get();
        obj.f5096b = (z2.d) ((rc.a) this.f13642b).mo0get();
        obj.f5097c = (f3.d) ((rc.a) this.f13643c).mo0get();
        obj.d = (androidx.biometric.e) ((androidx.biometric.e) this.d).mo0get();
        obj.e = (Executor) ((rc.a) this.e).mo0get();
        obj.f5098f = (g3.c) ((rc.a) this.f13644f).mo0get();
        obj.f5099g = dVar;
        obj.h = uVar;
        obj.f5100i = (f3.c) ((rc.a) this.h).mo0get();
        return obj;
    }

    public s3(vh.l0 l0Var, f6 f6Var) {
        this.f13641a = l0Var;
        this.f13642b = f6Var;
    }

    public s3(String str, n9.b bVar, com.google.firebase.messaging.r rVar) {
        this.d = new cb.m(this, false);
        this.e = new cb.m(this, true);
        this.f13644f = new p2.w(7, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f13643c = str;
        this.f13641a = new j9.g(bVar);
        this.f13642b = rVar;
    }
}
