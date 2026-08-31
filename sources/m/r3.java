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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.r31;
import org.telegram.ui.LaunchActivity;
import qh.v9;
import wh.v5;
public final class r3 implements a3.b {
    public Object f13327a;
    public Object f13328b;
    public Object f13329c;
    public Object d;
    public Object f13330e;
    public Object f13331f;
    public Object h;

    public r3(Set set, a0.f fVar, String str, String str2, b8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f13327a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f13329c = fVar2;
        this.d = str;
        this.f13330e = str2;
        this.f13331f = aVar == null ? b8.a.f1891a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f13328b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a(cf.f fVar) {
        if (((cf.f) this.f13330e) == fVar) {
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
                cVar.d(fVar.f2500l);
            }
        }
        ((cf.a) this.f13329c).invalidate();
    }

    public cf.a b() {
        if (((cf.a) this.f13329c) == null) {
            this.f13329c = new cf.a((LaunchActivity) this.d);
        }
        return (cf.a) this.f13329c;
    }

    public void c() {
        e(null);
        q70 q70Var = (q70) this.f13329c;
        if (q70Var != null) {
            q70Var.u();
            this.f13329c = null;
        }
        this.d = null;
        this.f13330e = null;
        this.f13331f = null;
    }

    public void d(v5 v5Var, ArrayList arrayList) {
        g6 g6Var = (g6) this.f13328b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                wh.l0 l0Var = (wh.l0) obj;
                wh.k0 k0Var = new wh.k0(v5Var.getContext(), l0Var, g6Var);
                k0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                k0Var.setBackground(k6.Y(k6.v0(k6.f21750i6, g6Var), 0, 0));
                k0Var.setOnClickListener(new r31(this, v5Var, l0Var, 8));
                ((LinearLayout) this.d).addView(k0Var, c6.n(-1, 48));
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
        q70 q70Var;
        q70 q70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = wh.l0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(v5Var);
        if (((v5) this.f13331f) == v5Var && a2.equals((ArrayList) this.f13330e) && (q70Var2 = (q70) this.f13329c) != null && q70Var2.D()) {
            return;
        }
        if (((v5) this.f13331f) == v5Var && (q70Var = (q70) this.f13329c) != null && q70Var.D() && ((LinearLayout) this.d) != null) {
            this.f13330e = a2;
            d(v5Var, a2);
            ((q70) this.f13329c).O();
            return;
        }
        c();
        e(v5Var);
        this.f13331f = v5Var;
        this.f13330e = a2;
        LinearLayout linearLayout = new LinearLayout(v5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(v5Var, a2);
        q70 a10 = ((wh.m0) this.f13327a).a(v5Var.getEditText());
        a10.Q = true;
        a10.f30329s = 0;
        a10.f30330t = false;
        a10.r((LinearLayout) this.d, c6.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f30311i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f30324p = new v9(this, 29);
        a10.f30303d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f13329c = a10;
    }

    public void g() {
        String str;
        boolean z4;
        boolean z10;
        cf.f fVar = (cf.f) this.f13330e;
        cf.f fVar2 = null;
        for (cf.f fVar3 : ((HashMap) this.f13327a).values()) {
            if (fVar3.f2501m || fVar3.f2492b.f5036a != 0) {
                if (fVar2 == null || fVar3.d > fVar2.d) {
                    fVar2 = fVar3;
                }
            }
        }
        if (fVar != fVar2) {
            this.f13330e = fVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb = new StringBuilder("onMaxPrioritySourceChanged ");
            if (fVar2 != null) {
                str = fVar2.f2493c;
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
            if (fVar != null && fVar.f2495f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fVar2 != null && fVar2.f2495f) {
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
                android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.f13331f;
                if (c0Var != null) {
                    c0Var.c(false);
                    ((android.support.v4.media.session.c0) this.f13331f).b();
                    this.f13331f = null;
                }
                if (fVar2 != null) {
                    android.support.v4.media.session.c0 c0Var2 = new android.support.v4.media.session.c0(launchActivity, "pip-media-session", null, null);
                    this.f13331f = c0Var2;
                    c0Var2.g(null);
                    ((android.support.v4.media.session.c0) this.f13331f).c(true);
                    this.h = new q3.c((android.support.v4.media.session.c0) this.f13331f);
                }
            }
            if (fVar != null) {
                ef.e eVar = fVar.f2492b;
                eVar.f5047n = false;
                eVar.h();
                cf.f fVar4 = eVar.f5043j;
                r3 r3Var = fVar4.f2491a;
                cf.c cVar2 = (cf.c) r3Var.f13328b;
                ((cf.c) r3Var.f13328b).f2465a.remove(eVar);
                cVar2.f2466b.remove(eVar);
                String str2 = fVar4.f2493c;
                HashMap hashMap = cVar2.f2467c;
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
                    cVar3.d(fVar2.f2500l);
                }
                ((cf.a) this.f13329c).bringToFront();
                ef.e eVar2 = fVar2.f2492b;
                cf.f fVar5 = eVar2.f5043j;
                r3 r3Var2 = fVar5.f2491a;
                cf.c cVar4 = (cf.c) r3Var2.f13328b;
                ((cf.c) r3Var2.f13328b).f2465a.add(eVar2);
                cVar4.f2466b.add(eVar2);
                String str3 = fVar5.f2493c;
                HashMap hashMap2 = cVar4.f2467c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (fVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((cf.a) this.f13329c).invalidate();
        }
    }

    @Override
    public Object mo38get() {
        z9.d dVar = new z9.d(7);
        h7.u uVar = new h7.u(7);
        ?? obj = new Object();
        obj.f4931a = (Context) ((rc.a) this.f13327a).mo38get();
        obj.f4932b = (z2.e) ((rc.a) this.f13328b).mo38get();
        obj.f4933c = (f3.d) ((rc.a) this.f13329c).mo38get();
        obj.d = (androidx.biometric.e) ((androidx.biometric.e) this.d).mo38get();
        obj.f4934e = (Executor) ((rc.a) this.f13330e).mo38get();
        obj.f4935f = (g3.c) ((rc.a) this.f13331f).mo38get();
        obj.f4936g = dVar;
        obj.h = uVar;
        obj.f4937i = (f3.c) ((rc.a) this.h).mo38get();
        return obj;
    }

    public r3(wh.m0 m0Var, g6 g6Var) {
        this.f13327a = m0Var;
        this.f13328b = g6Var;
    }

    public r3(String str, n9.b bVar, sf.e eVar) {
        this.d = new cb.m(this, false);
        this.f13330e = new cb.m(this, true);
        this.f13331f = new p2.v(6, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f13329c = str;
        this.f13327a = new j9.g(bVar);
        this.f13328b = eVar;
    }
}
