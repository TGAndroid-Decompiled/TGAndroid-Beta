package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
public final class am2 implements s84, uw8, xj5, h49, tw8, qq2, ty9, heb {
    public static final nu6 h = new nu6((byte) 4);
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public am2(int[] iArr, int i, tx7[] tx7VarArr) {
        zl2 zl2Var;
        int i2;
        this.a = (byte) 0;
        this.f = new float[3];
        this.e = tx7VarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int D = (D(Color.red(i4), 8, 5) << 10) | (D(Color.green(i4), 8, 5) << 5) | D(Color.blue(i4), 8, 5);
            iArr[i3] = D;
            iArr2[D] = iArr2[D] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int rgb = Color.rgb(D((i6 >> 10) & 31, 5, 8), D((i6 >> 5) & 31, 5, 8), D(i6 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                vm2.c(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (O(fArr)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.b = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.d = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                ((ArrayList) this.d).add(new vx7(Color.rgb(D((i10 >> 10) & 31, 5, 8), D((i10 >> 5) & 31, 5, 8), D(i10 & 31, 5, 8)), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, h);
        priorityQueue.offer(new zl2(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i && (zl2Var = (zl2) priorityQueue.poll()) != null) {
            int i11 = zl2Var.b;
            int i12 = zl2Var.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            }
            am2 am2Var = zl2Var.j;
            if ((i11 + 1) - i12 > 1) {
                int i13 = zl2Var.e - zl2Var.d;
                int i14 = zl2Var.g - zl2Var.f;
                int i15 = zl2Var.i - zl2Var.h;
                if (i13 >= i14 && i13 >= i15) {
                    i2 = -3;
                } else if (i14 >= i13 && i14 >= i15) {
                    i2 = -2;
                } else {
                    i2 = -1;
                }
                int[] iArr4 = (int[]) am2Var.b;
                int[] iArr5 = (int[]) am2Var.c;
                C(i2, i12, i11, iArr4);
                Arrays.sort(iArr4, i12, zl2Var.b + 1);
                C(i2, i12, zl2Var.b, iArr4);
                int i16 = zl2Var.c / 2;
                int i17 = 0;
                int i18 = i12;
                while (true) {
                    int i19 = zl2Var.b;
                    if (i18 > i19) {
                        break;
                    }
                    i17 += iArr5[iArr4[i18]];
                    if (i17 >= i16) {
                        i12 = Math.min(i19 - 1, i18);
                        break;
                    }
                    i18++;
                }
                zl2 zl2Var2 = new zl2(am2Var, i12 + 1, zl2Var.b);
                zl2Var.b = i12;
                zl2Var.a();
                priorityQueue.offer(zl2Var2);
                priorityQueue.offer(zl2Var);
            } else {
                grb.i("Can not split a box with only 1 color");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            zl2 zl2Var3 = (zl2) it.next();
            am2 am2Var2 = zl2Var3.j;
            int[] iArr6 = (int[]) am2Var2.b;
            int[] iArr7 = (int[]) am2Var2.c;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = zl2Var3.a; i24 <= zl2Var3.b; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            vx7 vx7Var = new vx7(Color.rgb(D(Math.round(i20 / f), 5, 8), D(Math.round(i22 / f), 5, 8), D(Math.round(i23 / f), 5, 8)), i21);
            if (!O(vx7Var.b())) {
                arrayList.add(vx7Var);
            }
        }
        this.d = arrayList;
    }

    public static void C(int i, int i2, int i3, int[] iArr) {
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = ((i4 & 31) << 10) | (((i4 >> 5) & 31) << 5) | ((i4 >> 10) & 31);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5) | (i5 & 31);
            i2++;
        }
    }

    public static int D(int i, int i2, int i3) {
        int i4;
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }

    public static void R(am2 am2Var, nmf nmfVar) {
        cmf S;
        byte b = nmfVar.e;
        if (b == 2 && ((cmf) am2Var.e) != null) {
            am2Var.T();
        }
        if (b == 2) {
            S = new cmf((wae) am2Var.b, (String) am2Var.d);
            am2Var.e = S;
        } else {
            S = am2Var.S();
            am2Var.e = S;
        }
        xve.h(S);
        nmfVar.d = S.h;
        S.b.add(nmfVar);
    }

    public static Exception z(Task task) {
        if (task.getException() != null) {
            return task.getException();
        }
        return new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public final boolean A() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ji4 ji4Var = (ji4) this.c;
        ji4Var.a();
        Context context = ji4Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) != null && bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final mfb B(int i) {
        mfb mfbVar;
        HashMap hashMap = (HashMap) this.c;
        mfb mfbVar2 = (mfb) hashMap.get(Integer.valueOf(i));
        if (mfbVar2 != null) {
            return mfbVar2;
        }
        final lh2 lh2Var = (lh2) this.e;
        lh2Var.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            mfbVar = new mfb() {
                                @Override
                                public final Object get() {
                                    byte b = r3;
                                    lh2 lh2Var2 = lh2Var;
                                    Object obj = this;
                                    switch (b) {
                                        case 0:
                                            return jc3.e((Class) obj, lh2Var2);
                                        case 1:
                                            return jc3.e((Class) obj, lh2Var2);
                                        case 2:
                                            return jc3.e((Class) obj, lh2Var2);
                                        default:
                                            return new dw8(lh2Var2, (db3) ((am2) obj).b);
                                    }
                                }
                            };
                        } else {
                            lq5.j(uh9.k(i, "Unrecognized contentType: "));
                            return null;
                        }
                    } else {
                        mfbVar = new hc3(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(uz6.class), (byte) 0);
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(uz6.class);
                    mfbVar = new mfb() {
                        @Override
                        public final Object get() {
                            byte b = r3;
                            lh2 lh2Var2 = lh2Var;
                            Object obj = asSubclass;
                            switch (b) {
                                case 0:
                                    return jc3.e((Class) obj, lh2Var2);
                                case 1:
                                    return jc3.e((Class) obj, lh2Var2);
                                case 2:
                                    return jc3.e((Class) obj, lh2Var2);
                                default:
                                    return new dw8(lh2Var2, (db3) ((am2) obj).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(uz6.class);
                mfbVar = new mfb() {
                    @Override
                    public final Object get() {
                        byte b = r3;
                        lh2 lh2Var2 = lh2Var;
                        Object obj = asSubclass2;
                        switch (b) {
                            case 0:
                                return jc3.e((Class) obj, lh2Var2);
                            case 1:
                                return jc3.e((Class) obj, lh2Var2);
                            case 2:
                                return jc3.e((Class) obj, lh2Var2);
                            default:
                                return new dw8(lh2Var2, (db3) ((am2) obj).b);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(uz6.class);
            mfbVar = new mfb() {
                @Override
                public final Object get() {
                    byte b = r3;
                    lh2 lh2Var2 = lh2Var;
                    Object obj = asSubclass3;
                    switch (b) {
                        case 0:
                            return jc3.e((Class) obj, lh2Var2);
                        case 1:
                            return jc3.e((Class) obj, lh2Var2);
                        case 2:
                            return jc3.e((Class) obj, lh2Var2);
                        default:
                            return new dw8(lh2Var2, (db3) ((am2) obj).b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i), mfbVar);
        return mfbVar;
    }

    public final void E(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.E(int, int, android.content.Intent):void");
    }

    public final void F() {
        tt ttVar = (tt) this.b;
        xq2 xq2Var = (xq2) ttVar.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            xq2Var.getClass();
            xq2Var.A(new u6d(xq2Var, (byte) 0));
            if (((ko9) xq2Var.a) == null) {
                xq2.y(ttVar);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void G() {
        xq2 xq2Var = (xq2) ((tt) this.b).b;
        ko9 ko9Var = (ko9) xq2Var.a;
        if (ko9Var != null) {
            try {
                b1f b1fVar = (b1f) ko9Var.c;
                b1fVar.V(b1fVar.R(), 5);
                return;
            } catch (RemoteException e) {
                p3d.i(e);
                return;
            }
        }
        while (!((LinkedList) xq2Var.b).isEmpty() && ((u6d) ((LinkedList) xq2Var.b).getLast()).a() >= 1) {
            ((LinkedList) xq2Var.b).removeLast();
        }
    }

    public final void H() {
        xq2 xq2Var = (xq2) ((tt) this.b).b;
        ko9 ko9Var = (ko9) xq2Var.a;
        if (ko9Var != null) {
            try {
                b1f b1fVar = (b1f) ko9Var.c;
                b1fVar.V(b1fVar.R(), 4);
                return;
            } catch (RemoteException e) {
                p3d.i(e);
                return;
            }
        }
        while (!((LinkedList) xq2Var.b).isEmpty() && ((u6d) ((LinkedList) xq2Var.b).getLast()).a() >= 5) {
            ((LinkedList) xq2Var.b).removeLast();
        }
    }

    public final void I() {
        xq2 xq2Var = (xq2) ((tt) this.b).b;
        xq2Var.getClass();
        xq2Var.A(new u6d(xq2Var, (byte) 1));
    }

    public final void J() {
        WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.d;
        if (wallpapersListActivity != null) {
            Activity parentActivity = wallpapersListActivity.getParentActivity();
            if (parentActivity != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            w78 w78Var = new w78(2, false, false, null);
            w78Var.y = false;
            w78Var.W = new pq8(this, (byte) 25);
            wallpapersListActivity.presentFragment(w78Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        ((Activity) this.c).startActivityForResult(intent, 11);
    }

    public final void K(String str, String... strArr) {
        Bundle bundle = (Bundle) this.b;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] == null) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("String at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    caf.b(sb.toString());
                } else {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i2);
                        sb2.append(" is too long, truncating string.");
                        caf.b(sb2.toString());
                        String str3 = strArr2[i];
                        if (str3.length() > 20000) {
                            if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                                i3 = 19999;
                            }
                            str3 = str3.substring(0, i3);
                        }
                        strArr2[i] = str3;
                    }
                    i++;
                }
            }
            if (i > 0) {
                Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i);
                if (objArr.length >= 100) {
                    caf.b("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        caf.b("String array is empty and is ignored by put method.");
    }

    public final Task L() {
        Task forException;
        int i;
        boolean A = A();
        if (A && ((uf7) this.f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new kq7("Firebase-Messaging-Network-Io"));
            return ((qi4) ((ri4) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final am2 b;

                {
                    this.b = this;
                }

                @Override
                public final Object then(Task task) {
                    byte b = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    am2 am2Var = this.b;
                    switch (b) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(am2.z(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            ji4 ji4Var = (ji4) am2Var.c;
                            ji4Var.a();
                            yi4 yi4Var = ji4Var.c;
                            String str3 = yi4Var.a;
                            ji4Var.a();
                            x89 x89Var = new x89(uf7.b(ji4Var), yi4Var.b, str3, str, str2);
                            qa4 qa4Var = (qa4) am2Var.b;
                            wjb b2 = xjb.b();
                            b2.c = new a94[]{fmd.a};
                            b2.a = new k7b(qa4Var, x89Var, (byte) 19);
                            b2.d = (char) 39001;
                            return qa4Var.e(0, b2.a()).continueWith(executorService, new y94(str, (byte) 1));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(am2.z(task));
                            }
                            return ((qi4) ((ri4) am2Var.d)).e().continueWithTask(executorService, new y94(am2Var, ((z90) task.getResult()).a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final am2 b;

                {
                    this.b = this;
                }

                @Override
                public final Object then(Task task) {
                    byte b = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    am2 am2Var = this.b;
                    switch (b) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(am2.z(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            ji4 ji4Var = (ji4) am2Var.c;
                            ji4Var.a();
                            yi4 yi4Var = ji4Var.c;
                            String str3 = yi4Var.a;
                            ji4Var.a();
                            x89 x89Var = new x89(uf7.b(ji4Var), yi4Var.b, str3, str, str2);
                            qa4 qa4Var = (qa4) am2Var.b;
                            wjb b2 = xjb.b();
                            b2.c = new a94[]{fmd.a};
                            b2.a = new k7b(qa4Var, x89Var, (byte) 19);
                            b2.d = (char) 39001;
                            return qa4Var.e(0, b2.a()).continueWith(executorService, new y94(str, (byte) 1));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(am2.z(task));
                            }
                            return ((qi4) ((ri4) am2Var.d)).e().continueWithTask(executorService, new y94(am2Var, ((z90) task.getResult()).a));
                    }
                }
            });
        }
        fp fpVar = (fp) this.e;
        String b = uf7.b((ji4) fpVar.a);
        Bundle bundle = new Bundle();
        try {
            fpVar.j(b, bundle, A);
            up9 up9Var = (up9) fpVar.c;
            no3 no3Var = no3.d;
            plf plfVar = up9Var.c;
            if (plfVar.b() < 12000000) {
                if (plfVar.a() != 0) {
                    forException = up9Var.d(bundle).continueWithTask(no3Var, new zhc(up9Var, bundle, false, (byte) 22));
                } else {
                    forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
            } else {
                ykf t = ykf.t(up9Var.b);
                synchronized (t) {
                    i = t.a;
                    t.a = i + 1;
                }
                forException = t.u(new uff(i, 1, bundle, (byte) 1)).continueWith(no3Var, yad.b);
            }
        } catch (InterruptedException | ExecutionException e) {
            forException = Tasks.forException(e);
        }
        return forException.continueWith(new ic((byte) 1), new xi4(fpVar));
    }

    public final void M() {
        db3 db3Var = (db3) this.b;
        synchronized (db3Var) {
            db3Var.d = true;
        }
    }

    public final Set N(Class cls) {
        return c(i09.a(cls));
    }

    public final boolean O(float[] fArr) {
        tx7[] tx7VarArr = (tx7[]) this.e;
        if (tx7VarArr != null && tx7VarArr.length > 0) {
            for (tx7 tx7Var : tx7VarArr) {
                tx7Var.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void P(Uri uri) {
        o3e o3eVar;
        int i;
        Context context = (Context) this.b;
        if (uri == null) {
            Q();
        } else if (!uri.equals((Uri) this.d)) {
            Q();
            this.d = uri;
            hm5 hm5Var = (hm5) this.c;
            int i2 = hm5Var.b;
            if (i2 != 0 && (i = hm5Var.c) != 0) {
                o3eVar = new o3e(context, i2, i, this);
                this.e = o3eVar;
            } else {
                o3eVar = new o3e(context, 0, 0, this);
                this.e = o3eVar;
            }
            Uri uri2 = (Uri) this.d;
            xve.h(uri2);
            o3eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public final void Q() {
        o3e o3eVar = (o3e) this.e;
        if (o3eVar != null) {
            o3eVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    public final cmf S() {
        if (((cmf) this.e) == null) {
            cmf cmfVar = new cmf((wae) this.b, (String) this.d);
            this.e = cmfVar;
            cmfVar.b(1);
        }
        return (cmf) this.e;
    }

    public final void T() {
        int i;
        n8f n8fVar;
        int i2;
        int i3;
        long j;
        cmf cmfVar = (cmf) this.e;
        if (cmfVar != null) {
            Map map = cmfVar.e;
            List<def> list = cmfVar.d;
            List<had> list2 = cmfVar.c;
            List<nmf> list3 = cmfVar.b;
            md1 md1Var = cmfVar.j;
            if (md1Var != null) {
                md1Var.l = null;
                cmfVar.j = null;
            }
            long j2 = cmfVar.i;
            n8f m = p8f.m();
            m.c();
            p8f.t((p8f) m.b, j2);
            String str = cmfVar.l;
            if (str != null) {
                m.c();
                p8f.y((p8f) m.b, str);
            }
            String str2 = cmfVar.m;
            if (str2 != null) {
                m.c();
                p8f.u((p8f) m.b, str2);
            }
            x7f l = z7f.l();
            String str3 = cmf.o;
            l.c();
            z7f.n((z7f) l.b, str3);
            String str4 = cmfVar.g;
            l.c();
            z7f.m((z7f) l.b, str4);
            m.c();
            p8f.r((p8f) m.b, (z7f) l.a());
            sw2 sw2Var = cmfVar.a;
            a9f l2 = c9f.l();
            Object zza = sw2Var.zza();
            if (zza != null) {
                waf l3 = yaf.l();
                l3.c();
                yaf.m((yaf) l3.b, (String) zza);
                l2.c();
                c9f.m((c9f) l2.b, (yaf) l3.a());
            }
            String str5 = cmfVar.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    he6 he6Var = cmf.n;
                    Log.w(he6Var.a, he6Var.d("receiverSessionId %s is not valid for hash", str5), e);
                    j = 0;
                }
                l2.c();
                c9f.n((c9f) l2.b, j);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (nmf nmfVar : list3) {
                    nmfVar.getClass();
                    w8f l4 = y8f.l();
                    byte b = nmfVar.e;
                    l4.c();
                    y8f.p((y8f) l4.b, b);
                    l4.c();
                    y8f.m((y8f) l4.b, (int) (nmfVar.b - nmfVar.d));
                    Integer num = nmfVar.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l4.c();
                        y8f.n((y8f) l4.b, intValue);
                    }
                    Boolean bool = nmfVar.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l4.c();
                        y8f.o((y8f) l4.b, booleanValue);
                    }
                    arrayList.add((y8f) l4.a());
                }
                l2.c();
                c9f.o((c9f) l2.b, arrayList);
            }
            int i4 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (had hadVar : list2) {
                    hadVar.getClass();
                    j9f l5 = l9f.l();
                    l5.c();
                    l9f.m((l9f) l5.b, (int) (hadVar.b - hadVar.c));
                    byte b2 = hadVar.a;
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                i3 = 1;
                            } else {
                                i3 = 4;
                            }
                        } else {
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                    l5.c();
                    l9f.n((l9f) l5.b, i3);
                    arrayList2.add((l9f) l5.a());
                }
                i = 1;
                l2.c();
                c9f.q((c9f) l2.b, arrayList2);
            } else {
                i = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (def defVar : list) {
                    String str6 = defVar.a;
                    s8f l6 = u8f.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i2 = 13;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5);
                                int i6 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i2 = 22;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52);
                                int i62 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i2 = 15;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522);
                                int i622 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i2 = 19;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222);
                                int i6222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i2 = 23;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52222);
                                int i62222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i2 = 9;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522222);
                                int i622222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i2 = 21;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222222);
                                int i6222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i2 = 10;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52222222);
                                int i62222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i2 = 14;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522222222);
                                int i622222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i2 = 7;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222222222);
                                int i6222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i2 = 20;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52222222222);
                                int i62222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i2 = i4;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522222222222);
                                int i622222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i2 = 8;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222222222222);
                                int i6222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i2 = 3;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52222222222222);
                                int i62222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i2 = 6;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522222222222222);
                                int i622222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i2 = 5;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222222222222222);
                                int i6222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i2 = 4;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52222222222222222);
                                int i62222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i2 = 18;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522222222222222222);
                                int i622222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i2 = 16;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222222222222222222);
                                int i6222222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i2 = 12;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i52222222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i52222222222222222222);
                                int i62222222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i62222222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i72222222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i72222222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i2 = 11;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i522222222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i522222222222222222222);
                                int i622222222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i622222222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i722222222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i722222222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i2 = 17;
                                continue;
                                l6.c();
                                u8f.q((u8f) l6.b, i2);
                                int i5222222222222222222222 = (int) defVar.b;
                                l6.c();
                                u8f.m((u8f) l6.b, i5222222222222222222222);
                                int i6222222222222222222222 = defVar.c;
                                l6.c();
                                u8f.n((u8f) l6.b, i6222222222222222222222);
                                l6.c();
                                u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                                int i7222222222222222222222 = (int) (defVar.e - defVar.f);
                                l6.c();
                                u8f.p((u8f) l6.b, i7222222222222222222222);
                                arrayList3.add((u8f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                    }
                    i2 = i;
                    l6.c();
                    u8f.q((u8f) l6.b, i2);
                    int i52222222222222222222222 = (int) defVar.b;
                    l6.c();
                    u8f.m((u8f) l6.b, i52222222222222222222222);
                    int i62222222222222222222222 = defVar.c;
                    l6.c();
                    u8f.n((u8f) l6.b, i62222222222222222222222);
                    l6.c();
                    u8f.o((u8f) l6.b, (int) (defVar.d - defVar.f));
                    int i72222222222222222222222 = (int) (defVar.e - defVar.f);
                    l6.c();
                    u8f.p((u8f) l6.b, i72222222222222222222222);
                    arrayList3.add((u8f) l6.a());
                    m = m;
                    i4 = 2;
                }
                n8fVar = m;
                l2.c();
                c9f.p((c9f) l2.b, arrayList3);
            } else {
                n8fVar = m;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (tad tadVar : map.values()) {
                    tadVar.getClass();
                    e9f l7 = g9f.l();
                    byte b3 = tadVar.e;
                    l7.c();
                    g9f.p((g9f) l7.b, b3);
                    int i8 = tadVar.d.get();
                    l7.c();
                    g9f.m((g9f) l7.b, i8);
                    int i9 = (int) (tadVar.a - tadVar.c);
                    l7.c();
                    g9f.n((g9f) l7.b, i9);
                    l7.c();
                    g9f.o((g9f) l7.b, (int) (tadVar.b - tadVar.c));
                    arrayList4.add((g9f) l7.a());
                }
                l2.c();
                c9f.r((c9f) l2.b, arrayList4);
            }
            n8fVar.c();
            p8f.q((p8f) n8fVar.b, (c9f) l2.a());
            cmfVar.f.a((p8f) n8fVar.a(), 233);
            this.e = null;
        }
    }

    @Override
    public final Object a(Class cls) {
        if (((Set) this.b).contains(i09.a(cls))) {
            Object a = ((qq2) this.f).a(cls);
            if (!cls.equals(cy8.class)) {
                return a;
            }
            cy8 cy8Var = (cy8) a;
            return new Object();
        }
        iy8.g(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override
    public final int b(long j) {
        long[] jArr = (long[]) this.c;
        int b = gcc.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override
    public final Set c(i09 i09Var) {
        if (((Set) this.e).contains(i09Var)) {
            return ((qq2) this.f).c(i09Var);
        }
        iy8.g(i09Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override
    public final vw8 d(Class cls) {
        return g(i09.a(cls));
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        dx7 dx7Var = (dx7) this.f;
        s39 s39Var = dx7Var.K1;
        if (s39Var == null) {
            return;
        }
        s39Var.s(w49Var, true);
        dx7Var.N0(false);
    }

    @Override
    public final au7 f(i09 i09Var) {
        if (((Set) this.d).contains(i09Var)) {
            return ((qq2) this.f).f(i09Var);
        }
        iy8.g(i09Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override
    public final vw8 g(i09 i09Var) {
        if (((Set) this.c).contains(i09Var)) {
            return ((qq2) this.f).g(i09Var);
        }
        iy8.g(i09Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override
    public final Object mo21get() {
        switch (this.a) {
            case 5:
                return new rc3((Executor) ((uw8) this.b).mo21get(), (wf7) ((uw8) this.c).mo21get(), (pm3) ((ko9) this.d).mo21get(), (ds9) ((uw8) this.e).mo21get(), (ds9) ((uw8) this.f).mo21get());
            case 11:
                return new aa9((srb) ((tw8) this.b).mo21get(), (ri4) ((aj3) this.c).b, (tr) ((tw8) this.d).mo21get(), (ca9) ((tw8) this.e).mo21get(), (yba) ((tw8) this.f).mo21get());
            default:
                return new y9a((ji4) ((aj3) this.b).b, (ri4) ((aj3) this.c).b, (bba) ((tw8) this.d).mo21get(), (x44) ((tw8) this.e).mo21get(), (mx2) ((aj3) this.f).b);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final Object h(i09 i09Var) {
        if (((Set) this.b).contains(i09Var)) {
            return ((qq2) this.f).h(i09Var);
        }
        iy8.g(i09Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override
    public final long i(int i) {
        return ((long[]) this.c)[i];
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final List l(long j) {
        ne3[] ne3VarArr;
        n6c n6cVar = (n6c) this.b;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        n6cVar.g(j, n6cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        n6cVar.i(j, false, n6cVar.h, treeMap);
        n6cVar.h(j, (Map) this.d, hashMap, n6cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                q6c q6cVar = (q6c) hashMap.get(pair.first);
                q6cVar.getClass();
                arrayList2.add(new m43(null, null, null, decodeByteArray, q6cVar.c, 0, q6cVar.e, q6cVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, q6cVar.f, q6cVar.g, false, -16777216, q6cVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            q6c q6cVar2 = (q6c) hashMap.get(entry.getKey());
            q6cVar2.getClass();
            l43 l43Var = (l43) entry.getValue();
            CharSequence charSequence = l43Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ne3 ne3Var : (ne3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ne3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ne3Var), spannableStringBuilder.getSpanEnd(ne3Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = q6cVar2.c;
            int i10 = q6cVar2.d;
            l43Var.e = f;
            l43Var.f = i10;
            l43Var.g = q6cVar2.e;
            l43Var.h = q6cVar2.b;
            l43Var.l = q6cVar2.f;
            float f2 = q6cVar2.i;
            int i11 = q6cVar2.h;
            l43Var.k = f2;
            l43Var.j = i11;
            l43Var.p = q6cVar2.j;
            arrayList2.add(l43Var.a());
        }
        return arrayList2;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        Paint paint;
        tl0 tl0Var;
        Path path = (Path) this.c;
        xl0 xl0Var = (xl0) this.d;
        Paint paint2 = (Paint) this.e;
        dx7 dx7Var = (dx7) this.f;
        if (!z && (tl0Var = dx7Var.O1) != null && tl0Var.c()) {
            if (z) {
                xl0Var = (xl0) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            xl0Var.b(canvas, true);
            paint2.setAlpha((int) (i * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z) {
            xl0 xl0Var2 = (xl0) this.b;
            if (xl0Var2 == null) {
                xl0Var2 = new xl0(dx7Var.O1, dx7Var.J1.getReactionsWindow().c, 0, false);
                this.b = xl0Var2;
            }
            float f4 = -f2;
            float f5 = -f3;
            xl0Var2.e(f4, f5, dx7Var.getMeasuredWidth() + f4, dx7Var.getMeasuredHeight() + f5);
            paint = ((xl0) this.b).h;
        } else {
            float f6 = -f2;
            float f7 = -f3;
            xl0Var.e(f6, f7, dx7Var.getMeasuredWidth() + f6, dx7Var.getMeasuredHeight() + f7);
            paint = xl0Var.h;
        }
        paint.setAlpha(i);
        paint2.setAlpha((int) (i * 0.4f));
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, paint2);
    }

    @Override
    public final void o(boolean z, float f) {
        float B;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((ft9) this.f).d;
        ht9 ht9Var = (ht9) this.e;
        ht9 ht9Var2 = (ht9) this.c;
        ht9 ht9Var3 = (ht9) this.d;
        boolean isAttachedToWindow = ((uy9) this.b).isAttachedToWindow();
        if (f > 0.7f) {
            B = (((f - 0.7f) / 0.3f) * 4.0894464E9f) + 1.048576E8f;
        } else {
            B = c00.B(f, 0.7f, 1.0433331E8f, 524288.0f);
        }
        long j = B;
        if (f >= 1.0f) {
            ht9Var2.e(false, isAttachedToWindow);
            ht9Var3.e(false, isAttachedToWindow);
            ht9Var.e(true, isAttachedToWindow);
            hl.T3(ht9Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f == 0.0f) {
            ht9Var2.e(true, isAttachedToWindow);
            ht9Var3.e(false, isAttachedToWindow);
            ht9Var.e(false, isAttachedToWindow);
            hl.T3(ht9Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            ht9Var3.c(ob6.a0("UpToFileSize", null, 2131743478, hl.i0(j, true, false)), false, true);
            ht9Var2.e(false, isAttachedToWindow);
            ht9Var3.e(true, isAttachedToWindow);
            ht9Var.e(false, isAttachedToWindow);
            hl.T3(ht9Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z) {
            saveToGallerySettingsActivity.b0().c = j;
            saveToGallerySettingsActivity.c0();
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final int q() {
        return ((long[]) this.c).length;
    }

    public final byte[] r() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = nwc.b;
        BigInteger bigInteger3 = nwc.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] b = nwc.b(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] b2 = nwc.b(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] d = nwc.d(b2, bArr2, bArr3);
                byte[] d2 = nwc.d(b2, bArr);
                this.f = d;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    int i2 = i << 3;
                    arrayList.add(strArr[(int) ((((((((((d2[i2] & 127) << 56) | ((d2[i2 + 1] & 255) << 48)) | ((d2[i2 + 2] & 255) << 40)) | ((d2[i2 + 3] & 255) << 32)) | ((d2[i2 + 4] & 255) << 24)) | ((d2[i2 + 5] & 255) << 16)) | ((d2[i2 + 6] & 255) << 8)) | (d2[i2 + 7] & 255)) % 200)]);
                }
                this.d = arrayList;
                cc4.b("wear-auth: built answer; session " + nwc.c(bArr2) + " emojis=" + ((ArrayList) this.d));
                byte[] bArr4 = new byte[288];
                System.arraycopy(bArr2, 0, bArr4, 0, 16);
                System.arraycopy(bArr3, 0, bArr4, 16, 16);
                System.arraycopy(b, 0, bArr4, 32, 256);
                return bArr4;
            }
            lq5.j("peer pubkey out of range");
            return null;
        }
        grb.i("our pubkey invalid (extremely unlikely)");
        return null;
    }

    public final wld s() {
        String str;
        String str2;
        xve.i((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        K("actionToken", (String) this.f);
        String str3 = (String) this.c;
        String str4 = null;
        if (str3 == null) {
            str = null;
        } else {
            str = new String(str3);
        }
        if (str == null) {
            this.c = "AssistAction";
            K("name", "AssistAction");
        }
        String str5 = (String) this.d;
        if (str5 != null) {
            str4 = new String(str5);
        }
        if (str4 == null) {
            String valueOf = String.valueOf((String) this.f);
            if (valueOf.length() != 0) {
                str2 = "https://developers.google.com/actions?invocation=".concat(valueOf);
            } else {
                str2 = new String("https://developers.google.com/actions?invocation=");
            }
            this.d = str2;
            K("url", str2);
        }
        xve.i((String) this.c, "setObject is required before calling build().");
        xve.i((String) this.d, "setObject is required before calling build().");
        return new wld("AssistAction", (String) this.c, (String) this.d, null, new dgd(), (String) this.e, (Bundle) this.b);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((TextView) this.c).setAlpha(hl.R1(0.5f, 1.0f, ((fm0) this.e).e));
        ((av1) this.f).b(this);
    }

    public final void u(Canvas canvas, boolean z, boolean z2, int i, float f) {
        int i2;
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.f;
        Paint paint = (Paint) this.e;
        yx0 yx0Var = (yx0) this.b;
        Path path = (Path) this.d;
        if (z2) {
            i2 = 0;
        } else {
            i2 = (int) yx0Var.H;
        }
        int i3 = (int) (i2 * f);
        int L = hl.L(10.0f) * Math.min(1, i3 / hl.L(60.0f));
        if (i3 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f2 = L;
        fArr[7] = f2;
        fArr[6] = f2;
        fArr[5] = f2;
        fArr[4] = f2;
        path.rewind();
        rectF.set(0.0f, 0.0f, i, (yx0Var.getY() + yx0Var.getHeight()) - i3);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z) {
            paint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public final void v(View view) {
        if (view instanceof GLSurfaceView) {
            this.f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                v(viewGroup.getChildAt(i));
            }
        }
    }

    public final au7 w(Class cls) {
        return f(i09.a(cls));
    }

    public final void y(pt2 pt2Var) {
        tt ttVar = (tt) this.b;
        z05 z05Var = new z05(this, pt2Var);
        ttVar.getClass();
        xve.e("getMapAsync() must be called on the main thread");
        xq2 xq2Var = (xq2) ttVar.b;
        ko9 ko9Var = (ko9) xq2Var.a;
        if (ko9Var != null) {
            ko9Var.s(z05Var);
        } else {
            ((ArrayList) xq2Var.h).add(z05Var);
        }
    }

    @Override
    public final void n() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void v0(float f, int i) {
    }

    public am2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public am2(wae waeVar, ibd ibdVar, String str) {
        this.a = (byte) 25;
        this.b = waeVar;
        this.c = ibdVar;
        this.d = str;
        this.f = new uae(this, (byte) 4);
    }

    public am2(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.d = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.e = mp3.p;
                return;
            default:
                this.b = new Bundle();
                return;
        }
    }

    public am2(Context context) {
        this(context, new hm5(-1, 0, 0));
        this.a = (byte) 21;
    }

    public am2(Context context, ji4 ji4Var, ri4 ri4Var, fp fpVar, uf7 uf7Var) {
        this.a = (byte) 6;
        this.b = new h05(context, qa4.t, wn.g, g05.c);
        this.c = ji4Var;
        this.d = ri4Var;
        this.e = fpVar;
        this.f = uf7Var;
    }

    public am2(Context context, hm5 hm5Var) {
        this.a = (byte) 21;
        this.b = context;
        this.c = hm5Var;
        Q();
    }

    public am2(fq2 fq2Var, qq2 qq2Var) {
        this.a = (byte) 12;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<qe3> set = fq2Var.c;
        Set set2 = fq2Var.g;
        for (qe3 qe3Var : set) {
            byte b = qe3Var.c;
            byte b2 = qe3Var.b;
            boolean z = b == 0;
            i09 i09Var = qe3Var.a;
            if (z) {
                if (b2 == 2) {
                    hashSet4.add(i09Var);
                } else {
                    hashSet.add(i09Var);
                }
            } else if (b == 2) {
                hashSet3.add(i09Var);
            } else if (b2 == 2) {
                hashSet5.add(i09Var);
            } else {
                hashSet2.add(i09Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(i09.a(cy8.class));
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
        this.c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f = qq2Var;
    }

    public am2(n6c n6cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = (byte) 17;
        this.b = n6cVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        n6cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public am2(Activity activity, WallpapersListActivity wallpapersListActivity, qvc qvcVar) {
        this.a = (byte) 18;
        this.c = activity;
        this.d = wallpapersListActivity;
        this.e = qvcVar;
    }

    public am2(byte b, boolean z) {
        this.a = b;
    }

    public am2(byte[] bArr, byte[] bArr2, String str) {
        this.a = (byte) 19;
        this.b = bArr;
        this.c = bArr2;
        this.e = str;
    }

    public am2(av1 av1Var) {
        this.a = (byte) 3;
        this.f = av1Var;
        k43 k43Var = k43.h;
        this.d = new fm0(0, this, k43Var, 320L, true);
        this.e = new fm0(1, this, k43Var, 320L, true);
    }

    public am2(int i) {
        this.a = (byte) 20;
        this.b = new int[i];
        this.c = new int[i];
        this.f = new float[i];
        this.d = new float[i];
        this.e = new float[i];
    }

    public am2(ft9 ft9Var, uy9 uy9Var, ht9 ht9Var, ht9 ht9Var2, ht9 ht9Var3) {
        this.a = (byte) 14;
        this.f = ft9Var;
        this.b = uy9Var;
        this.c = ht9Var;
        this.d = ht9Var2;
        this.e = ht9Var3;
    }

    public am2(db3 db3Var, uif uifVar) {
        this.a = (byte) 4;
        this.b = db3Var;
        this.f = uifVar;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public am2(yx0 yx0Var) {
        this.a = (byte) 2;
        this.c = new RectF();
        this.f = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.b = yx0Var;
    }

    public am2(dx7 dx7Var, xl0 xl0Var, Paint paint) {
        this.a = (byte) 8;
        this.f = dx7Var;
        this.d = xl0Var;
        this.e = paint;
        this.c = new Path();
    }
}
