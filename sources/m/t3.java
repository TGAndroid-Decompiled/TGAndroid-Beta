package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import h7.z5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.LaunchActivity;
import rh.t5;

public final class t3 implements y2.b {

    public Object f17473a;

    public Object f17474b;

    public Object f17475c;
    public Object d;

    public Object f17476e;

    public Object f17477f;
    public Object h;

    public t3(Set set, a0.f fVar, String str, String str2, y7.a aVar) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f17473a = setUnmodifiableSet;
        Map map = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f17475c = map;
        this.d = str;
        this.f17476e = str2;
        this.f17477f = aVar == null ? y7.a.f49798a : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f17474b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a(ye.d dVar) {
        if (((ye.d) this.f17476e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
            if (mediaSessionConnector != null) {
                mediaSessionConnector.setPlayer(dVar.f49869l);
            }
        }
        ((ye.a) this.f17475c).invalidate();
    }

    public ye.a b() {
        if (((ye.a) this.f17475c) == null) {
            this.f17475c = new ye.a((LaunchActivity) this.d);
        }
        return (ye.a) this.f17475c;
    }

    public void c() {
        e(null);
        b70 b70Var = (b70) this.f17475c;
        if (b70Var != null) {
            b70Var.u();
            this.f17475c = null;
        }
        this.d = null;
        this.f17476e = null;
        this.f17477f = null;
    }

    public void d(t5 t5Var, ArrayList arrayList) {
        c6 c6Var = (c6) this.f17474b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            rh.k0 k0Var = (rh.k0) obj;
            rh.j0 j0Var = new rh.j0(t5Var.getContext(), k0Var, c6Var);
            j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            j0Var.setBackground(g6.Y(g6.v0(g6.f23144i6, c6Var), 0, 0));
            j0Var.setOnClickListener(new ld0(this, t5Var, k0Var, 7));
            ((LinearLayout) this.d).addView(j0Var, z5.n(-1, 48));
        }
    }

    public void e(t5 t5Var) {
        t5 t5Var2 = (t5) this.h;
        if (t5Var2 == t5Var) {
            return;
        }
        if (t5Var2 != null) {
            t5Var2.setShowCommandBackground(false);
        }
        this.h = t5Var;
        if (t5Var != null) {
            t5Var.setShowCommandBackground(true);
        }
    }

    public void f(t5 t5Var, String str) {
        b70 b70Var;
        b70 b70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList arrayListA = rh.k0.a(str);
        if (arrayListA.isEmpty()) {
            c();
            return;
        }
        e(t5Var);
        if (((t5) this.f17477f) == t5Var && arrayListA.equals((ArrayList) this.f17476e) && (b70Var2 = (b70) this.f17475c) != null && b70Var2.D()) {
            return;
        }
        if (((t5) this.f17477f) == t5Var && (b70Var = (b70) this.f17475c) != null && b70Var.D() && ((LinearLayout) this.d) != null) {
            this.f17476e = arrayListA;
            d(t5Var, arrayListA);
            ((b70) this.f17475c).O();
            return;
        }
        c();
        e(t5Var);
        this.f17477f = t5Var;
        this.f17476e = arrayListA;
        LinearLayout linearLayout = new LinearLayout(t5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(t5Var, arrayListA);
        b70 b70VarE = ((rh.l0) this.f17473a).e(t5Var.getEditText());
        b70VarE.Q = true;
        b70VarE.f26992s = 0;
        b70VarE.f26993t = false;
        b70VarE.r((LinearLayout) this.d, z5.n(220, -2));
        b70VarE.X = AndroidUtilities.dp(240.0f);
        b70VarE.f26974i = 3;
        b70VarE.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        b70VarE.f26987p = new qf.b(this, 11);
        b70VarE.f26966d0 = true;
        if (b70VarE.D()) {
            b70VarE.C();
        }
        b70VarE.Z();
        this.f17475c = b70VarE;
    }

    public void g() {
        ye.d dVar = (ye.d) this.f17476e;
        ye.d dVar2 = null;
        for (ye.d dVar3 : ((HashMap) this.f17473a).values()) {
            if (dVar3.f49870m || dVar3.f49861b.f258a != 0) {
                if (dVar2 == null || dVar3.d > dVar2.d) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar != dVar2) {
            this.f17476e = dVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            sb2.append(dVar2 != null ? dVar2.f49862c : null);
            Log.i("PIP_DEBUG", sb2.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if ((dVar != null && dVar.f49864f) != (dVar2 != null && dVar2.f49864f)) {
                MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
                if (mediaSessionConnector != null) {
                    mediaSessionConnector.setPlayer(null);
                    this.h = null;
                }
                android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) this.f17477f;
                if (d0Var != null) {
                    d0Var.c(false);
                    ((android.support.v4.media.session.d0) this.f17477f).b();
                    this.f17477f = null;
                }
                if (dVar2 != null) {
                    android.support.v4.media.session.d0 d0Var2 = new android.support.v4.media.session.d0(launchActivity, "pip-media-session", null, null);
                    this.f17477f = d0Var2;
                    d0Var2.g(null);
                    ((android.support.v4.media.session.d0) this.f17477f).c(true);
                    this.h = new MediaSessionConnector((android.support.v4.media.session.d0) this.f17477f);
                }
            }
            if (dVar != null) {
                af.f fVar = dVar.f49861b;
                fVar.f269n = false;
                fVar.h();
                ye.d dVar4 = fVar.f265j;
                t3 t3Var = dVar4.f49860a;
                ye.b bVar = (ye.b) t3Var.f17474b;
                ye.b bVar2 = (ye.b) t3Var.f17474b;
                bVar.f49836a.remove(fVar);
                bVar2.f49837b.remove(fVar);
                String str = dVar4.f49862c;
                HashMap map = bVar2.f49838c;
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        map.remove(str);
                    }
                }
            }
            if (dVar2 != null) {
                MediaSessionConnector mediaSessionConnector2 = (MediaSessionConnector) this.h;
                if (mediaSessionConnector2 != null) {
                    mediaSessionConnector2.setPlayer(dVar2.f49869l);
                }
                ((ye.a) this.f17475c).bringToFront();
                af.f fVar2 = dVar2.f49861b;
                ye.d dVar5 = fVar2.f265j;
                t3 t3Var2 = dVar5.f49860a;
                ye.b bVar3 = (ye.b) t3Var2.f17474b;
                ye.b bVar4 = (ye.b) t3Var2.f17474b;
                bVar3.f49836a.add(fVar2);
                bVar4.f49837b.add(fVar2);
                String str2 = dVar5.f49862c;
                HashMap map2 = bVar4.f49838c;
                ArrayList arrayList2 = (ArrayList) map2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((ye.a) this.f17475c).invalidate();
        }
    }

    @Override
    public Object mo28get() {
        Context context = (Context) ((oc.a) this.f17473a).mo28get();
        x2.d dVar = (x2.d) ((oc.a) this.f17474b).mo28get();
        d3.d dVar2 = (d3.d) ((oc.a) this.f17475c).mo28get();
        a5.n nVar = (a5.n) ((a5.n) this.d).mo28get();
        Executor executor = (Executor) ((oc.a) this.f17476e).mo28get();
        e3.c cVar = (e3.c) ((oc.a) this.f17477f).mo28get();
        w9.d dVar3 = new w9.d(6);
        e7.v vVar = new e7.v(6);
        d3.c cVar2 = (d3.c) ((oc.a) this.h).mo28get();
        c3.g gVar = new c3.g();
        gVar.f2433a = context;
        gVar.f2434b = dVar;
        gVar.f2435c = dVar2;
        gVar.d = nVar;
        gVar.f2436e = executor;
        gVar.f2437f = cVar;
        gVar.f2438g = dVar3;
        gVar.h = vVar;
        gVar.f2439i = cVar2;
        return gVar;
    }

    public t3(rh.l0 l0Var, c6 c6Var) {
        this.f17473a = l0Var;
        this.f17474b = c6Var;
    }

    public t3(String str, k9.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.l(this, false);
        this.f17476e = new com.google.firebase.messaging.l(this, true);
        this.f17477f = new n2.v(6, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f17475c = str;
        this.f17473a = new g9.g(cVar);
        this.f17474b = tVar;
    }
}
