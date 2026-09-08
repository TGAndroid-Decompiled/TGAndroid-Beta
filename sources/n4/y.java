package n4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.a4;
import ji.g6;
import ji.h1;
import ji.i3;
import ji.j4;
import ji.s3;
import ji.t3;
import ji.u3;
import ji.u4;
import ji.v3;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vi;
import p4.t0;
import r0.l0;
public final class y implements OnCompleteListener, ce.b, ea.a, g6.n, c3.i, t3, le.f, n5.b {
    public final int f16522a;
    public Object f16523b;
    public Object f16524c;

    public y(int i10, Object obj, Object obj2) {
        this.f16522a = i10;
        this.f16523b = obj;
        this.f16524c = obj2;
    }

    public static void F(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String N(y yVar) {
        Collection<String> collection = (Collection) yVar.f16524c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.f16523b;
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
                    if (!g6.a.f10412a.matcher(str2).matches()) {
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

    public void A() {
        this.f16523b = null;
        this.f16524c = null;
    }

    public i9.w B(byte[] bArr) {
        byte[] bArr2;
        m2.t tVar = (m2.t) this.f16524c;
        if (tVar != null && (bArr2 = (byte[]) tVar.f15844b) != null && Arrays.equals(bArr2, bArr)) {
            i9.w wVar = (i9.w) ((m2.t) this.f16524c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.f16523b;
        i9.w a2 = ((i9.y) iVar.f10342a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f16524c = new m2.t(bArr, a2);
        return a2;
    }

    @Override
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.f16523b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.C(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((t7.u) this.f16524c).C(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public void D(i2.h hVar) {
        synchronized (hVar) {
        }
        Handler handler = (Handler) this.f16523b;
        if (handler != null) {
            handler.post(new k2.g(this, hVar, 0));
        }
    }

    public byte[] E(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f16524c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f16523b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f16446a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f16447b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f16448c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f16449e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public c3.o G(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f16524c)) {
            if (!((AtomicBoolean) this.f16524c).get()) {
                try {
                    a2 = ((androidx.emoji2.text.w) this.f16523b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f16524c).set(true);
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

    public synchronized Map H() {
        try {
            if (((Map) this.f16524c) == null) {
                this.f16524c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f16523b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f16524c;
    }

    public void I(k.a aVar) {
        fg.f fVar = (fg.f) this.f16523b;
        ((ActionMode.Callback) fVar.f9520a).onDestroyActionMode(fVar.p(aVar));
        g.s sVar = (g.s) this.f16524c;
        if (sVar.E != null) {
            sVar.f10267f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.f10283y != null) {
            l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = r0.i0.a(sVar.f10283y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.f10282x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    public boolean J(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f16524c).J;
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.y.c(viewGroup);
        fg.f fVar = (fg.f) this.f16523b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f9520a;
        k.e p5 = fVar.p(aVar);
        a0.l lVar = (a0.l) fVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.b0((Context) fVar.f9521b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(p5, menu2);
    }

    public void K(p pVar, Handler handler) {
        r rVar = (r) this.f16523b;
        synchronized (rVar.d) {
            rVar.f16513m = pVar;
            rVar.f16503a.setCallback(pVar.f16498b, handler);
            pVar.C(rVar, handler);
        }
    }

    public void L(h0 h0Var) {
        r rVar = (r) this.f16523b;
        rVar.f16508g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f16507f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f16507f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e7) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e7);
                }
            }
            rVar.f16507f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f16503a;
        if (h0Var.f16476w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.f16468a, h0Var.f16469b, h0Var.d, h0Var.f16473n);
            builder.setBufferedPosition(h0Var.f16470c);
            builder.setActions(h0Var.f16471e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.f16474r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.f16465a, g0Var.f16466b, g0Var.f16467c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.f16475s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.f16476w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.f16476w);
    }

    public int M(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16523b;
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
            i10 = ((k6.e) this.f16524c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public boolean a(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.a(float):boolean");
    }

    @Override
    public void b(s3 s3Var, View view) {
        ji.r rVar = (ji.r) this.f16524c;
        n70 n70Var = new n70(rVar, (f6) this.f16523b, view, false, false, true);
        n70Var.Q = true;
        rVar.H = j4.c(n70Var, rVar.f28780b.f31306f0, rVar.getContext(), (f6) this.f16523b, s3Var, true);
    }

    @Override
    public void c() {
        ((le.k) this.f16523b).c();
    }

    @Override
    public void d(u3 u3Var, View view) {
        ji.r rVar = (ji.r) this.f16524c;
        n70 n70Var = new n70(rVar, (f6) this.f16523b, view, false, false, true);
        n70Var.Q = true;
        n2 n2Var = rVar.f28780b.f31306f0;
        rVar.getContext();
        rVar.H = j4.b(n70Var, n2Var, u3Var, true);
    }

    @Override
    public void e(int i10) {
        ji.r.O((ji.r) this.f16524c, 74, i10);
    }

    @Override
    public void f() {
        int i10;
        ji.r rVar = (ji.r) this.f16524c;
        v3 v3Var = rVar.f14159r;
        a4 a4Var = rVar.f14160s;
        if (a4Var != null) {
            i3 i3Var = v3Var.f14285n3;
            if (i3Var != null && i3Var.y() && v3Var.B4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (a4Var.f13789a0 == 2) {
                a4Var.f13791b0 = i10;
            } else {
                a4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.W();
            }
        }
        rVar.Z();
    }

    @Override
    public c3.h g(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.f16524c;
        vVar.G(min);
        pVar.b(0, min, vVar.f8817a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.f8818b, vVar.f8817a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.f16523b).b(c10);
                    if (b10 > j3) {
                        if (j10 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.f8818b);
                    } else {
                        j10 = b10;
                        i11 = vVar.f8818b;
                    }
                }
                int i12 = vVar.f8819c;
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
                            if (h3.a.a(vVar.f8818b, vVar.f8817a) == 443) {
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
                                int a2 = h3.a.a(vVar.f8818b, vVar.f8817a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.f8819c, vVar.f8818b + vVar.D()));
                            }
                        }
                    }
                }
                i10 = vVar.f8818b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new c3.h(-2, j10, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public Object mo28get() {
        return new m5.d((Context) ((l.d) this.f16523b).f15098b, (m2.t) ((u4) this.f16524c).mo28get());
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
    public void l() {
        a4 a4Var = ((ji.r) this.f16524c).f14160s;
        if (a4Var != null) {
            int i10 = a4Var.f13789a0;
            if (i10 == 2) {
                i10 = 0;
            }
            a4Var.f13791b0 = i10;
            a4Var.e(false, false);
            a4Var.f(2, true);
        }
    }

    @Override
    public void m(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f16523b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    @Override
    public void n() {
        ji.r rVar = (ji.r) this.f16524c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.f28780b.X1(rVar, 0);
        }
        rVar.a0();
        ji.r.K(rVar);
    }

    @Override
    public void o(int i10) {
        ji.r rVar = (ji.r) this.f16524c;
        rVar.f28780b.X1(rVar, i10);
        rVar.a0();
        ji.r.K(rVar);
    }

    @Override
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.f16523b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16524c;
        synchronized (eVar.f348f) {
            eVar.f347e.remove(taskCompletionSource);
        }
    }

    @Override
    public void onContentChanged() {
        ji.r rVar = (ji.r) this.f16524c;
        a4 a4Var = rVar.f14160s;
        if (a4Var != null) {
            a4Var.setSendLoading(rVar.f14159r.l3());
        }
        rVar.V(true);
        rVar.Y();
        ji.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p(ji.a aVar) {
        ji.r rVar = (ji.r) this.f16524c;
        vi viVar = rVar.f28780b;
        n2 n2Var = viVar.f31306f0;
        if (n2Var != null && aVar != null && (aVar.f13758b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            vi viVar2 = new vi(rVar.getContext(), viVar.f31306f0, false, false, false, null);
            viVar2.Z1 = new rb.a(11);
            viVar2.P = true;
            viVar2.f31364x1.setVisibility(8);
            viVar2.f31351t2 = new androidx.car.app.utils.a(rVar, aVar, viVar2, 10);
            viVar2.r1();
            viVar2.show();
        }
    }

    @Override
    public void q() {
        ((le.k) this.f16523b).e((le.l) this.f16524c);
    }

    @Override
    public void r() {
        a4 a4Var = ((ji.r) this.f16524c).f14160s;
        if (a4Var != null) {
            int i10 = 0;
            a4Var.e(false, true);
            int i11 = a4Var.f13791b0;
            if (i11 != 2) {
                i10 = i11;
            }
            a4Var.f(i10, true);
        }
    }

    @Override
    public void s(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.f16524c;
        if (((g6.n) this.f16523b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f10427i)};
                g6.b bVar = mVar.f10447a;
                Log.w(bVar.f10414a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.f295b).f8910i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.f16523b).s(str, j3, i11, obj, j10, j11);
        }
    }

    @Override
    public n70 t(View view) {
        ji.r rVar = (ji.r) this.f16524c;
        n70 n70Var = new n70(rVar, (f6) this.f16523b, view, false, false, true);
        rVar.H = n70Var;
        return n70Var;
    }

    public String toString() {
        switch (this.f16522a) {
            case 28:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16524c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16523b;
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
        ji.r rVar = (ji.r) this.f16524c;
        rVar.X();
        rVar.Y();
    }

    @Override
    public void v(h1 h1Var, boolean z10) {
        ((ji.r) this.f16524c).f28780b.t1(h1Var, z10);
    }

    @Override
    public void w() {
        e2.v vVar = (e2.v) this.f16524c;
        byte[] bArr = e2.d0.f8766b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override
    public void x(g6 g6Var, String str) {
        ji.r rVar = (ji.r) this.f16524c;
        if (rVar.v == null) {
            f6 f6Var = (f6) this.f16523b;
            rVar.v = new p3(new ah.i0(20, this, f6Var), f6Var);
        }
        rVar.v.d(g6Var, str);
    }

    public void y(Object obj, String str) {
        ((ArrayList) this.f16523b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    @Override
    public java.lang.Object z(ce.c r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.z(ce.c, kd.c):java.lang.Object");
    }

    public y(int i10, Object obj, boolean z10) {
        this.f16522a = i10;
        this.f16523b = obj;
    }

    public y(int i10, boolean z10) {
        this.f16522a = i10;
    }

    public y(Object obj, int i10) {
        this.f16522a = i10;
        this.f16523b = obj;
        this.f16524c = null;
    }

    public y(Object obj, Object obj2, boolean z10, int i10) {
        this.f16522a = i10;
        this.f16524c = obj;
        this.f16523b = obj2;
    }

    public y(int i10) {
        this.f16522a = i10;
        switch (i10) {
            case 15:
                this.f16523b = new HashMap();
                return;
            case 27:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f16523b = byteArrayOutputStream;
                this.f16524c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f16523b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f16524c = new ReferenceQueue();
                return;
        }
    }

    public y(IBinder iBinder) {
        this.f16522a = 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f16524c = new j6.f(iBinder);
            this.f16523b = null;
            return;
        }
        this.f16523b = new Messenger(iBinder);
        this.f16524c = null;
    }

    public y(Object obj) {
        this.f16522a = 28;
        this.f16524c = obj;
        this.f16523b = new ArrayList();
    }

    public y(m6.a aVar) {
        this.f16522a = 13;
        this.f16523b = aVar == null ? null : aVar.f16153b;
    }

    @Override
    public void k() {
    }

    public y(k6.e eVar) {
        this.f16522a = 29;
        this.f16523b = new SparseIntArray();
        n6.l.h(eVar);
        this.f16524c = eVar;
    }

    public y(ea.a[] aVarArr) {
        this.f16522a = 12;
        this.f16523b = aVarArr;
        this.f16524c = new t7.u(7);
    }

    @Override
    public void h(boolean z10) {
    }

    public y(e2.b0 b0Var) {
        this.f16522a = 19;
        this.f16523b = b0Var;
        this.f16524c = new e2.v();
    }

    public y(Handler handler, k2.j jVar) {
        this.f16522a = 22;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f16523b = handler;
        this.f16524c = jVar;
    }

    public y(Animator animator) {
        this.f16522a = 4;
        this.f16523b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f16524c = animatorSet;
        animatorSet.play(animator);
    }

    public y(a3.f fVar) {
        this.f16522a = 1;
        this.f16524c = fVar;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f16522a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f43946b;
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
                this.f16523b = new r(context, str, bundle);
            } else if (i11 >= 28) {
                this.f16523b = new r(context, str, bundle);
            } else if (i11 >= 22) {
                this.f16523b = new r(context, str, bundle);
            } else {
                this.f16523b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            K(new p(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.f16523b).f16503a.setMediaButtonReceiver(pendingIntent);
            this.f16524c = new k2.g0(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public y(androidx.emoji2.text.w wVar) {
        this.f16522a = 6;
        this.f16523b = wVar;
        this.f16524c = new AtomicBoolean(false);
    }
}
