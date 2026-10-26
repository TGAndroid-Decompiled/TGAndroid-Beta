package n4;

import a3.k0;
import a3.m0;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import b2.b2;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e0.e0;
import f9.s1;
import j$.util.DesugarCollections;
import j4.b0;
import j4.d0;
import j4.f0;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p4.t0;
import r0.i0;
import r0.l0;
public final class s implements OnCompleteListener, com.google.android.gms.internal.clearcut.h, e9.k, h6.n, ff.b, j4.a0 {
    public final int f18695a;
    public Object f18696b;
    public Object f18697c;

    public s(int i10, Object obj, Object obj2) {
        this.f18695a = i10;
        this.f18696b = obj;
        this.f18697c = obj2;
    }

    public static String K(s sVar) {
        Collection<String> collection = (Collection) sVar.f18697c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) sVar.f18696b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb2.append("/");
                sb2.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                boolean z10 = true;
                for (String str2 : collection) {
                    h6.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!h6.a.f12619a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            char charAt = str2.charAt(i10);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void c(s sVar, boolean z10, boolean z11) {
        synchronized (sVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) sVar.f18697c) == null) {
                    if (((Context) sVar.f18696b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) sVar.f18696b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    sVar.f18697c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sVar.f18697c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static boolean f(Editable editable, KeyEvent keyEvent, boolean z10) {
        androidx.emoji2.text.v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (androidx.emoji2.text.v[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.v.class)) != null && vVarArr.length > 0) {
                for (androidx.emoji2.text.v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(k.a aVar) {
        ti.e eVar = (ti.e) this.f18696b;
        ((ActionMode.Callback) eVar.f49184b).onDestroyActionMode(eVar.h(aVar));
        g.r rVar = (g.r) this.f18697c;
        if (rVar.E != null) {
            rVar.f12175f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f12191y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(rVar.f12191y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f12190x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.f47108a;
        r0.y.c(viewGroup);
        rVar.x();
    }

    @Override
    public ff.a B(s sVar) {
        int i10;
        List list = (List) this.f18697c;
        List list2 = (List) sVar.f18696b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new hd.i(sVar, (List) this.f18696b, list);
    }

    public boolean C(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f18697c).J;
        WeakHashMap weakHashMap = i0.f47108a;
        r0.y.c(viewGroup);
        ti.e eVar = (ti.e) this.f18696b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f49184b;
        k.e h = eVar.h(aVar);
        a0.l lVar = (a0.l) eVar.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) eVar.f49185c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(h, menu2);
    }

    public void D(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f18697c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f18696b;
            hVar.f2065a.registerCallback(rVar.f3011a, handler);
            synchronized (hVar.f2066b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f3013c = gVar;
                    try {
                        hVar.e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    rVar.f3013c = null;
                    hVar.f2067c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void E(Object obj) {
        Handler handler = (Handler) this.f18696b;
        if (handler != null) {
            handler.post(new a3.i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void F(l lVar, Handler handler) {
        n nVar = (n) this.f18696b;
        synchronized (nVar.d) {
            nVar.f18687l = lVar;
            nVar.f18679a.setCallback(lVar.f18675b, handler);
            lVar.C(nVar, handler);
        }
    }

    public void G(z zVar) {
        n nVar = (n) this.f18696b;
        nVar.f18683g = zVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f18682f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f18682f.getBroadcastItem(beginBroadcast)).r(zVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f18682f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.f18679a;
        if (zVar.f18716w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(zVar.f18709a, zVar.f18710b, zVar.d, zVar.f18713n);
            builder.setBufferedPosition(zVar.f18711c);
            builder.setActions(zVar.e);
            builder.setErrorMessage(zVar.h);
            for (y yVar : zVar.f18714r) {
                yVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(yVar.f18706a, yVar.f18707b, yVar.f18708c);
                builder2.setExtras(yVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(zVar.f18715s);
            builder.setExtras(zVar.v);
            zVar.f18716w = builder.build();
        }
        mediaSession.setPlaybackState(zVar.f18716w);
    }

    public void H(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f18697c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f18696b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void I(ArrayList arrayList) {
        f2.t tVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.s) arrayList.get(i10)).f10114a == 1) {
                try {
                    tVar = new f2.t((f2.s) arrayList.get(i10));
                } catch (f2.r unused) {
                    tVar = null;
                }
                this.f18697c = tVar;
            }
        }
    }

    public void J(b2 b2Var) {
        Handler handler = (Handler) this.f18696b;
        if (handler != null) {
            handler.post(new a1.f(4, this, b2Var));
        }
    }

    @Override
    public void a(e2.x xVar) {
        d0 d0Var = (d0) this.f18697c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.f18696b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a2 = xVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                xVar.k(0, 4, gVar.f260b);
                gVar.m(0);
                int g7 = gVar.g(16);
                gVar.o(3);
                if (g7 == 0) {
                    gVar.o(13);
                } else {
                    int g10 = gVar.g(13);
                    if (sparseArray.get(g10) == null) {
                        sparseArray.put(g10, new b0(new e0(d0Var, g10)));
                        d0Var.f15282n++;
                    }
                }
            }
            if (d0Var.f15272a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((e9.k) ((b6.i) this.f18696b).f3670b).apply(obj);
    }

    public void d() {
        this.f18696b = null;
        this.f18697c = null;
    }

    public boolean e(int i10) {
        return ((b2.v) this.f18696b).f3510a.get(i10);
    }

    public void g(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f18696b;
        if (handler != null) {
            handler.post(new k0(this, eVar, 1));
        }
    }

    @Override
    public void h(String str, long j10, long j11, long j12) {
        h6.n nVar = (h6.n) this.f18696b;
        if (nVar != null) {
            nVar.h(str, j10, j11, j12);
        }
    }

    public void i(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.i(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void j(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f18696b;
        androidx.fragment.app.u uVar = i0Var.f2654w.f2743b;
        androidx.fragment.app.r rVar = i0Var.f2656y;
        if (rVar != null) {
            rVar.p().f2647o.j(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void k(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.k(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void l(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.l(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void m(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.m(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void n(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.n(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void o(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f18696b;
        androidx.fragment.app.u uVar = i0Var.f2654w.f2743b;
        androidx.fragment.app.r rVar = i0Var.f2656y;
        if (rVar != null) {
            rVar.p().f2647o.o(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        e6.b bVar;
        boolean z12;
        String str;
        switch (this.f18695a) {
            case 7:
                b9.d dVar = (b9.d) this.f18696b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f18697c;
                synchronized (dVar.f3688f) {
                    dVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.f18696b;
                e6.b bVar2 = (e6.b) this.f18697c;
                p4.x xVar = pVar.f6848c;
                h6.b bVar3 = com.google.android.gms.internal.cast.p.f6847j;
                if (task.isSuccessful()) {
                    Bundle bundle = (Bundle) task.getResult();
                    if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (true != z12) {
                        str = "not existed";
                    } else {
                        str = "existed";
                    }
                    bVar3.b("The module-to-client output switcher flag %s", str);
                    if (z12) {
                        z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        Log.i(bVar3.f12621a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f9800x)));
                        if (!z10 && bVar2.f9800x) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (xVar == null && (bVar = pVar.d) != null) {
                            boolean z13 = bVar.v;
                            boolean z14 = bVar.f9798s;
                            p4.y yVar = new p4.y();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                yVar.f46792b = z11;
                            }
                            if (i10 >= 30) {
                                yVar.d = z13;
                            }
                            if (i10 >= 30) {
                                yVar.f46793c = z14;
                            }
                            p4.x.i(new p4.z(yVar));
                            Log.i(bVar3.f12621a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f6850i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                            if (z13) {
                                com.google.android.gms.internal.cast.s sVar = pVar.f6849f;
                                o6.l.h(sVar);
                                com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                                p4.x.b();
                                p4.x.c().f46661f = oVar;
                                a2.a(a1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.f12621a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f9800x)));
                if (!z10) {
                }
                z11 = false;
                if (xVar == null) {
                    return;
                }
                return;
        }
    }

    public void p(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.p(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void q(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void r(androidx.fragment.app.r f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.r(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void s(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.s(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        h6.m mVar = (h6.m) this.f18697c;
        if (((h6.n) this.f18696b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f12632i)};
                h6.b bVar = mVar.f12651a;
                Log.w(bVar.f12621a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((f6.h) mVar.h.f47323b).f10219i.iterator();
                while (it.hasNext()) {
                    ((f6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((h6.n) this.f18696b).t(str, j10, i11, obj, j11, j12);
        }
    }

    public String toString() {
        switch (this.f18695a) {
            case 15:
                try {
                    if (((fc.b) this.f18697c) == null) {
                        this.f18697c = ((fc.e) this.f18696b).a();
                    }
                    return ((fc.b) this.f18697c).toString();
                } catch (ec.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.u(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void v(androidx.fragment.app.r f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.r rVar = ((androidx.fragment.app.i0) this.f18696b).f2656y;
        if (rVar != null) {
            rVar.p().f2647o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f18697c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public c3.o w(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f18697c)) {
            if (!((AtomicBoolean) this.f18697c).get()) {
                try {
                    a2 = ((c2.i) this.f18696b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f18697c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (c3.o) a2.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public synchronized Map x() {
        try {
            if (((Map) this.f18697c) == null) {
                this.f18697c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f18696b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f18697c;
    }

    public android.support.v4.media.session.m y() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f18696b).f2065a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i10 >= 24) {
            return new android.support.v4.media.session.l(transportControls);
        }
        return new android.support.v4.media.session.l(transportControls);
    }

    public boolean z(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        int i12;
        if (oVar.f2566c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f18697c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.f46483a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2542b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f2543a;
            String sb3 = sb2.toString();
            int i13 = i0.c.f13453a;
            if (textPaint.hasGlyph(sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            oVar.f2566c = i12;
        }
        if (oVar.f2566c != 2) {
            return false;
        }
        return true;
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f18696b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f18697c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f7031b);
    }

    public s(int i10, boolean z10) {
        this.f18695a = i10;
    }

    public s(Object obj, int i10) {
        this.f18695a = i10;
        this.f18696b = obj;
    }

    public s(Object obj, Object obj2, boolean z10, int i10) {
        this.f18695a = i10;
        this.f18696b = obj2;
        this.f18697c = obj;
    }

    public s(IBinder iBinder) {
        this.f18695a = 27;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f18697c = new k6.g(iBinder);
            this.f18696b = null;
            return;
        }
        this.f18696b = new Messenger(iBinder);
        this.f18697c = null;
    }

    public s(n6.a aVar) {
        this.f18695a = 20;
        this.f18696b = aVar == null ? null : aVar.f18726b;
    }

    public s(androidx.fragment.app.i0 i0Var) {
        this.f18695a = 6;
        this.f18696b = i0Var;
        this.f18697c = new CopyOnWriteArrayList();
    }

    public s(int i10) {
        this.f18695a = i10;
        switch (i10) {
            case 19:
                this.f18696b = new HashMap();
                return;
            default:
                this.f18696b = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    public s(b2.v vVar, SparseArray sparseArray) {
        this.f18695a = 25;
        this.f18696b = vVar;
        SparseBooleanArray sparseBooleanArray = vVar.f3510a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = vVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f18697c = sparseArray2;
    }

    public s(com.google.firebase.messaging.q qVar, pa.d dVar, androidx.emoji2.text.d dVar2) {
        this.f18695a = 5;
        this.f18696b = qVar;
        this.f18697c = dVar2;
    }

    public s(String str) {
        this.f18695a = 28;
        this.f18697c = null;
        this.f18696b = str;
    }

    public s(Handler handler, m0 m0Var) {
        this.f18695a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f18696b = handler;
        this.f18697c = m0Var;
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.f18695a = 21;
        int size = arrayList.size();
        this.f18696b = new int[size];
        this.f18697c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f18696b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f18697c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public s(int i10, int i11) {
        this.f18695a = 21;
        this.f18696b = new int[]{i10, i11};
        this.f18697c = new float[]{0.0f, 1.0f};
    }

    public s(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f18695a = 4;
        if (mediaSessionCompat$Token != null) {
            this.f18697c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f18696b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f18696b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public s(int i10, int i11, int i12) {
        this.f18695a = 21;
        this.f18696b = new int[]{i10, i11, i12};
        this.f18697c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f18695a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f46765b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        e2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    e2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.f18696b = new n(context, str, bundle);
            } else if (i11 >= 28) {
                this.f18696b = new n(context, str, bundle);
            } else {
                this.f18696b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            F(new l(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.f18696b).f18679a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.f18696b).f18681c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f18704a = new f(context, rVar);
            } else {
                obj.f18704a = new f(context, rVar);
            }
            this.f18697c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    @Override
    public void b(e2.k0 k0Var, c3.q qVar, f0 f0Var) {
    }

    public s(s1 s1Var, int[] iArr) {
        this.f18695a = 16;
        this.f18696b = f9.i0.u(s1Var);
        this.f18697c = iArr;
    }

    public s(d0 d0Var) {
        this.f18695a = 26;
        this.f18697c = d0Var;
        this.f18696b = new a4.g(new byte[4], 4);
    }

    public s(c2.i iVar) {
        this.f18695a = 9;
        this.f18696b = iVar;
        this.f18697c = new AtomicBoolean(false);
    }
}
