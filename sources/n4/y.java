package n4;

import ai.w1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.k0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.h1;
import ii.i1;
import ii.l0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.i5;
public final class y implements OnCompleteListener, ce.b, ea.a, g6.n, h1, c3.i, f6, ro0 {
    public Object f15217a;
    public Object f15218b;

    public y(Context context, int i10) {
        switch (i10) {
            case 26:
                n6.l.h(context);
                Resources resources = context.getResources();
                this.f15217a = resources;
                this.f15218b = resources.getResourcePackageName(2131689566);
                return;
            default:
                this.f15217a = context;
                return;
        }
    }

    public static void J(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String c0(y yVar) {
        Collection<String> collection = (Collection) yVar.f15218b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.f15217a;
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
                    if (!g6.a.f9428a.matcher(str2).matches()) {
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

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z10) {
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
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.A(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f15217a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.C(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f15218b).C(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void D(i1 i1Var, int i10, int i11) {
        r9 B;
        ii.k0 k0Var = (ii.k0) this.f15217a;
        if (!((l0) this.f15218b).d && i10 != i11 && (B = k0Var.B()) != null) {
            if (!B.y() || B.W != k0Var.I()) {
                i1Var.post(new ii.i0(this, i1Var, i11, B, k0Var, i10));
            }
        }
    }

    @Override
    public void E(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f15218b;
        if (((g6.n) this.f15217a) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f9441i)};
                g6.b bVar = mVar.f9460a;
                Log.w(bVar.f9430a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f46035b).f8019i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f15217a).E(str, j3, i11, obj, j10, j11);
        }
    }

    public void F(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public int F0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15217a;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return j6.w0(null, i10, false);
    }

    @Override
    public Paint G(String str) {
        return j6.S0(str);
    }

    public void H(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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

    public void I(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public void K(CharSequence charSequence) {
        ((ii.k0) this.f15217a).E(charSequence);
    }

    public com.google.android.datatransport.cct.CctBackendFactory L(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.L(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public c3.o M(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f15218b)) {
            if (!((AtomicBoolean) this.f15218b).get()) {
                try {
                    a2 = ((w1) this.f15217a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f15218b).set(true);
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
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public synchronized Map N() {
        try {
            if (((Map) this.f15218b) == null) {
                this.f15218b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f15217a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f15218b;
    }

    public String O(String str) {
        Resources resources = (Resources) this.f15217a;
        int identifier = resources.getIdentifier(str, "string", (String) this.f15218b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public android.support.v4.media.session.l P() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f15217a).f1852a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i10 >= 24) {
            return new android.support.v4.media.session.l(transportControls);
        }
        if (i10 >= 23) {
            return new android.support.v4.media.session.l(transportControls);
        }
        return new android.support.v4.media.session.l(transportControls);
    }

    public boolean Q(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.n r13) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.Q(java.lang.CharSequence, int, int, androidx.emoji2.text.n):boolean");
    }

    public void R(k.a aVar) {
        oi.f fVar = (oi.f) this.f15217a;
        ((ActionMode.Callback) fVar.f15748a).onDestroyActionMode(fVar.o(aVar));
        g.s sVar = (g.s) this.f15218b;
        if (sVar.E != null) {
            sVar.f9298f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.f9314y != null) {
            r0.l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = r0.i0.a(sVar.f9314y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.f9313x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    public boolean S(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f15218b).J;
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.y.c(viewGroup);
        oi.f fVar = (oi.f) this.f15217a;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f15748a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.b0((Context) fVar.f15749b, (l.l) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void T(Exception exc, boolean z10) {
        int i10;
        this.f15218b = null;
        HashSet hashSet = (HashSet) this.f15217a;
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

    @Override
    public void U(Editable editable) {
        ((l0) this.f15218b).i();
        ((ii.k0) this.f15217a).W();
    }

    public void V(n2.b bVar) {
        ((HashSet) this.f15217a).add(bVar);
        if (((n2.b) this.f15218b) != null) {
            return;
        }
        this.f15218b = bVar;
        n2.q m10 = bVar.f15089b.m();
        bVar.f15107x = m10;
        android.support.v4.media.session.f fVar = bVar.f15102r;
        String str = e2.d0.f7888a;
        m10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.t.f43784b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
    }

    public void W(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f15218b).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f15217a;
            hVar.f1852a.registerCallback(rVar.f2795a, handler);
            synchronized (hVar.f1853b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f2797c = gVar;
                    try {
                        hVar.e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    rVar.f2797c = null;
                    hVar.f1854c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void X(float f7, boolean z10) {
        ((TextView) this.f15217a).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.f15218b).f34355b.M();
    }

    @Override
    public boolean Y(boolean z10) {
        return false;
    }

    public void Z(p pVar, Handler handler) {
        r rVar = (r) this.f15217a;
        synchronized (rVar.d) {
            rVar.f15208m = pVar;
            rVar.f15199a.setCallback(pVar.f15195b, handler);
            pVar.C(rVar, handler);
        }
    }

    @Override
    public boolean a() {
        return j6.I.q();
    }

    public void a0(h0 h0Var) {
        r rVar = (r) this.f15217a;
        rVar.f15203g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f15202f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f15202f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            rVar.f15202f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f15199a;
        if (h0Var.f15175w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.f15168a, h0Var.f15169b, h0Var.d, h0Var.f15172n);
            builder.setBufferedPosition(h0Var.f15170c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.f15173r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.f15165a, g0Var.f15166b, g0Var.f15167c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.f15174s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.f15175w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.f15175w);
    }

    @Override
    public c3.h b(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f15218b;
        vVar.G(min);
        pVar.a(0, min, vVar.f7934a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f7935b, vVar.f7934a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f15217a).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f7935b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f7935b;
                    }
                }
                int i12 = vVar.f7936c;
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
                            if (h3.a.a(vVar.f7935b, vVar.f7934a) == 443) {
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
                                int a2 = h3.a.a(vVar.f7935b, vVar.f7934a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f7936c, vVar.f7935b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f7935b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    public void b0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f15218b).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f15217a).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void c(i1 i1Var) {
        ((ii.k0) this.f15217a).c(i1Var);
    }

    @Override
    public void d() {
        e2.v vVar = (e2.v) this.f15218b;
        byte[] bArr = e2.d0.f7889b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    public void e() {
        this.f15217a = null;
        this.f15218b = null;
    }

    @Override
    public boolean f() {
        return ((ii.k0) this.f15217a).N();
    }

    @Override
    public int f0(int i10) {
        return F0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((SparseIntArray) this.f15217a).get(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    public void h(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f15217a;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    public void i(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.i(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public void j(int i10, int i11) {
        ((ii.k0) this.f15217a).Q(i10, i11);
    }

    public void k(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f15217a;
        androidx.fragment.app.v vVar = k0Var.f2443w.f2531b;
        androidx.fragment.app.s sVar = k0Var.f2445y;
        if (sVar != null) {
            sVar.p().f2436o.k(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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

    public void l(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.l(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public int l0() {
        return 0;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override
    public void n(i1 i1Var) {
        ((ii.k0) this.f15217a).h();
    }

    @Override
    public boolean n0() {
        return false;
    }

    public void o(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.o(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
        a9.e eVar = (a9.e) this.f15217a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15218b;
        synchronized (eVar.f326f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override
    public boolean p(i1 i1Var) {
        return false;
    }

    public void q(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public void r(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f15217a;
        if (nVar != null) {
            nVar.r(str, j3, j10, j11);
        }
    }

    @Override
    public java.lang.Object s(ce.c r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.s(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public boolean t(i1 i1Var) {
        return false;
    }

    public void u(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.u(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
        k0 k0Var = (k0) this.f15217a;
        androidx.fragment.app.v vVar = k0Var.f2443w.f2531b;
        androidx.fragment.app.s sVar = k0Var.f2445y;
        if (sVar != null) {
            sVar.p().f2436o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.w(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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
    public ColorFilter x() {
        return j6.f19422v3;
    }

    public void z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15217a).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15218b).iterator();
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

    public y(Object obj) {
        this.f15218b = null;
        this.f15217a = obj;
    }

    public y(Object obj, Object obj2) {
        this.f15217a = obj;
        this.f15218b = obj2;
    }

    public y(Object obj, Object obj2, boolean z10) {
        this.f15217a = obj2;
        this.f15218b = obj;
    }

    public y(int i10) {
        switch (i10) {
            case 15:
                this.f15217a = new HashMap();
                return;
            case 25:
                this.f15217a = new HashSet();
                return;
            default:
                this.f15217a = new ConcurrentHashMap(16, 0.75f, 10);
                this.f15218b = new ReferenceQueue();
                return;
        }
    }

    public y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f15218b = new j6.f(iBinder);
            this.f15217a = null;
            return;
        }
        this.f15217a = new Messenger(iBinder);
        this.f15218b = null;
    }

    public y(Handler handler, k2.j jVar) {
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f15217a = handler;
        this.f15218b = jVar;
    }

    @Override
    public void B() {
    }

    @Override
    public void y() {
    }

    public y(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            this.f15218b = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f15217a = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f15217a = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public y(w1 w1Var) {
        this.f15217a = w1Var;
        this.f15218b = new AtomicBoolean(false);
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
