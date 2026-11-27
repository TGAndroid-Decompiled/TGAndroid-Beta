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
public class rx6 implements ra6, l12, m7b, h49, j98 {
    public static int e;
    public static volatile rx6 f;
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object h = new Object();
    public static final sy2 n = new sy2((byte) 0);
    public static final ta r = new ta((byte) 29);
    public static final k03 s = new Object();
    public static final byte[] w = new byte[0];
    public static final ma6 x = new ma6(0, -9223372036854775807L);
    public static final ma6 y = new ma6(2, -9223372036854775807L);
    public static final ma6 E = new ma6(3, -9223372036854775807L);

    public rx6(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        ex6 ex6Var;
        Looper mainLooper;
        int i;
        this.a = (byte) 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i2 = dhb.b;
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
                    ex6Var = new ex6(context, str);
                    this.b = ex6Var;
                } else if (i3 >= 28) {
                    ex6Var = new ex6(context, str);
                    this.b = ex6Var;
                } else {
                    ex6Var = new ex6(context, str);
                    this.b = ex6Var;
                }
                ex6 ex6Var2 = ex6Var;
                if (Looper.myLooper() != null) {
                    mainLooper = Looper.myLooper();
                } else {
                    mainLooper = Looper.getMainLooper();
                }
                p0(new dx6((byte) 1), new Handler(mainLooper));
                ex6Var.a.setMediaButtonReceiver(pendingIntent);
                this.c = new um4(context, ex6Var2.c);
                if (e == 0) {
                    e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            lq5.j("tag must not be null or empty");
            throw null;
        }
        lq5.j("context must not be null");
        throw null;
    }

    public static Bundle B0(Bundle bundle) {
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
            bundle.setClassLoader(rx6.class.getClassLoader());
        }
    }

    public static rx6 O(Context context) {
        if (f == null) {
            synchronized (h) {
                if (f == null) {
                    f = new rx6(context);
                }
            }
        }
        return f;
    }

    public static void d0(gd4 gd4Var, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                gd4Var.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    public static void m0(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static final void v() {
        if (!((Boolean) new j03(0, s, k03.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 0).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void w() {
        if (!((Boolean) new j03(0, s, k03.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 1).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static wa3 x(ys6 ys6Var) {
        String uri;
        boolean z;
        boolean z2;
        vh4 vh4Var = new vh4((byte) 5);
        byte[] bArr = null;
        vh4Var.d = null;
        Uri uri2 = ys6Var.b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z3 = ys6Var.f;
        ?? obj = new Object();
        if (z3 && TextUtils.isEmpty(uri)) {
            z = false;
        } else {
            z = true;
        }
        yve.f(z);
        obj.b = vh4Var;
        obj.c = uri;
        obj.a = z3;
        obj.d = new HashMap();
        to5 to5Var = ys6Var.c;
        bp5 bp5Var = to5Var.a;
        if (bp5Var == null) {
            bp5Var = to5Var.c();
            to5Var.a = bp5Var;
        }
        v9c n2 = bp5Var.n();
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
        int i = o51.a;
        z6f z6fVar = new z6f((byte) 17);
        UUID uuid = ys6Var.a;
        uuid.getClass();
        boolean z4 = ys6Var.d;
        boolean z5 = ys6Var.e;
        int[] e2 = ype.e(ys6Var.g);
        for (int i2 : e2) {
            if (i2 != 2 && i2 != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            yve.f(z2);
        }
        wa3 wa3Var = new wa3(uuid, obj, hashMap, z4, (int[]) e2.clone(), z5, z6fVar);
        byte[] bArr2 = ys6Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        yve.p(wa3Var.x.isEmpty());
        wa3Var.L = bArr;
        return wa3Var;
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
                        if (sp5.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    B((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void A0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            i09 i09Var = (i09) this.b;
            f89 V = RecyclerView.V(view);
            if (V != null) {
                RecyclerView recyclerView = (RecyclerView) i09Var.b;
                int i = V.r;
                if (recyclerView.e0()) {
                    V.s = i;
                    recyclerView.L0.add(V);
                } else {
                    View view2 = V.a;
                    WeakHashMap weakHashMap = ihc.a;
                    view2.setImportantForAccessibility(i);
                }
                V.r = 0;
            }
        }
    }

    public final Object B(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (q0f.b()) {
            try {
                q0f.a(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                sp5 sp5Var = (sp5) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = sp5Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            B(cls2, hashSet);
                        }
                    }
                }
                obj = sp5Var.b((Context) this.d);
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
    public final void C(int i, boolean z, boolean z2) {
        String str;
        if (!z) {
            u32 u32Var = (u32) this.c;
            HashMap hashMap = (HashMap) this.b;
            ArrayList arrayList = (ArrayList) this.d;
            n12 n12Var = u32Var.b;
            if (!hashMap.isEmpty() && u32Var.R != null && !u32Var.L) {
                u32Var.L = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj = hashMap.get(arrayList.get(i2));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof no6) {
                        no6 no6Var = (no6) obj;
                        String str2 = no6Var.h;
                        if (str2 != null) {
                            obj2.c = str2;
                        } else {
                            obj2.c = no6Var.I;
                        }
                        obj2.e = no6Var.c;
                        obj2.f = no6Var.g;
                        obj2.k = no6Var.s;
                        obj2.o = no6Var.b;
                        CharSequence charSequence = no6Var.a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.i = no6Var.n;
                        obj2.j = no6Var.r;
                        obj2.h = no6Var.x;
                    }
                }
                jj.X(n12Var.G3, n12Var.W0(), arrayList2.size() + n12Var.S0(), new g32(u32Var, i, arrayList2, z2, (byte) 0));
            }
        }
    }

    public final void C0(boolean z, float f2) {
        b8[] b8VarArr = (b8[]) this.d;
        for (int i = 0; i < b8VarArr.length; i++) {
            if (z && ((i == 0 && Math.abs(f2 - 0.2f) < 0.01f) || ((i == 1 && Math.abs(f2 - 0.5f) < 0.1f) || ((i == 2 && Math.abs(f2 - 1.0f) < 0.1f) || ((i == 3 && Math.abs(f2 - 1.5f) < 0.1f) || (i == 4 && Math.abs(f2 - 2.0f) < 0.1f)))))) {
                b8VarArr[i].d(-9718023, -9718023);
            } else {
                b8VarArr[i].d(-328966, -328966);
            }
        }
        ((w7) this.c).e(true, f2);
    }

    public final void D0() {
        boolean z;
        yx6 yx6Var = (yx6) ((WeakReference) this.d).get();
        if (yx6Var != null) {
            if (Looper.myLooper() == yx6Var.l.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
        }
    }

    public final void E(us2 us2Var) {
        x76 x76Var;
        yx6 yx6Var = (yx6) ((WeakReference) this.d).get();
        if (yx6Var == null) {
            return;
        }
        D0();
        do {
            ts2 ts2Var = (ts2) us2Var.c.poll();
            if (ts2Var == null) {
                us2Var.f = false;
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            M(us2Var.a);
            atomicReference.set(ts2Var.run());
            x76Var = (x76) atomicReference.get();
        } while (x76Var.isDone());
        x76Var.b(new on1(this, yx6Var, us2Var, (byte) 27), mo3.a);
    }

    @Override
    public final boolean E0() {
        return true;
    }

    public final void F(final xw6 xw6Var) {
        D0();
        us2 us2Var = (us2) ((qs) this.c).get(xw6Var);
        if (us2Var != null) {
            final zf8 zf8Var = us2Var.g;
            us2Var.g = zf8.b;
            us2Var.c.add(new ts2(xw6Var, zf8Var) {
                public final xw6 b;

                @Override
                public final x76 run() {
                    yx6 yx6Var = (yx6) ((WeakReference) rx6.this.d).get();
                    if (yx6Var != null) {
                        yx6Var.n(this.b);
                    }
                    return do5.b;
                }
            });
            if (us2Var.f) {
                return;
            }
            us2Var.f = true;
            E(us2Var);
        }
    }

    public final pr3 G(ft6 ft6Var) {
        wa3 wa3Var;
        ft6Var.b.getClass();
        ys6 ys6Var = ft6Var.b.c;
        if (ys6Var == null) {
            return pr3.u;
        }
        synchronized (this.b) {
            if (!ys6Var.equals((ys6) this.c)) {
                this.c = ys6Var;
                this.d = x(ys6Var);
            }
            wa3Var = (wa3) this.d;
            wa3Var.getClass();
        }
        return wa3Var;
    }

    public final Object H(Bitmap bitmap) {
        tj0 tj0Var = (tj0) this.b;
        if (tj0Var.a(bitmap)) {
            this.d = ((yj0) this.c).a(bitmap);
            tj0Var.b(bitmap);
        }
        return this.d;
    }

    public rj0 I() {
        int[] iArr;
        ki6 ki6Var = (ki6) this.b;
        int i = ki6Var.a;
        int i2 = ki6Var.b;
        rj0 rj0Var = new rj0(i, i2);
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
            byte[] b = ki6Var.b((i2 * i4) / 5, (byte[]) this.c);
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
            byte[] a = ki6Var.a();
            for (int i25 = 0; i25 < i2; i25++) {
                int i26 = i25 * i;
                for (int i27 = 0; i27 < i; i27++) {
                    if ((a[i26 + i27] & 255) < i24) {
                        rj0Var.c(i27, i25);
                    }
                }
            }
            return rj0Var;
        }
        throw tm7.a();
    }

    public final View J(int i) {
        return ((RecyclerView) ((i09) this.b).b).getChildAt(P(i));
    }

    public final int K() {
        return ((RecyclerView) ((i09) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public final po5 L() {
        D0();
        return po5.q(((qs) this.b).values());
    }

    public final xw6 M(Object obj) {
        D0();
        return (xw6) ((qs) this.b).get(obj);
    }

    public final long N() {
        cb3 cb3Var = (cb3) this.d;
        if (cb3Var != null) {
            return cb3Var.d;
        }
        return -1L;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    public final int P(int i) {
        zg2 zg2Var = (zg2) this.c;
        if (i >= 0) {
            int childCount = ((RecyclerView) ((i09) this.b).b).getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                int s2 = i - (i2 - zg2Var.s(i2));
                if (s2 == 0) {
                    while (zg2Var.w(i2)) {
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

    public final vy0 Q(xw6 xw6Var) {
        D0();
        us2 us2Var = (us2) ((qs) this.c).get(xw6Var);
        if (us2Var != null) {
            return us2Var.b;
        }
        return null;
    }

    public final View S(int i) {
        return ((RecyclerView) ((i09) this.b).b).getChildAt(i);
    }

    public final int T() {
        return ((RecyclerView) ((i09) this.b).b).getChildCount();
    }

    public final boolean U() {
        if (((IOException) this.d) != null) {
            return true;
        }
        return false;
    }

    public final void W(View view) {
        ((ArrayList) this.d).add(view);
        i09 i09Var = (i09) this.b;
        f89 V = RecyclerView.V(view);
        if (V != null) {
            View view2 = V.a;
            RecyclerView recyclerView = (RecyclerView) i09Var.b;
            int i = V.s;
            if (i != -1) {
                V.r = i;
            } else {
                WeakHashMap weakHashMap = ihc.a;
                V.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.e0()) {
                V.s = 4;
                recyclerView.L0.add(V);
                return;
            }
            WeakHashMap weakHashMap2 = ihc.a;
            view2.setImportantForAccessibility(4);
        }
    }

    public final void X(defpackage.z63 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.cw8 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx6.X(z63, android.net.Uri, java.util.Map, long, long, cw8):void");
    }

    public final boolean Y(xw6 xw6Var) {
        D0();
        if (((qs) this.c).get(xw6Var) != null) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (((na6) this.c) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        kc1 kc1Var = (kc1) this.c;
        if (kc1Var.getParent() == null) {
            ((gc1) this.d).b.i();
        } else {
            kc1Var.setSegments(arrayList);
        }
    }

    public final boolean a0(xw6 xw6Var, int i) {
        D0();
        us2 us2Var = (us2) ((qs) this.c).get(xw6Var);
        yx6 yx6Var = (yx6) ((WeakReference) this.d).get();
        if (us2Var != null && us2Var.e.a(i) && yx6Var != null) {
            yx6Var.t();
            if (yx6Var.t.q().a(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(Object obj, xw6 xw6Var, i9a i9aVar, zf8 zf8Var) {
        qs qsVar = (qs) this.c;
        D0();
        xw6 M = M(obj);
        if (M == null) {
            ((qs) this.b).put(obj, xw6Var);
            asb asbVar = asb.a;
            f2c f2cVar = f2c.b;
            yx6 yx6Var = (yx6) ((WeakReference) this.d).get();
            if (yx6Var != null) {
                yx6Var.t();
                og8 og8Var = yx6Var.t;
                asbVar = og8Var.T0();
                if (og8Var.m0(30)) {
                    f2cVar = og8Var.f0();
                }
            }
            ?? obj2 = new Object();
            obj2.c = new Object();
            obj2.d = new vla(0);
            qsVar.put(xw6Var, new us2(obj, obj2, i9aVar, zf8Var, asbVar, f2cVar));
            return;
        }
        us2 us2Var = (us2) qsVar.get(M);
        us2Var.getClass();
        us2Var.d = i9aVar;
        us2Var.e = zf8Var;
    }

    public final boolean b0(xw6 xw6Var, int i) {
        boolean z;
        D0();
        us2 us2Var = (us2) ((qs) this.c).get(xw6Var);
        if (us2Var != null) {
            i9a i9aVar = us2Var.d;
            i9aVar.getClass();
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            yve.e("Use contains(Command) for custom command", z);
            for (h9a h9aVar : i9aVar.a) {
                if (h9aVar.a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(long j, long j2, boolean z) {
        ((gd4) this.b).f(j, j2, z);
    }

    public final boolean c0(xw6 xw6Var, h9a h9aVar) {
        D0();
        us2 us2Var = (us2) ((qs) this.c).get(xw6Var);
        if (us2Var != null) {
            bp5 bp5Var = us2Var.d.a;
            h9aVar.getClass();
            if (bp5Var.contains(h9aVar) || bn2.i(h9aVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        gc1 gc1Var = (gc1) this.d;
        fc1 fc1Var = gc1Var.a;
        gd4 gd4Var = gc1Var.c;
        if (gd4Var != null) {
            gd4Var.f = null;
            v21 v21Var = (v21) gd4Var.g;
            if (v21Var != null) {
                v21Var.b();
                gd4Var.g = null;
            }
            gc1Var.c = null;
        }
        kc1 kc1Var = (kc1) this.c;
        if (kc1Var.getParent() != null) {
            fc1Var.P(kc1Var);
        }
        new d31(fc1Var.m(), fc1Var.r()).Q(2131624012, 36, ob6.M0(2131744363, null)).k(true);
    }

    @Override
    public final void e(android.view.View r13, defpackage.w49 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx6.e(android.view.View, w49, boolean, boolean):void");
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g() {
        IOException iOException = (IOException) this.d;
        if (iOException == null) {
            na6 na6Var = (na6) this.c;
            if (na6Var != null) {
                int i = na6Var.a;
                IOException iOException2 = na6Var.e;
                if (iOException2 != null && na6Var.f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void g0(pa6 pa6Var) {
        r99 r99Var = (r99) this.b;
        na6 na6Var = (na6) this.c;
        if (na6Var != null) {
            na6Var.a(true);
        }
        if (pa6Var != null) {
            r99Var.execute(new zz3(pa6Var, (byte) 22));
        }
        lq5 lq5Var = r99Var.b;
        r99Var.a.shutdown();
    }

    public final void h0(nj njVar) {
        ig8 ig8Var = (ig8) ((HashMap) this.b).remove(njVar);
        ig8Var.getClass();
        dc3 dc3Var = (dc3) ((ec3) this.d).o.get(ig8Var);
        if (dc3Var != null) {
            synchronized (dc3Var) {
                dc3Var.d--;
            }
        }
    }

    public final void i(xw6 xw6Var, int i, ts2 ts2Var) {
        D0();
        us2 us2Var = (us2) ((qs) this.c).get(xw6Var);
        if (us2Var != null) {
            zf8 zf8Var = us2Var.g;
            zf8Var.getClass();
            yf8 yf8Var = new yf8(zf8Var);
            yf8Var.a.b(i);
            us2Var.g = yf8Var.b();
            us2Var.c.add(ts2Var);
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    public final void j0() {
        RecyclerView recyclerView;
        int i;
        ((zg2) this.c).A();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) ((i09) this.b).b;
            if (size < 0) {
                break;
            }
            f89 V = RecyclerView.V((View) arrayList.get(size));
            if (V != null) {
                int i2 = V.r;
                if (recyclerView.e0()) {
                    V.s = i2;
                    recyclerView.L0.add(V);
                } else {
                    View view = V.a;
                    WeakHashMap weakHashMap = ihc.a;
                    view.setImportantForAccessibility(i2);
                }
                V.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    @Override
    public final boolean k() {
        return false;
    }

    public final void k0(xw6 xw6Var) {
        ArrayList arrayList;
        D0();
        us2 us2Var = (us2) ((qs) this.c).remove(xw6Var);
        if (us2Var != null) {
            ((qs) this.b).remove(us2Var.a);
            vy0 vy0Var = us2Var.b;
            synchronized (vy0Var.c) {
                vy0Var.b = true;
                arrayList = new ArrayList(((qs) vy0Var.d).values());
                ((qs) vy0Var.d).clear();
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((j8a) obj).o();
            }
            yx6 yx6Var = (yx6) ((WeakReference) this.d).get();
            if (yx6Var != null && !yx6Var.i()) {
                gcc.X(yx6Var.l, new rs2(yx6Var, xw6Var, (byte) 0));
            }
        }
    }

    public final void l0(qh2 qh2Var) {
        if (((nh2) this.b) != null) {
            for (int i = 0; i < qh2Var.a.size(); i++) {
                nh2 nh2Var = (nh2) this.b;
                nh2Var.h.remove(qh2Var.h(i).d);
                nh2Var.g();
            }
        }
    }

    public final void n0(boolean z) {
        ((ex6) this.b).a.setActive(z);
        Iterator it = ((ArrayList) this.d).iterator();
        if (!it.hasNext()) {
            return;
        }
        throw qu6.l(it);
    }

    @Override
    public final boolean o() {
        return false;
    }

    public final void o0(String str) {
        if (str != null) {
            this.b = str;
        } else {
            p3d.h("Null backendName");
        }
    }

    @Override
    public final boolean p() {
        return false;
    }

    public final void p0(dx6 dx6Var, Handler handler) {
        ex6 ex6Var = (ex6) this.b;
        if (dx6Var == null) {
            ex6Var.d(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        ex6Var.d(dx6Var, handler);
    }

    public final void q(qh2 qh2Var) {
        if (((nh2) this.b) == null) {
            this.b = new nh2();
        }
        for (int i = 0; i < qh2Var.a.size(); i++) {
            nh2 nh2Var = (nh2) this.b;
            ph2 h2 = qh2Var.h(i);
            nh2Var.h.put(h2.d, h2);
            nh2Var.g();
        }
    }

    public final void q0(kh2 kh2Var) {
        qh2 qh2Var;
        qh2 qh2Var2 = (qh2) this.c;
        if (qh2Var2 != null && ((kh2) this.d) == null && kh2Var != null) {
            q(qh2Var2);
        }
        if (((kh2) this.d) != null && (qh2Var = (qh2) this.c) != null && kh2Var == null) {
            l0(qh2Var);
        }
        kh2 kh2Var2 = (kh2) this.d;
        if (kh2Var2 != null) {
            v99 v99Var = kh2Var2.a;
            xve.e("Must be called from the main thread.");
            v99Var.i.remove(kh2Var2);
        }
        if (kh2Var != null) {
            kh2Var.a.p(kh2Var);
            qh2 qh2Var3 = (qh2) this.c;
            if (qh2Var3 != null) {
                kh2Var.d = qh2Var3;
                kh2Var.g = 0;
                kh2Var.h = 0;
                kh2Var.p();
            }
        }
        this.d = kh2Var;
    }

    public final void r(int i, View view, boolean z) {
        int P;
        RecyclerView recyclerView = (RecyclerView) ((i09) this.b).b;
        if (i < 0) {
            P = recyclerView.getChildCount();
        } else {
            P = P(i);
        }
        ((zg2) this.c).x(P, z);
        if (z) {
            W(view);
        }
        recyclerView.addView(view, P);
        f89 V = RecyclerView.V(view);
        recyclerView.i0(view);
        j79 j79Var = recyclerView.x;
        if (j79Var != null && V != null) {
            j79Var.y(V);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s79) recyclerView.Q.get(size)).c();
            }
        }
    }

    public final void r0(MediaMetadataCompat mediaMetadataCompat) {
        ex6 ex6Var = (ex6) this.b;
        ex6Var.h = mediaMetadataCompat;
        MediaSession mediaSession = ex6Var.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public final void s(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int P;
        RecyclerView recyclerView = (RecyclerView) ((i09) this.b).b;
        if (i < 0) {
            P = recyclerView.getChildCount();
        } else {
            P = P(i);
        }
        ((zg2) this.c).x(P, z);
        if (z) {
            W(view);
        }
        f89 V = RecyclerView.V(view);
        if (V != null) {
            if (!V.l() && !V.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + V + recyclerView.D());
            }
            V.l &= -257;
        }
        RecyclerView.c(recyclerView, view, P, layoutParams);
    }

    public final void s0(android.support.v4.media.session.PlaybackStateCompat r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx6.s0(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    public final ta0 t() {
        String str;
        if (((String) this.b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((pm8) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new ta0((String) this.b, (byte[]) this.c, (pm8) this.d);
        }
        grb.i("Missing required properties:".concat(str));
        return null;
    }

    public final void t0(ArrayList arrayList) {
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
                        Log.e("MediaSessionCompat", qu6.n(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(j));
                } else {
                    lq5.j("queue shouldn't have null items");
                    return;
                }
            }
        }
        ex6 ex6Var = (ex6) this.b;
        MediaSession mediaSession = ex6Var.a;
        ex6Var.g = arrayList;
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
                queueItem = nx6.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final String toString() {
        switch (this.a) {
            case 21:
                return ((zg2) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public final void u() {
        na6 na6Var = (na6) this.c;
        na6Var.getClass();
        na6Var.a(false);
    }

    public final void u0(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx6.u0(int):void");
    }

    public final void v0(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx6.v0(int):void");
    }

    public final void w0(oa6 oa6Var, la6 la6Var, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        na6 na6Var = new na6(this, myLooper, oa6Var, la6Var, i, SystemClock.elapsedRealtime());
        if (((na6) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        this.c = na6Var;
        na6Var.b();
    }

    public final FileOutputStream x0() {
        File file = (File) this.c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            m0(file2, (File) this.b);
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
            bg.e(file, "Failed to create directory for ");
            return null;
        }
    }

    @Override
    public final void y() {
        ((u32) this.c).R.z();
    }

    public final synchronized void y0() {
        ((ec3) this.d).c.E();
    }

    public final void z(int i) {
        f89 V;
        int P = P(i);
        ((zg2) this.c).y(P);
        RecyclerView recyclerView = (RecyclerView) ((i09) this.b).b;
        View childAt = recyclerView.getChildAt(P);
        if (childAt != null && (V = RecyclerView.V(childAt)) != null) {
            if (V.l() && !V.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + V + recyclerView.D());
            }
            V.a(256);
        }
        RecyclerView.d(recyclerView, P);
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        int i4;
        qbb qbbVar;
        String str = (String) this.c;
        kr0 kr0Var = (kr0) this.d;
        long j3 = kr0Var.d;
        n12 n12Var = (n12) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
        if (!chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.size() == 1) {
                Object next = selectedPhotos.values().iterator().next();
                if (next instanceof no6) {
                    c8b l = c8b.l((no6) next);
                    l.J0 = j3;
                    l.K0 = str;
                    l.z();
                    rbb C = rbb.C(kr0Var.a.getParentActivity(), kr0Var.b);
                    RectF rectF = C.I;
                    WindowManager.LayoutParams layoutParams = C.h;
                    int i5 = C.c;
                    WindowManager windowManager = C.f;
                    if (!C.d) {
                        if (uc7.s1(i5).x2()) {
                            i5.b(i5);
                        } else {
                            C.w0 = j3;
                            C.x0 = str;
                            C.v0 = false;
                            C.e = false;
                            C.C2 = false;
                            if (windowManager != null && (qbbVar = C.n) != null && qbbVar.getParent() == null) {
                                hl.s3(windowManager, C.n, layoutParams);
                                windowManager.addView(C.n, layoutParams);
                                C.f0();
                            }
                            C.L1 = l;
                            l.J0 = j3;
                            l.K0 = str;
                            C.P1 = l.K ? 1 : 0;
                            C.t0.g = false;
                            C.K = false;
                            Point point = hl.q;
                            rectF.set(0.0f, hl.L(100.0f), point.x, hl.L(100.0f) + point.y);
                            C.H = hl.L(8.0f);
                            C.r.c();
                            ebb ebbVar = C.i0;
                            boolean z5 = C.K;
                            if (!z5 && z5) {
                                i4 = -14737633;
                            } else {
                                i4 = 0;
                            }
                            ebbVar.setBackgroundColor(i4);
                            C.r.setTranslationX(0.0f);
                            C.r.setTranslationY(0.0f);
                            C.r.b(0.0f);
                            C.r.setScaleX(1.0f);
                            C.r.setScaleY(1.0f);
                            C.L = 0.0f;
                            hl.e2(C.b);
                            c8b c8bVar = C.L1;
                            if (c8bVar != null) {
                                C.d1.setText(c8bVar.C0);
                            }
                            C.I(1, false);
                            C.k0(-1, false, false);
                            C.c1.b(false, false);
                            C.c1.b(true, true);
                            C.d(1.0f, true, new bab(C, (byte) 22));
                            C.a();
                        }
                    }
                    hl.d3(new vq0(n12Var, (byte) 0), 400L);
                }
            }
        }
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void l(Editable editable) {
    }

    public rx6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public rx6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public rx6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public rx6(CastDevice castDevice, kmf kmfVar) {
        this.a = (byte) 15;
        xve.i(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = kmfVar;
    }

    public rx6(yj0 yj0Var) {
        this.a = (byte) 9;
        this.b = new tj0();
        this.c = yj0Var;
    }

    public rx6(ExecutorService executorService, ExecutorService executorService2) {
        this.a = (byte) 3;
        executorService.getClass();
        executorService2.getClass();
        this.b = new i03(executorService);
        this.c = new i03(executorService);
        Tasks.forResult(null);
        this.d = new i03(executorService2);
    }

    public rx6(ki6 ki6Var) {
        this.a = (byte) 4;
        this.b = ki6Var;
        this.c = w;
        this.d = new int[32];
    }

    public rx6() {
        this.a = (byte) 28;
        this.b = new Object();
    }

    public rx6(i09 i09Var) {
        this.a = (byte) 21;
        this.b = i09Var;
        this.c = new zg2((byte) 0);
        this.d = new ArrayList();
    }

    public rx6(gd4 gd4Var) {
        this.a = (byte) 2;
        this.c = null;
        this.d = null;
        this.b = gd4Var;
    }

    public rx6(File file) {
        this.a = (byte) 7;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public rx6(yx6 yx6Var) {
        this.a = (byte) 25;
        this.b = new vla(0);
        this.c = new vla(0);
        this.d = new WeakReference(yx6Var);
    }

    public rx6(Context context) {
        this.a = (byte) 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public rx6(byte[] bArr, x76 x76Var) {
        this.a = (byte) 12;
        this.b = bArr;
        this.c = null;
        this.d = x76Var;
    }

    public rx6(nt6 nt6Var, x76 x76Var) {
        this.a = (byte) 12;
        this.b = nt6Var.k;
        this.c = nt6Var.n;
        this.d = x76Var;
    }

    public rx6(q20[] q20VarArr) {
        this.a = (byte) 27;
        ?? ef0Var = new ef0();
        ef0Var.m = 0;
        ef0Var.o = 0;
        ef0Var.p = 0;
        byte[] bArr = gcc.b;
        ef0Var.n = bArr;
        ef0Var.q = bArr;
        ?? obj = new Object();
        obj.b = 1.0f;
        obj.c = 1.0f;
        m20 m20Var = m20.e;
        obj.d = m20Var;
        obj.e = m20Var;
        obj.f = m20Var;
        obj.g = m20Var;
        ByteBuffer byteBuffer = q20.a;
        obj.j = byteBuffer;
        obj.k = byteBuffer;
        q20[] q20VarArr2 = new q20[q20VarArr.length + 2];
        this.b = q20VarArr2;
        System.arraycopy(q20VarArr, 0, q20VarArr2, 0, q20VarArr.length);
        this.c = ef0Var;
        this.d = obj;
        q20VarArr2[q20VarArr.length] = ef0Var;
        q20VarArr2[q20VarArr.length + 1] = obj;
    }

    public rx6(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx6.<init>(java.lang.String):void");
    }

    public rx6(wz4 wz4Var) {
        this.a = (byte) 6;
        this.b = wz4Var;
        this.c = Choreographer.getInstance();
        this.d = new nn(this, (byte) 0);
    }

    public rx6(u32 u32Var, HashMap hashMap, ArrayList arrayList) {
        this.a = (byte) 19;
        this.c = u32Var;
        this.b = hashMap;
        this.d = arrayList;
    }

    public rx6(byte b) {
        this.a = b;
    }

    public rx6(ec3 ec3Var, ig8 ig8Var) {
        this.a = (byte) 29;
        this.d = ec3Var;
        this.b = new HashMap();
        this.c = ig8Var;
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i, boolean z) {
    }
}
