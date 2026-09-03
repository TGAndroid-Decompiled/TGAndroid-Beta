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
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.q31;
import org.telegram.ui.LaunchActivity;
import ph.ga;
import vh.w5;
public final class s3 implements a3.b {
    public Object f13625a;
    public Object f13626b;
    public Object f13627c;
    public Object d;
    public Object e;
    public Object f13628f;
    public Object h;

    public s3(Set set, a0.f fVar, String str, String str2, b8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f13625a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f13627c = fVar2;
        this.d = str;
        this.e = str2;
        this.f13628f = aVar == null ? b8.a.f1756a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f13626b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a(bf.f fVar) {
        if (((bf.f) this.e) == fVar) {
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
                cVar.d(fVar.f1825l);
            }
        }
        ((bf.a) this.f13627c).invalidate();
    }

    public bf.a b() {
        if (((bf.a) this.f13627c) == null) {
            this.f13627c = new bf.a((LaunchActivity) this.d);
        }
        return (bf.a) this.f13627c;
    }

    public void c() {
        e(null);
        p70 p70Var = (p70) this.f13627c;
        if (p70Var != null) {
            p70Var.u();
            this.f13627c = null;
        }
        this.d = null;
        this.e = null;
        this.f13628f = null;
    }

    public void d(w5 w5Var, ArrayList arrayList) {
        f6 f6Var = (f6) this.f13626b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vh.l0 l0Var = (vh.l0) obj;
                vh.k0 k0Var = new vh.k0(w5Var.getContext(), l0Var, f6Var);
                k0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                k0Var.setBackground(j6.Y(j6.v0(j6.f19971i6, f6Var), 0, 0));
                k0Var.setOnClickListener(new q31(this, w5Var, l0Var, 8));
                ((LinearLayout) this.d).addView(k0Var, b6.n(-1, 48));
            }
        }
    }

    public void e(w5 w5Var) {
        w5 w5Var2 = (w5) this.h;
        if (w5Var2 != w5Var) {
            if (w5Var2 != null) {
                w5Var2.setShowCommandBackground(false);
            }
            this.h = w5Var;
            if (w5Var != null) {
                w5Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(w5 w5Var, String str) {
        p70 p70Var;
        p70 p70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = vh.l0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(w5Var);
        if (((w5) this.f13628f) == w5Var && a2.equals((ArrayList) this.e) && (p70Var2 = (p70) this.f13627c) != null && p70Var2.D()) {
            return;
        }
        if (((w5) this.f13628f) == w5Var && (p70Var = (p70) this.f13627c) != null && p70Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            d(w5Var, a2);
            ((p70) this.f13627c).O();
            return;
        }
        c();
        e(w5Var);
        this.f13628f = w5Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(w5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(w5Var, a2);
        p70 a10 = ((vh.m0) this.f13625a).a(w5Var.getEditText());
        a10.Q = true;
        a10.f27777s = 0;
        a10.f27778t = false;
        a10.r((LinearLayout) this.d, b6.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f27759i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f27772p = new ga(this, 28);
        a10.f27752d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f13627c = a10;
    }

    public void g() {
        String str;
        boolean z4;
        boolean z10;
        bf.f fVar = (bf.f) this.e;
        bf.f fVar2 = null;
        for (bf.f fVar3 : ((HashMap) this.f13625a).values()) {
            if (fVar3.f1826m || fVar3.f1818b.f4334a != 0) {
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
                str = fVar2.f1819c;
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
            if (fVar != null && fVar.f1820f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fVar2 != null && fVar2.f1820f) {
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
                android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) this.f13628f;
                if (c0Var != null) {
                    c0Var.c(false);
                    ((android.support.v4.media.session.c0) this.f13628f).b();
                    this.f13628f = null;
                }
                if (fVar2 != null) {
                    android.support.v4.media.session.c0 c0Var2 = new android.support.v4.media.session.c0(launchActivity, "pip-media-session", null, null);
                    this.f13628f = c0Var2;
                    c0Var2.g(null);
                    ((android.support.v4.media.session.c0) this.f13628f).c(true);
                    this.h = new q3.c((android.support.v4.media.session.c0) this.f13628f);
                }
            }
            if (fVar != null) {
                df.e eVar = fVar.f1818b;
                eVar.f4344n = false;
                eVar.h();
                bf.f fVar4 = eVar.f4340j;
                s3 s3Var = fVar4.f1817a;
                bf.c cVar2 = (bf.c) s3Var.f13626b;
                ((bf.c) s3Var.f13626b).f1793a.remove(eVar);
                cVar2.f1794b.remove(eVar);
                String str2 = fVar4.f1819c;
                HashMap hashMap = cVar2.f1795c;
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
                    cVar3.d(fVar2.f1825l);
                }
                ((bf.a) this.f13627c).bringToFront();
                df.e eVar2 = fVar2.f1818b;
                bf.f fVar5 = eVar2.f4340j;
                s3 s3Var2 = fVar5.f1817a;
                bf.c cVar4 = (bf.c) s3Var2.f13626b;
                ((bf.c) s3Var2.f13626b).f1793a.add(eVar2);
                cVar4.f1794b.add(eVar2);
                String str3 = fVar5.f1819c;
                HashMap hashMap2 = cVar4.f1795c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (fVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((bf.a) this.f13627c).invalidate();
        }
    }

    @Override
    public Object mo28get() {
        h7.u uVar = new h7.u(7);
        db.a aVar = new db.a(7);
        ?? obj = new Object();
        obj.f5101a = (Context) ((rc.a) this.f13625a).mo28get();
        obj.f5102b = (z2.d) ((rc.a) this.f13626b).mo28get();
        obj.f5103c = (f3.d) ((rc.a) this.f13627c).mo28get();
        obj.d = (af.d) ((af.d) this.d).mo28get();
        obj.e = (Executor) ((rc.a) this.e).mo28get();
        obj.f5104f = (g3.c) ((rc.a) this.f13628f).mo28get();
        obj.f5105g = uVar;
        obj.h = aVar;
        obj.f5106i = (f3.c) ((rc.a) this.h).mo28get();
        return obj;
    }

    public s3(vh.m0 m0Var, f6 f6Var) {
        this.f13625a = m0Var;
        this.f13626b = f6Var;
    }

    public s3(String str, n9.b bVar, rf.f fVar) {
        this.d = new cb.m(this, false);
        this.e = new cb.m(this, true);
        this.f13628f = new p2.w(7, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f13627c = str;
        this.f13625a = new j9.g(bVar);
        this.f13626b = fVar;
    }
}
