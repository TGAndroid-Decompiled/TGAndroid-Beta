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
public class mv6 implements n86, v02, p3b, s09, s58 {
    public static int e;
    public static volatile mv6 f;
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object h = new Object();
    public static final yx2 n = new yx2((byte) 0);
    public static final sa r = new sa((byte) 29);
    public static final rz2 s = new Object();
    public static final byte[] w = new byte[0];
    public static final i86 x = new i86(0, -9223372036854775807L);
    public static final i86 y = new i86(2, -9223372036854775807L);
    public static final i86 E = new i86(3, -9223372036854775807L);

    public mv6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        zu6 zu6Var;
        Looper mainLooper;
        int i;
        this.a = (byte) 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i2 = idb.b;
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
                    zu6Var = new zu6(context, str);
                    this.b = zu6Var;
                } else if (i3 >= 28) {
                    zu6Var = new zu6(context, str);
                    this.b = zu6Var;
                } else {
                    zu6Var = new zu6(context, str);
                    this.b = zu6Var;
                }
                zu6 zu6Var2 = zu6Var;
                if (Looper.myLooper() != null) {
                    mainLooper = Looper.myLooper();
                } else {
                    mainLooper = Looper.getMainLooper();
                }
                k0(new yu6((byte) 1), new Handler(mainLooper));
                zu6Var.a.setMediaButtonReceiver(pendingIntent);
                this.c = new wk4(context, zu6Var2.c);
                if (e == 0) {
                    e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            w26.j("tag must not be null or empty");
            throw null;
        }
        w26.j("context must not be null");
        throw null;
    }

    public static void B(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(mv6.class.getClassLoader());
        }
    }

    public static mv6 N(Context context) {
        if (f == null) {
            synchronized (h) {
                if (f == null) {
                    f = new mv6(context);
                }
            }
        }
        return f;
    }

    public static void a0(jb4 jb4Var, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                jb4Var.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    public static void h0(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final void s() {
        if (!((Boolean) new qz2(0, s, rz2.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 0).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void t() {
        if (!((Boolean) new qz2(0, s, rz2.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 1).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static da3 v(uq6 uq6Var) {
        String uri;
        boolean z;
        boolean z2;
        xf4 xf4Var = new xf4((byte) 5);
        byte[] bArr = null;
        xf4Var.d = null;
        Uri uri2 = uq6Var.b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z3 = uq6Var.f;
        ?? obj = new Object();
        if (z3 && TextUtils.isEmpty(uri)) {
            z = false;
        } else {
            z = true;
        }
        gre.f(z);
        obj.b = xf4Var;
        obj.c = uri;
        obj.a = z3;
        obj.d = new HashMap();
        qm5 qm5Var = uq6Var.c;
        ym5 ym5Var = qm5Var.a;
        if (ym5Var == null) {
            ym5Var = qm5Var.c();
            qm5Var.a = ym5Var;
        }
        v5c n2 = ym5Var.n();
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
        int i = g51.a;
        i2f i2fVar = new i2f((byte) 17);
        UUID uuid = uq6Var.a;
        uuid.getClass();
        boolean z4 = uq6Var.d;
        boolean z5 = uq6Var.e;
        int[] e2 = gle.e(uq6Var.g);
        for (int i2 : e2) {
            if (i2 != 2 && i2 != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            gre.f(z2);
        }
        da3 da3Var = new da3(uuid, obj, hashMap, z4, (int[]) e2.clone(), z5, i2fVar);
        byte[] bArr2 = uq6Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        gre.p(da3Var.x.isEmpty());
        da3Var.L = bArr;
        return da3Var;
    }

    public static Bundle v0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        B(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final Object A(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (wve.b()) {
            try {
                wve.a(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                pn5 pn5Var = (pn5) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = pn5Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            A(cls2, hashSet);
                        }
                    }
                }
                obj = pn5Var.b((Context) this.d);
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

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        int i4;
        s7b s7bVar;
        String str = (String) this.c;
        kr0 kr0Var = (kr0) this.d;
        long j3 = kr0Var.d;
        x02 x02Var = (x02) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof jm6) {
                    f4b l = f4b.l((jm6) next);
                    l.J0 = j3;
                    l.K0 = str;
                    l.z();
                    t7b C = t7b.C(kr0Var.a.getParentActivity(), kr0Var.b);
                    RectF rectF = C.I;
                    WindowManager.LayoutParams layoutParams = C.h;
                    int i5 = C.c;
                    WindowManager windowManager = C.f;
                    if (!C.d) {
                        if (na7.q1(i5).t2()) {
                            h5.b(i5);
                        } else {
                            C.w0 = j3;
                            C.x0 = str;
                            C.v0 = false;
                            C.e = false;
                            C.C2 = false;
                            if (windowManager != null && (s7bVar = C.n) != null && s7bVar.getParent() == null) {
                                gl.t3(windowManager, C.n, layoutParams);
                                windowManager.addView(C.n, layoutParams);
                                C.f0();
                            }
                            C.L1 = l;
                            l.J0 = j3;
                            l.K0 = str;
                            C.P1 = l.K ? 1 : 0;
                            C.t0.g = false;
                            C.K = false;
                            Point point = gl.q;
                            rectF.set(0.0f, gl.L(100.0f), point.x, gl.L(100.0f) + point.y);
                            C.H = gl.L(8.0f);
                            C.r.c();
                            g7b g7bVar = C.i0;
                            boolean z5 = C.K;
                            if (!z5 && z5) {
                                i4 = -14737633;
                            } else {
                                i4 = 0;
                            }
                            g7bVar.setBackgroundColor(i4);
                            C.r.setTranslationX(0.0f);
                            C.r.setTranslationY(0.0f);
                            C.r.b(0.0f);
                            C.r.setScaleX(1.0f);
                            C.r.setScaleY(1.0f);
                            C.L = 0.0f;
                            gl.e2(C.b);
                            f4b f4bVar = C.L1;
                            if (f4bVar != null) {
                                C.d1.setText(f4bVar.C0);
                            }
                            C.I(1, false);
                            C.k0(-1, false, false);
                            C.c1.b(false, false);
                            C.c1.b(true, true);
                            C.d(1.0f, true, new d6b(C, (byte) 6));
                            C.a();
                        }
                    }
                    gl.e3(new vq0(x02Var, (byte) 0), 400L);
                }
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D(bs2 bs2Var) {
        t56 t56Var;
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (tv6Var == null) {
            return;
        }
        x0();
        do {
            as2 as2Var = (as2) bs2Var.c.poll();
            if (as2Var == null) {
                bs2Var.f = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            L(bs2Var.a);
            atomicReference.set(as2Var.run());
            t56Var = (t56) atomicReference.get();
        } while (t56Var.isDone());
        t56Var.b(new jn1(this, tv6Var, bs2Var, (byte) 23), vn3.a);
    }

    public final void E(final su6 su6Var) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            final kc8 kc8Var = bs2Var.g;
            bs2Var.g = kc8.b;
            bs2Var.c.add(new as2(su6Var, kc8Var) {
                public final su6 b;

                @Override
                public final t56 run() {
                    tv6 tv6Var = (tv6) ((WeakReference) mv6.this.d).get();
                    if (tv6Var != null) {
                        tv6Var.n(this.b);
                    }
                    return am5.b;
                }
            });
            if (bs2Var.f) {
                return;
            }
            bs2Var.f = true;
            D(bs2Var);
        }
    }

    public final yq3 F(br6 br6Var) {
        da3 da3Var;
        br6Var.b.getClass();
        uq6 uq6Var = br6Var.b.c;
        if (uq6Var == null) {
            return yq3.u;
        }
        synchronized (this.b) {
            if (!uq6Var.equals((uq6) this.c)) {
                this.c = uq6Var;
                this.d = v(uq6Var);
            }
            da3Var = (da3) this.d;
            da3Var.getClass();
        }
        return da3Var;
    }

    public final Object G(Bitmap bitmap) {
        sj0 sj0Var = (sj0) this.b;
        if (sj0Var.a(bitmap)) {
            this.d = ((xj0) this.c).a(bitmap);
            sj0Var.b(bitmap);
        }
        return this.d;
    }

    public qj0 H() {
        int[] iArr;
        gg6 gg6Var = (gg6) this.b;
        int i = gg6Var.a;
        int i2 = gg6Var.b;
        qj0 qj0Var = new qj0(i, i2);
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
            byte[] b = gg6Var.b((i2 * i4) / 5, (byte[]) this.c);
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
            byte[] a = gg6Var.a();
            for (int i25 = 0; i25 < i2; i25++) {
                int i26 = i25 * i;
                for (int i27 = 0; i27 < i; i27++) {
                    if ((a[i26 + i27] & 255) < i24) {
                        qj0Var.c(i27, i25);
                    }
                }
            }
            return qj0Var;
        }
        throw uj7.a();
    }

    public final View I(int i) {
        return ((RecyclerView) ((ln8) this.b).b).getChildAt(O(i));
    }

    public final int J() {
        return ((RecyclerView) ((ln8) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public final mm5 K() {
        x0();
        return mm5.q(((ps) this.b).values());
    }

    public final su6 L(Object obj) {
        x0();
        return (su6) ((ps) this.b).get(obj);
    }

    public final long M() {
        ja3 ja3Var = (ja3) this.d;
        if (ja3Var != null) {
            return ja3Var.d;
        }
        return -1L;
    }

    public final int O(int i) {
        hg2 hg2Var = (hg2) this.c;
        if (i >= 0) {
            int childCount = ((RecyclerView) ((ln8) this.b).b).getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                int s2 = i - (i2 - hg2Var.s(i2));
                if (s2 == 0) {
                    while (hg2Var.x(i2)) {
                        i2++;
                    }
                    return i2;
                }
                i2 += s2;
            }
            return -1;
        }
        return -1;
    }

    public final ny0 P(su6 su6Var) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            return bs2Var.b;
        }
        return null;
    }

    public final View Q(int i) {
        return ((RecyclerView) ((ln8) this.b).b).getChildAt(i);
    }

    public final int R() {
        return ((RecyclerView) ((ln8) this.b).b).getChildCount();
    }

    public final boolean S() {
        if (((IOException) this.d) != null) {
            return true;
        }
        return false;
    }

    public final void T(View view) {
        ((ArrayList) this.d).add(view);
        ln8 ln8Var = (ln8) this.b;
        s49 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) ln8Var.b;
            int i = U.s;
            if (i != -1) {
                U.r = i;
            } else {
                WeakHashMap weakHashMap = jdc.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.d0()) {
                U.s = 4;
                recyclerView.L0.add(U);
                return;
            }
            WeakHashMap weakHashMap2 = jdc.a;
            view2.setImportantForAccessibility(4);
        }
    }

    public final void U(defpackage.g63 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.ts8 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.U(g63, android.net.Uri, java.util.Map, long, long, ts8):void");
    }

    public final boolean V(su6 su6Var) {
        x0();
        if (((ps) this.c).get(su6Var) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean V1() {
        return true;
    }

    public final boolean W() {
        if (((j86) this.c) != null) {
            return true;
        }
        return false;
    }

    public final boolean X(su6 su6Var, int i) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (bs2Var != null && bs2Var.e.a(i) && tv6Var != null) {
            tv6Var.t();
            if (tv6Var.t.q().a(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Y(su6 su6Var, int i) {
        boolean z;
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            q5a q5aVar = bs2Var.d;
            q5aVar.getClass();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            gre.e("Use contains(Command) for custom command", z);
            for (p5a p5aVar : q5aVar.a) {
                if (p5aVar.a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Z(su6 su6Var, p5a p5aVar) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            ym5 ym5Var = bs2Var.d.a;
            p5aVar.getClass();
            if (ym5Var.contains(p5aVar) || hm2.i(p5aVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        cc1 cc1Var = (cc1) this.c;
        if (cc1Var.getParent() == null) {
            ((yb1) this.d).b.i();
        } else {
            cc1Var.setSegments(arrayList);
        }
    }

    @Override
    public final void b() {
        IOException iOException = (IOException) this.d;
        if (iOException == null) {
            j86 j86Var = (j86) this.c;
            if (j86Var != null) {
                int i = j86Var.a;
                IOException iOException2 = j86Var.e;
                if (iOException2 != null && j86Var.f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void b0(l86 l86Var) {
        e69 e69Var = (e69) this.b;
        j86 j86Var = (j86) this.c;
        if (j86Var != null) {
            j86Var.a(true);
        }
        if (l86Var != null) {
            e69Var.execute(new ez3(l86Var, (byte) 22));
        }
        w26 w26Var = e69Var.b;
        e69Var.a.shutdown();
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final void c0(mj mjVar) {
        uc8 uc8Var = (uc8) ((HashMap) this.b).remove(mjVar);
        uc8Var.getClass();
        kb3 kb3Var = (kb3) ((lb3) this.d).o.get(uc8Var);
        if (kb3Var != null) {
            synchronized (kb3Var) {
                kb3Var.d--;
            }
        }
    }

    @Override
    public final void d(long j, long j2, boolean z) {
        ((jb4) this.b).f(j, j2, z);
    }

    public final void d0() {
        RecyclerView recyclerView;
        int i;
        ((hg2) this.c).A();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) ((ln8) this.b).b;
            if (size < 0) {
                break;
            }
            s49 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i2 = U.r;
                if (recyclerView.d0()) {
                    U.s = i2;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = jdc.a;
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

    public final void e0(su6 su6Var) {
        ArrayList arrayList;
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).remove(su6Var);
        if (bs2Var != null) {
            ((ps) this.b).remove(bs2Var.a);
            ny0 ny0Var = bs2Var.b;
            synchronized (ny0Var.c) {
                ny0Var.b = true;
                arrayList = new ArrayList(((ps) ny0Var.d).values());
                ((ps) ny0Var.d).clear();
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r4a) obj).o();
            }
            tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
            if (tv6Var != null && !tv6Var.i()) {
                g8c.X(tv6Var.l, new yr2(tv6Var, su6Var, (byte) 0));
            }
        }
    }

    @Override
    public final void f() {
        yb1 yb1Var = (yb1) this.d;
        xb1 xb1Var = yb1Var.a;
        jb4 jb4Var = yb1Var.c;
        if (jb4Var != null) {
            jb4Var.f = null;
            m21 m21Var = (m21) jb4Var.g;
            if (m21Var != null) {
                m21Var.b();
                jb4Var.g = null;
            }
            yb1Var.c = null;
        }
        cc1 cc1Var = (cc1) this.c;
        if (cc1Var.getParent() != null) {
            xb1Var.Q(cc1Var);
        }
        new u21(xb1Var.m(), xb1Var.o()).Q(2131624012, 36, k96.M0(2131744469, null)).k(true);
    }

    @Override
    public final boolean f0() {
        return false;
    }

    public final void g(Object obj, su6 su6Var, q5a q5aVar, kc8 kc8Var) {
        ps psVar = (ps) this.c;
        x0();
        su6 L = L(obj);
        if (L == null) {
            ((ps) this.b).put(obj, su6Var);
            aob aobVar = aob.a;
            eyb eybVar = eyb.b;
            tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
            if (tv6Var != null) {
                tv6Var.t();
                ad8 ad8Var = tv6Var.t;
                aobVar = ad8Var.T0();
                if (ad8Var.m0(30)) {
                    eybVar = ad8Var.f0();
                }
            }
            ?? obj2 = new Object();
            obj2.c = new Object();
            obj2.d = new aia(0);
            psVar.put(su6Var, new bs2(obj, obj2, q5aVar, kc8Var, aobVar, eybVar));
            return;
        }
        bs2 bs2Var = (bs2) psVar.get(L);
        bs2Var.getClass();
        bs2Var.d = q5aVar;
        bs2Var.e = kc8Var;
    }

    public final void g0(yg2 yg2Var) {
        if (((vg2) this.b) != null) {
            for (int i = 0; i < yg2Var.b.size(); i++) {
                vg2 vg2Var = (vg2) this.b;
                vg2Var.h.remove(yg2Var.h(i).d);
                vg2Var.g();
            }
        }
    }

    public final void h(su6 su6Var, int i, as2 as2Var) {
        x0();
        bs2 bs2Var = (bs2) ((ps) this.c).get(su6Var);
        if (bs2Var != null) {
            kc8 kc8Var = bs2Var.g;
            kc8Var.getClass();
            jc8 jc8Var = new jc8(kc8Var);
            jc8Var.a.b(i);
            bs2Var.g = jc8Var.b();
            bs2Var.c.add(as2Var);
        }
    }

    public final void i(yg2 yg2Var) {
        if (((vg2) this.b) == null) {
            this.b = new vg2();
        }
        for (int i = 0; i < yg2Var.b.size(); i++) {
            vg2 vg2Var = (vg2) this.b;
            xg2 h2 = yg2Var.h(i);
            vg2Var.h.put(h2.d, h2);
            vg2Var.g();
        }
    }

    public final void i0(boolean z) {
        ((zu6) this.b).a.setActive(z);
        Iterator it = ((ArrayList) this.d).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw ls6.l(it);
    }

    public final void j0(String str) {
        if (str != null) {
            this.b = str;
        } else {
            fvc.f("Null backendName");
        }
    }

    @Override
    public final void k() {
        ((d32) this.c).R.z();
    }

    public final void k0(yu6 yu6Var, Handler handler) {
        zu6 zu6Var = (zu6) this.b;
        if (yu6Var == null) {
            zu6Var.d(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        zu6Var.d(yu6Var, handler);
    }

    @Override
    public final void l(int i, boolean z, boolean z2) {
        String str;
        if (!z) {
            d32 d32Var = (d32) this.c;
            HashMap hashMap = (HashMap) this.b;
            ArrayList arrayList = (ArrayList) this.d;
            x02 x02Var = d32Var.b;
            if (!hashMap.isEmpty() && d32Var.R != null && !d32Var.L) {
                d32Var.L = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj = hashMap.get(arrayList.get(i2));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof jm6) {
                        jm6 jm6Var = (jm6) obj;
                        String str2 = jm6Var.h;
                        if (str2 != null) {
                            obj2.c = str2;
                        } else {
                            obj2.c = jm6Var.I;
                        }
                        obj2.e = jm6Var.c;
                        obj2.f = jm6Var.g;
                        obj2.k = jm6Var.s;
                        obj2.o = jm6Var.b;
                        CharSequence charSequence = jm6Var.a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.i = jm6Var.n;
                        obj2.j = jm6Var.r;
                        obj2.h = jm6Var.x;
                    }
                }
                ij.X(x02Var.G3, x02Var.V0(), arrayList2.size() + x02Var.R0(), new p22(d32Var, i, arrayList2, z2, (byte) 0));
            }
        }
    }

    public final void l0(sg2 sg2Var) {
        yg2 yg2Var;
        yg2 yg2Var2 = (yg2) this.c;
        if (yg2Var2 != null && ((sg2) this.d) == null && sg2Var != null) {
            i(yg2Var2);
        }
        if (((sg2) this.d) != null && (yg2Var = (yg2) this.c) != null && sg2Var == null) {
            g0(yg2Var);
        }
        sg2 sg2Var2 = (sg2) this.d;
        if (sg2Var2 != null) {
            i69 i69Var = sg2Var2.a;
            fre.e("Must be called from the main thread.");
            i69Var.i.remove(sg2Var2);
        }
        if (sg2Var != null) {
            sg2Var.a.p(sg2Var);
            yg2 yg2Var3 = (yg2) this.c;
            if (yg2Var3 != null) {
                sg2Var.d = yg2Var3;
                sg2Var.g = 0;
                sg2Var.h = 0;
                sg2Var.p();
            }
        }
        this.d = sg2Var;
    }

    public final void m(int i, View view, boolean z) {
        int O;
        RecyclerView recyclerView = (RecyclerView) ((ln8) this.b).b;
        if (i < 0) {
            O = recyclerView.getChildCount();
        } else {
            O = O(i);
        }
        ((hg2) this.c).y(O, z);
        if (z) {
            T(view);
        }
        recyclerView.addView(view, O);
        s49 U = RecyclerView.U(view);
        recyclerView.h0(view);
        w39 w39Var = recyclerView.x;
        if (w39Var != null && U != null) {
            w39Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f49) recyclerView.Q.get(size)).c();
            }
        }
    }

    public final void m0(MediaMetadataCompat mediaMetadataCompat) {
        zu6 zu6Var = (zu6) this.b;
        zu6Var.h = mediaMetadataCompat;
        MediaSession mediaSession = zu6Var.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public final void n(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int O;
        RecyclerView recyclerView = (RecyclerView) ((ln8) this.b).b;
        if (i < 0) {
            O = recyclerView.getChildCount();
        } else {
            O = O(i);
        }
        ((hg2) this.c).y(O, z);
        if (z) {
            T(view);
        }
        s49 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        RecyclerView.c(recyclerView, view, O, layoutParams);
    }

    public final void n0(android.support.v4.media.session.PlaybackStateCompat r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.n0(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    public final ra0 o() {
        String str;
        if (((String) this.b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((cj8) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new ra0((String) this.b, (byte[]) this.c, (cj8) this.d);
        }
        sc8.j("Missing required properties:".concat(str));
        return null;
    }

    public final void o0(ArrayList arrayList) {
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
                        Log.e("MediaSessionCompat", ls6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(j));
                } else {
                    w26.j("queue shouldn't have null items");
                    return;
                }
            }
        }
        zu6 zu6Var = (zu6) this.b;
        MediaSession mediaSession = zu6Var.a;
        zu6Var.g = arrayList;
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
                queueItem = iv6.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void p() {
        j86 j86Var = (j86) this.c;
        j86Var.getClass();
        j86Var.a(false);
    }

    public final void p0(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.p0(int):void");
    }

    @Override
    public final void q(android.view.View r13, defpackage.h19 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.q(android.view.View, h19, boolean, boolean):void");
    }

    public final void q0(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.q0(int):void");
    }

    @Override
    public final boolean r() {
        return true;
    }

    public final void r0(k86 k86Var, h86 h86Var, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        j86 j86Var = new j86(this, myLooper, k86Var, h86Var, i, SystemClock.elapsedRealtime());
        if (((j86) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        this.c = j86Var;
        j86Var.b();
    }

    public final FileOutputStream s0() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            h0(file2, (File) this.b);
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
            ag.e(file, "Failed to create directory for ");
            return null;
        }
    }

    public final synchronized void t0() {
        ((lb3) this.d).c.E();
    }

    public final String toString() {
        switch (this.a) {
            case 21:
                return ((hg2) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void u0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            ln8 ln8Var = (ln8) this.b;
            s49 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) ln8Var.b;
                int i = U.r;
                if (recyclerView.d0()) {
                    U.s = i;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = jdc.a;
                    view2.setImportantForAccessibility(i);
                }
                U.r = 0;
            }
        }
    }

    public final void w(int i) {
        s49 U;
        int O = O(i);
        ((hg2) this.c).z(O);
        RecyclerView recyclerView = (RecyclerView) ((ln8) this.b).b;
        View childAt = recyclerView.getChildAt(O);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        RecyclerView.e(recyclerView, O);
    }

    public final void w0(boolean z, float f2) {
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

    public final void x0() {
        boolean z;
        tv6 tv6Var = (tv6) ((WeakReference) this.d).get();
        if (tv6Var != null) {
            if (Looper.myLooper() == tv6Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
        }
    }

    public final void y(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(2131689503);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pn5.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    A((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void j(Editable editable) {
    }

    public mv6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public mv6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public mv6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public mv6(CastDevice castDevice, uhf uhfVar) {
        this.a = (byte) 15;
        fre.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = uhfVar;
    }

    public mv6(xj0 xj0Var) {
        this.a = (byte) 9;
        this.b = new sj0();
        this.c = xj0Var;
    }

    public mv6(ExecutorService executorService, ExecutorService executorService2) {
        this.a = (byte) 3;
        executorService.getClass();
        executorService2.getClass();
        this.b = new pz2(executorService);
        this.c = new pz2(executorService);
        Tasks.forResult(null);
        this.d = new pz2(executorService2);
    }

    public mv6(gg6 gg6Var) {
        this.a = (byte) 4;
        this.b = gg6Var;
        this.c = w;
        this.d = new int[32];
    }

    public mv6() {
        this.a = (byte) 28;
        this.b = new Object();
    }

    public mv6(ln8 ln8Var) {
        this.a = (byte) 21;
        this.b = ln8Var;
        this.c = new hg2((byte) 0);
        this.d = new ArrayList();
    }

    public mv6(jb4 jb4Var) {
        this.a = (byte) 2;
        this.c = null;
        this.d = null;
        this.b = jb4Var;
    }

    public mv6(File file) {
        this.a = (byte) 7;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public mv6(tv6 tv6Var) {
        this.a = (byte) 25;
        this.b = new aia(0);
        this.c = new aia(0);
        this.d = new WeakReference(tv6Var);
    }

    public mv6(Context context) {
        this.a = (byte) 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public mv6(byte[] bArr, t56 t56Var) {
        this.a = (byte) 12;
        this.b = bArr;
        this.c = null;
        this.d = t56Var;
    }

    public mv6(jr6 jr6Var, t56 t56Var) {
        this.a = (byte) 12;
        this.b = jr6Var.k;
        this.c = jr6Var.n;
        this.d = t56Var;
    }

    public mv6(p20[] p20VarArr) {
        this.a = (byte) 27;
        ?? cf0Var = new cf0();
        cf0Var.m = 0;
        cf0Var.o = 0;
        cf0Var.p = 0;
        byte[] bArr = g8c.b;
        cf0Var.n = bArr;
        cf0Var.q = bArr;
        ?? obj = new Object();
        obj.b = 1.0f;
        obj.c = 1.0f;
        l20 l20Var = l20.e;
        obj.d = l20Var;
        obj.e = l20Var;
        obj.f = l20Var;
        obj.g = l20Var;
        ByteBuffer byteBuffer = p20.a;
        obj.j = byteBuffer;
        obj.k = byteBuffer;
        p20[] p20VarArr2 = new p20[p20VarArr.length + 2];
        this.b = p20VarArr2;
        System.arraycopy(p20VarArr, 0, p20VarArr2, 0, p20VarArr.length);
        this.c = cf0Var;
        this.d = obj;
        p20VarArr2[p20VarArr.length] = cf0Var;
        p20VarArr2[p20VarArr.length + 1] = obj;
    }

    public mv6(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.<init>(java.lang.String):void");
    }

    public mv6(qx4 qx4Var) {
        this.a = (byte) 6;
        this.b = qx4Var;
        this.c = Choreographer.getInstance();
        this.d = new mn(this, (byte) 0);
    }

    public mv6(d32 d32Var, HashMap hashMap, ArrayList arrayList) {
        this.a = (byte) 19;
        this.c = d32Var;
        this.b = hashMap;
        this.d = arrayList;
    }

    public mv6(byte b) {
        this.a = b;
    }

    public mv6(lb3 lb3Var, uc8 uc8Var) {
        this.a = (byte) 29;
        this.d = lb3Var;
        this.b = new HashMap();
        this.c = uc8Var;
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
