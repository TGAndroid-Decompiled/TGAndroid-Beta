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
public final class sm2 implements g94, mv8, uj5, u29, lv8, ir2, cx9, lcb {
    public static final ju6 h = new ju6((byte) 4);
    public final byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public sm2(int[] iArr, int i, nw7[] nw7VarArr) {
        rm2 rm2Var;
        int i2;
        this.a = (byte) 0;
        this.f = new float[3];
        this.e = nw7VarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int C = (C(Color.red(i4), 8, 5) << 10) | (C(Color.green(i4), 8, 5) << 5) | C(Color.blue(i4), 8, 5);
            iArr[i3] = C;
            iArr2[C] = iArr2[C] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int rgb = Color.rgb(C((i6 >> 10) & 31, 5, 8), C((i6 >> 5) & 31, 5, 8), C(i6 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                on2.j(rgb, fArr);
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
                ((ArrayList) this.d).add(new pw7(Color.rgb(C((i10 >> 10) & 31, 5, 8), C((i10 >> 5) & 31, 5, 8), C(i10 & 31, 5, 8)), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, h);
        priorityQueue.offer(new rm2(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i && (rm2Var = (rm2) priorityQueue.poll()) != null) {
            int i11 = rm2Var.b;
            int i12 = rm2Var.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            }
            sm2 sm2Var = rm2Var.j;
            if ((i11 + 1) - i12 > 1) {
                int i13 = rm2Var.e - rm2Var.d;
                int i14 = rm2Var.g - rm2Var.f;
                int i15 = rm2Var.i - rm2Var.h;
                if (i13 >= i14 && i13 >= i15) {
                    i2 = -3;
                } else if (i14 >= i13 && i14 >= i15) {
                    i2 = -2;
                } else {
                    i2 = -1;
                }
                int[] iArr4 = (int[]) sm2Var.b;
                int[] iArr5 = (int[]) sm2Var.c;
                B(i2, i12, i11, iArr4);
                Arrays.sort(iArr4, i12, rm2Var.b + 1);
                B(i2, i12, rm2Var.b, iArr4);
                int i16 = rm2Var.c / 2;
                int i17 = 0;
                int i18 = i12;
                while (true) {
                    int i19 = rm2Var.b;
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
                rm2 rm2Var2 = new rm2(sm2Var, i12 + 1, rm2Var.b);
                rm2Var.b = i12;
                rm2Var.a();
                priorityQueue.offer(rm2Var2);
                priorityQueue.offer(rm2Var);
            } else {
                dq9.m("Can not split a box with only 1 color");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            rm2 rm2Var3 = (rm2) it.next();
            sm2 sm2Var2 = rm2Var3.j;
            int[] iArr6 = (int[]) sm2Var2.b;
            int[] iArr7 = (int[]) sm2Var2.c;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = rm2Var3.a; i24 <= rm2Var3.b; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            pw7 pw7Var = new pw7(Color.rgb(C(Math.round(i20 / f), 5, 8), C(Math.round(i22 / f), 5, 8), C(Math.round(i23 / f), 5, 8)), i21);
            if (!O(pw7Var.b())) {
                arrayList.add(pw7Var);
            }
        }
        this.d = arrayList;
    }

    public static void B(int i, int i2, int i3, int[] iArr) {
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

    public static int C(int i, int i2, int i3) {
        int i4;
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }

    public static void R(sm2 sm2Var, yjf yjfVar) {
        njf S;
        byte b = yjfVar.e;
        if (b == 2 && ((njf) sm2Var.e) != null) {
            sm2Var.T();
        }
        if (b == 2) {
            S = new njf((i8e) sm2Var.b, (String) sm2Var.d);
            sm2Var.e = S;
        } else {
            S = sm2Var.S();
            sm2Var.e = S;
        }
        ite.h(S);
        yjfVar.d = S.h;
        S.b.add(yjfVar);
    }

    public static Exception y(Task task) {
        if (task.getException() != null) {
            return task.getException();
        }
        return new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public final sdb A(int i) {
        sdb sdbVar;
        HashMap hashMap = (HashMap) this.c;
        sdb sdbVar2 = (sdb) hashMap.get(Integer.valueOf(i));
        if (sdbVar2 != null) {
            return sdbVar2;
        }
        final lx6 lx6Var = (lx6) this.e;
        lx6Var.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            sdbVar = new sdb() {
                                @Override
                                public final Object get() {
                                    byte b = r3;
                                    lx6 lx6Var2 = lx6Var;
                                    Object obj = this;
                                    switch (b) {
                                        case 0:
                                            return cd3.e((Class) obj, lx6Var2);
                                        case 1:
                                            return cd3.e((Class) obj, lx6Var2);
                                        case 2:
                                            return cd3.e((Class) obj, lx6Var2);
                                        default:
                                            return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                                    }
                                }
                            };
                        } else {
                            u36.j(hg9.j(i, "Unrecognized contentType: "));
                            return null;
                        }
                    } else {
                        sdbVar = new ad3(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(qz6.class), (byte) 0);
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(qz6.class);
                    sdbVar = new sdb() {
                        @Override
                        public final Object get() {
                            byte b = r3;
                            lx6 lx6Var2 = lx6Var;
                            Object obj = asSubclass;
                            switch (b) {
                                case 0:
                                    return cd3.e((Class) obj, lx6Var2);
                                case 1:
                                    return cd3.e((Class) obj, lx6Var2);
                                case 2:
                                    return cd3.e((Class) obj, lx6Var2);
                                default:
                                    return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(qz6.class);
                sdbVar = new sdb() {
                    @Override
                    public final Object get() {
                        byte b = r3;
                        lx6 lx6Var2 = lx6Var;
                        Object obj = asSubclass2;
                        switch (b) {
                            case 0:
                                return cd3.e((Class) obj, lx6Var2);
                            case 1:
                                return cd3.e((Class) obj, lx6Var2);
                            case 2:
                                return cd3.e((Class) obj, lx6Var2);
                            default:
                                return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(qz6.class);
            sdbVar = new sdb() {
                @Override
                public final Object get() {
                    byte b = r3;
                    lx6 lx6Var2 = lx6Var;
                    Object obj = asSubclass3;
                    switch (b) {
                        case 0:
                            return cd3.e((Class) obj, lx6Var2);
                        case 1:
                            return cd3.e((Class) obj, lx6Var2);
                        case 2:
                            return cd3.e((Class) obj, lx6Var2);
                        default:
                            return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i), sdbVar);
        return sdbVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((TextView) this.c).setAlpha(gm.R1(0.5f, 1.0f, ((fn0) this.e).e));
        ((zv1) this.f).b(this);
    }

    public final void E(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm2.E(int, int, android.content.Intent):void");
    }

    public final void F() {
        su suVar = (su) this.b;
        pr2 pr2Var = (pr2) suVar.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            pr2Var.getClass();
            pr2Var.A(new f4d(pr2Var, (byte) 0));
            if (((wm9) pr2Var.a) == null) {
                pr2.y(suVar);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void G() {
        pr2 pr2Var = (pr2) ((su) this.b).b;
        wm9 wm9Var = (wm9) pr2Var.a;
        if (wm9Var != null) {
            try {
                mye myeVar = (mye) wm9Var.c;
                myeVar.V(myeVar.R(), 5);
                return;
            } catch (RemoteException e) {
                i2d.h(e);
                return;
            }
        }
        while (!((LinkedList) pr2Var.b).isEmpty() && ((f4d) ((LinkedList) pr2Var.b).getLast()).a() >= 1) {
            ((LinkedList) pr2Var.b).removeLast();
        }
    }

    public final void H() {
        pr2 pr2Var = (pr2) ((su) this.b).b;
        wm9 wm9Var = (wm9) pr2Var.a;
        if (wm9Var != null) {
            try {
                mye myeVar = (mye) wm9Var.c;
                myeVar.V(myeVar.R(), 4);
                return;
            } catch (RemoteException e) {
                i2d.h(e);
                return;
            }
        }
        while (!((LinkedList) pr2Var.b).isEmpty() && ((f4d) ((LinkedList) pr2Var.b).getLast()).a() >= 5) {
            ((LinkedList) pr2Var.b).removeLast();
        }
    }

    public final void I() {
        pr2 pr2Var = (pr2) ((su) this.b).b;
        pr2Var.getClass();
        pr2Var.A(new f4d(pr2Var, (byte) 1));
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
            j68 j68Var = new j68(2, false, false, null);
            j68Var.y = false;
            j68Var.W = new et8(this, (byte) 22);
            wallpapersListActivity.presentFragment(j68Var);
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
                    v6f.a(sb.toString());
                } else {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i2);
                        sb2.append(" is too long, truncating string.");
                        v6f.a(sb2.toString());
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
                    v6f.a("Input Array of elements is too big, cutting off.");
                    objArr = Arrays.copyOf(objArr, 100);
                }
                bundle.putStringArray(str, (String[]) objArr);
                return;
            }
            return;
        }
        v6f.a("String array is empty and is ignored by put method.");
    }

    public final Task L() {
        Task forException;
        int i;
        boolean z = z();
        if (z && ((mf7) this.f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new op7("Firebase-Messaging-Network-Io"));
            return ((si4) ((ti4) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final sm2 b;

                {
                    this.b = this;
                }

                @Override
                public final Object then(Task task) {
                    byte b = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    sm2 sm2Var = this.b;
                    switch (b) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(sm2.y(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            li4 li4Var = (li4) sm2Var.c;
                            li4Var.a();
                            zi4 zi4Var = li4Var.c;
                            String str3 = zi4Var.a;
                            li4Var.a();
                            m79 m79Var = new m79(mf7.b(li4Var), zi4Var.b, str3, str, str2);
                            ua4 ua4Var = (ua4) sm2Var.b;
                            bib b2 = cib.b();
                            b2.c = new o94[]{pjd.a};
                            b2.a = new xab(ua4Var, m79Var, false, (byte) 18);
                            b2.d = (char) 39001;
                            return ua4Var.e(0, b2.a()).continueWith(executorService, new ca4(str, (byte) 1));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(sm2.y(task));
                            }
                            return ((si4) ((ti4) sm2Var.d)).e().continueWithTask(executorService, new ca4(sm2Var, ((xa0) task.getResult()).a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final sm2 b;

                {
                    this.b = this;
                }

                @Override
                public final Object then(Task task) {
                    byte b = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    sm2 sm2Var = this.b;
                    switch (b) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(sm2.y(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            li4 li4Var = (li4) sm2Var.c;
                            li4Var.a();
                            zi4 zi4Var = li4Var.c;
                            String str3 = zi4Var.a;
                            li4Var.a();
                            m79 m79Var = new m79(mf7.b(li4Var), zi4Var.b, str3, str, str2);
                            ua4 ua4Var = (ua4) sm2Var.b;
                            bib b2 = cib.b();
                            b2.c = new o94[]{pjd.a};
                            b2.a = new xab(ua4Var, m79Var, false, (byte) 18);
                            b2.d = (char) 39001;
                            return ua4Var.e(0, b2.a()).continueWith(executorService, new ca4(str, (byte) 1));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(sm2.y(task));
                            }
                            return ((si4) ((ti4) sm2Var.d)).e().continueWithTask(executorService, new ca4(sm2Var, ((xa0) task.getResult()).a));
                    }
                }
            });
        }
        eq eqVar = (eq) this.e;
        String b = mf7.b((li4) eqVar.a);
        Bundle bundle = new Bundle();
        try {
            eqVar.j(b, bundle, z);
            fo9 fo9Var = (fo9) eqVar.c;
            gp3 gp3Var = gp3.d;
            ajf ajfVar = fo9Var.c;
            if (ajfVar.b() < 12000000) {
                if (ajfVar.a() != 0) {
                    forException = fo9Var.d(bundle).continueWithTask(gp3Var, new rhb(fo9Var, bundle, false, (byte) 24));
                } else {
                    forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
            } else {
                jif t = jif.t(fo9Var.b);
                synchronized (t) {
                    i = t.a;
                    t.a = i + 1;
                }
                forException = t.u(new fdf(i, 1, bundle, (byte) 1)).continueWith(gp3Var, h8d.b);
            }
        } catch (InterruptedException | ExecutionException e) {
            forException = Tasks.forException(e);
        }
        return forException.continueWith(new kc((byte) 1), new zo4(eqVar));
    }

    public final void M() {
        wb3 wb3Var = (wb3) this.b;
        synchronized (wb3Var) {
            wb3Var.d = true;
        }
    }

    public final Set N(Class cls) {
        return c(yy8.a(cls));
    }

    public final boolean O(float[] fArr) {
        nw7[] nw7VarArr = (nw7[]) this.e;
        if (nw7VarArr != null && nw7VarArr.length > 0) {
            for (nw7 nw7Var : nw7VarArr) {
                nw7Var.getClass();
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
        b1e b1eVar;
        int i;
        Context context = (Context) this.b;
        if (uri == null) {
            Q();
        } else if (!uri.equals((Uri) this.d)) {
            Q();
            this.d = uri;
            em5 em5Var = (em5) this.c;
            int i2 = em5Var.b;
            if (i2 != 0 && (i = em5Var.c) != 0) {
                b1eVar = new b1e(context, i2, i, this);
                this.e = b1eVar;
            } else {
                b1eVar = new b1e(context, 0, 0, this);
                this.e = b1eVar;
            }
            Uri uri2 = (Uri) this.d;
            ite.h(uri2);
            b1eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public final void Q() {
        b1e b1eVar = (b1e) this.e;
        if (b1eVar != null) {
            b1eVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    public final njf S() {
        if (((njf) this.e) == null) {
            njf njfVar = new njf((i8e) this.b, (String) this.d);
            this.e = njfVar;
            njfVar.b(1);
        }
        return (njf) this.e;
    }

    public final void T() {
        int i;
        y5f y5fVar;
        int i2;
        int i3;
        long j;
        njf njfVar = (njf) this.e;
        if (njfVar != null) {
            Map map = njfVar.e;
            List<obf> list = njfVar.d;
            List<q7d> list2 = njfVar.c;
            List<yjf> list3 = njfVar.b;
            me1 me1Var = njfVar.j;
            if (me1Var != null) {
                me1Var.l = null;
                njfVar.j = null;
            }
            long j2 = njfVar.i;
            y5f m = a6f.m();
            m.c();
            a6f.t((a6f) m.b, j2);
            String str = njfVar.l;
            if (str != null) {
                m.c();
                a6f.y((a6f) m.b, str);
            }
            String str2 = njfVar.m;
            if (str2 != null) {
                m.c();
                a6f.u((a6f) m.b, str2);
            }
            h5f l = k5f.l();
            String str3 = njf.o;
            l.c();
            k5f.n((k5f) l.b, str3);
            String str4 = njfVar.g;
            l.c();
            k5f.m((k5f) l.b, str4);
            m.c();
            a6f.r((a6f) m.b, (k5f) l.a());
            ix2 ix2Var = njfVar.a;
            l6f l2 = n6f.l();
            Object zza = ix2Var.zza();
            if (zza != null) {
                h8f l3 = j8f.l();
                l3.c();
                j8f.m((j8f) l3.b, (String) zza);
                l2.c();
                n6f.m((n6f) l2.b, (j8f) l3.a());
            }
            String str5 = njfVar.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    ce6 ce6Var = njf.n;
                    Log.w(ce6Var.a, ce6Var.d("receiverSessionId %s is not valid for hash", str5), e);
                    j = 0;
                }
                l2.c();
                n6f.n((n6f) l2.b, j);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (yjf yjfVar : list3) {
                    yjfVar.getClass();
                    h6f l4 = j6f.l();
                    byte b = yjfVar.e;
                    l4.c();
                    j6f.p((j6f) l4.b, b);
                    l4.c();
                    j6f.m((j6f) l4.b, (int) (yjfVar.b - yjfVar.d));
                    Integer num = yjfVar.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l4.c();
                        j6f.n((j6f) l4.b, intValue);
                    }
                    Boolean bool = yjfVar.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l4.c();
                        j6f.o((j6f) l4.b, booleanValue);
                    }
                    arrayList.add((j6f) l4.a());
                }
                l2.c();
                n6f.o((n6f) l2.b, arrayList);
            }
            int i4 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (q7d q7dVar : list2) {
                    q7dVar.getClass();
                    u6f l5 = w6f.l();
                    l5.c();
                    w6f.m((w6f) l5.b, (int) (q7dVar.b - q7dVar.c));
                    byte b2 = q7dVar.a;
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
                    w6f.n((w6f) l5.b, i3);
                    arrayList2.add((w6f) l5.a());
                }
                i = 1;
                l2.c();
                n6f.q((n6f) l2.b, arrayList2);
            } else {
                i = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (obf obfVar : list) {
                    String str6 = obfVar.a;
                    d6f l6 = f6f.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i2 = 13;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5);
                                int i6 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i2 = 22;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52);
                                int i62 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i2 = 15;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522);
                                int i622 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i2 = 19;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222);
                                int i6222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i2 = 23;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52222);
                                int i62222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i2 = 9;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522222);
                                int i622222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i2 = 21;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222222);
                                int i6222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i2 = 10;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52222222);
                                int i62222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i2 = 14;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522222222);
                                int i622222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i2 = 7;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222222222);
                                int i6222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i2 = 20;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52222222222);
                                int i62222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i2 = i4;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522222222222);
                                int i622222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i2 = 8;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222222222222);
                                int i6222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i2 = 3;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52222222222222);
                                int i62222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i2 = 6;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522222222222222);
                                int i622222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i2 = 5;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222222222222222);
                                int i6222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i2 = 4;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52222222222222222);
                                int i62222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i2 = 18;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522222222222222222);
                                int i622222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i2 = 16;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222222222222222222);
                                int i6222222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i2 = 12;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i52222222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i52222222222222222222);
                                int i62222222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i62222222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i72222222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i72222222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i2 = 11;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i522222222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i522222222222222222222);
                                int i622222222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i622222222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i722222222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i722222222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i2 = 17;
                                continue;
                                l6.c();
                                f6f.q((f6f) l6.b, i2);
                                int i5222222222222222222222 = (int) obfVar.b;
                                l6.c();
                                f6f.m((f6f) l6.b, i5222222222222222222222);
                                int i6222222222222222222222 = obfVar.c;
                                l6.c();
                                f6f.n((f6f) l6.b, i6222222222222222222222);
                                l6.c();
                                f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                                int i7222222222222222222222 = (int) (obfVar.e - obfVar.f);
                                l6.c();
                                f6f.p((f6f) l6.b, i7222222222222222222222);
                                arrayList3.add((f6f) l6.a());
                                m = m;
                                i4 = 2;
                            }
                            break;
                    }
                    i2 = i;
                    l6.c();
                    f6f.q((f6f) l6.b, i2);
                    int i52222222222222222222222 = (int) obfVar.b;
                    l6.c();
                    f6f.m((f6f) l6.b, i52222222222222222222222);
                    int i62222222222222222222222 = obfVar.c;
                    l6.c();
                    f6f.n((f6f) l6.b, i62222222222222222222222);
                    l6.c();
                    f6f.o((f6f) l6.b, (int) (obfVar.d - obfVar.f));
                    int i72222222222222222222222 = (int) (obfVar.e - obfVar.f);
                    l6.c();
                    f6f.p((f6f) l6.b, i72222222222222222222222);
                    arrayList3.add((f6f) l6.a());
                    m = m;
                    i4 = 2;
                }
                y5fVar = m;
                l2.c();
                n6f.p((n6f) l2.b, arrayList3);
            } else {
                y5fVar = m;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (c8d c8dVar : map.values()) {
                    c8dVar.getClass();
                    p6f l7 = r6f.l();
                    byte b3 = c8dVar.e;
                    l7.c();
                    r6f.p((r6f) l7.b, b3);
                    int i8 = c8dVar.d.get();
                    l7.c();
                    r6f.m((r6f) l7.b, i8);
                    int i9 = (int) (c8dVar.a - c8dVar.c);
                    l7.c();
                    r6f.n((r6f) l7.b, i9);
                    l7.c();
                    r6f.o((r6f) l7.b, (int) (c8dVar.b - c8dVar.c));
                    arrayList4.add((r6f) l7.a());
                }
                l2.c();
                n6f.r((n6f) l2.b, arrayList4);
            }
            y5fVar.c();
            a6f.q((a6f) y5fVar.b, (n6f) l2.a());
            njfVar.f.a((a6f) y5fVar.a(), 233);
            this.e = null;
        }
    }

    @Override
    public final Object a(Class cls) {
        if (((Set) this.b).contains(yy8.a(cls))) {
            Object a = ((ir2) this.f).a(cls);
            if (!cls.equals(uw8.class)) {
                return a;
            }
            uw8 uw8Var = (uw8) a;
            return new Object();
        }
        i98.h(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override
    public final int b(long j) {
        long[] jArr = (long[]) this.c;
        int b = hac.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override
    public final Set c(yy8 yy8Var) {
        if (((Set) this.e).contains(yy8Var)) {
            return ((ir2) this.f).c(yy8Var);
        }
        i98.h(yy8Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override
    public final nv8 d(Class cls) {
        return f(yy8.a(cls));
    }

    @Override
    public final xs7 e(yy8 yy8Var) {
        if (((Set) this.d).contains(yy8Var)) {
            return ((ir2) this.f).e(yy8Var);
        }
        i98.h(yy8Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override
    public final nv8 f(yy8 yy8Var) {
        if (((Set) this.c).contains(yy8Var)) {
            return ((ir2) this.f).f(yy8Var);
        }
        i98.h(yy8Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        xv7 xv7Var = (xv7) this.f;
        g29 g29Var = xv7Var.Q1;
        if (g29Var == null) {
            return;
        }
        g29Var.s(k39Var, true);
        xv7Var.O0(false);
    }

    @Override
    public final Object mo8get() {
        switch (this.a) {
            case 6:
                return new kd3((Executor) ((mv8) this.b).mo8get(), (of7) ((mv8) this.c).mo8get(), (in3) ((wm9) this.d).mo8get(), (mq9) ((mv8) this.e).mo8get(), (mq9) ((mv8) this.f).mo8get());
            case 12:
                return new p89((tpb) ((lv8) this.b).mo8get(), (ti4) ((lq5) this.c).a, (ss) ((lv8) this.d).mo8get(), (r89) ((lv8) this.e).mo8get(), (haa) ((lv8) this.f).mo8get());
            default:
                return new i8a((li4) ((lq5) this.b).a, (ti4) ((lq5) this.c).a, (l9a) ((lv8) this.d).mo8get(), (m54) ((lv8) this.e).mo8get(), (cy2) ((lq5) this.f).a);
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final Object i(yy8 yy8Var) {
        if (((Set) this.b).contains(yy8Var)) {
            return ((ir2) this.f).i(yy8Var);
        }
        i98.h(yy8Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public final byte[] j() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = auc.b;
        BigInteger bigInteger3 = auc.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] b = auc.b(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] b2 = auc.b(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] d = auc.d(b2, bArr2, bArr3);
                byte[] d2 = auc.d(b2, bArr);
                this.f = d;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    int i2 = i << 3;
                    arrayList.add(strArr[(int) ((((((((((d2[i2] & 127) << 56) | ((d2[i2 + 1] & 255) << 48)) | ((d2[i2 + 2] & 255) << 40)) | ((d2[i2 + 3] & 255) << 32)) | ((d2[i2 + 4] & 255) << 24)) | ((d2[i2 + 5] & 255) << 16)) | ((d2[i2 + 6] & 255) << 8)) | (d2[i2 + 7] & 255)) % 200)]);
                }
                this.d = arrayList;
                fc4.b("wear-auth: built answer; session " + auc.c(bArr2) + " emojis=" + ((ArrayList) this.d));
                byte[] bArr4 = new byte[288];
                System.arraycopy(bArr2, 0, bArr4, 0, 16);
                System.arraycopy(bArr3, 0, bArr4, 16, 16);
                System.arraycopy(b, 0, bArr4, 32, 256);
                return bArr4;
            }
            u36.j("peer pubkey out of range");
            return null;
        }
        dq9.m("our pubkey invalid (extremely unlikely)");
        return null;
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final long k(int i) {
        return ((long[]) this.c)[i];
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        Paint paint;
        sm0 sm0Var;
        Path path = (Path) this.c;
        wm0 wm0Var = (wm0) this.d;
        Paint paint2 = (Paint) this.e;
        xv7 xv7Var = (xv7) this.f;
        if (!z && (sm0Var = xv7Var.U1) != null && sm0Var.c()) {
            if (z) {
                wm0Var = (wm0) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            wm0Var.b(canvas, true);
            paint2.setAlpha((int) (i * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z) {
            wm0 wm0Var2 = (wm0) this.b;
            if (wm0Var2 == null) {
                wm0Var2 = new wm0(xv7Var.U1, xv7Var.P1.getReactionsWindow().c, 0, false);
                this.b = wm0Var2;
            }
            float f4 = -f2;
            float f5 = -f3;
            wm0Var2.e(f4, f5, xv7Var.getMeasuredWidth() + f4, xv7Var.getMeasuredHeight() + f5);
            paint = ((wm0) this.b).h;
        } else {
            float f6 = -f2;
            float f7 = -f3;
            wm0Var.e(f6, f7, xv7Var.getMeasuredWidth() + f6, xv7Var.getMeasuredHeight() + f7);
            paint = wm0Var.h;
        }
        paint.setAlpha(i);
        paint2.setAlpha((int) (i * 0.4f));
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, paint2);
    }

    @Override
    public final void n(boolean z, float f) {
        float A;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((or9) this.f).d;
        qr9 qr9Var = (qr9) this.e;
        qr9 qr9Var2 = (qr9) this.c;
        qr9 qr9Var3 = (qr9) this.d;
        boolean isAttachedToWindow = ((dx9) this.b).isAttachedToWindow();
        if (f > 0.7f) {
            A = (((f - 0.7f) / 0.3f) * 4.0894464E9f) + 1.048576E8f;
        } else {
            A = b10.A(f, 0.7f, 1.0433331E8f, 524288.0f);
        }
        long j = A;
        if (f >= 1.0f) {
            qr9Var2.e(false, isAttachedToWindow);
            qr9Var3.e(false, isAttachedToWindow);
            qr9Var.e(true, isAttachedToWindow);
            gm.T3(qr9Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f == 0.0f) {
            qr9Var2.e(true, isAttachedToWindow);
            qr9Var3.e(false, isAttachedToWindow);
            qr9Var.e(false, isAttachedToWindow);
            gm.T3(qr9Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            qr9Var3.c(jb6.a0("UpToFileSize", null, 2131743510, gm.i0(j, true, false)), false, true);
            qr9Var2.e(false, isAttachedToWindow);
            qr9Var3.e(true, isAttachedToWindow);
            qr9Var.e(false, isAttachedToWindow);
            gm.T3(qr9Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z) {
            saveToGallerySettingsActivity.c0().c = j;
            saveToGallerySettingsActivity.d0();
        }
    }

    @Override
    public final List p(long j) {
        ff3[] ff3VarArr;
        n4c n4cVar = (n4c) this.b;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        n4cVar.g(j, n4cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        n4cVar.i(j, false, n4cVar.h, treeMap);
        n4cVar.h(j, (Map) this.d, hashMap, n4cVar.h, treeMap);
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
                q4c q4cVar = (q4c) hashMap.get(pair.first);
                q4cVar.getClass();
                arrayList2.add(new f53(null, null, null, decodeByteArray, q4cVar.c, 0, q4cVar.e, q4cVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, q4cVar.f, q4cVar.g, false, -16777216, q4cVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            q4c q4cVar2 = (q4c) hashMap.get(entry.getKey());
            q4cVar2.getClass();
            e53 e53Var = (e53) entry.getValue();
            CharSequence charSequence = e53Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ff3 ff3Var : (ff3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ff3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ff3Var), spannableStringBuilder.getSpanEnd(ff3Var), (CharSequence) "");
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
            float f = q4cVar2.c;
            int i10 = q4cVar2.d;
            e53Var.e = f;
            e53Var.f = i10;
            e53Var.g = q4cVar2.e;
            e53Var.h = q4cVar2.b;
            e53Var.l = q4cVar2.f;
            float f2 = q4cVar2.i;
            int i11 = q4cVar2.h;
            e53Var.k = f2;
            e53Var.j = i11;
            e53Var.p = q4cVar2.j;
            arrayList2.add(e53Var.a());
        }
        return arrayList2;
    }

    @Override
    public final int q() {
        return ((long[]) this.c).length;
    }

    public final gjd r() {
        String str;
        String str2;
        ite.i((String) this.f, "setActionToken is required before calling build().");
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
        ite.i((String) this.c, "setObject is required before calling build().");
        ite.i((String) this.d, "setObject is required before calling build().");
        return new gjd("AssistAction", (String) this.c, (String) this.d, null, new mdd(), (String) this.e, (Bundle) this.b);
    }

    @Override
    public final boolean s() {
        return true;
    }

    public final void t(Canvas canvas, boolean z, boolean z2, int i, float f) {
        int i2;
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.f;
        Paint paint = (Paint) this.e;
        xy0 xy0Var = (xy0) this.b;
        Path path = (Path) this.d;
        if (z2) {
            i2 = 0;
        } else {
            i2 = (int) xy0Var.H;
        }
        int i3 = (int) (i2 * f);
        int L = gm.L(10.0f) * Math.min(1, i3 / gm.L(60.0f));
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
        rectF.set(0.0f, 0.0f, i, (xy0Var.getY() + xy0Var.getHeight()) - i3);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z) {
            paint.setShadowLayer(gm.L(2.0f), 0.0f, gm.L(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public final void u(View view) {
        if (view instanceof GLSurfaceView) {
            this.f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                u(viewGroup.getChildAt(i));
            }
        }
    }

    public final xs7 v(Class cls) {
        return e(yy8.a(cls));
    }

    public final void w(gu2 gu2Var) {
        su suVar = (su) this.b;
        u05 u05Var = new u05(this, gu2Var);
        suVar.getClass();
        ite.e("getMapAsync() must be called on the main thread");
        pr2 pr2Var = (pr2) suVar.b;
        wm9 wm9Var = (wm9) pr2Var.a;
        if (wm9Var != null) {
            wm9Var.s(u05Var);
        } else {
            ((ArrayList) pr2Var.h).add(u05Var);
        }
    }

    public final boolean z() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        li4 li4Var = (li4) this.c;
        li4Var.a();
        Context context = li4Var.a;
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

    @Override
    public final void o() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void V(float f, int i) {
    }

    public sm2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public sm2(i8e i8eVar, r8d r8dVar, String str) {
        this.a = (byte) 26;
        this.b = i8eVar;
        this.c = r8dVar;
        this.d = str;
        this.f = new fkd(this, (byte) 7);
    }

    public sm2(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.d = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.e = fq3.p;
                return;
            default:
                this.b = new Bundle();
                return;
        }
    }

    public sm2(Context context) {
        this(context, new em5(-1, 0, 0));
        this.a = (byte) 22;
    }

    public sm2(Context context, li4 li4Var, ti4 ti4Var, eq eqVar, mf7 mf7Var) {
        this.a = (byte) 7;
        this.b = new c05(context, ua4.t, wo.g, b05.c);
        this.c = li4Var;
        this.d = ti4Var;
        this.e = eqVar;
        this.f = mf7Var;
    }

    public sm2(Context context, em5 em5Var) {
        this.a = (byte) 22;
        this.b = context;
        this.c = em5Var;
        Q();
    }

    public sm2(xq2 xq2Var, ir2 ir2Var) {
        this.a = (byte) 13;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<if3> set = xq2Var.c;
        Set set2 = xq2Var.g;
        for (if3 if3Var : set) {
            byte b = if3Var.c;
            byte b2 = if3Var.b;
            boolean z = b == 0;
            yy8 yy8Var = if3Var.a;
            if (z) {
                if (b2 == 2) {
                    hashSet4.add(yy8Var);
                } else {
                    hashSet.add(yy8Var);
                }
            } else if (b == 2) {
                hashSet3.add(yy8Var);
            } else if (b2 == 2) {
                hashSet5.add(yy8Var);
            } else {
                hashSet2.add(yy8Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(yy8.a(uw8.class));
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
        this.c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f = ir2Var;
    }

    public sm2(n4c n4cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = (byte) 18;
        this.b = n4cVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        n4cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public sm2(Activity activity, WallpapersListActivity wallpapersListActivity, etc etcVar) {
        this.a = (byte) 19;
        this.c = activity;
        this.d = wallpapersListActivity;
        this.e = etcVar;
    }

    public sm2(byte b, boolean z) {
        this.a = b;
    }

    public sm2(byte[] bArr, byte[] bArr2, String str) {
        this.a = (byte) 20;
        this.b = bArr;
        this.c = bArr2;
        this.e = str;
    }

    public sm2(zv1 zv1Var) {
        this.a = (byte) 4;
        this.f = zv1Var;
        d53 d53Var = d53.h;
        this.d = new fn0(0, this, d53Var, 320L, true);
        this.e = new fn0(1, this, d53Var, 320L, true);
    }

    public sm2(int i) {
        this.a = (byte) 21;
        this.b = new int[i];
        this.c = new int[i];
        this.f = new float[i];
        this.d = new float[i];
        this.e = new float[i];
    }

    public sm2(or9 or9Var, dx9 dx9Var, qr9 qr9Var, qr9 qr9Var2, qr9 qr9Var3) {
        this.a = (byte) 15;
        this.f = or9Var;
        this.b = dx9Var;
        this.c = qr9Var;
        this.d = qr9Var2;
        this.e = qr9Var3;
    }

    public sm2(wb3 wb3Var, fgf fgfVar) {
        this.a = (byte) 5;
        this.b = wb3Var;
        this.f = fgfVar;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public sm2(xy0 xy0Var) {
        this.a = (byte) 3;
        this.c = new RectF();
        this.f = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.b = xy0Var;
    }

    public sm2(xv7 xv7Var, wm0 wm0Var, Paint paint) {
        this.a = (byte) 9;
        this.f = xv7Var;
        this.d = wm0Var;
        this.e = paint;
        this.c = new Path();
    }
}
