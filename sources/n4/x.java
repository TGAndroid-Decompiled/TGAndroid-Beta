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
import org.telegram.ui.Cells.o9;
import p4.t0;
import r0.i0;
public class x implements OnCompleteListener, com.google.android.gms.internal.clearcut.g, ea.a, f6.a, g6.n, h1, c3.i, n5.b {
    public final int f16693a;
    public Object f16694b;
    public Object f16695c;

    public x(int i10, Object obj, Object obj2) {
        this.f16693a = i10;
        this.f16694b = obj;
        this.f16695c = obj2;
    }

    public static void H(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = x.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String Y(x xVar) {
        Collection<String> collection = (Collection) xVar.f16695c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) xVar.f16694b;
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
                    if (!g6.a.f10320a.matcher(str2).matches()) {
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

    public static boolean j(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    public void A(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.A(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public void B(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.B(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public void C(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.C(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public void D(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.D(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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
    public void E(CharSequence charSequence) {
        ((ii.k0) this.f16694b).A(charSequence);
    }

    public void F(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public void G(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public fb.n I(kb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: n4.x.I(kb.a):fb.n");
    }

    public c3.o J(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f16695c)) {
            if (!((AtomicBoolean) this.f16695c).get()) {
                try {
                    a2 = ((w1) this.f16694b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f16695c).set(true);
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

    public synchronized Map K() {
        try {
            if (((Map) this.f16695c) == null) {
                this.f16695c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f16694b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f16695c;
    }

    @Override
    public void L(Editable editable) {
        ((l0) this.f16695c).i();
        ((ii.k0) this.f16694b).M();
    }

    public String M(String str) {
        Resources resources = (Resources) this.f16694b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f16695c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public boolean N(boolean z10) {
        return false;
    }

    public android.support.v4.media.session.m O() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f16694b).f2086a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i10 >= 24) {
            return new android.support.v4.media.session.l(transportControls);
        }
        return new android.support.v4.media.session.l(transportControls);
    }

    public boolean P(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.n nVar) {
        int i12;
        if (nVar.f2615c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f16695c;
            p1.a b10 = nVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.f45227a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2591b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f2592a;
            String sb3 = sb2.toString();
            int i13 = i0.c.f11578a;
            if (textPaint.hasGlyph(sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            nVar.f2615c = i12;
        }
        if (nVar.f2615c != 2) {
            return false;
        }
        return true;
    }

    public void Q(k.a aVar) {
        pi.f fVar = (pi.f) this.f16694b;
        ((ActionMode.Callback) fVar.f45972a).onDestroyActionMode(fVar.o(aVar));
        g.r rVar = (g.r) this.f16695c;
        if (rVar.E != null) {
            rVar.f10172f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.f10188y != null) {
            r0.l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = i0.a(rVar.f10188y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.f10187x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.f46890a;
        r0.y.c(viewGroup);
        rVar.x();
    }

    public boolean R(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.f16695c).J;
        WeakHashMap weakHashMap = i0.f46890a;
        r0.y.c(viewGroup);
        pi.f fVar = (pi.f) this.f16694b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f45972a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.f45973b, (l.k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void S(Exception exc, boolean z10) {
        int i10;
        this.f16695c = null;
        HashSet hashSet = (HashSet) this.f16694b;
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

    public void T(n2.b bVar) {
        ((HashSet) this.f16694b).add(bVar);
        if (((n2.b) this.f16695c) != null) {
            return;
        }
        this.f16695c = bVar;
        n2.p h = bVar.f16560b.h();
        bVar.f16579x = h;
        android.support.v4.media.session.f fVar = bVar.f16574r;
        String str = e2.d0.f8531a;
        h.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.t.f48808b.getAndIncrement(), true, SystemClock.elapsedRealtime(), h)).sendToTarget();
    }

    public void U(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f16695c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f16694b;
            hVar.f2086a.registerCallback(rVar.f3094a, handler);
            synchronized (hVar.f2087b) {
                if (hVar.f2089e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f3096c = gVar;
                    try {
                        hVar.f2089e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                    }
                } else {
                    rVar.f3096c = null;
                    hVar.f2088c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void V(p pVar, Handler handler) {
        r rVar = (r) this.f16694b;
        synchronized (rVar.d) {
            rVar.f16684l = pVar;
            rVar.f16675a.setCallback(pVar.f16670b, handler);
            pVar.C(rVar, handler);
        }
    }

    public void W(f0 f0Var) {
        r rVar = (r) this.f16694b;
        rVar.f16680g = f0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f16679f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f16679f.getBroadcastItem(beginBroadcast)).t(f0Var);
                } catch (RemoteException | SecurityException e7) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e7);
                }
            }
            rVar.f16679f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f16675a;
        if (f0Var.f16647w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(f0Var.f16639a, f0Var.f16640b, f0Var.d, f0Var.f16644n);
            builder.setBufferedPosition(f0Var.f16641c);
            builder.setActions(f0Var.f16642e);
            builder.setErrorMessage(f0Var.h);
            for (e0 e0Var : f0Var.f16645r) {
                e0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(e0Var.f16636a, e0Var.f16637b, e0Var.f16638c);
                builder2.setExtras(e0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(f0Var.f16646s);
            builder.setExtras(f0Var.v);
            f0Var.f16647w = builder.build();
        }
        mediaSession.setPlaybackState(f0Var.f16647w);
    }

    public void X(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f16695c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f16694b).b(rVar);
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
        e2.v vVar = (e2.v) this.f16695c;
        vVar.G(min);
        pVar.a(0, min, vVar.f8583a);
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f8584b, vVar.f8583a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f16694b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f8584b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f8584b;
                    }
                }
                int i12 = vVar.f8585c;
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
                            if (h3.a.a(vVar.f8584b, vVar.f8583a) == 443) {
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
                                int a2 = h3.a.a(vVar.f8584b, vVar.f8583a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f8585c, vVar.f8584b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f8584b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public void b() {
        e2.v vVar = (e2.v) this.f16695c;
        byte[] bArr = e2.d0.f8532b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override
    public void c(i1 i1Var) {
        ((ii.k0) this.f16694b).c(i1Var);
    }

    public void e() {
        this.f16694b = null;
        this.f16695c = null;
    }

    @Override
    public boolean f() {
        return ((ii.k0) this.f16694b).H();
    }

    public i9.w g(byte[] bArr) {
        byte[] bArr2;
        la.h hVar = (la.h) this.f16695c;
        if (hVar != null && (bArr2 = (byte[]) hVar.f15501b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((la.h) this.f16695c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.f16694b;
        i9.w a2 = ((i9.y) iVar.f10250a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f16695c = new la.h(bArr, a2);
        return a2;
    }

    @Override
    public Object mo27get() {
        return new m5.d((Context) ((k2.g0) this.f16694b).f14469b, (la.h) ((l2.f) this.f16695c).mo27get());
    }

    @Override
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f16694b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.h(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f16695c).h(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void i(int i10, int i11) {
        ((ii.k0) this.f16694b).I(i10, i11);
    }

    @Override
    public void k(i1 i1Var) {
        ((ii.k0) this.f16694b).g();
    }

    @Override
    public void l(Bitmap bitmap) {
        pf.b bVar = (pf.b) this.f16694b;
        bVar.f45627c = bitmap;
        f6.g gVar = (f6.g) this.f16695c;
        gVar.f9770l = bVar;
        gVar.b();
    }

    @Override
    public boolean m(i1 i1Var) {
        return false;
    }

    public void n(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f16694b;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    public void o(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.o(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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
        d6.b bVar;
        boolean z12;
        String str;
        switch (this.f16693a) {
            case 2:
                a9.e eVar = (a9.e) this.f16694b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16695c;
                synchronized (eVar.f348f) {
                    eVar.f347e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f16694b;
                d6.b bVar2 = (d6.b) this.f16695c;
                p4.x xVar = rVar.f6973c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.f6972j;
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
                        Log.i(bVar3.f10322a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f8174x)));
                        if (!z10 && bVar2.f8174x) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (xVar == null && (bVar = rVar.d) != null) {
                            boolean z13 = bVar.v;
                            boolean z14 = bVar.f8172s;
                            p4.y yVar = new p4.y();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                yVar.f45538b = z11;
                            }
                            if (i10 >= 30) {
                                yVar.d = z13;
                            }
                            if (i10 >= 30) {
                                yVar.f45539c = z14;
                            }
                            p4.x.i(new p4.z(yVar));
                            Log.i(bVar3.f10322a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f6976i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                            if (z13) {
                                com.google.android.gms.internal.cast.u uVar = rVar.f6975f;
                                n6.m.h(uVar);
                                com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                                p4.x.b();
                                p4.x.c().f45399f = qVar;
                                d2.a(d1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.f10322a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f8174x)));
                if (!z10) {
                }
                z11 = false;
                if (xVar == null) {
                    return;
                }
                return;
        }
    }

    public void p(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f16694b;
        androidx.fragment.app.v vVar = k0Var.f2716w.f2812b;
        androidx.fragment.app.s sVar = k0Var.f2718y;
        if (sVar != null) {
            sVar.p().f2709o.p(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public void q(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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
    public boolean r(i1 i1Var) {
        return false;
    }

    @Override
    public void s(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f16694b;
        if (nVar != null) {
            nVar.s(str, j3, j10, j11);
        }
    }

    public void t(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.t(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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
        switch (this.f16693a) {
            case 15:
                return ((HashMap) this.f16694b).toString();
            default:
                return super.toString();
        }
    }

    public void v(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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

    public void w(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f16694b).f2718y;
        if (sVar != null) {
            sVar.p().f2709o.w(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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
    public void x(i1 i1Var, int i10, int i11) {
        o9 y3;
        ii.k0 k0Var = (ii.k0) this.f16694b;
        if (!((l0) this.f16695c).d && i10 != i11 && (y3 = k0Var.y()) != null) {
            if (!y3.x() || y3.W != k0Var.C()) {
                i1Var.post(new ii.i0(this, i1Var, i11, y3, k0Var, i10));
            }
        }
    }

    public void y(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f16694b;
        androidx.fragment.app.v vVar = k0Var.f2716w.f2812b;
        androidx.fragment.app.s sVar = k0Var.f2718y;
        if (sVar != null) {
            sVar.p().f2709o.y(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16695c).iterator();
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
    public void z(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f16695c;
        if (((g6.n) this.f16694b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f10335i)};
                g6.b bVar = mVar.f10355a;
                Log.w(bVar.f10322a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f326b).f8676i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f16694b).z(str, j3, i11, obj, j10, j11);
        }
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f16694b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f16695c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new c5.i("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f7122e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f7122e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f7122e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f7148b);
    }

    public x(int i10, boolean z10) {
        this.f16693a = i10;
    }

    public x(Object obj, Object obj2, boolean z10, int i10) {
        this.f16693a = i10;
        this.f16694b = obj2;
        this.f16695c = obj;
    }

    public x(Context context) {
        this.f16693a = 29;
        n6.m.h(context);
        Resources resources = context.getResources();
        this.f16694b = resources;
        this.f16695c = resources.getResourcePackageName(2131689566);
    }

    public x(IBinder iBinder) {
        this.f16693a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f16695c = new j6.f(iBinder);
            this.f16694b = null;
            return;
        }
        this.f16694b = new Messenger(iBinder);
        this.f16695c = null;
    }

    public x(k0 k0Var) {
        this.f16693a = 5;
        this.f16694b = k0Var;
        this.f16695c = new CopyOnWriteArrayList();
    }

    public x(ea.a[] aVarArr) {
        this.f16693a = 12;
        this.f16694b = aVarArr;
        this.f16695c = new rb.a(7);
    }

    public x(g2.i iVar) {
        this.f16693a = 26;
        this.f16694b = iVar;
    }

    public x(e2.b0 b0Var) {
        this.f16693a = 22;
        this.f16694b = b0Var;
        this.f16695c = new e2.v();
    }

    @Override
    public void u() {
    }

    public x(int i10) {
        this.f16693a = i10;
        switch (i10) {
            case 28:
                this.f16694b = new HashSet();
                return;
            default:
                this.f16694b = new HashMap();
                return;
        }
    }

    public x(com.google.firebase.messaging.s sVar, na.d dVar, androidx.emoji2.text.d dVar2) {
        this.f16693a = 4;
        this.f16694b = sVar;
        this.f16695c = dVar2;
    }

    public x(String str) {
        this.f16693a = 20;
        this.f16695c = null;
        this.f16694b = str;
    }

    public x(Handler handler, k2.j jVar) {
        this.f16693a = 24;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f16694b = handler;
        this.f16695c = jVar;
    }

    public x(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f16693a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f16695c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f16694b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f16694b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public x(a3.f fVar) {
        this.f16693a = 1;
        this.f16695c = fVar;
    }

    public x(a1 a1Var, int[] iArr) {
        this.f16693a = 13;
        this.f16694b = e9.i0.v(a1Var);
        this.f16695c = iArr;
    }

    public x(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f16693a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f45509b;
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
                this.f16694b = new r(context, str, bundle);
            } else if (i11 >= 28) {
                this.f16694b = new r(context, str, bundle);
            } else {
                this.f16694b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            V(new p(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.f16694b).f16675a.setMediaButtonReceiver(pendingIntent);
            this.f16695c = new m2.t(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public x(w1 w1Var) {
        this.f16693a = 6;
        this.f16694b = w1Var;
        this.f16695c = new AtomicBoolean(false);
    }
}
