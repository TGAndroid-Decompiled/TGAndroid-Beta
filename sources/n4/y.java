package n4;

import ai.w1;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.fragment.app.k0;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import ii.h1;
import ii.i0;
import ii.i1;
import ii.l0;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.Arrays;
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
import m.f3;
import m.y0;
import org.telegram.ui.Cells.o9;
import p4.v0;
public class y implements OnCompleteListener, com.google.android.gms.internal.clearcut.g, ea.a, f6.a, g6.n, h1, c3.i, n5.b {
    public final int f16362a;
    public Object f16363b;
    public Object f16364c;

    public y(int i10, Object obj, Object obj2) {
        this.f16362a = i10;
        this.f16363b = obj;
        this.f16364c = obj2;
    }

    public static void G(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String Y(y yVar) {
        Collection<String> collection = (Collection) yVar.f16364c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.f16363b;
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
                    g6.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!g6.a.f10319a.matcher(str2).matches()) {
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

    public static String d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static boolean h(Editable editable, KeyEvent keyEvent, boolean z10) {
        androidx.emoji2.text.u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (androidx.emoji2.text.u[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.u.class)) != null && uVarArr.length > 0) {
                for (androidx.emoji2.text.u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.A(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public void B(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f16364c;
        if (((g6.n) this.f16363b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f10334i)};
                g6.b bVar = mVar.f10354a;
                Log.w(bVar.f10321a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f326b).f8674i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f16363b).B(str, j3, i11, obj, j10, j11);
        }
    }

    public void C(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.C(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public void D(i1 i1Var, int i10, int i11) {
        o9 E;
        ii.k0 k0Var = (ii.k0) this.f16363b;
        if (!((l0) this.f16364c).d && i10 != i11 && (E = k0Var.E()) != null) {
            if (!E.x() || E.W != k0Var.L()) {
                i1Var.post(new i0(this, i1Var, i11, E, k0Var, i10));
            }
        }
    }

    public void E(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.E(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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

    public void F(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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

    public fb.o H(kb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.H(kb.a):fb.o");
    }

    public c3.o I(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f16364c)) {
            if (!((AtomicBoolean) this.f16364c).get()) {
                try {
                    a2 = ((w1) this.f16363b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f16364c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
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

    public synchronized Map J() {
        try {
            if (((Map) this.f16364c) == null) {
                this.f16364c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f16363b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f16364c;
    }

    public String K(String str) {
        Resources resources = (Resources) this.f16363b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f16364c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public android.support.v4.media.session.m L() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f16363b).f2084a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i10 >= 24) {
            return new android.support.v4.media.session.l(transportControls);
        }
        return new android.support.v4.media.session.l(transportControls);
    }

    @Override
    public void M(CharSequence charSequence) {
        ((ii.k0) this.f16363b).I(charSequence);
    }

    public boolean N(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.n nVar) {
        int i12;
        if (nVar.f2613c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f16364c;
            p1.a b10 = nVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.f45047a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2589b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f2590a;
            String sb3 = sb2.toString();
            int i13 = i0.c.f11577a;
            if (textPaint.hasGlyph(sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            nVar.f2613c = i12;
        }
        if (nVar.f2613c != 2) {
            return false;
        }
        return true;
    }

    public void O(k.a aVar) {
        oi.f fVar = (oi.f) this.f16363b;
        ((ActionMode.Callback) fVar.f16927a).onDestroyActionMode(fVar.o(aVar));
        g.r rVar = (g.r) this.f16364c;
        if (rVar.E != null) {
            rVar.f10171f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f10187y != null) {
            r0.l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = r0.i0.a(rVar.f10187y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f10186x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.y.c(viewGroup);
        rVar.x();
    }

    public boolean P(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f16364c).J;
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.y.c(viewGroup);
        oi.f fVar = (oi.f) this.f16363b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f16927a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.f16928b, (l.k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void Q(Exception exc, boolean z10) {
        int i10;
        this.f16364c = null;
        HashSet hashSet = (HashSet) this.f16363b;
        e9.i0 v = e9.i0.v(hashSet);
        hashSet.clear();
        e9.g0 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public void R(n2.b bVar) {
        ((HashSet) this.f16363b).add(bVar);
        if (((n2.b) this.f16364c) != null) {
            return;
        }
        this.f16364c = bVar;
        n2.p l4 = bVar.f16227b.l();
        bVar.f16246x = l4;
        android.support.v4.media.session.f fVar = bVar.f16241r;
        String str = e2.d0.f8529a;
        l4.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.t.f48923b.getAndIncrement(), true, SystemClock.elapsedRealtime(), l4)).sendToTarget();
    }

    @Override
    public void S(Editable editable) {
        ((l0) this.f16364c).i();
        ((ii.k0) this.f16363b).V();
    }

    public void T(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f16364c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f16363b;
            hVar.f2084a.registerCallback(rVar.f3092a, handler);
            synchronized (hVar.f2085b) {
                if (hVar.f2087e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f3094c = gVar;
                    try {
                        hVar.f2087e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                    }
                } else {
                    rVar.f3094c = null;
                    hVar.f2086c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public boolean U(boolean z10) {
        return false;
    }

    public void V(q qVar, Handler handler) {
        s sVar = (s) this.f16363b;
        synchronized (sVar.d) {
            sVar.f16353l = qVar;
            sVar.f16344a.setCallback(qVar.f16339b, handler);
            qVar.C(sVar, handler);
        }
    }

    public void W(g0 g0Var) {
        s sVar = (s) this.f16363b;
        sVar.f16349g = g0Var;
        synchronized (sVar.d) {
            for (int beginBroadcast = sVar.f16348f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) sVar.f16348f.getBroadcastItem(beginBroadcast)).t(g0Var);
                } catch (RemoteException | SecurityException e7) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e7);
                }
            }
            sVar.f16348f.finishBroadcast();
        }
        MediaSession mediaSession = sVar.f16344a;
        if (g0Var.f16316w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(g0Var.f16308a, g0Var.f16309b, g0Var.d, g0Var.f16313n);
            builder.setBufferedPosition(g0Var.f16310c);
            builder.setActions(g0Var.f16311e);
            builder.setErrorMessage(g0Var.h);
            for (f0 f0Var : g0Var.f16314r) {
                f0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(f0Var.f16304a, f0Var.f16305b, f0Var.f16306c);
                builder2.setExtras(f0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(g0Var.f16315s);
            builder.setExtras(g0Var.v);
            g0Var.f16316w = builder.build();
        }
        mediaSession.setPlaybackState(g0Var.f16316w);
    }

    public void X(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f16364c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f16363b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public c3.h a(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f16364c;
        vVar.G(min);
        pVar.b(0, min, vVar.f8581a);
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f8582b, vVar.f8581a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f16363b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f8582b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f8582b;
                    }
                }
                int i12 = vVar.f8583c;
                if (vVar.a() < 10) {
                    vVar.J(i12);
                } else {
                    vVar.K(9);
                    int x10 = vVar.x() & 7;
                    if (vVar.a() < x10) {
                        vVar.J(i12);
                    } else {
                        vVar.K(x10);
                        if (vVar.a() < 4) {
                            vVar.J(i12);
                        } else {
                            if (h3.a.a(vVar.f8582b, vVar.f8581a) == 443) {
                                vVar.K(4);
                                int D = vVar.D();
                                if (vVar.a() < D) {
                                    vVar.J(i12);
                                } else {
                                    vVar.K(D);
                                }
                            }
                            while (true) {
                                if (vVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(vVar.f8582b, vVar.f8581a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f8583c, vVar.f8582b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f8582b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public void b() {
        e2.v vVar = (e2.v) this.f16364c;
        byte[] bArr = e2.d0.f8530b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override
    public void c(i1 i1Var) {
        ((ii.k0) this.f16363b).c(i1Var);
    }

    @Override
    public boolean e() {
        return ((ii.k0) this.f16363b).P();
    }

    public void f() {
        this.f16363b = null;
        this.f16364c = null;
    }

    public i9.w g(byte[] bArr) {
        byte[] bArr2;
        f3 f3Var = (f3) this.f16364c;
        if (f3Var != null && (bArr2 = (byte[]) f3Var.f15424b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((f3) this.f16364c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.f16363b;
        i9.w a2 = ((i9.y) iVar.f10249a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f16364c = new f3(bArr, a2);
        return a2;
    }

    @Override
    public Object mo27get() {
        return new m5.d((Context) ((l2.g) this.f16363b).f15081b, (f3) ((y0) this.f16364c).mo27get());
    }

    public void i(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f16363b;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    @Override
    public void j(int i10, int i11) {
        ((ii.k0) this.f16363b).R(i10, i11);
    }

    public void k(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.k(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public void l(i1 i1Var) {
        ((ii.k0) this.f16363b).g();
    }

    @Override
    public void m(Bitmap bitmap) {
        pf.b bVar = (pf.b) this.f16363b;
        bVar.f45449c = bitmap;
        f6.g gVar = (f6.g) this.f16364c;
        gVar.f9768l = bVar;
        gVar.b();
    }

    public void n(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f16363b;
        androidx.fragment.app.v vVar = k0Var.f2714w.f2810b;
        androidx.fragment.app.s sVar = k0Var.f2716y;
        if (sVar != null) {
            sVar.p().f2707o.n(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public boolean o(i1 i1Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        switch (this.f16362a) {
            case 2:
                a9.e eVar = (a9.e) this.f16363b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16364c;
                synchronized (eVar.f350f) {
                    eVar.f349e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f16363b;
                d6.b bVar2 = (d6.b) this.f16364c;
                p4.y yVar = rVar.f6972c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.f6971j;
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
                        Log.i(bVar3.f10321a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f8172x)));
                        if (!z10 && bVar2.f8172x) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (yVar == null && (bVar = rVar.d) != null) {
                            boolean z13 = bVar.v;
                            boolean z14 = bVar.f8170s;
                            p4.z zVar = new p4.z();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                zVar.f45365b = z11;
                            }
                            if (i10 >= 30) {
                                zVar.d = z13;
                            }
                            if (i10 >= 30) {
                                zVar.f45366c = z14;
                            }
                            p4.y.i(new p4.a0(zVar));
                            Log.i(bVar3.f10321a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f6975i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                            if (z13) {
                                com.google.android.gms.internal.cast.u uVar = rVar.f6974f;
                                n6.m.h(uVar);
                                com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                                p4.y.b();
                                p4.y.c().f45223f = qVar;
                                d2.a(d1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.f10321a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f8172x)));
                if (!z10) {
                }
                z11 = false;
                if (yVar == null) {
                    return;
                }
                return;
        }
    }

    public void p(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.p(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f16363b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.q(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f16364c).q(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void r(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f16363b;
        if (nVar != null) {
            nVar.r(str, j3, j10, j11);
        }
    }

    public void s(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.s(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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

    public void t(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.t(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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

    public String toString() {
        switch (this.f16362a) {
            case 15:
                return ((HashMap) this.f16363b).toString();
            default:
                return super.toString();
        }
    }

    public void u(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.u(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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

    public void v(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f16363b;
        androidx.fragment.app.v vVar = k0Var.f2714w.f2810b;
        androidx.fragment.app.s sVar = k0Var.f2716y;
        if (sVar != null) {
            sVar.p().f2707o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public boolean w(i1 i1Var) {
        return false;
    }

    public void x(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.x(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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

    public void z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16363b).f2716y;
        if (sVar != null) {
            sVar.p().f2707o.z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16364c).iterator();
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
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f16363b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f16364c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new c5.i("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f7121e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f7121e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f7121e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f7147b);
    }

    public y(int i10, boolean z10) {
        this.f16362a = i10;
    }

    public y(Object obj, Object obj2, boolean z10, int i10) {
        this.f16362a = i10;
        this.f16363b = obj2;
        this.f16364c = obj;
    }

    public y(Context context) {
        this.f16362a = 29;
        n6.m.h(context);
        Resources resources = context.getResources();
        this.f16363b = resources;
        this.f16364c = resources.getResourcePackageName(2131689566);
    }

    public y(IBinder iBinder) {
        this.f16362a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f16364c = new j6.f(iBinder);
            this.f16363b = null;
            return;
        }
        this.f16363b = new Messenger(iBinder);
        this.f16364c = null;
    }

    public y(k0 k0Var) {
        this.f16362a = 5;
        this.f16363b = k0Var;
        this.f16364c = new CopyOnWriteArrayList();
    }

    public y(ea.a[] aVarArr) {
        this.f16362a = 12;
        this.f16363b = aVarArr;
        this.f16364c = new rb.a(7, false);
    }

    public y(g2.i iVar) {
        this.f16362a = 26;
        this.f16363b = iVar;
    }

    public y(e2.b0 b0Var) {
        this.f16362a = 22;
        this.f16363b = b0Var;
        this.f16364c = new e2.v();
    }

    @Override
    public void y() {
    }

    public y(int i10) {
        this.f16362a = i10;
        switch (i10) {
            case 28:
                this.f16363b = new HashSet();
                return;
            default:
                this.f16363b = new HashMap();
                return;
        }
    }

    public y(com.google.firebase.messaging.s sVar, na.d dVar, androidx.emoji2.text.d dVar2) {
        this.f16362a = 4;
        this.f16363b = sVar;
        this.f16364c = dVar2;
    }

    public y(String str) {
        this.f16362a = 20;
        this.f16364c = null;
        this.f16363b = str;
    }

    public y(Handler handler, k2.j jVar) {
        this.f16362a = 24;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f16363b = handler;
        this.f16364c = jVar;
    }

    public y(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f16362a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f16364c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f16363b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f16363b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public y(a3.f fVar) {
        this.f16362a = 1;
        this.f16364c = fVar;
    }

    public y(a1 a1Var, int[] iArr) {
        this.f16362a = 13;
        this.f16363b = e9.i0.v(a1Var);
        this.f16364c = iArr;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f16362a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = v0.f45340b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.f16363b = new s(context, str, bundle);
            } else if (i11 >= 28) {
                this.f16363b = new s(context, str, bundle);
            } else {
                this.f16363b = new s(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            V(new q(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((s) this.f16363b).f16344a.setMediaButtonReceiver(pendingIntent);
            this.f16364c = new l(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public y(w1 w1Var) {
        this.f16362a = 6;
        this.f16363b = w1Var;
        this.f16364c = new AtomicBoolean(false);
    }
}
