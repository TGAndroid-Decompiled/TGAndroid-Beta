package n4;

import ai.w1;
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
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.h1;
import ii.i1;
import ii.k0;
import ii.l0;
import ii.n4;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import org.telegram.ui.Cells.q9;
import p4.t0;
public final class y implements OnCompleteListener, ce.b, ea.a, g6.n, h1, c3.i, le.f, n5.b {
    public final int f16648a;
    public Object f16649b;
    public Object f16650c;

    public y(int i10, Object obj, Object obj2) {
        this.f16648a = i10;
        this.f16649b = obj;
        this.f16650c = obj2;
    }

    public static void Q(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String c0(y yVar) {
        Collection<String> collection = (Collection) yVar.f16650c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.f16649b;
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
                    if (!g6.a.f10248a.matcher(str2).matches()) {
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

    public static boolean u(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    @Override
    public void A(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f16650c;
        if (((g6.n) this.f16649b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f10263i)};
                g6.b bVar = mVar.f10283a;
                Log.w(bVar.f10250a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f326b).f8683i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f16649b).A(str, j3, i11, obj, j10, j11);
        }
    }

    @Override
    public void B(Editable editable) {
        ((l0) this.f16650c).i();
        ((k0) this.f16649b).g0();
    }

    @Override
    public boolean C(boolean z10) {
        return false;
    }

    public void D(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f16649b;
        androidx.fragment.app.v vVar = k0Var.f2637w.f2733b;
        androidx.fragment.app.s sVar = k0Var.f2639y;
        if (sVar != null) {
            sVar.p().f2630o.D(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void E(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.E(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void H(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f16649b;
        androidx.fragment.app.v vVar = k0Var.f2637w.f2733b;
        androidx.fragment.app.s sVar = k0Var.f2639y;
        if (sVar != null) {
            sVar.p().f2630o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void J(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.J(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void K(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.K(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void L(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.L(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void M(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.M(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void N(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.N(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public void O(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.O(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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

    public byte[] P(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f16650c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f16649b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f16572a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f16573b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f16574c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f16575e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public c3.o R(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f16650c)) {
            if (!((AtomicBoolean) this.f16650c).get()) {
                try {
                    a2 = ((w1) this.f16649b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f16650c).set(true);
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

    public synchronized Map S() {
        try {
            if (((Map) this.f16650c) == null) {
                this.f16650c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f16649b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f16650c;
    }

    public android.support.v4.media.session.l T() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f16649b).f2009a.getTransportControls();
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

    public boolean U(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.n r13) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.U(java.lang.CharSequence, int, int, androidx.emoji2.text.n):boolean");
    }

    public void V(k.a aVar) {
        qi.f fVar = (qi.f) this.f16649b;
        ((ActionMode.Callback) fVar.f45541a).onDestroyActionMode(fVar.o(aVar));
        g.s sVar = (g.s) this.f16650c;
        if (sVar.E != null) {
            sVar.f10103f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.f10119y != null) {
            r0.l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = r0.i0.a(sVar.f10119y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.f10118x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.y.c(viewGroup);
        sVar.x();
    }

    public boolean W(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f16650c).J;
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.y.c(viewGroup);
        qi.f fVar = (qi.f) this.f16649b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f45541a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.f45542b, (l.k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void X(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f16650c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f16649b;
            hVar.f2009a.registerCallback(rVar.f3015a, handler);
            synchronized (hVar.f2010b) {
                if (hVar.f2012e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f3017c = gVar;
                    try {
                        hVar.f2012e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                    }
                } else {
                    rVar.f3017c = null;
                    hVar.f2011c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void Y(p pVar, Handler handler) {
        r rVar = (r) this.f16649b;
        synchronized (rVar.d) {
            rVar.f16639m = pVar;
            rVar.f16629a.setCallback(pVar.f16624b, handler);
            pVar.C(rVar, handler);
        }
    }

    public void Z(h0 h0Var) {
        r rVar = (r) this.f16649b;
        rVar.f16634g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f16633f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f16633f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e7) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e7);
                }
            }
            rVar.f16633f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f16629a;
        if (h0Var.f16602w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.f16594a, h0Var.f16595b, h0Var.d, h0Var.f16599n);
            builder.setBufferedPosition(h0Var.f16596c);
            builder.setActions(h0Var.f16597e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.f16600r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.f16591a, g0Var.f16592b, g0Var.f16593c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.f16601s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.f16602w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.f16602w);
    }

    @Override
    public void a() {
        ((le.k) this.f16649b).a();
    }

    public void a0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f16650c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f16649b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void b(i1 i1Var) {
        ((k0) this.f16649b).b(i1Var);
    }

    public int b0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16649b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.f16650c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public c3.h c(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f16650c;
        vVar.G(min);
        pVar.b(0, min, vVar.f8590a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f8591b, vVar.f8590a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f16649b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f8591b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f8591b;
                    }
                }
                int i12 = vVar.f8592c;
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
                            if (h3.a.a(vVar.f8591b, vVar.f8590a) == 443) {
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
                                int a2 = h3.a.a(vVar.f8591b, vVar.f8590a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f8592c, vVar.f8591b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f8591b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public java.lang.Object d(ce.c r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.d(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public boolean e() {
        return ((k0) this.f16649b).W();
    }

    @Override
    public void f(int i10, int i11) {
        ((k0) this.f16649b).Z(i10, i11);
    }

    @Override
    public void g() {
        e2.v vVar = (e2.v) this.f16650c;
        byte[] bArr = e2.d0.f8539b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override
    public Object mo28get() {
        return new m5.d((Context) ((e.a) this.f16649b).f8396a, (la.h) ((l2.g) this.f16650c).mo28get());
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j(float f7) {
        return false;
    }

    @Override
    public void l(i1 i1Var) {
        ((k0) this.f16649b).g();
    }

    public void m(Object obj, String str) {
        ((ArrayList) this.f16649b).add(a4.a.D(str, "=", String.valueOf(obj)));
    }

    @Override
    public boolean n(i1 i1Var) {
        return false;
    }

    public void o() {
        this.f16649b = null;
        this.f16650c = null;
    }

    @Override
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.f16649b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16650c;
        synchronized (eVar.f350f) {
            eVar.f349e.remove(taskCompletionSource);
        }
    }

    @Override
    public boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public void q(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f16649b;
        if (nVar != null) {
            nVar.q(str, j3, j10, j11);
        }
    }

    public i9.w s(byte[] bArr) {
        byte[] bArr2;
        la.h hVar = (la.h) this.f16650c;
        if (hVar != null && (bArr2 = (byte[]) hVar.f15399b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((la.h) this.f16650c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.f16649b;
        i9.w a2 = ((i9.y) iVar.f10178a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f16650c = new la.h(bArr, a2);
        return a2;
    }

    @Override
    public void t(i1 i1Var, int i10, int i11) {
        q9 J;
        k0 k0Var = (k0) this.f16649b;
        if (!((l0) this.f16650c).d && i10 != i11 && (J = k0Var.J()) != null) {
            if (!J.y() || J.W != k0Var.R()) {
                i1Var.post(new ii.i0(this, i1Var, i11, J, k0Var, i10));
            }
        }
    }

    public String toString() {
        switch (this.f16648a) {
            case 28:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16650c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16649b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void v(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f16649b;
        if (handler != null) {
            handler.post(new k2.h(this, gVar, 0));
        }
    }

    @Override
    public void w(CharSequence charSequence) {
        ((k0) this.f16649b).N(charSequence);
    }

    public void x(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.k0) this.f16649b).f2639y;
        if (sVar != null) {
            sVar.p().f2630o.x(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f16650c).iterator();
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
    public StackTraceElement[] y(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f16649b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.y(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f16650c).y(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void z() {
        ((le.k) this.f16649b).c((le.l) this.f16650c);
    }

    public y(Object obj, int i10) {
        this.f16648a = i10;
        this.f16649b = obj;
    }

    public y(Object obj, Object obj2, boolean z10, int i10) {
        this.f16648a = i10;
        this.f16649b = obj2;
        this.f16650c = obj;
    }

    public y(int i10) {
        this.f16648a = i10;
        switch (i10) {
            case 15:
                this.f16649b = new HashMap();
                return;
            case 17:
                return;
            case 27:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f16649b = byteArrayOutputStream;
                this.f16650c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f16649b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f16650c = new ReferenceQueue();
                return;
        }
    }

    public y(IBinder iBinder) {
        this.f16648a = 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f16650c = new j6.f(iBinder);
            this.f16649b = null;
            return;
        }
        this.f16649b = new Messenger(iBinder);
        this.f16650c = null;
    }

    public y(Object obj) {
        this.f16648a = 28;
        this.f16650c = obj;
        this.f16649b = new ArrayList();
    }

    public y(m6.a aVar) {
        this.f16648a = 13;
        this.f16649b = aVar == null ? null : aVar.f16332b;
    }

    @Override
    public void k() {
    }

    @Override
    public void r() {
    }

    public y(k6.e eVar) {
        this.f16648a = 29;
        this.f16649b = new SparseIntArray();
        n6.l.h(eVar);
        this.f16650c = eVar;
    }

    public y(androidx.fragment.app.k0 k0Var) {
        this.f16648a = 5;
        this.f16649b = k0Var;
        this.f16650c = new CopyOnWriteArrayList();
    }

    @Override
    public void h(boolean z10) {
    }

    public y(ea.a[] aVarArr) {
        this.f16648a = 12;
        this.f16649b = aVarArr;
        this.f16650c = new rb.a(7);
    }

    public y(e2.b0 b0Var) {
        this.f16648a = 20;
        this.f16649b = b0Var;
        this.f16650c = new e2.v();
    }

    public y(com.google.firebase.messaging.s sVar, rb.a aVar, androidx.emoji2.text.d dVar) {
        this.f16648a = 4;
        this.f16649b = sVar;
        this.f16650c = dVar;
    }

    public y(String str) {
        this.f16648a = 18;
        this.f16650c = null;
        this.f16649b = str;
    }

    public y(Handler handler, k2.k kVar) {
        this.f16648a = 22;
        if (kVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f16649b = handler;
        this.f16650c = kVar;
    }

    public y(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f16648a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f16650c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f16649b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f16649b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public y(a3.f fVar) {
        this.f16648a = 1;
        this.f16650c = fVar;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f16648a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f44275b;
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
                this.f16649b = new r(context, str, bundle);
            } else if (i11 >= 28) {
                this.f16649b = new r(context, str, bundle);
            } else if (i11 >= 22) {
                this.f16649b = new r(context, str, bundle);
            } else {
                this.f16649b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            Y(new p(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.f16649b).f16629a.setMediaButtonReceiver(pendingIntent);
            this.f16650c = new n4(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public y(w1 w1Var) {
        this.f16648a = 6;
        this.f16649b = w1Var;
        this.f16650c = new AtomicBoolean(false);
    }
}
