package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import qh.s5;
public final class t3 implements y2.b {
    public Object f17098a;
    public Object f17099b;
    public Object f17100c;
    public Object d;
    public Object f17101e;
    public Object f17102f;
    public Object h;

    public t3(Set set, a0.f fVar, String str, String str2, x7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f17098a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f17100c = fVar2;
        this.d = str;
        this.f17101e = str2;
        this.f17102f = aVar == null ? x7.a.f49081a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f17099b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void a(xe.d dVar) {
        if (((xe.d) this.f17101e) == dVar) {
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
                mediaSessionConnector.setPlayer(dVar.f49153l);
            }
        }
        ((xe.a) this.f17100c).invalidate();
    }

    public xe.a b() {
        if (((xe.a) this.f17100c) == null) {
            this.f17100c = new xe.a((LaunchActivity) this.d);
        }
        return (xe.a) this.f17100c;
    }

    public void c() {
        e(null);
        x60 x60Var = (x60) this.f17100c;
        if (x60Var != null) {
            x60Var.u();
            this.f17100c = null;
        }
        this.d = null;
        this.f17101e = null;
        this.f17102f = null;
    }

    public void d(s5 s5Var, ArrayList arrayList) {
        b6 b6Var = (b6) this.f17099b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                qh.k0 k0Var = (qh.k0) obj;
                qh.j0 j0Var = new qh.j0(s5Var.getContext(), k0Var, b6Var);
                j0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                j0Var.setBackground(f6.Y(f6.v0(f6.f23092i6, b6Var), 0, 0));
                j0Var.setOnClickListener(new gd0(this, s5Var, k0Var, 7));
                ((LinearLayout) this.d).addView(j0Var, e6.n(-1, 48));
            }
        }
    }

    public void e(s5 s5Var) {
        s5 s5Var2 = (s5) this.h;
        if (s5Var2 != s5Var) {
            if (s5Var2 != null) {
                s5Var2.setShowCommandBackground(false);
            }
            this.h = s5Var;
            if (s5Var != null) {
                s5Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(s5 s5Var, String str) {
        x60 x60Var;
        x60 x60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a2 = qh.k0.a(str);
        if (a2.isEmpty()) {
            c();
            return;
        }
        e(s5Var);
        if (((s5) this.f17102f) == s5Var && a2.equals((ArrayList) this.f17101e) && (x60Var2 = (x60) this.f17100c) != null && x60Var2.D()) {
            return;
        }
        if (((s5) this.f17102f) == s5Var && (x60Var = (x60) this.f17100c) != null && x60Var.D() && ((LinearLayout) this.d) != null) {
            this.f17101e = a2;
            d(s5Var, a2);
            ((x60) this.f17100c).O();
            return;
        }
        c();
        e(s5Var);
        this.f17102f = s5Var;
        this.f17101e = a2;
        LinearLayout linearLayout = new LinearLayout(s5Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        d(s5Var, a2);
        x60 g10 = ((qh.l0) this.f17098a).g(s5Var.getEditText());
        g10.Q = true;
        g10.f34580s = 0;
        g10.f34581t = false;
        g10.r((LinearLayout) this.d, e6.n(220, -2));
        g10.X = AndroidUtilities.dp(240.0f);
        g10.f34562i = 3;
        g10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        g10.f34575p = new pf.o1(this, 4);
        g10.f34554d0 = true;
        if (g10.D()) {
            g10.C();
        }
        g10.Z();
        this.f17100c = g10;
    }

    public void g() {
        String str;
        boolean z10;
        boolean z11;
        xe.d dVar = (xe.d) this.f17101e;
        xe.d dVar2 = null;
        for (xe.d dVar3 : ((HashMap) this.f17098a).values()) {
            if (dVar3.f49154m || dVar3.f49145b.f50439a != 0) {
                if (dVar2 == null || dVar3.d > dVar2.d) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar != dVar2) {
            this.f17101e = dVar2;
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            if (dVar2 != null) {
                str = dVar2.f49146c;
            } else {
                str = null;
            }
            sb2.append(str);
            Log.i("PIP_DEBUG", sb2.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if (dVar != null && dVar.f49148f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (dVar2 != null && dVar2.f49148f) {
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
                android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) this.f17102f;
                if (d0Var != null) {
                    d0Var.c(false);
                    ((android.support.v4.media.session.d0) this.f17102f).b();
                    this.f17102f = null;
                }
                if (dVar2 != null) {
                    android.support.v4.media.session.d0 d0Var2 = new android.support.v4.media.session.d0(launchActivity, "pip-media-session", null, null);
                    this.f17102f = d0Var2;
                    d0Var2.g(null);
                    ((android.support.v4.media.session.d0) this.f17102f).c(true);
                    this.h = new MediaSessionConnector((android.support.v4.media.session.d0) this.f17102f);
                }
            }
            if (dVar != null) {
                ze.e eVar = dVar.f49145b;
                eVar.f50450n = false;
                eVar.h();
                xe.d dVar4 = eVar.f50446j;
                t3 t3Var = dVar4.f49144a;
                xe.b bVar = (xe.b) t3Var.f17099b;
                ((xe.b) t3Var.f17099b).f49120a.remove(eVar);
                bVar.f49121b.remove(eVar);
                String str2 = dVar4.f49146c;
                HashMap hashMap = bVar.f49122c;
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str2);
                    }
                }
            }
            if (dVar2 != null) {
                MediaSessionConnector mediaSessionConnector2 = (MediaSessionConnector) this.h;
                if (mediaSessionConnector2 != null) {
                    mediaSessionConnector2.setPlayer(dVar2.f49153l);
                }
                ((xe.a) this.f17100c).bringToFront();
                ze.e eVar2 = dVar2.f49145b;
                xe.d dVar5 = eVar2.f50446j;
                t3 t3Var2 = dVar5.f49144a;
                xe.b bVar2 = (xe.b) t3Var2.f17099b;
                ((xe.b) t3Var2.f17099b).f49120a.add(eVar2);
                bVar2.f49121b.add(eVar2);
                String str3 = dVar5.f49146c;
                HashMap hashMap2 = bVar2.f49122c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str3, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            ((xe.a) this.f17100c).invalidate();
        }
    }

    @Override
    public Object mo28get() {
        ya.b bVar = new ya.b(7);
        wa.a aVar = new wa.a(7);
        ?? obj = new Object();
        obj.f2300a = (Context) ((nc.a) this.f17098a).mo28get();
        obj.f2301b = (x2.d) ((nc.a) this.f17099b).mo28get();
        obj.f2302c = (d3.d) ((nc.a) this.f17100c).mo28get();
        obj.d = (a5.m) ((a5.m) this.d).mo28get();
        obj.f2303e = (Executor) ((nc.a) this.f17101e).mo28get();
        obj.f2304f = (e3.c) ((nc.a) this.f17102f).mo28get();
        obj.f2305g = bVar;
        obj.h = aVar;
        obj.f2306i = (d3.c) ((nc.a) this.h).mo28get();
        return obj;
    }

    public t3(qh.l0 l0Var, b6 b6Var) {
        this.f17098a = l0Var;
        this.f17099b = b6Var;
    }

    public t3(String str, j9.c cVar, com.google.firebase.messaging.t tVar) {
        this.d = new com.google.firebase.messaging.l(this, false);
        this.f17101e = new com.google.firebase.messaging.l(this, true);
        this.f17102f = new n2.w(5, (byte) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f17100c = str;
        this.f17098a = new f9.g(cVar);
        this.f17099b = tVar;
    }
}
