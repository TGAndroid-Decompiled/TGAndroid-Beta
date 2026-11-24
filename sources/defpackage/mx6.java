package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public class mx6 implements ma6, g22, q5b, u29, u78 {
    public static int e;
    public static volatile mx6 f;
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object h = new Object();
    public static final iz2 n = new iz2((byte) 0);
    public static final sa r = new sa((byte) 29);
    public static final c13 s = new Object();
    public static final byte[] w = new byte[0];
    public static final ha6 x = new ha6(0, -9223372036854775807L);
    public static final ha6 y = new ha6(2, -9223372036854775807L);
    public static final ha6 E = new ha6(3, -9223372036854775807L);

    public mx6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        zw6 zw6Var;
        Looper mainLooper;
        int i;
        this.a = (byte) 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i2 = jfb.b;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = componentName2;
                    if (componentName == null) {
                        Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = 33554432;
                    } else {
                        i = 0;
                    }
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, i);
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    zw6Var = new zw6(context, str);
                    this.b = zw6Var;
                } else if (i3 >= 28) {
                    zw6Var = new zw6(context, str);
                    this.b = zw6Var;
                } else {
                    zw6Var = new zw6(context, str);
                    this.b = zw6Var;
                }
                zw6 zw6Var2 = zw6Var;
                if (Looper.myLooper() != null) {
                    mainLooper = Looper.myLooper();
                } else {
                    mainLooper = Looper.getMainLooper();
                }
                o0(new yw6((byte) 1), new Handler(mainLooper));
                zw6Var.a.setMediaButtonReceiver(pendingIntent);
                this.c = new wm4(context, zw6Var2.c);
                if (e == 0) {
                    e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            u36.j("tag must not be null or empty");
            throw null;
        }
        u36.j("context must not be null");
        throw null;
    }

    public static Bundle A0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        D(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void D(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(mx6.class.getClassLoader());
        }
    }

    public static mx6 P(Context context) {
        if (f == null) {
            synchronized (h) {
                if (f == null) {
                    f = new mx6(context);
                }
            }
        }
        return f;
    }

    public static void d0(jd4 jd4Var, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                jd4Var.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    public static void k0(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final void w() {
        if (!((Boolean) new b13(0, s, c13.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 0).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void x() {
        if (!((Boolean) new b13(0, s, c13.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 1).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static pb3 y(us6 us6Var) {
        String uri;
        boolean z;
        boolean z2;
        yh4 yh4Var = new yh4((byte) 5);
        byte[] bArr = null;
        yh4Var.d = null;
        Uri uri2 = us6Var.b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z3 = us6Var.f;
        ?? obj = new Object();
        if (z3 && TextUtils.isEmpty(uri)) {
            z = false;
        } else {
            z = true;
        }
        jte.f(z);
        obj.b = yh4Var;
        obj.c = uri;
        obj.a = z3;
        obj.d = new HashMap();
        qo5 qo5Var = us6Var.c;
        yo5 yo5Var = qo5Var.a;
        if (yo5Var == null) {
            yo5Var = qo5Var.c();
            qo5Var.a = yo5Var;
        }
        v7c n2 = yo5Var.n();
        while (n2.hasNext()) {
            Map.Entry entry = (Map.Entry) n2.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) obj.d)) {
                ((HashMap) obj.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i = n61.a;
        k4f k4fVar = new k4f((byte) 17);
        UUID uuid = us6Var.a;
        uuid.getClass();
        boolean z4 = us6Var.d;
        boolean z5 = us6Var.e;
        int[] e2 = ine.e(us6Var.g);
        for (int i2 : e2) {
            if (i2 != 2 && i2 != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            jte.f(z2);
        }
        pb3 pb3Var = new pb3(uuid, obj, hashMap, z4, (int[]) e2.clone(), z5, k4fVar);
        byte[] bArr2 = us6Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        jte.p(pb3Var.x.isEmpty());
        pb3Var.L = bArr;
        return pb3Var;
    }

    public final void A(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(2131689503);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pp5.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    public final void B0(boolean z, float f2) {
        a8[] a8VarArr = (a8[]) this.d;
        for (int i = 0; i < a8VarArr.length; i++) {
            if (z && ((i == 0 && Math.abs(f2 - 0.2f) < 0.01f) || ((i == 1 && Math.abs(f2 - 0.5f) < 0.1f) || ((i == 2 && Math.abs(f2 - 1.0f) < 0.1f) || ((i == 3 && Math.abs(f2 - 1.5f) < 0.1f) || (i == 4 && Math.abs(f2 - 2.0f) < 0.1f)))))) {
                a8VarArr[i].d(-9718023, -9718023);
            } else {
                a8VarArr[i].d(-328966, -328966);
            }
        }
        ((v7) this.c).e(true, f2);
    }

    public final Object C(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (yxe.b()) {
            try {
                yxe.a(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                pp5 pp5Var = (pp5) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = pp5Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            C(cls2, hashSet);
                        }
                    }
                }
                obj = pp5Var.b((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public final void C0() {
        boolean z;
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (tx6Var != null) {
            if (Looper.myLooper() == tx6Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
        }
    }

    public final void E(mt2 mt2Var) {
        t76 t76Var;
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (tx6Var == null) {
            return;
        }
        C0();
        do {
            lt2 lt2Var = (lt2) mt2Var.c.poll();
            if (lt2Var == null) {
                mt2Var.f = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            N(mt2Var.a);
            atomicReference.set(lt2Var.run());
            t76Var = (t76) atomicReference.get();
        } while (t76Var.isDone());
        t76Var.b(new co1(this, tx6Var, mt2Var, (byte) 25), fp3.a);
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        int i4;
        u9b u9bVar;
        String str = (String) this.c;
        ks0 ks0Var = (ks0) this.d;
        long j3 = ks0Var.d;
        i22 i22Var = (i22) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof jo6) {
                    g6b l = g6b.l((jo6) next);
                    l.J0 = j3;
                    l.K0 = str;
                    l.z();
                    v9b C = v9b.C(ks0Var.a.getParentActivity(), ks0Var.b);
                    RectF rectF = C.I;
                    WindowManager.LayoutParams layoutParams = C.h;
                    int i5 = C.c;
                    WindowManager windowManager = C.f;
                    if (!C.d) {
                        if (oc7.r1(i5).u2()) {
                            h5.b(i5);
                        } else {
                            C.w0 = j3;
                            C.x0 = str;
                            C.v0 = false;
                            C.e = false;
                            C.C2 = false;
                            if (windowManager != null && (u9bVar = C.n) != null && u9bVar.getParent() == null) {
                                gm.s3(windowManager, C.n, layoutParams);
                                windowManager.addView(C.n, layoutParams);
                                C.f0();
                            }
                            C.L1 = l;
                            l.J0 = j3;
                            l.K0 = str;
                            C.P1 = l.K ? 1 : 0;
                            C.t0.g = false;
                            C.K = false;
                            Point point = gm.q;
                            rectF.set(0.0f, gm.L(100.0f), point.x, gm.L(100.0f) + point.y);
                            C.H = gm.L(8.0f);
                            C.r.c();
                            i9b i9bVar = C.i0;
                            boolean z5 = C.K;
                            if (!z5 && z5) {
                                i4 = -14737633;
                            } else {
                                i4 = 0;
                            }
                            i9bVar.setBackgroundColor(i4);
                            C.r.setTranslationX(0.0f);
                            C.r.setTranslationY(0.0f);
                            C.r.b(0.0f);
                            C.r.setScaleX(1.0f);
                            C.r.setScaleY(1.0f);
                            C.L = 0.0f;
                            gm.e2(C.b);
                            g6b g6bVar = C.L1;
                            if (g6bVar != null) {
                                C.d1.setText(g6bVar.C0);
                            }
                            C.I(1, false);
                            C.k0(-1, false, false);
                            C.c1.b(false, false);
                            C.c1.b(true, true);
                            C.d(1.0f, true, new f8b(C, (byte) 6));
                            C.a();
                        }
                    }
                    gm.d3(new vr0(i22Var, (byte) 0), 400L);
                }
            }
        }
    }

    public final void F(final sw6 sw6Var) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            final ne8 ne8Var = mt2Var.g;
            mt2Var.g = ne8.b;
            mt2Var.c.add(new lt2(sw6Var, ne8Var) {
                public final sw6 b;

                @Override
                public final t76 run() {
                    tx6 tx6Var = (tx6) ((WeakReference) mx6.this.d).get();
                    if (tx6Var != null) {
                        tx6Var.n(this.b);
                    }
                    return ao5.b;
                }
            });
            if (mt2Var.f) {
                return;
            }
            mt2Var.f = true;
            E(mt2Var);
        }
    }

    public final is3 G(bt6 bt6Var) {
        pb3 pb3Var;
        bt6Var.b.getClass();
        us6 us6Var = bt6Var.b.c;
        if (us6Var == null) {
            return is3.u;
        }
        synchronized (this.b) {
            if (!us6Var.equals((us6) this.c)) {
                this.c = us6Var;
                this.d = y(us6Var);
            }
            pb3Var = (pb3) this.d;
            pb3Var.getClass();
        }
        return pb3Var;
    }

    public final Object H(Bitmap bitmap) {
        sk0 sk0Var = (sk0) this.b;
        if (sk0Var.a(bitmap)) {
            this.d = ((xk0) this.c).b(bitmap);
            sk0Var.b(bitmap);
        }
        return this.d;
    }

    public qk0 J() {
        int[] iArr;
        gi6 gi6Var = (gi6) this.b;
        int i = gi6Var.a;
        int i2 = gi6Var.b;
        qk0 qk0Var = new qk0(i, i2);
        if (((byte[]) this.c).length < i) {
            this.c = new byte[i];
        }
        int i3 = 0;
        while (true) {
            iArr = (int[]) this.d;
            if (i3 >= 32) {
                break;
            }
            iArr[i3] = 0;
            i3++;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            byte[] b = gi6Var.b((i2 * i4) / 5, (byte[]) this.c);
            int i5 = (i << 2) / 5;
            for (int i6 = i / 5; i6 < i5; i6++) {
                int i7 = (b[i6] & 255) >> 3;
                iArr[i7] = iArr[i7] + 1;
            }
        }
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i8) {
                i10 = i11;
                i8 = i12;
            }
            if (i12 > i9) {
                i9 = i12;
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 - i10;
            int i17 = iArr[i15] * i16 * i16;
            if (i17 > i14) {
                i13 = i15;
                i14 = i17;
            }
        }
        if (i10 <= i13) {
            int i18 = i10;
            i10 = i13;
            i13 = i18;
        }
        if (i10 - i13 > length / 16) {
            int i19 = i10 - 1;
            int i20 = -1;
            int i21 = i19;
            while (i19 > i13) {
                int i22 = i19 - i13;
                int i23 = (i9 - iArr[i19]) * (i10 - i19) * i22 * i22;
                if (i23 > i20) {
                    i21 = i19;
                    i20 = i23;
                }
                i19--;
            }
            int i24 = i21 << 3;
            byte[] a = gi6Var.a();
            for (int i25 = 0; i25 < i2; i25++) {
                int i26 = i25 * i;
                for (int i27 = 0; i27 < i; i27++) {
                    if ((a[i26 + i27] & 255) < i24) {
                        qk0Var.c(i27, i25);
                    }
                }
            }
            return qk0Var;
        }
        throw xl7.a();
    }

    public final View K(int i) {
        return ((RecyclerView) ((ai4) this.b).b).getChildAt(Q(i));
    }

    @Override
    public final boolean K0() {
        return true;
    }

    public final int L() {
        return ((RecyclerView) ((ai4) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public final mo5 M() {
        C0();
        return mo5.q(((qt) this.b).values());
    }

    public final sw6 N(Object obj) {
        C0();
        return (sw6) ((qt) this.b).get(obj);
    }

    public final long O() {
        vb3 vb3Var = (vb3) this.d;
        if (vb3Var != null) {
            return vb3Var.d;
        }
        return -1L;
    }

    public final int Q(int i) {
        vh2 vh2Var = (vh2) this.c;
        if (i >= 0) {
            int childCount = ((RecyclerView) ((ai4) this.b).b).getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                int n2 = i - (i2 - vh2Var.n(i2));
                if (n2 == 0) {
                    while (vh2Var.x(i2)) {
                        i2++;
                    }
                    return i2;
                }
                i2 += n2;
            }
            return -1;
        }
        return -1;
    }

    public final uz0 R(sw6 sw6Var) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            return mt2Var.b;
        }
        return null;
    }

    public final View S(int i) {
        return ((RecyclerView) ((ai4) this.b).b).getChildAt(i);
    }

    public final int T() {
        return ((RecyclerView) ((ai4) this.b).b).getChildCount();
    }

    public final boolean U() {
        if (((IOException) this.d) != null) {
            return true;
        }
        return false;
    }

    public final void V(View view) {
        ((ArrayList) this.d).add(view);
        ai4 ai4Var = (ai4) this.b;
        u69 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) ai4Var.b;
            int i = U.s;
            if (i != -1) {
                U.r = i;
            } else {
                WeakHashMap weakHashMap = kfc.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.d0()) {
                U.s = 4;
                recyclerView.L0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = kfc.a;
            view2.setImportantForAccessibility(4);
        }
    }

    public final void W(defpackage.s73 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.uu8 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx6.W(s73, android.net.Uri, java.util.Map, long, long, uu8):void");
    }

    public final boolean X(sw6 sw6Var) {
        C0();
        if (((qt) this.c).get(sw6Var) != null) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if (((ia6) this.c) != null) {
            return true;
        }
        return false;
    }

    public final boolean Z(sw6 sw6Var, int i) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
        if (mt2Var != null && mt2Var.e.a(i) && tx6Var != null) {
            tx6Var.t();
            if (tx6Var.t.q().a(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        kd1 kd1Var = (kd1) this.c;
        if (kd1Var.getParent() == null) {
            ((gd1) this.d).b.i();
        } else {
            kd1Var.setSegments(arrayList);
        }
    }

    public final boolean a0(sw6 sw6Var, int i) {
        boolean z;
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            s7a s7aVar = mt2Var.d;
            s7aVar.getClass();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            jte.e("Use contains(Command) for custom command", z);
            for (r7a r7aVar : s7aVar.a) {
                if (r7aVar.a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    public final void b(Object obj, sw6 sw6Var, s7a s7aVar, ne8 ne8Var) {
        qt qtVar = (qt) this.c;
        C0();
        sw6 N = N(obj);
        if (N == null) {
            ((qt) this.b).put(obj, sw6Var);
            bqb bqbVar = bqb.a;
            g0c g0cVar = g0c.b;
            tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
            if (tx6Var != null) {
                tx6Var.t();
                cf8 cf8Var = tx6Var.t;
                bqbVar = cf8Var.T0();
                if (cf8Var.m0(30)) {
                    g0cVar = cf8Var.f0();
                }
            }
            ?? obj2 = new Object();
            obj2.c = new Object();
            obj2.d = new cka(0);
            qtVar.put(sw6Var, new mt2(obj, obj2, s7aVar, ne8Var, bqbVar, g0cVar));
            return;
        }
        mt2 mt2Var = (mt2) qtVar.get(N);
        mt2Var.getClass();
        mt2Var.d = s7aVar;
        mt2Var.e = ne8Var;
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final boolean c0(sw6 sw6Var, r7a r7aVar) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            yo5 yo5Var = mt2Var.d.a;
            r7aVar.getClass();
            if (yo5Var.contains(r7aVar) || un2.i(r7aVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        IOException iOException = (IOException) this.d;
        if (iOException == null) {
            ia6 ia6Var = (ia6) this.c;
            if (ia6Var != null) {
                int i = ia6Var.a;
                IOException iOException2 = ia6Var.e;
                if (iOException2 != null && ia6Var.f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void e0(ka6 ka6Var) {
        g89 g89Var = (g89) this.b;
        ia6 ia6Var = (ia6) this.c;
        if (ia6Var != null) {
            ia6Var.a(true);
        }
        if (ka6Var != null) {
            g89Var.execute(new o04(ka6Var, (byte) 22));
        }
        u36 u36Var = g89Var.b;
        g89Var.a.shutdown();
    }

    @Override
    public final void f(long j, long j2, boolean z) {
        ((jd4) this.b).f(j, j2, z);
    }

    @Override
    public final void g(android.view.View r13, defpackage.k39 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx6.g(android.view.View, k39, boolean, boolean):void");
    }

    public final void g0(mk mkVar) {
        we8 we8Var = (we8) ((HashMap) this.b).remove(mkVar);
        we8Var.getClass();
        wc3 wc3Var = (wc3) ((xc3) this.d).o.get(we8Var);
        if (wc3Var != null) {
            synchronized (wc3Var) {
                wc3Var.d--;
            }
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    public final void h0() {
        RecyclerView recyclerView;
        int i;
        ((vh2) this.c).A();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) ((ai4) this.b).b;
            if (size < 0) {
                break;
            }
            u69 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i2 = U.r;
                if (recyclerView.d0()) {
                    U.s = i2;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = kfc.a;
                    view.setImportantForAccessibility(i2);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public final void i0(sw6 sw6Var) {
        ArrayList arrayList;
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).remove(sw6Var);
        if (mt2Var != null) {
            ((qt) this.b).remove(mt2Var.a);
            uz0 uz0Var = mt2Var.b;
            synchronized (uz0Var.c) {
                uz0Var.b = true;
                arrayList = new ArrayList(((qt) uz0Var.d).values());
                ((qt) uz0Var.d).clear();
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((t6a) obj).o();
            }
            tx6 tx6Var = (tx6) ((WeakReference) this.d).get();
            if (tx6Var != null && !tx6Var.i()) {
                hac.X(tx6Var.l, new jt2(tx6Var, sw6Var, (byte) 0));
            }
        }
    }

    @Override
    public final void j() {
        ((p42) this.c).R.y();
    }

    public final void j0(mi2 mi2Var) {
        if (((ji2) this.b) != null) {
            for (int i = 0; i < mi2Var.a.size(); i++) {
                ji2 ji2Var = (ji2) this.b;
                ji2Var.h.remove(mi2Var.c(i).d);
                ji2Var.g();
            }
        }
    }

    @Override
    public final void k(int i, boolean z, boolean z2) {
        String str;
        if (!z) {
            p42 p42Var = (p42) this.c;
            HashMap hashMap = (HashMap) this.b;
            ArrayList arrayList = (ArrayList) this.d;
            i22 i22Var = p42Var.b;
            if (!hashMap.isEmpty() && p42Var.R != null && !p42Var.L) {
                p42Var.L = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj = hashMap.get(arrayList.get(i2));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof jo6) {
                        jo6 jo6Var = (jo6) obj;
                        String str2 = jo6Var.h;
                        if (str2 != null) {
                            obj2.c = str2;
                        } else {
                            obj2.c = jo6Var.I;
                        }
                        obj2.e = jo6Var.c;
                        obj2.f = jo6Var.g;
                        obj2.k = jo6Var.s;
                        obj2.o = jo6Var.b;
                        CharSequence charSequence = jo6Var.a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.i = jo6Var.n;
                        obj2.j = jo6Var.r;
                        obj2.h = jo6Var.x;
                    }
                }
                ik.X(i22Var.G3, i22Var.V0(), arrayList2.size() + i22Var.R0(), new b42(p42Var, i, arrayList2, z2, (byte) 0));
            }
        }
    }

    @Override
    public final boolean l() {
        return false;
    }

    public final void l0(boolean z) {
        ((zw6) this.b).a.setActive(z);
        Iterator it = ((ArrayList) this.d).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw kt6.l(it);
    }

    public final void m0(String str) {
        if (str != null) {
            this.b = str;
        } else {
            gxc.d("Null backendName");
        }
    }

    @Override
    public final void n() {
        gd1 gd1Var = (gd1) this.d;
        fd1 fd1Var = gd1Var.a;
        jd4 jd4Var = gd1Var.c;
        if (jd4Var != null) {
            jd4Var.f = null;
            u31 u31Var = (u31) jd4Var.g;
            if (u31Var != null) {
                u31Var.b();
                jd4Var.g = null;
            }
            gd1Var.c = null;
        }
        kd1 kd1Var = (kd1) this.c;
        if (kd1Var.getParent() != null) {
            fd1Var.S(kd1Var);
        }
        new c41(fd1Var.q(), fd1Var.t()).Q(2131624012, 36, jb6.M0(2131744395, null)).k(true);
    }

    public final void o0(yw6 yw6Var, Handler handler) {
        zw6 zw6Var = (zw6) this.b;
        if (yw6Var == null) {
            zw6Var.d(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        zw6Var.d(yw6Var, handler);
    }

    public final void p(sw6 sw6Var, int i, lt2 lt2Var) {
        C0();
        mt2 mt2Var = (mt2) ((qt) this.c).get(sw6Var);
        if (mt2Var != null) {
            ne8 ne8Var = mt2Var.g;
            ne8Var.getClass();
            me8 me8Var = new me8(ne8Var);
            me8Var.a.b(i);
            mt2Var.g = me8Var.b();
            mt2Var.c.add(lt2Var);
        }
    }

    public final void p0(gi2 gi2Var) {
        mi2 mi2Var;
        mi2 mi2Var2 = (mi2) this.c;
        if (mi2Var2 != null && ((gi2) this.d) == null && gi2Var != null) {
            q(mi2Var2);
        }
        if (((gi2) this.d) != null && (mi2Var = (mi2) this.c) != null && gi2Var == null) {
            j0(mi2Var);
        }
        gi2 gi2Var2 = (gi2) this.d;
        if (gi2Var2 != null) {
            k89 k89Var = gi2Var2.a;
            ite.e("Must be called from the main thread.");
            k89Var.i.remove(gi2Var2);
        }
        if (gi2Var != null) {
            gi2Var.a.p(gi2Var);
            mi2 mi2Var3 = (mi2) this.c;
            if (mi2Var3 != null) {
                gi2Var.d = mi2Var3;
                gi2Var.g = 0;
                gi2Var.h = 0;
                gi2Var.p();
            }
        }
        this.d = gi2Var;
    }

    public final void q(mi2 mi2Var) {
        if (((ji2) this.b) == null) {
            this.b = new ji2();
        }
        for (int i = 0; i < mi2Var.a.size(); i++) {
            ji2 ji2Var = (ji2) this.b;
            li2 c = mi2Var.c(i);
            ji2Var.h.put(c.d, c);
            ji2Var.g();
        }
    }

    public final void q0(MediaMetadataCompat mediaMetadataCompat) {
        zw6 zw6Var = (zw6) this.b;
        zw6Var.h = mediaMetadataCompat;
        MediaSession mediaSession = zw6Var.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public final void r(int i, View view, boolean z) {
        int Q;
        RecyclerView recyclerView = (RecyclerView) ((ai4) this.b).b;
        if (i < 0) {
            Q = recyclerView.getChildCount();
        } else {
            Q = Q(i);
        }
        ((vh2) this.c).y(Q, z);
        if (z) {
            V(view);
        }
        recyclerView.addView(view, Q);
        u69 U = RecyclerView.U(view);
        recyclerView.h0(view);
        y59 y59Var = recyclerView.x;
        if (y59Var != null && U != null) {
            y59Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h69) recyclerView.Q.get(size)).c();
            }
        }
    }

    public final void r0(android.support.v4.media.session.PlaybackStateCompat r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx6.r0(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    @Override
    public final boolean s() {
        return false;
    }

    public final void s0(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) obj;
                if (mediaSessionCompat$QueueItem != null) {
                    long j = mediaSessionCompat$QueueItem.b;
                    if (hashSet.contains(Long.valueOf(j))) {
                        Log.e("MediaSessionCompat", kt6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(j));
                } else {
                    u36.j("queue shouldn't have null items");
                    return;
                }
            }
        }
        zw6 zw6Var = (zw6) this.b;
        MediaSession mediaSession = zw6Var.a;
        zw6Var.g = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) obj2;
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.c;
            if (queueItem == null) {
                queueItem = ix6.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void t(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int Q;
        RecyclerView recyclerView = (RecyclerView) ((ai4) this.b).b;
        if (i < 0) {
            Q = recyclerView.getChildCount();
        } else {
            Q = Q(i);
        }
        ((vh2) this.c).y(Q, z);
        if (z) {
            V(view);
        }
        u69 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        RecyclerView.c(recyclerView, view, Q, layoutParams);
    }

    public final void t0(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx6.t0(int):void");
    }

    public final String toString() {
        switch (this.a) {
            case 21:
                return ((vh2) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public final rb0 u() {
        String str;
        if (((String) this.b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((fl8) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new rb0((String) this.b, (byte[]) this.c, (fl8) this.d);
        }
        dq9.m("Missing required properties:".concat(str));
        return null;
    }

    public final void u0(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx6.u0(int):void");
    }

    public final void v() {
        ia6 ia6Var = (ia6) this.c;
        ia6Var.getClass();
        ia6Var.a(false);
    }

    public final void v0(ja6 ja6Var, ga6 ga6Var, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        ia6 ia6Var = new ia6(this, myLooper, ja6Var, ga6Var, i, SystemClock.elapsedRealtime());
        if (((ia6) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        this.c = ia6Var;
        ia6Var.b();
    }

    public final FileOutputStream w0() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            k0(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Failed to create new file " + file, e2);
                }
            }
            zg.e(file, "Failed to create directory for ");
            return null;
        }
    }

    public final synchronized void x0() {
        ((xc3) this.d).c.E();
    }

    public final void y0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ai4 ai4Var = (ai4) this.b;
            u69 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) ai4Var.b;
                int i = U.r;
                if (recyclerView.d0()) {
                    U.s = i;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = kfc.a;
                    view2.setImportantForAccessibility(i);
                }
                U.r = 0;
            }
        }
    }

    public final void z(int i) {
        u69 U;
        int Q = Q(i);
        ((vh2) this.c).z(Q);
        RecyclerView recyclerView = (RecyclerView) ((ai4) this.b).b;
        View childAt = recyclerView.getChildAt(Q);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.d(recyclerView, Q);
    }

    @Override
    public final void I() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void i(Editable editable) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    public mx6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public mx6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public mx6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public mx6(CastDevice castDevice, vjf vjfVar) {
        this.a = (byte) 15;
        ite.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = vjfVar;
    }

    public mx6(xk0 xk0Var) {
        this.a = (byte) 9;
        this.b = new sk0();
        this.c = xk0Var;
    }

    public mx6(ExecutorService executorService, ExecutorService executorService2) {
        this.a = (byte) 3;
        executorService.getClass();
        executorService2.getClass();
        this.b = new a13(executorService);
        this.c = new a13(executorService);
        Tasks.forResult(null);
        this.d = new a13(executorService2);
    }

    public mx6(gi6 gi6Var) {
        this.a = (byte) 4;
        this.b = gi6Var;
        this.c = w;
        this.d = new int[32];
    }

    public mx6() {
        this.a = (byte) 28;
        this.b = new Object();
    }

    public mx6(ai4 ai4Var) {
        this.a = (byte) 21;
        this.b = ai4Var;
        this.c = new vh2((byte) 0);
        this.d = new ArrayList();
    }

    public mx6(jd4 jd4Var) {
        this.a = (byte) 2;
        this.c = null;
        this.d = null;
        this.b = jd4Var;
    }

    public mx6(File file) {
        this.a = (byte) 7;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public mx6(tx6 tx6Var) {
        this.a = (byte) 25;
        this.b = new cka(0);
        this.c = new cka(0);
        this.d = new WeakReference(tx6Var);
    }

    public mx6(Context context) {
        this.a = (byte) 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public mx6(byte[] bArr, t76 t76Var) {
        this.a = (byte) 12;
        this.b = bArr;
        this.c = null;
        this.d = t76Var;
    }

    public mx6(jt6 jt6Var, t76 t76Var) {
        this.a = (byte) 12;
        this.b = jt6Var.k;
        this.c = jt6Var.n;
        this.d = t76Var;
    }

    public mx6(p30[] p30VarArr) {
        this.a = (byte) 27;
        ?? cg0Var = new cg0();
        cg0Var.m = 0;
        cg0Var.o = 0;
        cg0Var.p = 0;
        byte[] bArr = hac.b;
        cg0Var.n = bArr;
        cg0Var.q = bArr;
        ?? obj = new Object();
        obj.b = 1.0f;
        obj.c = 1.0f;
        l30 l30Var = l30.e;
        obj.d = l30Var;
        obj.e = l30Var;
        obj.f = l30Var;
        obj.g = l30Var;
        ByteBuffer byteBuffer = p30.a;
        obj.j = byteBuffer;
        obj.k = byteBuffer;
        p30[] p30VarArr2 = new p30[p30VarArr.length + 2];
        this.b = p30VarArr2;
        System.arraycopy(p30VarArr, 0, p30VarArr2, 0, p30VarArr.length);
        this.c = cg0Var;
        this.d = obj;
        p30VarArr2[p30VarArr.length] = cg0Var;
        p30VarArr2[p30VarArr.length + 1] = obj;
    }

    public mx6(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx6.<init>(java.lang.String):void");
    }

    public mx6(sz4 sz4Var) {
        this.a = (byte) 6;
        this.b = sz4Var;
        this.c = Choreographer.getInstance();
        this.d = new no(this, (byte) 0);
    }

    public mx6(p42 p42Var, HashMap hashMap, ArrayList arrayList) {
        this.a = (byte) 19;
        this.c = p42Var;
        this.b = hashMap;
        this.d = arrayList;
    }

    public mx6(byte b) {
        this.a = b;
    }

    public mx6(xc3 xc3Var, we8 we8Var) {
        this.a = (byte) 29;
        this.d = xc3Var;
        this.b = new HashMap();
        this.c = we8Var;
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
