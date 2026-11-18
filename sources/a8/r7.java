package a8;

import a8.r7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.dz0;
import org.telegram.ui.nd0;
import org.telegram.ui.qm0;
import org.telegram.ui.yc1;
public final class r7 implements ib.b, ui0, c4.d, te.b, org.telegram.messenger.xa, xm0, q5.b, u9.b {
    public final int f616a;
    public Object f617b;
    public Object f618c;
    public Object d;
    public Object f619e;
    public Object f620f;

    public r7(int i7, byte b10) {
        this.f616a = i7;
    }

    public static void O(r7 r7Var, com.google.android.gms.internal.cast.s6 s6Var) {
        int i7 = s6Var.f6662e;
        if (i7 == 2 && ((com.google.android.gms.internal.cast.r6) r7Var.f619e) != null) {
            r7Var.Q();
        }
        if (i7 == 2) {
            r7Var.f619e = new com.google.android.gms.internal.cast.r6((com.google.android.gms.internal.cast.m0) r7Var.f617b, (String) r7Var.d);
        } else {
            r7Var.f619e = r7Var.P();
        }
        com.google.android.gms.internal.cast.r6 r6Var = (com.google.android.gms.internal.cast.r6) r7Var.f619e;
        q6.m.h(r6Var);
        s6Var.d = r6Var.h;
        r6Var.f6640b.add(s6Var);
    }

    public static r7 l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        r7 r7Var = new r7(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) r7Var.f619e)) {
            try {
                ((ArrayDeque) r7Var.f619e).clear();
                String string = ((SharedPreferences) r7Var.f617b).getString((String) r7Var.f618c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) r7Var.d)) {
                    String[] split = string.split((String) r7Var.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) r7Var.f619e).add(str);
                        }
                    }
                    return r7Var;
                }
                return r7Var;
            } finally {
            }
        }
    }

    public static Exception u(Task task) {
        if (task.getException() != null) {
            return task.getException();
        }
        return new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public void A() {
        m.o3 o3Var = (m.o3) ((ai.k0) this.f617b).f1263b;
        h6.m mVar = (h6.m) o3Var.f20159b;
        if (mVar != null) {
            try {
                l8.f fVar = (l8.f) mVar.f13937c;
                fVar.t1(fVar.p1(), 5);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        while (!((LinkedList) o3Var.f20160c).isEmpty() && ((a7.c) ((LinkedList) o3Var.f20160c).getLast()).a() >= 1) {
            ((LinkedList) o3Var.f20160c).removeLast();
        }
    }

    public void B() {
        m.o3 o3Var = (m.o3) ((ai.k0) this.f617b).f1263b;
        h6.m mVar = (h6.m) o3Var.f20159b;
        if (mVar != null) {
            try {
                l8.f fVar = (l8.f) mVar.f13937c;
                fVar.t1(fVar.p1(), 4);
                return;
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        while (!((LinkedList) o3Var.f20160c).isEmpty() && ((a7.c) ((LinkedList) o3Var.f20160c).getLast()).a() >= 5) {
            ((LinkedList) o3Var.f20160c).removeLast();
        }
    }

    @Override
    public boolean E() {
        return true;
    }

    public void F() {
        m.o3 o3Var = (m.o3) ((ai.k0) this.f617b).f1263b;
        o3Var.getClass();
        o3Var.b(new a7.c(o3Var, 1));
    }

    public void G() {
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
        if (h2Var != null) {
            Activity parentActivity = h2Var.getParentActivity();
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
            qm0 qm0Var = new qm0(2, false, false, null);
            qm0Var.f51255y = false;
            qm0Var.W = new hn(this, 7);
            h2Var.presentFragment(qm0Var);
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        ((Activity) this.f618c).startActivityForResult(intent, 11);
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((TextView) this.f618c).setAlpha(org.telegram.messenger.g0.T1(0.5f, 1.0f, ((te.a) this.f619e).f57657e));
        ((lh.c) this.f620f).b(this);
    }

    public String I() {
        String str;
        synchronized (((ArrayDeque) this.f619e)) {
            str = (String) ((ArrayDeque) this.f619e).peek();
        }
        return str;
    }

    public Task J() {
        Task forException;
        int i7;
        boolean v = v();
        if (v && ((ab.v) this.f620f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new f5.s("Firebase-Messaging-Network-Io"));
            return ((va.c) ((va.d) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final r7 f993b;

                {
                    this.f993b = this;
                }

                @Override
                public final Object then(Task task) {
                    int i10 = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    r7 r7Var = this.f993b;
                    switch (i10) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.u(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            o9.g gVar = (o9.g) r7Var.f618c;
                            gVar.a();
                            o9.i iVar = gVar.f21762c;
                            String str3 = iVar.f21772a;
                            gVar.a();
                            m6.b bVar = new m6.b(v.b(gVar), iVar.f21773b, str3, str, str2);
                            o7.d dVar = (o7.d) r7Var.f617b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                            b10.d = new n6.c[]{m6.i.f20863a};
                            b10.f6354c = new ji.j(7, dVar, bVar);
                            b10.f6352a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new t(str, 0));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.u(task));
                            }
                            return ((va.c) ((va.d) r7Var.d)).e().continueWithTask(executorService, new t(r7Var, ((va.a) task.getResult()).f59334a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) {
                public final r7 f993b;

                {
                    this.f993b = this;
                }

                @Override
                public final Object then(Task task) {
                    int i10 = r3;
                    ExecutorService executorService = newSingleThreadExecutor;
                    r7 r7Var = this.f993b;
                    switch (i10) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.u(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            o9.g gVar = (o9.g) r7Var.f618c;
                            gVar.a();
                            o9.i iVar = gVar.f21762c;
                            String str3 = iVar.f21772a;
                            gVar.a();
                            m6.b bVar = new m6.b(v.b(gVar), iVar.f21773b, str3, str, str2);
                            o7.d dVar = (o7.d) r7Var.f617b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                            b10.d = new n6.c[]{m6.i.f20863a};
                            b10.f6354c = new ji.j(7, dVar, bVar);
                            b10.f6352a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new t(str, 0));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.u(task));
                            }
                            return ((va.c) ((va.d) r7Var.d)).e().continueWithTask(executorService, new t(r7Var, ((va.a) task.getResult()).f59334a));
                    }
                }
            });
        }
        b8 b8Var = (b8) this.f619e;
        String b10 = ab.v.b((o9.g) b8Var.f341a);
        Bundle bundle = new Bundle();
        try {
            b8Var.l(b10, bundle, v);
            m6.c cVar = (m6.c) b8Var.f343c;
            m6.d dVar = m6.d.f20854b;
            cc.c cVar2 = cVar.f20850c;
            if (cVar2.i() < 12000000) {
                if (cVar2.h() != 0) {
                    forException = cVar.d(bundle).continueWithTask(dVar, new ji.j(5, cVar, bundle));
                } else {
                    forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
            } else {
                m6.n i10 = m6.n.i(cVar.f20849b);
                synchronized (i10) {
                    i7 = i10.f20878a;
                    i10.f20878a = i7 + 1;
                }
                forException = i10.k(new m6.m(i7, 1, bundle, 1)).continueWith(dVar, nb.a.f21464b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            forException = Tasks.forException(e10);
        }
        return forException.continueWith(new d3.b(3), new a1.c(b8Var, 4));
    }

    public boolean K(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f619e)) {
            remove = ((ArrayDeque) this.f619e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f620f).execute(new a3.f(this, 1));
            }
        }
        return remove;
    }

    public Set L(Class cls) {
        return i(u9.q.a(cls));
    }

    public void M(Uri uri) {
        int i7;
        Context context = (Context) this.f617b;
        if (uri == null) {
            N();
        } else if (!uri.equals((Uri) this.d)) {
            N();
            this.d = uri;
            h6.b bVar = (h6.b) this.f618c;
            int i10 = bVar.f13890b;
            if (i10 != 0 && (i7 = bVar.f13891c) != 0) {
                this.f619e = new i6.b(context, i10, i7, this);
            } else {
                this.f619e = new i6.b(context, 0, 0, this);
            }
            i6.b bVar2 = (i6.b) this.f619e;
            q6.m.h(bVar2);
            Uri uri2 = (Uri) this.d;
            q6.m.h(uri2);
            bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public void N() {
        i6.b bVar = (i6.b) this.f619e;
        if (bVar != null) {
            bVar.cancel(true);
            this.f619e = null;
        }
        this.d = null;
    }

    public com.google.android.gms.internal.cast.r6 P() {
        if (((com.google.android.gms.internal.cast.r6) this.f619e) == null) {
            com.google.android.gms.internal.cast.r6 r6Var = new com.google.android.gms.internal.cast.r6((com.google.android.gms.internal.cast.m0) this.f617b, (String) this.d);
            this.f619e = r6Var;
            r6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.r6) this.f619e;
    }

    public void Q() {
        int i7;
        com.google.android.gms.internal.cast.o1 o1Var;
        int i10;
        int i11;
        long j3;
        com.google.android.gms.internal.cast.r6 r6Var = (com.google.android.gms.internal.cast.r6) this.f619e;
        if (r6Var != null) {
            Map map = r6Var.f6642e;
            List<com.google.android.gms.internal.cast.e3> list = r6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = r6Var.f6641c;
            List<com.google.android.gms.internal.cast.s6> list3 = r6Var.f6640b;
            g6.c cVar = r6Var.f6646j;
            if (cVar != null) {
                cVar.f13216l = null;
                r6Var.f6646j = null;
            }
            long j10 = r6Var.f6645i;
            com.google.android.gms.internal.cast.o1 m10 = com.google.android.gms.internal.cast.p1.m();
            m10.c();
            com.google.android.gms.internal.cast.p1.t((com.google.android.gms.internal.cast.p1) m10.f6477b, j10);
            String str = r6Var.f6648l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.y((com.google.android.gms.internal.cast.p1) m10.f6477b, str);
            }
            String str2 = r6Var.f6649m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.u((com.google.android.gms.internal.cast.p1) m10.f6477b, str2);
            }
            com.google.android.gms.internal.cast.h1 l10 = com.google.android.gms.internal.cast.i1.l();
            String str3 = com.google.android.gms.internal.cast.r6.f6637o;
            l10.c();
            com.google.android.gms.internal.cast.i1.n((com.google.android.gms.internal.cast.i1) l10.f6477b, str3);
            String str4 = r6Var.f6644g;
            l10.c();
            com.google.android.gms.internal.cast.i1.m((com.google.android.gms.internal.cast.i1) l10.f6477b, str4);
            m10.c();
            com.google.android.gms.internal.cast.p1.r((com.google.android.gms.internal.cast.p1) m10.f6477b, (com.google.android.gms.internal.cast.i1) l10.a());
            com.google.android.gms.internal.cast.b0 b0Var = r6Var.f6639a;
            com.google.android.gms.internal.cast.u1 l11 = com.google.android.gms.internal.cast.v1.l();
            Object zza = b0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.g2 l12 = com.google.android.gms.internal.cast.h2.l();
                l12.c();
                com.google.android.gms.internal.cast.h2.m((com.google.android.gms.internal.cast.h2) l12.f6477b, (String) zza);
                l11.c();
                com.google.android.gms.internal.cast.v1.m((com.google.android.gms.internal.cast.v1) l11.f6477b, (com.google.android.gms.internal.cast.h2) l12.a());
            }
            String str5 = r6Var.f6647k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    j6.b bVar = com.google.android.gms.internal.cast.r6.f6636n;
                    Log.w(bVar.f17241a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j3 = 0;
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.n((com.google.android.gms.internal.cast.v1) l11.f6477b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.s6 s6Var : list3) {
                    s6Var.getClass();
                    com.google.android.gms.internal.cast.s1 l13 = com.google.android.gms.internal.cast.t1.l();
                    int i12 = s6Var.f6662e;
                    l13.c();
                    com.google.android.gms.internal.cast.t1.p((com.google.android.gms.internal.cast.t1) l13.f6477b, i12);
                    l13.c();
                    com.google.android.gms.internal.cast.t1.m((com.google.android.gms.internal.cast.t1) l13.f6477b, (int) (s6Var.f6660b - s6Var.d));
                    Integer num = s6Var.f6659a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        com.google.android.gms.internal.cast.t1.n((com.google.android.gms.internal.cast.t1) l13.f6477b, intValue);
                    }
                    Boolean bool = s6Var.f6661c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        com.google.android.gms.internal.cast.t1.o((com.google.android.gms.internal.cast.t1) l13.f6477b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.t1) l13.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.o((com.google.android.gms.internal.cast.v1) l11.f6477b, arrayList);
            }
            int i13 = 2;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    com.google.android.gms.internal.cast.y1 l14 = com.google.android.gms.internal.cast.z1.l();
                    l14.c();
                    com.google.android.gms.internal.cast.z1.m((com.google.android.gms.internal.cast.z1) l14.f6477b, (int) (aVar.f6427b - aVar.f6428c));
                    int i14 = aVar.f6426a;
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                i11 = 1;
                            } else {
                                i11 = 4;
                            }
                        } else {
                            i11 = 3;
                        }
                    } else {
                        i11 = 2;
                    }
                    l14.c();
                    com.google.android.gms.internal.cast.z1.n((com.google.android.gms.internal.cast.z1) l14.f6477b, i11);
                    arrayList2.add((com.google.android.gms.internal.cast.z1) l14.a());
                }
                i7 = 1;
                l11.c();
                com.google.android.gms.internal.cast.v1.q((com.google.android.gms.internal.cast.v1) l11.f6477b, arrayList2);
            } else {
                i7 = 1;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.e3 e3Var : list) {
                    String str6 = e3Var.f6518a;
                    com.google.android.gms.internal.cast.q1 l15 = com.google.android.gms.internal.cast.r1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15);
                                int i16 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152);
                                int i162 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522);
                                int i1622 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222);
                                int i16222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222);
                                int i162222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522222);
                                int i1622222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222222);
                                int i16222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222222);
                                int i162222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522222222);
                                int i1622222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222222222);
                                int i16222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222222222);
                                int i162222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = i13;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522222222222);
                                int i1622222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222222222222);
                                int i16222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222222222222);
                                int i162222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522222222222222);
                                int i1622222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222222222222222);
                                int i16222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222222222222222);
                                int i162222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522222222222222222);
                                int i1622222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222222222222222222);
                                int i16222222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i152222222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222222222222222222);
                                int i162222222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i172222222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i1522222222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i1522222222222222222222);
                                int i1622222222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i1622222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i1722222222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i1722222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                continue;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                                int i15222222222222222222222 = (int) e3Var.f6519b;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i15222222222222222222222);
                                int i16222222222222222222222 = e3Var.f6520c;
                                l15.c();
                                com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i16222222222222222222222);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                                int i17222222222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                                l15.c();
                                com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i17222222222222222222222);
                                arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                                m10 = m10;
                                i13 = 2;
                            }
                            break;
                    }
                    i10 = i7;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.f6477b, i10);
                    int i152222222222222222222222 = (int) e3Var.f6519b;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.f6477b, i152222222222222222222222);
                    int i162222222222222222222222 = e3Var.f6520c;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.f6477b, i162222222222222222222222);
                    l15.c();
                    com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.f6477b, (int) (e3Var.d - e3Var.f6522f));
                    int i172222222222222222222222 = (int) (e3Var.f6521e - e3Var.f6522f);
                    l15.c();
                    com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.f6477b, i172222222222222222222222);
                    arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                    m10 = m10;
                    i13 = 2;
                }
                o1Var = m10;
                l11.c();
                com.google.android.gms.internal.cast.v1.p((com.google.android.gms.internal.cast.v1) l11.f6477b, arrayList3);
            } else {
                o1Var = m10;
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.w1 l16 = com.google.android.gms.internal.cast.x1.l();
                    int i18 = bVar2.f6484e;
                    l16.c();
                    com.google.android.gms.internal.cast.x1.p((com.google.android.gms.internal.cast.x1) l16.f6477b, i18);
                    int i19 = bVar2.d.get();
                    l16.c();
                    com.google.android.gms.internal.cast.x1.m((com.google.android.gms.internal.cast.x1) l16.f6477b, i19);
                    int i20 = (int) (bVar2.f6481a - bVar2.f6483c);
                    l16.c();
                    com.google.android.gms.internal.cast.x1.n((com.google.android.gms.internal.cast.x1) l16.f6477b, i20);
                    l16.c();
                    com.google.android.gms.internal.cast.x1.o((com.google.android.gms.internal.cast.x1) l16.f6477b, (int) (bVar2.f6482b - bVar2.f6483c));
                    arrayList4.add((com.google.android.gms.internal.cast.x1) l16.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.r((com.google.android.gms.internal.cast.v1) l11.f6477b, arrayList4);
            }
            o1Var.c();
            com.google.android.gms.internal.cast.p1.q((com.google.android.gms.internal.cast.p1) o1Var.f6477b, (com.google.android.gms.internal.cast.v1) l11.a());
            r6Var.f6643f.a((com.google.android.gms.internal.cast.p1) o1Var.a(), 233);
            this.f619e = null;
        }
    }

    @Override
    public Object a(Class cls) {
        if (((Set) this.f617b).contains(u9.q.a(cls))) {
            Object a10 = ((u9.b) this.f620f).a(cls);
            if (!cls.equals(ra.a.class)) {
                return a10;
            }
            ra.a aVar = (ra.a) a10;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override
    public u9.o b(u9.q qVar) {
        if (((Set) this.d).contains(qVar)) {
            return ((u9.b) this.f620f).b(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override
    public ua.b c(Class cls) {
        return f(u9.q.a(cls));
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.f618c;
        int b10 = h2.l0.b(jArr, j3, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public Object e(u9.q qVar) {
        if (((Set) this.f617b).contains(qVar)) {
            return ((u9.b) this.f620f).e(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override
    public ua.b f(u9.q qVar) {
        if (((Set) this.f618c).contains(qVar)) {
            return ((u9.b) this.f620f).f(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override
    public void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        hi.l5 l5Var = (hi.l5) this.f620f;
        tg.q1 q1Var = l5Var.K1;
        if (q1Var == null) {
            return;
        }
        q1Var.s(p0Var, true);
        l5Var.L0(false);
    }

    @Override
    public Object mo24get() {
        switch (this.f616a) {
            case 6:
                return new gb.t0((o9.g) ((d9.o) this.f617b).f7922a, (va.d) ((ib.c) this.f618c).mo24get(), (jb.l) ((ib.c) this.d).mo24get(), (gb.l) ((ib.c) this.f619e).mo24get(), (id.h) ((ib.c) this.f620f).mo24get());
            case 10:
                return new jb.d((gb.h1) ((ib.c) this.f617b).mo24get(), (va.d) ((ib.c) this.f618c).mo24get(), (gb.b) ((ib.c) this.d).mo24get(), (jb.f) ((ib.c) this.f619e).mo24get(), (jb.p) ((ib.c) this.f620f).mo24get());
            default:
                return new t5.a((Executor) ((fd.a) this.f617b).mo24get(), (p5.e) ((fd.a) this.f618c).mo24get(), (nd0) ((nd0) this.d).mo24get(), (v5.d) ((fd.a) this.f619e).mo24get(), (w5.c) ((fd.a) this.f620f).mo24get());
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public long h(int i7) {
        return ((long[]) this.f618c)[i7];
    }

    @Override
    public Set i(u9.q qVar) {
        if (((Set) this.f619e).contains(qVar)) {
            return ((u9.b) this.f620f).i(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    public byte[] j() {
        byte[] bArr = (byte[]) this.f618c;
        byte[] bArr2 = (byte[]) this.f617b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = yc1.f54116b;
        BigInteger bigInteger3 = yc1.f54115a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) > 0 && modPow.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
            byte[] a10 = yc1.a(modPow);
            BigInteger bigInteger5 = new BigInteger(1, bArr);
            if (bigInteger5.compareTo(bigInteger4) > 0 && bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) < 0) {
                byte[] a11 = yc1.a(bigInteger5.modPow(bigInteger, bigInteger3));
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                byte[] b10 = yc1.b(new byte[][]{a11, bArr2, bArr3});
                byte[] b11 = yc1.b(new byte[][]{a11, bArr});
                this.f619e = b10;
                String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
                ArrayList arrayList = new ArrayList(4);
                for (int i7 = 0; i7 < 4; i7++) {
                    int i10 = i7 * 8;
                    arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % 200)]);
                }
                this.f620f = arrayList;
                org.telegram.messenger.a8.b("wear-auth: built answer; session " + yc1.d(bArr2) + " emojis=" + ((ArrayList) this.f620f));
                byte[] bArr4 = new byte[288];
                System.arraycopy(bArr2, 0, bArr4, 0, 16);
                System.arraycopy(bArr3, 0, bArr4, 16, 16);
                System.arraycopy(a10, 0, bArr4, 32, 256);
                return bArr4;
            }
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
    }

    public void k(Canvas canvas, boolean z10, boolean z11, int i7, float f10) {
        int i10;
        RectF rectF = (RectF) this.f618c;
        float[] fArr = (float[]) this.d;
        Paint paint = (Paint) this.f620f;
        org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f617b;
        Path path = (Path) this.f619e;
        if (z11) {
            i10 = 0;
        } else {
            i10 = (int) g3Var.H;
        }
        int i11 = (int) (i10 * f10);
        int L = org.telegram.messenger.g0.L(10.0f) * Math.min(1, i11 / org.telegram.messenger.g0.L(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f11 = L;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.rewind();
        rectF.set(0.0f, 0.0f, i7, (g3Var.getY() + g3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public List m(long j3) {
        i4.a[] aVarArr;
        i4.c cVar = (i4.c) this.f617b;
        HashMap hashMap = (HashMap) this.f619e;
        HashMap hashMap2 = (HashMap) this.f620f;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, (Map) this.d, hashMap, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                i4.e eVar = (i4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new g2.b(null, null, null, decodeByteArray, eVar.f16027c, 0, eVar.f16028e, eVar.f16026b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f16029f, eVar.f16030g, false, -16777216, eVar.f16032j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            i4.e eVar2 = (i4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            g2.a aVar = (g2.a) entry.getValue();
            CharSequence charSequence = aVar.f13080a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (i4.a aVar2 : (i4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), i4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f16027c;
            int i18 = eVar2.d;
            aVar.f13083e = f10;
            aVar.f13084f = i18;
            aVar.f13085g = eVar2.f16028e;
            aVar.h = eVar2.f16026b;
            aVar.f13089l = eVar2.f16029f;
            float f11 = eVar2.f16031i;
            int i19 = eVar2.h;
            aVar.f13088k = f11;
            aVar.f13087j = i19;
            aVar.f13093p = eVar2.f16032j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override
    public void n(boolean z10, float f10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((bz0) this.f620f).d;
        dz0 dz0Var = (dz0) this.f619e;
        dz0 dz0Var2 = (dz0) this.f618c;
        dz0 dz0Var3 = (dz0) this.d;
        boolean isAttachedToWindow = ((ym0) this.f617b).isAttachedToWindow();
        if (f10 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        if (f10 >= 1.0f) {
            dz0Var2.e(false, isAttachedToWindow);
            dz0Var3.e(false, isAttachedToWindow);
            dz0Var.e(true, isAttachedToWindow);
            org.telegram.messenger.g0.X3(dz0Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            dz0Var2.e(true, isAttachedToWindow);
            dz0Var3.e(false, isAttachedToWindow);
            dz0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.X3(dz0Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            dz0Var3.c(gd.a0("UpToFileSize", null, 2131743586, org.telegram.messenger.g0.i0(j3, true, false)), false, true);
            dz0Var2.e(false, isAttachedToWindow);
            dz0Var3.e(true, isAttachedToWindow);
            dz0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.X3(dz0Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.c0().f25442c = j3;
            saveToGallerySettingsActivity.d0();
        }
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public int p() {
        return ((long[]) this.f618c).length;
    }

    @Override
    public boolean q() {
        return false;
    }

    public void r(View view) {
        if (view instanceof GLSurfaceView) {
            this.f620f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                r(viewGroup.getChildAt(i7));
            }
        }
    }

    @Override
    public int r0() {
        return 0;
    }

    public u9.o s(Class cls) {
        return b(u9.q.a(cls));
    }

    public void t(q0.a aVar) {
        ai.k0 k0Var = (ai.k0) this.f617b;
        org.telegram.messenger.fa faVar = new org.telegram.messenger.fa(this, aVar);
        k0Var.getClass();
        q6.m.e("getMapAsync() must be called on the main thread");
        m.o3 o3Var = (m.o3) k0Var.f1263b;
        h6.m mVar = (h6.m) o3Var.f20159b;
        if (mVar != null) {
            mVar.y(faVar);
        } else {
            ((ArrayList) o3Var.f20163g).add(faVar);
        }
    }

    public boolean v() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = (o9.g) this.f618c;
        gVar.a();
        Context context = gVar.f21760a;
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

    public void w(int r9, int r10, android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: a8.r7.w(int, int, android.content.Intent):void");
    }

    @Override
    public void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.ca caVar;
        Path path = (Path) this.f618c;
        org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) this.d;
        Paint paint2 = (Paint) this.f619e;
        hi.l5 l5Var = (hi.l5) this.f620f;
        if (!z10 && (caVar = l5Var.O1) != null && caVar.c()) {
            if (z10) {
                gaVar = (org.telegram.ui.Components.ga) this.f617b;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            gaVar.b(canvas, true);
            paint2.setAlpha((int) (i7 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.ga) this.f617b) == null) {
                this.f617b = new org.telegram.ui.Components.ga(l5Var.O1, l5Var.J1.getReactionsWindow().f5296c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((org.telegram.ui.Components.ga) this.f617b).e(f13, f14, l5Var.getMeasuredWidth() + f13, l5Var.getMeasuredHeight() + f14);
            paint = ((org.telegram.ui.Components.ga) this.f617b).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            gaVar.e(f15, f16, l5Var.getMeasuredWidth() + f15, l5Var.getMeasuredHeight() + f16);
            paint = gaVar.h;
        }
        paint.setAlpha(i7);
        paint2.setAlpha((int) (i7 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public void y() {
        ai.k0 k0Var = (ai.k0) this.f617b;
        m.o3 o3Var = (m.o3) k0Var.f1263b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            o3Var.getClass();
            o3Var.b(new a7.c(o3Var, 0));
            if (((h6.m) o3Var.f20159b) == null) {
                m.o3.a(k0Var);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public r7(com.google.android.gms.internal.cast.m0 m0Var, com.google.android.gms.internal.cast.c cVar, String str) {
        this.f616a = 5;
        this.f617b = m0Var;
        this.f618c = cVar;
        this.d = str;
        this.f620f = new com.google.android.gms.internal.cast.l4(this);
    }

    public r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f616a = i7;
        this.f617b = obj;
        this.f618c = obj2;
        this.d = obj3;
        this.f619e = obj4;
        this.f620f = obj5;
    }

    public r7(Context context) {
        this(context, new h6.b(-1, 0, 0));
        this.f616a = 9;
    }

    public r7(Context context, o9.g gVar, va.d dVar, b8 b8Var, ab.v vVar) {
        this.f616a = 1;
        this.f617b = new com.google.android.gms.common.api.j(context, o7.d.f21740l, com.google.android.gms.common.api.b.f6197j, com.google.android.gms.common.api.i.f6207c);
        this.f618c = gVar;
        this.d = dVar;
        this.f619e = b8Var;
        this.f620f = vVar;
    }

    public r7(Context context, h6.b bVar) {
        this.f616a = 9;
        this.f617b = context;
        this.f618c = bVar;
        N();
    }

    public r7(u9.a aVar, u9.b bVar) {
        this.f616a = 22;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<u9.i> set = aVar.f58530c;
        Set set2 = aVar.f58533g;
        for (u9.i iVar : set) {
            int i7 = iVar.f58549c;
            int i10 = iVar.f58548b;
            boolean z10 = i7 == 0;
            u9.q qVar = iVar.f58547a;
            if (z10) {
                if (i10 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(qVar);
            } else if (i10 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(u9.q.a(ra.a.class));
        }
        this.f617b = DesugarCollections.unmodifiableSet(hashSet);
        this.f618c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.f619e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f620f = bVar;
    }

    @Override
    public void C() {
    }

    @Override
    public void z() {
    }

    public r7(i4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f616a = 8;
        this.f617b = cVar;
        this.f619e = hashMap2;
        this.f620f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f618c = jArr;
    }

    @Override
    public void D(float f10, int i7) {
    }

    public r7(Activity activity, WallpapersListActivity wallpapersListActivity, l71 l71Var) {
        this.f616a = 16;
        this.f618c = activity;
        this.d = wallpapersListActivity;
        this.f619e = l71Var;
    }

    public r7(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f616a = 2;
        this.f619e = new ArrayDeque();
        this.f617b = sharedPreferences;
        this.f618c = "topic_operation_queue";
        this.d = ",";
        this.f620f = scheduledThreadPoolExecutor;
    }

    public r7(byte[] bArr, byte[] bArr2, String str) {
        this.f616a = 19;
        this.f617b = bArr;
        this.f618c = bArr2;
        this.d = str;
    }

    public r7() {
        this.f616a = 11;
        this.f617b = new ArrayList();
        this.f618c = new ArrayList();
        this.d = new ArrayList();
        this.f619e = gf.g.f13544p;
    }

    public r7(lh.c cVar) {
        this.f616a = 12;
        this.f620f = cVar;
        lr lrVar = lr.h;
        this.d = new te.a(0, this, lrVar, 320L, true);
        this.f619e = new te.a(1, this, lrVar, 320L, true);
    }

    public r7(int i7) {
        this.f616a = 20;
        this.f617b = new int[i7];
        this.f618c = new int[i7];
        this.d = new float[i7];
        this.f619e = new float[i7];
        this.f620f = new float[i7];
    }

    public r7(bz0 bz0Var, ym0 ym0Var, dz0 dz0Var, dz0 dz0Var2, dz0 dz0Var3) {
        this.f616a = 18;
        this.f620f = bz0Var;
        this.f617b = ym0Var;
        this.f618c = dz0Var;
        this.d = dz0Var2;
        this.f619e = dz0Var3;
    }

    public r7(org.telegram.ui.ActionBar.g3 g3Var) {
        this.f616a = 14;
        this.f618c = new RectF();
        this.d = new float[8];
        this.f619e = new Path();
        this.f620f = new Paint(1);
        this.f617b = g3Var;
    }

    public r7(hi.l5 l5Var, org.telegram.ui.Components.ga gaVar, Paint paint) {
        this.f616a = 7;
        this.f620f = l5Var;
        this.d = gaVar;
        this.f619e = paint;
        this.f618c = new Path();
    }
}
