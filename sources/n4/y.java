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
import androidx.fragment.app.k0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.h1;
import ii.i1;
import ii.l0;
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
    public final int f15178a;
    public Object f15179b;
    public Object f15180c;

    public y(int i10, Object obj, Object obj2) {
        this.f15178a = i10;
        this.f15179b = obj;
        this.f15180c = obj2;
    }

    public static void O(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String c0(y yVar) {
        Collection<String> collection = (Collection) yVar.f15180c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.f15179b;
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
                    if (!g6.a.f9427a.matcher(str2).matches()) {
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

    public static boolean r(Editable editable, KeyEvent keyEvent, boolean z10) {
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.A(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
    public void B(i1 i1Var, int i10, int i11) {
        q9 C;
        ii.k0 k0Var = (ii.k0) this.f15179b;
        if (!((l0) this.f15180c).d && i10 != i11 && (C = k0Var.C()) != null) {
            if (!C.y() || C.W != k0Var.I()) {
                i1Var.post(new ii.i0(this, i1Var, i11, C, k0Var, i10));
            }
        }
    }

    @Override
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f15179b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.C(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f15180c).C(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public void D(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.D(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.E(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        k0 k0Var = (k0) this.f15179b;
        androidx.fragment.app.v vVar = k0Var.f2443w.f2531b;
        androidx.fragment.app.s sVar = k0Var.f2445y;
        if (sVar != null) {
            sVar.p().f2436o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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

    public void I(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.I(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.J(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        ((ii.k0) this.f15179b).E(charSequence);
    }

    public void L(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.L(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.M(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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

    public byte[] N(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f15180c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f15179b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f15109a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f15110b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f15111c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public c3.o P(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f15180c)) {
            if (!((AtomicBoolean) this.f15180c).get()) {
                try {
                    a2 = ((w1) this.f15179b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f15180c).set(true);
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

    public synchronized Map Q() {
        try {
            if (((Map) this.f15180c) == null) {
                this.f15180c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f15179b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f15180c;
    }

    public android.support.v4.media.session.l R() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f15179b).f1852a.getTransportControls();
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

    public boolean S(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.n r13) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.S(java.lang.CharSequence, int, int, androidx.emoji2.text.n):boolean");
    }

    public void T(k.a aVar) {
        oi.f fVar = (oi.f) this.f15179b;
        ((ActionMode.Callback) fVar.f15716a).onDestroyActionMode(fVar.o(aVar));
        g.s sVar = (g.s) this.f15180c;
        if (sVar.E != null) {
            sVar.f9297f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.f9313y != null) {
            r0.l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = r0.i0.a(sVar.f9313y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.f9312x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    @Override
    public void U(Editable editable) {
        ((l0) this.f15180c).i();
        ((ii.k0) this.f15179b).W();
    }

    public boolean V(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f15180c).J;
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.y.c(viewGroup);
        oi.f fVar = (oi.f) this.f15179b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f15716a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.b0((Context) fVar.f15717b, (l.l) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void W(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f15180c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f15179b;
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
    public boolean X(boolean z10) {
        return false;
    }

    public void Y(p pVar, Handler handler) {
        r rVar = (r) this.f15179b;
        synchronized (rVar.d) {
            rVar.f15169m = pVar;
            rVar.f15160a.setCallback(pVar.f15156b, handler);
            pVar.C(rVar, handler);
        }
    }

    public void Z(h0 h0Var) {
        r rVar = (r) this.f15179b;
        rVar.f15164g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f15163f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f15163f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            rVar.f15163f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f15160a;
        if (h0Var.f15136w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.f15129a, h0Var.f15130b, h0Var.d, h0Var.f15133n);
            builder.setBufferedPosition(h0Var.f15131c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.f15134r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.f15126a, g0Var.f15127b, g0Var.f15128c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.f15135s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.f15136w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.f15136w);
    }

    @Override
    public void a() {
        ((le.k) this.f15179b).a();
    }

    public void a0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f15180c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f15179b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public c3.h b(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f15180c;
        vVar.G(min);
        pVar.a(0, min, vVar.f7933a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f7934b, vVar.f7933a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f15179b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f7934b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f7934b;
                    }
                }
                int i12 = vVar.f7935c;
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
                            if (h3.a.a(vVar.f7934b, vVar.f7933a) == 443) {
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
                                int a2 = h3.a.a(vVar.f7934b, vVar.f7933a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f7935c, vVar.f7934b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f7934b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    public int b0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f15179b;
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
            i10 = ((k6.e) this.f15180c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void c(i1 i1Var) {
        ((ii.k0) this.f15179b).c(i1Var);
    }

    @Override
    public void d() {
        e2.v vVar = (e2.v) this.f15180c;
        byte[] bArr = e2.d0.f7888b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override
    public boolean f() {
        return ((ii.k0) this.f15179b).N();
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public Object mo28get() {
        return new m5.d((Context) ((a9.r) this.f15179b).f353a, (lf.i) ((a4.m) this.f15180c).mo28get());
    }

    @Override
    public boolean h(float f7) {
        return false;
    }

    @Override
    public void j(int i10, int i11) {
        ((ii.k0) this.f15179b).Q(i10, i11);
    }

    public void k(Object obj, String str) {
        ((ArrayList) this.f15179b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public java.lang.Object l(ce.c r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.l(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public void m(i1 i1Var) {
        ((ii.k0) this.f15179b).h();
    }

    public void n() {
        this.f15179b = null;
        this.f15180c = null;
    }

    public i9.w o(byte[] bArr) {
        byte[] bArr2;
        lf.i iVar = (lf.i) this.f15180c;
        if (iVar != null && (bArr2 = (byte[]) iVar.f14179b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((lf.i) this.f15180c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar2 = (g2.i) this.f15179b;
        i9.w a2 = ((i9.y) iVar2.f9365a).a(new com.google.firebase.messaging.h(1, iVar2, bArr));
        this.f15180c = new lf.i(bArr, a2);
        return a2;
    }

    @Override
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.f15179b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15180c;
        synchronized (eVar.f326f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override
    public boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public void q(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f15179b;
        if (nVar != null) {
            nVar.q(str, j3, j10, j11);
        }
    }

    public void s(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f15179b;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    @Override
    public boolean t(i1 i1Var) {
        return false;
    }

    public String toString() {
        switch (this.f15178a) {
            case 28:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f15180c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f15179b;
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

    @Override
    public void u() {
        ((le.k) this.f15179b).c((le.l) this.f15180c);
    }

    public void v(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
    public void w(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f15180c;
        if (((g6.n) this.f15179b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f9440i)};
                g6.b bVar = mVar.f9459a;
                Log.w(bVar.f9429a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f45988b).f8018i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f15179b).w(str, j3, i11, obj, j10, j11);
        }
    }

    public void y(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f15179b;
        androidx.fragment.app.v vVar = k0Var.f2443w.f2531b;
        androidx.fragment.app.s sVar = k0Var.f2445y;
        if (sVar != null) {
            sVar.p().f2436o.y(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f15179b).f2445y;
        if (sVar != null) {
            sVar.p().f2436o.z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f15180c).iterator();
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

    public y(Object obj, int i10) {
        this.f15178a = i10;
        this.f15179b = obj;
    }

    public y(Object obj, Object obj2, boolean z10, int i10) {
        this.f15178a = i10;
        this.f15179b = obj2;
        this.f15180c = obj;
    }

    public y(int i10) {
        this.f15178a = i10;
        switch (i10) {
            case 15:
                this.f15179b = new HashMap();
                return;
            case 17:
                return;
            case 27:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f15179b = byteArrayOutputStream;
                this.f15180c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f15179b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f15180c = new ReferenceQueue();
                return;
        }
    }

    public y(IBinder iBinder) {
        this.f15178a = 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f15180c = new j6.f(iBinder);
            this.f15179b = null;
            return;
        }
        this.f15179b = new Messenger(iBinder);
        this.f15180c = null;
    }

    public y(Object obj) {
        this.f15178a = 28;
        this.f15180c = obj;
        this.f15179b = new ArrayList();
    }

    public y(m6.a aVar) {
        this.f15178a = 13;
        this.f15179b = aVar == null ? null : aVar.f14917b;
    }

    @Override
    public void i() {
    }

    @Override
    public void x() {
    }

    public y(k6.e eVar) {
        this.f15178a = 29;
        this.f15179b = new SparseIntArray();
        n6.l.h(eVar);
        this.f15180c = eVar;
    }

    public y(k0 k0Var) {
        this.f15178a = 5;
        this.f15179b = k0Var;
        this.f15180c = new CopyOnWriteArrayList();
    }

    @Override
    public void e(boolean z10) {
    }

    public y(ea.a[] aVarArr) {
        this.f15178a = 12;
        this.f15179b = aVarArr;
        this.f15180c = new rb.a(7);
    }

    public y(e2.b0 b0Var) {
        this.f15178a = 20;
        this.f15179b = b0Var;
        this.f15180c = new e2.v();
    }

    public y(com.google.firebase.messaging.t tVar, rb.a aVar, androidx.emoji2.text.d dVar) {
        this.f15178a = 4;
        this.f15179b = tVar;
        this.f15180c = dVar;
    }

    public y(String str) {
        this.f15178a = 18;
        this.f15180c = null;
        this.f15179b = str;
    }

    public y(Handler handler, k2.j jVar) {
        this.f15178a = 22;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f15179b = handler;
        this.f15180c = jVar;
    }

    public y(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f15178a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f15180c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f15179b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f15179b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public y(a3.f fVar) {
        this.f15178a = 1;
        this.f15180c = fVar;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f15178a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f40912b;
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
                this.f15179b = new r(context, str, bundle);
            } else if (i11 >= 28) {
                this.f15179b = new r(context, str, bundle);
            } else if (i11 >= 22) {
                this.f15179b = new r(context, str, bundle);
            } else {
                this.f15179b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            Y(new p(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.f15179b).f15160a.setMediaButtonReceiver(pendingIntent);
            this.f15180c = new k2.u(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public y(w1 w1Var) {
        this.f15178a = 6;
        this.f15179b = w1Var;
        this.f15180c = new AtomicBoolean(false);
    }
}
