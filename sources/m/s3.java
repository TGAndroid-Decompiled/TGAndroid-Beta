package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import i7.f6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.LaunchActivity;
import th.t5;
public final class s3 implements a3.b {
    public Object f16688a;
    public Object f16689b;
    public Object f16690c;
    public Object d;
    public Object f16691e;
    public Object f16692f;
    public Object h;

    public s3(Set set, a0.f fVar, String str, String str2, z7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f16688a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f16690c = fVar2;
        this.d = str;
        this.f16691e = str2;
        this.f16692f = aVar == null ? z7.a.f50781a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f16689b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a(af.g gVar) {
        if (((af.g) this.f16691e) == gVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (gVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, gVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
            if (mediaSessionConnector != null) {
                mediaSessionConnector.setPlayer(gVar.f406l);
            }
        }
        ((af.a) this.f16690c).invalidate();
    }

    public af.a b() {
        if (((af.a) this.f16690c) == null) {
            this.f16690c = new af.a((LaunchActivity) this.d);
        }
        return (af.a) this.f16690c;
    }

    public void c() {
        e(null);
        j70 j70Var = (j70) this.f16690c;
        if (j70Var != null) {
            j70Var.u();
            this.f16690c = null;
        }
        this.d = null;
        this.f16691e = null;
        this.f16692f = null;
    }

    public void d(t5 t5Var, ArrayList arrayList) {
        c6 c6Var = (c6) this.f16689b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                th.k0 k0Var = (th.k0) obj;
                th.j0 j0Var = new th.j0(t5Var.getContext(), k0Var, c6Var);
                j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                j0Var.setBackground(g6.Y(g6.v0(g6.f23152i6, c6Var), 0, 0));
                j0Var.setOnClickListener(new ya0(this, t5Var, k0Var, 8));
                ((LinearLayout) this.d).addView(j0Var, f6.n(-1, 48));
            }
        }
    }

    public void e(t5 t5Var) {
        t5 t5Var2 = (t5) this.h;
        if (t5Var2 != t5Var) {
            if (t5Var2 != null) {
                t5Var2.setShowCommandBackground(false);
            }
            this.h = t5Var;
            if (t5Var != null) {
                t5Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(t5 t5Var, String str) {
        j70 j70Var;
        j70 j70Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = th.k0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(t5Var);
        if (((t5) this.f16692f) == t5Var && a2.equals((ArrayList) this.f16691e) && (j70Var2 = (j70) this.f16690c) != null && j70Var2.D()) {
            return;
        }
        if (((t5) this.f16692f) == t5Var && (j70Var = (j70) this.f16690c) != null && j70Var.D() && ((LinearLayout) this.d) != null) {
            this.f16691e = a2;
            d(t5Var, a2);
            ((j70) this.f16690c).O();
            return;
        }
        c();
        e(t5Var);
        this.f16692f = t5Var;
        this.f16691e = a2;
        LinearLayout linearLayout = new LinearLayout(t5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(t5Var, a2);
        j70 b10 = ((th.l0) this.f16688a).b(t5Var.getEditText());
        b10.Q = true;
        b10.f29600s = 0;
        b10.f29601t = false;
        b10.r((LinearLayout) this.d, f6.n(220, -2));
        b10.X = AndroidUtilities.dp(240.0f);
        b10.f29582i = 3;
        b10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        b10.f29595p = new org.telegram.ui.web.t1(this, 25);
        b10.f29574d0 = true;
        if (b10.D()) {
            b10.C();
        }
        b10.Z();
        this.f16690c = b10;
    }

    public void g() {
        String str;
        boolean z10;
        boolean z11;
        af.g gVar = (af.g) this.f16691e;
        af.g gVar2 = null;
        for (af.g gVar3 : ((HashMap) this.f16688a).values()) {
            if (gVar3.f407m || gVar3.f398b.f3044a != 0) {
                if (gVar2 == null || gVar3.d > gVar2.d) {
                    gVar2 = gVar3;
                }
            }
        }
        if (gVar != gVar2) {
            this.f16691e = gVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            if (gVar2 != null) {
                str = gVar2.f399c;
            } else {
                str = null;
            }
            sb2.append(str);
            Log.i("PIP_DEBUG", sb2.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (gVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, gVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if (gVar != null && gVar.f401f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (gVar2 != null && gVar2.f401f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) this.h;
                if (mediaSessionConnector != null) {
                    mediaSessionConnector.setPlayer(null);
                    this.h = null;
                }
                android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) this.f16692f;
                if (d0Var != null) {
                    d0Var.c(false);
                    ((android.support.v4.media.session.d0) this.f16692f).b();
                    this.f16692f = null;
                }
                if (gVar2 != null) {
                    android.support.v4.media.session.d0 d0Var2 = new android.support.v4.media.session.d0(launchActivity, "pip-media-session", null, null);
                    this.f16692f = d0Var2;
                    d0Var2.g(null);
                    ((android.support.v4.media.session.d0) this.f16692f).c(true);
                    this.h = new MediaSessionConnector((android.support.v4.media.session.d0) this.f16692f);
                }
            }
            if (gVar != null) {
                cf.e eVar = gVar.f398b;
                eVar.f3055n = false;
                eVar.h();
                af.g gVar4 = eVar.f3051j;
                s3 s3Var = gVar4.f397a;
                af.d dVar = (af.d) s3Var.f16689b;
                ((af.d) s3Var.f16689b).f371a.remove(eVar);
                dVar.f372b.remove(eVar);
                String str2 = gVar4.f399c;
                HashMap hashMap = dVar.f373c;
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str2);
                    }
                }
            }
            if (gVar2 != null) {
                MediaSessionConnector mediaSessionConnector2 = (MediaSessionConnector) this.h;
                if (mediaSessionConnector2 != null) {
                    mediaSessionConnector2.setPlayer(gVar2.f406l);
                }
                ((af.a) this.f16690c).bringToFront();
                cf.e eVar2 = gVar2.f398b;
                af.g gVar5 = eVar2.f3051j;
                s3 s3Var2 = gVar5.f397a;
                af.d dVar2 = (af.d) s3Var2.f16689b;
                ((af.d) s3Var2.f16689b).f371a.add(eVar2);
                dVar2.f372b.add(eVar2);
                String str3 = gVar5.f399c;
                HashMap hashMap2 = dVar2.f373c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (gVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((af.a) this.f16690c).invalidate();
        }
    }

    @Override
    public Object mo18get() {
        f7.v vVar = new f7.v(8);
        bb.a aVar = new bb.a(8);
        ?? obj = new Object();
        obj.f5812a = (Context) ((pc.a) this.f16688a).mo18get();
        obj.f5813b = (z2.d) ((pc.a) this.f16689b).mo18get();
        obj.f5814c = (f3.d) ((pc.a) this.f16690c).mo18get();
        obj.d = (androidx.biometric.e) ((androidx.biometric.e) this.d).mo18get();
        obj.f5815e = (Executor) ((pc.a) this.f16691e).mo18get();
        obj.f5816f = (g3.c) ((pc.a) this.f16692f).mo18get();
        obj.f5817g = vVar;
        obj.h = aVar;
        obj.f5818i = (f3.c) ((pc.a) this.h).mo18get();
        return obj;
    }

    public s3(th.l0 l0Var, c6 c6Var) {
        this.f16688a = l0Var;
        this.f16689b = c6Var;
    }

    public s3(String str, l9.b bVar, com.google.firebase.messaging.s sVar) {
        this.d = new ab.m(this, false);
        this.f16691e = new ab.m(this, true);
        this.f16692f = new p2.u(7, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f16690c = str;
        this.f16688a = new h9.g(bVar);
        this.f16689b = sVar;
    }
}
