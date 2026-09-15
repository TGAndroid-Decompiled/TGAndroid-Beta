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
import m.e3;
import org.telegram.ui.Cells.q9;
import p4.t0;
public final class y implements OnCompleteListener, ce.b, ea.a, g6.n, h1, c3.i, le.f, n5.b {
    public final int f14993a;
    public Object f14994b;
    public Object f14995c;

    public y(int i10, Object obj, Object obj2) {
        this.f14993a = i10;
        this.f14994b = obj;
        this.f14995c = obj2;
    }

    public static void O(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String c0(y yVar) {
        Collection<String> collection = (Collection) yVar.f14995c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.f14994b;
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
                    if (!g6.a.f9423a.matcher(str2).matches()) {
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

    public static boolean o(Editable editable, KeyEvent keyEvent, boolean z10) {
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
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.A(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        k0 k0Var = (k0) this.f14994b;
        androidx.fragment.app.v vVar = k0Var.f2438w.f2526b;
        androidx.fragment.app.s sVar = k0Var.f2440y;
        if (sVar != null) {
            sVar.p().f2431o.B(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        ea.a[] aVarArr = (ea.a[]) this.f14994b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.C(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f14995c).C(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void D(i1 i1Var, int i10, int i11) {
        q9 E;
        ii.k0 k0Var = (ii.k0) this.f14994b;
        if (!((l0) this.f14995c).d && i10 != i11 && (E = k0Var.E()) != null) {
            if (!E.y() || E.W != k0Var.K()) {
                i1Var.post(new ii.i0(this, i1Var, i11, E, k0Var, i10));
            }
        }
    }

    @Override
    public void E() {
        ((le.k) this.f14994b).c((le.l) this.f14995c);
    }

    public void F(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
    public java.lang.Object H(ce.c r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.H(ce.c, kd.c):java.lang.Object");
    }

    public void I(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.I(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.J(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.K(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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

    public void L(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.L(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
    public void M(CharSequence charSequence) {
        ((ii.k0) this.f14994b).I(charSequence);
    }

    public byte[] N(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14995c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14994b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f14924a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f14925b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f14926c);
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
        synchronized (((AtomicBoolean) this.f14995c)) {
            if (!((AtomicBoolean) this.f14995c).get()) {
                try {
                    a2 = ((w1) this.f14994b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f14995c).set(true);
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
            if (((Map) this.f14995c) == null) {
                this.f14995c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f14994b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f14995c;
    }

    public android.support.v4.media.session.l R() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f14994b).f1847a.getTransportControls();
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
        ni.f fVar = (ni.f) this.f14994b;
        ((ActionMode.Callback) fVar.f15257a).onDestroyActionMode(fVar.o(aVar));
        g.s sVar = (g.s) this.f14995c;
        if (sVar.E != null) {
            sVar.f9293f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.f9309y != null) {
            r0.l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = r0.i0.a(sVar.f9309y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.f9308x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.y.c(viewGroup);
        sVar.x();
    }

    public boolean U(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f14995c).J;
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.y.c(viewGroup);
        ni.f fVar = (ni.f) this.f14994b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f15257a;
        k.e o9 = fVar.o(aVar);
        a0.l lVar = (a0.l) fVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.f15258b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void V(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f14995c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f14994b;
            hVar.f1847a.registerCallback(rVar.f2790a, handler);
            synchronized (hVar.f1848b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f2792c = gVar;
                    try {
                        hVar.e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    rVar.f2792c = null;
                    hVar.f1849c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void W(Editable editable) {
        ((l0) this.f14995c).i();
        ((ii.k0) this.f14994b).a0();
    }

    public void X(p pVar, Handler handler) {
        r rVar = (r) this.f14994b;
        synchronized (rVar.d) {
            rVar.f14984m = pVar;
            rVar.f14975a.setCallback(pVar.f14971b, handler);
            pVar.C(rVar, handler);
        }
    }

    public void Y(h0 h0Var) {
        r rVar = (r) this.f14994b;
        rVar.f14979g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f14978f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f14978f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            rVar.f14978f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f14975a;
        if (h0Var.f14951w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.f14944a, h0Var.f14945b, h0Var.d, h0Var.f14948n);
            builder.setBufferedPosition(h0Var.f14946c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.f14949r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.f14941a, g0Var.f14942b, g0Var.f14943c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.f14950s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.f14951w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.f14951w);
    }

    public void Z(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f14995c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f14994b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void a() {
        ((le.k) this.f14994b).a();
    }

    public int a0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f14994b;
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
            i10 = ((k6.e) this.f14995c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public c3.h b(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f14995c;
        vVar.G(min);
        pVar.a(0, min, vVar.f7929a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f7930b, vVar.f7929a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f14994b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f7930b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f7930b;
                    }
                }
                int i12 = vVar.f7931c;
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
                            if (h3.a.a(vVar.f7930b, vVar.f7929a) == 443) {
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
                                int a2 = h3.a.a(vVar.f7930b, vVar.f7929a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f7931c, vVar.f7930b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f7930b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public boolean b0(boolean z10) {
        return false;
    }

    @Override
    public void c(i1 i1Var) {
        ((ii.k0) this.f14994b).c(i1Var);
    }

    @Override
    public void d() {
        e2.v vVar = (e2.v) this.f14995c;
        byte[] bArr = e2.d0.f7884b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    public void e(Object obj, String str) {
        ((ArrayList) this.f14994b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public boolean f() {
        return ((ii.k0) this.f14994b).P();
    }

    @Override
    public Object mo28get() {
        return new m5.d((Context) ((a9.r) this.f14994b).f351a, (e3) ((k2.c0) this.f14995c).mo28get());
    }

    public void h() {
        this.f14994b = null;
        this.f14995c = null;
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public void j(int i10, int i11) {
        ((ii.k0) this.f14994b).S(i10, i11);
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public void m(i1 i1Var) {
        ((ii.k0) this.f14994b).i();
    }

    public i9.w n(byte[] bArr) {
        byte[] bArr2;
        e3 e3Var = (e3) this.f14995c;
        if (e3Var != null && (bArr2 = (byte[]) e3Var.f14165b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((e3) this.f14995c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.f14994b;
        i9.w a2 = ((i9.y) iVar.f9361a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f14995c = new e3(bArr, a2);
        return a2;
    }

    @Override
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.f14994b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f14995c;
        synchronized (eVar.f324f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override
    public void p(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f14994b;
        if (nVar != null) {
            nVar.p(str, j3, j10, j11);
        }
    }

    @Override
    public boolean q(i1 i1Var) {
        return false;
    }

    public void r(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f14994b;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    public void s(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.s(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
    public boolean t(i1 i1Var) {
        return false;
    }

    public String toString() {
        switch (this.f14993a) {
            case 28:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f14995c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f14994b;
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

    public void u(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.f14994b;
        androidx.fragment.app.v vVar = k0Var.f2438w.f2526b;
        androidx.fragment.app.s sVar = k0Var.f2440y;
        if (sVar != null) {
            sVar.p().f2431o.u(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.w(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f14995c;
        if (((g6.n) this.f14994b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f9436i)};
                g6.b bVar = mVar.f9455a;
                Log.w(bVar.f9425a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f45737b).f8014i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f14994b).y(str, j3, i11, obj, j10, j11);
        }
    }

    public void z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.f14994b).f2440y;
        if (sVar != null) {
            sVar.p().f2431o.z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14995c).iterator();
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
        this.f14993a = i10;
        this.f14994b = obj;
    }

    public y(Object obj, Object obj2, boolean z10, int i10) {
        this.f14993a = i10;
        this.f14994b = obj2;
        this.f14995c = obj;
    }

    public y(int i10) {
        this.f14993a = i10;
        switch (i10) {
            case 15:
                this.f14994b = new HashMap();
                return;
            case 17:
                return;
            case 27:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14994b = byteArrayOutputStream;
                this.f14995c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f14994b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f14995c = new ReferenceQueue();
                return;
        }
    }

    public y(IBinder iBinder) {
        this.f14993a = 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f14995c = new j6.f(iBinder);
            this.f14994b = null;
            return;
        }
        this.f14994b = new Messenger(iBinder);
        this.f14995c = null;
    }

    public y(Object obj) {
        this.f14993a = 28;
        this.f14995c = obj;
        this.f14994b = new ArrayList();
    }

    public y(m6.a aVar) {
        this.f14993a = 13;
        this.f14994b = aVar == null ? null : aVar.f14735b;
    }

    @Override
    public void l() {
    }

    @Override
    public void x() {
    }

    public y(k6.e eVar) {
        this.f14993a = 29;
        this.f14994b = new SparseIntArray();
        n6.l.h(eVar);
        this.f14995c = eVar;
    }

    public y(k0 k0Var) {
        this.f14993a = 5;
        this.f14994b = k0Var;
        this.f14995c = new CopyOnWriteArrayList();
    }

    @Override
    public void g(boolean z10) {
    }

    public y(ea.a[] aVarArr) {
        this.f14993a = 12;
        this.f14994b = aVarArr;
        this.f14995c = new rb.a(7);
    }

    public y(e2.b0 b0Var) {
        this.f14993a = 20;
        this.f14994b = b0Var;
        this.f14995c = new e2.v();
    }

    public y(com.google.firebase.messaging.t tVar, rb.a aVar, androidx.emoji2.text.d dVar) {
        this.f14993a = 4;
        this.f14994b = tVar;
        this.f14995c = dVar;
    }

    public y(String str) {
        this.f14993a = 18;
        this.f14995c = null;
        this.f14994b = str;
    }

    public y(Handler handler, k2.j jVar) {
        this.f14993a = 22;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f14994b = handler;
        this.f14995c = jVar;
    }

    public y(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f14993a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f14995c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f14994b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f14994b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public y(a3.f fVar) {
        this.f14993a = 1;
        this.f14995c = fVar;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f14993a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f40659b;
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
                this.f14994b = new r(context, str, bundle);
            } else if (i11 >= 28) {
                this.f14994b = new r(context, str, bundle);
            } else if (i11 >= 22) {
                this.f14994b = new r(context, str, bundle);
            } else {
                this.f14994b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            X(new p(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.f14994b).f14975a.setMediaButtonReceiver(pendingIntent);
            this.f14995c = new k2.u(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public y(w1 w1Var) {
        this.f14993a = 6;
        this.f14994b = w1Var;
        this.f14995c = new AtomicBoolean(false);
    }
}
