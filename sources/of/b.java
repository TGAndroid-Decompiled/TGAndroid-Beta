package of;

import a3.h0;
import a3.j0;
import a9.r;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.v;
import b2.x1;
import bi.cb;
import c3.i;
import c3.o;
import c3.p;
import com.google.android.gms.cast.CastDevice;
import d6.h;
import e2.d0;
import g.j;
import g6.m;
import g6.n;
import hi.e4;
import hi.g6;
import hi.k1;
import hi.m3;
import hi.m4;
import hi.s;
import hi.w3;
import hi.x3;
import hi.y3;
import hi.z3;
import i9.w;
import i9.y;
import j$.util.DesugarCollections;
import j$.util.Objects;
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
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import l.b0;
import le.k;
import m.e3;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import r0.i0;
import r0.l0;
public final class b implements h, ce.b, ea.a, n, x3, i, le.f, n5.b {
    public static volatile b d;
    public final int f14293a;
    public Object f14294b;
    public Object f14295c;

    public b(int i10, Object obj, Object obj2) {
        this.f14293a = i10;
        this.f14294b = obj2;
        this.f14295c = obj;
    }

    public static boolean I(Editable editable, KeyEvent keyEvent, boolean z10) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
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

    private final void L(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f14294b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    public static b d0() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b(0);
                        d = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static String t0(b bVar) {
        Collection<String> collection = (Collection) bVar.f14295c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.f14294b;
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
                    if (!g6.a.f8556a.matcher(str2).matches()) {
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

    @Override
    public void A(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        p0(cVar);
    }

    @Override
    public void B(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void C(k1 k1Var, boolean z10) {
        ((s) this.f14295c).f26422b.t1(k1Var, z10);
    }

    @Override
    public void D() {
        e2.v vVar = (e2.v) this.f14295c;
        byte[] bArr = d0.f7189b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    public void E(Object obj, String str) {
        ((ArrayList) this.f14294b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    public void F() {
        this.f14294b = null;
        this.f14295c = null;
    }

    @Override
    public void G() {
        s sVar = (s) this.f14295c;
        if (sVar.getCurrentItemTop() != sVar.I) {
            sVar.f26422b.X1(sVar, 0);
        }
        sVar.a0();
        s.K(sVar);
    }

    public w H(byte[] bArr) {
        byte[] bArr2;
        e3 e3Var = (e3) this.f14295c;
        if (e3Var != null && (bArr2 = (byte[]) e3Var.f13001b) != null && Arrays.equals(bArr2, bArr)) {
            w wVar = (w) ((e3) this.f14295c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.f14294b;
        w a2 = ((y) iVar.f8494a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f14295c = new e3(bArr, a2);
        return a2;
    }

    public void J(i2.g gVar) {
        switch (this.f14293a) {
            case 1:
                L(gVar);
                return;
            default:
                synchronized (gVar) {
                }
                Handler handler = (Handler) this.f14294b;
                if (handler != null) {
                    handler.post(new k2.g(this, gVar, 0));
                    return;
                }
                return;
        }
    }

    @Override
    public void K(int i10) {
        s sVar = (s) this.f14295c;
        sVar.f26422b.X1(sVar, i10);
        sVar.a0();
        s.K(sVar);
    }

    public void M(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.M(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f14294b;
        androidx.fragment.app.v vVar = j0Var.f1135w.f1224b;
        androidx.fragment.app.s sVar = j0Var.f1137y;
        if (sVar != null) {
            sVar.p().f1128o.N(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.O(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void P(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.P(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void Q(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.Q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void R(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.R(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void S(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f14294b;
        androidx.fragment.app.v vVar = j0Var.f1135w.f1224b;
        androidx.fragment.app.s sVar = j0Var.f1137y;
        if (sVar != null) {
            sVar.p().f1128o.S(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void T(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.T(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void U(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.U(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void V(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.V(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void W(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.W(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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

    public void X(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.X(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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
    public void Y() {
        e4 e4Var = ((s) this.f14295c).f9836s;
        if (e4Var != null) {
            int i10 = 0;
            e4Var.e(false, true);
            int i11 = e4Var.f9546b0;
            if (i11 != 2) {
                i10 = i11;
            }
            e4Var.f(i10, true);
        }
    }

    public void Z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f14294b).f1137y;
        if (sVar != null) {
            sVar.p().f1128o.Z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14295c).iterator();
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
    public void a() {
        ((k) this.f14294b).a();
    }

    @Override
    public w70 a0(View view) {
        s sVar = (s) this.f14295c;
        w70 w70Var = new w70(sVar, (f6) this.f14294b, view, false, false, true);
        sVar.H = w70Var;
        return w70Var;
    }

    @Override
    public void b(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public byte[] b0(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14295c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14294b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f13754a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f13755b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f13756c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void c(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public o c0(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f14295c)) {
            if (!((AtomicBoolean) this.f14295c).get()) {
                try {
                    a2 = ((androidx.emoji2.text.w) this.f14294b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f14295c).set(true);
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
            return (o) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    @Override
    public void d(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override
    public void e0() {
        s sVar = (s) this.f14295c;
        sVar.X();
        sVar.Y();
    }

    @Override
    public boolean f(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.f(float):boolean");
    }

    public synchronized Map f0() {
        try {
            if (((Map) this.f14295c) == null) {
                this.f14295c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f14294b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f14295c;
    }

    @Override
    public boolean g() {
        return false;
    }

    public l g0() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f14294b).f533a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new l(transportControls);
        }
        if (i10 >= 24) {
            return new l(transportControls);
        }
        if (i10 >= 23) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    @Override
    public Object mo28get() {
        return new m5.d((Context) ((r) this.f14294b).f349a, (e3) ((l2.g) this.f14295c).mo28get());
    }

    @Override
    public void h(g6 g6Var, String str) {
        s sVar = (s) this.f14295c;
        if (sVar.v == null) {
            f6 f6Var = (f6) this.f14294b;
            sVar.v = new r3(new cb(12, this, f6Var), f6Var);
        }
        sVar.v.d(g6Var, str);
    }

    public boolean h0(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.o r13) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.h0(java.lang.CharSequence, int, int, androidx.emoji2.text.o):boolean");
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    public boolean i0() {
        if (((a) ((e3) this.f14294b).d) != null) {
            return true;
        }
        return false;
    }

    public void j0(k.a aVar) {
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f14294b;
        ((ActionMode.Callback) sVar.f6118b).onDestroyActionMode(sVar.c(aVar));
        g.s sVar2 = (g.s) this.f14295c;
        if (sVar2.E != null) {
            sVar2.f8426f.getDecorView().removeCallbacks(sVar2.F);
        }
        if (sVar2.f8442y != null) {
            l0 l0Var = sVar2.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(sVar2.f8442y);
            a2.a(0.0f);
            sVar2.G = a2;
            a2.d(new j(this, 2));
        }
        sVar2.f8441x = null;
        ViewGroup viewGroup = sVar2.J;
        WeakHashMap weakHashMap = i0.f41062a;
        r0.y.c(viewGroup);
        sVar2.x();
    }

    @Override
    public void k(hi.a aVar) {
        s sVar = (s) this.f14295c;
        yi yiVar = sVar.f26422b;
        p2 p2Var = yiVar.f29366f0;
        if (p2Var != null && aVar != null && (aVar.f9421b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            yi yiVar2 = new yi(sVar.getContext(), yiVar.f29366f0, false, false, false, null);
            yiVar2.Z1 = new ob.a(10);
            yiVar2.P = true;
            yiVar2.f29424x1.setVisibility(8);
            yiVar2.f29411t2 = new androidx.car.app.utils.a(sVar, aVar, yiVar2, 8);
            yiVar2.r1();
            yiVar2.show();
        }
    }

    public boolean k0(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f14295c).J;
        WeakHashMap weakHashMap = i0.f41062a;
        r0.y.c(viewGroup);
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f14294b;
        ActionMode.Callback callback = (ActionMode.Callback) sVar.f6118b;
        k.e c10 = sVar.c(aVar);
        a0.l lVar = (a0.l) sVar.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) sVar.f6119c, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(c10, menu2);
    }

    @Override
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f14294b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.l(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.a) this.f14295c).l(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public void l0(o0.g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f14295c;
        pb.c cVar = (pb.c) this.f14294b;
        int i10 = gVar.f14097b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, cVar, gVar.f14096a));
        } else {
            nVar.execute(new androidx.activity.i(cVar, i10));
        }
    }

    @Override
    public void m(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f14294b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    public void m0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f14295c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f14294b;
            hVar.f533a.registerCallback(rVar.f1487a, handler);
            synchronized (hVar.f534b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f1489c = gVar;
                    try {
                        hVar.e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    rVar.f1489c = null;
                    hVar.f535c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public c3.h n(p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f14295c;
        vVar.G(min);
        pVar.b(0, min, vVar.f7234a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f7235b, vVar.f7234a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.y.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f14294b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f7235b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f7235b;
                    }
                }
                int i12 = vVar.f7236c;
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
                            if (h3.a.a(vVar.f7235b, vVar.f7234a) == 443) {
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
                                int a2 = h3.a.a(vVar.f7235b, vVar.f7234a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f7236c, vVar.f7235b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f7235b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    public void n0(Object obj) {
        Handler handler = (Handler) this.f14294b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override
    public void o(y3 y3Var, View view) {
        s sVar = (s) this.f14295c;
        w70 w70Var = new w70(sVar, (f6) this.f14294b, view, false, false, true);
        w70Var.Q = true;
        p2 p2Var = sVar.f26422b.f29366f0;
        sVar.getContext();
        sVar.H = m4.b(w70Var, p2Var, y3Var, true);
    }

    public void o0(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        e3 e3Var = (e3) this.f14294b;
        g gVar3 = (g) e3Var.f13002c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f14315a;
                    if (gVar != null && arrayList.size() == gVar.f14315a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f14311a, a10.f14311a) && Objects.equals(a2.f14312b, a10.f14312b) && Objects.equals(a2.f14313c, a10.f14313c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f14314f == a10.f14314f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) e3Var.d) != null && gVar != null) {
            e3Var.o(gVar);
        }
        if (((a) e3Var.d) != null && (gVar2 = (g) e3Var.f13002c) != null) {
            e3Var.S(gVar2);
        }
        if (gVar != null && gVar.f14315a.size() > 0 && !gVar.a(0).f14311a.startsWith("audio/") && (dVar = (d) e3Var.f13001b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) e3Var.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f14292g = 0;
            aVar.h = 0;
            aVar.p();
        }
        e3Var.f13002c = gVar;
    }

    @Override
    public void onContentChanged() {
        s sVar = (s) this.f14295c;
        e4 e4Var = sVar.f9836s;
        if (e4Var != null) {
            e4Var.setSendLoading(sVar.f9835r.l3());
        }
        sVar.V(true);
        sVar.Y();
        hi.e eVar = sVar.P;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    @Override
    public void p(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((e3) this.f14294b).V(null);
    }

    public void p0(d6.c cVar) {
        String str;
        String string;
        e3 e3Var = (e3) this.f14294b;
        if (cVar != null) {
            n6.l.e("Must be called from the main thread.");
            e6.h hVar = cVar.f6309j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) e3Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f14290c.a(), a2)) {
                    e3Var.V(new a(cVar, (d6.g) this.f14295c, hVar));
                    n6.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f6310k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f30049e0 != null && t12.Q1()) {
                        wc wcVar = new wc(t12.f30049e0, new zh.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        wcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public void q(int i10) {
        s.O((s) this.f14295c, 74, i10);
    }

    public void q0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f14295c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f14294b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void r(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        p0(cVar);
    }

    public void r0(x1 x1Var) {
        Handler handler = (Handler) this.f14294b;
        if (handler != null) {
            handler.post(new a1.e(2, this, x1Var));
        }
    }

    @Override
    public void s() {
        int i10;
        s sVar = (s) this.f14295c;
        z3 z3Var = sVar.f9835r;
        e4 e4Var = sVar.f9836s;
        if (e4Var != null) {
            m3 m3Var = z3Var.f10011n3;
            if (m3Var != null && m3Var.y() && z3Var.B4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (e4Var.f9544a0 == 2) {
                e4Var.f9546b0 = i10;
            } else {
                e4Var.f(i10, true);
            }
            if (i10 != 0) {
                sVar.W();
            }
        }
        sVar.Z();
    }

    public int s0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f14294b;
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
            i10 = ((k6.e) this.f14295c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void t(w3 w3Var, View view) {
        s sVar = (s) this.f14295c;
        w70 w70Var = new w70(sVar, (f6) this.f14294b, view, false, false, true);
        w70Var.Q = true;
        sVar.H = m4.c(w70Var, sVar.f26422b.f29366f0, sVar.getContext(), (f6) this.f14294b, w3Var, true);
    }

    public String toString() {
        switch (this.f14293a) {
            case 27:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f14295c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f14294b;
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
    public java.lang.Object u(ce.c r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.u(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public void v(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void w() {
        e4 e4Var = ((s) this.f14295c).f9836s;
        if (e4Var != null) {
            int i10 = e4Var.f9544a0;
            if (i10 == 2) {
                i10 = 0;
            }
            e4Var.f9546b0 = i10;
            e4Var.e(false, false);
            e4Var.f(2, true);
        }
    }

    @Override
    public void x() {
        ((k) this.f14294b).e((le.l) this.f14295c);
    }

    @Override
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        m mVar = (m) this.f14295c;
        if (((n) this.f14294b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f8569i)};
                g6.b bVar = mVar.f8588a;
                Log.w(bVar.f8558a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f273b).f7319i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((n) this.f14294b).y(str, j3, i11, obj, j10, j11);
        }
    }

    @Override
    public void z(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public b(Object obj, int i10) {
        this.f14293a = i10;
        this.f14294b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f14293a = i10;
        this.f14294b = obj;
        this.f14295c = obj2;
    }

    public b(IBinder iBinder) {
        this.f14293a = 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f14295c = new j6.f(iBinder);
            this.f14294b = null;
            return;
        }
        this.f14294b = new Messenger(iBinder);
        this.f14295c = null;
    }

    public b(Object obj) {
        this.f14293a = 27;
        this.f14295c = obj;
        this.f14294b = new ArrayList();
    }

    public b(m6.a aVar) {
        this.f14293a = 12;
        this.f14294b = aVar == null ? null : aVar.f13577b;
    }

    public b(k6.e eVar) {
        this.f14293a = 28;
        this.f14294b = new SparseIntArray();
        n6.l.h(eVar);
        this.f14295c = eVar;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.f14293a = 4;
        this.f14294b = j0Var;
        this.f14295c = new CopyOnWriteArrayList();
    }

    public b(ea.a[] aVarArr) {
        this.f14293a = 11;
        this.f14294b = aVarArr;
        this.f14295c = new rb.a(7);
    }

    @Override
    public void j() {
    }

    public b(int i10) {
        this.f14293a = i10;
        switch (i10) {
            case 10:
                this.f14294b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f14295c = new ReferenceQueue();
                return;
            case 14:
                this.f14294b = new HashMap();
                return;
            case 17:
                return;
            case 26:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14294b = byteArrayOutputStream;
                this.f14295c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                n2.l lVar = new n2.l(3);
                c10.getClass();
                n6.l.e("Must be called from the main thread.");
                d6.g gVar = c10.f6286c;
                gVar.getClass();
                try {
                    d6.y yVar = gVar.f6318a;
                    d6.j jVar = new d6.j(lVar);
                    Parcel O0 = yVar.O0();
                    com.google.android.gms.internal.cast.v.d(O0, jVar);
                    yVar.S0(O0, 4);
                } catch (RemoteException e) {
                    d6.g.f6317c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.f14294b = new e3(9, false);
                d6.g b10 = c10.b();
                this.f14295c = b10;
                b10.a(this);
                p0(b10.c());
                return;
        }
    }

    @Override
    public void e(boolean z10) {
    }

    public b(e2.b0 b0Var) {
        this.f14293a = 19;
        this.f14294b = b0Var;
        this.f14295c = new e2.v();
    }

    public b(com.google.firebase.messaging.s sVar, rb.a aVar, androidx.emoji2.text.d dVar) {
        this.f14293a = 3;
        this.f14294b = sVar;
        this.f14295c = dVar;
    }

    public b(String str) {
        this.f14293a = 18;
        this.f14295c = null;
        this.f14294b = str;
    }

    public b(Handler handler, a3.l0 l0Var) {
        this.f14293a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f14294b = handler;
        this.f14295c = l0Var;
    }

    public b(Handler handler, k2.j jVar) {
        this.f14293a = 21;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f14294b = handler;
        this.f14295c = jVar;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f14293a = 2;
        if (mediaSessionCompat$Token != null) {
            this.f14295c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f14294b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f14294b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(androidx.emoji2.text.w wVar) {
        this.f14293a = 5;
        this.f14294b = wVar;
        this.f14295c = new AtomicBoolean(false);
    }
}
